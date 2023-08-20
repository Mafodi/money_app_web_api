@Test1234
Feature: Create a pin flow
  @UserLogins_NedIDPasswordNonTP(Persona5)
  Scenario Outline:Second Login flow using Create a Pin
    Given user selects login sequence
    Then User Clicks Login
    And  User captures NedbankID "<nedbankid>" and password "<nedidpassword>"
    And  User Accepts Welcome Option
    And  User selects more
    And  User Logs Out
    And  User Signs in Second Login "<nedidpassword>"
    And  User Clicks Create App Pin
    And  User Creates Pin "<pin1>"
    And  User Clicks Create Pin Button
    And  User selects more
    And  User Logs Out


    Examples:
      |Bankingprofile|pin|password|nedbankid|nedidpassword|RSA_ID|pin1|pin2|
      |3015370111|4242|Testing1|mfctest160|Testing21!|6810255185080|2311223112|23112|

