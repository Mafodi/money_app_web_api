
#Author: your.email@your.domain.com

#Business rule1 : I should be able to save the beneficiary to the Beneficiary list
#Business rule2 : Credit card number - mimimum 15 and Max 16 digits
#Business rule3 : Instant pay should not be available on Credit cards
#Business rule4 : Recurring should be disabled for credit cards, however user can put a future date to it



Feature: 	Make payment to Credit card
@PaymentToCreditcard
Scenario Outline: Make payment to Credit card
Given 	PEM_card_User accesses Ned app and landing pg displayed
When 	PEM_card_User clicks on get started button
And 	PEM_card_User captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_card_User clicks Login button
And 	PEM_card_User waits for login approval
And 	PEM_card_User Dashboard page should display
And 	PEM_card_User Click on Transact and verify sub-menu option of Payment
When 	PEM_card_User Click on Payment
Then 	PEM_card_User Verify the Payment screen is opened
And   PEM_card_User should be able to enter "<recipentname>"
And   PEM_card_User should be able to select pay to Credit card
And   PEM_card_User should be able to enter the "<Cardnumber>"
And 	PEM_card_User should not see any bank related fields here banks, branch code or account no
Then  PEM_card_User Clicking on next should take me to next screen
Then  PEM_card_User should be able to save the "<Cardnumber>" to the Beneficiary list

Examples:
|NedID      |Password|Cardnumber|recipentname|
|greenbank812|Testing2!|377121700029464|DEFLTestingcardnew|
#|greenbank830|Testing1!|4787692036920044|DEFLTestingcardnew|



