@iOSRegression @FNDiOS @iOSTransfers
Feature: Transfer from current to savings account
@iOS_transferfromcurrentaccounttosavingsaccount
Scenario: Transfer from current to savings account
  Given TCS_User is on the Transfer screen ios app
  When TCS_User enters amount to transfer ios app
  And TCS_User selects from account ios app
  And TCS_User selects to account ios app
  Then TCS_User Clicking on next should take user to review transfer screen ios app
  And TCS_User should be able to make transfer successfully ios app



