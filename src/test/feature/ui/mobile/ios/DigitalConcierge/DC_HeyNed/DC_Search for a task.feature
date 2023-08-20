@iosRegression @DC_HeyNedTaskManagement
Feature: Search for a HeyNed task

  @Search_task
  Scenario Outline: Search for a HeyNed task from HeyNed Task list
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And I should be able to click on search icon
    And I enter text to search for a task "<searchtext>"
    And I should be able to see the list of the task having searched text from Open and closed tab
    Examples:
      |username|password|searchtext|
      |Jeet@1720|Jeet@1720|text|


  @Search_invalid_task
  Scenario Outline: Search for an invalid HeyNed task from HeyNed Task list
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And I should be able to click on search icon
    And I enter text to search for a task "<searchtext>"
    Then I should get error message if no relevant tasks are present in task list
    Examples:
      |username|password|searchtext|
      |Jeet@1720|Jeet@1720|dfgd|


  @Search_task_When_Empty_TaskList
  Scenario Outline: Search for an HeyNed task from HeyNed Task list when HeyNed task list is empty
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And I should be able to click on search icon
    And I enter text to search for a task "<searchtext>"
    Then I should not get any error message if no tasks are present in task list
    Examples:
      |username|password|searchtext|
      |Jeet@1720|Jeet@1720|dfgd|
