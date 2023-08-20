@iOSRegression @FNDiOS @FNDiOSPayments
Feature: 	Make payment to Nedbank Investment Account
@FNDiOS_Paymentfromcurrenttoinvestmentaccountnedbank
Scenario Outline: Make payment to existing nedbank investment account beneficiary
Given PEM_User_IV accesses Payment screen ios app
When PEM_User_IV navigates to Single Payment screen ios app
And PEM_User_IV selects recipients icon ios app
And PEM_User_IV should be able to search "<recipientsname>" and select ios app
Then PEM_User_IV Clicking on next should take me to next screen ios app
Then PEM_User_IV should be able to make payment successfully ios app

Examples:
|recipientsname|
|NedbankInvestmentaccount|

