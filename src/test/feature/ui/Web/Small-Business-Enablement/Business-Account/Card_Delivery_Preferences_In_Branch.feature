@BusinessAccountRegression
  Feature: Card Delivery Preference: Branch Delivery
    As a user
    I want to select my preferred method to receive the card at my branch
    So that I can collect it from the particular branch that suits me

  Background:

    @BranchCardDelivery
    Scenario Outline:  Select branch as delivery option
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
      And  User selects No for option of using personal name as business trading name
      Then User clicks on Company details Next button
      And  User captures all required business details
      And  User clicks Next button for Business Details screen
      When User clicks on Yes button for Business trading address
      And  User clicks on Yes button for Business postal address
      Then User clicks on Next button for Business Address screen
      Given User is on Setting up your business account screen
      When  User sets card limit
      And   User selects optional extras
      And   User selects a card option "<card_option>" for a business credit card
      Then  User clicks on Customize Next button
      Given User is on Card Delivery screen
      When  User selects Collection option
      And   User captures "<Location>" location of collection
      And   User selects the option <Option> for the personal banker and only sets the branch <Branch> if option is No
      Then  User clicks on Next button for Card Delivery


      Examples:
        | ID_number     | Username     | Password      | Tax_Obligation | Location        | Branch                | Option | card_option | Correct_Details |
        | 7407215237082 | sbetestuser2 | SbeMarch123!  |        No      | Nedbank Sandown | Nedbank Tembisa Plaza | yes    | no          | Yes             |

