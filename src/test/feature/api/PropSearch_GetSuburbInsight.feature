Feature:As a user I should be able to get suburbs insight

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'
    * def suburbTypesSchema = {id:'#number', name:'#string', province:'#string'}

    * def securityToken = read('TokenStore/api.security.token.txt')



  Scenario Outline: Get Suburbs Insight
    Given path '/suburbs/<suburbid>/insight'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    When method get
    Then status 200
    And print response
    And match response.data != ''

  Examples:
    | suburbid |
    |  8000  |