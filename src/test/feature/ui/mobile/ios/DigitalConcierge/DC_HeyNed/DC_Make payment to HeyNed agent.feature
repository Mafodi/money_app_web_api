@iosRegression @DC_HeyNedPayment
Feature: Make a payment to HeyNed agent using various pay methods

  @HeyNedMakePaymentDefaultCard
  Scenario Outline: User registration via chat icon having Nedbank Card
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And Received a payment from Hey Jude agent "<taskName>"
    Then click on Pay now button
    Examples:
      |username|password|taskName|
      |Jeet@1720|Jeet@1720|Pay|


  @HeyNedMakePaymentNedbankCard
  Scenario Outline: User can via default card stored in Payment history
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And Received a payment from Hey Jude agent "<taskName>"
    Then click on Pay now button
    And I should redirect to Payment screen
    And select nedbank card to make payment
    And user will be redirected to Payment method screen
    And user can see the list of cards
    And user can select Add another card option
    And user can see two options to add card
    And user click on Nedbank Card Option and select a card
    And Select a nedbank card
    And Enter CVV "<CVV>" and click Next button
    Then click on Pay now button of Payment screen
    And Payment should be successful
    Then click on Done button
    And User should redirect to Task and Payment status changes to Paid
    Examples:
      |username|password|taskName|CVV|
      |greenbank754|Testing2!|Test Mike|1234|



  @HeyNedMakePaymentNonNedbankCard
  Scenario Outline: User can do Payment by adding Non Nedbank card
    Given user is on HeyNed Task screen on login with username "<username>" and password "<password>"
    And Received a payment from Hey Jude agent "<taskName>"
    Then click on Pay now button
    And click added card or click Add payment method to add card
    And user will be redirected to Payment method screen
    And user can select Add another card option
    And user can see two options to add card
    And user can select Enter Card details
    And Add Other bank card details "<CardName>","<CardNo>","<ExpiryDate>"and "<CVV>"
    And click on Add Payment method button
    Then click on Pay now button of Payment screen
    And Payment should be successful
    Then click on Done button
    And User should redirect to Task and Payment status changes to Paid
    Examples:
      |username|password|taskName|CardName|CardNo|ExpiryDate|CVV|
      |greenbank754|Testing2!|Motivate|Test card|424242424242424242|0929|444|

