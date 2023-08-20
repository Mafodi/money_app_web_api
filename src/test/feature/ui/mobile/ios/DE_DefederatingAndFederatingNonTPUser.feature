@Testing13
Feature: Defederating and Federating flow using PPP

  Scenario Outline: As a user I want to retrieve my Nedbank password as a Non-TP user without a profile
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


    Examples:
      |Bankingprofile|pin|password|nedbankid|RSA_ID|newPassword|
      |3015370111|4242|Testing1|Investtest02|6810255185080|Testing4!|
