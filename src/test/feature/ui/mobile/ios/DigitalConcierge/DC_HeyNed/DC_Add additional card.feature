@iosRegression @DC_HeyNedCardManagement
Feature: Add additional card

  @Add_Nedbank_Card
  Scenario Outline: Adding a Nedbank card
    Given user is on HeyNed setting screen on login with username "<username>" and password "<password>"
    And user clicks on Payment methods screen
    And user can see the list of cards
    And user can select Add another card option
    And user can see two options to add card
    And user click on Nedbank Card Option and select a card
    And Select a nedbank card
    And Enter CVV "<CVV>" and click Next button
    Then card should be added as a default card
    Examples:
      |username|password|CVV|
      |greenbank754|Testing2!|1233|


  @Add_NonNedbank_Card
  Scenario Outline: Adding a card as a default card at the time of subscription
    Given user is on HeyNed setting screen on login with username "<username>" and password "<password>"
    And user clicks on Payment methods screen
    And user can see the list of cards
    And user can select Add another card option
    And user can see two options to add card
    And user can select Enter Card details
    And Add Other bank card details "<CardName>","<CardNo>","<ExpiryDate>"and "<CVV>"
    And switch on the toggle button for Default card option
    And click on Add Payment method button
    Then card should be added as a default card
    Examples:
      |username|password|CardName|CardNo|ExpiryDate|CVV|
      |Jeet@1720|Jeet@1720|Test card|424242424242424242|0929|444|

#functionality is not in scope now.
  @Add_NonDefault_Card
  Scenario Outline: Adding a card as a non default card at the time of subscription
    Given user is on HeyNed setting screen on login with username "<username>" and password "<password>"
    And user clicks on Payment methods screen
    And user can see the list of cards
    And user can select Add another card option
    And user can see two options to add card
    And user can select Enter Card details
    And Add Other bank card details "<CardName>","<CardNo>","<ExpiryDate>"and "<CVV>"
    And click on Add Payment method button
    Then card should be added as a non default card
    Examples:
      |username|password|CardName|CardNo|ExpiryDate|CVV|
      |testuser341|Jeet@1720|Non Default card|424242424242424242|0929|444|