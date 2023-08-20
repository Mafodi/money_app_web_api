@Testing111
Feature:Negative Test Catering for incorrect App Pin flow
  @UserLogins_NedIDPasswordNonTP(Persona5)
  Scenario Outline: User logs in for the second time and creates a pin with mismatch pin options
    Given user selects login sequence
    And  User_Logs in as a new user
    Then User Clicks Login
    And  User captures NedbankID "<nedbankid>" and password "<nedidpassword>"
    And  User Accepts Welcome Option
    And  User selects more
    And  User Logs Out
    And  User Signs in Second Login "<nedidpassword>"
    And  User Clicks Create App Pin
    And  User Creates Pin "<pin1>"


    Examples:
      |Bankingprofile|pin|password|nedbankid|nedidpassword|RSA_ID|pin1|pin2|
      |3015370111|4242|Testing1|MfcTest160|Testing13$|6810255185080|2311223113|23112|

#mfctest69|Testing1!