@iosRegression @DC_HeyNedTaskManagement
Feature: Delete a HeyNed task from task list

  @DontDelete
  Scenario Outline: Authenticated client should not be able to continue chat on cancelled task
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And Select a "<taskName>" to delete by searching a task
    And user select the task and swipe to delete
    And user clicks on Delete task button
    And Delete task popup should gets displayed
    And user clicks on No button
    Then Delete popup will gets disappear and Task list screen should be active
    Examples:
      |username|password|taskName|
      |Jeet@1720|Jeet@1720|cancel|


  @DeleteCreated_Task
  Scenario Outline: Authenticated client should not be able to continue chat on cancelled task
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And Select a "<taskName>" to delete by searching a task
    And user select the task and swipe to delete
    And user clicks on Delete task button
    Then Delete popup will gets disappear and Task will be deleted from Task list

    Examples:
      |username|password|taskName|
      |Jeet@1720|Jeet@1720|texttask|