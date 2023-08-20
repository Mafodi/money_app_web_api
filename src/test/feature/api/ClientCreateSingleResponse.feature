@notifications
Feature: CreateSingleResponse end point

  Background:
    * configure proxy = "http://172.17.2.12:80"
    * def securityToken = read('TokenStore/api.security.token.txt')

  @client-web
  Scenario Outline: Create Single Response
    Given url Web_Client_BaseUrl
    When path 'notifications/19/responses'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And print 'Saved Token is '+ securityToken
    And header Authorization = 'Bearer '+ securityToken
    And request {response: {deviceId: '<deviceID>',deviceDate: '<deviceDate>',responseValue: '<responseValue>','responsePriority': <responsePriority>}}
    When method post
    Then status 201
    And print response

    Examples:
      | deviceID | deviceDate                        | responseValue| responsePriority |
      | aniket-1 | 2018-12-29T15:01:19.6932609+05:30 | 214256       | 1                |


  Scenario Outline: Create Single Response incorrect Client-Secret-Id
    Given url InApp_Client_BaseUrl
    When path 'notifications/19/responses'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientID>'
    And header Authorization = '<authorization>'
    And request {response: {deviceId: 'aniket-1',deviceDate: '2018-12-29T15:01:19.6932609+05:30',responseValue: '214256','responsePriority': 1}}
    When method get
    Then status 401
    And print response

    Examples:
      | ibmClientID                        | authorization          |
      | 6aa93f2e-2d66-48dd-b2c6-b7736283ac | fejksgagfkjhfbksjh,fbw |

  Scenario Outline: Testing CreateSingleResponse end point with incorrect Client-Secret-Id
    Given  url InApp_Client_BaseUrl
    When path 'notifications/19/responses'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientID>'
    And header Authorization = '<authorization>'
    And request {response: {deviceId: 'aniket-1',deviceDate: '2018-12-29T15:01:19.6932609+05:30',responseValue: '214256','responsePriority': 1}}
    When method get
    Then status 401
    And print response

    Examples:
      | ibmClientID                        | authorization          |
      | 6aa93f2e-2d66-48dd-b2c6-b7736283ac | fejksgagfkjhfbksjh,fbw |