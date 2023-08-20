@iosRegression @vasiosregression
Feature: Share Voucher Feature

   @ShareVoucherFeature
  Scenario Outline: Share Voucher Now
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy gift voucher" on Vas Offering Screen
    And User navigates through Carousel
    And the user clicks "Get Started" button
     And user clicks on "Buy new gift voucher" on voucher history screen
     And User selects "Hollywoodbets" to buy Voucher for
     And User selects a "R10" to purchase for Hollywoodbets
     And User selects Next on Voucher details screen
     And User selects Next on Buy Voucher Screen
     And User selects Buy on Review Purchase Screen
     When User clicks on Send voucher button for Vouchers
     Then User can choose a way to share voucher

    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|





