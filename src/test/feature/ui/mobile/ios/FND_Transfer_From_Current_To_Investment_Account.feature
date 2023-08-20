@iOSRegression @FNDiOSomit @iOSTransfers
Feature: Transfer from current to investment account
  @iOS_transferfromcurrentaccounttoinvestmentaccount
  Scenario: Transfer from current to investment account
    Given TCuInv_User is on the Transfer screen ios app
    When TCuInv_User enters amount to transfer ios app
    And TCuInv_User selects from account ios app
    And TCuInv_User selects to account ios app
    Then TCuInv_User Clicking on next should take user to review transfer screen ios app
    And TCuInv_User should be able to make transfer successfully ios app



