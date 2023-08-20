Feature:As a user I should be able to Get Property Usage

  Background:
   # * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'
    * def propertyUsageTypesSchema = {code:'#string', description:'#string'}

    * def securityToken = read('TokenStore/api.security.token.txt')

  @Digital-Home-Buying
  Scenario Outline: Got Property Usage
    Given path '/referencedata/propertyusages'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    When method get
    Then status 200
    And print response
    And match response.data == '#[] propertyUsageTypesSchema'
    And match response.data contains {code:'<codeId>', description:'<codeDescription>'}

    Examples:
    | codeId | codeDescription |
    | 1 | Primary / Permanent residence |
    | 2 | Secondary residence: e.g. a holiday home |
    | 3 | An Investment: e.g. to rent out          |