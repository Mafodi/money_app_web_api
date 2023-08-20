@AndroidRegression @FND @FND_Payments
Feature: 	Make a future dated payment to Nedbank current Account
@futuredatedpaymenttonedbankcurrentaccount
Scenario Outline: Make a future dated payment to Nedbank current account
  Given FD_User_CA is on the Payment screen
  When FD_User_CA navigates to Single Payment screen
  And FD_User_CA selects recipients icon
  And FD_User_CA should be able to search "<recipientsname>" and select
  Then FD_User_CA Clicking on next should take me to next screenThen PEM_AcctUser_schedule clicking on next should take me to next screen and select a future date
  And FD_User_CA should be able to make payment successfully

Examples:
|recipientsname|
|NedbankCurrentaccount|


