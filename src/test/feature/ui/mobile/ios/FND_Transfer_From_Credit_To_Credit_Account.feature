@iOSRegression @FNDiOS @iOSTransfers
Feature: Transfer from credit to credit account
@iOS_transferfromcreditaccounttocreditaccount
Scenario: Transfer from credit to credit account
  Given TCrCr_User is on the Transfer screen ios app
  When TCrCr_User enters amount to transfer ios app
  And TCrCr_User selects from account ios app
  And TCrCr_User selects to account ios app
  Then TCrCr_User Clicking on next should take user to review transfer screen ios app
  And TCrCr_User should be able to make transfer successfully ios app



