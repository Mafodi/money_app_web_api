Feature: Get Loan Types List

  Background:
    #* def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def loanTypesSchema = {code:'#string', description:'#string'}

  @Digital-Home-Buying
  Scenario Outline: Get loan types
    Given path 'referencedata/loantypes'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    When method get
    Then status 200
    And print response
    And match response.data == '#[] loanTypesSchema'
    And match response.data contains {code:'<codeId>', description:'<codeDescription>'}

    Examples:
    | codeId | codeDescription |
    | 1 | First loan |
    | 4 | Re-advance |
    | 6 | Further loan |
    #| 9 | Removal of codebtor|
