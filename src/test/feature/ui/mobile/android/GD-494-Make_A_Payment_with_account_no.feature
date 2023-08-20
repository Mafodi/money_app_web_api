
#Author: your.email@your.domain.com

Feature: 	Make payment to Account
@CustomermakesPaymentToAccount
Scenario Outline: Make payment to new bank account
Given PEM_AcctUser accesses Ned app and landing pg displayed
When 	PEM_Acct_User clicks on get started button
And 	PEM_AcctUser captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_AcctUser clicks Login button
And 	PEM_AcctUser waits for login approval
And 	PEM_AcctUser Dashboard page should display
And 	PEM_AcctUser click on Transact and verify sub-menu option of Payment
When 	PEM_AcctUser click on Payment
Then 	PEM_AcctUser the Payment screen is opened
And   PEM_AcctUser should validate Pay to bank selected by default
And   PEM_AcctUser should be able to enter the "<beneficiaryname>"
And   PEM_AcctUser should be able to select one of the "<listedbanks>" to which User want to transfer
And   PEM_AcctUser should be able to enter the  "<Accountnumber>"
Then  PEM_AcctUser clicking on next should take me to next screen
Then  PEM_AcctUser should be able to save the "<beneficiaryname>" to the Beneficiary list

Examples:
|NedID      |Password|beneficiaryname|listedbanks|Accountnumber|
|greenbank754|Testing2!|DEFLTesting13	 |ABSA BANK  |4047594620|


@CustomermakesPaymentToAccountonceoff
Scenario Outline: Make payment to new bank account onceoff
Given PEM_AcctUser accesses Ned app and landing pg displayed
When 	PEM_Acct_User clicks on get started button
And 	PEM_AcctUser captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_AcctUser clicks Login button
And 	PEM_AcctUser waits for login approval
And 	PEM_AcctUser Dashboard page should display
And 	PEM_AcctUser click on Transact and verify sub-menu option of Payment
When 	PEM_AcctUser click on Payment
Then 	PEM_AcctUser the Payment screen is opened
And   PEM_AcctUser should validate Pay to bank selected by default
And   PEM_AcctUser should be able to enter the "<beneficiaryname>"
And   PEM_AcctUser should be able to select one of the "<listedbanks>" to which User want to transfer
And   PEM_AcctUser should be able to enter the  "<Accountnumber>"
Then PEM_User Selects Save tolle to make onceoff
Then  PEM_AcctUser clicking on next should take me to next screen
Then  PEM_AcctUser should be able to save the "<beneficiaryname>" to the Beneficiary list

Examples:
|NedID      |Password|beneficiaryname|listedbanks|Accountnumber|
|greenbank830|Testing1!|newonceoff	 |ABSA BANK  |4067152608|


  @onceoffpaymenttosavingsaccount
  Scenario Outline: Make a once off payment to savings account
    Given PEM_AcctUser accesses Ned app and landing pg displayed
    When 	PEM_Acct_User clicks on get started button
    And 	PEM_AcctUser captures NedbankID "<NedID>" and password "<Password>"
    And 	PEM_AcctUser clicks Login button
    And 	PEM_AcctUser waits for login approval
    And 	PEM_AcctUser Dashboard page should display
    And 	PEM_AcctUser click on Transact and verify sub-menu option of Payment
    When 	PEM_AcctUser click on Payment
    Then 	PEM_AcctUser the Payment screen is opened
    And   PEM_AcctUser should validate Pay to bank selected by default
    And   PEM_AcctUser should be able to enter the "<beneficiaryname>"
    And   PEM_AcctUser should be able to select one of the "<listedbanks>" to which User want to transfer
    And   PEM_AcctUser should be able to enter the  "<Accountnumber>"
    Then PEM_User Selects Save tolle to make onceoff
    Then  PEM_AcctUser clicking on next should take me to next screen
    Then  PEM_AcctUser should be able to save the "<beneficiaryname>" to the Beneficiary list

    Examples:
      |NedID      |Password|beneficiaryname|listedbanks|Accountnumber|
      |greenbank830|Testing1!|savingsnewonceoff	 |ABSA BANK  |9050843388|
