@AndroidTest111
Feature: Second Sign in Non TP(Change Password from dashboard)
  @DigitalEnablementAndroidLogin
  Scenario Outline: Successfully hit dashboard
    Given User Clicks Continue with this version
    When User clicks Login link
    And User enters a nedbank id username "<NEDUSERNAME>" and nedbank id password "<NEDPASSWORD>"
    And User clicks the more button
    Then User selects Login and Security then selects Nedbank ID
    And User clicks change password "<password>"
    And User logs out
    And User relogs with new pin"<password>"


    Examples:
      |NEDUSERNAME|NEDPASSWORD|profilenumber|pin|password|
      |TestingAnkur|Tester!210!|PROFILENUMBER|PIN|Tester!211!|