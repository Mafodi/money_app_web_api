@AndroidRegression @VAS
Feature: As an Existing Customer, I want to be able to see the relevant product offerings available for purchase based on my provider and budget

  Background: Prepaid purchase flow
    Given Existing customer is logged on to the banking App
    And User selects Transact icon
    And User selects Buy button
    And User want to purchase a pre-paid product
#    And Android user should see Carousal for first time
    And Android user should navigate to Provider screen

  @VASAndroidBuyPrepaid
  Scenario Outline: Purchase a pre-paid product
    When Android user clicks on "<Provider>"
    Then Android user should navigate to category screen
    And Android user selects "<Category>"
    And Android user selects product from category
    And Android user navigates to Recipient screen
    And Android user want to Buy for new "<MobileNum>"
    And Android User want to Click on Next Button
    And Android user navigates to payment screen
    And Android User want to Click on Next Button
    And Android user want to review prepaid purchase
    When Android user clicks on Buy
    Then Android user navigates to Success screen
    And Android user want to close the transaction
    Then Android user should navigate to VAS landing screen

  Examples:
    |Provider|Category |MobileNum|
    |CellC|Data |27622213021 |

  @VASAndroidBuyAgainForNumber
  Scenario: Purchase a pre-paid product
    When Android user selects product from History
    Then Android user should navigate to History detail
    And Android user want to Buy Again
    And Android user navigates to payment screen
    And Android User want to Click on Next Button
    And Android user want to review prepaid purchase
    When Android user clicks on Buy
    Then Android user navigates to Success screen
    And Android user want to do new purchase
    Then Android user should navigate to Provider screen


  @VASAndroidBuyPrepaid
  Scenario Outline: Purchase a pre-paid product
    When Android user clicks on "<Provider>"
    Then Android user should navigate to category screen
    And Android user selects "<Category>"
    And Android user selects product from category
    And Android user navigates to Recipient screen
    And Android user want to Buy for new "<MobileNum>"
    And Android User want to Click on Next Button
    And Android user navigates to payment screen
    And Android user want to check validations for reference field
    And Android user should check buy button is disabled
    When Android user want to update Reference field
    And Android user should check buy button is enabled


    Examples:
      |Provider|Category |MobileNum|
      |Mtn|Data |27634041500 |


