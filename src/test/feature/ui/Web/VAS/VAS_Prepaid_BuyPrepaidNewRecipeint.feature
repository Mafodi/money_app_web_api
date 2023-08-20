@WebRegression
Feature: Buy Prepaid to New Recipient

  @VASBuyPrepaidNewRecipient
  Scenario Outline: Purchase a pre-paid product on web with available funds for new Recipient
    Given Existing customer logged onto Web
    And User clicks buy button
    When User want to buy prepaid
    Then User should navigate to prepaid screen
    And User want to add "<NewRecipient>"
    And User enter "<MobileNum>"
    And User want to proceed Next
    And User should navigate to Provider screen
    When User selects "<Provider>"
    Then User should navigate to default provider screen
    And user able to select "<Category>"
    When User want select "<PrepaidProduct>"
    Then User should navigate to Payment screen
    And User want to crosscheck new Recipient details
    And User want buy product
    And User want to logout from Online banking
    And user navigate to Login screen

    Examples:
      | NewRecipient |MobileNum|Provider|Category|PrepaidProduct|
      | newRecipient |mobileNum|provider|category|Product       |


  @VASBuyPrepaidNewRecipientValidations
  Scenario Outline: Purchase a pre-paid product on web with available funds for new Recipient
    Given Existing customer logged onto Web
    And User clicks buy button
    When User want to buy prepaid
    Then User should navigate to prepaid screen
    And User want to add "<NewRecipient>"
    And User enter "<MobileNum>"
    And User want to proceed Next
    And User should navigate to Provider screen
    When User selects "<Provider>"
    Then User should navigate to default provider screen
    And user able to select "<Category>"
    When User want select "<PrepaidProduct>"
    Then User should navigate to Payment screen
    And buy button should be disabled
    And User want to crosscheck new Recipient details
    Then Buy button should be enabled
    And User want buy product
    And User want to logout from Online banking
    And user navigate to Login screen

    Examples:
      | NewRecipient |MobileNum|Provider|Category|PrepaidProduct|
      | newRecipient |mobileNum|provider|category|Product       |