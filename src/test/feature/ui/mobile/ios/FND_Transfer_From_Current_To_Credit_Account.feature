@iOSRegression @FNDiOS @iOSTransfers
Feature: Transfer from current to credit account
@iOS_transferfromcurrentaccounttocreditaccount
Scenario: Transfer from current to credit account
  Given TCuCr_User is on the Transfer screen ios app
  When TCuCr_User enters amount to transfer ios app
  And TCuCr_User selects from account ios app
  And TCuCr_User selects to account ios app
  Then TCuCr_User Clicking on next should take user to review transfer screen ios app
  And TCuCr_User should be able to make transfer successfully ios app



