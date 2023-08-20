@AndroidRegression @DC_Login
Feature: NedbankMnoneyApp login

  @Login
  Scenario Outline: Successful login to NedbankMoneyApp
    Given As a client I am on the NedbankMoneyApp
    When I capture Username "<Username>" and Password "<Password>"
    Then Home screen page should display

    Examples:
      |Username   |Password   |
      |test@6165  |Test@1234  |