
#Author: your.email@your.domain.com

Feature: 	Make a future dated payment from savings to credit card
@futuredatedpaymentfromsavingsacctocreditcard
Scenario Outline: Make a future dated payment from savings to credit card
Given FD_User_pyt_SA accesses Ned app and landing pg displayed
When FD_User_pyt_SA clicks on get started button
And FD_User_pyt_SA captures NedbankID "<NedID>" and password "<Password>"
And FD_User_pyt_SA clicks Login button
And FD_User_pyt_SA waits for login approval
And FD_User_pyt_SA Dashboard page should display
And FD_User_pyt_SA click on Transact and verify sub-menu option of Payment
When FD_User_pyt_SA click on Payment
Then FD_User_pyt_SA the Payment screen is opened
And FD_User_pyt_SA should validate Pay to bank selected by default
And FD_User_pyt_SA should be able to enter the "<beneficiaryname>"
#And PEM_AcctUser_future should be able to select one of the "<listedbanks>" to which User want to transfer
And FD_User_pyt_SA should be able to enters the "<Accountnumber>"
Then FD_User_pyt_SA clicking on next should take me to next screen and captures "<Month>","<day>","<year>"
Then FD_User_pyt_SA should be able to save the "<beneficiaryname>" to the Beneficiary list

Examples:
|NedID       |Password|beneficiaryname          |Accountnumber     |Month  |day|year|
|greenbank754|Testing2!|BankFutureDatecreditcard|377121700029464   |July   |28 |2019|
#|greenbank830|Testing1!|BankFutureDate|4067152608   |March  |28 |2019|


