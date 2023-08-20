@AndroidRegression @FND @FND_Payments
Feature: 	Make payment to credit card Account from nedbank savings account
@Paymentfromsavingstocreditcardnedbank
Scenario Outline: Make payment to credit card Account from nedbank savings account
Given PEM_User_CCR accesses Payments screen
When PEM_User_CCR navigates to Single Payments screen
And PEM_Click_CCR selects recipients icon
And PEM_Click_CCR should be able to search "<recipientsname>" and select
Then PEM_Click_CCR Clicking on next should take me to next screen
And PEM_Click_CCR should be able to make payment successfully

Examples:
|recipientsname|
|NedbankCreditCard|

