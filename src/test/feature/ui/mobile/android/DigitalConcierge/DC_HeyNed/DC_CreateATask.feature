@AndroidRegression @DC_HeyNedTaskManagement
Feature: Create a HeyNed task

  @05HeyNedCreateTextTask
  Scenario Outline: Create a HeyNed text task
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I capture a task name "<Task>"
    Then The task is created

    Examples:
      |Username   |Password   |Task                      |
      |test@6165  |Test@1234  |Automation text task test |

  #@06HeyNedCreateAudioTask
  #Scenario Outline: Create a HeyNed audio task
    #Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    #When I navigate to HeyNed lifestyle assistant
    #And I click on the audio icon
    #And I click on the Allow button
    #And I click on the Tap to record
    #And I click on the Tap to stop
    #And I click on the Next button
    #Then I should see the audio task on the Task List

    #Examples:
      #|Username   |Password   |
      #|DCtest104  |Test@1234  |