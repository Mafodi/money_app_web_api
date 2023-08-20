@ConfigAPI
Feature: Config Tag Context API Feature
  As a user I should be able to make API calls to get Tag Context Data

  Background:

    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')



  @config-regression
  Scenario Outline: Get All Tag Contexts
    Given path pathContexts
    And url VasOpsConfig_BaseUrl
    And param MaxResultCount = <count>
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response != ''
    And def TagContextsId = response.result.items[0].id
    And def TagCtxId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASTagContextsId.txt',TagContextsId)

    Examples:
      | count |
      | 10    |

  @config-regression
  Scenario: Get Tag Context by Id
    * def TagContextsId = read('jsonData/VASTagContextsId.txt')
    Given path pathContexts, TagContextsId
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
      "imageRequired": #boolean,
      "description": '#string'
    }
    """