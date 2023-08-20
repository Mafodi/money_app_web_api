@WebRegression
Feature: Test with different profiles for Vouchers

  @VASBuyWithMinorProfile
  Scenario Outline: Purchase a new Voucher

    Given user launch prepaid web application
    And user enters username "<username>" and password from feature file"<password>"
    When Web user clicks on Login
    Then user must logon to Money Web application
    And User clicks buy button
    And User should not see Lotto product
    When User want to buy voucher
    Then User should navigate to voucher screen
    And User want to check if Hollywood bets is Visible


    Examples:
      | username | password |
      | cml3036752994@nedbank   | Testing1!     |


  @VASBuyWithSBSProfile
  Scenario Outline: Purchase a new Voucher

    Given user launch prepaid web application
    And user enters username "<username>" and password from feature file"<password>"
    When Web user clicks on Login
    Then user must logon to Money Web application
    And User clicks buy button
    And User should not see Lotto product
    When User want to buy voucher
    Then User should navigate to voucher screen
    And User want to check if Hollywood bets is Visible
    When User clicks on Nav Bar
    Then User should navigate to VAS landing screen
    And User want to switch profile
    And User clicks buy button
    And User should see Lotto Product
    When User want to buy voucher
    Then User should navigate to voucher screen
    And User should see Hollywood Bets Category


    Examples:
      | username | password |
      | sbs3059534054 | Sbscontext00! |