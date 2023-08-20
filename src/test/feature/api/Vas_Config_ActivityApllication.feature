@ConfigAPI
Feature: As a user I should be able to make API calls for Activity Application

  Background:

    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')



  @config-regression

  Scenario Outline: Get All Activities
    Given path pathForActivityApp
    And url VasOpsConfig_BaseUrl
    And param MaxResultCount = <count>
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response != ''
    And def ActivityAppId = response.result.items[0].id
    And def ActId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASActivityId.txt',ActivityAppId)

    Examples:
      | count |
      | 10    |


  @config-regression

  Scenario: Get Activity App By Id
    * def ActivityAppId = read('jsonData/VASActivityId.txt')
    Given path pathForActivityApp , ActivityAppId
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response.result ==
    """
    {
     "id": #number,
     "workflowId": #number,
     "order": #number,
     "name": '#string',
     "endpoint": '#string',
     "type": '#string',
     "assembly": '#string',
     "transition": {
      "id": #number,
      "errorId": #number,
      "activityId": #number
     }
    }
    """