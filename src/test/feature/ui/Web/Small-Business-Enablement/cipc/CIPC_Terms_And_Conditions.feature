@CIPCRegression
  Feature: USBE 486 - CIPC: Terms and Conditions
    As a user
    I want to be able to view and confirm the terms and conditions associated with opening my account and CIPC
    So that I can ensure that I meet the bank’s and CIPC’s legal and compliance rules

  Background:

    @AcceptTermsAndConditions
    Scenario: Select/Check All Terms And Conditions
      Given I have logged in successfully
      And   I fill in all required information to get to the declaration page
      When  I select '100%' shareholding, sole business representative, shared address, and accurate information declarations
      And   I click next on the declaration page
      Then  I am now moved to the Payment section and I can see the product cost breakdown
      And   I validate products
