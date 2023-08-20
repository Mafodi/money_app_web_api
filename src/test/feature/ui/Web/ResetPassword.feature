@philop @DERegression
Feature: Reset Nedbank ID Password for TP & Non TP

  Background:

  Scenario Outline: Successful Password reset and Refederation of user TP - Persona 6
    Given user can access Money Web portal
    When user clicks on forgot details
    And user clicks on change Nedbank ID password
    And user enters NedID TP username <TPUsername>
    And user clicks on next button
    And user enter <newPassword> with <confirmPassword>
    And user clicks on create Password
    And user clicks on login
    And user enters triple Profile <pppProfile> with Pin <pppPin> with Password <pppPassword>
    And user clicks next button
    Then user is logged in successfully and sees the Transactional Product Dashboard

    Examples:
      | TPUsername | newPassword | confirmPassword | pppProfile | pppPin | pppPassword|
      | usnm       | pwd         | pwd             | 57575      | 4242   | Testing1   |
      #| overdraft2 | Testing529! | Testing529! | 3015370111 | 4242 | Testing1 |
      #| tester420 | Testing509! | Testing509! | 3017846582 | 5050 | qwerty11 |
      #| overdraft2 | Testing509! | Testing509! | 3015370111 | 4242 | Testing1 |

  Scenario Outline: Successful Password reset and Refederation of user Non TP
    Given user can access Money Web portal
    When user clicks on forgot details
    And user clicks on change Nedbank ID password
    And user enters NedID Non TP username <NTPUsername>
    And user clicks on next button
    And user enter <newPassword> with <confirmPassword>
    And user clicks on create Password
    And user clicks on login
    Then user is logged in successfully and sees the NON Transactional Product Dashboard

    Examples:
      | NTPUsername | newPassword | confirmPassword |
      | nontp123    | ththththt!  | pwd             |

      #| MFCMontana | Testing526! | Testing526!|
      #| nontpuser21 | Testing521! | Testing521!|