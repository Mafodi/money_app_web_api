@AndroidRegression
Feature: Test with different profiles for Vouchers

  @VASAndroidBuyMinorProfile
  Scenario Outline: Purchase a new Voucher

    Given user launch the money app
    When user enters a username "<username>" and password "<password>" for first login
    Then user should be on the welcome pageB
    And User selects Transact icon
    And User selects Buy button
    And Lotto should not be visible for Android SBS profile
    When Android User want to buy voucher
    Then Android user should see Carousal for first time login
    And Android user navigated to Voucher category screen
    And Android user want to check if Hollywood bets is visible

    Examples:
      | username | password |
      | cml3036752994@nedbank   | Testing1!   |



  @VASAndroidBuySBSProfile
  Scenario Outline: Purchase a new Voucher

    Given user launch the money app
    When user enters a username "<username>" and password "<password>" for first login
    And SBS user able to switch between profiles
    Then user should be on the welcome pageB
    And User selects Transact icon
    And User selects Buy button
    And Lotto should not be visible for Android SBS profile
    When Android User want to buy voucher
    Then Android user should see Carousal for first time login
    And Android user navigated to Voucher category screen
    And Android user want to check if Hollywood bets is visible
    And Android SBS user want to switch between profiles
    When Android user selects profile
#    Then user should be on the welcome page
    And User selects Transact icon
    And User selects Buy button
    And Lotto should be visible for Android SBS profile
    When Android User want to buy voucher
#    Then Android user should see Carousal for first time login
    And Android user navigated to Voucher category screen
    And Android SBS profile user able to see Hollywoodbets


    Examples:
      | username | password |
      | sbs3059534054 | Sbscontext00! |

