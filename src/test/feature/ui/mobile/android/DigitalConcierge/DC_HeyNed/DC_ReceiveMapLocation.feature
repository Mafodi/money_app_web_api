@AndroidRegression @DC_HeyNedMediaTasks
Feature: View map received from HeyNed agent

  @23HeyNedMapsTask
  Scenario Outline: View map received from a HeyNed agent
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I search a task name "<Task>"
    And The task is searched successfully
    Then I receive a map location

    Examples:
      |Username   |Password   |Task         |
      |test@6165  |Test@1234  |Testing maps |