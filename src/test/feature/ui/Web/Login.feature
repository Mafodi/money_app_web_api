@WebRegression @DERegression
Feature: Prepaid Web Login Feature

  @Login
  Scenario Outline: Successful Login to Prepaid Web Application
    Given user launch prepaid web application
    And user enters username "<username>" and password "<password>"
    When user clicks on Login
    Then user must logon to Money Web application
#    And User want to logout from Online banking
#    And user navigate to Login screen

    Examples:
      | username | password |
      | VAStesting21     | Testing1!     |
@philop
  Scenario Outline: Successful Login to Money Web with NEDID TP - Persona 7
    Given user can access Money Web portal
    And user enters TP Username <TPUsername> with TP Password <TPPassword>
    When user clicks Login button
    Then user is logged in successfully and sees the Transactional Product Dashboard

    Examples:
      | TPUsername | TPPassword |
      | uname      | pwd        |
        # PPP information for above - 3003008767 - 4242 - testing1
  @philop
  Scenario Outline: Successful Login to Money Web with NEDID Non TP - Persona 5
    Given user can access Money Web portal
    And user enters Non TP Username <NTPUsername> with Non TP Password <NTPPassword>
    When user clicks Login button
    Then user is logged in successfully and sees the NON Transactional Product Dashboard

    Examples:
      | NTPUsername | NTPPassword |
      | uname       | pwd         |
  @philop
  Scenario Outline: Successful Registration of User with SAID NON ETI TP
    Given user can access Money Web portal
    When user clicks on registration button
    And user enters TP SAID <TPSAID>
    And user clicks the next button
    And user enter TP SAID Password <TPSAIDPassword>
    When user clicks Login button
    Then user is logged in successfully and sees the Transactional Product Dashboard

    Examples:
      | TPSAID | TPSAIDPassword |
      | uname  | pwd            |
        # PPP information for above - 3003008767 - 4242 - testing1
  @philop
  Scenario Outline: Successful Registration of User with SAID NON ETI NON TP
    Given user can access Money Web portal
    When user clicks on registration button
    And user enters Non TP SAID <NTPSAID>
    And user clicks the next button
    And user enter Non TP Password <NTPSAIDPassword>
    When user clicks Login button
    Then user is logged in successfully and sees the NON Transactional Product Dashboard

    Examples:
      | NTPSAID | NTPSAIDPassword |
      | uname   | pwd             |
  @philop
  Scenario Outline: Successful Registration of User with Passport NON ETI TP
    Given user can access Money Web portal
    When user clicks on registration button
    And user clicks on Don't have an SAID
    And user enters Passport <Passport> with Country <Country>
    And user clicks the next button
    And user enters Passport Password <PPassword>
    When user clicks Login button
    Then user is logged in successfully and sees the Product Dashboard
    Examples:
      | Passport | Country | PPassword |
      | upass | Zim | pwd! |