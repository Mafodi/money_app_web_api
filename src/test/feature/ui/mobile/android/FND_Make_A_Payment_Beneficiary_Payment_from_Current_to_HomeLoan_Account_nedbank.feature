@AndroidRegression @FND @FND_Payments
Feature:Make payment to Home loan Account
@Paymentfromcurrenttohomeloansaccountnedbank
Scenario Outline: Make payment to existing nedbank home loan account beneficiary
Given PEM_User_HL is on the Payment screen
When PEM_Verify_HL navigates to Single Payment screen
And PEM_Click_HL selects recipients icon
And PEM_Click_HL should be able to search "<recipientsname>" and select
Then PEM_Click_HL Clicking on next should take me to next screen
And PEM_Click_HL should be able to make payment successfully

Examples:
|recipientsname|
|Nedbankhomeloanaccount|

