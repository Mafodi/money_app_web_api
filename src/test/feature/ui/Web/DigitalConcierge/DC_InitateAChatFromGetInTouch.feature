@WebRegression
Feature: Initiate a web chat between a client and an agent from Get in touch

  @06LiveChatStartChatFromGetInTouch_Auth
  Scenario Outline: Authenticated user initiates the chat with an agent from Get in touch
    Given As a client I am logged-in with Username "<Username>" and Password "<Password>"
    When User navigates to Get in touch page
    And I click Chat to us
    Then I initiate chat "<Message>"

    Examples:
      |Username  |Password   |Message                           |
      |DCtest301 |Test@1234  |Initiate a chat from Get in touch |