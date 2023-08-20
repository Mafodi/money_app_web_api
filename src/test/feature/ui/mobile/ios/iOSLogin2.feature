@iOSRegression @FNDiOSomit
Feature: Login on the Nedbank money app
  @iOSLogin2
  Scenario Outline: Successfully login on money app
    Given user launch the money app new ios app
    When user enters a username "<username>" and password "<password>" for first login ios app
    Then user should be on the welcome page ios app

    Examples:
      |username|password|
      |||
