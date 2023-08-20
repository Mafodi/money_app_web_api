
#Author: your.email@your.domain.com
# preconditions : ensure that a recipient by name creditcardexisting is available on greenbank725

Feature: 	Make payment to Existing credit card
@PaymentToexistingcreditcard
Scenario Outline: Make payment to existing credit card beneficiary
Given PEM_User_cc accesses Ned app and landing pg displayed
When PEM_User_cc clicks on get started button
And 	PEM_User_cc captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_User_cc clicks Login button
And 	PEM_User_cc waits for login approval
And 	PEM_Dashboard_cc page should display
And 	PEM_User_cc Click on Transact and verify sub-menu option of Payment
When PEM_Click_cc on Payment
Then PEM_Verify_cc the Payment screen is opened
And PEM_User_cc should be able to select pay to credit card
And PEM_User_cc selects recipients icon
And PEM_User_cc should be able to search "<recipientsname>" and select 
And 	PEM_User_cc should not see any bank related fields here banks, branch code or account no
Then PEM_User_cc Clicking on next should take me to next screen
Then PEM_User_cc should be able to make payment successfully

Examples:
|NedID      |Password|recipientsname|
|greenbank754|Testing2!|Creditcardexisting|

