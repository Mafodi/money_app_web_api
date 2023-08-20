@iosRegression @DC_HeyNedTaskManagement
Feature: Rating to HeyNed agent from Task

  @Five_Rating
  Scenario Outline: User is able to rate the service received when  - rating more than three stars
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And Hey Jude agent closed the task and status of task is Rating "<taskName>"
    And Rating form is displayed on task chat screen
    When user rates the service with four or five stars
    And click on Submit button
    Then status of task should be Closed on task list
  Examples:
  |username|password|taskName|
  |Jeet@1720|Jeet@1720|RatingFive|

  @Rating_With_Comment
  Scenario Outline: User is able to rate the service received - rating Less than or equal to three stars
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And Hey Jude agent closed the task and status of task is Rating "<taskName>"
    And Rating form is displayed on task chat screen
    When user rates the service with less than four stars
    Then Feedback text box should be displayed and editable
    And I can write feedback and Submit it to Hey Jude "<feedback>"
    And click on Submit button
    Then status of task should be Closed on task list

    Examples:
      |username|password|taskName|feedback|
      |Jeet@1720|Jeet@1720|RatingComment|Service is good|
