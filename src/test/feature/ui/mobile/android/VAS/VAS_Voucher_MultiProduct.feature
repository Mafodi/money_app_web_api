@AndroidRegression @VAS
Feature: Buy new Own Amount Voucher

  Background: Voucher purchase flow
    Given Existing customer is logged on to the banking App
    And User selects Transact icon
    And User selects Buy button
    When Android User want to buy voucher
    Then Android user should see Carousal for first time login
    And Android user navigated to Voucher category screen
    And Android user want to select Multi product Voucher
    And Android User should navigate to Voucher Options

  @VASAndroidBuyMultiProFixedVoucher
  Scenario: Purchase a Fixed Amount Voucher from multi product category

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
    When Android user clicks on New purchase button
    Then Android User should navigate to voucher Dashboard



  @VASAndroidBuyMultiProOwnAMountVoucher
  Scenario: Purchase an Own Amount Voucher from multi product category

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
    When Android user clicks on close button
    Then Android user should navigate to VAS landing screen
