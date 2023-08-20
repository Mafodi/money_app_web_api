@AndroidRegression @VAS
Feature: Buy new Voucher through Multi category level

  Background: Voucher purchase flow
    Given Existing customer is logged on to the banking App
    And User selects Transact icon
    And User selects Buy button
    When Android User want to buy voucher
    Then Android user should see Carousal for first time login
    And Android user navigated to Voucher category screen

  @VASBuyAndroidCategoryVoucher
  Scenario: Purchase a new Voucher from Category level
    And Android user want to select Multi Category Voucher
    And Android user should navigate to category level one
    And Android user want to select category from category level two
#    Then Android user should navigate to category level two
##    And Android user selects category
    And Android User should navigate to Voucher Options
    And Android User want to select a product
    And Android User should navigate to Voucher Details screen
    And Android User Capture Voucher details
    And Android User should click on Buy Voucher
    And Android User should navigate to Voucher payment screen
    And Android User want to crosscheck Own Amount voucher details
    And Android User want to Click on Next Button
    And Android User should navigate to Own Amount Review screen
    And Android User want buy product
    And Android User should see Own Amount Voucher successful message
    And Android user want to check Success details
    When Android user clicks on New purchase button
    Then Android User should navigate to voucher Dashboard



  @VASAndroidEditReference
  Scenario: Edit Reference on payment screen
    And Android User want to select Voucher
    And Android User should navigate to Voucher Options
    And Android User want to select a product
    And Android User should navigate to Voucher Details screen
    And Android User Capture Voucher details
    And Android User should click on Buy Voucher
    And Android User should navigate to Voucher payment screen
    Then Android user want to update Reference
    And Android user want to crosscheck Voucher details
    And Android User want to Click on Next Button
    And Android User should navigate to Review screen
    And Android User want buy product
    Then Android User should see successful message
    And Android user want to check Success details
    When Android user clicks on close button
    Then Android user should navigate to VAS landing screen






