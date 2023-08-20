#@notifications
#Feature: RetrieveNotificationCount end point
#
#  Background:
#    * configure proxy = "http://172.17.2.12:80"
#    * def securityToken = read('TokenStore/api.internal.token.txt')
#    * configure ssl = true
#    * def VPN_proxy = 'http://10.74.11.24:3128'
#
#  @web-internal
#  Scenario: Registrations
#    Given url Internal_Web_Client_BaseUrl
#    When path 'notifications/clients/registrations'
#    And header Content-type = 'Application/Json'
#    And header Accept-Encoding = 'Application/Json'
#    And print 'Saved Token is '+ securityToken
#    And header Authorization = 'Bearer '+ securityToken
#    And request {}
#    When method post
#    Then status 201
#
#
#  @web-internal
#  Scenario Outline: Get notifications - Web
#    Given  url Internal_Web_Client_BaseUrl
#    And path 'notifications'
#    And param records = <records>
#    And param page = <page>
#    And header Content-type = 'Application/Json'
#    And header Accept-Encoding = 'Application/Json'
#    And print 'Saved Token is '+ securityToken
#    And header Authorization = 'Bearer '+ securityToken
#    When method get
#    Then status 200
#
#
#    Examples:
#      | records | page |
#      | 10      | 0    |
#
#
#  @web-internal
#  Scenario Outline: Retrieve Notification Count - Web
#    Given  url Internal_Web_Client_BaseUrl
#    And path 'notifications/counts'
#    And param status = <status>
#    And header Content-type = 'Application/Json'
#    And header Accept-Encoding = 'Application/Json'
#    And print 'Saved Token is '+ securityToken
#    And header Authorization = 'Bearer '+ securityToken
#    When method get
#    Then status 200
#
#    Examples:
#      | status |
#      | UNREAD |
#
#  @web-internal
#  Scenario: Get preferences - Web
#    Given  url Internal_Web_Client_BaseUrl
#    And path 'notifications/preferences'
#    And header Content-type = 'Application/Json'
#    And header Accept-Encoding = 'Application/Json'
#    And print 'Saved Token is '+ securityToken
#    And header Authorization = 'Bearer '+ securityToken
#    When method get
#    Then status 200
#
#  @web-internal
#  Scenario Outline: Device registrations - Web
#    Given  url Internal_Web_Client_BaseUrl
#    And path 'notifications/devices/registrations'
#    And header Content-type = 'Application/Json'
#    And header Accept-Encoding = 'Application/Json'
#    And header x-ibm-client-id = '<ibmClientId>'
#    And header x-ibm-client-secret = '<ibmClientSecret>'
#    And print 'Saved Token is '+ securityToken
#    And header Authorization = 'Bearer '+ securityToken
#    And request {registration:{deviceId:'<deviceId>',platform:'AND',fbToken:'android-token-1'}}
#
#    When method post
#    Then status 201
#
#    Examples:
#      | ibmClientId                          | ibmClientSecret                                    | deviceId                                   |
#      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | gyerf45345fc3e543fertbunbdrcrtvtc345tvhdd4 |
#
#
#  @web-internal
#  Scenario Outline: Post preferences - Web
#    Given  url Internal_Web_Client_BaseUrl
#    And path 'preferences'
#    And param deviceId = <deviceId>
#    And header Content-type = 'Application/Json'
#    And header Accept-Encoding = 'Application/Json'
#    And print 'Saved Token is '+ securityToken
#    And header Authorization = 'Bearer '+ securityToken
#    And request {}
#    When method post
#    Then status 201
#
#    Examples:
#      | deviceId |
#      | 3434     |
#
#  @web-internal
#  Scenario Outline: Client registrations - Web
#    Given  url Internal_Web_Client_BaseUrl
#    And path 'preferences'
#    And param deviceId = <deviceId>
#    And header Content-type = 'Application/Json'
#    And header Accept-Encoding = 'Application/Json'
#    And print 'Saved Token is '+ securityToken
#    And header Authorization = 'Bearer '+ securityToken
#    And request {}
#    When method post
#    Then status 201
#
#    Examples:
#      | deviceId |
#      | 3434     |
