@ConfigAPI
Feature: Product Status Application Feature

  As a user I should be able to make API calls for Product Status's

  Background:

    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')

  @config-regression
  Scenario Outline: Get all Product Statuses list
    Given path pathForGetProductStatus
    And url VasOpsConfig_BaseUrl
    And param MaxResultCount = <count>
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And match response != ''
    And def ProductStsId = response.result.items[0].id
    And def ProStsId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASProductStsId.txt',ProductStsId)

    Examples:
      | count |
      | 10    |

  @config-regression
  Scenario: Get Product Status by Id
    * def ProductStsId = read('jsonData/VASProductStsId.txt')
    Given path pathForGetProductStatus, ProductStsId
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