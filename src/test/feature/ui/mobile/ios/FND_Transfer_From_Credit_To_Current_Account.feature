@iOSRegression @FNDiOS @iOSTransfers
Feature: Transfer from credit to current account
@iOS_transferfromcreditaccounttocurrentaccount
Scenario: Transfer from credit to current account
  Given TCrCu_User is on the Transfer screen ios app
  When TCrCu_User enters amount to transfer ios app
  And TCrCu_User selects from account ios app
  And TCrCu_User selects to account ios app
  Then TCrCu_User Clicking on next should take user to review transfer screen ios app
  And TCrCu_User should be able to make transfer successfully ios app



