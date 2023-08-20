@AndroidRegression @DC_HeyNedTaskManagement
Feature: Search a HeyNed task

  @07HeyNedSearchTask
  Scenario Outline: Search a HeyNed text task
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I search a task name "<Task>"
    Then The task is searched successfully

    Examples:
      |Username   |Password   |Task             |
      |test@6165  |Test@1234  |Automation text  |

    @07HeyNedEmptyOrInvalidTaskList
    Scenario Outline: Search for an empty or invalid HeyNed text task
      Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
      When I navigate to HeyNed lifestyle assistant
      And I search a task name "<Task>"
      Then Then task list has no tasks present

      Examples:
        |Username   |Password   |Task                |
        |test@6165  |Test@1234  |Automation invalid  |