@DigitalEnablementiOSTest1a
Feature:Card And Pin Enrolment

  @UserLogins_NedIDPasswordNonTP(Persona3)
  Scenario Outline: As a new user I want to create Nedbank Credentials and Federate using Card And Pin
    Given user selects login sequence
    And  User Clicks Login Button
    Then User Clicks Register
    Then User Clicks On Personal Profile
    And  User Inputs SAID "<RSA_ID>"
    And User clicks Next on NedID Primer Page
    And User Creates NID Password Register "<Password>"
    And User Accepts T&C's and Clicks Create
    And User Clicks Card Option

    Examples:
      |RSA_ID|CardNumber|CardPin|Password|
      |4708065011086|377095100092159|1234|Testing10!|
