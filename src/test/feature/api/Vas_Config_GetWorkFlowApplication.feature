@ConfigAPI
Feature: API WorkFlow Application Feature
  As a user I should be able to make API calls to Get

  Background:

    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')



  @config-regression
  Scenario Outline: Get All WorkFlows
    Given path pathForWorkFlows
    And url VasOpsConfig_BaseUrl
    And param MaxResultCount = <count>
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response != ''
    And print WorkFlowsId = response.result.items[0].id
    And def WorkFlowId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASWorkFlowsId.txt',WorkFlowsId)

    Examples:
      | count |
      | 10    |



  @config-regression
  Scenario: Get WorkFlow By Id
    * def WorkFlowsId = read('jsonData/VASWorkFlowsId.txt')
    Given path pathForWorkFlows, WorkFlowsId
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response.result.activities[0] ==
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