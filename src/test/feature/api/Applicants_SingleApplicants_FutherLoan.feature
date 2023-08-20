Feature: As a user I should be able to get applicants information

  Background:
    * def securityToken = read('TokenStore/api.security.token.txt')
    * def Timeout = 500000
    * def applicationDetailsSchema = {}
    * def saveId =
      """
        function(arg1, arg2) {
          var KarateUtil = Java.type('za.co.nedbank.digital.home.buying.test.api.apiClasses.KarateUtil');
          var kUtil = new KarateUtil;
          return kUtil.saveIds(arg1, arg2);
        }
      """

    * def getDateTime =
      """
        function() {
          var DateTime = Java.type('za.co.nedbank.digital.home.buying.test.api.apiClasses.DateTime');
          var dateTime = new DateTime();
          return dateTime.getTimeStamp();
        }
      """

  Scenario Outline: Submit Pre-Aproval Request for a Single Applicant
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
    And def expectedOfferResponse =  read('jsonData/<offerFileToread>.json')
    And def offerResp = responseJson.data.offerResult
    And print 'Found this offer response *****************************'+ offerResp
    And match offerResp != ''
    And def offerIdToSave = responseJson.data.applicationContext.appId
    And print 'Found this offer id ::: '+offerIdToSave
    And def saveAppId = saveId(offerIdToSave, 'src/test/feature/api/TokenStore/OfferId.txt')
    And print 'Found this applicant id ::: '+ <rsaIdNumber>
    And def saveAppId = saveId(<rsaIdNumber>, 'src/test/feature/api/TokenStore/Applicants.txt')


    Examples:
      | loantype | amountRequired | reason | loanTerm | depositAmount | booleanAgreedT&C | clientID | rsaIdNumber   | fullName | surName | maritalStatus | mobileNumber | email                | grossSalaryMonthly | netSalaryMonthly | otherIncome | contractDebtMonthly | expensesMonthly | marriageType | booleanIsMainApp | boolanIsSpouse | productName | productCode | productDescription | purchasePrice | existingLoanAccNumber | landPrice | offerFileToread       |
      | 6        | 750000.00      | 4      | 20       | 50000.00      | true             | 1        | 8901230052087 | John     | Johnson | M             | 0826741820   | azeezs@nedbank.co.za | 80000.00           | 55000.00         | 1000.00     | 1000.00             | 1000.00         | 01           | true             | false          | New Loan    | 01          | New Loan           | 1000000.00    | 8001051187701         | 1000000.0 | ApprovedOfferResponse |


  @regression
  @UID8761-164
  Scenario Outline: Update applicants personal details and income details with otherIncome :: <otherIncome>, contractDebtMonthly :: <contractDebtMonthly>, netMonthlyBonus :: <netMonthlyBonus>, expensesMonthly :: <expensesMonthly>, totaldDeductions :: <totaldDeductions>
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/applicants/', clientId, '/details'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    #defining values to update
    And def appendingValue = call getDateTime
    And def fullName = 'FirstName '+appendingValue
    And def surName = 'SurName '+appendingValue
    And def email = 'moo_' + appendingValue + '@moo.com'
    And def detailsJson =
    """
    {
      "id": 1,
      "clientId": "#(clientId)",
      "rsaIdNumber": "#(clientId)",
      "fullNames": "<fullNames>",
      "surname": "<surname>",
      "maritalStatus": "<maritalStatus>",
      "mobileNumber": "<mobileNumber>",
      "email": "<email>",
      "income": {
        "grossSalaryMonthly": <grossSalaryMonthly>,
        "netSalaryMonthly": <netSalaryMonthly>,
        "otherIncome": <otherIncome>,
        "contractDebtMonthly": <contractDebtMonthly>,
        "expensesMonthly": <expensesMonthly>,
        "totalDeductions": <totalDeductions>,
        "avarageCommision": <avarageCommision>,
        "netMonthlyBonus": <netMonthlyBonus>
      },
      "marriageType": "",
      "address": {
        "id": null,
        "street": "<street>",
        "complex": null,
        "suburb": "<suburb>",
        "town": "<town>",
        "city": "<city>",
        "province": "<province>",
        "country": "<country>",
        "postalCode": "<postalCode>",
        "districtCouncil": null,
        "municipality": null,
        "suburbId": null,
        "addressString": "<addressString>",
        "streetType": null,
        "matchLevel": null,
        "streetNumber": "<streetNumber>"
      },
      "title": "<title>",
      "workNumber": "<workNumber>",
      "countryOfBirth": {
        "code": "<countryOfBirthCode>",
        "shortName": "<countryOfBirthShortName>",
        "name": "<countryOfBirthName>"
      },
      "southAfricanResident": <southAfricanResident>,
      "multipleNationalities": "<multipleNationalities>",
      "primaryCountryOfResidence": {
        "code": "<primaryCountryOfResidenceCode>",
        "shortName": "<primaryCountryOfResidenceShortName>",
        "name": "<primaryCountryOfResidenceName>"
      },
      "prefferedMethodOfContact": "<prefferedMethodOfContact>",
      "race": "<race>",
      "otherRace": "<otherRace>"
    }
    """
    And request detailsJson
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''
    And match response.data.primaryCountryOfResidence.code == '<primaryCountryOfResidenceCode>'
    And match response.data.primaryCountryOfResidence.shortName == '<primaryCountryOfResidenceShortName>'
    And match response.data.primaryCountryOfResidence.name == '<primaryCountryOfResidenceName>'
    And match response.data.address.addressString != ''

    Examples:
      | fullNames | surname | maritalStatus | mobileNumber | email                | grossSalaryMonthly | netSalaryMonthly | otherIncome | contractDebtMonthly | expensesMonthly | totalDeductions | avarageCommision | netMonthlyBonus | street      | suburb   | town     | city         | province | country      | postalCode | addressString                                                            | streetNumber |title | workNumber | countryOfBirthCode | countryOfBirthShortName | countryOfBirthName | southAfricanResident | multipleNationalities | primaryCountryOfResidenceCode | primaryCountryOfResidenceShortName | primaryCountryOfResidenceName | prefferedMethodOfContact | race | otherRace |
      | Rhulani   | Baloyi  | U             | 0826741820   | azeezs@nedbank.co.za | 70000.0            | 45000.0          | 0.0         | 2000.56             | 934.00          | 1500.00         | 0.0              | 0.0             | West Avenue | Ferndale | Randburg | Johannesburg | 15       | South Africa | 2194       | 279,West Avenue,Ferndale,CITY OF JOHANNESBURG,Johannesburg,Gauteng,2194  | 279          | Mr   | 0999999999 | SN                 | SEN                     | SENEGAL            | true                 |                       | ZA                            | ZAF                                | SOUTH AFRICA                  | 3                        | B    |           |
      | Rhulani   | Baloyi  | D             | 0999999999   | azeezs@nedbank.co.za | 60000.0            | 40000.0          | 0.0         | 1900.56             | 1254.00         | 1600.00         | 0.0              | 0.0             | West Avenue | Ferndale | Randburg | Johannesburg | 15       | South Africa | 2194       | 279,West Avenue,Ferndale,CITY OF JOHANNESBURG,Johannesburg,Gauteng,2194  | 279          | Mr   | 0999999999 | SO                 | SOM                     | SOMALIA            | false                | CA                    | CA                            | CAN                                | CANADA                        | 3                        | I    |           |
      | Rhulani   | Baloyi  | U             | 0999999999   | azeezs@nedbank.co.za | 60000.0            | 40000.0          | 0.0         | 1800.56             | 2264.00         | 1700.00         | 0.0              | 0.0             | West Avenue | Ferndale | Randburg | Johannesburg | 15       | South Africa | 2194       | 279,West Avenue,Ferndale,CITY OF JOHANNESBURG,Johannesburg,Gauteng,2194  | 279          | Mr   | 0999999999 | ZA                 | RSA                     | SOUTH AFRICA       | true                 | ZW                    | ZA                            | ZAF                                | SOUTH AFRICA                  | 3                        | W    |           |
      | Rhulani   | Baloyi  | W             | 0999999999   | azeezs@nedbank.co.za | 60000.0            | 40000.0          | 0.0         | 1700.56             | 1274.00         | 1800.00         | 0.0              | 0.0             | West Avenue | Ferndale | Randburg | Johannesburg | 15       | South Africa | 2194       | 279,West Avenue,Ferndale,CITY OF JOHANNESBURG,Johannesburg,Gauteng,2194  | 279          | Mr   | 0999999999 | SM                 | SMR                     | SAN MARINO         | false                |                       | CA                            | CAN                                | CANADA                        | 3                        | C    |           |
      | Rhulani   | Baloyi  | U             | 0999999999   | azeezs@nedbank.co.za | 60000.0            | 40000.0          | 0.0         | 1700.56             | 1274.00         | 1800.00         | 0.0              | 0.0             | West Avenue | Ferndale | Randburg | Johannesburg | 15       | South Africa | 2194       | 279,West Avenue,Ferndale,CITY OF JOHANNESBURG,Johannesburg,Gauteng,2194  | 279          | Mr   | 0999999999 | SM                 | SMR                     | SAN MARINO         | false                | ZM                    | CA                            | CAN                                | CANADA                        | 3                        | O    | Y         |

  @regression
  @UID8761-164
  Scenario: Fetch applicants details
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/applicants/', clientId, '/details'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''

  @regression
  @UID8761-250
  Scenario Outline: Update applicants income details
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/applicants/', clientId, '/income'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    And def employmentRequest =
    """
      {
          "id": 1,
          "grossSalaryMonthly": <grossSalaryMonthly>,
          "netSalaryMonthly": <netSalaryMonthly>,
          "otherIncome": <otherIncome>,
          "contractDebtMonthly": <contractDebtMonthly>,
          "expensesMonthly": <expensesMonthly>,
          "totalDeductions": <totalDeductions>,
          "avarageCommision": <avarageCommision>,
          "fringeBenefits": <fringeBenefits>,
          "netMonthlyBonus": <netMonthlyBonus>,
          "grossMonthlyRental": <grossMonthlyRental>,
          "incomeType": "<incomeType>"
      }
    """
    And request employmentRequest
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''
    And match response.data.grossSalaryMonthly == <grossSalaryMonthly>
    And match response.data.netSalaryMonthly == <netSalaryMonthly>
    And match response.data.otherIncome == <otherIncome>
    And match response.data.expensesMonthly == <expensesMonthly>
    And match response.data.totalDeductions == <totalDeductions>
    And match response.data.avarageCommision == <avarageCommision>
    And match response.data.fringeBenefits == <fringeBenefits>
    And match response.data.netMonthlyBonus == <netMonthlyBonus>
    And match response.data.grossMonthlyRental == <grossMonthlyRental>

    Examples:
      | grossSalaryMonthly | netSalaryMonthly | otherIncome | contractDebtMonthly | expensesMonthly | totalDeductions | avarageCommision | fringeBenefits | netMonthlyBonus | grossMonthlyRental | incomeType   |
      | 60000              | 45000            | 500         | 4500                | 6000            | 4300            | 0                | 0              | 0               | 8000               | NA           |

  @regression
  @UID8761-164
  Scenario: Fetch applicants income details
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/applicants/', clientId, '/income'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''

  @regression
  @UID8761-167
  Scenario Outline: Update applicants employment details
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/applicants/', clientId, '/employment'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    And def employmentRequest =
    """
      {
        "employmentType": "<employmentType>",
        "employer": "<employer>",
        "occupation": "<occupation>",
        "employmentIndustry": "<employmentIndustry>",
        "fringeBenefits": <fringeBenefits>,
        "additionalSalary": <additionalSalary>,
        "performanceBasedIncome": <performanceBasedIncome>,
        "rentalIncome": <rentalIncome>,
        "salaryBasedOnCommision": <salaryBasedOnCommision>,
        "workNumber": "<workNumber>",
        "otherOccupation": "<otherOccupation>",
        "otherEmploymentIndustry": "<otherEmploymentIndustry>",
        "sourceOfIncome": "<sourceOfIncome>",
        "hasRegularIncome": <hasRegularIncome>,
        "otherSourceOfIncome": ""
      }
    """
    And request employmentRequest
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''
    And match response.data.employmentType == '<employmentType>'
    And match response.data.employer == '<employer>'
    And match response.data.occupation == '<occupation>'
    And match response.data.employmentIndustry == '<employmentIndustry>'
    And match response.data.fringeBenefits == <fringeBenefits>
    And match response.data.additionalSalary == <additionalSalary>
    And match response.data.performanceBasedIncome == <performanceBasedIncome>
    And match response.data.rentalIncome == <rentalIncome>
    And match response.data.salaryBasedOnCommision == <salaryBasedOnCommision>
    And match response.data.workNumber == '<workNumber>'

    Examples:
      | employmentType | employer               | occupation | employmentIndustry | fringeBenefits | additionalSalary | performanceBasedIncome | rentalIncome | salaryBasedOnCommision | workNumber | otherOccupation | otherEmploymentIndustry | sourceOfIncome | hasRegularIncome |
      | PM             | Nedbank HomeLoans Inc. | 0040       | 5510               | false          | true             | true                   | false        | false                  | 0119875643 |                 |                         | 1              | true             |
      | CT             | Nedbank HomeLoans Inc. | 0040       | 5510               | false          | true             | true                   | false        | false                  | 0119875643 | 0040            | 5510                    | 1              | true             |

  @regression
  @UID8761-166
  Scenario: Fetch applicants employment details
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/applicants/', clientId, '/employment'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''

  @regression
  @UID8761-166
  Scenario Outline: Update applicants banking details
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/applicants/', clientId, '/bank'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    And def bankingRequest =
    """
       [{
          "bankName": "<bankName>",
          "accountType":  "<accountType>",
          "accountHolder": "<accountHolder>",
          "accountNumber": "<accountNumber>" ,
          "salaryPaidOnThisAccount": <salaryPaidOnThisAccount>,
          "isNedbankAccount": <isNedBankAccount>,
          "branchCode": "<branchCode>",
          "description": "",
          "allowRetrievalBankStatements": <allowRetrievalBankStatements>
       }]
    """
    And request bankingRequest
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.data[*].accountHolder contains  '<accountHolder>'
    And match responseJson.data[*].accountNumber contains  '<accountNumber>'
    And match responseJson.data[*].description contains  '<expectedDescription>'

    Examples:
      | bankName | accountType | accountHolder | accountNumber | salaryPaidOnThisAccount | isNedBankAccount | branchCode | expectedDescription | allowRetrievalBankStatements |
      | Nedbank  | 1           | Rhulani M     | 125436999     | true                    | true             | 198765     | Savings             | true                         |
      | FNB      | 2           | Rhulani M     | 125436889     | false                   | false            | 250655     | Cheque              | true                         |

  @regression
  @UID8761-166
  Scenario: Fetch applicants banking details
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/applicants/', clientId, '/bank'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''

  @regression
  @UID8761-253
  Scenario: Fetch applicants loan details
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/loan'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''

  @regression
  @UID8761-251
  Scenario Outline: Update applicants expenses
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/applicants/', clientId,  '/expense'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    And def expensesRequest =
    """
      {
        "totalExpenses": <totalExpenses>,
        "rent": <rent>,
        "isRentPayableAfterRegistration": <isRentPayableAfterRegistration>,
        "rateAndTaxes": <rateAndTaxes>,
        "waterAndElectricity": <waterAndElectricity>,
        "maintenance": <maintenance>,
        "groceries": <groceries>,
        "domesticWages": <domesticWages>,
        "education": <education>,
        "entertainment": <entertainment>,
        "petrolAndMaintenance": <petrolAndMaintenance>,
        "insurance": <insurance>,
        "otherExpenses": <otherExpenses>,
        "expenseItems": [
          {
            "expenseType": "<expenseType>",
            "amountOwed": <amountOwed>,
            "portionToSettle": <portionToSettle>,
            "monthlyRepayment": <monthlyRepayment>,
            "creditProvider": "<creditProvider>",
            "description": "<description>"
          }
        ],
        "homeLoan": <homeLoan>,
        "carLoan": <carLoan>,
        "creditCard": <creditCard>,
        "retailStoreAccount": <retailStoreAccount>,
        "additionalProp1": {}
      }
    """
    And request expensesRequest
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''

    Examples:
      | totalExpenses | rent | isRentPayableAfterRegistration | rateAndTaxes | waterAndElectricity | maintenance | groceries | domesticWages | education | entertainment | petrolAndMaintenance | insurance | otherExpenses | expenseType     | amountOwed | portionToSettle | monthlyRepayment | creditProvider | description                | homeLoan | carLoan | creditCard | retailStoreAccount |
      | 15000         | 5500 | true                           | 0            | 400                 | 0           | 800       | 0             | 0         | 400           | 1800                 | 2300      | 400           | 5               | 5600       | 5600            | 120              | Vodacom        | Payment for Phone Contract | 0        | 2300    | 0          | 200                |

  @regression
  @UID8761-251
  Scenario: Fetch applicants expenses
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/applicants/', clientId,  '/expense'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''

  @regression
  @UID8761-255
  Scenario Outline: Update applicants additional details to test for <scenarioName>
    Given def offerId = read('TokenStore/OfferId.txt')
    And print 'Executing Scenario :::  <scenarioName>'
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/applicants/', clientId,  '/additionaldetails'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    And def additionalInfoRequest =
    """
      {
      "hasAppliedForCreditLast60Days": <hasAppliedForCreditLast60Days>,
      "creditType": "<creditType>",
      "applyLoanAmount": <applyLoanAmount>,
      "applyStatus": "<applyStatus>",
      "applyBank": "<applyBank>",
      "hasOtherLoanApplications": <hasOtherLoanApplications>,
      "loanAmount": <loanAmount>,
      "purchasePrice": <purchasePrice>,
      "loanStatus": "<loanStatus>",
      "loanBank": "<loanBank>",
      "hasSignedSurety": <hasSignedSurety>,
      "suretyCreditType": "<suretyCreditType>",
      "suretyAmount": "<suretyAmount>",
      "suretyBank": "<suretyBank>",
      "haveBeenInsolvent": <haveBeenInsolvent>,
      "insolventDate": "<insolventDate>",
      "insolventRehabDate": "<insolventRehabDate>",
      "isCurrentlyInsolvent": <isCurrentlyInsolvent>,
      "insolventDetails": "<insolventDetails>",
      "isDependentOtherNonApplicant": <isDependentOtherNonApplicant>,
      "monthlyContribution": <monthlyContribution>,
      "sourceOfFundsDepositAndTransfer": "<sourceOfFundsDepositAndTransfer>",
      "otherDescription": "<otherDescription>",
      "hasBenefitIncluded": <hasBenefitIncluded>,
      "benefitDetails": "<benefitDetails>",
      "hasRelationshipWithSeller": <hasRelationshipWithSeller>,
      "relationshipDetails": "<relationshipDetails>"
    }
    """
    And request additionalInfoRequest
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''
    And match response.data.hasAppliedForCreditLast60Days == <hasAppliedForCreditLast60Days>
    And match response.data.hasRelationshipWithSeller == <hasRelationshipWithSeller>

    Examples:
      | hasAppliedForCreditLast60Days | creditType | applyLoanAmount | applyStatus | applyBank | hasOtherLoanApplications | loanAmount | purchasePrice | loanStatus | loanBank | hasSignedSurety | suretyCreditType | suretyAmount | suretyBank | haveBeenInsolvent | insolventDate | insolventRehabDate | isCurrentlyInsolvent | insolventDetails | isDependentOtherNonApplicant | monthlyContribution | sourceOfFundsDepositAndTransfer | otherDescription | hasBenefitIncluded | benefitDetails | hasRelationshipWithSeller | relationshipDetails | scenarioName                       |
      | true                          | loan       | 1000000         | 0           | FNB       | false                    | 0          | 0             |            |          | true            |  Phone           | 2000         | FNB        | false             |               |                    | false                |                  | false                        |                     |                                 |                  | true               | benefit1       | false                     |                     | - Has anothe loan                  |
      | false                         |            | 0               | 0           |           | false                    | 0          | 0             |            |          | true            |  Phone           | 300          | FNB        | true              | 2014-05-01    | 2014-06-01         | false                |                  | false                        |                     |                                 |                  | true               | benefit1       | false                     |                     | - Declared Insolvent               |
      | false                         |            | 0               | 0           |           | false                    | 0          | 0             |            |          | true            |  Phone           | 400          | FNB        | false             |               |                    | false                |                  | true                         | 4000                |                                 |                  | true               | benefit1       | false                     |                     | - is Dependent Other Non Applicant |
      | false                         |            | 0               | 0           |           | false                    | 0          | 0             |            |          | false           |                  | 0            |            | false             |               |                    | false                |                  | true                         | 4000                |                                 |                  | true               | benefit1       | false                     |                     | - Has relationship with seller     |

  @regression
  @UID8761-255
  Scenario: Fetch applicants additional details
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/applicants/', clientId,  '/additionaldetails'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''

  @regression
  @UID8761-166
  Scenario Outline: Update applicants insurance
    Given def offerId = read('TokenStore/OfferId.txt')
    And print 'Executing Scenario :::  <scenarioName>'
    And path '/applications/', offerId, '/insurance'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    And def employmentRequest =
    """
     {
      "propertySecurity": "<propertySecurity>",
      "isNedbankInsurance": <isNedbankInsurance>,
      "otherPropertySecurity": "<otherPropertySecurity>",
      "externalInsuranceCompany": "<externalInsuranceCompany>",
      "doRequireLifeCover": "<doRequireLifeCover>"
    }
    """
    And request employmentRequest
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''

    Examples:
      | propertySecurity | isNedbankInsurance | otherPropertySecurity | externalInsuranceCompany | doRequireLifeCover | scenarioName         |
      | 1                | true               | String                |                          | N                  | property Security 1  |
      | 3                | false              | String                |                          | B                  | property Security 3  |
      | 17               | true               | String                | External Company         | E                  | property Security 17 |

  @regression
  @UID8761-166
  Scenario: Fetch applicants insurance
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId, '/insurance'
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''

  @regression
  @UID8761-266
  Scenario Outline: Submit application for scenario <scenarioName>
    Given def offerId = read('TokenStore/OfferId.txt')
    And def clientId = read('TokenStore/Applicants.txt')
    And path '/applications/', offerId
    And url HomeLoans_BaseURL
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    And header Content-Type = 'application/json'
    And def submitApplicationRequest =
    """
    {
      "acceptTerms": <acceptTerms>,
      "allowRetrievalBankStatements": <allowRetrievalBankStatements>,
      "receiveProductOffers": <receiveProductOffers>,
      "receivePartnerOffers": <receivePartnerOffers>,
      "contactByResearchPartners": <contactByResearchPartners>,
      "useAlternativeContactMethod": <useAlternativeContactMethod>
    }
    """
    And request submitApplicationRequest
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data != ''
    And def referenceNumber = response.data
    And print 'Found Reference Number' + referenceNumber

    Examples:
    | acceptTerms | allowRetrievalBankStatements | receiveProductOffers | receivePartnerOffers | contactByResearchPartners | useAlternativeContactMethod | scenarioName        |
    | true        | true                         | true                 |true                  | true                      | true                        | Initial submission  |
    | true        | false                        | true                 |true                  | true                      | true                        | Duplicat Submission |

  Scenario: Validate that application id does not appear in the offer list response
    Given def offerId = read('TokenStore/OfferId.txt')
    And path 'client/offers'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
    When method get
    Then status 200
    And print response
    And def offerIdSize = response.data.size()
    And print 'Found size :::: '+offerIdSize
    And match response.data[*].id !contains  '<offerId>'