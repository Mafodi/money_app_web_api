@ConfigAPI
Feature: API Create Tags
  As a user I should be able to make API calls to Get WorkFlow Steps

  Background:

    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def Timeout = 800000
    * def Timestamp = call getDateTime
    * def DateStamp = call getCurrentTimeStamp
    * def ConvertedStamp = call getConvertedTimeStamp
    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')


  @config-regression
  Scenario: Create new Tag1
    Given path '/v1/config/tags'
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    And def TagJson = read('jsonData/VASCreateTag.json')
    And set TagJson.tagContextId = TagContextsId
    And set TagJson.screenflowId = screenFlowId
    And request TagJson
    When method post
    Then status 200
    And print response
    And string json = response
    And def tagId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASTagId.json',json)


  @config-regression
  Scenario: Create new Tag2
    Given path '/v1/config/tags'
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    And def TagJson = read('jsonData/VASCreateTag.json')
    And set TagJson.tagContextId = TagContextsId
    And set TagJson.screenflowId = screenFlowId
    And set TagJson.name = 'Ended Specials'
    And request TagJson
    When method post
    Then status 200
    And print response
    And string json = response
    And def tagIdImg = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASTagIdNoImage.json',json)


  @config-regression
  Scenario: Create new product1 from Json

    * def TagId = read('jsonData/VASTagId.json')

    Given path pathForCreateProduct
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    And def productJson = read('jsonData/VASCreateProduct.json')
    And set productJson.tagIds[] = TagId.result.id
    And set productJson.productStatusId = productStatusId
    And set productJson.vendorId = VendorId
    And set productJson.productSubTypeId = productSubTypeId
    And set productJson.vendorProductCode = 'Test01' +  Timestamp
    And set productJson.publishedDate = DateStamp
    And set productJson.expiryDate = ConvertedStamp
    And set productJson.productCostPrices[0].startDate = DateStamp
    And set productJson.productCostPrices[0].endDate = ConvertedStamp
    And set productJson.displayName = 'Test1'
    And print productJson
    And request productJson
    When method post
    Then status 200
    And print response

  @config-regression
  Scenario: Create Tag Filter to Get Product ID1
    * def TagId1 = read('jsonData/VASTagId.json')

    And print TagId1.result.name
    Given path '/v1/config/tagfilteredproducts'
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    And def TagFilterProduct = read('jsonData/VASTagFilterProducts.json')
    And set TagFilterProduct.tagFilters[] = TagId1.result.name
    And request TagFilterProduct
    When method post
    Then status 200
    And print response
    And def productId = response.result.items[0].id
    And def proId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASProductId1.txt',productId)


  @config-regression
  Scenario: Create new product2 from Json

    * def TagId = read('jsonData/VASTagIdNoImage.json')

    Given path pathForCreateProduct
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    And def productJson = read('jsonData/VASCreateProduct.json')
    And configure connectTimeout = Timeout
    And set productJson.tagIds[] = TagId.result.id
    And set productJson.productStatusId = productStatusId
    And set productJson.vendorId = VendorId
    And set productJson.productSubTypeId = productSubTypeId
    And set productJson.vendorProductCode = 'Test002' +  Timestamp
    And set productJson.publishedDate = DateStamp
    And set productJson.expiryDate = ConvertedStamp
    And set productJson.productCostPrices[0].startDate = DateStamp
    And set productJson.productCostPrices[0].endDate = ConvertedStamp
    And set productJson.displayName = 'Test2'
    And print productJson
    And request productJson
    When method post
    Then status 200
    And print response


  @config-regression
  Scenario: Create Tag Filter to Get Product ID2
    * def TagId2 = read('jsonData/VASTagIdNoImage.json')

    And print TagId2.result.name
    Given path pathForTagFilteredProduct
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    And configure connectTimeout = Timeout
    And def TagFilterProduct = read('jsonData/VASTagFilterProducts.json')
    And set TagFilterProduct.tagFilters[] = TagId2.result.name
    And request TagFilterProduct
    When method post
    Then status 200
    And print response
    And def productId = response.result.items[0].id
    And def proId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASProductId2.txt',productId)


  @config-regression
  Scenario: Delete Multi Product
    * def MultiProductDel = read('jsonData/VASMultiProductDelete.json')
    * def ProductId1 = read('jsonData/VASProductId1.txt')
    * def ProductId2 = read('jsonData/VASProductId2.txt')
    And path '/v1/config/products/deletions'
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    And set MultiProductDel.productIds[] = ProductId1
    And set MultiProductDel.productIds[] = ProductId2
    And print MultiProductDel
    And request MultiProductDel
    When method post
    Then status 200


  @config-regression
  Scenario: Delete Multi Tag
    * def MultiTagDel = read('jsonData/VASMultiTagDelete.json')
    * def TagId = read('jsonData/VASTagId.json')
    * def TagIdNoImage = read('jsonData/VASTagIdNoImage.json')
    And path '/v1/config/tags/deletions'
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    And set MultiTagDel.tagIds[] = TagId.result.id
    And set MultiTagDel.tagIds[] = TagIdNoImage.result.id
    And print MultiTagDel
    And request MultiTagDel
    When method post
    Then status 200



