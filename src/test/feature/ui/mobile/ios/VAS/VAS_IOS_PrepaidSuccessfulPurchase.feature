@iosRegression @vasiosregression
Feature: Successful Purchase Feature


  @PrepaidSuccessfulFeature
  Scenario Outline: Finish Button Clicked Successfully after purchase is Successful
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    And User chooses "CellC" to buy a prepaid product for
    And User chooses Data to buy
    And User chooses "Daily 5MB" from data list
    And User enters number "0740037636" for phone number
    And User chooses "Next" button on Purchase Details Screen
    And User chooses "Next" on Buy Prepaid screen
    And User chooses "Buy" on Review Details Screen
    And Purchase Successful screen displays
    When User chooses "Finish" on  Purchase Success
    Then User is directed to Dashboard


    Examples:
      |username              |password |
      |cml3007115669@nedbank |Testing1!|


  @PrepaidSuccessfulFeature
  Scenario Outline: New Purchase Button Clicked Successfully after purchase is Successful
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    And User chooses "CellC" to buy a prepaid product for
    And User chooses Data to buy
    And User chooses "Daily 5MB" from data list
    And User enters number "0740037636" for phone number
    And User chooses "Next" button on Purchase Details Screen
    And User chooses "Next" on Buy Prepaid screen
    And User chooses "Buy" on Review Details Screen
    And Purchase Successful screen displays
    When User chooses "New Purchase" on  Purchase Success
    Then User is directed to Choose Prepaid Brand Screen


    Examples:
      |username              |password |
      |cml3007115669@nedbank |Testing1!|