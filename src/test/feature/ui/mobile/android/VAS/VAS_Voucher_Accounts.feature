@AndroidRegression @VAS1
Feature: Buy new Voucher with different funds accounts

  @VASAndroidBuyWithOtherAccount
  Scenario Outline: Purchase a new Voucher with Sufficient funds

    Given user launch the money app
    When user enters a username "<username>" and password "<password>" for first login
    Then user should be on the welcome pageB
    And User selects Transact icon
    And User selects Buy button
    When Android User want to buy voucher
    Then Android user should see Carousal for first time login
    And Android user navigated to Voucher category screen
    And Android User want to select Voucher
    And Android User should navigate to Voucher Options
    And Android User want to select a product
    And Android User should navigate to Voucher Details screen
    And Android User Capture Voucher details
    And Android User should click on Buy Voucher
    And Android User should navigate to Voucher payment screen
    When Android user want to select other Account with funds
    And Android user should check buy button is enabled

    Examples:
      | username | password |
      | cml3008400230@nedbank | Test@123 |

  @VASAndroidBuyWithInsufficientFunds
  Scenario Outline: Purchase a new Voucher with Insufficient funds

    Given user launch the money app
    When user enters a username "<username>" and password "<password>" for first login
    Then user should be on the welcome pageB
    And User selects Transact icon
    And User selects Buy button
    When Android User want to buy voucher
    Then Android user should see Carousal for first time login
    And Android user navigated to Voucher category screen
    And Android User want to select Voucher
    And Android User should navigate to Voucher Options
    And Android User want to select a product
    And Android User should navigate to Voucher Details screen
    And Android User Capture Voucher details
    And Android User should click on Buy Voucher
    And Android User should navigate to Voucher payment screen
    When Android user want to select other Account with Insufficient Funds
    And Android user should check buy button is disabled
    And Android user want to buy with sufficient funds account
    And Android user should check buy button is enabled

    Examples:
      | username | password |
      | cml3008400230@nedbank | Test@123 |