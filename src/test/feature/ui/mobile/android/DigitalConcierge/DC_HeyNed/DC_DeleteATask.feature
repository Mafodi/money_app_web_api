@AndroidRegression @DC_HeyNedTaskManagement
Feature: Delete a HeyNed task from task list

  @10HeyNedDeleteTask
  Scenario Outline: Delete a HeyNed task
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I capture a task name "<Task>"
    And The task is created
    And I navigate back to Task List
    And I search a task "<Task>"
    And The task is searched successfully
    Then I delete the task successfully

    Examples:
      |Username   |Password   |Task                 |
      |test@6165  |Test@1234  |Testing delete task  |

  @10HeyNedCancelDeleteTask
  Scenario Outline: Cancel a delete HeyNed task
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I capture a task name "<Task>"
    And The task is created
    And I navigate back to Task List
    And I search a task "<Task>"
    And The task is searched successfully
    Then I attempt to delete the task

    Examples:
      |Username   |Password   |Task                        |
      |test@6165  |Test@1234  |Testing cancel delete task  |