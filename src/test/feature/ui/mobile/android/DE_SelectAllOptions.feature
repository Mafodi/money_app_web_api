@AndroidRegression11
Feature: Enrol ETI Non TP - Persona 3
  @DigitalEnablementAndroidLogin
  Scenario Outline: Enrol ETI Non TP
    Given User is on the main landing page
    When User clicks Login link
    When Persona_three_user enters a username "<username>" ,and passwords "<passwords>"
    And User clicks on accout summary
    And User click on the tabs
    And User clicks on feature menu
    And User selects get setlement quote
    And User selects share account info
    And User selects view payment details
    And User clicks on home menu
    And User clicks on notifications
    And User clicks on get in touch
    And User clicks on login and security
    And User clicks on settings
    And User clicks on share money app
    And User clicks on Ts and Cs
    And User clicks on logout
    And User Logs in again

    Examples:
      |username|passwords|
      |NEDUSERNAME|NEDPASWORD|
