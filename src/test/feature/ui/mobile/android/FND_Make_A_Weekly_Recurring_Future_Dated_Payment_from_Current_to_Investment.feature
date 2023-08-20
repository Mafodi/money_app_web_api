@AndroidRegression @FND @FND_Payments
Feature: 	Make a weekly recurring future dated payment from current to investment acc
@RecurringWeeklyPaymentInvestmentAcc
Scenario Outline: Make a weekly recurring future dated payment from current to investment acc
  Given FD_Weekly_User_IA is on the Payment screen
  When FD_Weekly_User_IA navigates to Single Payment screen
  And FD_Weekly_User_IA selects recipients icon
  And FD_Weekly_User_IA should be able to search "<recipientsname>" and select
  And FD_Weekly_User_IA selects a future date for payment
  And FD_Weekly_User_IA selects repeat weekly
  Then FD_Weekly_User_IA should be able to make payment successfully

Examples:
|recipientsname|
|NedbankInvestmentaccount|


