@AndroidTest123
Feature: Defederating and Federating a Non-TP user
  @DigitalEnablementAndroidLogin@AndroidTest2
  Scenario Outline: Successfully hit dashboard
    Given User Clicks Continue with this version
    When User clicks Login link
    And User clicks forgot details
    And User clicks Forgot your Nedbank ID password
    And User enters Nedbank id username "<NEDUSERNAME>"
    When User clicks next
    Then User creates a new password "<NEDPASSWORD>"
    And User selects login shortcut
    And User enters a nedbank id username "<NEDUSERNAME>" and nedbank id password "<NEDPASSWORD>"
    Then User successfully hits dashboard

    Examples:
      |NEDUSERNAME|NEDPASSWORD|profilenumber|pin|password|
      |TestingAnkur|Testing101!|3015370111|4242|Testing1!|

