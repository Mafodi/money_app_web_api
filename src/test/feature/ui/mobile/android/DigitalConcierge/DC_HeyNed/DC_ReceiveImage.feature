@AndroidRegression @DC_HeyNedMediaTasks
Feature: View image received from HeyNed agent

  @20HeyNedDownloadImage
  Scenario Outline: View an image received from HeyNed agent
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I search a task name "<Task>"
    And The task is searched successfully
    Then I download an image

    Examples:
      |Username   |Password   |Task            |
      |test@6165  |Test@1234  |Testing images  |