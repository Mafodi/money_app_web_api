@iosRegression @DC_HeyNedTaskManagement
Feature: View map received from HeyNed agent

  @Receive_map
  Scenario Outline: View map received from HeyNed agent
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    When Received a map from Hey Jude agent "<taskName>"
    Then  I clicked on the View on Maps Button to download map
    Examples:
      |username|password|taskName|
      |Jeet@1720|Jeet@1720|Map|