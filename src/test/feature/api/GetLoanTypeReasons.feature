Feature: Get Loan Type Reason List

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def typesSchema = {code:'#string', description:'#string'}

  @Digital-Home-Buying
  Scenario Outline: Get loan types Reason
    Given path 'referencedata/loantypes/<loanTypeCode>/reasons'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    When method get
    Then status 200
    And print response
    And match response.data == '#[] typesSchema'
    And def loanTypeReasonsJson = read('jsonData/<loanReasonFileToread>.json')
    And match response.data contains loanTypeReasonsJson.data

    Examples:
    | loanTypeCode | loanReasonFileToread |
    | 1 | FirstLoanReasons |
    | 6 | ReAdvanceLoanReason |
    | 9 | RemovalOfCoDebtorReason |