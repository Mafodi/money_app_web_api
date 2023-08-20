
#Author: your.email@your.domain.com

#Business rule1 :  I should be able to save the beneficiary to the Beneficiary list
#Business rule2 :  I should be allowed to save beneficiaries with same names but different mobile nos


Feature: 	Make payment to Newbeneficiary Mobile No
@PaymentToMobile
Scenario Outline: Make payment to Newbeneficiary Mobile No. beneficiary
Given 	PEM_User accesses Ned app and landing pg displayed
When 	PEM_User clicks on get started button
And 	PEM_User captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_User clicks Login button
And 	PEM_User waits for login approval
And 	PEM_Dashboard page should display
And 	PEM_I Click on Transact and verify sub-menu option of Payment
When 	PEM_Click on Payment
Then 	PEM_Verify the Payment screen is opened
And   PEM_User should be able to select pay to mobile number
And   PEM_User should be able to enter the "<recipientsname>"
And   PEM_User should be able to enter the recipients "<mobilenumber>"
And 	PEM_User should not see any bank related fields here banks, branch code or account no
Then  PEM_User Clicking on next should take me to next screen
Then  PEM_User should be able to save the "<recipientsname>" to the Beneficiary list

Examples:
|NedID      |Password|recipientsname|mobilenumber|
|greenbank812|Testing2!|Beneificiary4	|0700000009|

@PaymentToMobileOnceoff
Scenario Outline: Make payment to Newbeneficiary Mobile No onceoff. beneficiary
Given 	PEM_User accesses Ned app and landing pg displayed
When 	PEM_User clicks on get started button
And 	PEM_User captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_User clicks Login button
And 	PEM_User waits for login approval
And 	PEM_Dashboard page should display
And 	PEM_I Click on Transact and verify sub-menu option of Payment
When 	PEM_Click on Payment
Then 	PEM_Verify the Payment screen is opened
And   PEM_User should be able to select pay to mobile number
And   PEM_User should be able to enter the "<recipientsname>"
And   PEM_User should be able to enter the recipients "<mobilenumber>"
And 	PEM_User should not see any bank related fields here banks, branch code or account no
Then User Selects Save tolle to make onceoff
Then  PEM_User Clicking on next should take me to next screen
Then  PEM_User should be able to save the "<recipientsname>" to the Beneficiary list

Examples:
|NedID      |Password|recipientsname|mobilenumber|
|greenbank812|Testing2!|onceoffbenifmob	|0877643323|

@PaymentToMobileexistingbeneficiary
Scenario Outline: Make payment to Newbeneficiary Mobile No existing beneficiary
Given 	PEM_User accesses Ned app and landing pg displayed
When 	PEM_User clicks on get started button
And 	PEM_User captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_User clicks Login button
And 	PEM_User waits for login approval
And 	PEM_Dashboard page should display
And 	PEM_I Click on Transact and verify sub-menu option of Payment
When 	PEM_Click on Payment
Then 	PEM_Verify the Payment screen is opened
And   PEM_User should be able to select pay to mobile number
And PEM_User selects existing benificiary "<recipientsname>"
And 	PEM_User should not see any bank related fields here banks, branch code or account no
Then  PEM_User Clicking on next should take me to next screen
Then  PEM_User should be able to save the "<recipientsname>" to the Beneficiary list

Examples:
|NedID      |Password|recipientsname|mobilenumber|
|greenbank812|Testing1!|DEFLTest	|0700000009|







@PaymentMobileedgecases
Scenario Outline: Make payment to existing Mobile No. beneficiary
Given 	PEM_User accesses Ned app and landing pg displayed
When 	PEM_User clicks on get started button
And 	PEM_User captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_User clicks Login button
And 	PEM_User waits for login approval
And 	PEM_Dashboard page should display
And 	PEM_I Click on Transact and verify sub-menu option of Payment
When 	PEM_Click on Payment
Then 	PEM_Verify the Payment screen is opened
And   PEM_User should be able to select pay to mobile number
And   PEM_User should be able to enter the "<recipientsname>"
And   PEM_User should be able to enter the recipients "<mobilenumber>"
And 	PEM_User should not see any bank related fields here banks, branch code or account no
Then  PEM_User Clicking on next should take me to next screen
Then  PEM_User should be able to save the "<recipientsname>" to the Beneficiary list

Examples:
|NedID      |Password|recipientsname|mobilenumber|
|greenank162|Testing1|edge	        |078841552659|
|greenank162|Testing1|DEFLTesting8	|*/07846565|
