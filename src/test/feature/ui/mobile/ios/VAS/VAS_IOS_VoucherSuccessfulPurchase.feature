@iosRegression @vasiosregression
Feature: Voucher Successful Purchase Feature

  @VoucherSuccessfulScreen
  Scenario Outline: Buy Voucher Hollywood Bets
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy gift voucher" on Vas Offering Screen
    And User navigates through Carousel
    And the user clicks "Get started" button
    And user clicks on "Buy new gift voucher" on voucher history screen
    And User selects "Hollywoodbets" to buy Voucher for
    And User selects a "R10" to purchase for Hollywoodbets
    And User selects Next on Voucher details screen
    And User selects Next on Buy Voucher Screen
    And User selects Buy on Review Purchase Screen
    And Purchase Successful screen displays for Vouchers
    When User selects "Finish" button on Voucher Successful purchase screen
    Then User is directed to Dashboard


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|

  @VoucherSuccessfulScreen
  Scenario Outline: Buy Voucher Hollywood Bets
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy gift voucher" on Vas Offering Screen
    And User navigates through Carousel
    And the user clicks "Get started" button
    And user clicks on "Buy new gift voucher" on voucher history screen
    And User selects "Hollywoodbets" to buy Voucher for
    And User selects a "R10" to purchase for Hollywoodbets
    And User selects Next on Voucher details screen
    And User selects Next on Buy Voucher Screen
    And User selects Buy on Review Purchase Screen
    And Purchase Successful screen displays for Vouchers
    When User selects "Purchase new" button on Voucher Successful purchase screen
    Then User is directed to Voucher Dashboard


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|