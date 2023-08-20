@WebRegression @VAS
Feature: Buy new Voucher through Multi category level

  Background: Voucher flow
    Given Existing customer logged onto Web
    And User clicks buy button
    When User want to buy voucher
    Then User should navigate to voucher screen

  @VASBuyCategoryOwnAmountVoucher
  Scenario: Purchase a new Voucher from Category level

    And User want to select Multi Category Voucher
    And User should navigate to Category level one
    And User want to select category from Category level one
    And User should navigate to Voucher Options
    And User want to select a product
    And User should navigate to Voucher Details screen
    And User Capture Voucher details
    And User should click on Buy Voucher
    And User should navigate to Voucher payment screen
    And User want to crosscheck voucher details
    And User should navigate to Voucher Review screen
    And User want to review voucher details
    And User want buy product
    And User should see Voucher successful message
    When User clicks on Done Button
    Then User should navigate to Overview dashboard


  @VASEditReference
  Scenario: Edit Reference on payment screen

    And User want to select Voucher
    And User should navigate to Voucher Options
    And User want to select a product
    And User should navigate to Voucher Details screen
    And User Capture Voucher details
    And User should click on Buy Voucher
    And User should navigate to Voucher payment screen
    And User want to update Reference
    And User want to crosscheck voucher details
    And User should navigate to Voucher Review screen
    And User want to review voucher details
    And User want buy product
    And User should see Voucher successful message
    When User clicks on New Purchase Button
    Then User should navigate to Voucher dashboard





