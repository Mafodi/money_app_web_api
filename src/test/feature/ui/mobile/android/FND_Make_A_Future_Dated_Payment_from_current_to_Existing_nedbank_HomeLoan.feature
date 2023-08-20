@AndroidRegression @FND @FND_Payments
Feature: 	Make a future dated payment to Nedbank Home Loan
@futuredatedpaymenttonedbankhomeloan
Scenario Outline: Make a future dated payment to Nedbank Home Loan
  Given FD_User_HL is on the Payment screen
  When FD_User_HL navigates to Single Payment screen
  And FD_User_HL selects recipients icon
  And FD_User_HL should be able to search "<recipientsname>" and select
  Then FD_User_HL Clicking on next should take me to next screen
  And FD_User_HL should be able to make payment successfully

Examples:
|recipientsname|
|Nedbankhomeloanaccount|


