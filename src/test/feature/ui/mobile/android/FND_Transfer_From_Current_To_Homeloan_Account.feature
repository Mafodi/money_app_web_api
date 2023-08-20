@AndroidRegression @FNDomit @AndroidTransfers
Feature: Transfer from current to homeloan account
  @transferfromcurrentaccounttoihomeloanaccount
  Scenario: Transfer from current to homeloan account
    Given TCuHl_User is on the Transfer screen
    When TCuHl_User enters amount to transfer
    And TCuHl_User selects from account
    And TCuHl_User selects to account
    Then TCuHl_User Clicking on next should take user to review transfer screen
    And TCuHl_User should be able to make transfer successfully



