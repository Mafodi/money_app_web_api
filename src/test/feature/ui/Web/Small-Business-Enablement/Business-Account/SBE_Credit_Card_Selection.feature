@BusinessAccountRegression
  Feature: USBE - 524 Credit Card Selection
    As a user
    I want to be able to apply for a credit card
    so that I can have financial backup for my small business

  Background:

    @BusinessAccountWithCreditCard
    Scenario Outline: Option For Credit Card Selected
      Given I have logged in successfully on business accounts
      And   I am now on the Credit Card Details Screen
      When  I select the Nedbank Small Business Credit Card on the Credit card options page
      And   I select to give consent to nedbank for a credit check
      And   I click next on the consent page
      And   I enter the monthly gross income <gross> and the monthly net income <net>
      And   I enter the monthly living expenses <expenses> and the monthly debt payments <debt>
      And   I click next on the credit card qualification page
      Then  I am shown the result of the check

      Examples:
        | gross | net   | expenses | debt |
        | 16500 | 13000 | 1000     | 500  |

