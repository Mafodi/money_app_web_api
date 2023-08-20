@AndroidRegression @VAS
Feature: Share Voucher from History

  Background: Voucher purchase flow
    Given Existing customer is logged on to the banking App
    And User selects Transact icon
    And User selects Buy button
    When Android User want to buy voucher
    Then Android user should see Carousal for first time login
    And Android user should navigate to History dashboard

  @VASAndroidShareVoucherDashboard
  Scenario: Share Voucher from History dashboard

    And Android user want to select voucher from history
    Then Android user should navigate to History detail screen
    And user want to share the voucher
    And user should see options for sharing
    When user select recipient to share
    Then user should navigate message sharing screen
    And user want to send the voucher



  @VASAndroidShareVoucherHistory
  Scenario: Share voucher from History detail

    And Android user want to see all Vouchers
    Then User should navigate to History screen
    And Android user want to select voucher from history
    Then Android user should navigate to History detail screen
    And user want to share the voucher
    And user should see options for sharing
    When user select recipient to share
    Then user should navigate message sharing screen
    And user want to send the voucher


  @VASAndroidVoucherClose
  Scenario: Share voucher from History detail

    And Android user want to select voucher from history
    Then Android user should navigate to History detail screen
    And Android user want to cancel sharing
    And Android user should navigate to History dashboard
    And Android user want to see all Vouchers
    Then User should navigate to History screen
    And Android user want to select voucher from history
    Then Android user should navigate to History detail screen
    And Android user want to cancel sharing
    Then User should navigate to History screen
    And Android user want to Navigate back
    And Android user should navigate to History dashboard





