@iosRegression @AgentConnectivity
Feature: Connect a client to an agent

  @LiveChatAgentConnectivity_Auth
  Scenario Outline: Authenticated user initiates chat with an agent and is able to view the agent names
    Given user is on Chatting screen on login with username "<username>" and password "<password>"
    When user sends message "<Message>"
    Then agent gets connected
    Examples:
      |username|password|Message|
      |Jeet@1720|Jeet@1720|Agent connectivity Authenticated |

  @LiveChatAgentConnectivity_Unauth
  Scenario Outline: Unauthenticated user initiates chat with an agent and is able to view the agent name
    Given user starts Unauthenticated chat screen with name "<name>" and email "<email>"
    When user sends message "<Message>" to unauth user
    Then agent gets connected to Unauth user
    Examples:
      |name|email|Message|
      |petewwwwr|johnww.peter@nedbank.co.za|Agent connectivity unAuthenticated|
