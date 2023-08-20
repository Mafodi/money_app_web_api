@iOSRegression @FNDiOS @FNDiOSPayments
Feature: 	Make payment to credit card Account from nedbank savings account
@FNDiOS_Paymentfromsavingstocreditcardnedbank
Scenario Outline: Make payment to credit card Account from nedbank savings account
Given PEM_User_CCR accesses Payments screen ios app
When PEM_User_CCR navigates to Single Payments screen ios app
And PEM_Click_CCR selects recipients icon ios app
And PEM_Click_CCR should be able to search "<recipientsname>" and select ios app
Then PEM_Click_CCR Clicking on next should take me to next screen ios app
And PEM_Click_CCR should be able to make payment successfully ios app

Examples:
|recipientsname|
|NedbankCreditCard|

