@AndroidRegression @FND @AndroidTransfers
Feature: Transfer from savings to investment account
  @transferfromsavingsaccounttoinvestmentaccount
  Scenario: Transfer from savings to investment account
    Given TSInv_User is on the Transfer screen
    When TSInv_User enters amount to transfer
    And TSInv_User selects from account
    And TSInv_User selects to account
    Then TSInv_User Clicking on next should take user to review transfer screen
    And TSInv_User should be able to make transfer successfully



