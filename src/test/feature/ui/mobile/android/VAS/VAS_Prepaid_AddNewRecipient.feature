@AndroidRegression
Feature: As an Existing Customer, I want to be able to add Recipient

  Background: Prepaid purchase flow
    Given Existing customer is logged on to the banking App
    And User selects Transact icon
    And User selects Buy button
    And User want to purchase a pre-paid product
#    And Android user should see Carousal for first time
    And Android user should navigate to Provider screen

  @VASAddRecipient
  Scenario Outline: Add Recipient
    When Android user clicks on "<Provider>"
    Then Android user should navigate to category screen
    And Android user selects "<Category>"
    And Android user selects product from category
    And Android user navigates to Recipient screen
    And Android user want to add new "<Recipient>"
    And Android User want to Click on Next Button
    And Android user navigates to payment screen
    And Android User want to Click on Next Button
    And Android user want to review prepaid purchase
    When Android user clicks on Buy
    Then Android user navigates to Success screen
    And Android user want to close the transaction
    Then Android user should navigate to VAS landing screen


    Examples:
    |Provider|Category |Recipient|
    |CellC|Data |27622213021 |

  @VASBuyOwnAmountForNewRec
  Scenario Outline: Buy Own Amount for New Recipient
    When Android user clicks on "<Provider>"
    Then Android user should navigate to category screen
    And Android user selects "<Category>"
    And Android user selects product from category
    And Android user should navigate to OwnAmount screen
    And Android user want to enter "<OwnAmount>"
    And Android User want to Click on Next Button
    And Android user navigates to Recipient screen
    And Android user want to add new "<Recipient>"
    And Android User want to Click on Next Button
    And Android user navigates to payment screen
    And Android User want to Click on Next Button
    And Android user want to review prepaid purchase
    When Android user clicks on Buy
    Then Android user navigates to Success screen
    And Android user want to do new purchase
    Then Android user should navigate to Provider screen


    Examples:
      |Provider|Category|OwnAmount |Recipient|
      |CellC|Airtime|10|27622213021 |


