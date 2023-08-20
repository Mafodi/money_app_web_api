@AndroidRegression @FND @FND_Payments
Feature: 	Make a weekly recurring future dated payment from current to savings acc
@RecurringWeeklyPaymentSavingsAcc
Scenario Outline: Make a weekly recurring future dated payment from current to savings acc
  Given FD_Weekly_User_SA is on the Payment screen
  When FD_Weekly_User_SA navigates to Single Payment screen
  And FD_Weekly_User_SA selects recipients icon
  And FD_Weekly_User_SA should be able to search "<recipientsname>" and select
  And FD_Weekly_User_SA selects a future date for payment
  And FD_Weekly_User_SA selects repeat weekly
  Then FD_Weekly_User_SA should be able to make payment successfully

Examples:
|recipientsname|
|NedbankSavingsaccount|


