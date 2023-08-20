@RefApi
Feature:Reference API

  Background:

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def Timeout = 500000
    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def VPN_proxy = 'http://10.74.11.24:3128'


  @Reference-regression
  Scenario: Get ReferenceData
    Given path '/valueaddedservices'
    And url VAS_ReferenceData_BaseURL
    And print securityToken
    And configure proxy = VPN_proxy
    And configure connectTimeout = Timeout
    And header Authorization = 'Bearer '+securityToken
    When method get
    Then status 200
    And print response
    And match response != ''
    And print ReferenceId = response.data[0].id
    And def RefId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASReferenceId.txt',ReferenceId)
    And match response.data[0] ==
      """
        {
        "id": #number,
        "code": '#string',
        "name": '#string',
        "tagContext": {
        "id": #number,
        "code": '#string',
        "name": '#string',
        "imageRequired": false,
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
        "description": '#string',
        "productCount": #number
        }
      """

    @Reference-regression
    Scenario: Create new VAS Reference from Json

      * def CreateVASRef = read('jsonData/VASRefCreate.json')

      Given path '/valueaddedservices'
      And url VAS_ReferenceData_BaseURL
      And print '######## Security token ######## '+securityToken
      And configure proxy = VPN_proxy
      And configure connectTimeout = Timeout
      And header Authorization = 'Bearer '+securityToken
      And set CreateVASRef.relationshipIdentifiers[0].id = refRelationId1
      And set CreateVASRef.relationshipIdentifiers[1].id = refRelationId2
      And set CreateVASRef.relationshipIdentifiers[2].id = refRelationId3
      And print CreateVASRef
      And request CreateVASRef
      When method post
      Then status 200
      And print response
      And def ProductId = response.data.tag.products[0].id
      And def RefProId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASRefProductId.txt',ProductId)


    @Reference-regression
    Scenario: Get ReferenceData Products by ProductID

      * def RefProId = read('jsonData/VASRefProductId.txt')
      Given path '/valueaddedservices/products/', RefProId
      And url VAS_ReferenceData_BaseURL
      And configure proxy = VPN_proxy
      And configure connectTimeout = Timeout
      And print '######## Security token ######## '+securityToken
      And header Authorization = 'Bearer '+securityToken
      When method get
      Then status 200
      And print response
      And match response ==
      """
      {
        "data": {
          "id": '#string',
          "name": '#string',
          "vendorProductCode": '#string',
          "price": #number,
          "averageSpend": #number,
          "vendor": {
            "id": #number,
            "name": '#string'
          },
          "webIcon": '#string',
          "iosIcon": '#string',
          "androidIcon": '#string',
          "additionalContent": '#string',
          "status": '#string',
          "billingType": '#string',
          "description": '#string',
          "publishedDate": '#string',
          "minAmount": #number,
          "maxAmount": #number
        },
        "metadata": {
          "resultData": [
          ]
        }
      }
      """

