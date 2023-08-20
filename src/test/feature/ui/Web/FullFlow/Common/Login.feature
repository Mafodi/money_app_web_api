Feature: Login to online banking web app

  @Login
  Scenario Outline: Successful Login to online banking Web Application
    Given user launch prepaid web application
    And user enters username "<username>" and password "<password>"
    When user clicks on Login
    Then user must see application dashboard

    Examples:
      | username      | password    |
      | GhostStaff31  | Testing123* |