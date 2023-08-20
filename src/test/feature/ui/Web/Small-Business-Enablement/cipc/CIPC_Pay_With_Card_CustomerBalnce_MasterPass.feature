@CIPCRegression
  Feature: CIPC Pay now with card, customer balance, master pass
    As a user
    i want to able to make the payment instantly with my card
    so that i can make smooth CIPC registration

  Background:

    @PayFromCIPCBalance
    Scenario: Select Pay Now Option - CIPC Balance
      Given I have logged in successfully
      And   I am now on the Declaration Page
      When  I click next on the declaration page
      And   I am now moved to the Payment section and I can see the product cost breakdown
      And   I select the Pay Now option
      And   I click next on payment page
      Then  I am now moved to the Keep In touch With Us section




