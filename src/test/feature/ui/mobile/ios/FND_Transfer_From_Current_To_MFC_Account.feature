@iOSRegression @FNDomit @iOSTransfers
Feature: Transfer from current to MFC account
@transferfromcurrentaccounttomfcaccount
Scenario: Transfer from current to MFC account
  Given TCuMFC_User is on the Transfer screen ios app
  When TCuMFC_User enters amount to transfer ios app
  And TCuMFC_User selects from account ios app
  And TCuMFC_User selects to account ios app
  Then TCuMFC_User Clicking on next should take user to review transfer screen ios app
  And TCuMFC_User should be able to make transfer successfully ios app



