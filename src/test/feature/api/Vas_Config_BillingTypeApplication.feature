@ConfigAPI
Feature: As a user I should be able to make API calls for Billing Type Application

  Background:

    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')



  @config-regression
  Scenario Outline: Get All Billing Types
    Given path pathForBillingTypes
    And url VasOpsConfig_BaseUrl
    And param MaxResultCount = <count>
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response != ''
    And def BillingTypeId = response.result.items[0].id
    And def BTId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASBillingTypeId.txt',BillingTypeId)

    Examples:
      | count |
      | 10    |


  @config-regression
  Scenario: Get billing Type By Id
    * def BillingTypeId = read('jsonData/VASBillingTypeId.txt')
    Given path pathForBillingTypes , BillingTypeId
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response.result ==
    """
     {
      "id": #number,
      "code": '#string',
      "name": '#string',
      "description": '#string'
     }
    """

