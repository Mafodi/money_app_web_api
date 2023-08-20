@iosRegression
Feature: Buy Airtime feature

  @BuyAirTime
  Scenario Outline: Buy Own Amount airtime as an existing user with history without saving recipient
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    And User chooses "CellC" to buy a prepaid product for
    And User chooses "Own Amount" to top up airtime
    And User enters "10" to Top Up airtime
    And User chooses "Next" button on Own Amount Screen
    And User enters number "0740037636" for phone number
    And User chooses "Next" button on Purchase Details Screen
    And User chooses "Next" on Buy Prepaid screen
    And User chooses "Buy" on Review Details Screen
    Then Purchase Successful screen displays


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|


   @BuyAirTime
    Scenario Outline: Buy Fixed Amount Data product as an existing user with History
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
      Then Purchase Successful screen displays


      Examples:
        |username     |password |
        |Vasprofile10 |Testing1!|


  @BuyAirTime
  Scenario Outline: List of Recipients display when "Select from Recipients" button is selected
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
    When User clicks on Select from Recipients Button
    Then list of Recipients screen opens up


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|


  @BuyAirTime
  Scenario Outline: Save New Recipient Purchase
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
    And User enters "CellC1" for Recipient Name
    And User chooses "Next" button on Purchase Details Screen
    And User chooses "Next" on Buy Prepaid screen
    And User chooses "Buy" on Review Details Screen
    Then Purchase Successful screen displays




    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|


  @BuyAirTime
  Scenario Outline: Buy Own Amount airtime as an existing user with history without saving recipient for Vodacom
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    And User chooses "Vodacom" to buy a prepaid product for
    And User chooses "Own Amount" to top up airtime
    And User enters "10" to Top Up airtime
    And User chooses "Next" button on Own Amount Screen
    And User enters number "0829801113" for phone number
    And User chooses "Next" button on Purchase Details Screen
    And User chooses "Next" on Buy Prepaid screen
    And User chooses "Buy" on Review Details Screen
    Then Purchase Successful screen displays


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|


  @BuyAirTime
  Scenario Outline: Buy Own Amount airtime as an existing user with history without saving recipient for MTN
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    And User chooses "MTN" to buy a prepaid product for
    And User chooses "Own Amount" to top up airtime
    And User enters "10" to Top Up airtime
    And User chooses "Next" button on Own Amount Screen
    And User enters number "0829801113" for phone number
    And User chooses "Next" button on Purchase Details Screen
    And User chooses "Next" on Buy Prepaid screen
    And User chooses "Buy" on Review Details Screen
    Then Purchase Successful screen displays


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|



  @BuyAirTime
  Scenario Outline: Buy Own Amount airtime as an existing user with history without saving recipient for Telkom
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    And User chooses "Telkom" to buy a prepaid product for
    And User chooses "Own Amount" to top up airtime
    And User enters "10" to Top Up airtime
    And User chooses "Next" button on Own Amount Screen
    And User enters number "0829801113" for phone number
    And User chooses "Next" button on Purchase Details Screen
    And User chooses "Next" on Buy Prepaid screen
    And User chooses "Buy" on Review Details Screen
    Then Purchase Successful screen displays


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|


  @BuyAirTime
  Scenario Outline: Buy Own Amount airtime as an existing user with history without saving recipient for Virgin Mobile
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    And User chooses "Virgin Mobile" to buy a prepaid product for
    And User chooses "Own Amount" to top up airtime
    And User enters "10" to Top Up airtime
    And User chooses "Next" button on Own Amount Screen
    And User enters number "0829801113" for phone number
    And User chooses "Next" button on Purchase Details Screen
    And User chooses "Next" on Buy Prepaid screen
    And User chooses "Buy" on Review Details Screen
    Then Purchase Successful screen displays


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|


  @BuyAirTime
  Scenario Outline: Buy Prepaid product from Selecting a Recipient
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
    And User clicks on Select from Recipients Button
    And User searches for "cellc2" in Recipient List Screen
    And User selects the Recipient
    And User chooses "Next" button on Purchase Details Screen
    And User chooses "Next" on Buy Prepaid screen
    And User chooses "Buy" on Review Details Screen
    Then Purchase Successful screen displays




    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|




