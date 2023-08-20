@WebRegression @VAS
Feature: Share Voucher from History

  Background: Voucher flow
    Given Existing customer logged onto Web
    And User clicks buy button
    When User want to buy voucher
    Then User should navigate to Voucher dashboard

  @VASShareVoucherHistory
  Scenario: Purchase a new Voucher
    And User want to share Voucher from History
    And User selects Voucher
    And User navigates to History detail screen
    And User want to crosscheck Voucher History details
    And User want to Download the Voucher from History
    When User want to click on Back btn
    Then User should navigate to Voucher dashboard


  @VASVoucherDownload
  Scenario: Purchase a new Voucher
    And User want to share Voucher from History
    And User want to Download from Dashboard
    And User selects Voucher
    And User navigates to History detail screen
    And User want to crosscheck Voucher History details
    When User want to click on Back btn
    Then User should navigate to Voucher dashboard



