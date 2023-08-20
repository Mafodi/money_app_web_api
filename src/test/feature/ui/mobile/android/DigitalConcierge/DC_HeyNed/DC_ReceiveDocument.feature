@AndroidRegression @DC_HeyNedMediaTasks
Feature: View a document received from HeyNed agent

  @22HeyNedDocumentTask
  Scenario Outline: View a document received from HeyNed agent
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I search a task name "<Task>"
    And The task is searched successfully
    Then I receive a document

    Examples:
      |Username   |Password   |Task             |
      |test@6165  |Test@1234  |Testing document |