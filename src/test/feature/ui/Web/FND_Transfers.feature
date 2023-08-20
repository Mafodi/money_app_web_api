@Transfer @FNDWebRegression2111
Feature: Transfer Now


@SanityTest
Scenario Outline: Transfer from current to Savings account
Given 	TCI_User is navigated to the home page dashboard
When 	TCI_User navigates to transfer page
And 	TCI_User Enter Transfer "<Amount>"
Then 	TCI_User navigates to next screen
And 	TCI_User submits the transfer
Then 	TCI_User Validate Fields On Transfer Success Screen



Examples:
|Amount|
|110|


  @transferTT
  Scenario Outline: Transfer from current to Investment Account
    Given 	TCI_User is navigated to the home page dashboard
    When 	TCI_User navigates to transfer page
    And 	TCI_User Enter Transfer "<Amount>"
    Then    TCI_User selects the investment account "<InvestmentAccount>"
    And 	TCI_User navigates to next screen
    Then 	TCI_User submits the transfer
    And 	TCI_User Validate Fields On Transfer Success Screen



    Examples:
      |Amount|InvestmentAccount|
      |102|45431114-9969       |


  @transferT
  Scenario Outline: Transfer from current to Credit Account
    Given 	TCI_User is navigated to the home page dashboard
    When 	TCI_User navigates to transfer page
    And 	TCI_User Enter Transfer "<Amount>"
    Then    TCI_User selects the Credit account "<CreditAccount>"
    And 	TCI_User navigates to next screen
    Then 	TCI_User submits the transfer
    And 	TCI_User Validate Fields On Transfer Success Screen



    Examples:
      |Amount|CreditAccount|
      |103|377095404912201 |


  @transfer
  Scenario Outline: Transfer from Savings to Homeloan Account
    Given 	TCI_User is navigated to the home page dashboard
    When 	TCI_User navigates to transfer page
    And 	TCI_User Enter Transfer "<Amount>"
    Then    TCI_User selects the Homeloan account "<HomeloanAccount>"
    And 	TCI_User navigates to next screen
    And 	TCI_User submits the transfer
    And 	TCI_User Validate Fields On Transfer Success Screen


    Examples:
      |Amount|HomeloanAccount|
      |104|1310311100101     |



