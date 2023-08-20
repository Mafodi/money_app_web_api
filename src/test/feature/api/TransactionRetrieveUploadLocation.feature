@notifications
Feature: Transaction notification

  Background:
    * configure ssl = { keystore:'In-App-Notifications/certs/NedbankIssuingSHA2.cer' }
    * configure charset = null

  Scenario Outline: Retrieve upload location
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications/transactions/uploads'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    When def uploadLocation =
       """
       {}
       """
    And request uploadLocation
    When method post
    Then status 201

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       |


