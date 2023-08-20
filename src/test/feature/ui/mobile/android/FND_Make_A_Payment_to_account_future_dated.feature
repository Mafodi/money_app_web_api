
#Author: your.email@your.domain.com

Feature: 	Make payment to Account monthly and weekly
@Paymentscheduleweeklyandmonthly
Scenario Outline: Make payment to new bank account monthly and weekly
Given PEM_AcctUser_schedule accesses Ned app and landing pg displayed
When PEM_AcctUser_schedule clicks on get started button
And 	PEM_AcctUser_schedule captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_AcctUser_schedule clicks Login button
And 	PEM_AcctUser_schedule waits for login approval
And 	PEM_AcctUser_schedule Dashboard page should display
And 	PEM_AcctUser_schedule click on Transact and verify sub-menu option of Payment
When PEM_AcctUser_schedule click on Payment
Then PEM_AcctUser_schedule the Payment screen is opened
And PEM_AcctUser_schedule should validate Pay to bank selected by default
And PEM_AcctUser_schedule should be able to enter the "<beneficiaryname>"
And PEM_AcctUser_schedule should be able to select one of the "<listedbanks>" to which User want to transfer
And PEM_AcctUser_schedulee should be able to enter the  "<Accountnumber>"
Then PEM_AcctUser_schedule clicking on next should take me to next screen and captures "<Month>","<day>","<year>" and selects  "<frequency>"
Then PEM_AcctUser_schedule should be able to save the "<beneficiaryname>" to the Beneficiary list

Examples:
|NedID      |Password|beneficiaryname|listedbanks|Accountnumber|Month|day|year  |frequency|
|greenbank754|Testing2!|BankFutureDatedW|ABSA BANK  |4067152608   |June  |28 |2019  |Weekly|
|greenbank754|Testing2!|BankFutureDatedM|ABSA BANK  |4067152608   |July  |28 |2019  |Monthly|
#|greenbank830|Testing1!|BankFutureDatedW|ABSA BANK  |4067152608   |March  |28 |2019  |Weekly|
#|greenbank830|Testing1!|BankFutureDatedM|ABSA BANK  |4067152608   |April  |28 |2019  |Monthly|
