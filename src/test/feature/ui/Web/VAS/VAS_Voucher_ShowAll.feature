@WebRegression @VAS
Feature: Show all vouchers from Dashboard


  @VASViewAll
  Scenario: Show All List of Vouchers

    Given Existing customer logged onto Web
    And User clicks buy button
    When User want to buy voucher
    Then User should navigate to Voucher dashboard
    And User want to scroll to see all vouchers


  @VASClickNavBar
  Scenario: Click on Nav Bar

    Given Existing customer logged onto Web
    And User clicks buy button
    When User want to buy voucher
    Then User should navigate to voucher screen
    And User want to select Voucher
    And User should navigate to Voucher Options
    And User want to select a product
    When User clicks on Nav Bar
    Then User should navigate to VAS landing screen


  @VASCancelOwnAmount
  Scenario: Cancel a new Own Amount voucher

    Given Existing customer logged onto Web
    And User clicks buy button
    When User want to buy voucher
    Then User should navigate to voucher screen
    And User want to select Own Amount Voucher
    And User should navigate to Voucher Details screen
    And User Capture Own Amount Voucher details
    And user want to enter Own Amount
    And User want to cancel the product
    When User clicks on Cancel Transaction
    Then User should navigate to VAS landing screen

