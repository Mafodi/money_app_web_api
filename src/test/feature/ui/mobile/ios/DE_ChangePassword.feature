@DigitalEnablementiOSTest
Feature: Change Password
  @UserLogins_NedIDPasswordNonTP(Persona5)
  Scenario Outline:As a Non-TP user I would like to change my password from Dashboard(Logged in state)
    Given user selects login sequence
    And  User_Logs in as a new user
    Then User Clicks Login
    And  User captures NedbankID "<nedbankid>" and password "<nedidpassword>"
    And  User Accepts Welcome Option
    And  User selects more
    And  User selects Login and Security
    Then User selects Nedbank ID
    Then User selects Change Password
    And  User Captures new Password "<newPassword>"
    Then User clicks Save Password
    And  User clicks Done Confirmation
    And  User selects back option
    And  User Logs Out
    And  User Signs in Second Login "<newPassword>"


    Examples:
      |Bankingprofile|pin|password|nedbankid|nedidpassword|RSA_ID|pin1|pin2|newPassword|
      |3015370111|4242|Testing1|Homeloan123|Testing1!|6810255185080|2311223113|23112|Testing2!|