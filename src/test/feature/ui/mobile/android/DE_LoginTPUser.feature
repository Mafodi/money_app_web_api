@AndroidTest1
Feature: Login As a TP user
  @DigitalEnablementAndroidLogin
  Scenario Outline: Successfully hit dashboard
    Given User Clicks Continue with this version
    When User clicks Login link
    And User enters a nedbank id username "<NEDUSERNAME>" and nedbank id password "<NEDPASSWORD>"
    Examples:
      |NEDUSERNAME|NEDPASSWORD|profilenumber|pin|password|
      |Overdraft2|Testing651#@@|PROFILENUMBER |PIN|PASSWORD|