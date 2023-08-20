@AndroidRegression @FNDAndroid @AndroidTransfers
Feature: Transfer from current to savings account
@transferfromcurrentaccounttosavingsaccount
Scenario: Transfer from current to savings account
  Given TCS_User is on the Transfer screen
  When TCS_User enters amount to transfer
  And TCS_User selects from account
  And TCS_User selects to account
  Then TCS_User Clicking on next should take user to review transfer screen
  And TCS_User should be able to make transfer successfully



