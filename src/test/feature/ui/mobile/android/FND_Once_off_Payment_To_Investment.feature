
#Author: your.email@your.domain.com

Feature: Make once off payment to Investment
@onceoffpaymentoinvestment
Scenario Outline:  Make once off payment to Investment
Given PEM_inv_onceoff accesses Ned app and landing pg displayed
When PEM_inv_onceoff clicks on get started button
And PEM_inv_onceoff captures NedbankID "<NedID>" and password "<Password>"
And PEM_inv_onceoff clicks Login button
And PEM_inv_onceoff waits for login approval
And PEM_inv_onceoff Dashboard page should display
And PEM_inv_onceoff click on Transact and verify sub-menu option of Payment
When PEM_inv_onceoff click on Payment
Then PEM_inv_onceoff the Payment screen is opened
And PEM_inv_onceoff should validate Pay to bank selected by default
And PEM_inv_onceoff should be able to enter the "<beneficiaryname>"
And PEM_inv_onceoff should be able to select one of the "<listedbanks>" to which User want to transfer
And PEM_inv_onceoff should be able to enter the "<listedbanks>", "<AccountType>" and "<Accountnumber>"
Then PEM_inv_onceoff captures "<Amount>" amount and by clicking on next should take me to next screen
Then PEM_inv_onceoff should be able to save the "<beneficiaryname>" to the Beneficiary list

Examples:
|NedID       |Password  |beneficiaryname |listedbanks|Accountnumber  |AccountType    |Amount|
|greenbank830|Testing1! |Nedbankinvestment|NEDBANK    |560441759998   |Investment Account    |100.00|


#Note that Account type is applicable only for Nedbank
  #account types are
    #Current Account, Savings Account, Investment Account, Home Loan Account, Personal Loan Account
    #please pass the correct account type in the request

