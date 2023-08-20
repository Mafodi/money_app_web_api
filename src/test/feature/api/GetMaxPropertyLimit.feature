Feature: As a user I should be able to get property favourite max limit

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def maxLimitScheme = {status:'#boolean', remainingCount:'#number', maxLimit:'#number'}

  @Digital-Home-Buying
  Scenario: Get property favourite max limit
  Given path '/properties/favourites/maxlimit'
  And url HomeLoans_BaseURL
  And configure proxy = VPN_proxy
    And header x-ibm-client-id = HomeLoans_xIbmClientId
#  And header x-ibm-client-id = '1009043d-8009-49ee-9fdb-bcd09dfc2960';
#  And configure proxy = 'http://10.74.11.24:3128'
  And print '######## Found saved security token ######## '+securityToken
  And header Authorization = 'Bearer '+securityToken
  When method get
  Then status 200
  And print response
  And match response.data == '#(^^maxLimitScheme)'