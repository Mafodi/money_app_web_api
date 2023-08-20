@iosRegression @DC_HeyNedTaskManagement
Feature: View a document received from HeyNed agent

  @Receive_document
  Scenario Outline: View a document received from HeyNed agent
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And Received a document from Hey Jude agent "<taskName>"
    Then The document should be downloaded and download button should be no longer exists
    Examples:
      |username|password|taskName|
      |Jeet@1720|Jeet@1720|pdf|