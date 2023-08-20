@iOSRegression @FNDiOS @PrepaidiOS
Feature: Buy TelkomMobile airtime bundle
  @BuyPrepaidAirtimeVodacomiOS
  Scenario Outline: Buy TelkomMobile airtime bundle
    Given User is on the buy prepaid screen for TelkomMobile ios app
    When User selects Buy prepaid TelkomMobile airtime data sms ios app
    And User selects TelkomMobile beneficiary "<recipient>"
    And User selects TelkomMobile provider ios app
    And User selects TelkomMobile airtime ios app
    And User selects TelkomMobile bundle ios app
    And User enters TelkomMobile reference "<reference>"
    Then User reviews TelkomMobile airtime purchase ios app
    And completes TelkomMobile airtime bundle purchase ios app

    Examples:
      |recipient|reference|
      |TelkomMobile|TestTelkomMobileAir|