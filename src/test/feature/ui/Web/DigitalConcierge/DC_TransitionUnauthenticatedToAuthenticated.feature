@WebRegression
Feature: Transition an Unauthenticated web chat to Authenticated

  @05LiveChatTransition_Unauth
  Scenario Outline: Unauthenticated user initiates the chat with an agent
    Given As a client I am on Online Banking
    When I capture Name "<Name>" and Email address "<Email>" unauthenticated
    And I am queued to chat
    Then I login with Username "<Username>" and Password "<Password>" to continue web chat

    Examples:
      |Name   |Email                  |Username   |Password   |
      |Zimasa |zimasat@nedbank.co.za  |DCtest302  |Test@1234  |