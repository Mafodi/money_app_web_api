@AndroidTest12
Feature: Enrol as an existing client using ID from the registration flow
  @DigitalEnablementAndroidLogin
  Scenario Outline: Successfully hit dashboard
    Given User Clicks Continue with this version
    When User clicks Login link
    And User clicks register,selects personal profile and enters SA ID Number "<SAID>"
    And User enters Nedbank ID Password Register flow "<NEDPASSWORD>"

    Examples:
      |NEDUSERNAME|NEDPASSWORD|SAID|pin|password|
      |Overdraft2|Testing2@|6810255185080|PIN|Testing!212!|