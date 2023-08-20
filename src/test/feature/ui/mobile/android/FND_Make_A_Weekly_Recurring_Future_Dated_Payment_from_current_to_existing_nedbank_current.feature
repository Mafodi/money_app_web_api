@AndroidRegression @FND @FND_Payments
Feature: 	Make a weekly recurring future dated payment to Nedbank current Account
@RecurringWeeklyPaymentCurrentAcc
Scenario Outline: Make a weekly recurring future dated payment to Nedbank current account
  Given FD_Weekly_User_CA is on the Payment screen
  When FD_Weekly_User_CA navigates to Single Payment screen
  And FD_Weekly_User_CA selects recipients icon
  And FD_Weekly_User_CA should be able to search "<recipientsname>" and select
  And FD_Weekly_User_CA selects a future date for payment
  And FD_Weekly_User_CA selects repeat weekly
  Then FD_Weekly_User_CA should be able to make payment successfully

Examples:
|recipientsname|
|NedbankCurrentaccount|


