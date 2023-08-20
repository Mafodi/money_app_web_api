@iOSRegression @FNDiOS @PrepaidiOS
Feature: Buy VirginMobile airtime bundle
  @BuyPrepaidAirtimeVodacomiOS
  Scenario Outline: Buy VirginMobile airtime bundle
    Given User is on the buy prepaid screen for VirginMobile ios app
    When User selects Buy prepaid VirginMobile airtime data sms ios app
    And User selects VirginMobile beneficiary "<recipient>"
    And User selects VirginMobile provider ios app
    And User selects VirginMobile airtime ios app
    And User selects VirginMobile bundle ios app
    And User enters VirginMobile reference "<reference>"
    Then User reviews VirginMobile airtime purchase ios app
    And completes VirginMobile airtime bundle purchase ios app

    Examples:
      |recipient|reference|
      |VirginMobile|TestVirginMobileAir|