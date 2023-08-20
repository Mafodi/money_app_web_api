@notifications
Feature: RetrieveSNotification end point

  Background:
    * configure ssl = { keystore:'In-App-Notifications/certs/NedbankIssuingSHA2.cer' }
    * configure charset = null

  Scenario Outline: Testing the RetrieveSNotification end point with the correct inputs
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications/<notificationId>/analytics'
    And param records = 2
    And param page = 0
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When method get
    Then status 200
    And print response

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | notificationId |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | EMINotif9006   |

  Scenario Outline: Testing the RetrieveSNotifications end point with the incorrect Client-Secret-Id
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications/<notificationId>/analytics'
    And param records = 2
    And param page = 0
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When method get
    Then status 400
    And print response

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | notificationId |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4-11 | Walter       | EMINotif9006   |

  Scenario Outline: Testing the RetrieveSNotifications end point with the incorrect Client-Secret-Id
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications/<notificationId>/analytics'
    And param records = 2
    And param page = 0
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When method get
    Then status 400
    And print response

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | notificationId |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter1       | EMINotif9006   |
