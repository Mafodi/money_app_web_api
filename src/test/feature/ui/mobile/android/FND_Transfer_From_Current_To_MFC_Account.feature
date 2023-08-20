@AndroidRegression @FNDomit @AndroidTransfers
Feature: Transfer from current to MFC account
@transferfromcurrentaccounttomfcaccount
Scenario: Transfer from current to MFC account
  Given TCuMFC_User is on the Transfer screen
  When TCuMFC_User enters amount to transfer
  And TCuMFC_User selects from account
  And TCuMFC_User selects to account
  Then TCuMFC_User Clicking on next should take user to review transfer screen
  And TCuMFC_User should be able to make transfer successfully



