@iOSRegression @FNDiOS @PrepaidiOS
Feature: Buy Vodacom airtime bundle
  @BuyPrepaidAirtimeVodacomiOS
  Scenario Outline: Buy Vodacom airtime bundle
    Given User is on the buy prepaid screen for Vodacom ios app
    When User selects Buy prepaid Vodacom airtime data sms ios app
    And User selects Vodacom beneficiary "<recipient>"
    And User selects Vodacom provider ios app
    And User selects Vodacom airtime ios app
    And User selects Vodacom bundle ios app
    And User enters Vodacom reference "<reference>"
    Then User reviews Vodacom airtime purchase ios app
    And completes Vodacom airtime bundle purchase ios app

    Examples:
      |recipient|reference|
      |Vodacom|TestVodacomAir|