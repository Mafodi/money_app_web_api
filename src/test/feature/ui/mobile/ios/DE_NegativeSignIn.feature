@Testing111
Feature: Non-TP Login

  @UserLogins_NedIDPasswordTP(Persona7)
  Scenario Outline:Logging in with a Non-TP that has NedID and Password
    Given User_PPP_NID access Ned app and landing pg displayed
    And  User_Logs in as a new user
    And  User Clicks Continue with version
    Then User Clicks Login
    And  User captures NedbankID "<nedbankid>" and password "<nedidpassword>"

    Examples:
      |Bankingprofile|pin|password|nedbankid|nedidpassword|RSA_ID|
      |3012707921|5050|Qwerty11|Tpmember7|Testing11!|6810255185080|

