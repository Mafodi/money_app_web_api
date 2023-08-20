@AndroidRegression @VAS
Feature: As an Existing Customer, I want to be able to select existing Recipient

  Background: Prepaid purchase flow
    Given Existing customer is logged on to the banking App
    And User selects Transact icon
    And User selects Buy button
    And User want to purchase a pre-paid product
#    And Android user should see Carousal for first time
    And Android user should navigate to Provider screen

  @VASSelectExistingRec
  Scenario Outline: Select Existing Recipient to buy Fixed product
    When Android user clicks on "<Provider>"
    Then Android user should navigate to category screen
    And Android user selects "<Category>"
    And Android user selects product from category
    And Android user navigates to Recipient screen
    When Android user want to buy for Existing Recipients
    Then Android user navigates to Recipient Search screen
    And Android user should select "<Recipient>"
    And Android user should navigate to Purchase details screen
    And Android User want to Click on Next Button
    And Android user navigates to payment screen
    And Android User want to Click on Next Button
    And Android user want to review prepaid purchase
    When Android user clicks on Buy
    Then Android user navigates to Success screen
    And Android user want to click on finish
    Then Android user should navigate to App OverView


    Examples:
      |Provider|Category |Recipient|
#      |Mtn|Data |mtn |
      |CellC|Data |cellc |
      |Vodacom|SMS |vodacom1 |
      |Telkom|Voice |Telkom2 |



  @VASBuyOwnAmountForExistRec
  Scenario Outline: Buy Own Amount for New Recipient
    When Android user clicks on "<Provider>"
    Then Android user should navigate to category screen
    And Android user selects "<Category>"
    And Android user selects product from category
    And Android user should navigate to OwnAmount screen
    And Android user want to enter "<OwnAmount>"
    And Android User want to Click on Next Button
    And Android user navigates to Recipient screen
    When Android user want to buy for Existing Recipients
    Then Android user navigates to Recipient Search screen
    And Android user should select "<Recipient>"
    And Android user should navigate to Purchase details screen
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
      |Mtn|Airtime|10|mtn |
      |CellC|Airtime|10|cellc |
      |Vodacom|Airtime|10|vodacom1 |
      |Telkom|Airtime|10|Telkom2 |
      |VirginMobile|Airtime|10|Virgin |

  @VASBuyLandLineOwnAmountForExistRec
  Scenario Outline: Buy Own Amount for New Recipient
    When Android user clicks on "<Provider>"
    Then Android user should navigate to category screen
    And Android user selects "<Category>"
    And Android user selects product from category
    And Android user should navigate to OwnAmount LandLine screen
    And Android user want to enter "<OwnAmount>"
    And Android User want to Click on Next Button
    And Android user navigates to Recipient screen
    When Android user want to buy for Existing Recipients
    Then Android user navigates to Recipient Search screen
    And Android user should select "<Recipient>"
    And Android user should navigate to Purchase details screen
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
      |Telkom|Landline|20|Landline |

