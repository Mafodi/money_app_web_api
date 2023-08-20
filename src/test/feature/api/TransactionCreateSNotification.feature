@notifications
Feature: Transaction notification

  Background:
    * configure ssl = { keystore:'In-App-Notifications/certs/NedbankIssuingSHA2.cer' }
    * configure charset = null

  Scenario Outline: Create single transaction
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    When def createTransaction =
       """
        {
  "notification": {
    "backOfficeNotificationId": "<backOfficeNotificationId>",
    "notificationType": "<notificationType>",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },
    "displayCategory": "<displayCategory>",
    "displaySubCategory": "<displaySubCategory>",
    "heading": "<heading>",
    "subHeading": "<subHeading>",
    "body": "<body>",
    "url": "",
    "backOfficeNotificationDate": "<backOfficeNotificationDate>",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 1,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": true,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": true,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
    "responseOptions": [ ],
    "channels": [
      {
        "channel": 100
      }
    ],
    "richContent": [],
    "meta": [
		{
			"name": "transactionKey",
			"value": "1"
		},
		{
			"name": "statementKey",
			"value": "123456"
		},
		{
			"name": "lineNumber",
			"value": "0"
		},
		{
			"name": "accountNumber",
			"value": "1234567890"
		},
		{
			"name": "tranAmt",
			"value": "141.11"
		},
		{
			"name": "cashChequeInd",
			"value": "Cash"
		},
		{
			"name": "channelName",
			"value": "Overnight Transaction"
		},
		{
			"name": "location",
			"value": "Walmart Sandton Liquor Outlet 24 Main"
		},
		{
			"name": "narrative",
			"value": "NarrText9012345678901234;&gt;7890"
		},
		{
			"name": "debitCreditInd",
			"value": "Debit"
		},
		{
			"name": "actionDate",
			"value": "2019-08-12T11:24:24+02:00"
		},
	    {
			"name": "transactionType",
			"value": "CASH DEPOSIT"
		},
	    {
			"name": "cardNumber",
			"value": "21753156367876"
		},
	    {
			"name": "accountName",
			"value": "Loan Account"
		},
	    {
			"name": "beneficiary",
			"value": "Some Beneficiary"
		}
    ]
  }
}

       """
    And request createTransaction
    When method post
    Then status 201
    And match response != ''


    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | backOfficeNotificationId | notificationType | clientIdentifier | clientIdentifierType | displayCategory | displaySubCategory | heading     | subHeading   | body                                  | backOfficeNotificationDate | activeExpiryDate          | deviceExpiryDate          |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | EMINotif9006             | TRN              | 1234567890       | CIS                  | Transactions    | Online             | Transaction | CASH DEPOSIT | Walmart Sandton Liquor Outlet 24 Main | 2019-08-06T11:09:07+02:00  | 2020-10-20T11:09:07+02:00 | 2020-10-20T11:09:07+02:00 |

  Scenario Outline: Create single transaction - active expiry date in the past
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    When def createTransaction =
       """
        {
  "notification": {
    "backOfficeNotificationId": "<backOfficeNotificationId>",
    "notificationType": "<notificationType>",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },
    "displayCategory": "<displayCategory>",
    "displaySubCategory": "<displaySubCategory>",
    "heading": "<heading>",
    "subHeading": "<subHeading>",
    "body": "<body>",
    "url": "",
    "backOfficeNotificationDate": "<backOfficeNotificationDate>",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 1,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": true,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": true,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
    "responseOptions": [ ],
    "channels": [
      {
        "channel": 100
      }
    ],
    "richContent": [],
    "meta": [
		{
			"name": "transactionKey",
			"value": "1"
		},
		{
			"name": "statementKey",
			"value": "123456"
		},
		{
			"name": "lineNumber",
			"value": "0"
		},
		{
			"name": "accountNumber",
			"value": "1234567890"
		},
		{
			"name": "tranAmt",
			"value": "141.11"
		},
		{
			"name": "cashChequeInd",
			"value": "Cash"
		},
		{
			"name": "channelName",
			"value": "Overnight Transaction"
		},
		{
			"name": "location",
			"value": "Walmart Sandton Liquor Outlet 24 Main"
		},
		{
			"name": "narrative",
			"value": "NarrText9012345678901234;&gt;7890"
		},
		{
			"name": "debitCreditInd",
			"value": "Debit"
		},
		{
			"name": "actionDate",
			"value": "2019-08-12T11:24:24+02:00"
		},
	    {
			"name": "transactionType",
			"value": "CASH DEPOSIT"
		},
	    {
			"name": "cardNumber",
			"value": "21753156367876"
		},
	    {
			"name": "accountName",
			"value": "Loan Account"
		},
	    {
			"name": "beneficiary",
			"value": "Some Beneficiary"
		}
    ]
  }
}

       """
    And request createTransaction
    When method post
    Then status 400
    And match response != ''

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | backOfficeNotificationId | notificationType | clientIdentifier | clientIdentifierType | displayCategory | displaySubCategory | heading     | subHeading   | body                                  | backOfficeNotificationDate | activeExpiryDate          | deviceExpiryDate          |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | EMINotif9006             | TRN              | 1234567890       | CIS                  | Transactions    | Online             | Transaction | CASH DEPOSIT | Walmart Sandton Liquor Outlet 24 Main | 2019-08-06T11:09:07+02:00  | 2019-10-20T11:09:07+02:00 | 2020-10-20T11:09:07+02:00 |



  Scenario Outline: Create single transaction - device expiry date in the past
    Given url InApp_BackOffice_BaseUrl
    And path 'notifications'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And header backOfficeToken = '<backOfficeToken>'
    And header backOfficeId = '<backOfficeId>'
    And header x-ibm-client-id = '<ibmClientId>'
    And header x-ibm-client-secret = '<ibmClientSecret>'
    When def createTransaction =
       """
        {
  "notification": {
    "backOfficeNotificationId": "<backOfficeNotificationId>",
    "notificationType": "<notificationType>",
    "clientIdentity": {
      "clientIdentifier": "<clientIdentifier>",
      "clientIdentifierType": "<clientIdentifierType>"
    },
    "displayCategory": "<displayCategory>",
    "displaySubCategory": "<displaySubCategory>",
    "heading": "<heading>",
    "subHeading": "<subHeading>",
    "body": "<body>",
    "url": "",
    "backOfficeNotificationDate": "<backOfficeNotificationDate>",
    "activeExpiryDate": "<activeExpiryDate>",
    "deviceExpiryDate": "<deviceExpiryDate>",
    "deliveryPriority": 1,
    "responsePriority": 2,
    "mustTrackFirstRead": true,
    "mustTrackAllReads": false,
    "mustTrackDismiss": true,
    "allowMultipleResponses": false,
    "allowAnonymous": false,
    "mustBlockApp": false,
    "mustPush": true,
    "isDirectFlow": false,
    "mustNotShowInInbox": false,
    "responseOptions": [ ],
    "channels": [
      {
        "channel": 100
      }
    ],
    "richContent": [],
    "meta": [
		{
			"name": "transactionKey",
			"value": "1"
		},
		{
			"name": "statementKey",
			"value": "123456"
		},
		{
			"name": "lineNumber",
			"value": "0"
		},
		{
			"name": "accountNumber",
			"value": "1234567890"
		},
		{
			"name": "tranAmt",
			"value": "141.11"
		},
		{
			"name": "cashChequeInd",
			"value": "Cash"
		},
		{
			"name": "channelName",
			"value": "Overnight Transaction"
		},
		{
			"name": "location",
			"value": "Walmart Sandton Liquor Outlet 24 Main"
		},
		{
			"name": "narrative",
			"value": "NarrText9012345678901234;&gt;7890"
		},
		{
			"name": "debitCreditInd",
			"value": "Debit"
		},
		{
			"name": "actionDate",
			"value": "2019-08-12T11:24:24+02:00"
		},
	    {
			"name": "transactionType",
			"value": "CASH DEPOSIT"
		},
	    {
			"name": "cardNumber",
			"value": "21753156367876"
		},
	    {
			"name": "accountName",
			"value": "Loan Account"
		},
	    {
			"name": "beneficiary",
			"value": "Some Beneficiary"
		}
    ]
  }
}

       """
    And request createTransaction
    When method post
    Then status 400
    And match response != ''

    Examples:
      | ibmClientId                          | ibmClientSecret                                    | backOfficeToken                  | backOfficeId | backOfficeNotificationId | notificationType | clientIdentifier | clientIdentifierType | displayCategory | displaySubCategory | heading     | subHeading   | body                                  | backOfficeNotificationDate | activeExpiryDate          | deviceExpiryDate          |
      | 6aa93f2e-2d66-48dd-b2c6-b773f16283ac | X3yB3vD8rG6cT3gK7wK1jE6kL4lI0tG1fK2bR1hI5qN4qM0oK4 | 5ff8262a14794b03a2e11e75ae777db4 | Walter       | EMINotif9006             | TRN              | 1234567890       | CIS                  | Transactions    | Online             | Transaction | CASH DEPOSIT | Walmart Sandton Liquor Outlet 24 Main | 2019-08-06T11:09:07+02:00  | 2020-10-20T11:09:07+02:00 | 2019-10-20T11:09:07+02:00 |
