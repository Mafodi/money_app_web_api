@AndroidRegression
Feature: Transition an Unauthenticated chat to Authenticated

  @05LiveChatTransition_Unauth
  Scenario Outline: Unauthenticated user initiates the chat with an agent
    Given As a client I am on the NedbankMoneyApp
    When I navigate to unauthenticated chat
    And I capture Name "<Name>" and Email address "<Email>"
    And The chat initiated
    Then I login with password "<Password>" to continue chat

    Examples:
      |Name   |Email                       |Password   |
      |Saroj  |saroj.kandan@nedbank.co.za  |Test@1234  |