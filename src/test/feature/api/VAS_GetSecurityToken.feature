@VASSecurityToken
Feature: As a user I should be able to get Security token

  Background:

    * def AuthorizationKey = 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiJhM2NlNDZhNi1lYmQwLTRjMTktYTE3NC0wY2MxNjViZTIxNmQiLCJ0b2tlbl90eXBlIjoiQmVhcmVyIiwibmJmIjoxNTg2NDEyNTQzLCJpc3MiOiJpZHAubmVkYmFuay5jby56YSIsImlhdCI6MTU4NjQxMjYwMywiZXhwIjoxNjE3OTQ4NjAzLCJncmFudF90eXBlIjoiYW5vbnltb3VzIiwianRpIjoiN2JhNTdkMjgxZjBlNGFiNWEwYWExMzE4ZjJhYjVkZmEiLCJzY29wZXMiOltdfQ.S_U0z8S7IjivQyjsE9AJwBudVvUgpOSk8cIp3NgD4x1NHLbfP2JX96bRgm-lMNrDTmQ4CximjH1-ln_dwY-bJkgopIWoEwEBBHS5-mKCFmw2q8T5mqRi0Mx2kX87vQ_Ou5IU0OLiEP4-gFbsFnRJu5QaVz0VuI4iumDyrRnuueTuCbvjHQLj42su63pn1LI-VamehJKinZoeMsN_BlGB_D61fXsNAyODC3VZ_MOZVgtXcbeb3ZAN4dYMoEwWEu2E-BqjA3_W4r7xnVj9Jc3I2DjJd0vcWjAyFKcIn4UgDw5baWxveW_gYsOLRa-S6USoVdl7IMQn-gQIKbeF-MDqww'
    * def Timeout = 80000
    * configure ssl = true
    * def VPN_proxy = 'http://10.74.11.24:3128'
    * callonce read('Vas_Config_SetUp.feature')



  Scenario: Get Token
    Given url 'https://api-q.nedsecure.co.za/nedbank/nedbankid/v3/users/salut'
    And configure proxy = VPN_proxy
    And configure connectTimeout = Timeout
    And header Authorization = 'Bearer '+AuthorizationKey
    When method get
    Then status 200
    And print response
    And def TokenId = response.Data.TokenValue
    And def TkId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASAuthToken.txt',TokenId)



  Scenario Outline: Login into our profile
    * def TokenId = read('jsonData/VASAuthToken.txt')

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
      | username    | password  |
      | praveen | Test@123 |