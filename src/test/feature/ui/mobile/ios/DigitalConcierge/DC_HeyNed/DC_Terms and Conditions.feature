@iosRegression @DC_HeyNedTermsAndConditions
Feature: View HeyNed Terms and Conditions

  @HeyNed_TermsnConditions
  Scenario Outline: View HeyNed Terms and Conditions from More Option
    Given user is on Profile Details screen on login with username "<username>" and password "<password>"
    And Click on Terms and condition
    And Review screen should gets displayed
    And I can see HeyNed option on review screen
    And Click on HeyNed option
    Then HeyJude Terms and condition should gets displayed

    Examples:
      |username|password|
      |Jeet@1720|Jeet@1720|


