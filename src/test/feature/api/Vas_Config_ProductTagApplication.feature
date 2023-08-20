@ConfigAPI
Feature: Product Tag Application Feature
  As a user I should be able to make API calls for Product Tags App

  Background:

    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def Timeout = 800000
    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')


  @config-regression
  Scenario Outline: Get All Product Tags
    Given path pathForProductTagApplication
    And url VasOpsConfig_BaseUrl
    And configure connectTimeout = Timeout
    And param MaxResultCount = <count>
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then print response
    And match response != ''
    And def ProductTagAppId = response.result.items[0].id
    And def productId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASProductTagAppId.txt',ProductTagAppId)

      Examples:
        | count |
        | 10    |


  @config-regression
  Scenario: Get Product Tag by Id
    * def ProductId = read('jsonData/VASProductTagAppId.txt')

    Given path pathForProductTagApplication, ProductId
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response


