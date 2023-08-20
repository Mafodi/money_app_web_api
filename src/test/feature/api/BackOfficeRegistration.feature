@notifications
Feature: Add/Update back office Notification Registration

  Background:
    * configure ssl = { keystore:'In-App-Notifications/certs/NedbankIssuingSHA2.cer' }
    * configure charset = null
    * def getId = function(){ return java.util.UUID.randomUUID() + '' }
    * def backOfficeID = "BackOfficeID_"+getId()
    * def backOfficeName = "BO_"+getId()
    * print backOfficeID
    * print backOfficeName

  Scenario Outline: Testing the registration end point on notification with the correct inputs
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications/systems/registrations'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And request {backOfficeId:'#(backOfficeID)',backOfficeName:'#(backOfficeName)'}
    When method post
    Then status 201

    Examples:
      | ibmClientId                          | ibmClientSecret                                    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 |


  Scenario Outline: Testing the registration end point on notification with the incorrect Client-Id
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications/systems/registrations'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And request {backOfficeId:'<backOfficeId>',backOfficeName:'<backOfficeName>'}
    When method post
    Then status 401

    Examples:
      | ibmClientId                             | ibmClientSecret                                     | backOfficeId       | backOfficeName |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac-11 | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK45 | IDNotifications102 | 12Notitication |


  Scenario Outline: Testing the registration end point on notification with the incorrect Client-Secret-Id
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications/systems/registrations'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And request {backOfficeId:'<backOfficeId>',backOfficeName:'<backOfficeName>'}
    When method post
    Then status 401

    Examples:
      | ibmClientId                          | ibmClientSecret                                        | backOfficeId       | backOfficeName |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK45-11 | IDNotifications101 | 12Notitication |



