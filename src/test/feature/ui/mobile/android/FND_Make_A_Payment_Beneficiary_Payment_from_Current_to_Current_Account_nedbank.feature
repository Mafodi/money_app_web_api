@AndroidRegression @FND @FND_Payments
Feature:Make payment to Nedbank Current Account
@FND_Paymentfromcurrenttocurrentaccountnedbank
Scenario Outline: Make payment to existing nedbank Current account beneficiary
Given PEM_User_CA is on the Payment screen
When PEM_Verify_CA navigates to Single Payment screen
And PEM_Click_CA selects recipients icon
And PEM_Click_CA should be able to search "<recipientsname>" and select
Then PEM_Click_CA Clicking on next should take me to next screen
And PEM_Click_CA should be able to make payment successfully

Examples:
|recipientsname|
|NedbankCurrentaccount|

