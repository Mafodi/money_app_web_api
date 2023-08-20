@AndroidRegression @FND @AndroidTransfers
Feature: Transfer from credit to current account
@transferfromcreditaccounttocurrentaccount
Scenario: Transfer from credit to current account
  Given TCrCu_User is on the Transfer screen
  When TCrCu_User enters amount to transfer
  And TCrCu_User selects from account
  And TCrCu_User selects to account
  Then TCrCu_User Clicking on next should take user to review transfer screen
  And TCrCu_User should be able to make transfer successfully



