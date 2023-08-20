@BusinessAccountRegression
  Feature: Call me back trigger points
    Description:
    As a user
    I want to be redirected to call me back form

  Background: When user select option that trigger call me back, they need to be redirected accordingly

    @TaxObligationSelectedAsYes
    Scenario Outline: Select "Yes" on tax obligation
      When User selects BUSINESS BUNDLE One option
      And  User selects Single director/shareholder or one member
      And  User agrees to Business Bundle One terms and conditions
      And  User clicks on Business Bundle Next button
      And  User enters "<ID_number>" ID number to check if user have nedbank ID
      And  User click Next after providing ID number
      And  User captures Nedbank ID "<Username>" username and "<Password>" password on application fast track screen
      Then User clicks on Application fast track Login button
      When User selects "<Tax_Obligation>" Yes or No on tax obligations outside South Africa
      And  User clicks "<Correct_Details>" Yes or No for directorship details confirmation
      And  User clicks on Director's personal details screen Next button

      Examples:
        | ID_number     | Username  | Password     | Tax_Obligation | Correct_Details |
        | 7407215237082 | daniel123 | Password123! | Yes            | Yes             |

    @EditDirectorDetails
    Scenario Outline: Select "No" for director details being correct
      When User selects BUSINESS BUNDLE One option
      And  User selects Single director/shareholder or one member
      And  User agrees to Business Bundle One terms and conditions
      And  User clicks on Business Bundle Next button
      And  User enters "<ID_number>" ID number to check if user have nedbank ID
      And  User click Next after providing ID number
      And  User captures Nedbank ID "<Username>" username and "<Password>" password on application fast track screen
      Then User clicks on Application fast track Login button
      When User selects "<Tax_Obligation>" Yes or No on tax obligations outside South Africa
      And  User clicks "<Correct_Details>" Yes or No for directorship details confirmation

      Examples:
        | ID_number     | Username  | Password     | Tax_Obligation | Correct_Details |
        | 7407215237082 | daniel123 | Password123! | No             | No              |

    @HighRiskEconomicSector
    Scenario Outline: User Selected High Risk Economic Sector
      When User selects BUSINESS PAY AS YOU USE option
      And  User selects Single director/shareholder or one member
      And  User agrees to Business Bundle One terms and conditions
      And  User clicks on Business Bundle Next button
      And  User enters "<ID_number>" ID number to check if user have nedbank ID
      And  User click Next after providing ID number
      And  User captures Nedbank ID "<Username>" username and "<Password>" password on application fast track screen
      Then User clicks on Application fast track Login button
      When User selects "<Tax_Obligation>" Yes or No on tax obligations outside South Africa
      And  User clicks "<Correct_Details>" Yes or No for directorship details confirmation
      And  User clicks on Director's personal details screen Next button
      When User selects "Sole Proprietor" company option
      And  User selects Yes for option of using personal name as business trading name
      Then User clicks on Company details Next button
      And  User captures all required business details with "<Economic_Sector>" high risk economic sector

      Examples:
        | ID_number     | Username  | Password     | Tax_Obligation | Correct_Details | Economic_Sector              |
        | 7407215237082 | daniel123 | Password123! | No             | Yes             | Adult Entertainment Industry |

    @AdministrationType
    Scenario Outline: User Select that the business is under one of the administration
      When User selects BUSINESS PAY AS YOU USE option
      And  User selects Single director/shareholder or one member
      And  User agrees to Business Bundle One terms and conditions
      And  User clicks on Business Bundle Next button
      And  User enters "<ID_number>" ID number to check if user have nedbank ID
      And  User click Next after providing ID number
      And  User captures Nedbank ID "<Username>" username and "<Password>" password on application fast track screen
      Then User clicks on Application fast track Login button
      When User selects "<Tax_Obligation>" Yes or No on tax obligations outside South Africa
      And  User clicks "<Correct_Details>" Yes or No for directorship details confirmation
      And  User clicks on Director's personal details screen Next button
      When User selects "Sole Proprietor" company option
      And  User selects Yes for option of using personal name as business trading name
      Then User clicks on Company details Next button
      And  User captures all required business details with "<Admin_Type>" administration type

      Examples:
        | ID_number     | Username  | Password     | Tax_Obligation | Correct_Details | Admin_Type     |
        | 7407215237082 | daniel123 | Password123! | No             | Yes             | Sequestration  |

    @HighRiskCountry
    Scenario Outline: User Select high risk country as country of operation
      When User selects BUSINESS PAY AS YOU USE option
      And  User selects Single director/shareholder or one member
      And  User agrees to Business Bundle One terms and conditions
      And  User clicks on Business Bundle Next button
      And  User enters "<ID_number>" ID number to check if user have nedbank ID
      And  User click Next after providing ID number
      And  User captures Nedbank ID "<Username>" username and "<Password>" password on application fast track screen
      Then User clicks on Application fast track Login button
      When User selects "<Tax_Obligation>" Yes or No on tax obligations outside South Africa
      And  User clicks "<Correct_Details>" Yes or No for directorship details confirmation
      And  User clicks on Director's personal details screen Next button
      When User selects "Sole Proprietor" company option
      And  User selects Yes for option of using personal name as business trading name
      Then User clicks on Company details Next button
      And  User captures all required business details with "<Country_Operation>" high risk country of operation

      Examples:
        | ID_number     | Username  | Password     | Tax_Obligation | Correct_Details | Country_Operation   |
        | 7407215237082 | daniel123 | Password123! | No             | Yes             | Yemen               |