@notifications
Feature: Add/Update Client Notification Registration

  Background:
    * configure proxy = "http://172.17.2.12:80"
    * def securityToken = read('TokenStore/api.security.token.txt')

  @client-web
  Scenario: Registrations
    Given url Web_Client_BaseUrl
    When path 'notifications/clients/registrations'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And print 'Saved Token is '+ securityToken
    And header Authorization = 'Bearer '+ securityToken
    And request {}
    When method post
    Then status 201