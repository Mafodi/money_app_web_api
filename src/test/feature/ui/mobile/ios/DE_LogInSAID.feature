@DigitalEnablementiOSTest
Feature: Enrolment using SA ID with Nedbank Credentials
  @UserLoginsIn_ForeignID

  Scenario Outline: PPP login using Foreign ID
    Given user selects login sequence
    And User Clicks Register Button
    And  User Inputs SAID "<RSA_ID>"
    Then User Clicks Register
    Then User Clicks On Personal Profile
    And  User_ID Clicks Dont Have ID
    And  User Foreign ID Captures "<Passport>"
    And  User Selects Country Text Box
    And  User Captures Country Origin "<Country>"

    Examples:
      |Bankingprofile|pin|password|nedbankid|nedidpassword|RSA_ID|Passport|Country|
      |3010465852|8480|Testing1|pvtwealth3018053370|Testing777@|QWE12345|QWE12345|Samoa|
#de-digital1
  #Testing@1