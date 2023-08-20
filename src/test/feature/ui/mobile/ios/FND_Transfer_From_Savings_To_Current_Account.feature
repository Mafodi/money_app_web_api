@iOSRegression @FND @iOSTransfers
Feature: Transfer from savings to current account
@iOS_transferfromsavingsaccounttocurrentaccount
Scenario: Transfer from savings to current account
  Given Tsc_User is on the Transfer screen ios app
  When Tsc_User enters amount to transfer ios app
  And Tsc_User selects from account ios app
  And Tsc_User selects to account ios app
  Then Tsc_User Clicking on next should take user to review transfer screen ios app
  And Tsc_User should be able to make transfer successfully ios app



