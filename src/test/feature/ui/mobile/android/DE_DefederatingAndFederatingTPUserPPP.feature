@AndroidTest123
Feature: Login As a TP user
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
    And User enters a profile number "<profilenumber>", pin "<pin>" and password "<password>"
    Examples:
      |NEDUSERNAME|NEDPASSWORD|profilenumber|pin|password|
      |Overdraft2|Testing2@|3015370111|4242|Testing1|

