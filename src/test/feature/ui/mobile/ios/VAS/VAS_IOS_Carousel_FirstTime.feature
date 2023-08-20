@iosRegression  @vasiosregression
Feature: Voucher Carousel displays

  @IOSCarouselFeature
  Scenario Outline: Voucher Carousel Displays for First Time User
    Given user launch the money app new ios app
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    When User chooses "Buy gift vouchers" on Vas Offering Screen
    Then first time use Carousel screen appears

    Examples:
      |username     |password |
      |Vasprofile10|Testing1!|



  @IOSCarouselFeature
  Scenario Outline: Get Started button takes user to correct screen
    Given user launch the money app new ios app
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    When User chooses "Buy gift vouchers" on Vas Offering Screen
    And User navigates through Carousel
    When the user clicks "Get started" button
    Then User is taken to IOS Voucher type selection screen

    Examples:
      |username     |password |
      |Vasprofile10|Testing1!|