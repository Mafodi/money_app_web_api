@iosRegression @AgentConnectivity
Feature: Transition of Unauthenticated chat to Authenticated

  @LiveChatTransition_Unauth
    Scenario Outline: Transition of Unauthenticated chat to Authenticated chat
    Given user starts Unauthenticated chat screen with name "<name>" and email "<email>"
    When user sends message "<Message>" to unauth user
    Then agent gets connected to Unauth user
    And Come back to Login screen
    When login with username "<username>" and password "<password>"
    Then user should be on ios welcome page
    And user clicks on Chat button on Overview screen
    Then user clicks on Chat option
    And user sends message "<Message>"
    And user starts chatting with Agent

    Examples:
      |name      |email                  |username|password| Message|
      |Georges11   |geossr11s@sdfsdf.co.zads|TestUserMFC90|TestUser%9090|test |