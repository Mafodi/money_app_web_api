@notifications
Feature: CreateMultipleAnalytics end point

  Background:
    * configure proxy = "http://172.17.2.12:80"
    * def securityToken = read('TokenStore/api.security.token.txt')

  @client-web
  Scenario Outline: Create Multiple Analytics
    Given url Web_Client_BaseUrl
    And path 'notifications/analytics'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And print 'Saved Token is '+ securityToken
    And header Authorization = 'Bearer '+ securityToken
    And request {analytic: {deviceId: '<deviceId>',deviceDate: '<deviceDate>',analyticValue: '<analyticValue>'},notifications: [{notificationId: '20040'},{notificationId: '30041'}]}
    When method post
    Then status 201
    And print response

    Examples:
      | deviceId         | deviceDate                       | analyticValue |
      | bdb36cbb3856d3ac | 2018-12-13T12:15:11.827102+02:00 | DEL           |
