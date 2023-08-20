@AndroidRegression @FND @AndroidTransfers
Feature: Transfer from savings to credit account
@transferfromsavingsaccounttocreditaccount
Scenario: Transfer from savings to credit account
  Given Tscr_User is on the Transfer screen
  When Tscr_User enters amount to transfer
  And Tscr_User selects from account
  And Tscr_User selects to account
  Then Tscr_User Clicking on next should take user to review transfer screen
  And Tscr_User should be able to make transfer successfully



