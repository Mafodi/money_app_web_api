@DigitalEnablementiOSTest
Feature: Login as a TP user

  @UserLogins_NedIDPasswordTP(Persona7)
  Scenario Outline: Login as a TP user with Nedbank ID and password
    And  User_Logs in as a new user
    And  User Clicks Continue with version
    Then User Clicks Login
    And  User captures NedbankID "<nedbankid>" and password "<nedidpassword>"

    Examples:
      |Bankingprofile|pin|password|nedbankid|nedidpassword|RSA_ID|
      |3015370111|4242|Testing1|Testing12|Testing126!|6810255185080|
