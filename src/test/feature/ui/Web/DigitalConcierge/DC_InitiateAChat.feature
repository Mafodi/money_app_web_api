@WebRegression
Feature: Initiate a web chat between a client and an agent

  @01LiveChatStartChat_Auth
  Scenario Outline: Authenticated user initiates the chat with an agent
    Given As a client I am logged-in with Username "<Username>" and Password "<Password>"
    When I navigate to chat
    Then I initiate chat "<Message>"

    Examples:
      |Username   |Password   |Message                        |
      |DCtest301  |Test@1234  |Initiate a chat Authenticated  |

  @01LiveChatStartChat_Unauth
  Scenario Outline: Unauthenticated user initiates the chat with an agent
    Given As a client I am on Online Banking
    When I capture Name "<Name>" and Email address "<Email>" unauthenticated
    Then I am queued to chat

    Examples:
      |Name |Email              |
      |Neo  |neom@nedbank.co.za |