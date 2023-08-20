Feature: Get Loan Marriage Type List

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def marriageTypesSchema = {code:'#string', description:'#string'}

  @Digital-Home-Buying
  Scenario Outline: Get marriage types
    Given path 'referencedata/marriagetypes'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    When method get
    Then status 200
    And print response
    And match response.data == '#[] marriageTypesSchema'
    And match response.data contains {code:'<codeId>', description:'<codeDescription>'}

    Examples:
    | codeId | codeDescription |
    | 01 | Married in community of property (COP) |
    | 02 | Married out of COP |