@ConfigAPI
Feature: Menu Config API
  As a user I should be able to make API calls to get Menu data

  Background:

    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')
    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true


  @config-regression
  Scenario Outline: Get All Menu
    Given path '/v1/config/menus'
    And url VasOpsConfig_BaseUrl
    And param MaxResultCount = <count>
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response != ''
    And def MenuId = response.result.items[0].id
    And def MenuAppId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASMenuId.txt',MenuId)

    Examples:
      | count |
      | 10    |


  @config-regression
  Scenario: Get Menu by Id
    * def MenuId = read('jsonData/VASMenuId.txt')
    Given path '/v1/config/menus/', MenuId
    And url VasOpsConfig_BaseUrl
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    And print response
    Then status 200
    And print response
    And match response.result ==
    """
      {
        "id": #number,
        "menuName": '#string',
        "description": '#string',
        "readAccess": #boolean,
        "createAccess": #boolean,
        "updateAccess": #boolean,
        "deleteAccess": #boolean
      }
    """