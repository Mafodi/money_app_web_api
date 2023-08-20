@iosRegression  @vasiosregression
Feature: Buy Vouchers feature

  @BuyVoucher
  Scenario Outline: User who already purchased Voucher
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy gift vouchers" on Vas Offering Screen
    And User navigates through Carousel
    And the user clicks "Get started" button
    And User chooses "Buy gift voucher" on Vas Offering Screen
    Then Voucher Dashboard screen is displayed

    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|

  @BuyVoucher
  Scenario Outline: List of Voucher Brands Display
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy gift voucher" on Vas Offering Screen
    And User navigates through Carousel
    And the user clicks "Get started" button
    When user clicks on "Buy new gift voucher" on voucher history screen
    Then list of Voucher Brands display

    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|



  @BuyVoucher
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
    When User selects Buy on Review Purchase Screen
    Then Purchase Successful screen displays for Vouchers


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|
