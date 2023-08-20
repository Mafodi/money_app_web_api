@WebRegression
Feature: Buy Prepaid to Existing Recipient

  @VASBuyPrepaidFixedProduct
  Scenario Outline: Purchase a pre-paid product on web with available funds
    Given Existing customer logged onto Web
    And User clicks buy button
    When User want to buy prepaid
    Then User should navigate to prepaid screen
    When User selects "<Provider>"
    And user able to select "<Category>"
    When User want select Prepaid Product
    Then User navigates to Recipient screen
    And User want to buy prepaid for new Recipient
    And User want to click Next




    And User want to add new "<Recipient>" name
    And User want to add "<MobileNumber>"
#    And User want to select Existing "<Recipient>"
    And User want to proceed Next
    And User should navigate to Provider screen
    When User selects "<Provider>"
    Then User should navigate to default provider screen
    And user able to select "<Category>"
    When User want select Prepaid Product
    Then User should navigate to Payment screen
    And User want to review all Recipient details
#    And User want buy product
#    And User should see Buy successful message
#    And user should navigate to Recent purchases screen


    Examples:
      | Recipient |MobileNumber|Provider|Category|
      |VodacomTest|0829988002  |Vodacom |Data    |


  @VASBuyPrepaidWithFundsValidations
  Scenario Outline: Purchase a pre-paid product on web with available funds
    Given Existing customer logged onto Web
    And User clicks buy button
    When User want to buy prepaid
    Then User should navigate to prepaid screen
    And User want to select Existing "<Recipient>"
    And User want to proceed Next
    And User should navigate to Provider screen
    When User selects "<Provider>"
    Then User should navigate to default provider screen
    And user able to select "<Category>"
#    When User want select "<PrepaidProduct>"
    Then User should navigate to Payment screen
    And buy button should be disabled
    And User want to review all Recipient details
    Then Buy button should be enabled
    And User want buy product
    And User should see Buy successful message
    And user should navigate to Recent purchases screen


    Examples:
      | Recipient |Provider|Category|PrepaidProduct|
      | recipient |provider|category|Product       |