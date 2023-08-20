Feature: As a user I should be able to get data for the reference datas API

  Background:
    * def securityToken = read('TokenStore/api.security.token.txt')
    * def codeDescriptionSchema = {code:'#string', description:'#string'}

  @regressionTest
  Scenario: Get Methods Of Contact
    Given path 'referencedata/methodsOfContact'
    And url HomeLoans_BaseURL
    And print '######## Found saved secur§ity token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
#    And configure VPN_proxy = 'http://10.74.11.24:3128'
#    And header x-ibm-client-id = 'ada1292d-01fa-4d52-a85d-3194c07d8414';
    When method get
    Then status 200
    And print response
    And match response.data == '#[] codeDescriptionSchema'


  Scenario: Get Countries
    Given path 'referencedata/countries'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    When method get
    Then status 200
    And print response
    And match response.data == '#[] codeDescriptionSchema'

  Scenario: Get Titles
    Given path 'referencedata/titles'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    When method get
    Then status 200
    And print response
    And match response.data == '#[] codeDescriptionSchema'

  Scenario: Get Banks
    Given path 'referencedata/banks'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    When method get
    Then status 200
    And print response
    And match response.data == '#[] codeDescriptionSchema'

  Scenario: Get Provinces
    Given path '/referencedata/provinces'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    When method get
    Then status 200
    And print response
    And match response.data == '#[] codeDescriptionSchema'

  Scenario: Get Employment Industries
    Given path '/referencedata/employmentindustries'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    When method get
    Then status 200
    And print response
    And match response.data == '#[] codeDescriptionSchema'

  Scenario: Get Occupations
    Given path '/referencedata/occupations'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    When method get
    Then status 200
    And print response
    And match response.data == '#[] codeDescriptionSchema'

  Scenario: Get Home Owners Covers Insurance
    Given path '/referencedata/homeownerscovers'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    When method get
    Then status 200
    And print response
    And match response.data == '#[] codeDescriptionSchema'

  Scenario: Get Credit Life Insurance
    Given path '/referencedata/creditlifeinsurance'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    When method get
    Then status 200
    And print response
    And match response.data == '#[] codeDescriptionSchema'

  Scenario: Get Source of funds
    Given path '/referencedata/sourceOffunds'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    When method get
    Then status 200
    And print response
    And match response.data == '#[] codeDescriptionSchema'

  Scenario: Get Expense Catagories
    Given path '/referencedata/expensecategories'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    When method get
    Then status 200
    And print response
    And match response.data == '#[] codeDescriptionSchema'

  Scenario Outline: Get disclaimers
    Given path '/referencedata/disclaimers/<id>'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.data.code == '<id>'
    And match responseJson.data.title == '<title>'
    And match responseJson.data.body != ''

    Examples:
      | id | title                              |
      | 1  | Terms and Conditions               |
      | 2  | Accept                             |
      | 3  | Property Insights                  |
      | 4  | Legal and General Information      |
      | 5  | Nedbank Produts and Special Offers |
      | 6  | Exclusive offers                   |
      | 7  | Research Organisation              |
      | 8  | Method Of Communication            |
