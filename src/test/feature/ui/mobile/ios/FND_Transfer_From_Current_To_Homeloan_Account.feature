@iOSRegression @FNDiomit @iOSTransfers
Feature: Transfer from current to homeloan account
  @iOS_transferfromcurrentaccounttoihomeloanaccount
  Scenario: Transfer from current to homeloan account
    Given TCuHl_User is on the Transfer screen ios app
    When TCuHl_User enters amount to transfer ios app
    And TCuHl_User selects from account ios app
    And TCuHl_User selects to account ios app
    Then TCuHl_User Clicking on next should take user to review transfer screen ios app
    And TCuHl_User should be able to make transfer successfully ios app



