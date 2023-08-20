@CIPCRegression
  Feature: USBE 511 - CIPC Product Cost Breakdown
    As a user
    I want to view my total cost
    So that I can confirm that I have captured the correct data before proceeding with payment

  Background:

    @ValidateProductsSelected
    Scenario: View Product Cost Breakdown
      Given I have logged in successfully
      And   I am now on the Declaration Page
      When  I click next on the declaration page
      Then  I am now moved to the Payment section and I can see the product cost breakdown
      And   I validate products

