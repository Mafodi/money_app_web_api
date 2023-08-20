@notifications-ita
Feature: Notifications ITA

  Background:
    * configure proxy = "http://172.17.2.12:80"
    * def securityToken = read('TokenStore/api.security.token.txt')

  @notifications-ita
  Scenario Outline: Post mfa authenticators
    Given url External_BaseURL
    And path '/users/mfa/authentications'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And print 'Saved Token is '+ securityToken
    And header Authorization = 'Bearer '+ securityToken
    When def postBody =
     """
      {
  "action": "<action>",
  "userUniqueIdentifier": <userUniqueIdentifier>,
  "authenticatorIDList": [
    {
      "authenticatorFriendlyName": "<authenticatorFriendlyName>",
      "authenticatorID": "<authenticatorID>",
      "authenticatorType": "<authenticatorType>",
      "businessContext": "<businessContext>"
    }
  ],
     "applicationID": "<applicationID>"
     }
      """
    And request postBody
    When method post
    Then status 200

    Examples:
      | action | userUniqueIdentifier | authenticatorFriendlyName | authenticatorID | authenticatorType | businessContext |
      | string | 0                    | string                    | string          | string            | string          |

  @notifications-ita
  Scenario Outline: Post mfa auth statuses
    Given url External_BaseURL
    And path '/users/mfa/authentications/statuses'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And print 'Saved Token is '+ securityToken
    And header Authorization = 'Bearer '+ securityToken
    When def postBody =
     """
        {
         "oobvMethod": "<oobvMethod>",
          "oobvVerificationID": <oobvVerificationID>,
          "otp": "<otp>"
        }
      """
    And request postBody
    When method post
    Then status 200

    Examples:
      | oobvMethod | oobvVerificationID | otp    |
      | string     | 0                  | string |

  @notifications-ita
  Scenario Outline: Post authenticators
    Given url External_BaseURL
    And path '/users/authenticators'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And print 'Saved Token is '+ securityToken
    And header Authorization = 'Bearer '+ securityToken
    When def postBody =
     """
       {
  "action": "<action>",
  "userUniqueIdentifier": <userUniqueIdentifier>,
  "authenticatorIDList": [
    {
      "authenticatorFriendlyName": "<authenticatorFriendlyName>",
      "authenticatorID": "<authenticatorID>",
      "authenticatorType": "<authenticatorType>",
      "businessContext": "<businessContext>"
    }
  ],
  "applicationID": "<applicationID>"
}
      """
    And request postBody
    When method put
    Then status 200

    Examples:
      | action | userUniqueIdentifier | authenticatorFriendlyName | authenticatorID | authenticatorType | businessContext | applicationID |
      | string | 0                    | string                    | string          | string            | string          | string        |

  @notifications-ita
  Scenario Outline: Post ITAs
    Given url External_BaseURL
    And path '/users/itas'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And print 'Saved Token is '+ securityToken
    And header Authorization = 'Bearer '+ securityToken
    When def postBody =
     """
       {
    "authenticatorType": "<authenticatorType>",
   "authenticatorId": "<authenticatorId>",
   "authenticatorFriendlyName": "<authenticatorFriendlyName>",
   "verificationInfo": {
    "verificationMethod": "<verificationMethod>",
    "verificationID": <verificationID>,
    "otp": <otp>
    },
    "confirm": true
       }
      """
    And request postBody
    When method post
    Then status 200

    Examples:
      | authenticatorType | authenticatorId | authenticatorFriendlyName | verificationMethod | verificationID | otp |
      | string            | string          | string                    | string             | 0              | 0   |

  @notifications-ita
  Scenario Outline: Post security details
    Given url External_BaseURL
    And path '/users/securitydetails'
    And header Content-type = 'Application/Json'
    And header Accept-Encoding = 'Application/Json'
    And print 'Saved Token is '+ securityToken
    And header Authorization = 'Bearer '+ securityToken
    When def postBody =
     """
      {
      "userUniqueIdentifier": <userUniqueIdentifier>
       }
      """
    And request postBody
    When method post
    Then status 200

    Examples:
      | userUniqueIdentifier |
      | 0                    |