@TransferWeekly @Transfer @FNDWebRegression2
Feature: Reccurring Transfer Weekly


  @transferFFq
  Scenario Outline: Transfer from current to Savings account
    Given  TCI_User is navigated to the home page dashboard
    When 	 TCI_User navigates to transfer page
    And 	 TCI_User Enter Transfer "<Amount>"
    Then   TCI_User selects preferred transfer date "<TransferDate>"
    When   TCI_User selects the repeat method Weekly "<RepeatMethod>"
    Then     TCI_User selects occurrence "<Occurrence>"
    Then 	 TCI_User navigates to next screen
    And 	 TCI_User submits the transfer
    Then 	 TCI_User Validate Fields On Transfer scheduled Success Screen



    Examples:
      |Amount|TransferDate|RepeatMethod|Occurrence|
      |100|Tuesday, 31 December 2019|Weekly  |5    |


  @transferT
  Scenario Outline: Transfer from current to Investment Account
    Given 	TCI_User is navigated to the home page dashboard
    When 	TCI_User navigates to transfer page
    And 	TCI_User Enter Transfer "<Amount>"
    Then    TCI_User selects preferred transfer date "<TransferDate>"
    Then    TCI_User selects the investment account "<InvestmentAccount>"
    When    TCI_User selects the repeat method "<RepeatMethod>"
    Then     TCI_User selects occurrence "<Occurrence>"
    And 	TCI_User navigates to next screen
    Then 	TCI_User submits the transfer
    Then 	 TCI_User Validate Fields On Transfer scheduled Success Screen



    Examples:
      |Amount|InvestmentAccount|TransferDate|RepeatMethod|Occurrence|
      |100|45431114-9969       |Tuesday, 31 December 2019|Weekly|5    |


  @transferT
  Scenario Outline: Transfer from current to Credit Account
    Given 	TCI_User is navigated to the home page dashboard
    When 	TCI_User navigates to transfer page
    And 	TCI_User Enter Transfer "<Amount>"
    Then    TCI_User selects preferred transfer date "<TransferDate>"
    Then    TCI_User selects the Credit account "<CreditAccount>"
    When  TCI_User selects the repeat method "<RepeatMethod>"
    Then     TCI_User selects occurrence "<Occurrence>"
    And 	TCI_User navigates to next screen
    Then 	TCI_User submits the transfer
    Then 	 TCI_User Validate Fields On Transfer scheduled Success Screen



    Examples:
      |Amount|CreditAccount|TransferDate|RepeatMethod|Occurrence|
      |100|377095404912201 |Tuesday, 31 December 2019|Weekly  |5    |


  @transfer
  Scenario Outline: Transfer from Savings to Investment Account
    Given 	TCI_User is navigated to the home page dashboard
    When 	TCI_User navigates to transfer page
    And 	TCI_User Enter Transfer "<Amount>"
    Then    TCI_User selects preferred transfer date "<TransferDate>"
    Then    TCI_User selects the Homeloan account "<HomeloanAccount>"
    When  TCI_User selects the repeat method "<RepeatMethod>"
    Then     TCI_User selects occurrence "<Occurrence>"
    And 	TCI_User navigates to next screen
    And 	TCI_User submits the transfer
    Then 	 TCI_User Validate Fields On Transfer scheduled Success Screen


    Examples:
      |Amount|HomeloanAccount|TransferDate|RepeatMethod|Occurrence|
      |100|1310311100101     |Tuesday, 31 December 2019|Weekly  |5    |




