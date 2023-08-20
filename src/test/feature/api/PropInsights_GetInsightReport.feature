Feature:As a user I should be able to get insight report

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'
    * def insightReportSchema = {status:'#string', remainingCount:'#number', maxLimit:'#number'}

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def maxLimitSchema = {status:'#boolean', remainingCount:'#number', maxLimit:'#number'}
    * def remainingCountValidator =
    """
      function (remCount, maxCount){
        if(remCount == maxCount){
          return false;
        }
        else if(remCount == 0 && maxCount > 0){
          return true;
        }
        else{
          return false;
        }
      }
    """


  Scenario Outline: Get insight report
    Given path '/properties/<propId>/insight/report'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
#    And configure proxy = 'http://10.74.11.24:3128'
#    And header x-ibm-client-id = '1009043d-8009-49ee-9fdb-bcd09dfc2960'
    And request
    """
      {
        "emailAddress": "<email>",
        "mobileNumber": "<phoneNumber>",
        "name": "<name>",
        "propId": "<propId>",
        "ipAddress": "127.0.0.1"
    }
    """
    When method post
    Then status 200
    And print response
    And match response.data == '#(^^insightReportSchema)'

  Examples:
    | propId     | email                  | phoneNumber | name |
    | 11692916  | azeezsalawu3@gmail.com | 0780124835  | Azeez |

  Scenario: Get insight max limit
    Given path '/properties/insights/maxlimit'
    And url HomeLoans_BaseURL
  And configure proxy = VPN_proxy
    And header x-ibm-client-id = HomeLoans_xIbmClientId
#    And configure proxy = 'http://10.74.11.24:3128'
#    And header x-ibm-client-id = '1009043d-8009-49ee-9fdb-bcd09dfc2960';
    And print '######## Found saved security token ######## '+securityToken
  And header Authorization = 'Bearer '+securityToken
    When method get
    Then status 200
    And print response
    And match response.data == '#(^^maxLimitSchema)'
    And def remCount = response.data.remainingCount
    And def maxCount = response.data.maxLimit
    And def expectedStatus = remainingCountValidator(remCount, maxCount)
    And print 'I am expecting this status ::: ' + expectedStatus
    And match response.data.status == expectedStatus