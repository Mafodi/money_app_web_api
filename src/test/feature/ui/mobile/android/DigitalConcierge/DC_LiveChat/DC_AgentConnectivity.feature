@AndroidRegression
Feature: Connect a client to an agent

  @02LiveChatAgentConnectivity_Auth
  Scenario Outline: Authenticated user initiates chat with an agent and is able to view the agent name
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to Nedbank service agent
    And The chat message "<Message>" initiated
    Then The agent is connected to chat

    Examples:
      |Username  |Password   |Message                           |
      |test@6165 |Test@1234  |Agent connectivity Authenticated  |

  @02LiveChatAgentConnectivity_Unauth
  Scenario Outline: Unauthenticated user initiates chat with an agent and is able to view the agent name
    Given As a client I am on the NedbankMoneyApp
    When I navigate to unauthenticated chat
    And I capture Name "<Name>" and Email address "<Email>"
    And The chat initiated
    Then The agent is connected to chat

    Examples:
      |Name   |Email                       |
      |Saroj  |saroj.kandan@nedbank.co.za  |