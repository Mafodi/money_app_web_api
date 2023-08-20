@AndroidRegression @VAS
Feature: Vouchers Sharing from buy screen

  Background: Voucher purchase flow
    Given Existing customer is logged on to the banking App
    And User selects Transact icon
    And User selects Buy button
    When Android User want to buy voucher
    Then Android user should see Carousal for first time login
    And Android user navigated to Voucher category screen
    And Android user want to select Multi product Voucher
    And Android User should navigate to Voucher Options


  @VASAndroidShareFixedVoucher
  Scenario: Share a new Fixed Amount Voucher
    And Android User want to select a Multi voucher fixed product
    And Android User should navigate to Voucher Details screen
    And Android User Capture Voucher details
    And Android User should click on Buy Voucher
    And Android User should navigate to Voucher payment screen
    And Android user want to crosscheck Voucher details
    And Android User want to Click on Next Button
    And Android User should navigate to Review screen
    And Android User want buy product
    Then Android User should see successful message
    And Android user want to check Success details
    And user want to share the voucher
    And user should see options for sharing
    When user select recipient to share
    Then user should navigate message sharing screen
    And user want to send the voucher


  @VASAndroidShareOwnAmountVoucher
  Scenario: Share a new Own Amount voucher
    And Android User want to select a Multi voucher OwnAmount product
    And Android User Capture Own Amount Voucher details
    And Android user want to enter Own Amount
    And Android User should click on Buy Voucher
    And Android User should navigate to Voucher payment screen
    And Android User want to crosscheck Own Amount voucher details
    And Android User want to Click on Next Button
    And Android User should navigate to Own Amount Review screen
    And Android User want buy product
    And Android User should see Own Amount Voucher successful message
    And Android user want to check Success details
    And user want to share the voucher
    And user should see options for sharing
    When user select recipient to share
    Then user should navigate message sharing screen
    And user want to send the voucher





