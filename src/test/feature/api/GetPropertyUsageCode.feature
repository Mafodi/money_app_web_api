Feature: Get Property Usage Code List

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def propertyUsageTypesSchema = {code:'#string', description:'#string'}

  @Digital-Home-Buying
  Scenario Outline: Get Property Usage Code
    Given path 'referencedata/propertyusages/<code>'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    When method get
    Then status 200
    And print response
    And match response.data == '#(^^propertyUsageTypesSchema)'
    And match response.data.description == '<description>'

  Examples:
  | code | description |
  | 1    | Primary / Permanent residence |
  | 2    | Secondary residence: e.g. a holiday home |
  | 3    | An Investment: e.g. to rent out          |