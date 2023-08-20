@CIPCRegression
  Feature: Edit Director Details On CIPC
    As a User
    I want to be able to edit most of my details
    So that I can update my details with CIPC

  Background:


    @EditPersonalDetails
    Scenario Outline: Edit Personal Details
      Given I have logged in successfully
      And   I am now on the director details page
      When  I click edit on the personal details section
      And   I update the ID number <id_number>, email address <email_address>, and cell phone <cell_phone>
      And   I click close on the personal details section
      And   I click next on director personal details
      Then  I am now on the registration method section

      Examples:
        | id_number      | email_address            | cell_phone |
        | 7407215237082  | nicholasph@nedbank.co.za | 670520582  |

    @EditHomeAddress
    Scenario Outline: Edit Home Address
      Given I have logged in successfully
      And   I am now on the director details page
      When  I click edit on the home address section
      And   I update the home address <home_address>
      And   I click close on the home address section
      And   I click next on director personal details
      Then  I am now on the registration method section

      Examples:
        | home_address        |
        | 38 Lemonwood street |

    @EditPostalAddress
    Scenario Outline: Edit Postal Address
      Given I have logged in successfully
      And   I am now on the director details page
      When  I click edit on the postal address section
      And   I update the postal address <Postal_address>
      And   I click close on the postal address section
      And   I click next on director personal details
      Then  I am now on the registration method section

      Examples:
        | Postal_address      |
        | 38 Lemonwood street |
