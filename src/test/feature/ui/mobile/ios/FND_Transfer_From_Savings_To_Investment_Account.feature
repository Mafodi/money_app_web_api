@iOSRegression @FNDiOSomit @iOSTransfers
Feature: Transfer from savings to investment account
  @iOS_transferfromsavingsaccounttoinvestmentaccount
  Scenario: Transfer from savings to investment account
    Given TSInv_User is on the Transfer screen ios app
    When TSInv_User enters amount to transfer ios app
    And TSInv_User selects from account ios app
    And TSInv_User selects to account ios app
    Then TSInv_User Clicking on next should take user to review transfer screen ios app
    And TSInv_User should be able to make transfer successfully ios app



