Feature:As a user I should be able to search suburbs

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def suburbTypesSchema = {id:'#number', name:'#string', province:'#string'}

  @Digital-Home-Buying
  Scenario: Search Suburbs
    Given path 'suburbs'
    And url HomeLoans_BaseURL
    And configure connectTimeout = 60000
    And print '######## Found saved security token ######## '+ securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
#    And configure proxy = 'http://10.74.11.24:3128'
#    And header x-ibm-client-id = '1009043d-8009-49ee-9fdb-bcd09dfc2960'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.data == '#[] suburbTypesSchema'