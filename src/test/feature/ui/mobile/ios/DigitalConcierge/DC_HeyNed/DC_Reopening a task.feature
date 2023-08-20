@iosRegression @DC_HeyNedTaskManagement
Feature: Reopening a HeyNed task

  @Reopening_task
  Scenario Outline: Reopening a closed HeyNed task
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And Select a task to reopen "<taskname>"
    Then user swipe on selected task and select reopen
    Examples:
      |username|password|taskname|
      |Jeet@1720|Jeet@1720|cancel|