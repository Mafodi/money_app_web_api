@AndroidRegression
Feature: Initiate a chat between a client and an agent

  @01LiveChatStartChat_Auth
  Scenario Outline: Authenticated user initiates the chat with an agent
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to Nedbank service agent
    Then The chat message "<Message>" initiated

    Examples:
      |Username  |Password   |Message                        |
      |test@6165 |Test@1234  |Initiate a chat Authenticated  |

  @01LiveChatStartChat_Unauth
  Scenario Outline: Unauthenticated user initiates the chat with an agent
    Given As a client I am on the NedbankMoneyApp
    When I navigate to unauthenticated chat
    And I capture Name "<Name>" and Email address "<Email>"
    Then The chat initiated

    Examples:
      |Name   |Email                       |
      |Saroj  |saroj.kandan@nedbank.co.za  |