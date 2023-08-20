@DigitalEnablementiOSTest3
Feature: Forgot Password and Federation TP user
  @DEUserLogsInDefederatedNonTP(Persona4)
Scenario Outline:As a user I want to change my password and federate using PPP
  Given user selects login sequence
And  User Clicks Login Button
Then User Clicks ForgotDetails
And  User Clicks ForgotPassword
And  User Inputs NedID "<nedbankid>"
And  User clicks Next confirming Username
And  User Inputs NewPassword "<newPassword>"
And  User clicks confirm new password
And  User clicks Login Shortcut
And  User captures NedbankID "<nedbankid>" and password "<newPassword>"
    Then User Captures Card "<CardNumber>" and Pin "<CardPin>"



  Examples:
    |Bankingprofile|pin|password|nedbankid|RSA_ID|newPassword|CardNumber|CardPin|IDNo|NedID|Password|
    |3015370111|4242|Testing1|overdraft2|6810255185080|Testing130!|377095100092159|1234|1805115090004|testanmol1|Testing10!|