@BusinessAccountRegression
  Feature: Business Account Customization
    Description:
    As a user
    I want to be able to customize my product bundle
    So that I can ensure that I get a product that is 100% tailored for my business

  Background:

    @SoleProprietorBusinessAccountCustomization
    Scenario Outline: Sole Proprietor Customize Business Account
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
      And  User enter desired trading name
      Then User clicks on Company details Next button
      And  User captures all required business details
      And  User clicks Next button for Business Details screen
      When User clicks on Yes button for Business physical address
      And  User clicks on Yes button for Postal address
      Then User clicks on Next button for Business Address screen
      Given User is on Configure screen
      When  User sets card limit
      And   User selects optional extras
      Then  User clicks on Customize Next button
      And   User close the browser

      Examples:
        | ID_number     |Username   |Password      | Tax_Obligation | Correct_Details  |
        | 7407215237082 |daniel123  |Password123!  |       No       | Yes              |


    @CloseCorporationBusinessAccountCustomization
    Scenario Outline: Close Corporation Customize Business Account
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
      When User selects "Close Corporation" company option
      And  User captures "<Number>" Business Registration Number
      Then User clicks on Company details Next button
      And  User captures all required business details
      And  User clicks Next button for Business Details screen
      When User clicks on Yes button for Business physical address
      And  User clicks on Yes button for Postal address
      Then User clicks on Next button for Business Address screen
      Given User is on Configure screen
      When  User sets card limit
      And   User selects optional extras
      Then  User clicks on Customize Next button
      And   User close the browser

      Examples:
        | ID_number     |Username   |Password      |Number       | Tax_Obligation   | Correct_Details |
        | 7407215237082 |daniel123  |Password123!  |200721365423 | No               | Yes             |

    @Company(Pty(LTD))BusinessAccountCustomization
    Scenario Outline: Company(Pty(LTD)) Customize Business Account
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
      When User selects "Private company[Pty(LTD)]" company option
      And  User captures "<Number>" Business Registration Number
      Then User clicks on Company details Next button
      And  User captures all required business details
      And  User clicks Next button for Business Details screen
      When User clicks on Yes button for Business physical address
      And  User clicks on Yes button for Postal address
      Then User clicks on Next button for Business Address screen
      Given User is on Configure screen
      When  User sets card limit
      And   User selects optional extras
      Then  User clicks on Customize Next button
      And   User close the browser

      Examples:
        | ID_number     |Username   |Password      |Number       | Tax_Obligation  | Correct_Details  |
        | 7407215237082 |daniel123  |Password123!  |200721365423 |      No         | Yes              |
