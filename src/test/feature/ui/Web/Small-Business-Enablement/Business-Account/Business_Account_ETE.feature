@BusinessAccountRegression
  Feature: End to End Test For Business Account
    Description:
    As a user
    I want to be able to fill in all the required information
    so that I can open a business account

  Background:

    @BusinessAccount_ETE
    Scenario: Open A Business Account (Single Director - Sole Proprietor)
      Given I have logged in successfully on business accounts
      When  I verify that all my personal details are correct and click next
      And   I select my business type
      And   I fill in all my business details
      And   I select and indicate my business trading address and business postal address are the same
      And   I verify and select next on the person in charge of banking relationships
      And   I set my card withdrawal limit and select optional extras on my business accounts
      And   I select how to receive my card and the location of my dedicated banker
      And   I select options on the declaration and terms and conditions
      And   I select how the bank should get in touch with me
      And   I click No Thanks on pop-up window
      Then  I am now shown a message that the application is done
