@iosRegression @DC_HeyNedTaskManagement
Feature: View images received from HeyNed agent

  @Receive_image
  Scenario Outline: View images received from HeyNed agent
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And Received a image from Hey Jude agent "<taskName>"
    Then The image should be downloaded and download button should be no longer exists
    Examples:
      |username|password|taskName|
      |Jeet@1720|Jeet@1720|Image|