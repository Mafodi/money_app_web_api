@AndroidTest1223
Feature: Login as a non tp investment account
  @DigitalEnablementAndroidLogin
  Scenario Outline: Successfully hit dashboard
    Given User Clicks Continue with this version
    When User clicks Login link
    And User enters a nedbank id username "<NEDUSERNAME>" and nedbank id password "<NEDPASSWORD>"
    Examples:
      |NEDUSERNAME|NEDPASSWORD|profilenumber|pin|password|
      |Investtest01|Testing6!|PROFILENUMBER |PIN|PASSWORD|