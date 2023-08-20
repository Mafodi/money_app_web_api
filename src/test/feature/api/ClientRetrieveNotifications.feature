@notifications
Feature: Retrieve Notification end point

  Background:
    * configure proxy = "http://172.17.2.12:80"
    * def securityToken = read('TokenStore/api.security.token.txt')

  @client-web
  Scenario Outline: Retrieve Notification
    Given url Web_Client_BaseUrl
    And path 'notifications'
    And param page = <page>
    And param records = <records>
    And header x-ibm-client-id = '<ibmClientId>'
    And header Authorization = '<authorization>'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And print 'Saved Token is '+ securityToken
    And header Authorization = 'Bearer '+ securityToken
    When method get
    Then status 200

    Examples:
      | page | records | ibmClientId                          | authorization                                      |
      | 0    | 2       | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 |
