Feature:As a user I should be able to get Address

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def suburbTypesSchema = {id:'#number', name:'#string', province:'#string'}


  Scenario Outline: Get Address
    Given path '/addresses/<Address>'
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
    And match response.data != ''

  Examples:
    | Address |
    |  10 hill randburg  |