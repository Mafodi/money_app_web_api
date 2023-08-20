@notifications
Feature: RetrieveNotificationCount end point

  Background:
    * configure proxy = "http://172.17.2.12:80"
    * def securityToken = read('TokenStore/api.security.token.txt')

  @client-web
  Scenario: Retrieve Notification Count
    Given url Web_Client_BaseUrl
    And path '/notifications/counts'
    And param status = 'STO'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And print 'Saved Token is '+ securityToken
    And header Authorization = 'Bearer '+ securityToken
    When method get
    Then status 200

