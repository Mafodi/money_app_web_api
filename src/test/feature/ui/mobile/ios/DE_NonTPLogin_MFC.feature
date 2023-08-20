@Testing111
Feature: Non-TP Login

  @UserLogins_NedIDPasswordTP(MFC)
  Scenario Outline:Logging in with a Non-TP that has NedID and Password
    Given user selects login sequence
    And  User Clicks Login Button
    And  User captures NedbankID "<nedbankid>" and password "<nedidpassword>"

    Examples:
      |Bankingprofile|pin|password|nedbankid|nedidpassword|RSA_ID|
      |3015370111|4242|Testing1|mfctest007|Testing3!|6810255185080|

