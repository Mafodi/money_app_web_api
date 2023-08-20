@AndroidRegression
Feature: Chat routing through credit card application

  @06LiveChatCreditCardChatRouting_Auth
  Scenario Outline: Authenticated user routing to chat
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to What do you need
    And Chat is opened
    Then The chat message "<Message>" initiated

    Examples:
      |Username   |Password   |Message                                          |
      |test@6165  |Test@1234  |Initiate a chat Credit Card Route Authenticated  |