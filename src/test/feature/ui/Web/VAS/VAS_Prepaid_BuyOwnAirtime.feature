@WebRegression
Feature: Buy prepaid with Own Amount

  @VASBuyOwnAmount
  Scenario Outline: Purchase a pre-paid product with Own Amount
    Given Existing customer logged onto Web
    And User clicks buy button
    When User want to buy prepaid
    Then User should navigate to prepaid screen
    And User want to select Existing "<Recipient>"
    And User want to proceed Next
    And User should navigate to Provider screen
    When User selects "<Provider>"
    Then User should navigate to default provider screen
    And user want to select OwnAmount
    And user should navigate to Own airtime screen
    And user want to enter OwnAmount
    And user clicks on buy
    Then User should navigate to Payment screen
    And User want to crosscheck Own Amount details
    And User want buy product
    And User should see Buy successful message
    And user should navigate to Recent purchases screen



    Examples:
      | Recipient |Provider|
      | recipient |provider|


  @VASBuyOwnAmountValidations
  Scenario Outline: Purchase a pre-paid product with Own Amount
    Given Existing customer logged onto Web
    And User clicks buy button
    When User want to buy prepaid
    Then User should navigate to prepaid screen
    And User want to select Existing "<Recipient>"
    And User want to proceed Next
    And User should navigate to Provider screen
    When User selects "<Provider>"
    Then User should navigate to default provider screen
    And user want to select OwnAmount
    And user should navigate to Own airtime screen
    And buy button should be disabled
    And User should see error message if enter wrong amount
    When user want to enter OwnAmount
    Then Buy button should be enabled
    And user clicks on buy
    And User should navigate to Payment screen

    Examples:
      | Recipient |Provider|
      | recipient |provider|