@Testing13
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
    And  User_PPP_NID captures "<Bankingprofile>", "<pin>","<password>"

    Examples:
      |Bankingprofile|pin|password|nedbankid|RSA_ID|newPassword|
      |3015370111|4242|Testing1|overdraft2|6810255185080|Testing2!|
