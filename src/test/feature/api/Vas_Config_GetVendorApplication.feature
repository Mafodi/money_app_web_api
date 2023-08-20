@ConfigAPI
Feature: Config Vendor Application API Feature
     As a user I should be able to make API calls for Vendor Application

  Background:

    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')

  @config-regression
  Scenario Outline: Get All Vendors
    Given path pathForGetVendor
    And url VasOpsConfig_BaseUrl
    And param MaxResultCount = <count>
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response != ''
    And def vendorAppId = response.result.items[0].id
    And def VendorId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASVendorAppId.txt',vendorAppId)

    Examples:
      | count |
      | 10    |


  @config-regression
  Scenario: Get Vendor By Id
    * def VendorId = read('jsonData/VASVendorAppId.txt')
    Given path '/v1/config/vendors/', VendorId
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response.result ==
    """
    {
      "id": #number,
      "name": '#string',
      "serviceProvider": '#string',
      "vendorCode": '#string',
      "providerIndicator": '#string',
      "networkId": '#string',
      "vendorPaymentDetail": {
        "id": #number,
        "accountType": '#string',
        "accountNumber": '#string',
        "sortCode": '#string',
        "bfTypeId": '#string',
        "bfType": '#string'    }
    }
    """


#  @config-regression
#  @Vendors
#    Scenario: Check Blue Label Vendor Exists
#    * def VendorId = read('jsonData/VASVendorAppId.txt')
#    Given path pathForGetVendor, VendorId
#    And url VasOpsConfig_BaseUrl
#    When method get
#    Then status 200
#    And print response
#    And match response != ''
#    And match response.result.name == 'Blue Label Telecoms'



