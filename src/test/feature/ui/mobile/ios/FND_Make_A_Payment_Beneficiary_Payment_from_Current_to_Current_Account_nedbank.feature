@iOSRegression  @FNDiOS @FNDiOSPayments
Feature:Make payment to Nedbank Current Account
@FNDiOS_Paymentfromcurrenttocurrentaccountnedbank
Scenario Outline: Make payment to existing nedbank Current account beneficiary
Given PEM_User_CA is on the Payment screen
When PEM_Verify_CA navigates to Single Payment screen ios app
And PEM_Click_CA selects recipients icon ios app
And PEM_Click_CA should be able to search "<recipientsname>" and select ios app
Then PEM_Click_CA Clicking on next should take me to next screen ios app
And PEM_Click_CA should be able to make payment successfully ios app

Examples:
|recipientsname|
|NedbankCurrentaccount|


