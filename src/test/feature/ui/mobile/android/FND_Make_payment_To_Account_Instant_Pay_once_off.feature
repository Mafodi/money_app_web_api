
#Author: your.email@your.domain.com

Feature: 	Make instant payment to Account onceoff

@CustomermakesinstantPaymentToAccountonceoff
Scenario Outline: Make instant payment to new bank account once off
Given PEM_AcctUser_I_onceoff accesses Ned app and landing pg displayed
When PEM_AcctUser_I_onceoff clicks on get started button
And 	PEM_AcctUser_I_onceoff captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_AcctUser_I_onceoff clicks Login button
And 	PEM_AcctUser_I_onceoff waits for login approval
And 	PEM_AcctUser_I_onceoff Dashboard page should display
And 	PEM_AcctUser_I_onceoff click on Transact and verify sub-menu option of Payment
When PEM_AcctUser_I_onceoff click on Payment
Then PEM_AcctUser_I_onceoff the Payment screen is opened
And PEM_AcctUser_I_onceoff should validate Pay to bank selected by default
And PEM_AcctUser_I_onceoff should be able to enter the "<beneficiaryname>"
And PEM_AcctUser_I_onceoff should be able to select one of the "<listedbanks>" to which User want to transfer
And PEM_AcctUser_I_onceoff should be able to enter the acct  "<Accountnumber>"
Then PEM_AcctUser_I_onceoff Selects Save tolle to make onceoff
Then PEM_AcctUser_I_onceoff clicking on next should take me to next screen  and select intant payment button
Then PEM_AcctUser_I_onceoff should be able to save the "<beneficiaryname>" to the Beneficiary list

Examples:
|NedID      |Password|beneficiaryname|listedbanks|Accountnumber|
|greenbank754|Testing2!|instantpay	 |ABSA BANK  |4067152608|
#|greenbank830|Testing1!|instantpay	 |ABSA BANK  |4067152608|