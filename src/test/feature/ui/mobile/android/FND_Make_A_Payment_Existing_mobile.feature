
#Author: your.email@your.domain.com
# preconditions : ensure that a recipient by name mobileexisting is available on greenbank725

Feature: 	Make payment to Eisting Mobile No
@PaymentToexistingMobile
Scenario Outline: Make payment to existing Mobile No. beneficiary
Given PEM_UserE accesses Ned app and landing pg displayed
When PEM_UserE clicks on get started button
And 	PEM_UserE captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_UserE clicks Login button
And 	PEM_UserE waits for login approval
And 	PEM_Dashboard_E page should display
And 	PEM_I_E Click on Transact and verify sub-menu option of Payment
When PEM_Click_E on Payment
Then PEM_Verify_E the Payment screen is opened
And PEM_UserE should be able to select pay to mobile number
And PEM_UserE selects recipients icon
And PEM_UserE should be able to search "<recipientsname>" and select 
And 	PEM_UserE should not see any bank related fields here banks, branch code or account no
Then PEM_UserE Clicking on next should take me to next screen
Then PEM_UserE should be able to make payment successfully

Examples:
|NedID      |Password|recipientsname|
|greenbank754|Testing2!|Mobileexisting	|

