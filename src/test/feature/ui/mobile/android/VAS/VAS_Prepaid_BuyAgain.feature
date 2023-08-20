@AndroidRegression @VAS
Feature: As an Existing Customer, I want to be able to Buy Again


  Background: Prepaid purchase flow
    Given Existing customer is logged on to the banking App
    And User selects Transact icon
    And User selects Buy button
    And User want to purchase a pre-paid product
#    And Android user should see Carousal for first time
    And Android user should navigate to Provider screen


  @VASAndroidBuyAgainFromHistory
  Scenario: Buy Again from History
    Then Android user want to see history
    And Android user want to Buy Again from History
    And Android user navigates to payment screen
    And Android User want to Click on Next Button
    And Android user want to review prepaid purchase
    When Android user clicks on Buy
    Then Android user navigates to Success screen
    And Android user want to close the transaction
    Then Android user should navigate to VAS landing screen


  @VASAndroidBuyAgainFromHistoryListing
  Scenario: Buy Again from history listing
    And Android user want to click on ShowAll
    Then Android user should navigate to History listing screen
    When Android user selects product from History
    Then Android user should navigate to History detail
    And Android user want to Buy Again
    And Android user navigates to payment screen
    And Android User want to Click on Next Button
    And Android user want to review prepaid purchase
    When Android user clicks on Buy
    Then Android user navigates to Success screen
    And Android user want to close the transaction
    Then Android user should navigate to VAS landing screen

  @VASAndroidHistoryNavigation
  Scenario: Prepaid History navigation
    When Android user selects product from History
    Then Android user should navigate to History detail
    And Android user want to close the transaction
    Then Android user should navigate to Provider screen
    And Android user want to click on ShowAll
    Then Android user should navigate to History listing screen
    When Android user selects product from History
    Then Android user should navigate to History detail
    And Android user want to close the transaction
    Then Android user should navigate to History listing screen
    When Android user click on back button
    Then Android user should navigate to Provider screen