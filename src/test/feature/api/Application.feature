Feature: As a user I should be able to submit and view my applications

  Background:
    * def securityToken = read('TokenStore/api.security.token.txt')
    * def Timeout = 500000
    * def applicationDetailsSchema = {}
    * def applicationSummarySchema = { id: #number, creditCheck: #boolean, affordabilityCheck: #boolean, requiredLoanAmount: #notnull, depositLoanAmount: #notnull, offeredLoanAmount: #notnull, instalmentMonthlyMin: #notnull, instalmentMonthlyMax: #notnull, termLoan: #number, expiryDate: #string, message: #string, administrationFee: #notnull, bondRegistrationCost: #notnull, initiationFee: #notnull, transferDuties: #notnull, isExistingHomeLoan: #boolean, registeredHomeLoanAmount: #notnull }


  @regression
  Scenario Outline: Get Application Summary for offer Id <offerid>
    Given path '/applications/<offerid>/summary'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
#    And header x-ibm-client-id = 'ada1292d-01fa-4d52-a85d-3194c07d8414'
#    And configure VPN_proxy = 'http://10.74.11.24:3128'
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data == '#(^applicationSummarySchema)'


    Examples:
      | offerid |
      | 79082   |
      | 79084   |
      | 88303   |


#  @regression
#  @UID8761-165
#  Scenario Outline: Submit Full Application
#    Given path '/applications/<offerid>'
#    And url HomeLoans_BaseURL
#    And configure proxy = VPN_proxy
#    And configure connectTimeout = Timeout
#    And print '######## Found saved security token ######## '+securityToken
#    And header Authorization = 'Bearer '+securityToken
#    And header x-ibm-client-id = HomeLoans_xIbmClientId
#    And header Content-Type = 'application/json'
#    And def preApprovalRequest =
#    """
#    {"title":<title>}
#    """
#    And request preApprovalRequest
#    When method post
#    Then status 200
#    And json responseJson = response
#    And print responseJson
#
#
#
#    Examples:
#    | offerid | title |
#    | 0009    | Mr    |

#  @regression
#  @UID8761-165
#  Scenario Outline: Get Application
#    Given path '/applications/<offerid>'
#    And url HomeLoans_BaseURL
#    And configure proxy = VPN_proxy
#    And configure connectTimeout = Timeout
#    And print '######## Found saved security token ######## '+securityToken
#    And header Authorization = 'Bearer '+securityToken
#    And header x-ibm-client-id = HomeLoans_xIbmClientId
#    And header Content-Type = 'application/json'
#    When method get
#    Then status 200
#    And json responseJson = response
#    And print responseJson
#
#    Examples:
#      | offerid |
#      | 0009    |





