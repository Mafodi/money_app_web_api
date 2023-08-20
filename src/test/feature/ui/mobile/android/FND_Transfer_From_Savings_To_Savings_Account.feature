@AndroidRegression @FND @AndroidTransfers
Feature: Transfer from savings to savings account
@transferfromsavingsaccounttosavingsaccount
Scenario: Transfer from savings to savings account
  Given Tss_User is on the Transfer screen
  When Tss_User enters amount to transfer
  And Tss_User selects from account
  And Tss_User selects to account
  Then Tss_User Clicking on next should take user to review transfer screen
  And Tss_User should be able to make transfer successfully



