@iosRegression @DC_HeyNedTaskManagement
Feature: Create a HeyNed text task

  @Create_Text_Task
  Scenario Outline: User is able to start a new task by typing their query in a text box
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And user can type a task name in a text box "<taskName>"
    And user clicks on send button
    Then A task should be created with the heading same as typed while creating a task
    And user should be able to land on task list by clicking back button

    Examples:
      |username|password|taskName|
      |Jeet@1720|Jeet@1720|texttask|



