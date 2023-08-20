Feature:  As A User I should be able to get client offers and offer details or offer summary

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'
#    * def HomeLoans_BaseURL = 'https://qa-hlmobile.nednet.co.za/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def clientOfferSchema = { id: #number, creditCheck: #boolean, affordabilityCheck: #boolean, requiredLoanAmount: #notnull, depositLoanAmount: #notnull, offeredLoanAmount: #notnull, instalmentMonthlyMin: #notnull, instalmentMonthlyMax: #notnull, termLoan: #number, expiryDate: #string, message: #string, administrationFee: #notnull, bondRegistrationCost: #notnull, initiationFee: #notnull, transferDuties: #notnull, isExistingHomeLoan: #boolean, registeredHomeLoanAmount: #notnull, applicants: #array }

  @Digital-Home-Buying
  Scenario: Get Client Offers
    Given path 'client/offers'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
#    And header x-ibm-client-id = 'ada1292d-01fa-4d52-a85d-3194c07d8414'
#    And configure proxy = 'http://10.74.11.24:3128'
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    When method get
    Then status 200
    And print response
    And match response.data != ''
