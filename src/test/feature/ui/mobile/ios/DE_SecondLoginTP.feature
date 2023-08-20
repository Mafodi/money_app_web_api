@Testing111
Feature: Second Login TP
  @UserLogins_NedIDPasswordNonTP(Persona5)
  Scenario Outline:Second Login as a TP user with Password only
    Given user selects login sequence
    And  User_Logs in as a new user
    Then User Clicks Login
    And  User captures NedbankID "<nedbankid>" and password "<nedidpassword>"
    And  User Accepts Welcome Option
    And  User selects more
    And  User Logs Out
    And  User Signs in Second Login "<nedidpassword>"

    Examples:
      |Bankingprofile|pin|password|nedbankid|nedidpassword|RSA_ID|
      |3015370111|4242|Testing1|overdraft2|Testing11343@|6810255185080|

#mfctest69|Testing1!