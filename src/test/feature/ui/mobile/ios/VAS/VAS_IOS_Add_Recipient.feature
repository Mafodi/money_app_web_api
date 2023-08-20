@iosRegression
Feature: Adding Mobile Recipient

  @VASAddMobileRecipient
  Scenario: Add New Mobile Recipient IOS

    Given Existing customer is logged on to the IOS banking App
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And IosUser want to purchase a pre-paid product
    #And IosUser must be navigated to By Airtime and Bundles screen
    #And IosUser clicks on the Buy New button
    And IOS user taps on Buy New button
    And IosUser searches for new Recipient
    And Ios User clicks on Add new Recipient button
    And Ios User captures Mobile Number
    When Ios User selects Next button to purchase pre-paid product
    Then Ios User is on Provider Selection Screen
    #Then Ios User should see successful message


  @VASAddMobileRecipient
    Scenario: Recipient Name pulls through to Recipient Name Text field
      Given Existing customer is logged on to the IOS banking App
      And User selects IOS Transact icon
      And User selects IOS Buy button
      And IosUser want to purchase a pre-paid product
      And IosUser must be navigated to By Airtime and Bundles screen
      And IosUser clicks on the Buy New button
      And IosUser searches for new Recipient
      When Ios User clicks on Add new Recipient button
      Then new Recipient name appears in Recipient Name field


  @VASAddMobileRecipient
      Scenario: Edit Recipient name
        Given Existing customer is logged on to the IOS banking App
        And User selects IOS Transact icon
        And User selects IOS Buy button
        And IosUser want to purchase a pre-paid product
        And IosUser must be navigated to By Airtime and Bundles screen
        And IosUser clicks on the Buy New button
        And IosUser searches for new Recipient
        And Ios User clicks on Add new Recipient button
        When IosUser edits Recipient and add new Recipient
        Then Recipient name is updated

  @VASAddMobileRecipient
  Scenario: Enter Valid Recipient Validation
       Given Existing customer is logged on to the IOS banking App
       And User selects IOS Transact icon
       And User selects IOS Buy button
       And IosUser want to purchase a pre-paid product
       And IosUser must be navigated to By Airtime and Bundles screen
       And IosUser clicks on the Buy New button
       And IosUser searches for new Recipient
       And Ios User clicks on Add new Recipient button
       When IosUser removes Recipient name and moves off field
       Then enter recipient validation occurs


  @VASAddMobileRecipient
        Scenario: Enter Valid Phone Number Validation
          Given Existing customer is logged on to the IOS banking App
          And User selects IOS Transact icon
          And User selects IOS Buy button
          And IosUser want to purchase a pre-paid product
          And IosUser must be navigated to By Airtime and Bundles screen
          And IosUser clicks on the Buy New button
          And IosUser searches for new Recipient
          And Ios User clicks on Add new Recipient button
          When IosUser leaves phone number blank
          Then enter phone number validation occurs


  @VASAddMobileRecipient
          Scenario: Invalid phone number Next button disabled
            Given Existing customer is logged on to the IOS banking App
            And User selects IOS Transact icon
            And User selects IOS Buy button
            And IosUser want to purchase a pre-paid product
            And IosUser must be navigated to By Airtime and Bundles screen
            And IosUser clicks on the Buy New button
            And IosUser searches for new Recipient
            And Ios User clicks on Add new Recipient button
            When user enters "0830001112321" for phone number
            Then next button to Add Recipient is disabled





