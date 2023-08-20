@Test123
Feature: Non-TP Login

  @UserLogins_NedIDPasswordTP(Persona7)
  Scenario Outline:Logging in with a Non-TP that has NedID and Password
    Given user selects login sequence
    And  User Clicks Login Button
    And  User captures NedbankID "<nedbankid>" and password "<nedidpassword>"

    Examples:
      |Bankingprofile|pin|password|nedbankid|nedidpassword|RSA_ID|
      |3012707921|5050|Qwerty11|Homeloan123|Testing2!|6810255185080|

