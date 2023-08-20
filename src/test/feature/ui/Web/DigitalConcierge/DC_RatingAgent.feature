@WebRegression
Feature: NPS Rating form displayed when ending web chat

  @04LiveChatNPSThreeStarForm_Auth
  Scenario Outline: Authenticated user rates the chat selecting Three stars
    Given As a client I am logged-in with Username "<Username>" and Password "<Password>"
    When I navigate to chat
    And I initiate chat "<Message>"
    And The agent is connected to web chat
    Then I should rate the web chat

    Examples:
      |Username   |Password   |Message                        |
      |DCtest302  |Test@1234  |NPS Rating Three Authenticated |

  @04LiveChatNPSThreeStarForm_Unauth
  Scenario Outline: Unauthenticated user rates the chat selecting Three stars
    Given As a client I am on Online Banking
    When I capture Name "<Name>" and Email address "<Email>" unauthenticated
    And I am queued to chat
    And The agent is connected to web chat
    Then I should rate the web chat

    Examples:
      |Name   |Email                  |
      |Zimasa |zimasat@nedbank.co.za  |

  @04LiveChatNPSFormComment_Auth
  Scenario Outline: Authenticated user rates the chat and adds comment
    Given As a client I am logged-in with Username "<Username>" and Password "<Password>"
    When I navigate to chat
    And I initiate chat "<Message>"
    And The agent is connected to web chat
    And I should rate the web chat
    Then I should comment "<Comment>"

    Examples:
      |Username   |Password   |Message                                |Comment  |
      |DCtest302  |Test@1234  |NPS Rating Comment form Authenticated  |Good     |

  @04LiveChatNPSFormComment_Unauth
  Scenario Outline: Unauthenticated user rates the chat and adds comment
    Given As a client I am on Online Banking
    When I capture Name "<Name>" and Email address "<Email>" unauthenticated
    And I am queued to chat
    And The agent is connected to web chat
    And I should rate the web chat
    Then I should comment "<Comment>"

    Examples:
      |Name |Email              |Comment  |
      |Neo  |neom@nedbank.co.za |Good     |

  @04LiveChatNPSFormNoThanks_Auth
  Scenario Outline: Authenticated user selects No thanks button
    Given As a client I am logged-in with Username "<Username>" and Password "<Password>"
    When I navigate to chat
    And I initiate chat "<Message>"
    And The agent is connected to web chat
    Then I click No thanks button

    Examples:
      |Username   |Password   |Message                            |
      |DCtest302  |Test@1234  |NPS Rating No Thanks Authenticated |

  @04LiveChatNPSFormNoThanks_Unauth
  Scenario Outline: Unauthenticated user selects No thanks button
    Given As a client I am on Online Banking
    When I capture Name "<Name>" and Email address "<Email>" unauthenticated
    And I am queued to chat
    And The agent is connected to web chat
    Then I click No thanks button

    Examples:
      |Name |Email              |
      |Neo  |neom@nedbank.co.za |

  @04LiveChatNPSFormFullStarRating_Auth
  Scenario Outline: Authenticated user rates the chat and rates Five stars
    Given As a client I am logged-in with Username "<Username>" and Password "<Password>"
    When I navigate to chat
    And I initiate chat "<Message>"
    And The agent is connected to web chat
    Then I should Five star rate the web chat

    Examples:
      |Username   |Password   |Message                            |
      |DCtest302  |Test@1234  |NPS Rating Five Star Authenticated |

  @04LiveChatNPSFormFullStarRating_Unauth
  Scenario Outline: Unauthenticated user rates the chat and rates Five stars
    Given As a client I am on Online Banking
    When I capture Name "<Name>" and Email address "<Email>" unauthenticated
    And I am queued to chat
    And The agent is connected to web chat
    Then I should Five star rate the web chat

    Examples:
      |Name |Email              |
      |Neo  |neom@nedbank.co.za |