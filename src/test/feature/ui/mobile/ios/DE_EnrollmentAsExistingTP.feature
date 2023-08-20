@Testing13
Feature: Enrolment using SA ID with Nedbank Credentials
  @UserLoginsIn_ForeignID

  Scenario Outline: Login with existing SA ID through registration flow
    Given user selects login sequence
    And  User Clicks Login Button
    And User Clicks Register Button
    And  User Inputs SAID "<RSA_ID>"
    And User enters existing password "<nedidpassword>"
    And User Selects Continue with existing password

    Examples:
      |Bankingprofile|pin|password|nedbankid|nedidpassword|RSA_ID|Passport|Country|
      |3010465852|8480|Testing1|pvtwealth3018053370|Testing3!|6810255185080|QWE12345|Samoa|
