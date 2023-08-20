@Testing111
Feature: Negative Test Scenario(Password Strength meter)
  @UserLogsInDefederatedNonTP(Persona4)
  Scenario Outline: This is a password strength meter test to validate the various criteria
    Given user selects login sequence
    And  User Clicks Login Button
    Then User Clicks ForgotDetails
    And  User Clicks ForgotPassword
    And  User Inputs NedID "<nedbankid>"
    And User clicks Next confirming Username
    And  User Inputs NedID Field Validation Case "<p1>"
    And  User Inputs NedID Field Validation Case "<p2>"
    And  User Inputs NedID Field Validation Case "<p3>"

    Examples:
      |Bankingprofile|pin|password|nedbankid|RSA_ID|p1|CardNumber|CardPin|IDNo|NedID|Password|p2|p3|
      |3015370111|4242|Testing1|overdraft2|6810255185080|Testing|377095100092159|1234|1805115090004|testanmol1|Testing10!|Testing1|Testing1!|