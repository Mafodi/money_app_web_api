@WebRegression @VAS
Feature: Buy new Voucher

  Background: Voucher flow
    Given Existing customer logged onto Web
    And User clicks buy button
    When User want to buy voucher
    Then User should navigate to voucher screen

  @VASBuyFixedVoucher
  Scenario: Purchase a new Voucher

    And User want to select Voucher
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
    And User want to Download the Voucher
    And User clicks on Cancel icon
    Then User should navigate to VAS landing screen


  @VASBuyOwnAmountVoucher
  Scenario: Purchase a new Own Amount voucher

    And User want to select Own Amount Voucher
    And User should navigate to Voucher Details screen
    And User Capture Own Amount Voucher details
    And user want to enter Own Amount
    And User should click on Buy Voucher
    And User should navigate to Voucher payment screen
    And User want to crosscheck Own Amount voucher details
    And User should navigate to Voucher Review screen
    And User want to review Own Amount voucher details
    And User want buy product
    And User should see Own Amount Voucher successful message
    And User want to Download the Voucher
    When User clicks on New Purchase Button
    Then User should navigate to Voucher dashboard



