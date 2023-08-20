@AndroidRegression @FND @AndroidTransfers
Feature: Transfer from current to credit account
@transferfromcurrentaccounttocreditaccount
Scenario: Transfer from current to credit account
  Given TCuCr_User is on the Transfer screen
  When TCuCr_User enters amount to transfer
  And TCuCr_User selects from account
  And TCuCr_User selects to account
  Then TCuCr_User Clicking on next should take user to review transfer screen
  And TCuCr_User should be able to make transfer successfully



