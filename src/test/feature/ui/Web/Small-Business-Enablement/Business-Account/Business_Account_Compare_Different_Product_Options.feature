@BusinessAccountRegression
  Feature: Card Delivery Preference: Branch Delivery
    Description:
    I want to make a comparison of multiple product offers
    So that I will be able to make an informed decision while selecting the best product/account for my business

  Background:

    @CompareDifferentProducts
    Scenario: Compare different account types
      Given User is on Business Accounts screen
      When  User clicks on Compare accounts button
      Then  User compares information between BUSINESS BUNDLE and BUSINESS CURRENT ACCOUNT




