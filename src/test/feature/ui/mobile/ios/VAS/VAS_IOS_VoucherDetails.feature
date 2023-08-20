@iosRegression @vasiosregression
Feature: Voucher details are correct when selected


@VoucherDetails
Scenario Outline: Correct Voucher details display when voucher is selected
  Given user launch the money app new ios app
  And user chooses "Business Profile" on select profile screen
  And user enters a username "<username>" and password "<password>" for first login ios app
  And User selects IOS Transact icon
  And User selects IOS Buy button
  And User chooses "Buy gift voucher" on Vas Offering Screen
  And User navigates through Carousel
  And the user clicks "Get Started" button
  And user clicks on "Buy new gift voucher" on voucher history screen
  When User selects "Deezer" to buy Voucher for
  Then Voucher details are correct

  Examples:
    |username     |password |
    |Vasprofile10|Testing1!|