@CIPCRegression
  Feature: USBE-487 CIPC - Business Account Customization
    As a user
    I want to customize my product with extra add-on features
    so that I can have more features with the bundle that I am choosing

  Background:

    @CIPCCustomizeAccount
    Scenario Outline: User Customizes His Business Account
      Given I have logged in successfully
      And   I am now on the Setting Up Your Business Account section
      When  I set the card limits
      And   I select some or all of the optional extras
      And   I select a <card_option> for a business credit card
      And   I click next on this page
      Then  I am now moved to Card Delivery Options Section

      Examples:
        | card_option |
        | No          |
