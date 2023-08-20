@AndroidRegression @VAS
Feature: All the error validations

  Background: Prepaid purchase flow
    Given Existing customer is logged on to the banking App
    And User selects Transact icon
    And User selects Buy button
    And User want to purchase a pre-paid product
#    And Android user should see Carousal for first time
    And Android user should navigate to Provider screen


  @VASErrorValidOnRecipient
  Scenario Outline: Error validation on Recipient screen
    When Android user clicks on "<Provider>"
    Then Android user should navigate to category screen
    And Android user selects "<Category>"
    And Android user selects product from category
    And Android user navigates to Recipient screen
    And Android user want to add Recipient to see error message
    And Android user should check buy button is disabled
    And Android user do not want to add beneficiary
    And Android user want to enter incorrect number
    And Android user should check buy button is disabled
    And Android user want to add new "<Recipient>"
    And Android User want to Click on Next Button
    And Android user navigates to payment screen


    Examples:
      |Provider|Category |Recipient|
      |Mtn|Data |27634041500 |


  @VASSelectChangeRec
  Scenario Outline: Select Existing Recipient to check validations
    When Android user clicks on "<Provider>"
    Then Android user should navigate to category screen
    And Android user selects "<Category>"
    And Android user selects product from category
    And Android user navigates to Recipient screen
    When Android user want to buy for Existing Recipients
    Then Android user navigates to Recipient Search screen
    And Android user should select "<Recipient>"
    And Android user should navigate to Purchase details screen
    When Android user want to change Recipient
    Then Android user should navigate back to Recipient screen
    And Android user should check buy button is disabled
    When Android user want to buy for Existing Recipients
    Then Android user navigates to Recipient Search screen
    And Android user should select "<Recipient>"
    And Android user should navigate to Purchase details screen
    When Android user click on back button
    Then Android user should navigate to category screen


    Examples:
      |Provider|Category |Recipient|
      |Mtn|Data |mtn |


  @VASOwnAmountScreenValidations
  Scenario Outline: Own Amount validations
    When Android user clicks on "<Provider>"
    Then Android user should navigate to category screen
    And Android user selects "<Category>"
    And Android user selects product from category
    And Android user should navigate to OwnAmount screen
    And Android user want to enter "<OwnAmount>"
    And Android user should see error message
    And Android user should check buy button is disabled
    And Android user want to enter Own Amount
    And Android User want to Click on Next Button
    And Android user navigates to Recipient screen
    When Android user want to buy for Existing Recipients
    Then Android user navigates to Recipient Search screen
    And Android user should select "<Recipient>"
    And Android user should navigate to Purchase details screen
    When Android user click on back button
    And Android user should navigate to OwnAmount screen



    Examples:
      |Provider|Category|OwnAmount |Recipient|
      |Mtn|Airtime|2|mtn |
