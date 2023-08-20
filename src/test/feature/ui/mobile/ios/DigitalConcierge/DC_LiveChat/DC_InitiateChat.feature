@iosRegression @AgentConnectivity
Feature: Initiate a chat between a client and an agent

  @LiveChatStartChat_Auth
  Scenario Outline: Authenticated user initiates the chat with an agent
    Given user is on Chatting screen on login with username "<username>" and password "<password>"
    When user sends message "<Message>"
    Then agent gets connected
    And user starts chatting with Agent
    Examples:
      |username|password|Message|
      |Jeet@1720|Jeet@1720|Agent connectivity Authenticated |


  @LiveChatStartChat_Unauth
  Scenario Outline: Unauthenticated user initiates the chat with an agent
    Given user starts Unauthenticated chat screen with name "<name>" and email "<email>"
    When user sends message "<Message>" to unauth user
    Then agent gets connected to Unauth user
    And user starts chatting with Agent

    Examples:
      |name      |email                  |Message |
      |Peter    |joihna@nedbank.co.za  |Initiate a chat UnAuthenticated |

