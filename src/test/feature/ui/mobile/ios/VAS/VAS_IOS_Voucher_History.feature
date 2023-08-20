@iosRegression  @vasiosregression
Feature: Voucher History Feature

 @VoucherHistory
 Scenario Outline: User Can See History
  Given user launch the money app new ios app
  And user chooses "Business Profile" on select profile screen
  And user enters a username "<username>" and password "<password>" for first login ios app
  And User selects IOS Transact icon
  And User selects IOS Buy button
  And User chooses "Buy gift voucher" on Vas Offering Screen
  And User navigates through Carousel
  When the user clicks "Get Started" button
  Then Voucher History displays on Voucher DashBoard

  Examples:
   |username     |password |
   |Vasprofile10 |Testing1!|

