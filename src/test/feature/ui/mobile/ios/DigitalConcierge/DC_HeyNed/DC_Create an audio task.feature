@iosRegression @DC_HeyNedTaskManagement
Feature: Create an HeyNed Audio task

  @Create_AudioTask
  Scenario Outline: User is able to start a new task by using the voice / microphone option provided permission is ther
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And user can create audio task by using microphone
    And user clicks on Audio Send button
    Then user should be able to land on audio task
    And I should be able to land on task list by clicking back button from Audio task
    Examples:
      |username|password|
      |Jeet@1720|Jeet@1720|

