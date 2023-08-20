@AndroidRegression @FND @AndroidTransfers
Feature: Transfer from credit to credit account
@transferfromcreditaccounttocreditaccount
Scenario: Transfer from credit to credit account
  Given TCrCr_User is on the Transfer screen
  When TCrCr_User enters amount to transfer
  And TCrCr_User selects from account
  And TCrCr_User selects to account
  Then TCrCr_User Clicking on next should take user to review transfer screen
  And TCrCr_User should be able to make transfer successfully



