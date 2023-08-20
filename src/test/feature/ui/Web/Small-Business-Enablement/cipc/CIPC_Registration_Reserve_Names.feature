@CIPCRegression
  Feature: USBE-216 CIPC Registration - Reserve 4 Possible Business Names
    As a user
    I want to give options to register my business
    so that I can reserve it as my preferred business name and get helpful tips for name registration

  Background:

    @RegisterUsingUniqueNames
    Scenario: Reserve Four Possible Business Names - No Error
      Given I have logged in successfully
      And   I am now on the reserve a name for your business page
      When  I enter the four business names for reservation
      Then  I see all the reserved names are valid and a message is displayed below every field

    @RegisterUsingExistingNames
    Scenario: Reserve Four Possible Business Names - Error Shown
      Given I have logged in successfully
      And   I am now on the reserve a name for your business page
      When  I enter the four business names for reservation
      Then  I see all the reserved names are invalid with a red color and a message is displayed below every field
