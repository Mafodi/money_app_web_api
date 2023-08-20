@AndroidRegression @VAS2
Feature: Buy new Voucher with Greenbacks account

  @VASAndroidBuyPrepaidWithGreenbacks
  Scenario Outline: Purchase a Fixed amount Voucher with Greenbacks

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
    When Android user want to buy for Existing Recipients
    Then Android user navigates to Recipient Search screen
    And Android user should select "<Recipient>"
    And Android user should navigate to Purchase details screen
    And Android User want to Click on Next Button
    And Android User should navigate to Voucher payment screen
    And Android user want to buy with another account
    And Android user navigates to payment screen
    And Android User want to Click on Next Button
    And Android user want to review prepaid purchase
    When Android user clicks on Buy
    Then Android user navigates to Success screen
    And Android user want to click on finish
    Then Android user should navigate to App OverView

    Examples:
      | username | password |Provider|Category |Recipient|
#      | cml3023657196@nedbank | Testing2! |Mtn|Data |Mtn1 |
      | cml3023657196@nedbank | Testing2! |Vodacom|SMS |vodacom1 |
      | cml3023657196@nedbank | Testing2! |Telkom|Data |Telkom |
      | cml3023657196@nedbank | Testing2! |CellC|Data |CellC1 |



  @VASAndroidBuyPrepaidOwnAmountWithGreenbacks
  Scenario Outline: Purchase a Own Amount Voucher with Greenbacks

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
    When Android user want to buy for Existing Recipients
    Then Android user navigates to Recipient Search screen
    And Android user should select "<Recipient>"
    And Android user should navigate to Purchase details screen
    And Android User want to Click on Next Button
    And Android User should navigate to Voucher payment screen
    And Android user want to buy with another account
    And Android user navigates to payment screen
    And Android User want to Click on Next Button
    And Android user want to review prepaid purchase
    When Android user clicks on Buy
    Then Android user navigates to Success screen
    And Android user want to do new purchase
    Then Android user should navigate to Provider screen

    Examples:
      | username | password |Provider|Category|OwnAmount |Recipient|
      | cml3023657196@nedbank | Testing2! |Mtn|Airtime|10|Mtn1 |
      | cml3023657196@nedbank | Testing2! |Vodacom|Airtime|10|vodacom1 |
      | cml3023657196@nedbank | Testing2! |Telkom|Airtime|20|Telkom |
      | cml3023657196@nedbank | Testing2! |CellC|Airtime|10|CellC1 |
      | cml3023657196@nedbank | Testing2! |VirginMobile|Airtime|10|Virgin |

  @VASAndroidBuyLandLineOwnAmountWithGreenbacks
  Scenario Outline: Purchase a Own Amount Voucher with Greenbacks

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
    And Android user should navigate to OwnAmount LandLine screen
    And Android user want to enter "<OwnAmount>"
    And Android User want to Click on Next Button
    And Android user navigates to Recipient screen
    When Android user want to buy for Existing Recipients
    Then Android user navigates to Recipient Search screen
    And Android user should select "<Recipient>"
    And Android user should navigate to Purchase details screen
    And Android User want to Click on Next Button
    And Android User should navigate to Voucher payment screen
    And Android user want to buy with another account
    And Android user navigates to payment screen
    And Android User want to Click on Next Button
    And Android user want to review prepaid purchase
    When Android user clicks on Buy
    Then Android user navigates to Success screen
    And Android user want to do new purchase
    Then Android user should navigate to Provider screen

    Examples:
      | username | password |Provider|Category|OwnAmount |Recipient|
      | cml3023657196@nedbank | Testing2! |Telkom|Landline|20|Telkom Landline |
