@WebRegression @VAS
Feature: Buy new Voucher With different accounts

  @VASBuyWithOtherAccount
  Scenario Outline: Purchase a new Voucher with funds account

    Given user launch prepaid web application
    And user enters username "<username>" and password from feature file"<password>"
    When Web user clicks on Login
    Then user must logon to Money Web application
    And User clicks buy button
    When User want to buy voucher
    Then User should navigate to voucher screen
    And User want to select Voucher
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
      | cml3008400230@nedbank | Test@123 | 1989092454|



  @VASBuyWithInsufficientFunds
  Scenario Outline: Purchase a new Voucher

    Given user launch prepaid web application
    And user enters username "<username>" and password from feature file"<password>"
    When Web user clicks on Login
    Then user must logon to Money Web application
    And User clicks buy button
    When User want to buy voucher
    Then User should navigate to voucher screen
    And User want to select Voucher
    And User should navigate to Voucher Options
    And User want to select a product
    And User should navigate to Voucher Details screen
    And User Capture Voucher details
    And User should click on Buy Voucher
    And User should navigate to Voucher payment screen
    And I should be able to select account"<Account>"
    And buy button from payment screen should be disabled
    And I should be able to select account"<FundsAccount>"
    And Next button should be enabled
    And User want to crosscheck voucher details
    And User should navigate to Voucher Review screen
    And User want to review voucher details
    And User want buy product
    And User should see Voucher successful message
    When User clicks on Done Button
    Then User should navigate to Overview dashboard

    Examples:
      | username | password  |Account|FundsAccount|
      | cml3008400230@nedbank | Test@123 | 460000642163|1989092454|


  @VASTermsAndConditions
  Scenario: Check Terms & Conditions

    Given Existing customer logged onto Web
    And User clicks buy button
    And User want to check Terms & Conditions
    When User clicks on T's&C's Link
    Then User should navigate to Terms screen
    And If user cancel Terms screen
    Then User should navigate to VAS landing screen