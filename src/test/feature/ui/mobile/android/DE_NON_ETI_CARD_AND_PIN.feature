@AndroidRegression
Feature: Login on the Nedbank money app
  @DigitalEnablementAndroidLogin
  Scenario Outline: Register via Card and Pin
    #Given user launch the money app

  #Scenario Outline: Register via Card and Pin
    Given User is on the main landing page
    When User clicks register button
    And User clicks personal profile
    And User enter SA ID for card and pin non eti
    When user enters a password "<pasword>" non Eti
    And User enters a card "<cardnumber>" and pin "<pin>"
    And User is navigated to OTP
    And User enters a pin "<newpin>" then reenters pin "<reenterpin>"
    And User logouts


    Examples:
      | cardnumber|pin|newpin|reenterpin|username|pasword||
      | 377095 10009 2159|PROFILE_PIN |NEWPIN |REENTERPIN| | PROFILE_UNAME|PROFILE_PWD|