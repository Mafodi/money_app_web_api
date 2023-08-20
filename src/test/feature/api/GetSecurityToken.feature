Feature: As a user I should be able to get property favourites max limit

  Background:
#  * def loginAuthURL = 'http://dev-nma.smas.nednet.co.za/tokenprovider/providers/login'
    * def saveGeneratedAuthToken =
    """
      function(arg) {
        var AuthenticationManager = Java.type('src.test.java.platforms.api.apiClasses.AuthenticationTokenManager');
        var authManager = new AuthenticationManager();
        return authManager.saveAuthToken(arg);
      }
      """

  @securityToken
    Scenario Outline: Login into our profile
      Given url loginAuthURL
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
      And def securityToken = response
      And match securityToken.lenght != 0
      And print securityToken
      And def result = call saveGeneratedAuthToken securityToken

      Examples:
      | username    | password  |
      | TestHome11 | Testing1! |