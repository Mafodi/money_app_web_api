Feature: As a user I should be able to get applicants information

  Background:
    * def Timeout = 800000
    * def securityToken = read('TokenStore/api.security.token.txt')
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
    {
       "id":1,
       "loanType":"<loantype>",
       "amountRequired":<amountRequired>,
       "reason":<reason>,
       "term":<loanTerm>,
       "depositAmount":<depositAmount>,
       "agreedTerms":<booleanAgreedT&C>,
       "applicants":[
          {
             "id":<applicantId>,
             "clientId":"<clientID>",
             "rsaIdNumber":"<rsaIdNumber>",
             "fullNames":"<fullName>",
             "surname":"<surName>",
             "maritalStatus":"<maritalStatus>",
             "mobileNumber":"<mobileNumber>",
             "email":"<email>",
             "income":{
                "id":1,
                "grossSalaryMonthly":<grossSalaryMonthly>,
                "netSalaryMonthly":<netSalaryMonthly>,
                "otherIncome":<otherIncome>,
                "contractDebtMonthly":<contractDebtMonthly>,
                "expensesMonthly":<expensesMonthly>
             },
             "marriageType":"<marriageType>",
             "isMainApp":<booleanIsMainApp>,
             "isSpouse":<boolanIsSpouse>
          },
          {
             "id":<applicantId1>,
             "clientId":"<clientID1>",
             "rsaIdNumber":"<rsaIdNumber1>",
             "fullNames":"<fullName1>",
             "surname":"<surName1>",
             "maritalStatus":"<maritalStatus1>",
             "mobileNumber":"<mobileNumber1>",
             "email":"<email1>",
             "income":{
                "id":1,
                "grossSalaryMonthly":<grossSalaryMonthly1>,
                "netSalaryMonthly":<netSalaryMonthly1>,
                "otherIncome":<otherIncome1>,
                "contractDebtMonthly":<contractDebtMonthly1>,
                "expensesMonthly":<expensesMonthly1>
             },
             "marriageType":"<marriageType1>",
             "isMainApp":<booleanIsMainApp1>,
             "isSpouse":<boolanIsSpouse1>
          },
          {
             "id":<applicantId2>,
             "clientId":"<clientID2>",
             "rsaIdNumber":"<rsaIdNumber2>",
             "fullNames":"<fullName2>",
             "surname":"<surName2>",
             "maritalStatus":"<maritalStatus2>",
             "mobileNumber":"<mobileNumber2>",
             "email":"<email2>",
             "income":{
                "id":1,
                "grossSalaryMonthly":<grossSalaryMonthly2>,
                "netSalaryMonthly":<netSalaryMonthly2>,
                "otherIncome":<otherIncome2>,
                "contractDebtMonthly":<contractDebtMonthly2>,
                "expensesMonthly":<expensesMonthly2>
             },
             "marriageType":"<marriageType2>",
             "isMainApp":<booleanIsMainApp2>,
             "isSpouse":<boolanIsSpouse2>
          },
          {
             "id":<applicantId3>,
             "clientId":"<clientID3>",
             "rsaIdNumber":"<rsaIdNumber3>",
             "fullNames":"<fullName3>",
             "surname":"<surName3>",
             "maritalStatus":"<maritalStatus3>",
             "mobileNumber":"<mobileNumber3>",
             "email":"<email3>",
             "income":{
                "id":1,
                "grossSalaryMonthly":<grossSalaryMonthly3>,
                "netSalaryMonthly":<netSalaryMonthly3>,
                "otherIncome":<otherIncome3>,
                "contractDebtMonthly":<contractDebtMonthly3>,
                "expensesMonthly":<expensesMonthly3>
             },
             "marriageType":"<marriageType3>",
             "isMainApp":<booleanIsMainApp3>,
             "isSpouse":<boolanIsSpouse3>
          },
          {
             "id":<applicantId4>,
             "clientId":"<clientID4>",
             "rsaIdNumber":"<rsaIdNumber4>",
             "fullNames":"<fullName4>",
             "surname":"<surName4>",
             "maritalStatus":"<maritalStatus4>",
             "mobileNumber":"<mobileNumber4>",
             "email":"<email4>",
             "income":{
                "id":1,
                "grossSalaryMonthly":<grossSalaryMonthly4>,
                "netSalaryMonthly":<netSalaryMonthly4>,
                "otherIncome":<otherIncome4>,
                "contractDebtMonthly":<contractDebtMonthly4>,
                "expensesMonthly":<expensesMonthly4>
             },
             "marriageType":"<marriageType4>",
             "isMainApp":<booleanIsMainApp4>,
             "isSpouse":<boolanIsSpouse4>
          }
       ],
       "product":{
          "id":1,
          "name":"<productName>",
          "code":"<productCode>",
          "description":"<productDescription>"
       },
       "purchasePrice":<purchasePrice>,
       "existingLoanAccNumber":"<existingLoanAccNumber>",
       "landPrice":<landPrice>
    }
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
    And def saveAppId = saveId(offerIdToSave, 'src/test/feature/api/TokenStore/OfferId_CoApplication.txt')


    Examples:
      | loantype | amountRequired | reason | loanTerm | depositAmount | booleanAgreedT&C | applicantId | clientID | rsaIdNumber   | fullName | surName | maritalStatus | mobileNumber | email                | grossSalaryMonthly | netSalaryMonthly | otherIncome | contractDebtMonthly | expensesMonthly | marriageType | booleanIsMainApp | boolanIsSpouse | applicantId1 | clientID1 | rsaIdNumber1  | fullName1 | surName1 | maritalStatus1 | mobileNumber1 | email1               | grossSalaryMonthly1 | netSalaryMonthly1 | otherIncome1 | contractDebtMonthly1 | expensesMonthly1 | marriageType1 | booleanIsMainApp1 | boolanIsSpouse1 | applicantId2 | clientID2 | rsaIdNumber2  | fullName2 | surName2 | maritalStatus2 | mobileNumber2 | email2               | grossSalaryMonthly2 | netSalaryMonthly2 | otherIncome2 | contractDebtMonthly2 | expensesMonthly2 | marriageType2 | booleanIsMainApp2 | boolanIsSpouse2 | applicantId3 | clientID3 | rsaIdNumber3  | fullName3 | surName3  | maritalStatus3 | mobileNumber3 | email3               | grossSalaryMonthly3 | netSalaryMonthly3 | otherIncome3 | contractDebtMonthly3 | expensesMonthly3 | marriageType3 | booleanIsMainApp3 | boolanIsSpouse3 | applicantId4 | clientID4 | rsaIdNumber4  | fullName4 | surName4  | maritalStatus4 | mobileNumber4 | email4               | grossSalaryMonthly4 | netSalaryMonthly4 | otherIncome4 | contractDebtMonthly4 | expensesMonthly4 | marriageType4 | booleanIsMainApp4 | boolanIsSpouse4 | productName | productCode | productDescription | purchasePrice | existingLoanAccNumber | landPrice |  offerFileToread      |
      | 6        | 750000.00      | 1      | 20       | 50000.00      | true             | 1           | 1        | 8901230052087 | Rhulani  | Baloyi  | M             | 0826741820   | azeezs@nedbank.co.za | 20000.00           | 15000.00         | 1000.00     | 1000.00             | 1000.00         | 01           | true             | false          |  2           | 2         | 9303035024099 | Julia     | Trina    | F              | 0999999999    | azeezs@nedbank.co.za | 15000.00            | 10000.00          | 1500.00      | 2000.00              | 500.00           | 01            | false             | true            |  3           | 3         | 9402024800087 | Timothy   | Zuma     | F              | 0999999999    | azeezs@nedbank.co.za | 45000.00            | 35000.00          | 0            | 3000.00              | 1500.00          | 01            | false             | false           |  3           | 3         | 9707014800081 | Sanele    | Ramaphosa | F              | 0999999999    | azeezs@nedbank.co.za | 60000.00            | 45000.00          | 0            | 2500.00              | 1000.00          | 01            | false             | false           | 4            | 4         | 9701014800084 | George    | Tasha     | F              | 0999999999    | azeezs@nedbank.co.za | 70000.00            | 53000.00          | 0            | 3500.00              | 1500.00          | 01            | false             | false           | New Loan    | 01          | New Loan           | 1000000.00    | 8001051187701         | 1000000.0 | RefferedOfferResponse |


  @regression
  @UID8761-561
  Scenario Outline: Update applicants personal details and income details for client Id :: <clientId> with otherIncome :: <otherIncome>, contractDebtMonthly :: <contractDebtMonthly>, netMonthlyBonus :: <netMonthlyBonus>, expensesMonthly :: <expensesMonthly>, totaldDeductions :: <totaldDeductions>
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
    And path '/applications/', offerId, '/applicants/<clientId>/details'
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
      "clientId": "<clientId>",
      "rsaIdNumber": "<clientId>",
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
      | clientId      | fullNames | surname   | maritalStatus | mobileNumber | email                | grossSalaryMonthly | netSalaryMonthly | otherIncome | contractDebtMonthly | expensesMonthly | totalDeductions | avarageCommision | netMonthlyBonus | street      | suburb   | town     | city         | province | country      | postalCode | addressString                                              | streetNumber |title | workNumber | countryOfBirthCode | countryOfBirthShortName | countryOfBirthName | southAfricanResident | multipleNationalities | primaryCountryOfResidenceCode | primaryCountryOfResidenceShortName | primaryCountryOfResidenceName | prefferedMethodOfContact | race | otherRace |
      | 8901230052087 | Rhulani   | Baloyi    | U             | 0826741820   | azeezs@nedbank.co.za | 70000.0            | 45000.0          | 0.0         | 2000.56             | 934.00          | 1500.00         | 0.0              | 0.0             | West Avenue | Ferndale | Randburg | Johannesburg | 15       | South Africa | 2194       | 279,West Avenue,Ferndale,CITY OF JOHANNESBURG,Gauteng,2194 | 279          | Mr   | 0999999999 | SN                 | SEN                     | SENEGAL            | true                 |                       | ZA                            | ZAF                                | SOUTH AFRICA                  | 3                        | B    |           |
      | 9303035024099 | Julia     | Trina     | D             | 0999999999   | azeezs@nedbank.co.za | 60000.0            | 40000.0          | 0.0         | 1900.56             | 1254.00         | 1600.00         | 0.0              | 0.0             | West Avenue | Ferndale | Randburg | Johannesburg | 15       | South Africa | 2194       | 279,West Avenue,Ferndale,CITY OF JOHANNESBURG,Gauteng,2194 | 279          | Mrs  | 0999999999 | SO                 | SOM                     | SOMALIA            | false                | CA                    | CA                            | CAN                                | CANADA                        | 3                        | I    |           |
      | 9402024800087 | Timothy   | Zuma      | U             | 0999999999   | azeezs@nedbank.co.za | 60000.0            | 40000.0          | 0.0         | 1800.56             | 2264.00         | 1700.00         | 0.0              | 0.0             | West Avenue | Ferndale | Randburg | Johannesburg | 15       | South Africa | 2194       | 279,West Avenue,Ferndale,CITY OF JOHANNESBURG,Gauteng,2194 | 279          | Mr   | 0999999999 | ZA                 | RSA                     | SOUTH AFRICA       | true                 | ZW                    | ZA                            | ZAF                                | SOUTH AFRICA                  | 3                        | W    |           |
      | 9707014800081 | Sanele    | Ramaphosa | W             | 0999999999   | azeezs@nedbank.co.za | 60000.0            | 40000.0          | 0.0         | 1700.56             | 1274.00         | 1800.00         | 0.0              | 0.0             | West Avenue | Ferndale | Randburg | Johannesburg | 15       | South Africa | 2194       | 279,West Avenue,Ferndale,CITY OF JOHANNESBURG,Gauteng,2194 | 279          | Mr   | 0999999999 | SM                 | SMR                     | SAN MARINO         | false                |                       | CA                            | CAN                                | CANADA                        | 3                        | C    |           |
      | 9701014800084 | George    | Tasha     | W             | 0999999999   | azeezs@nedbank.co.za | 60000.0            | 40000.0          | 0.0         | 1700.56             | 1274.00         | 1800.00         | 0.0              | 0.0             | West Avenue | Ferndale | Randburg | Johannesburg | 15       | South Africa | 2194       | 279,West Avenue,Ferndale,CITY OF JOHANNESBURG,Gauteng,2194 | 279          | Mrs  | 0999999999 | SM                 | SMR                     | SAN MARINO         | false                |                       | CA                            | CAN                                | CANADA                        | 3                        | C    |           |


  @regression
  @UID8761-561
  Scenario Outline: Fetch applicants details
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
    And path '/applications/', offerId, '/applicants/<clientId>/details'
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

  Examples:
    | clientId      |
    | 8901230052087 |
    | 9303035024099 |
    | 9402024800087 |
    | 9707014800081 |
    | 9701014800084 |

  @regression
  @UID8761-628
  Scenario Outline: Update applicants income details
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
    And path '/applications/', offerId, '/applicants/<clientId>/income'
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
      | clientId      | grossSalaryMonthly | netSalaryMonthly | otherIncome | contractDebtMonthly | expensesMonthly | totalDeductions | avarageCommision | fringeBenefits | netMonthlyBonus | grossMonthlyRental | incomeType   |
      | 8901230052087 | 60000              | 45000            | 500         | 4500                | 6000            | 4300            | 0                | 0              | 0               | 8000               | NA           |
      | 9303035024099 | 45000              | 32000            | 800         | 4000                | 4000            | 4000            | 0                | 0              | 0               | 6000               | NA           |
      | 9402024800087 | 90000              | 60000            | 1500        | 3500                | 5000            | 3300            | 0                | 0              | 0               | 5000               | NA           |
      | 9707014800081 | 103000             | 70000            | 900         | 2500                | 7000            | 2300            | 0                | 0              | 0               | 4000               | NA           |
      | 9701014800084 | 70000              | 53000            | 900         | 3500                | 7000            | 2000            | 0                | 0              | 0               | 5000               | NA           |


  @regression
  @UID8761-628
  Scenario Outline: Fetch applicants income details
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
    And path '/applications/', offerId, '/applicants/<clientId>/income'
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

    Examples:
      | clientId      |
      | 8901230052087 |
      | 9303035024099 |
      | 9402024800087 |
      | 9707014800081 |
      | 9701014800084 |

  @regression
  @UID8761-565
  Scenario Outline: Update applicants employment details
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
    And path '/applications/', offerId, '/applicants/<clientId>/employment'
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
        "otherSourceOfIncome": "<otherSourceOfIncome>"
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
    And match response.data.rentalIncome == <rentalIncome>
    And match response.data.salaryBasedOnCommision == <salaryBasedOnCommision>
    And match response.data.workNumber == '<workNumber>'

    Examples:
      | clientId      | employmentType | employer               | occupation | employmentIndustry | fringeBenefits | additionalSalary | performanceBasedIncome | rentalIncome | salaryBasedOnCommision | workNumber | otherOccupation | otherEmploymentIndustry | sourceOfIncome | hasRegularIncome | otherSourceOfIncome |
      | 8901230052087 | PM             | Nedbank HomeLoans Inc. | 0040       | 5510               | false          | true             | true                   | false        | false                  | 0119875643 |                 |                         | 1              | true             |                     |
      | 9303035024099 | CT             | FNB                    | 0040       | 5510               | false          | true             | true                   | false        | false                  | 0119875643 | 0040            | 5510                    | 1              | true             |                     |
      | 9402024800087 | HE             |                        |            |                    | false          | false            | true                   | false        | false                  |            |                 |                         | 8              | false            | NN                  |
      | 9707014800081 | RE             |                        |            |                    | false          | false            | false                  | false        | false                  |            |                 |                         | 4              | true             | PE                  |
      | 9701014800084 | CT             | Discovery              | 0040       | 5510               | false          | true             | true                   | false        | false                  | 0119875643 |                 |                         | 1              | true             |                     |


  @regression
  @UID8761-565
  Scenario Outline: Fetch applicants employment details
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
    And path '/applications/', offerId, '/applicants/<clientId>/employment'
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

    Examples:
      | clientId      |
      | 8901230052087 |
      | 9303035024099 |
      | 9402024800087 |
      | 9707014800081 |
      | 9701014800084 |

  @regression
  @UID8761-562
  Scenario Outline: Update applicants banking details
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
    And path '/applications/', offerId, '/applicants/<clientId>/bank'
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
      | clientId      | bankName | accountType | accountHolder    | accountNumber | salaryPaidOnThisAccount | isNedBankAccount | branchCode | expectedDescription | allowRetrievalBankStatements |
      | 8901230052087 | Nedbank  | 1           | Rhulani M        | 125436999     | true                    | true             | 198765     | Savings             | true                         |
      | 9303035024099 | FNB      | 2           | Julia Trina      | 125436889     | true                    | false            | 250655     | Cheque              | true                         |
      | 9402024800087 | FNB      | 2           | Timothy Zuma     | 000436889     | true                    | false            | 250655     | Cheque              | true                         |
      | 9707014800081 | Nedbank  | 1           | Sanele Ramaphosa | 125400099     | true                    | true             | 198765     | Savings             | true                         |
      | 9701014800084 | Nedbank  | 1           | George Tasha     | 100400099     | true                    | true             | 198765     | Savings             | true                         |

  @regression
  @UID8761-562
  Scenario Outline: Fetch applicants banking details
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
    And path '/applications/', offerId, '/applicants/<clientId>/bank'
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

    Examples:
      | clientId      |
      | 8901230052087 |
      | 9303035024099 |
      | 9402024800087 |
      | 9707014800081 |
      | 9701014800084 |

  @regression
  @UID8761-609
  Scenario: Fetch applicants loan details
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
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
  @UID8761-563
  Scenario Outline: Update applicants expenses
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
    And path '/applications/', offerId, '/applicants/<clientId>/expense'
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
      | clientId      | totalExpenses | rent | isRentPayableAfterRegistration | rateAndTaxes | waterAndElectricity | maintenance | groceries | domesticWages | education | entertainment | petrolAndMaintenance | insurance | otherExpenses | expenseType     | amountOwed | portionToSettle | monthlyRepayment | creditProvider | description                 | homeLoan | carLoan | creditCard | retailStoreAccount |
      | 8901230052087 | 15000         | 5500 | true                           | 0            | 400                 | 0           | 1200      | 0             | 0         | 400           | 1200                 | 2300      | 400           | 5               | 5600       | 5600            | 120              | Vodacom        | Payment for Phone Contract  | 0        | 2300    | 0          | 200                |
      | 9303035024099 | 18000         | 6000 | true                           | 0            | 900                 | 0           | 1000      | 0             | 0         | 600           | 1400                 | 2100      | 700           | 5               | 6000       | 6000            | 320              | Telkom         | Payment for Mobile Contract | 0        | 2000    | 0          | 500                |
      | 9402024800087 | 19000         | 6500 | true                           | 0            | 800                 | 0           | 900       | 0             | 0         | 700           | 1800                 | 1800      | 600           | 5               | 7600       | 7600            | 420              | Cellc          | Payment for Phone Contract  | 0        | 3300    | 0          | 800                |
      | 9707014800081 | 14000         | 5800 | true                           | 0            | 200                 | 0           | 800       | 0             | 0         | 200           | 1000                 | 1200      | 200           | 5               | 8700       | 8700            | 520              | MTN            | Payment for Mobile Contract | 0        | 1990    | 0          | 200                |
      | 9701014800084 | 14000         | 5800 | true                           | 0            | 200                 | 0           | 800       | 0             | 0         | 200           | 1000                 | 1200      | 200           | 5               | 8700       | 8700            | 520              | MTN            | Payment for Mobile Contract | 0        | 1990    | 0          | 200                |

  @regression
  @UID8761-563
  Scenario Outline: Fetch applicants expenses
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
    And path '/applications/', offerId, '/applicants/<clientId>/expense'
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

    Examples:
      | clientId      |
      | 8901230052087 |
      | 9303035024099 |
      | 9402024800087 |
      | 9707014800081 |
      | 9701014800084 |

  @regression
  @UID8761-630
  Scenario Outline: Update applicants additional details to test for <scenarioName>
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
    And print 'Executing Scenario :::  <scenarioName>'
    And path '/applications/', offerId, '/applicants/<clientId>/additionaldetails'
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
      | clientId      | hasAppliedForCreditLast60Days | creditType | applyLoanAmount | applyStatus | applyBank | hasOtherLoanApplications | loanAmount | purchasePrice | loanStatus | loanBank | hasSignedSurety | suretyCreditType | suretyAmount | suretyBank | haveBeenInsolvent | insolventDate | insolventRehabDate | isCurrentlyInsolvent | insolventDetails | isDependentOtherNonApplicant | monthlyContribution | sourceOfFundsDepositAndTransfer | otherDescription | hasBenefitIncluded | benefitDetails | hasRelationshipWithSeller | relationshipDetails | scenarioName                       |
      | 8901230052087 | true                          | loan       | 1000000         | 0           | FNB       | false                    | 0          | 0             |            |          | true            |  Phone           | 2000         | FNB        | false             |               |                    | false                |                  | false                        |                     | 1                               |                  | true               | benefit1       | false                     |                     | - Has anothe loan                  |
      | 9303035024099 | false                         |            | 0               | 0           |           | false                    | 0          | 0             |            |          | true            |  Phone           | 300          | FNB        | true              | 2014-05-01    | 2014-06-01         | false                |                  | false                        |                     | 2                               |                  | true               | benefit1       | false                     |                     | - Declared Insolvent               |
      | 9402024800087 | false                         |            | 0               | 0           |           | false                    | 0          | 0             |            |          | true            |  Phone           | 400          | FNB        | false             |               |                    | false                |                  | true                         | 4000                | 3                               |                  | true               | benefit1       | false                     |                     | - is Dependent Other Non Applicant |
      | 9707014800081 | false                         |            | 0               | 0           |           | false                    | 0          | 0             |            |          | false           |                  | 0            |            | false             |               |                    | false                |                  | true                         | 4000                | 4                               |                  | true               | benefit1       | false                     |                     | - Has relationship with seller     |
      | 9701014800084 | false                         |            | 0               | 0           |           | false                    | 0          | 0             |            |          | false           |                  | 0            |            | false             |               |                    | false                |                  | true                         | 4000                | 4                               |                  | true               | benefit1       | false                     |                     | - Has relationship with seller     |

  @regression
  @UID8761-630
  Scenario Outline: Fetch applicants additional details
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
    And path '/applications/', offerId, '/applicants/<clientId>/additionaldetails'
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

    Examples:
      | clientId      |
      | 8901230052087 |
      | 9303035024099 |
      | 9402024800087 |
      | 9707014800081 |
      | 9701014800084 |

  @regression
  @UID8761-CoApplicant-Insurace
  Scenario Outline: Update applicants insurance
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
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
  @UID8761-CoApplicant-Insurace
  Scenario: Fetch applicants insurance
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
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
  @UID8761--CoApplicant-Submit-Application
  Scenario Outline: Submit application for scenario <scenarioName>
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
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
    Given def offerId = read('TokenStore/OfferId_CoApplication.txt')
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