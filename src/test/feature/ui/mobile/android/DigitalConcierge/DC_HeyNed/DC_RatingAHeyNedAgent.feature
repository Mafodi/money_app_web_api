@AndroidRegression @DC_HeyNedTaskManagement
Feature: Rating to HeyNed agent from task

  #This scenario requires a closed task
  @11HeyNedStarRatingTask
  Scenario Outline: Star rating HeyNed agent from a task
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I search a task name "<Task>"
    And The task is searched successfully
    Then I should star rate the agent

    Examples:
      |Username   |Password   |Task                      |
      |test@6165  |Test@1234  |HeyNed agent star rating  |

    #This scenario requires a closed task
  @11HeyNedCommentRating
  Scenario Outline: Comment rating HeyNed agent from a task
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I search a task name "<Task>"
    And The task is searched successfully
    Then I should comment "<Comment>" rate the agent

    Examples:
      |Username   |Password   |Task                         |Comment  |
      |test@6165  |Test@1234  |HeyNed agent comment rating  |Good     |