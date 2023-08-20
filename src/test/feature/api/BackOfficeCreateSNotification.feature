@notifications
Feature: Create Single Notification
  Background:
    * def createSNotification = read('In-App-Notifications/createSinglePayload.json')
    * configure ssl = { keystore:'In-App-Notifications/certs/NedbankIssuingSHA2.cer' }
    * configure charset = null

  Scenario Outline: Testing the create single notification end point with the correct inputs
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When request createSNotification
    And method post
    Then status 201

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter      |

  Scenario Outline: Testing the create single notification end point with incorrect BackOfficeToken
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When request createSNotification
    And method post
    Then status 400

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4-66 | Walter       |



  Scenario Outline: Testing the create single notification end point with incorrect BackOfficeId
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When request createSNotification
    And method post
    Then status 400

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter1       |
















