@AndroidRegression @VAS1
Feature: Buy new Prepaid with different funds accounts


  @VASAndroidBuyWithFunds
  Scenario Outline: Purchase a new Prepaid with Sufficient funds
    Given user launch the money app
    When user enters a username "<username>" and password "<password>" for first login
    Then user should be on the welcome pageB
    And User selects Transact icon
    And User selects Buy button
    And User want to purchase a pre-paid product
#    And Android user should see Carousal for first time
    And Android user should navigate to Provider screen
    When Android user clicks on "<Provider>"
    Then Android user should navigate to category screen
    And Android user selects "<Category>"
    And Android user selects product from category
    And Android user navigates to Recipient screen
    And Android user want to add new "<Recipient>"
    And Android User want to Click on Next Button
    And Android user navigates to payment screen
    When Android user want to select other Account with funds
    And Android user should check buy button is enabled

    Examples:
      | username | password |Provider|Category |Recipient|
      | cml3008400230@nedbank | Test@123 |Mtn|Data |27634041500 |

  @VASAndroidWithOutFunds
  Scenario Outline: Purchase a new Prepaid with Insufficient funds

    Given user launch the money app
    When user enters a username "<username>" and password "<password>" for first login
    Then user should be on the welcome pageB
    And User selects Transact icon
    And User selects Buy button
    And User want to purchase a pre-paid product
#    And Android user should see Carousal for first time
    And Android user should navigate to Provider screen
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
    When Android user want to select other Account with Insufficient Funds
    And Android user should check buy button is disabled
    And Android user want to buy with sufficient funds account
    And Android user should check buy button is enabled

    Examples:
      | username | password |Provider|Category|OwnAmount |Recipient|
      | cml3008400230@nedbank | Test@123 |Mtn|Airtime|10|27634041500 |