@AndroidRegression @FND @AndroidTransfers
Feature: Transfer from current to current account
@transferfromcurrentaccounttocurrentaccount
Scenario: Transfer from current to current account
  Given TCuCu_User is on the Transfer screen
  When TCuCu_User enters amount to transfer
  And TCuCu_User selects from account
  And TCuCu_User selects to account
  Then TCuCu_User Clicking on next should take user to review transfer screen
  And TCuCu_User should be able to make transfer successfully



