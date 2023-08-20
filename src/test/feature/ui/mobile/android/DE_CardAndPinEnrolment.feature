@AndroidTest1
Feature: Login on the Nedbank money app
  @DigitalEnablementAndroidLogin
  Scenario Outline: Register via Card and Pin
    #Given user launch the money app

  #Scenario Outline: Register via Card and Pin
    Given User Clicks Continue with this version
    And User can scroll across the corousel
    When User clicks register button
    And User clicks personal profile
    And User enter SA ID for card and pin eti
    When User click create
    And User enters a nedbank id username "<ned_username>" and nedbank id password "<ned_password>"
    Then User validates
    And User enters a card "<cardnumber>" and pin "<pin>"
    And User is navigated to OTP
    And User enters a pin "<newpin>" then reenters pin "<reenterpin>"
    And User logouts
    And User login again with pin


    Examples:
      | cardnumber | pin  |newpin|reenterpin|ned_username|ned_password|
      | 377095 10009 2159 | PROFILE_PIN |NEWPIN |REENTERPIN|NEDUSERNAME|NEDPASWORD|







