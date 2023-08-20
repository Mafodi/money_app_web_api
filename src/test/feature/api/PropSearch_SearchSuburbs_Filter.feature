Feature: I should be able to Search Suburbs List By Filter

  Background:

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def suburbTypesSchema = {id:'#number', name:'#string', province:'#string'}

  @Digital-Home-Buying
  Scenario Outline: Search Suburbs List By Filter
    Given path 'suburbs/<suburbFilter>'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    When method get
    Then status 200
    And print response
    And match response.data == '#[] suburbTypesSchema'
    And match response.data contains {id:<codeId>, name:'<name>', province:'<province>'}

  Examples:
  | suburbFilter | codeId | name | province |
  | Dri | 1018 | Driefontein | Gauteng |
  | Pec | 12707 | Pecanwood Estate | North West |
  | Bye | 2 | Byenespoort | Gauteng |