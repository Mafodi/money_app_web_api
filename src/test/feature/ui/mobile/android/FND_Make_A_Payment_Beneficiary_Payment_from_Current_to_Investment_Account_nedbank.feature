@AndroidRegression @FND @FND_Payments
Feature: 	Make payment to Nedbank Investment Account
@Paymentfromcurrenttoinvestmentaccountnedbank
Scenario Outline: Make payment to existing nedbank savings account beneficiary
Given PEM_User_IV accesses Payment screen
When PEM_User_IV navigates to Single Payment screen
And PEM_User_IV selects recipients icon
And PEM_User_IV should be able to search "<recipientsname>" and select
Then PEM_User_IV Clicking on next should take me to next screen
Then PEM_User_IV should be able to make payment successfully

Examples:
|recipientsname|
|NedbankInvestmentaccount|

