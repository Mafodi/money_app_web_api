Feature: Get Suburbs List

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def suburbTypesSchema = {id:'#number', name:'#string', province:'#string'}

  @Digital-Home-Buying
  Scenario: Get Suburbs
    Given path 'referencedata/suburbs'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
#    And header x-ibm-client-id = 'ada1292d-01fa-4d52-a85d-3194c07d8414'
#    And configure proxy = 'http://10.74.11.24:3128'
    And configure proxy = VPN_proxy
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And header Authorization = 'Bearer '+securityToken
    When method get
    Then status 200
    And print response
    And match response.data == '#[] suburbTypesSchema'
    #And match response.data contains {code:'<codeId>', description:'<codeDescription>'}