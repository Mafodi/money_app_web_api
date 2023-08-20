Feature: Get Marital Status Code

  Background:
    #* def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def typesSchema = {code:'#string', description:'#string'}

  @Digital-Home-Buying
  Scenario Outline: Get Marital Status Code
    Given path 'referencedata/maritalstatus/<maritalTypeCode>'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    When method get
    Then status 200
    And print response
    And match response.data == '#(^^typesSchema)'
    And match response.data contains {code:'<maritalTypeCode>', description:'<codeDescription>'}

    Examples:
    | maritalTypeCode | codeDescription |
    | D | Divorced |
    | M | Married |
    | O | Other |
    | U | Single |
    | W | Widowed |