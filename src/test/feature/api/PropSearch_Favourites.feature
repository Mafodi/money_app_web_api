Feature:As a user I should be able to search suburbs

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')

  @Digital-Home-Buying
  Scenario Outline: Add Favourites Properties
    Given path '/properties/<propid>/favourites'
    And url HomeLoans_BaseURL
    And configure connectTimeout = 60000
    And print '######## Found saved security token ######## '+ securityToken
    And header Authorization = 'Bearer '+securityToken
    And request
    """
      {
      }
    """
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
#    And configure proxy = 'http://10.74.11.24:3128'
#    And header x-ibm-client-id = '1009043d-8009-49ee-9fdb-bcd09dfc2960'
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson

  Examples:
      | propid |
      | P24-106530490 |
      | P24-106861394 |

  @Digital-Home-Buying
  Scenario Outline: Delete Favourites Properties
    Given path '/properties/<propid>/favourites'
    And url HomeLoans_BaseURL
    And configure connectTimeout = 60000
    And print '######## Found saved security token ######## '+ securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
#    And configure proxy = 'http://10.74.11.24:3128'
#    And header x-ibm-client-id = '1009043d-8009-49ee-9fdb-bcd09dfc2960'
    When method delete
    Then status 200
    And json responseJson = response
    And print responseJson

    Examples:
      | propid |
      | P24-106530490 |
      | P24-106861394 |