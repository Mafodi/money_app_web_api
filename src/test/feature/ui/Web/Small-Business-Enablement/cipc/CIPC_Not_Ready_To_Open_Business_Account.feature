@CIPCRegression
  Feature: 458 - CIPC - Not Ready To Open Business Account
    As a user
    I want to just register to CIPC and not open a business bank account
    so that I will have the privilege to open a bank account at later stage

  Background:


    @NotReadyToOpenAccount
    Scenario Outline: User Clicks Next On Bank Account Opening
      Given I have logged in successfully
      And   I am now on the business accounts page
      When  I select a <date> when i would like to open an account
      And   I click next on business accounts section on CIPC
      Then  I will be taken to the terms and conditions section

      Examples:
        | date    |
        | 1 Month |

    @SkipBusinessAccountOpening
    Scenario: User Clicks Skip On Bank Account Opening
      Given I have logged in successfully
      And   I am now on the business accounts page
      When  I click skip on business accounts section on CIPC
      Then  I will be taken to the terms and conditions section
