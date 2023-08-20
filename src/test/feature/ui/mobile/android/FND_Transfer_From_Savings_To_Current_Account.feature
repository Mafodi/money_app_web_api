@AndroidRegression @FND @AndroidTransfers
Feature: Transfer from savings to current account
@transferfromsavingsaccounttocurrentaccount
Scenario: Transfer from savings to current account
  Given Tsc_User is on the Transfer screen
  When Tsc_User enters amount to transfer
  And Tsc_User selects from account
  And Tsc_User selects to account
  Then Tsc_User Clicking on next should take user to review transfer screen
  And Tsc_User should be able to make transfer successfully



