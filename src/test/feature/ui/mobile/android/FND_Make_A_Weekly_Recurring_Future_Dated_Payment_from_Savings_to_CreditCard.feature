@AndroidRegression @FND @FND_Payments
Feature: 	Make a weekly recurring future dated payment from savings to credit card
@RecurringWeeklyPaymentSavings2Credit
Scenario Outline: Make a weekly recurring future dated payment from savings to to credit card
  Given FD_Weekly_SA_to_CC_User is on the Payment screen
  When FD_Weekly_SA_to_CC_User navigates to Single Payment screen
  And FD_Weekly_SA_to_CC_User selects recipients icon
  And FD_Weekly_SA_to_CC_User should be able to search "<recipientsname>" and select
  And FD_Weekly_SA_to_CC_User selects from account
  And FD_Weekly_SA_to_CC_User selects a future date for payment
  And FD_Weekly_SA_to_CC_User selects repeat weekly
  Then FD_Weekly_SA_to_CC_User should be able to make payment successfully

Examples:
|recipientsname|
|NedbankCreditCard|


