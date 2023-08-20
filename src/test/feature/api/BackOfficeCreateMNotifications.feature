@notifications
Feature: Create Multi Notification

  Background:
    * def createMNotification = read('In-App-Notifications/createBulkIdenticalNotifications.json')
    * configure ssl = { keystore:'In-App-Notifications/certs/NedbankIssuingSHA2.cer' }
    * configure charset = null

  Scenario Outline: Create bulk identical notifications
    Given url InApp_BackOffice_BaseUrl
    And  path 'notifications/shares'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createMNotification =
    """
   {
  "incomingSharedNotificationIdentifiers": [
    {
      "clientIdentity": {
        "clientIdentifier": "<clientIdentifier>",
        "clientIdentifierType": "<clientIdentifierType>"
      },
      "backOfficeNotificationId": "<backOfficeNotificationId1>"
    },
    {
      "clientIdentity": {
        "clientIdentifier": "<clientIdentifier>",
        "clientIdentifierType": "<clientIdentifierType>"
      },
      "backOfficeNotificationId": "<backOfficeNotificationId2>"
    }
  ],
  "notification": {
    "notificationType": "MKT",
    "displayCategory": "Offers",
    "displaySubCategory": "Greenbacks",
        "heading": "Greenbacks",
    "subHeading": "Good news! You <strong>qualify</strong> to join our Greenbacks <strong>loyalty programme</strong>",
    "body": "<p>Earn Greenbacks points when you shop online or swipe your linked Greenbacks card and then choose to redeem your rewards.</p>This will cost you only R20pm. You accept the terms and conditions and monthly fee.",
    "backOfficeNotificationDate": "2019-05-15T11:31:11.6165595+02:00",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": true,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": true,
    "isDirectFlow": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "GreenBackSignUp",
        "additionalParameters": []
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": []
      }
    ],
    "channels": [
      {
        "channel": 100
      }
    ]
  }
}
   """
    And request createMNotification
    When method post
    Then status 201

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | backOfficeNotificationId1                   | backOfficeNotificationId2                   | activeExpiryDate                  | deviceExpiryDate                  |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414407065956     | CIS                  | Shares_281e377f-5b45-4189-8816-98078f77ba83 | Shares_9e55cae2-5bce-4f91-b6d8-8a2df4ae9dcb | 2020-08-22T11:31:11.6165615+02:00 | 2020-08-29T11:31:11.6165631+02:00 |


  Scenario Outline: Create Bulk Tokenised Notifications
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications/tokens'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createMNotification =
    """
   {
  "incomingTokenisedNotificationIdentifiers": [
    {
      "clientIdentity": {
        "clientIdentifier": "<clientIdentifier>",
        "clientIdentifierType": "<clientIdentifierType>"
    },
      "backOfficeNotificationId": "<backOfficeNotificationId>",
      "tokens": [
        {
          "name": "@@fullName",
          "value": "John Smith",
          "type": "BOD"
        }
      ]
    }
  ],
  "notification": {
    "notificationType": "MKT",
    "displayCategory": "Offers",
    "displaySubCategory": "Greenbacks",
    "heading": "Greenbacks",
    "subHeading": "Good news! You <strong>qualify</strong> to join our Greenbacks <strong>loyalty programme</strong>",
    "body": "<p>Hi @@fullName Earn Greenbacks points when you shop online or swipe your linked Greenbacks card and then choose to redeem your rewards.</p>This will cost you only R20pm. You accept the terms and conditions and monthly fee.",
    "backOfficeNotificationDate": "2019-05-15T11:31:11+02:00",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": true,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": true,
    "isDirectFlow": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "GreenBackSignUp",
        "additionalParameters": []
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": []
      }
    ],
    "channels": [
      {
        "channel": 100
      }
    ]
  }
}
   """
    And request createMNotification
    When method post
    Then status 201

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | backOfficeNotificationId                       | activeExpiryDate                  | deviceExpiryDate                  |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414407065956     | CIS                  | Tokenised_4870d5eb-6a74-4e94-952c-fa62f2b9df85 | 2020-08-22T11:31:11.6165615+02:00 | 2020-08-29T11:31:11.6165631+02:00 |

  Scenario Outline: Create Bulk Unique Notifications
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications/uniques'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createMNotification =
    """
     {
  "notifications": [
    {
      "backOfficeNotificationId": "<backOfficeNotificationId>",
      "notificationType": "MKT",
      "clientIdentity": {
        "clientIdentifier": "<clientIdentifier>",
        "clientIdentifierType": "<clientIdentifierType>"
      },
      "displayCategory": "Offers",
      "displaySubCategory": "Greenbacks",
      "heading": "Greenbacks",
      "subHeading": "Good news! You <strong>qualify</strong> to join our Greenbacks <strong>loyalty programme</strong>",
      "body": "<p>Earn Greenbacks points when you shop online or swipe your linked Greenbacks card and then choose to redeem your rewards.</p>This will cost you only R20pm. You accept the terms and conditions and monthly fee.",
      "backOfficeNotificationDate": "2019-05-15T11:31:11.5630714+02:00",
      "activeExpiryDate": "<activeExpiryDate>",
      "deviceExpiryDate": "<deviceExpiryDate>",
      "deliveryPriority": 2,
      "responsePriority": 2,
      "mustTrackFirstRead": true,
      "mustTrackAllReads": false,
      "mustTrackDismiss": true,
      "allowMultipleResponses": false,
      "allowAnonymous": false,
      "mustBlockApp": false,
      "mustPush": true,
      "isDirectFlow": false,
      "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "GreenBackSignUp",
        "additionalParameters": []
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": []
      }
    ],
      "channels": [
        {
          "channel": 100
        }
      ]
    },
    {
      "backOfficeNotificationId": "Uniques_b33f9330-f95a-4ee9-95a8-903ed1cb9f91",
      "notificationType": "MKT",
      "clientIdentity": {
        "clientIdentifier": "414407065956",
        "clientIdentifierType": "CIS"
      },
      "displayCategory": "Offers",
      "displaySubCategory": "Greenbacks",
      "heading": "Greenbacks",
      "subHeading": "Good news! You <strong>qualify</strong> to join our Greenbacks <strong>loyalty programme</strong>",
      "body": "<p>Earn Greenbacks points when you shop online or swipe your linked Greenbacks card and then choose to redeem your rewards.</p>This will cost you only R20pm. You accept the terms and conditions and monthly fee.",
      "backOfficeNotificationDate": "2019-05-15T11:31:11.5630714+02:00",
      "activeExpiryDate": "2020-07-22T11:31:11.5630979+02:00",
      "deviceExpiryDate": "2020-07-29T11:31:11.5630994+02:00",
      "deliveryPriority": 2,
      "responsePriority": 2,
      "mustTrackFirstRead": true,
      "mustTrackAllReads": false,
      "mustTrackDismiss": true,
      "allowMultipleResponses": false,
      "allowAnonymous": false,
      "mustBlockApp": false,
      "mustPush": true,
      "isDirectFlow": false,
      "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "GreenBackSignUp",
        "additionalParameters": []
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": []
      }
    ],
      "channels": [
        {
          "channel": 100
        }
      ]
    }
  ]
}
   """
    And request createMNotification
    When method post
    Then status 201

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | backOfficeNotificationId                       | activeExpiryDate                  | deviceExpiryDate                  |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414407065956     | CIS                  |Uniques_32208e5d-d00c-4603-83d7-12bf96f6c7f7 | 2019-08-22T11:31:11.6165615+02:00 | 2019-08-29T11:31:11.6165631+02:00 |


  Scenario Outline: Testing the create Multiple notifications end point with incorrect BackOffice Token
    Given url InApp_BackOffice_BaseUrl
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When path 'notifications/shares'
    And def createMNotification =
    """
   {
  "incomingSharedNotificationIdentifiers": [
    {
      "clientIdentity": {
        "clientIdentifier": "<clientIdentifier>",
        "clientIdentifierType": <clientIdentifierType>"
      },
      "backOfficeNotificationId": "<backOfficeNotificationId1>"
    },
    {
      "clientIdentity": {
        "clientIdentifier": "414407065956",
        "clientIdentifierType": "CIS"
      },
      "backOfficeNotificationId": "<backOfficeNotificationId2>"
    }
  ],
  "notification": {
    "notificationType": "MKT",
    "displayCategory": "Offers",
    "displaySubCategory": "Greenbacks",
        "heading": "Greenbacks",
    "subHeading": "Good news! You <strong>qualify</strong> to join our Greenbacks <strong>loyalty programme</strong>",
    "body": "<p>Earn Greenbacks points when you shop online or swipe your linked Greenbacks card and then choose to redeem your rewards.</p>This will cost you only R20pm. You accept the terms and conditions and monthly fee.",
    "backOfficeNotificationDate": "2019-05-15T11:31:11.6165595+02:00",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": true,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": true,
    "isDirectFlow": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "GreenBackSignUp",
        "additionalParameters": []
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": []
      }
    ],
    "channels": [
      {
        "channel": 100
      }
    ]
  }
}
   """
    And request createMNotification
    When method post
    Then status 400

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | backOfficeNotificationId1                   | backOfficeNotificationId2                   | activeExpiryDate                  | deviceExpiryDate                  |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414407065956     | CIS                  | Shares_281e377f-5b45-4189-8816-98078f77ba83 | Shares_9e55cae2-5bce-4f91-b6d8-8a2df4ae9dcb | 2019-08-22T11:31:11.6165615+02:00 | 2019-08-29T11:31:11.6165631+02:00 |