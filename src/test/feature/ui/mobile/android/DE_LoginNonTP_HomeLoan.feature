@AndroidTest1
Feature: Login As a Non TP Home Loan User
  @DigitalEnablementAndroidLogin@AndroidTest2
  Scenario Outline: Successfully hit dashboard
    Given User Clicks Continue with this version
    When User clicks Login link
    And User enters a nedbank id username "<NEDUSERNAME>" and nedbank id password "<NEDPASSWORD>"
    Examples:
      |NEDUSERNAME|NEDPASSWORD|profilenumber|pin|password|
      |Homeloan123|Testing2!|3019786486|5050|Qwerty11|