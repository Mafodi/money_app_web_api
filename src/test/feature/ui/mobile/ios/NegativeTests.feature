@Testing11
Feature: Persona 4
  @DEUserLogsInDefederatedNonTP(Person
  Scenario Outline: PPP login nedbanks app using nedbank id
    Given user selects login sequence
    And  user Clicks continue with version
    And  User Clicks Login Button
    Then User Clicks ForgotDetails
    And  User Clicks ForgotPassword
    And  User Inputs NedID "<nedbankid>"
    And User clicks Next confirming Username
    And  User Inputs NedID Field Validation Case "<p1>"
    And  User Inputs NedID Field Validation Case "<p2>"
    And  User Inputs NedID Field Validation Case "<p3>"

    Examples:
      |Bankingprofile|pin|password|nedbankid|RSA_ID|p1|p2|p3|
      |3015370111|4242|Testing1|overdraft2|6810255185080|Testing|Testing1|Testing1!|