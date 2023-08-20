@AndroidRegression
Feature: Login on the Nedbank money app

  @AndroidLogin2
  Scenario Outline: Successfully login on money app
    Given user launch the money app new
    When user enters a username "<username>" and password "<password>" for first login b
    Then user should be on the welcome page

    Examples:
      | username | password       |
      | | |
