Feature: Get Suburbs By Filter

  Background:
    #* def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def suburbTypesSchema = {id:'#number', name:'#string', province:'#string'}

  @Digital-Home-Buying
  Scenario Outline: Get Suburbs Filtered For
    Given path 'referencedata/suburbs/<suburbFilter>'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    When method get
    Then status 200
    And print response
    And match response.data == '#[] suburbTypesSchema'
    #And match response.data contains {code:'<codeId>', description:'<codeDescription>'}

  Examples:
  | suburbFilter |
  | rand |
  | sand |
  | will |