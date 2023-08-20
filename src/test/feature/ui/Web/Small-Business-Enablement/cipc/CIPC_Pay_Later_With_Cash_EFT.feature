@CIPCRegression
  Feature: CIPC Pay later with EFT
    As s user
    i want to have the option to pay later
    so that if i don't have balance in card i can pay through cash or EFT

  Background:

    @PayLater
    Scenario: Select Pay Later Option
      Given I have logged in successfully
      And   I am now on the Declaration Page
      When  I click next on the declaration page
      And   I am now moved to the Payment section and I can see the product cost breakdown
      And   I select the next button to indicate Pay Later option
      Then  I am now moved to the Keep In touch With Us section
