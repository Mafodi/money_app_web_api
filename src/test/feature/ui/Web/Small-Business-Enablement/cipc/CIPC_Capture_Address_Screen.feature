@CIPCRegression
  Feature: USBE-519 CIPC - Capture Address Screen
    As a user
    I want to confirm my business address
    So that I do not have to manually capture my business address again if it is the same as my personal home address

  Background:

    @BusinessAndPostalTheSame
    Scenario: Indicate That Business & Postal Address Is Same As Home Address
      Given I have logged in successfully and I am on the business address section
      When  I select yes to indicate that the business address is the same as the home address
      And   I also select yes to indicate that the postal address is the same as the business address
      And   I click next on business address section
      Then  I am now moved to obtain a B-BBEE certificate Section

    @DifferentBusinessAddress
    Scenario Outline: Capture A Different Business Address Using Google Search
      Given I have logged in successfully and I am on the business address section
      When  I select no to indicate that the business address is not the same as the home address
      And   I enter the business address in the field <business_address> and select a suggested address returned from my search
      And   I also select yes to indicate that the postal address is the same as the business address
      And   I click next on business address section
      Then  I am now moved to obtain a B-BBEE certificate Section
      Examples:
        | business_address |
        | 105 West Sandown |

    @DifferentPostalAddress
    Scenario Outline: Capture A Different Postal Address Using Google Search
      Given I have logged in successfully and I am on the business address section
      When  I select yes to indicate that the business address is the same as the home address
      And   I also select no to indicate that the postal address is not the same as the business address
      And   I enter postal address in the field <postal_address> and select a suggested address returned from my search
      And   I click next on business address section
      Then  I am now moved to obtain a B-BBEE certificate Section
      Examples:
        | postal_address |
        | 38 Lemonwood   |
