Feature: Get Disclaimer Message

  Background:
#    * def HomeLoans_BaseURL = 'https://qa-hlmobile.nednet.co.za/homeloansdigital/v1/'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def codeSchema = { code:'#string' }
    * def titleSchema = {code:'#string', title:'#string'}

  @Digital-Home-Buying
  Scenario Outline: Validate Disclaimer Body
    Given path 'referencedata/disclaimers/<codeId>'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
#    And configure proxy = 'http://10.74.11.24:3128'
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
#    And header x-ibm-client-id = 'da1292d-01fa-4d52-a85d-3194c07d8414'
    When method get
    Then status 200
    And print response
    And match response.data.code == '#string'
    And match response.data.title == '#string'
    And match response.data.body == '#string'

    Examples:
    | codeId |
    | 1 |
    | 2 |