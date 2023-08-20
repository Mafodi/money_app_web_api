@DigitalEnablementiOSTest
Feature: PPP Enrolement

  @UserLogins_NedIDPasswordNonTP(Persona3)
  Scenario Outline: As a new user I want to create Nedbank Credentials and Federate using Card And Pin
    Given user selects login sequence
    And User Clicks Register Button
    And  User Inputs SAID "<RSA_ID>"
    And User clicks Next on NedID Primer Page
    And User clicks Next confirming Username
    And User Creates NID Username "<Username>"
    And User Creates NID Password "<Password>"
    And User Accepts T&C's and Clicks Create
    And User Clicks Done
    And  User_PPP_NID captures "<Bankingprofile>", "<pin>","<password>"
    Examples:
      |Bankingprofile|pin|password|Username|RSA_ID|newPassword|CardNumber|CardPin|IDNo|NedID|Password|
      |3015370111|4242|Testing1|Testing6712|8207275125089|Testing111!|377095100092159|1234|1805115090004|testanmol1|Testing10!|
