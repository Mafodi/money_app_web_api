@iosRegression @DC_HeyNedTaskManagement
  Feature: Close a HeyNed task

  @Close_Task
  Scenario Outline: User should be able to cancel a open task
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And Select a task to cancel "<taskname>"
    Then user swipe on selected task and select Cancel
    Examples:
      |username|password|taskname|
      |greenbank754|Testing2!|Test Mike|

