
#Author: your.email@your.domain.com

Feature: 	Make payment to BDF
@CustomermakesPaymentToBDF
Scenario Outline: Make payment to BDF
Given PEM_BDF accesses Ned app and landing pg displayed
When PEM_BDF clicks on get started button
And 	PEM_BDF captures NedbankID "<NedID>" and password "<Password>"
And 	PEM_BDF clicks Login button
And 	PEM_BDF waits for login approval
And 	PEM_BDF Dashboard page should display
And 	PEM_BDF click on Transact and verify sub-menu option of Payment
When PEM_BDF click on Payment
Then PEM_BDF the Payment screen is opened
And PEM_BDF should validate Pay to bank selected by default
And PEM_BDF should be able to select search recipient
And PEM_BDF selects the Bank approved option
And PEM_BDF should be able to enter the "<beneficiaryname>" in search feild
Then PEM_BDF should validate and select "<beneficiaryname>" matches to the search feild
Then PEM_BDF clicking on next should take me to next screen and captures recipient "<reference>"
Then PEM_BDF should be able to make payment successfully

Examples:
|NedID       |Password |beneficiaryname|reference|
|greenbank812|Testing2!|ABC TELESALES |DFLTesting|
#|greenbank830|Testing1!|ABC TELESALES |DFLTesting|

#AFRICAN BANK LEGAL
#ADT 2016
#AGRINET LTD
