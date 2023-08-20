@iOSRegression @FNDiOS @PrepaidiOS
Feature: Buy MTN airtime bundle
  @BuyPrepaidAirtimeMTNiOS
  Scenario Outline: Buy MTN airtime bundle
    Given User is on the buy prepaid screen ios app
    When User selects Buy prepaid airtime data sms ios app
    And User selects beneficiary "<recipient>"
    And User selects provider ios app
    And User selects airtime ios app
    And User selects bundle ios app
    And User enters reference "<reference>"
    Then User reviews airtime purchase ios app
    And completes airtime bundle purchase ios app

    Examples:
      |recipient|reference|
      |MTN|TestMTNAir|