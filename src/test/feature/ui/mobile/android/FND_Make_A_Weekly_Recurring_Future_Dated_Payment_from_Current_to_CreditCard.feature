@AndroidRegression @FND @FND_Payments
Feature: 	Make a weekly recurring future dated payment from current to credit card
@RecurringWeeklyPaymentCreditCard
Scenario Outline: Make a weekly recurring future dated payment from current to to credit card
  Given FD_Weekly_User_CC is on the Payment screen
  When FD_Weekly_User_CC navigates to Single Payment screen
  And FD_Weekly_User_CC selects recipients icon
  And FD_Weekly_User_CC should be able to search "<recipientsname>" and select
  And FD_Weekly_User_CC selects a future date for payment
  And FD_Weekly_User_CC selects repeat weekly
  Then FD_Weekly_User_CC should be able to make payment successfully

Examples:
|recipientsname|
|NedbankCreditCard|


