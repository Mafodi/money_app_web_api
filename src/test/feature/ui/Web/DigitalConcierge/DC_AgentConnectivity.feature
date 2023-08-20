@WebRegression
Feature: Connect a web client to an agent

  @02LiveChatAgentConnectivity_Auth
  Scenario Outline: Authenticated user initiates chat with an agent and is able to view the agent name
    Given As a client I am logged-in with Username "<Username>" and Password "<Password>"
    When I navigate to chat
    And I initiate chat "<Message>"
    Then The agent is connected to web chat

    Examples:
      |Username   |Password   |Message                          |
      |DCtest301  |Test@1234  |Agent connectivity Authenticated |

  @02LiveChatAgentConnectivity_Unauth
  Scenario Outline: Unauthenticated user initiates chat with an agent and is able to view the agent name
    Given As a client I am on Online Banking
    When I capture Name "<Name>" and Email address "<Email>" unauthenticated
    And I am queued to chat
    Then The agent is connected to web chat

    Examples:
      |Name |Email              |
      |Neo  |neom@nedbank.co.za |