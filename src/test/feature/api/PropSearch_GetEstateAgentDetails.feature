Feature:As a user I should be able to contact estate agents

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')

  Scenario Outline: Contact estate agents
    Given path '/properties/<propId>/estateagents/<agentId>'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
#    And configure proxy = 'http://10.74.11.24:3128'
#    And header x-ibm-client-id = 'ada1292d-01fa-4d52-a85d-3194c07d8414'
    When method get
    Then status 200
    And print response

    Examples:
    | propId        | agentId |
    | P24-107167866 | 112026  |
    | P24-107164817 | 102681  |