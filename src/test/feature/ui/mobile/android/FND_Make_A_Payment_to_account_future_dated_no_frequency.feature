
#Author: your.email@your.domain.com

Feature: 	Make payment to Account with future dates with no frequency
@Paymentmakeafuturedateswithnofreqeuncy
Scenario Outline: Make payment to Account with future dates with no frequency
Given PEM_AcctUser_future accesses Ned app and landing pg displayed
When PEM_AcctUser_future clicks on get started button
And 	PEM_AcctUser_future captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_AcctUser_future clicks Login button
And 	PEM_AcctUser_future waits for login approval
And 	PEM_AcctUser_future Dashboard page should display
And 	PEM_AcctUser_future click on Transact and verify sub-menu option of Payment
When PEM_AcctUser_future click on Payment
Then PEM_AcctUser_future the Payment screen is opened
And PEM_AcctUser_future should validate Pay to bank selected by default
And PEM_AcctUser_future should be able to enter the "<beneficiaryname>"
And PEM_AcctUser_future should be able to select one of the "<listedbanks>" to which User want to transfer
And PEM_AcctUser_futuree should be able to enter the  "<Accountnumber>"
Then PEM_AcctUser_future clicking on next should take me to next screen and captures "<Month>","<day>","<year>" 
Then PEM_AcctUser_future should be able to save the "<beneficiaryname>" to the Beneficiary list

Examples:
|NedID       |Password|beneficiaryname   |listedbanks   |Accountnumber|Month  |day|year|
|greenbank754|Testing2!|BankFutureDate |ABSA BANK      |4067152608   |June  |28 |2019|
#|greenbank830|Testing1!|BankFutureDate |ABSA BANK      |4067152608   |March  |28 |2019|


