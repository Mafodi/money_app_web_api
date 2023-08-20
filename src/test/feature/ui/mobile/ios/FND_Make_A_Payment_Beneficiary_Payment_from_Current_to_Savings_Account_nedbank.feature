@iOSRegression @FNDiOS @FNDiOSPayments
Feature:Make payment to Nedbank Savings Account
@FNDiOS_Paymentfromcurrenttosavingsaccountnedbank
Scenario Outline: Make payment to existing nedbank savings account beneficiary
Given PEM_User_SA accesses Payments screen ios app
When PEM_User_SA navigates to Single payment screen ios app
And PEM_Click_SA selects recipients icon ios app
And PEM_Click_SA should be able to search "<recipientsname>" and select ios app
Then PEM_Click_SA Clicking on next should take me to next screen ios app
And PEM_Click_SA should be able to make payment successfully ios app

Examples:
|recipientsname|
|NedbankSavingsaccount|

