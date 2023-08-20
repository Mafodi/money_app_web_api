
#Author: your.email@your.domain.com
#Beneficiary should exists on the nedbank profile with name Bankexisting

Feature: 	Make payment to existing Account
@CustomermakesPaymentToExistsingAccount
Scenario Outline: Make payment to existing bank account
Given PEM_AcctUser_bank accesses Ned app and landing pg displayed
When PEM_AcctUser_bank clicks on get started button
And 	PEM_AcctUser_bank captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_AcctUser_bank clicks Login button
And 	PEM_AcctUser_bank waits for login approval
And 	PEM_AcctUser_bank Dashboard page should display
And 	PEM_AcctUser_bank click on Transact and verify sub-menu option of Payment
When PEM_AcctUser_bank click on Payment
Then PEM_AcctUser_bank the Payment screen is opened
And PEM_AcctUser_bank should validate Pay to bank selected by default
And PEM_AcctUser_bank selects recipients icon
And PEM_AcctUser_bank should be able to search "<recipientsname>" and select bank recipient
Then PEM_AcctUser_bank clicking on next should take me to next screen
Then PEM_AcctUser_bank should be able to make payment successfully
Examples:
|NedID      |Password|recipientsname|
|greenbank754|Testing2!|BankExisting|


