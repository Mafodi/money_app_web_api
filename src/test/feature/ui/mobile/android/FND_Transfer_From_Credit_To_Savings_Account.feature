@AndroidRegression @FND @AndroidTransfers
Feature: Transfer from credit to savings account
@transferfromcreditaccounttosavingsaccount
Scenario: Transfer from credit to savings account
  Given TCrS_User is on the Transfer screen
  When TCrS_User enters amount to transfer
  And TCrS_User selects from account
  And TCrS_User selects to account
  Then TCrS_User Clicking on next should take user to review transfer screen
  And TCrS_User should be able to make transfer successfully



