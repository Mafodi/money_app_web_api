@ConfigAPI
Feature: API ProductTypeApplication

  Background:

    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')

  @config-regression
  Scenario Outline: Get ProductTypeApplication

    Given path '/v1/config/producttypes'
    And url VasOpsConfig_BaseUrl
    And param MaxResultCount = <count>
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response != ''
    And print ProductTypeId = response.result.items[0].id
    And def ProductType = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASProductTypeId.txt',ProductTypeId)

    Examples:
      | count |
      | 10    |



  @config-regression
  Scenario: Get ProductTypeApplication By Id
    * def ProductType = read('jsonData/VASProductTypeId.txt')
    Given path '/v1/config/producttypes/', ProductType
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
      "description": '#string'
      }
    """
