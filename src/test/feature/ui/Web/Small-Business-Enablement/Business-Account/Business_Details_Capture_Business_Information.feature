@BusinessAccountRegression
  Feature: Card Delivery Preference: Branch Delivery
    Description:
    As a user
    I want to capture information regarding my business
    So that I can open a business account for my company


  Background:

    @FinancialYearEndFieldForSoleProprietor
    Scenario Outline: Financial Year End Field For SoleProprietor
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
      When User selects "Sole Proprietor" company option
      And  User selects Yes for option of using personal name as business trading name
      And  User enter desired trading name
      Then User clicks on Company details Next button
      And  User captures "<Telephone>" Business telephone number
      And  User selects "March" Financial year end
      And  User close the browser

      Examples:
        | ID_number     | Username  | Password     | Telephone | Tax_Obligation | Correct_Details |
        | 7407215237082 | daniel123 | Password123! | 821234567 | No             | Yes             |

    @DateOfIncorporationForPTY(Ltd)
    Scenario Outline: Date of incorporation For Company Pty LTD
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
      When User selects "Private company[Pty(LTD)]" company option
      And  User captures "<Number>" Business Registration Number
      Then User clicks on Company details Next button
      And  User captures "<Telephone>" Business telephone number
      And  Company Pty LTD date of incorporation is returned
      And  User close the browser

      Examples:
        | ID_number     | Username  | Password     | Number       | Telephone | Tax_Obligation | Correct_Details  |
        | 7407215237082 | daniel123 | Password123! | 200721365423 | 821234567 | No             | Yes              |

    @DateOfIncorporationForCloseCorporation
    Scenario Outline: Date of incorporation Close Corporation
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
      When User selects "Close Corporation" company option
      And  User captures "<Number>" Business Registration Number
      Then User clicks on Company details Next button
      And  User captures "<Telephone>" Business telephone number
      And  Close Corporation date of incorporation is returned
      And  User close the browser

      Examples:
        | ID_number     | Username  | Password     | Number       | Telephone | Tax_Obligation | Correct_Details  |
        | 7407215237082 | daniel123 | Password123! | 200721365423 | 821234567 | No             | Yes              |



