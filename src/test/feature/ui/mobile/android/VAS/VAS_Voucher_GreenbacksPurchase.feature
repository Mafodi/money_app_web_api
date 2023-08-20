@AndroidRegression @VAS1
Feature: Buy new Voucher with Greenbacks account

  @VASAndroidBuyFixedWithGreenbacks
  Scenario Outline: Purchase a Fixed amount Voucher with Greenbacks

    Given user launch the money app
    When user enters a username "<username>" and password "<password>" for first login
    Then user should be on the welcome pageB
    And User selects Transact icon
    And User selects Buy button
    When Android User want to buy voucher
    Then Android user should see Carousal for first time login
    And Android user navigated to Voucher category screen
    And Android user want to select Multi product Voucher
    And Android User should navigate to Voucher Options
    And Android User want to select a Multi voucher fixed product
    And Android User should navigate to Voucher Details screen
    And Android User Capture Voucher details
    And Android User should click on Buy Voucher
    And Android User should navigate to Voucher payment screen
    And Android user want to buy with another account
    And Android user want to crosscheck Voucher details
    And Android User want to Click on Next Button
    And Android User should navigate to Review screen
    And Android User want buy product
    Then Android User should see successful message
    And Android user want to check Success details
    When Android user clicks on New purchase button
    Then Android User should navigate to voucher Dashboard

    Examples:
      | username | password |
      | cml3023657196@nedbank | Testing2! |


  @VASAndroidBuyOwnAmountVoucherWithGreenbacks
  Scenario Outline: Purchase a Own Amount Voucher with Greenbacks

    Given user launch the money app
    When user enters a username "<username>" and password "<password>" for first login
    Then user should be on the welcome pageB
    And User selects Transact icon
    And User selects Buy button
    When Android User want to buy voucher
    Then Android user should see Carousal for first time login
    And Android user navigated to Voucher category screen
    And Android user want to select Multi product Voucher
    And Android User should navigate to Voucher Options
    And Android User want to select a Multi voucher OwnAmount product
    And Android User Capture Own Amount Voucher details
    And Android user want to enter Own Amount
    And Android User should click on Buy Voucher
    And Android User should navigate to Voucher payment screen
    And Android user want to buy with another account
    And Android User want to crosscheck Own Amount voucher details
    And Android User want to Click on Next Button
    And Android User should navigate to Own Amount Review screen
    And Android User want buy product
    And Android User should see Own Amount Voucher successful message
    And Android user want to check Success details
    When Android user clicks on close button
    Then Android user should navigate to VAS landing screen

    Examples:
      | username | password |
      | cml3023657196@nedbank | Testing2! |