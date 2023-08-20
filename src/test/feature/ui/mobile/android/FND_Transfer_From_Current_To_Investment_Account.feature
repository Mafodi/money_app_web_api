@AndroidRegression @FND @AndroidTransfers
Feature: Transfer from current to investment account
  @transferfromcurrentaccounttoinvestmentaccount
  Scenario: Transfer from current to investment account
    Given TCuInv_User is on the Transfer screen
    When TCuInv_User enters amount to transfer
    And TCuInv_User selects from account
    And TCuInv_User selects to account
    Then TCuInv_User Clicking on next should take user to review transfer screen
    And TCuInv_User should be able to make transfer successfully



