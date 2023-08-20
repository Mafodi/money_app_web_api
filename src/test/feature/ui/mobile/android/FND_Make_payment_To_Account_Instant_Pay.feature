
#Author: your.email@your.domain.com

Feature: 	Make instant payment to Account

@CustomermakesinstantPaymentToAccount
Scenario Outline: Make instant payment to new bank account
    Given PEM_AcctUser_I accesses Payments screen
    When PEM_AcctUser_I navigates to Single Payments screen
    And PEM_AcctUser_I selects recipients icon
    And PEM_AcctUser_I should be able to search "<recipientsname>" and select
    Then PEM_AcctUser_I Clicking on next should take me to next screen
    And PEM_AcctUser_I should be able to make payment successfully

Examples:
|recipientsname|
|instantpay	 |