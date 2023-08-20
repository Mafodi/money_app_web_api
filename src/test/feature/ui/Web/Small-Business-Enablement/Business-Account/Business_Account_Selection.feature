@BusinessAccountRegression
  Feature: Business Account Selection
    Description:
    As a user
    I want to be able to view the different account types I qualify for
    So that I can make an educated decision when applying for my business account

  Background:

    @BUSINESSPAY-AS-YOU-USESelection
    Scenario:  User selects BUSINESS PAY-AS-YOU-USE option
      Given User is on Business Accounts screen
      When  User selects BUSINESS PAY AS YOU USE option on Business Account screen
      Then  User close the browser

    @BUSINESSBUNDLE2Selection
    Scenario: Select BUSINESS BUNDLE 35 option
      Given User is on Business Accounts screen
      When  User selects BUSINESS BUNDLE 35 option
      Then  User close the browser

    @BUSINESSCURRENTACCOUNTSelection
    Scenario: Select BUSINESS CURRENT ACCOUNT OPTION
      Given User is on Business Accounts screen
      When  User selects BUSINESS BUNDLE 60 option
      Then  User close the browser
