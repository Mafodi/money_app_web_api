@iosRegression @vasiosregression
Feature: Prepaid Carousel Feature

  @VASPrepaidCarousel
  Scenario Outline: Buy Prepaid Product with a user with no History
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    When User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    Then Prepaid Carousel should display



    Examples:
      |username     |password |
      |Vasforlife   |Testing2!|


  @VASPrepaidCarousel
  Scenario Outline: Buy Product with user who has history
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    Then choose prepaid brand screen displays


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|



  @VASPrepaidCarousel
  Scenario Outline: Navigate Through Carousel
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    And User chooses Next on Carousel screen one
    When User chooses Get Started Button
    Then User is taken to choose Prepaid Brand Screen



    Examples:
      |username     |password |
      |Vasforlife   |Testing2!|