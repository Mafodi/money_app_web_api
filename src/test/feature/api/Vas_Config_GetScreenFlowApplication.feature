@ConfigAPI
Feature: ScreenFlow Config API
  As a user I should be able to make API calls for Screen Flow Application

  Background:

    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')



  @config-regression
  Scenario Outline: Get All ScreenFlows
    Given path pathForScreenFlows
    And url VasOpsConfig_BaseUrl
    And param MaxResultCount = <count>
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response != ''
    And def screenFlowId = response.result.items[1].id
    And def screenFlwId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASScreenFlowId.txt',screenFlowId)

    Examples:
      | count |
      | 10    |

  @config-regression
  Scenario: Get Screen Flow by Id
    * def screenFlowId = read('jsonData/VASScreenFlowId.txt')
    Given path pathForScreenFlows, screenFlowId
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
      "angularEntrypoint": '#string',
      "androidEntrypoint": '#string',
      "iosEntrypoint": '#string'
    }
    """

