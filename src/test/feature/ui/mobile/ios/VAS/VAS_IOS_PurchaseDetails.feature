@iosRegression @vasiosregression
Feature: Purchase Details Feature


  @PurchaseDetailsFeature
  Scenario Outline: Validation message for phone number
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    And User chooses "CellC" to buy a prepaid product for
    And User chooses "Own Amount" to top up airtime
    And User enters "75" to Top Up airtime
    And User chooses "Next" button on Own Amount Screen
    When User enters number "074003" for phone number
    Then Validation message to enter a valid phone number should appear


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|



  @PurchaseDetailsFeature
  Scenario Outline: Validation message for Recipient Name
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    And User chooses "CellC" to buy a prepaid product for
    And User chooses "Own Amount" to top up airtime
    And User enters "75" to Top Up airtime
    And User chooses "Next" button on Own Amount Screen
    And User enters number "0740037636" for phone number
    And User toggles Save Recipient on
    When User leaves Recipient name empty
    Then Validation message to enter a Recipient Name appears


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|