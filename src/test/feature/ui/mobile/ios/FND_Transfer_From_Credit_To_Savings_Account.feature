@iOSRegression @FNDiOS @iOSTransfers
Feature: Transfer from credit to savings account
@iOS_transferfromcreditaccounttosavingsaccount
Scenario: Transfer from credit to savings account
  Given TCrS_User is on the Transfer screen ios app
  When TCrS_User enters amount to transfer ios app
  And TCrS_User selects from account ios app
  And TCrS_User selects to account ios app
  Then TCrS_User Clicking on next should take user to review transfer screen ios app
  And TCrS_User should be able to make transfer successfully ios app



