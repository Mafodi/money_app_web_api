@iOSRegression @FNDiOS @iOSTransfers
Feature: Transfer from savings to credit account
@iOS_transferfromsavingsaccounttocreditaccount
Scenario: Transfer from savings to credit account
  Given Tscr_User is on the Transfer screen ios app
  When Tscr_User enters amount to transfer ios app
  And Tscr_User selects from account ios app
  And Tscr_User selects to account ios app
  Then Tscr_User Clicking on next should take user to review transfer screen ios app
  And Tscr_User should be able to make transfer successfully ios app



