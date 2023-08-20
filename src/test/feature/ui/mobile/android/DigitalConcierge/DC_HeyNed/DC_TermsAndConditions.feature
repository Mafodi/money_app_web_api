@AndroidRegression @DC_HeyNedTermsAndConditions
Feature: View HeyNed Terms and Conditions

  @16HeyNedSettingsTsAndCs
  Scenario Outline: A client navigates to the HeyNed Terms and Conditions
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to Review our terms and conditions screen
    Then I review HeyNed terms and conditions

    Examples:
      |Username |Password   |
      |DChome01 |Test@1234  |