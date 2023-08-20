@AndroidRegression @FND @FND_Payments
Feature: 	Make a weekly recurring future dated payment from current to homeloan acc
@RecurringWeeklyPaymentCurrentAcc
Scenario Outline: Make a weekly recurring future dated payment from current to homeloan acc
  Given FD_Weekly_User_HL is on the Payment screen
  When FD_Weekly_User_HL navigates to Single Payment screen
  And FD_Weekly_User_HL selects recipients icon
  And FD_Weekly_User_HL should be able to search "<recipientsname>" and select
  And FD_Weekly_User_HL selects a future date for payment
  And FD_Weekly_User_HL selects repeat weekly
  Then FD_Weekly_User_HL should be able to make payment successfully

Examples:
|recipientsname|
|Nedbankhomeloanaccount|


