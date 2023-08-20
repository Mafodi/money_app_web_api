@AndroidRegression @VAS
Feature: Show all vouchers from Dashboard

  Background: Voucher purchase flow
    Given Existing customer is logged on to the banking App
    And User selects Transact icon
    And User selects Buy button
    When Android User want to buy voucher
    Then Android user should see Carousal for first time login
    And Android user navigated to Voucher category screen
    And Android User want to select Own Amount Voucher

  @VASAndroidCancelOwnAmount
  Scenario: Cancel a new Own Amount voucher
    And Android User Capture Own Amount Voucher details
    And Android user want to enter Own Amount
    And Android user want to cancel sharing
    When Android User clicks on Cancel Transaction
    Then User should navigate to Voucher category screen


  @VASAndroidOwnAmountVoucherValidations
  Scenario: Own Amount voucher validations
    And Android User should navigate to Voucher Details screen
    And Android User Capture Own Amount Voucher details
    And Android User want to enter their own amount
    And Android user should see error message
    And Android buy voucher button should be disabled
    And Android user want to reEnter Own Amount
    And Android user should see buy button is Enabled
    And Android user want to enter Own Amount
    And Android User should click on Buy Voucher
    And Android User should navigate to Voucher payment screen