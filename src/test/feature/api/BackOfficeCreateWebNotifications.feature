@notifications
Feature: Create web notifications

  Background:
    * def createSNotification = read('In-App-Notifications/createSinglePayload.json')
    * configure ssl = { keystore:'In-App-Notifications/certs/NedbankIssuingSHA2.cer' }
    * configure charset = null
    * def getId = function(){ return java.util.UUID.randomUUID() + '' }
    * def uuid = getId()
    * print uuid

  @back-office-web
  Scenario Outline: Download app notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },
    "displayCategory": "Offers",
    "displaySubCategory": "Download Money App",
    "heading": "Download Money App",
    "subHeading": "Dear Nomhle Mazibuko, As an online banking customer <strong> </strong> <strong></strong>",
      "body": "<p>Who has not downloaded the app</p> You can download it when loggin in to online banking",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
               "responseOptions": [
                              {
        "type": "ULP",
        "label": "Done",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
     "channels": [

      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |

  @back-office-web
  Scenario Outline: Create DC chat message
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },
    "displayCategory": "Offers",
    "displaySubCategory": "DC Chat",
    "heading": "DC Chat",
    "subHeading": "Good news! Walter, you can chat to our consultant via Nedbank App <strong> </strong> <strong></strong>",
      "body": "<p>You can send out issues you experience, or any questions you might have </p> The consultant will assist, as you are our valuable customer",
    "backOfficeNotificationDate": "2018-12-20T15:01:19",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "OpenInvestmentAccount",
        "additionalParameters": [
          {
            "name": "param_birth_date",
            "value": "1982-02-02"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create tax-free message
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },
     "displayCategory": "Offers",
    "displaySubCategory": "Tax Free",
    "heading": "Tax Free",
    "subHeading": "Dear Nomhle Mazibuko, Your Tax Free Savings account <strong> </strong> <strong></strong>",
      "body": "<p>You have almost reached the annual limit of R 33 000.00 on your Tax-free Savings </p> The consultant will assist, as you are our valuable customer",
    "backOfficeNotificationDate": "2018-12-20T15:01:19",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
		{
        "type": "ALP",
        "label": "Done",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Re-Invest and Payout notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },
    "displayCategory": "Offers",
    "displaySubCategory": "Re-Invest or Payout",
    "heading": "Re-Invest or Payout",
    "subHeading": "Dear Nomhle Mazibuko, your account will mature on the 25th of August <strong></strong> <strong> </strong>",
      "body": "<p> Please login and choose Re-Invest or do a PayOut App</p> You can do it at the comfort of your own home without going to the branch ",
        "backOfficeNotificationDate": "2018-12-20T15:01:19",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
   "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
"responseOptions": [
      {
        "type": "ALP",
        "label": "Reinvest",
        "value": "1",
        "action": "ReInvest",
        "additionalParameters": [
           {
            "name": "AccountNumber",
            "value": "1012472612"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "Payout",
        "value": "2",
        "action": "PayOut",
         "additionalParameters": [
           {
            "name": "AccountNumber",
            "value": "1012472612"
          }
        ]
      }
    ],

    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Home Loan Enrolment notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },
 "displayCategory": "Offers",
    "displaySubCategory": "Home Loan Enrolment",
    "heading": "Home Loan Enrolment",
    "subHeading": "Dear Nomhle Mazibuko<strong></strong> Your Home Loan is Pre-Approved <strong></strong>",
    "body": "<p>You are closer to the step of having your Home Loan approved on the final stages</p>Enjoy Nedbank services",
        "backOfficeNotificationDate": "2018-12-20T15:01:19",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
   "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "HomeLoanEnrollment",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Home Loan Property notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },
  "displayCategory": "Offers",
    "displaySubCategory": "Home Loan Property",
    "heading": "Home Loan Property",
    "subHeading": "Dear Nomhle Mazibuko<strong></strong> Your Home Loan is Pre-Approved <strong></strong>",
    "body": "<p>You are closer to the step of having your Home Loan approved on the final stages</p>Enjoy Nedbank services",
       "backOfficeNotificationDate": "2018-12-20T15:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "HomeLoanPropertyInsights",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |

  @back-office-web
  Scenario Outline: Create Greenbags notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },
   "displayCategory": "Offers",
    "displaySubCategory": "Greenbacks SignUp",
    "heading": "Greenbacks SignUp",
    "subHeading": "Good news! Nomhle Mazibuko, you qualify to join our Greenbacks loyalty programme <strong> </strong> <strong> </strong>",
      "body": "<p>Earn Greenbacks points when you shop online or swipe your linked Greenbacks card and then choose to redeem your rewards. </p>This will cost you only R20pm. You accept the terms and conditions and monthly fee.",
       "backOfficeNotificationDate": "2018-12-20T15:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
   "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "GreenBackSignUp",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Activate Cards notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

   "displayCategory": "Offers",
    "displaySubCategory": "Activate Cards",
    "heading": "Activate Cards",
    "subHeading": "Good news! Nomhle Mazibuko, you have an option to activate your card <strong></strong> <strong> </strong>",
      "body": "<p> You as a customer has an option to activate your card on Money App</p> You can do it at the comfort of your own home without going to the branch ",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "ActivateCard",
        "additionalParameters": [
          {
            "name": "CardNumber",
            "value": "4922130000755290"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Buy airtime notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

   "displayCategory": "Offers",
    "displaySubCategory": "Buy Airtime",
    "heading": "Buy Airtime",
    "subHeading": "Good news! Nomhle Mazibuko, you qualify to buy airtime with your Greenbacks loyalty points <strong> </strong> </strong>",
      "body": "<p>You can now buy airtime, data, even electricity with your Greenbacks loyalty points</p> You can only do that on our Nedbank Money App.",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "BuyFlow",
        "additionalParameters": [
          {
            "name": "param_birth_date",
            "value": "1990-03-21"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Annual Credit Review notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

  "displayCategory": "Offers",
    "displaySubCategory": "Annual Credit Review",
    "heading": "Annual Credit Review",
    "subHeading": "Good news! Nomhle Mazibuko, you have an option to opt in for automatic Annual Credit Limit increase <strong></strong> <strong> </strong>",
      "body": "<p> You as a customer has an option to opt in for automatic Annual Credit Limit increase </p> You can do it at the comfort of your own home without going to the branch ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "CreditLimitReview",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create eStatements notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

   "displayCategory": "Offers",
    "displaySubCategory": "eStatements",
    "heading": "eStatements",
    "subHeading": "Good news! You As a customer can now view your e-Statements using Nedbank’s Money App<strong> </strong> <strong> </strong>",
      "body": "<p> You as a customer have an option sign up for eStatements and get informed of </p> You can change your statement delivery method the comfort of your own home without going to the branch ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "StatementDeliveryPreference",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "1012472612"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create freeze card notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

   "displayCategory": "Offers",
    "displaySubCategory": "Block/Unblock Cards",
    "heading": "Block/Unblock Cards",
    "subHeading": "Good news! Nomhle Mazibuko, you can freeze or unfreeze your card using Nedbank’s Money App<strong> </strong><strong>Your card</strong>",
      "body": "<p>As a user you can freeze or unfreeze your card at the comfort of your own space </p>Your card maybe stolen or misplaced. You can only do that on our Nedbank Money App.",
       "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "CardFreeze",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}


      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create investments notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

   "displayCategory": "Offers",
    "displaySubCategory": "Investment",
    "heading": "Investment",
    "subHeading": "Good news! Nomhle Mazibuko, you qualify to open any Investment account <strong> </strong> <strong></strong>",
      "body": "<p>You can now make your money work for you </p> by opening new investment account",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "OpenInvestmentAccount",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}


      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Pre Approved Offers notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

    "displayCategory": "Offers",
    "displaySubCategory": "Pre-Approved Offers",
    "heading": "Pre-Approved Offers",
    "subHeading": "Good news! Nomhle Mazibuko, you qualify to receive offers from Nedbank that are available to you <strong> </strong> <strong> </strong>",
      "body": "<p> You as a customer you will be informed of the day to day offers that you qualify for, so that you can be aware of the offers available to you</p> You can do it at the comfort of your own home without going to the branch ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
         "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "PreApprovedOffers",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |

  @back-office-web
  Scenario Outline: Create Uplift Dormancy notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

    "displayCategory": "Offers",
    "displaySubCategory": "Uplift Dormancy",
    "heading": "Uplift Dormancy",
   "subHeading": "Good news! Nomhle Mazibuko, you can activate your Dormant account using Nedbank’s Money App<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer has an option to activate your dormant account on Money App</p> You can do it at the comfort of your own home without going to the branch ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "UpliftDormancy",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "1067499466"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Debit order listing  notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

      "displayCategory": "Offers",
    "displaySubCategory": "Debit Order Listing",
    "heading": "Debit Order Listing",
    "subHeading": "Dear! Nomhle Mazibuko, Did you know you can keep track on your debit order? <strong> </strong> <strong> </strong>",
      "body": "<p>By clicking this notification you can be able to view your debit order listing to check the transactions</p> Nedbank Money App, let it work for you",
    "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "DebitOrderList",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "1012472612"

          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Report fraud notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

      "displayCategory": "Offers",
    "displaySubCategory": "How to Report Fraud",
    "heading": "How to Report Fraud",
    "subHeading": "Good news! Nomhle Mazibuko, you can now report fraud<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer has an option to report fraud via online banking, any malicious acts that you are suspecious of</p> You can do it at the comfort of your own home without going to the branch ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "ReportFraud",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "2278043684"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create HeyNed SignUp notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

       "displayCategory": "Offers",
    "displaySubCategory": "Hey Ned SignUp",
    "heading": "Hey Ned SignUp",
    "subHeading": "Good news! Desmond Manci, you can now sign up on Hey Ned<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer have an option sign up for hey ned services, so you can start enjoying the benefits</p> You can do it at the comfort of your own home without going to the branch ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "HeyNedSignUp",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"


  @back-office-web
  Scenario Outline: Create SASBO Strike notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

      "displayCategory": "Offers",
    "displaySubCategory": "SASBO Strike Alert",
    "heading": "SASBO Strike Alert",
    "subHeading": "Good news! Nomhle Mazibuko, you can use the app as an alternative channel during strike<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer you will not be impacted on your banking </p> Nedbank's Money App ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "Transact",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "1012472612"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Salary Switching notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

      "displayCategory": "Offers",
     "displaySubCategory": "Salary Account Switching",
    "heading": "Salary Account Switching",
    "subHeading": "Good News Nomhle Mazibuko, Did You Know that as a client who is noy currently main banker with Nedbank  <strong> </strong> <strong></strong>",
      "body": "<p>You can do a Salary Switch, here are the steps on how to do the salary switching on Money Web</p>First you request a salary switch letter online, you can do it without visiting the branch",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "SalaryAccountSwitching",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "1012472612"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Savings pocket notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

      "displayCategory": "Offers",
    "displaySubCategory": "Set up Savings Pocket",
    "heading": "Set up Savings Pocket",
    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank client you can open a savings pocket<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer can now use Money app to open up savings pocket</p> Nedbank's Money App,let it work for you ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "SetupSavingPocket",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "2278043684"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Redeem GB Charges&Fees notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

       "displayCategory": "Offers",
    "displaySubCategory": "Redeem GB Charges & Fees",
    "heading": "Redeem GB Charges & Fees",
    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank client who always travels over seas<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer can now use your card over seas you can now Redeem your GB charges and fees</p> Nedbank's Money App ",
    "activeExpiryDate": "2020-02-15T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "RedeemCharges",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Redeem Forex notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

          "displayCategory": "Offers",
    "displaySubCategory": "Redeem Forex",
    "heading": "Redeem Forex",
    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank client who always travels over seas<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer can now use your card over seas you can now Redeem your GB forex</p> Nedbank's Money App ",
    "activeExpiryDate": "2020-02-15T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

        "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "RedeemForex",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Balance Peek notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

         "displayCategory": "Offers",
    "displaySubCategory": "Balance Peek",
    "heading": "Balance Peek",
    "subHeading": "Good news! Nomhle Mazibuko, you have an option to check your balance peek <strong></strong> <strong> </strong>",
      "body": "<p> You as a customer you can see the balance of any account linked to your profile on Money App</p> You can do it at the comfort of your own home without going to the branch ",
     "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

        "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "BalancePeek",
        "additionalParameters": [
          {
            "name": "CardNumber",
            "value": "4922130000755290"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
        ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |

  @back-office-web
  Scenario Outline: Create Activate Oversears Travel notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

     "displayCategory": "Offers",
    "displaySubCategory": "Activate Overseas Travel Cards",
    "heading": "Activate Overseas Travel Cards",
    "subHeading": "Good news! Nomhle Mazibuko, you have an option to activate your card <strong></strong> <strong> </strong>",
     "body": "<p> You as a customer has an option to activate your card on Money App</p> You can do it at the comfort of your own home without going to the branch ",
     "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

      "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "ActivateOverseasTravelCard",
        "additionalParameters": [
          {
            "name": "CardNumber",
            "value": "377096000042716"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
        ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Share app notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

          "displayCategory": "Offers",
    "displaySubCategory": "Share App",
    "heading": "Share App",
    "subHeading": "Good news! You can share the app via Money App",
    "body": "<p>You can now share the app with your family and friends via social media platforms.</p> You can do that right now on our Nedbank Money App.",
    "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

      "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
		{
        "type": "ALP",
        "label": "Continue",
        "value": "2",
        "action": "ShareMoneyApp",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Scan to pay notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

       "displayCategory": "Offers",
    "displaySubCategory": "Scan to Pay",
    "heading": "Scan to Pay",
    "subHeading": "Dear Nomhle Mazibuko, Your can use a scan to pay feature <strong> </strong> <strong></strong>",
      "body": "<p>You can use it on your money app</p> In the comfort of your own home.",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

        "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
		{
        "type": "ALP",
        "label": "Done",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}


      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Create Send iMali notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

       "displayCategory": "Offers",
    "displaySubCategory": "Send iMali",
    "heading": "Send iMali",
    "subHeading": "Good news! Nomhle Mazibuko, you have an option to do payments on your account <strong></strong> <strong> </strong>",
      "body": "<p> You as a customer you can send money to family and friends by account or phone number on Money App</p> You can do it at the comfort of your own home without going to the branch ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

      "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "PayToMobile",
        "additionalParameters": [
          {
            "name": "CardNumber",
            "value": "4922130000755290"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
        ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Automatic Payment Order notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

      "displayCategory": "Offers",
    "displaySubCategory": "Automatic Payment Order",
    "heading": "Automatic Payment Order",
    "subHeading": "Good news! Nomhle Mazibuko, you have an option to do an automatic Payment Order <strong></strong> <strong> </strong>",
      "body": "<p> You as a customer has an option to automatic Payment Order on Money App</p> You can do it at the comfort of your own home without going to the branch ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "AutomaticPaymentOrder",
        "additionalParameters": [
          {
            "name": "CardNumber",
            "value": "4922130001117078"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Redeem GB Donations notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

      "displayCategory": "Offers",
    "displaySubCategory": "Redeem GB Donations",
    "heading": "Redeem GB Donations",
    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank client who always travels over seas<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer can now use your card over seas you can now Redeem your GB Donations</p> Nedbank's Money App ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "RedeemDonations",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "2278043684"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline:Financial planner notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

         "displayCategory": "Offers",
    "displaySubCategory": "Financial Planner",
    "heading": "Financial Planner",
    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank client you can do your Financial Planning<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer can now do your financial planning without going to the branch</p> Nedbank's Money App ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "ApplyFinancialPlanner",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "2278043684"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Feedback notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

         "displayCategory": "Offers",
    "displaySubCategory": "Feedback",
    "heading": "Feedback",
    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank client you can send Feed back via Money App<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer can now use your by sending gfeedback use the feature without going to the branch</p> Nedbank's Money App ",
     "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "FeedBack",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "2278043684"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Add Receipient notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

         "displayCategory": "Offers",
    "displaySubCategory": "Add Recepient",
    "heading": "Add Recepient",
    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank client you can add recepients<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer can now use your add recepients so that you can use the feature without going to the branch</p> Nedbank's Money App ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "AddRecipient",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "2278043684"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Profile limit notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

          "displayCategory": "Offers",
    "displaySubCategory": "Profile Limits",
    "heading": "Profile Limits",
    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank client you can change your profile limits<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer can now  change your profile limits at the comfort of your own home</p> Nedbank's Money App ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

      "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "ProfileLimits",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "2278043684"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Hide and show notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

    "displayCategory": "Offers",
    "displaySubCategory": "Hide and Show",
    "heading": "Hide and Show",
    "subHeading": "Good news! Nomhle Mazibuko, you can Hide and Show your accounts using Nedbank’s Money App<strong> </strong><strong>Your card</strong>",
     "body": "<p>As a user you can freeze or unfreeze your card at the comfort of your own space </p>Your card maybe stolen or misplaced. You can only do that on our Nedbank Money App.",
     "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

      "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "HideAndShow",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "2278043684"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Atm limits notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

          "displayCategory": "Offers",
    "displaySubCategory": "ATM Limits",
    "heading": "ATM Limits",
    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank client you can change your ATM limits<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer can now  change your ATM limits at the comfort of your own home</p> Nedbank's Money App ",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

       "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "AtmLimits",
        "additionalParameters": [
          {
            "name": "CardNumber",
            "value": "4922130000755290"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Debit order switching notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

            "displayCategory": "Offers",
    "displaySubCategory": "DebitOrderSwitching",
    "heading": "DebitOrderSwitching",
    "subHeading": "Dear! Nomhle Mazibuko, Did you know you can do Debit Order Switching?<strong> </strong> <strong> </strong>",
      "body": "<p>By clicking this notification you can be able to know how switch debit order</p> Nedbank Money App, let it work for you",
      "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

       "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "DebitOrderSwitching",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "1110822820"

          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Pay To Foreign notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

             "displayCategory": "Offers",
    "displaySubCategory": "Pay To Foreign",
    "heading": "Pay To Foreign",
    "subHeading": "Good news! Nomhle Mazibuko, you can now pay to a foreign account <strong> </strong> <strong> </strong>",
      "body": "<p>You as a customer can use Money App to pay to a Foreign account</p>You can do this at the comfort of your own home.",
    "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "PayToForeign",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Buy forex notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

              "displayCategory": "Offers",
    "displaySubCategory": "Buy Forex",
    "heading": "Buy Forex",
    "subHeading": "Good news! Nomhle Mazibuko, Did You Know you can can buy forex<strong> </strong> <strong> </strong>",
      "body": "<p>You as a customer can use Money App to pay to a Foreign account</p>You can do this at the comfort of your own home.",
    "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "BuyForex",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "2278043684"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Ghost  Offers overdraft notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

              "displayCategory": "Offers",
    "displaySubCategory": "Overdraft offer just for you!",
    "heading": "Overdraft offer just for you!",
    "subHeading": "Good News, As a Nedbank client you may qualify for an overdraft of up to R50 000<strong> </strong> <strong> </strong>",
      "body": "<b>Features and Benefits:</b> <p>Your new limit will be available within 1 business day</p> <p>No additional cost, No paperwork or documents to submit </p> You can do it at the comfort of your own home without going to the branch ",
   "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "I'm Interested",
        "value": "1",
        "action": "PreApprovedOffersOverDraft",
        "additionalParameters": [
          {
            "name": "OfferId",
            "value": "607219"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Homeloan full app notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

                  "displayCategory": "Offers",
    "displaySubCategory": "Apply For Home Loan",
    "heading": "Apply For Home Loan",
    "subHeading": "Good news! Nomhle Mazibuko, you can apply for Home Loan via Money App <strong> </strong> <strong> </strong>",
          "body": "<p>As a customer it will help you optimize your banking experience, you can use the service as and when required. </p>You can do this at the comfort of your own home.",
    "activeExpiryDate": "2020-03-15T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "ApplyHomeLoan",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
     "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |

  @back-office-web
  Scenario Outline: Funeral policy notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

                 "displayCategory": "Offers",
    "displaySubCategory": "Apply for Funeral Policy",
    "heading": "Apply for Funeral Policy",
    "subHeading": "Good news! Nomhle Mazibuko, you can apply for Funeral Policy via Money App <strong> </strong> <strong> </strong>",
          "body": "<p>As a customer it will help you optimize your banking experience, you can use the service as and when required. </p>You can do this at the comfort of your own home.",
    "activeExpiryDate": "2020-03-15T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "ApplyFuneralPolicy",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
     "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Update Homeloan notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

     "displayCategory": "Offers",
    "displaySubCategory": "Apply For Home Loan",
    "heading": "Apply For Home Loan",
    "subHeading": "Good news! Nomhle Mazibuko, you can apply for Home Loan via Money App <strong> </strong> <strong> </strong>",
          "body": "<p>As a customer it will help you optimize your banking experience, you can use the service as and when required. </p>You can do this at the comfort of your own home.",
    "activeExpiryDate": "2020-03-15T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

       "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "ApplyHomeLoan",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
     "channels": [
      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |

  @back-office-web
  Scenario Outline: Sell forex notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

      "displayCategory": "Offers",
    "displaySubCategory": "Sell Forex",
    "heading": "Sell Forex",
    "subHeading": "Good news! Nomhle Mazibuko, Did You Know you can can sell forex<strong> </strong> <strong> </strong>",
      "body": "<p>You as a customer can use Money App to pay to a Foreign account</p>You can do this at the comfort of your own home.",
    "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "SellForex",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "1012472612"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Together 1 notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

        "displayCategory": "Offers",
     "displaySubCategory": "Find out more",
    "heading": "Find out more",
    "subHeading": "<strong>Good News Nomhle Mazibuko, As a Money™ app user who has logged in and viewed a message in the inbox  </strong> <strong></strong>",
      "body": "<p>Good News Nomhle Mazibuko, As a Online Banking user who has logged in and viewed a message in the inbox aand would like to know more and be redirected to the content page </p>Click on continue and be directed to the right content page
",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "Latest",
        "additionalParameters": [
          {
            "name": "RedirectUrl",
            "value": "https://together.nedbank.co.za"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [

      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Money tracker notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

   "displayCategory": "Offers",
    "displaySubCategory": "Setup Money Tracker",
    "heading": "Setup Money Tracker",
    "subHeading": "Good news! Nomhle Mazibuko, Did You Know you set up MoneyTracker<strong> </strong> <strong> </strong>",
      "body": "<p>You as a customer can use Money App to set up MoneyTracker so that you are aware of how you can manage money better </p>You can do this at the comfort of your own home.",
    "backOfficeNotificationDate": "2019-12-20T11:01:19",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

      "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "SetupMoneyTracker",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Update Profile Details notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

   "displayCategory": "Offers",
    "displaySubCategory": "Update Profile Details",
    "heading": "Update Profile Details",
    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank client you can update your profile limits online<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer can now update your profile limits online at the comfort of your own home</p> Nedbank's Money App ",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "ProfileDetails",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "1012472612"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Open Kids Accounts notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

    "displayCategory": "Offers",
    "displaySubCategory": "Open kids account",
    "heading": "Open kids account",
    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank clientI would like to be informed of features on the App such as Open Kid's Account<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer As a Nedbank clientI would like to be informed of features on the App such as Open Kid's Account, so that I can be aware of features I can use without going to the Branch</p> Nedbank's Money App ",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
     "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "OpenKidsAccount",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
      	"channel": 3
      }
    ]
  }
}

      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Unit trust notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

   "displayCategory": "Offers",
    "displaySubCategory": "Redeem Unit Trusts",
    "heading": "Redeem Unit Trusts",
    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank client you can redeem your unit trust<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer can now  redeem your unit trust money at the comfort of your own home</p> Nedbank's Money App ",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

      "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "RedeemUnitTrusts",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "2278043684"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [

      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: QR code notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

  "displayCategory": "Offers",
    "displaySubCategory": "Download Money App",
    "heading": "Download Money App using QA Code",
    "subHeading": "Dear Nomhle Mazibuko, As an online banking customer <strong> </strong> <strong></strong>",
      "body": "<p>Who has not downloaded the app</p> You can download it when loggin in to online banking",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,

               "responseOptions": [
                              {
        "type": "ULP",
        "label": "Done",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "richContent": [
        {
            "token": "@@cardImage",
            "displayName": "Card",
            "contentType": "IMG",
            "displayType": "BNN",
            "sourceCms": "LCMS",
            "sourcePath": "notificationImages/downloadAppQR.qa.png"
        }
    ],
     "channels": [

      {
      	"channel": 3
      }
    ]
  }
}     """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: IT3B Certificate - CASA  notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

   "displayCategory": "Offers",
     "displaySubCategory": "IT3B Tax Certificate",
    "heading": "IT3B Tax Certificate",
    "subHeading": "Good News Nomhle Mazibuko, Did You Know that you can download your IT3B certificate via online banking?  <strong> </strong> <strong></strong>",
      "body": "<p>You can log in on Nedbank's Money Web and download your certificate there for tax purposes</p>You can do it in the comfort of your own home",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "RecieveIT3BNotification",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "1012472612"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [

      {
      	"channel": 3
      }
    ]
  }
}

"""
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: IT3B Homeloan - CASA  notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

      "displayCategory": "Offers",
     "displaySubCategory": "Did You Know?",
    "heading": "Did You Know? HL",
    "subHeading": "Good News Nomhle Mazibuko, Did You Know that you can download your HL account?<strong> </strong> <strong></strong>",
      "body": "<p>You can log in on Nedbank's Money Web and download your certificate there for tax purposes</p>You can do it in the comfort of your own home",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "RecieveIT3BNotification",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "8000011045801"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [

      {
      	"channel": 3
      }
    ]
  }
}
"""
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: IT3B Personal loan  notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

     "displayCategory": "Offers",
     "displaySubCategory": "IT3B Personal Loan",
    "heading": "IT3B Personal Loan",
    "subHeading": "Good News Nomhle Mazibuko, Did You Know that you can download your Personal Loan IT3B Certificate?<strong> </strong> <strong></strong>",
      "body": "<p>You can log in on Nedbank's Money Web and download your certificate there for tax purposes</p>You can do it in the comfort of your own home",body": "<p>You can log in on Nedbank's Money Web and download your certificate there for tax purposes</p>You can do it in the comfort of your own home",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

      "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "RecieveIT3BNotification",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "8000154520501"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [

      {
      	"channel": 3
      }
    ]
  }
}
"""
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: IT3B MFC  notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

   "displayCategory": "Offers",
     "displaySubCategory": "IT3B MFC",
    "heading": "IT3B MFC",
    "subHeading": "Good News Nomhle Mazibuko, Did You Know that you can download your Home Loan, MFC or PL account?<strong> </strong> <strong></strong>",
      "body": "<p>You can log in on Nedbank's Money Web and download your certificate there for tax purposes</p>You can do it in the comfort of your own home",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

      "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "RecieveIT3BNotification",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "151832100870086"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [

      {
      	"channel": 3
      }
    ]
  }
}
"""
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |

  @back-office-web
  Scenario Outline: Get in touch  notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

   "displayCategory": "Offers",
    "displaySubCategory": "Get in touch",
    "heading": "Get in touch",
    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank client you can get in touch and rate the service you received<strong></strong> <strong> </strong>",
      "body": "<p> You as a customer can now use your by sending feedback use the feature without going to the branch</p> Nedbank's Money App ",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": true,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "FeedBack",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "2278043684"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [

      {
      	"channel": 3
      }
    ]
  }
}
"""
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: View Loan Payment Details - Personal Loan notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

   "displayCategory": "Offers",
    "displaySubCategory": "View Loan Payment Details",
    "heading": "View Loan Payment Details",
    "subHeading": "Good news! Nomhle Mazibuko, you can share your account details online using Nedbank’s Money App<strong> </strong><strong>Your card</strong>",
      "body": "<p>As a user you can set your default account at the comfort of your own space </p>Your card maybe stolen or misplaced. You can only do that on our Nedbank Money App.",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "ViewLoanPaymentDetails",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "8000154520501"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
        "channel": 3
      }
    ]
  }
}

"""
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: View Loan Payment Details - Home Loan notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

    "displayCategory": "Offers",
    "displaySubCategory": "View Loan Payment Details",
    "heading": "View Loan Payment Details",
    "subHeading": "Good news! Nomhle Mazibuko, you can share your account details online using Nedbank’s Money App<strong> </strong><strong>Your card</strong>",
      "body": "<p>As a user you can set your default account at the comfort of your own space </p>Your card maybe stolen or misplaced. You can only do that on our Nedbank Money App.",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "ViewLoanPaymentDetails",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "8000011045801"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
        "channel": 3
      }
    ]
  }
}

"""
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: View Loan Payment Details - MFC notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },


  "displayCategory": "Offers",
    "displaySubCategory": "View Loan Payment Details",
    "heading": "View Loan Payment Details",
    "subHeading": "Good news! Nomhle Mazibuko, you can share your account details online using Nedbank’s Money App<strong> </strong><strong>Your card</strong>",
      "body": "<p>As a user you can set your default account at the comfort of your own space </p>Your card maybe stolen or misplaced. You can only do that on our Nedbank Money App.",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "ViewLoanPaymentDetails",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "723904600000001"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
        "channel": 3
      }
    ]
  }
}
"""
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Did you know - Apply for PL notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },


    "displayCategory": "Offers",
    "displaySubCategory": "View Loan Payment Details",
    "heading": "View Loan Payment Details",
    "subHeading": "Good news! Nomhle Mazibuko, you can share your account details online using Nedbank’s Money App<strong> </strong><strong>Your card</strong>",
      "body": "<p>As a user you can set your default account at the comfort of your own space </p>Your card maybe stolen or misplaced. You can only do that on our Nedbank Money App.",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

      "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "isDirectFlow": false,
	"responseOptions": [
      {
        "type": "ALP",
        "label": "Continue",
        "value": "1",
        "action": "ViewLoanPaymentDetails",
        "additionalParameters": [
          {
            "name": "AccountNumber",
            "value": "723904600000001"
          }
        ]
      },
      {
        "type": "ALN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [
      {
        "channel": 3
      }
    ]
  }
}

"""
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Did you know - Apply for Personal Loan notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },


     "displayCategory": "Offers",
     "displaySubCategory": "Did You Know?",
    "heading": "Did You Know?",
    "subHeading": "Good News Nomhle Mazibuko, Did You Know that you can download your Home Loan, MFC or PL account?<strong> </strong> <strong></strong>",
      "body": "<p>You can log in on Nedbank's Money Web and download your certificate there for tax purposes</p>You can do it in the comfort of your own home",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

      "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "ApplyPersonalLoan",
        "additionalParameters": [
          {
            "name": "AccountID",
            "value": "2"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [

      {
      	"channel": 3
      }
    ]
  }
}
"""
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Debt relief 2  notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

      "displayCategory": "Offers",
     "displaySubCategory": "Debt relief",
    "heading": "Debt relief",
    "subHeading": "<strong>Good News Nomhle Mazibuko, As a Money™ app user who has logged in and viewed a message in the inbox  </strong> <strong></strong>",
      "body": "<p>Good News Nomhle Mazibuko, As a Online Banking user who has logged in and viewed a message in the inbox aand would like to know more and be redirected to the content page </p>Click on continue and be directed to the right content page
",


    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

     "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "Latest",
        "additionalParameters": [
          {
            "name": "RedirectUrl",
            "value": " www.nedbank.co.za/debtrelief"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [

      {
      	"channel": 3
      }
    ]
  }
}
      """
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Did you know - Apply for MFC notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },
      "displayCategory": "Offers",
     "displaySubCategory": "Did You Know?",
    "heading": "Did You Know?",
    "subHeading": "Good News Nomhle Mazibuko, Did You Know that you can download your Home Loan, MFC or PL account?<strong> </strong> <strong></strong>",
      "body": "<p>You can log in on Nedbank's Money Web and download your certificate there for tax purposes</p>You can do it in the comfort of your own home",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

      "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "ApplyMfc",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [

      {
      	"channel": 3
      }
    ]
  }
}
"""
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Did you know - Apply for Foreign notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },


     "displayCategory": "Offers",
     "displaySubCategory": "Did You Know?",
    "heading": "Did You Know?",
    "subHeading": "Good News Nomhle Mazibuko, Did You Know that you can download your Home Loan, MFC or PL account?<strong> </strong> <strong></strong>",
      "body": "<p>You can log in on Nedbank's Money Web and download your certificate there for tax purposes</p>You can do it in the comfort of your own home",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

      "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "ApplyForexAccount",
        "additionalParameters": [
          {
            "name": "AccountID",
            "value": "2"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
    "channels": [

      {
      	"channel": 3
      }
    ]
  }
}
"""
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


  @back-office-web
  Scenario Outline: Government payments notification
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And  header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    When def createAppNotification =
     """
       {
  "notification": {
    "backOfficeNotificationId": '#(uuid)',
    "notificationType": "MKT",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },

     "displayCategory": "Offers",
    "displaySubCategory": "Government Payments",
    "heading": "Did you know you can now make government payments online?",
    "subHeading":" Do you have payments due to SARS or Home Affairs? Complete it online today <strong> </strong> <strong> </strong>",
     "body": "<p>Maintain social distancing by making government payments from the convenience of your home without going to Branch </p>You can do this at the comfort of your own home.",

    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",

    "deliveryPriority": 2,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackDismiss": false,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": false,
    "mustNotShowInInbox" : false,
	"responseOptions": [
      {
        "type": "ULP",
        "label": "Continue",
        "value": "1",
        "action": "GovernmentPayments",
        "additionalParameters": [
          {
            "name": "AccountId",
            "value": "2"
          }
        ]
      },

      {
        "type": "ULN",
        "label": "No Thanks",
        "value": "2",
        "action": "Dismiss",
        "additionalParameters": [
          {
            "name": "MaxLoan",
            "value": "asSAD0326"
          }
        ]
      }
    ],
     "channels": [

      {
      	"channel": 3
      }
    ]
  }
}
"""
    And request createAppNotification
    And method post
    Then status 201
    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
    And match response.metadata.resultData[0].resultDetail[0].status == "success"
    And print response.metadata.resultData[0].resultDetail[0].status == "success"

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |


#  @back-office-web
#  Scenario Outline: Image on banner notification
#    Given url InApp_BackOffice_BaseUrl
#    And path 'notifications'
#    And  header Content-type = 'Application/Json'
#    And header Accept-Encoding = 'Application/Json'
#    And header x-ibm-client-id = '<ibmClientId>'
#    And header x-ibm-client-secret = '<ibmClientSecret>'
#    And header backOfficeToken = '<backOfficeToken>'
#    And header backOfficeId = '<backOfficeId>'
#    When def createAppNotification =
#     """
#       {
#  "notification": {
#    "backOfficeNotificationId": '#(uuid)',
#    "notificationType": "MKT",
#    "clientIdentity": {
#      "clientIdentifier": "<clientIdentifier>",
#      "clientIdentifierType": "<clientIdentifierType>"
#    },
#
#    "displaySubCategory": "Open kids account",
#    "heading": "Open kids account",
#    "subHeading": "Good news! Nomhle Mazibuko, As a Nedbank clientI would like to be informed of features on the App such as Open Kid's Account<strong></strong> <strong> </strong>",
#      "body": "<p> You as a customer As a Nedbank clientI would like to be informed of features on the App such as Open Kid's Account, so that I can be aware of features I can use without going to the Branch</p> Nedbank's Money App ",
#      "backOfficeNotificationDate": "2019-12-15T11:31:11.6165595+02:00",
#       "url": "https://www.fillmurray.com/640/360.jpeg",
#
#    "activeExpiryDate": "<activeExpiryDate>",
#    "deviceExpiryDate": "<deviceExpiryDate>",
#
#     "deliveryPriority": 2,
#    "responsePriority": 2,
#    "mustTrackFirstRead": true,
#    "mustTrackAllReads": false,
#    "mustTrackDismiss": false,
#    "allowMultipleResponses": true,
#    "allowAnonymous": false,
#    "mustBlockApp": false,
#     "mustPush": false,
#    "isDirectFlow": false,
#    "mustNotShowInInbox": false,
#	"responseOptions": [
#      {
#        "type": "ULP",
#        "label": "Continue",
#        "value": "1",
#        "action": "OpenKidsAccount",
#        "additionalParameters": [
#          {
#            "name": "AccountId",
#            "value": "2"
#          }
#        ]
#      },
#
#      {
#        "type": "ULN",
#        "label": "No Thanks",
#        "value": "2",
#        "action": "Dismiss",
#        "additionalParameters": [
#          {
#            "name": "MaxLoan",
#            "value": "asSAD0326"
#          }
#        ]
#      }
#    ],
#    "channels": [
#      {
#      	"channel": 3
#      }
#    ]
#  }
#}
#      """
#    And request createAppNotification
#    And method post
#    Then status 201
#    And match response.metadata.resultData[0].resultDetail[0].operationReference == uuid
#    And print response.metadata.resultData[0].resultDetail[0].operationReference == uuid
#    And match response.metadata.resultData[0].resultDetail[0].status == "success"
#    And print response.metadata.resultData[0].resultDetail[0].status == "success"
##
#    Examples:
#      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | clientIdentifier | clientIdentifierType | activeExpiryDate    | deviceExpiryDate    |
#      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | 414887048473      | CIS                  | 2020-09-13T11:01:19 | 2020-09-13T11:01:19 |
