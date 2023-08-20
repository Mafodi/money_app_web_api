@iosRegression @DC_HeyNedTaskManagement
Feature: View list of suppliers received from HeyNed agent

  @Receive_supplier
  Scenario Outline: View list of suppliers received from HeyNed agent
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And Received a supplier details from Hey Jude agent for task "<taskName>"
    And I can see the supplier details with description
    Then If more than one supplier is present, i can swipe supplier
    Examples:
      |username|password|taskName|
      |Jeet@1720|Jeet@1720|supplier|
