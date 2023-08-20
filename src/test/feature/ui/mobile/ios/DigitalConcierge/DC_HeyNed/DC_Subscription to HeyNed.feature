@iosRegression @DC_HeyNedSubscription
Feature: Subscribe to HeyNed lifestyle service

  @DC_FreeSubscription
  Scenario Outline: Free Subscribe to HeyNed lifestyle service
    Given user is on HeyNed Subscription screen on login with username "<username>" and password "<password>"
    And click on Next Button on subscription screen
    And Registration form should be displayed
    And user enters valid "<Name>","<Surname>","<ContactNumber>","<EmailAddress>"
    And click on Next button on Registration form
    Then Success screen should be displayed
    Examples:
      |username|password|Name|Surname|ContactNumber|EmailAddress|
      |DCtest106|Test@1234|charlffeee|brownff|0834422777|test@asa.co.eea|

  @Subscription_with_Non_Nedbank_Card
  Scenario Outline: Subscribe to HeyNed lifestyle service using Non Nedbank Card
    Given user is on HeyNed Subscription screen on login with username "<username>" and password "<password>"
    And click on Next Button on subscription screen
    And Registration form should be displayed
    And user enters valid "<Name>","<Surname>","<ContactNumber>","<EmailAddress>"
    And click on Next button on Registration form
    And user can select Add another card option
    And Add Other bank card details "<CardName>","<CardNo>","<ExpiryDate>"and "<CVV>"
    And click on Add Card button
    And Review Subscription screen should be displayed
    And click on Subscribe button
    Then Success screen should be displayed
    Examples:
      |username|password|Name|Surname|ContactNumber|EmailAddress|SelectNedbankCard|CVV|CardName|CardNo|ExpiryDate|CVV|
      |testuser344|Jeet@1720|John|peter|0834240110|tetetets@nednk.co.eea|true|2222|Default card|424242424242424242|0929|444|

  @Subscription_with_Nedbank_Card
  Scenario Outline: Subscribe to HeyNed lifestyle service using Nedbank card
    Given user is on HeyNed Subscription screen on login with username "<username>" and password "<password>"
    And click on Next Button on subscription screen
    And Registration form should be displayed
    And user enters valid "<Name>","<Surname>","<ContactNumber>","<EmailAddress>"
    And click on Next button on Registration form
    Then user should be successfully registered and payment screen should be displayed
    And I can see all the Nedbank cards present in the profile
    And Select a nedbank card for payment
    And Enter CVV "<CVV>" and click on Next button
    And Review Subscription screen should be displayed
    And click on Subscribe button
    Then Success screen should be displayed
    Examples:
      |username|password|Name|Surname|ContactNumber|EmailAddress|CVV|
      |econonres1|Jeet@1720|John|peter|0834450400|tedsds@nedbankco.za.za|444|


  @Subscription_Terms&Conditions
  Scenario Outline: View Terms and Conditions for HeyNed on Subscription screen
    Given user is on HeyNed Subscription screen on login with username "<username>" and password "<password>"
    And user should be able to see T&C button
    Then user should be able to see Terms and Conditions screen for Heyjude
    Examples:
      |username|password|
      |testuser344|Jeet@1720|
