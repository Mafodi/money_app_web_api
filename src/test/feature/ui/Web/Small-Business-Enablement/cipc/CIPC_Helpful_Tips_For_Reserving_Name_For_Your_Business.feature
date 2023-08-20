@CIPCRegression
  Feature: USBE-454 Helpful Tips For Reserving Name For Your Business
    Description:
    As a user I want to get the helpful tips while reserving name for my business
    so that I can select suitable name and make informed decision

  Background:

    @HelpfulTips
    Scenario: Click on Helpful Links To See Description
      Given I have logged in successfully
      And   I am now on the reserve a name for your business page
      When  I see the helpful tips panel and click on any one of the links
      Then  I will see the description open up
