@AndroidRegression @DC_HeyNedTaskManagement
Feature: Close HeyNed task

  @08HeyNedCloseTask
  Scenario Outline: Close a HeyNed task
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I capture a task name "<Task>"
    And The task is created
    And I navigate back to Task List
    And I search a task "<Task>"
    And The task is searched successfully
    Then I close the task successfully

    Examples:
      |Username   |Password   |Task                 |
      |test@6165  |Test@1234  |Testing closed task  |