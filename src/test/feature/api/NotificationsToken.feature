Feature: As a user I should be able to get Security token

  Background:

    * def AuthorizationKey = 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiJhM2NlNDZhNi1lYmQwLTRjMTktYTE3NC0wY2MxNjViZTIxNmQiLCJ0b2tlbl90eXBlIjoiQmVhcmVyIiwibmJmIjoxNTg2NDEyNTQzLCJpc3MiOiJpZHAubmVkYmFuay5jby56YSIsImlhdCI6MTU4NjQxMjYwMywiZXhwIjoxNjE3OTQ4NjAzLCJncmFudF90eXBlIjoiYW5vbnltb3VzIiwianRpIjoiN2JhNTdkMjgxZjBlNGFiNWEwYWExMzE4ZjJhYjVkZmEiLCJzY29wZXMiOltdfQ.S_U0z8S7IjivQyjsE9AJwBudVvUgpOSk8cIp3NgD4x1NHLbfP2JX96bRgm-lMNrDTmQ4CximjH1-ln_dwY-bJkgopIWoEwEBBHS5-mKCFmw2q8T5mqRi0Mx2kX87vQ_Ou5IU0OLiEP4-gFbsFnRJu5QaVz0VuI4iumDyrRnuueTuCbvjHQLj42su63pn1LI-VamehJKinZoeMsN_BlGB_D61fXsNAyODC3VZ_MOZVgtXcbeb3ZAN4dYMoEwWEu2E-BqjA3_W4r7xnVj9Jc3I2DjJd0vcWjAyFKcIn4UgDw5baWxveW_gYsOLRa-S6USoVdl7IMQn-gQIKbeF-MDqww'
    * def InternalToken = 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiI5YzkzODQzZC0xODhkLTQ3Y2QtOTg0YS01N2IxODcxZDgyYTMiLCJ0b2tlbl90eXBlIjoiQmVhcmVyIiwibmJmIjoxNTg5ODc0MDU4LCJpc3MiOiJpZHAubmVkYmFuay5jby56YSIsImlhdCI6MTU4OTg3NDExOCwiZXhwIjoxNjIxNDEwMTE4LCJncmFudF90eXBlIjoiYW5vbnltb3VzIiwiY2lkIjoiMyIsImp0aSI6IjZjNmY3MjIxZjMyMjQ5MDI5MGQzMzBkODZmMmE2NjAyIiwic2NvcGVzIjpbXX0.cANNLyKMLpujsh_h1Cwh8uya8SvWG6sEmM2gzl9PO0Ddx36i47ZcsLwv9cic0pVa647b3mzwA98oRxaE9YRy7Gkt5UumP6n0WYVLYixPHP9q7fdwj57JDju0xcRuYsr12U49ljIBsDiB868jv-zG4-YUEK7MFTLFVU7EMvgnlT1t18LIaiQqhilWJMaIVh8eP6X_4RC80stHPibdueip-cxLHtYNaTljJ6a-BAOWrY3oUFuA7ufmm4nTuDFiixTpdLZdUedX6SXK4hQYODWBJURfhcBEYZSOHDXvQ1Novf2THBAqGr-w8hsl8ATSJiGAx4dYFsk7l2n7jjdBn1E4Rw'
    * def Timeout = 80000
    * configure ssl = true
    * def VPN_proxy = 'http://10.74.11.24:3128'
    * callonce read('NotificationsConfig.feature')

  @jwt-token
  Scenario: Get External Salut Token
    Given url 'https://api-q.nedsecure.co.za/nedbank/nedbankid/v3/users/salut'
    And configure proxy = VPN_proxy
    And configure connectTimeout = Timeout
    And header Authorization = 'Bearer '+ AuthorizationKey
    When method get
    Then status 200
    And print response
    And def TokenId = response.Data.TokenValue
    And def TkId = KarateUtil.WriteToFile('src/test/feature/api/TokenStore/SalutToken.txt',TokenId)

  @jwt-token
  Scenario Outline: Login External
    * def TokenId = read('TokenStore/SalutToken.txt')

    Given url 'https://api-q.nedsecure.co.za/nedbank/nedbankid/v3/users/authenticate'
    And configure proxy = VPN_proxy
    And configure connectTimeout = Timeout
    And header Authorization = 'Bearer '+TokenId
    And def requestMsg =
       """
        {
            "username":"<username>",
            "password":"<password>"
        }
      """
    And request requestMsg
    When method post
    Then status 200
    And print response
    And def securityToken = response.Data.TokenValue
    And match securityToken.lenght != 0
    And print securityToken
    And def SecToken = KarateUtil.WriteToFile('src/test/feature/api/TokenStore/api.security.token.txt',securityToken)

    Examples:
      | username              | password  |
      | cml3020160811@nedbank | Test@1234 |


  @jwt-token
  Scenario: Get Internal Salut Token
    Given url 'https://api-qa.it.nednet.co.za/nedbank/pilot/nedbankid/v3/users/salut'
    And configure proxy = VPN_proxy
    And configure connectTimeout = Timeout
    And header Authorization = 'Bearer '+ InternalToken
    When method get
    Then status 200
    And print response
    And def TokenId = response.Data.TokenValue
    And def TkId = KarateUtil.WriteToFile('src/test/feature/api/TokenStore/InternalSalutToken.txt',TokenId)

  @jwt-token
  Scenario Outline: Login Internal
    * def TokenId = read('TokenStore/InternalSalutToken.txt')
    Given url 'https://api-qa.it.nednet.co.za/nedbank/pilot/nedbankid/v3/users/authenticate'
    And configure proxy = VPN_proxy
    And configure connectTimeout = Timeout
    And header Authorization = 'Bearer '+TokenId
    And def requestMsg =
       """
        {
            "username":"<username>",
            "password":"<password>"
        }
      """
    And request requestMsg
    When method post
    Then status 200
    And print response
    And def internalToken = response.Data.TokenValue
    And match internalToken.lenght != 0
    And print internalToken
    And def internalToken = KarateUtil.WriteToFile('src/test/feature/api/TokenStore/api.internal.token.txt',internalToken)

    Examples:
      | username              | password  |
      | cml3020160811@nedbank | Test@1234 |

