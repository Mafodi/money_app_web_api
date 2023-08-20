@ConfigAPI
Feature: As a user I should be able to make API calls for Ops Application

  Background:

    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')
    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def Timestamp = call getDateTime
    * def DateStamp = call getCurrentTimeStamp
    * def ConvertedStamp = call getConvertedTimeStamp


  @config-regression
  Scenario Outline: Get All Tags
    Given path pathForGetTags
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    And param MaxResultCount = <count>
    When method get
    Then status 200
    And print response

    Examples:
      | count |
      | 20    |

  @config-regression
  Scenario: Create new Tag
    Given path '/v1/config/tags'
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    And def TagJson = read('jsonData/VASCreateTag.json')
    And set TagJson.tagContextId = TagContextsId
    And set TagJson.screenflowId = screenFlowId
    And set TagJson.name = 'Name17'
    And request TagJson
    When method post
    Then status 200
    And print response
    And string json = response
    And def TagsResponse = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASNewTag.json' ,json)
    And match response.result ==
    """
    {
      "id": #number,
      "code": '#string',
      "name": '#string',
      "tagContext": {
        "id": #number,
        "code": '#string',
        "name": '#string',
        "imageRequired": #boolean,
        "description": '#string'
      },
      "webIcon": '#string',
      "iosIcon": '#string',
      "androidIcon": '#string',
      "screenflow": {
        "id": #number,
        "name": '#string',
        "angularEntrypoint": '#string',
        "androidEntrypoint": '#string',
        "iosEntrypoint": '#string'
      },
      "description": '#string'
    }
    """

    @config-regression
  Scenario: Get tag by id
    * def TagId = read('jsonData/VASNewTag.json')
    Given path pathForGetTags, TagId.result.id
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And match response != ''
    And print response


  @config-regression
    Scenario: Update Tag Details

      * def TagId = read('jsonData/VASNewTag.json')

      Given path '/v1/config/tags'
      And url VasOpsConfig_BaseUrl
      And header Authorization = 'Bearer '+AuthorizationKey
      And def TagRequest = read('jsonData/VASUpdateTag.json')
      And set TagRequest.tagContextId = TagContextsId
      And set TagRequest.screenflowId = screenFlowId
      And set TagRequest.id = TagId.result.id
      And set TagRequest.name = 'TestTag'
      And set TagRequest.description = 'TestTag'
      And print TagRequest
      And request TagRequest
      When method put
      Then status 200
      And string json = response
      And def TagsResponse = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASNewTag.json' ,json)


  @config-regression
    Scenario: Create new product from Json

      * def TagId = read('jsonData/VASNewTag.json')

      Given path pathForCreateProduct
      And url VasOpsConfig_BaseUrl
      And header Authorization = 'Bearer '+AuthorizationKey
      And def productJson = read('jsonData/VASCreateProduct.json')
      And set productJson.tagIds[] = TagId.result.id
      And set productJson.displayName = 'TestProduct'
      And set productJson.productStatusId = productStatusId
      And set productJson.vendorId = VendorId
      And set productJson.productSubTypeId = productSubTypeId
      And set productJson.vendorProductCode = 'Test' +  Timestamp
      And set productJson.publishedDate = DateStamp
      And set productJson.expiryDate = ConvertedStamp
      And set productJson.productCostPrices[0].startDate = DateStamp
      And set productJson.productCostPrices[0].endDate = ConvertedStamp
      And print productJson
      And request productJson
      When method post
      Then status 200


  @config-regression
    Scenario: Create Tag Filter to Get Product ID
      * def TagId = read('jsonData/VASNewTag.json')

      And print TagId.result.name
      Given path pathForTagFilteredProduct
      And url VasOpsConfig_BaseUrl
      And header Authorization = 'Bearer '+AuthorizationKey
      And def TagFilterProduct = read('jsonData/VASTagFilterProducts.json')
      And set TagFilterProduct.tagFilters[] = TagId.result.name
      And request TagFilterProduct
      When method post
      Then status 200
      And print response
      And def productId = response.result.items[0].id
      And def proId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASProductId.txt',productId)
      And match response.result.items[0] ==
    """
      {
        "id": '#string',
        "name": '#string',
        "vendorProductCode": '#string',
        "price": #number,
        "min": #number,
        "max": #number,
        "vendor": {
          "id": #number,
          "name": '#string',
          "serviceProvider": '#string',
          "vendorCode": '#string',
          "providerIndicator": '#string',
          "networkId": '#string'
        },
        "status": '#string',
         "billingType": '#string',
        "description": '#string',
        "publishedDate": '#string',
        "tagIds": [
          #number,
          #number,
          #number
        ]
      }
    """


  @config-regression
    Scenario: Get product by ID
      Given def productID = read('jsonData/VASProductId.txt')
      And path '/v1/config/products', productID
      And url VasOpsConfig_BaseUrl
      And header Authorization = 'Bearer '+AuthorizationKey
      When method get
      Then status 200
      And print response.result


  @config-regression
    Scenario: Update Product Details
      * def TagId = read('jsonData/VASNewTag.json')
      Given def productID = read('jsonData/VASProductId.txt')
      And path '/v1/config/products'
      And url VasOpsConfig_BaseUrl
      And header Authorization = 'Bearer '+AuthorizationKey
      And def UpdateProductJson = read('jsonData/VASUpdateProduct.json')
      And set UpdateProductJson.id = productID
      And set UpdateProductJson.productStatusId = productStatusId
      And set UpdateProductJson.vendorId = VendorId
      And set UpdateProductJson.productSubTypeId = productSubTypeId
      And set UpdateProductJson.tagIds[] = TagId.result.id
      And set UpdateProductJson.description = 'TestUpdate'
      And set UpdateProductJson.displayName = 'TestUpdate'
      And set UpdateProductJson.name = 'TestUpdate'
      And set UpdateProductJson.publishedDate = DateStamp
      And set UpdateProductJson.expiryDate = ConvertedStamp
      And set UpdateProductJson.productCostPrices[0].startDate = DateStamp
      And set UpdateProductJson.productCostPrices[0].endDate = ConvertedStamp
      And request UpdateProductJson
      And print UpdateProductJson
      When method put
      Then status 200
      And print response
      And match response.result ==
    """
        {
        "id": '#string',
        "description": '#string',
        "displayName": '#string',
        "metaData": '#string',
        "additionalContent": '#string',
        "webIcon": '#string',
        "iosIcon": '#string',
        "androidIcon": '#string',
        "name": '#string',
        "vendorProductCode": '#string',
        "productStatusId": #number,
        "vendorId": #number,
        "tagIds": [
          #number,
           #number,
            #number,
             #number,
              #number,
               #number
        ],
        "publishedDate": '#string',
        "expiryDate": '#string',
        "productCostPrices": [
          {
            "billingTypeId": #number,
            "min": #number,
            "max": #number,
            "price": #number,
            "startDate": '#string',
            "endDate": '#string'
          }
        ]
      }
    """


    @config-regression
    Scenario: Delete Product by ID
        Given def productID = read('jsonData/VASProductId.txt')
        And path pathForDeleteProductById, productID
        And url VasOpsConfig_BaseUrl
        And header Authorization = 'Bearer '+AuthorizationKey
        When method delete
        Then status 200
        And print response
        And match response.success == true



  @config-regression
    Scenario: Delete Tag
       Given def TagId = read('jsonData/VASNewTag.json')
       And print TagId.result.id
       And path pathForDeleteTagById, TagId.result.id
       And url VasOpsConfig_BaseUrl
       And header Authorization = 'Bearer '+AuthorizationKey
       When method delete
       Then status 200






