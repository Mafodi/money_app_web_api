@BusinessAccountRegression
  Feature: Card Delivery Preference: Address Delivery
    Description:
    As a user
    I want to select my preferred method to receive the card at my address
    So that I can choose whether I want to get it delivered at my business address or not

  Background:

    @AddressCardDelivery
    Scenario Outline: Select business address as delivery address
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
      When User selects "Company(Pty(LTD))" company option
      And  User captures "<Number>" Business Registration Number
      Then User clicks on Company details Next button
      And  User captures all required business details
      And  User clicks Next button for Business Details screen
      When User clicks on Yes button for Business trading address
      And  User clicks on Yes button for Business postal address
      Then User clicks on Next button for Business Address screen
      Given User is on Configure screen
      When  User sets card limit
      And   User selects optional extras
      And   User selects a card option "<card_option>" for a business credit card
      Then  User clicks on Customize Next button
      Given User is on Card Delivery screen
      And   User selects Delivery option
      And   User selects Yes for delivery to business address
      And   User selects the preferred <location> for the private banker
      Then  User clicks on Next button for Card Delivery

      Examples:
        | ID_number     | Username     | Password      | Number       | Tax_Obligation | location              | card_option | Correct_Details |
        | 7407215237082 | sbetestuser2 | SbeMarch123!  | 200721365423 | No             | Nedbank Tembisa Plaza | no          | Yes             |




