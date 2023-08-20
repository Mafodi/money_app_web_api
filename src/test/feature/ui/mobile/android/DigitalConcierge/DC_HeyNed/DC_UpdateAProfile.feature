@AndroidRegression @DC_HeyNedProfile
Feature: Update HeyNed user profile details

  @15HeyNedUpdateProfile
  Scenario Outline: A client updates their profile details
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed settings
    Then I update profile email address "<Email>"

    Examples:
      |Username  |Password   |Email                       |
      |test@6165 |Test@1234  |junior.phala@nedbank.co.za  |