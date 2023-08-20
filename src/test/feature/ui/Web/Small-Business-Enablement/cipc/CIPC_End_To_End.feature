@CIPCRegression
  Feature: End to End Tests For CIPC Flow
    As a user
    I want to be able to fill in all the required information on the CIPC flow
    so that I can register a company with the CIPC

  Background:

    @CipcEndToEnd
    Scenario: Register A Company Using Pay Later Option
      Given I have logged in successfully
      When  I confirm my personal details and click next to proceed
      And   I then select to register my business with a name
      And   I then provide at least four names for the name reservation process with the CIPC
      And   I now provide the details of my business as requested from the CIPC
      And   I now provide the business address
      And   I now provide shareholder information to enable me obtain a B-BBEE certificate
      And   I now compare the different business bank accounts or choose to skip this process
      And   I then accept the declarations and the terms and conditions as outlined
      And   I click next on payment screen
      And   I select on how I would like to be contacted
      Then  I am shown the success screen indicating that the application was successful

