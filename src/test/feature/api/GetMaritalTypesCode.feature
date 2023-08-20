Feature: Get Marital Types Code

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def typesSchema = {code:'#string', description:'#string'}

  @Digital-Home-Buying
  Scenario Outline: Get Marital Types Code
    Given path 'referencedata/marriagetypes/<maritalType>'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
#    And configure proxy = 'http://10.74.11.24:3128'
#    And header x-ibm-client-id = '1009043d-8009-49ee-9fdb-bcd09dfc2960'
    When method get
    Then status 200
    And print response
    And match response.data == '#(^^typesSchema)'
    And match response.data contains {code:'<maritalType>', description:'<codeDescription>'}

    Examples:
    | maritalType | codeDescription |
    | 01 | Married in community of property (COP) |
    | 02 | Married out of COP |