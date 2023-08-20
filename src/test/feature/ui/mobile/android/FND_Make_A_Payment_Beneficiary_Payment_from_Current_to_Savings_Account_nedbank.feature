@AndroidRegression @FND @FND_Payments
Feature:Make payment to Nedbank Savings Account
@Paymentfromcurrenttosavingsaccountnedbank
Scenario Outline: Make payment to existing nedbank savings account beneficiary
Given PEM_User_SA accesses Payments screen
When PEM_User_SA navigates to Single payment screen
And PEM_Click_SA selects recipients icon
And PEM_Click_SA should be able to search "<recipientsname>" and select
Then PEM_Click_SA Clicking on next should take me to next screen
And PEM_Click_SA should be able to make payment successfully

Examples:
|recipientsname|
|NedbankSavingsaccount|

