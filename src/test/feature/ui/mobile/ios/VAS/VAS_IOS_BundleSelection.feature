@iosRegression
Feature: As an Existing Customer, I want to be able to see the relevant product offerings available for purchase based on my provider and budget

  @VASIOSPrepaidWithFunds
  Scenario Outline: Purchase a pre-paid product with available funds
    Given Existing customer is logged on to the IOS banking App
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And IosUser want to purchase a pre-paid product
    And IosUser must be navigated to By Airtime and Bundles screen
    And IosUser clicks on the Buy New button
    And IosUser should be able select "<Recipient>"
    And IosUser must be navigated to choose operators screen
    And IosUser selects "<Provider>" type
    And IosUser should navigate to Airtime which is default bundle screen
    When IosUser selects recharge "<Recharge_type>"
    Then IosUser must be navigated to relevant product offerings are active

    Examples:
      |Recipient|Provider|Recharge_type|
      |RECIPIENT|PROVIDER|RECHARGE_TYPE|