@ConfigAPI
Feature: API ProductSubTypeApplication

  Background:

    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')


  @config-regression
  Scenario Outline: Get ProductSubTypeApplication

    Given path '/v1/config/productsubtypes'
    And url VasOpsConfig_BaseUrl
    And param MaxResultCount = <count>
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response != ''
    And print ProductSubTypeId = response.result.items[0].id
    And def ProductSubType = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASProductSubTypeId.txt',ProductSubTypeId)

    Examples:
      | count |
      | 10    |



  @config-regression
  Scenario: Get ProductSubTypeApplication By Id
    * def ProductSubType = read('jsonData/VASProductSubTypeId.txt')
    Given path '/v1/config/productsubtypes/', ProductSubType
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
        "code": '#string',
        "description": '#string',
        "productType": {
          "id": #number,
          "name": '#string',
          "code": '#string',
          "description": '#string'
        }
      }
    """
