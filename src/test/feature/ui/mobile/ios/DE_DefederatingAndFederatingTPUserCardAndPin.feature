@Testing12
Feature: Defederating and Federating flow using PPP
  @Persona6
  Scenario Outline: As a user I want to retrieve my Nedbank Username and Change my password then Federate myself using PPP
    Given user selects login sequence
    And  user Clicks continue with version
    And  User Clicks Login Button
    Then User Clicks ForgotDetails
    And  User Clicks ForgotUsername
    And  User Inputs SAID "<RSA_ID>"
    And  User clicks Go to Login
    Then User Clicks ForgotDetails
    And  User Clicks ForgotPassword
    And  User Inputs NedID "<nedbankid>"
    And  User clicks Next confirming Username
    And  User Inputs NewPassword "<newPassword>"
    And  User clicks confirm new password
    And  User clicks Login Shortcut
    And  User captures NedbankID "<nedbankid>" and password "<newPassword>"
    And  User Clicks Card Option
    And  User Captures Card "<CardNo>" and Pin "<Pin>"

    Examples:
      |Bankingprofile|CardNo|Pin|nedbankid|RSA_ID|newPassword|
      |3015370111|5179890054364474|12345|Tester211|9009275274084|Testing4!|