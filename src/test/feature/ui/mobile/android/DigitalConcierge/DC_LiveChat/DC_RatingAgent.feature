@AndroidRegression
Feature: NPS Rating form displayed when ending chat

  @04LiveChatNPSForm_Auth
  Scenario Outline: Authenticated user views the NPS Form when chat ends
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to Nedbank service agent
    And The chat message "<Message>" initiated
    And The agent is connected to chat
    Then I should rate agent

    Examples:
      |Username   |Password   |Message                        |
      |test@6165  |Test@1234  |NPS Rating form Authenticated  |

  @04LiveChatNPSForm_Unauth
  Scenario Outline: Unauthenticated user views the NPS Form when chat ends
    Given As a client I am on the NedbankMoneyApp
    When I navigate to unauthenticated chat
    And I capture Name "<Name>" and Email address "<Email>"
    And The chat initiated
    And The agent is connected to chat
    Then I should rate agent

    Examples:
      |Name   |Email                       |
      |Saroj  |saroj.kandan@nedbank.co.za  |