Feature: As a user I should be able to submit preaproval request

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

     * def securityToken = read('TokenStore/api.security.token.txt')
    * def Timeout = 500000


  @Digital-Home-Buying
  Scenario Outline: Submit PreAproval Request (Campaign and Offer)
    Given path 'preapproval'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And header Content-Type = 'application/json'
    And def preApprovalRequest =
    """
    {"id":1,"loanType":"<loantype>","amountRequired":<amountRequired>,"reason":<reason>,"term":<loanTerm>,"depositAmount":<depositAmount>,"agreedTerms":<booleanAgreedT&C>,"applicants":[{"id":1,"clientId":"<clientID>","rsaIdNumber":"<rsaIdNumber>","fullNames":"<fullName>","surname":"<surName>","maritalStatus":"<maritalStatus>","mobileNumber":"<mobileNumber>","email":"<email>","income":{"id":1,"grossSalaryMonthly":<grossSalaryMonthly>,"netSalaryMonthly":<netSalaryMonthly>,"otherIncome":<otherIncome>,"contractDebtMonthly":<contractDebtMonthly>,"expensesMonthly":<expensesMonthly>},"marriageType":"<marriageType>","isMainApp":<booleanIsMainApp>,"isSpouse":<boolanIsSpouse>}],"product":{"id":1,"name":"<productName>","code":"<productCode>","description":"<productDescription>"},"purchasePrice":<purchasePrice>,"existingLoanAccNumber":"<existingLoanAccNumber>","landPrice":<landPrice>}
    """
    And request preApprovalRequest
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And def expectedCampaign =  read('jsonData/<campaignFileToread>.json')
    And def expectedOfferResponse =  read('jsonData/<offerFileToread>.json')
    And def campaigns = responseJson.data.campaigns
    And print 'Found this campaigns ##########################'+ campaigns
#    And match campaigns == expectedCampaign.data
    And def offerResp = responseJson.data.offerResult
    And print 'Found this offer response *****************************'+ offerResp
    And match offerResp !=  ''



    Examples:
    | loantype | amountRequired | reason | loanTerm | depositAmount | booleanAgreedT&C | clientID | rsaIdNumber | fullName | surName | maritalStatus | mobileNumber | email | grossSalaryMonthly | netSalaryMonthly | otherIncome | contractDebtMonthly | expensesMonthly | marriageType | booleanIsMainApp | boolanIsSpouse | productName | productCode | productDescription | purchasePrice | existingLoanAccNumber | landPrice | campaignFileToread| offerFileToread |
#    | 1        | 750000.00      | 1      | 20       | 50000.00      | true             | 1      | 8303035024088 | John     | Johnson | M | 0731159217   | azeezs@nedbank.co.za | 30000.00        | 20000.00         | 1000.00     | 1000.00             | 1000.00         | 01           | true             | false          | New Loan    | 01          | New Loan           | 1000000.00    |                       | 1000000.0 | OnePercentCashBackCampaign| RefferedOfferResponse |
    | 1        | 750000.00      | 1      | 20       | 50000.00      | true             | 1      | 8303035024088 | John     | Johnson | M | 0826741820   | azeezs@nedbank.co.za | 80000.00        | 55000.00         | 1000.00     | 1000.00             | 1000.00         | 01           | true             | false          | New Loan    | 01          | New Loan           | 1000000.00    |                       | 1000000.0 | OnePercentCashBackCampaign | ApprovedOfferResponse |

  @Digital-Home-Buying
  Scenario Outline: Submit PreAproval Request With Co Applicant (Offer)
    Given path 'preapproval'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And header Content-Type = 'application/json'
    And def preApprovalRequest =
    """
    {"id":1,"loanType":"<loantype>","amountRequired":<amountRequired>,"reason":<reason>,"term":<loanTerm>,"depositAmount":<depositAmount>,"agreedTerms":<booleanAgreedT&C>,"applicants":[{"id":<applicantId>,"clientId":"<clientID>","rsaIdNumber":"<rsaIdNumber>","fullNames":"<fullName>","surname":"<surName>","maritalStatus":"<maritalStatus>","mobileNumber":"<mobileNumber>","email":"<email>","income":{"id":1,"grossSalaryMonthly":<grossSalaryMonthly>,"netSalaryMonthly":<netSalaryMonthly>,"otherIncome":<otherIncome>,"contractDebtMonthly":<contractDebtMonthly>,"expensesMonthly":<expensesMonthly>},"marriageType":"<marriageType>","isMainApp":<booleanIsMainApp>,"isSpouse":<boolanIsSpouse>},{"id":<applicantId1>,"clientId":"<clientID1>","rsaIdNumber":"<rsaIdNumber1>","fullNames":"<fullName1>","surname":"<surName1>","maritalStatus":"<maritalStatus1>","mobileNumber":"<mobileNumber1>","email":"<email1>","income":{"id":1,"grossSalaryMonthly":<grossSalaryMonthly1>,"netSalaryMonthly":<netSalaryMonthly1>,"otherIncome":<otherIncome1>,"contractDebtMonthly":<contractDebtMonthly1>,"expensesMonthly":<expensesMonthly1>},"marriageType":"<marriageType1>","isMainApp":<booleanIsMainApp1>,"isSpouse":<boolanIsSpouse1>}],"product":{"id":1,"name":"<productName>","code":"<productCode>","description":"<productDescription>"},"purchasePrice":<purchasePrice>,"existingLoanAccNumber":"<existingLoanAccNumber>","landPrice":<landPrice>}
    """
    And request preApprovalRequest
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
   And def expectedOfferResponse =  read('jsonData/<offerFileToread>.json')
    And def offerResp = responseJson.data.offerResult
    And print 'Found this offer response *****************************'+ offerResp
    And match offerResp != ''


    Examples:
      | loantype | amountRequired | reason | loanTerm | depositAmount | booleanAgreedT&C | applicantId | clientID | rsaIdNumber | fullName | surName | maritalStatus | mobileNumber | email | grossSalaryMonthly | netSalaryMonthly | otherIncome | contractDebtMonthly | expensesMonthly | marriageType | booleanIsMainApp | boolanIsSpouse | applicantId1 | clientID1 | rsaIdNumber1 | fullName1 | surName1 | maritalStatus1 | mobileNumber1 | email1 | grossSalaryMonthly1 | netSalaryMonthly1 | otherIncome1 | contractDebtMonthly1 | expensesMonthly1 | marriageType1 | booleanIsMainApp1 | boolanIsSpouse1 | productName | productCode | productDescription | purchasePrice | existingLoanAccNumber | landPrice |  offerFileToread |
      | 1        | 750000.00      | 1      | 20       | 50000.00      | true             | 1 | 1      | 8303035024088 | John     | Johnson | M | 0826741820   | azeezs@nedbank.co.za | 20000.00        | 15000.00         | 1000.00     | 1000.00             | 1000.00         | 01           | true             | false          |  2 | 2      | 9303035024099 | Julia     | Trina | F | 0999999999   | azeezs@nedbank.co.za | 15000.00        | 10000.00         | 1500.00     | 2000.00             | 500.00         | 01           | true             | true          | New Loan    | 01          | New Loan           | 1000000.00    |                       | 1000000.0  | RefferedOfferResponse |


  @Digital-Home-Buying
  Scenario Outline: Submit PreAproval Request With Co Applicant (Campaign and Offer)
    Given path 'preapproval'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And header Content-Type = 'application/json'
    And def preApprovalRequest =
    """
    {"id":1,"loanType":"<loantype>","amountRequired":<amountRequired>,"reason":<reason>,"term":<loanTerm>,"depositAmount":<depositAmount>,"agreedTerms":<booleanAgreedT&C>,"applicants":[{"id":<applicantId>,"clientId":"<clientID>","rsaIdNumber":"<rsaIdNumber>","fullNames":"<fullName>","surname":"<surName>","maritalStatus":"<maritalStatus>","mobileNumber":"<mobileNumber>","email":"<email>","income":{"id":1,"grossSalaryMonthly":<grossSalaryMonthly>,"netSalaryMonthly":<netSalaryMonthly>,"otherIncome":<otherIncome>,"contractDebtMonthly":<contractDebtMonthly>,"expensesMonthly":<expensesMonthly>},"marriageType":"<marriageType>","isMainApp":<booleanIsMainApp>,"isSpouse":<boolanIsSpouse>},{"id":<applicantId1>,"clientId":"<clientID1>","rsaIdNumber":"<rsaIdNumber1>","fullNames":"<fullName1>","surname":"<surName1>","maritalStatus":"<maritalStatus1>","mobileNumber":"<mobileNumber1>","email":"<email1>","income":{"id":1,"grossSalaryMonthly":<grossSalaryMonthly1>,"netSalaryMonthly":<netSalaryMonthly1>,"otherIncome":<otherIncome1>,"contractDebtMonthly":<contractDebtMonthly1>,"expensesMonthly":<expensesMonthly1>},"marriageType":"<marriageType1>","isMainApp":<booleanIsMainApp1>,"isSpouse":<boolanIsSpouse1>}],"product":{"id":1,"name":"<productName>","code":"<productCode>","description":"<productDescription>"},"purchasePrice":<purchasePrice>,"existingLoanAccNumber":"<existingLoanAccNumber>","landPrice":<landPrice>}
    """
    And request preApprovalRequest
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And def expectedCampaign =  read('jsonData/<campaignFileToread>.json')
    And def campaigns = responseJson.data.campaigns
    And print 'Found this campaigns ##########################'+ campaigns
#    And match campaigns == expectedCampaign.data
    And def expectedOfferResponse =  read('jsonData/<offerFileToread>.json')
    And def offerResp = responseJson.data.offerResult
    And print 'Found this offer response *****************************'+ offerResp
    And match offerResp != ''


    Examples:
      | loantype | amountRequired | reason | loanTerm | depositAmount | booleanAgreedT&C | applicantId | clientID | rsaIdNumber | fullName | surName | maritalStatus | mobileNumber | email | grossSalaryMonthly | netSalaryMonthly | otherIncome | contractDebtMonthly | expensesMonthly | marriageType | booleanIsMainApp | boolanIsSpouse | applicantId1 | clientID1 | rsaIdNumber1 | fullName1 | surName1 | maritalStatus1 | mobileNumber1 | email1 | grossSalaryMonthly1 | netSalaryMonthly1 | otherIncome1 | contractDebtMonthly1 | expensesMonthly1 | marriageType1 | booleanIsMainApp1 | boolanIsSpouse1 | productName | productCode | productDescription | purchasePrice | existingLoanAccNumber | landPrice | campaignFileToread |  offerFileToread |
      | 1        | 750000.00      | 1      | 20       | 50000.00      | true             | 1 | 1      | 8303035024088 | Julia     | Jet | M | 0999999999   | azeezs@nedbank.co.za | 80000.00        | 55000.00         | 1000.00     | 1000.00             | 1000.00         | 01           | true             | false          |  2 | 2      | 9303035024099 | John     | Johnson | F | 0826741820   | azeezs@nedbank.co.za | 45000.00        | 54000.00         | 3500.00     | 2000.00             | 500.00         | 01           | true             | true          | New Loan    | 01          | New Loan           | 1000000.00    |                       | 1000000.0 | OnePercentCashBackCampaign | ApprovedOfferResponse |
