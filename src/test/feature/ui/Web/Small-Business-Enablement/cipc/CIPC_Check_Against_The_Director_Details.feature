@CIPCRegression
  Feature: USBE-554 CIPC Check Against The Director Details
    As a business owner
    I want CIPC to automatically perform a check against my ID number
    So that it can validate that I am a qualified director

    Background:

    @VerifyDetails
    Scenario Outline: Director Details Cannot be Verified
      Given I have logged in successfully with these credentials <username> and <password>
      When  I click next on director details
      Then  I am now shown a message that CIPC details cannot be verified

      Examples:
        | username     | password     |
        | SbeTestDec02 | Password123! |
