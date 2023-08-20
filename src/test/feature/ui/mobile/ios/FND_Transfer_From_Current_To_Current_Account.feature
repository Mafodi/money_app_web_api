@iOSRegression @FNDiOS @iOSTransfers
Feature: Transfer from current to current account
@iOS_transferfromcurrentaccounttocurrentaccount
Scenario: Transfer from current to current account
  Given TCuCu_User is on the Transfer screen ios app
  When TCuCu_User enters amount to transfer ios app
  And TCuCu_User selects from account ios app
  And TCuCu_User selects to account ios app
  Then TCuCu_User Clicking on next should take user to review transfer screen ios app
  And TCuCu_User should be able to make transfer successfully ios app



