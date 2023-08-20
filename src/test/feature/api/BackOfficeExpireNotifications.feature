@notifications
Feature: Expire Notifications end point

  Background:
    * def ExpireNotificationSchema = {operationReference: '#string',result: '#number',status: '#string',reason: '#string'}
    * configure ssl = { keystore:'In-App-Notifications/certs/NedbankIssuingSHA2.cer' }
    * configure charset = null

  Scenario Outline: Testing Expire Notifications end point with the correct inputs

    Given url InApp_BackOffice_BaseUrl
    And path 'notifications/<backOfficeId>'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    And request {notification:{action:'EXP'}}
    When method put
    Then status 200
    And print response

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       |


  Scenario Outline: Testing Expire Notifications end point with incorrect client-Id
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications/<backOfficeId>'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    When request {notification:{action:'EXP'}}
    And method put
    Then status 401
    And print response

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK45 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       |


  Scenario Outline: Testing Expire Notifications end point with incorrect client-Secret-Id
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications/<backOfficeId>'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And request {notification:{action:'EXP'}}
    When method put
    Then status 400
    And print response

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter1       |

