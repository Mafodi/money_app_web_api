
#Author: your.email@your.domain.com
# preconditions : Ensure the mobile number exists on the customer profile

Feature: 	Make payment to mobile Myself
@PaymentTomobileMyself
Scenario Outline: Make payment to existing Mobile No. beneficiary
Given PEM_UserME accesses Ned app and landing pg displayed
When PEM_UserME clicks on get started button
And 	PEM_UserME captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_UserME clicks Login button
And 	PEM_UserME waits for login approval
And 	PEM_Dashboard_ME page should display
And 	PEM_I_ME Click on Transact and verify sub-menu option of Payment
When PEM_Click_ME on Payment
Then PEM_Verify_ME the Payment screen is opened
And PEM_UserME should be able to select pay to mobile number
And PEM_UserME selects recipients icon
And PEM_UserME should be able to select ME
And 	PEM_UserME should not see any bank related fields here banks, branch code or account no
Then PEM_UserME Clicking on next should take me to next screen
Then PEM_UserME should be able to make payment successfully

Examples:
|NedID      |Password|
|greenbank754|Testing2!|

