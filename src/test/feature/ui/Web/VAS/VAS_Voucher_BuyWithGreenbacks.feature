@WebRegression @VAS
Feature: Buy new Voucher with Greenbacks

  @VASBuyWithGreenbacks
  Scenario Outline: Purchase a new Voucher

    Given user launch prepaid web application
    And user enters username "<username>" and password from feature file"<password>"
    When Web user clicks on Login
    Then user must logon to Money Web application
    And User clicks buy button
    When User want to buy voucher
    Then User should navigate to voucher screen
    And User want to select Multi product Voucher
    And User should navigate to Voucher Options
    And User want to select a product
    And User should navigate to Voucher Details screen
    And User Capture Voucher details
    And User should click on Buy Voucher
    And User should navigate to Voucher payment screen
    And I should be able to select account"<Account>"
    And Next button should be enabled
    And User want to crosscheck voucher details
    And User should navigate to Voucher Review screen
    And User want to review voucher details
    And User want buy product
    And User should see Voucher successful message
    When User clicks on Done Button
    Then User should navigate to Overview dashboard

    Examples:
      | username | password |Account|
      | cml3023657196@nedbank | Testing2! | 951703017666|


  @VASBuyOwnAmountWithGreenbacks
  Scenario Outline: Purchase a new Voucher

    Given user launch prepaid web application
    And user enters username "<username>" and password from feature file"<password>"
    When Web user clicks on Login
    Then user must logon to Money Web application
    And User clicks buy button
    When User want to buy voucher
    Then User should navigate to voucher screen
    And User want to select Multi product Voucher
    And User should navigate to Voucher Options
    And User want to select a Own Amount product
    And User should navigate to Voucher Details screen
    And User Capture Own Amount Voucher details
    And user want to enter Own Amount
    And User should click on Buy Voucher
    And User should navigate to Voucher payment screen
    And I should be able to select account"<Account>"
    And Next button should be enabled
    And User want to crosscheck voucher details
    And User should navigate to Voucher Review screen
    And User want to review voucher details
    And User want buy product
    And User should see Voucher successful message
    When User clicks on Done Button
    Then User should navigate to Overview dashboard

    Examples:
      | username | password |Account|
      | cml3023657196@nedbank | Testing2! | 951703017666|