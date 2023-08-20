@AndroidRegression @DC_HeyNedTaskManagement
Feature: Reopen a closed Task

  @09HeyNedReopenClosedTask
  Scenario Outline: A client reopens a closed Task
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I search a task name "<Task>"
    And The task is searched successfully
    Then I reopen the task successfully

    Examples:
      |Username   |Password   |Task                |
      |test@6165  |Test@1234  |Testing closed task |