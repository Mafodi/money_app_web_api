Feature: I want to create JWT to access API

  Background:

    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true




  Scenario: Create JWT Token
    Given url 'http://dev-nma.smas.nednet.co.za/tokenprovider2/providers/login'
    And header Content-Type = 'application/json'
    And def JWTRequest =
    """
    {
     "username":"Vasprofile20",
     "password":"Testing1!"
    }
    """
    And request JWTRequest
    When method post
    Then status 200
    And print response
    And def Token = response
    And def JwtToken = KarateUtil.WriteToFile('src/test/feature/api/TokenStore/api.security.token.txt',Token)