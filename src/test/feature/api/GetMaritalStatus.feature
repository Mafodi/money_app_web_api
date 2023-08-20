Feature: Get Marital Status List

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def typesSchema = {code:'#string', description:'#string'}

  @Digital-Home-Buying
  Scenario Outline: Get marital status
    Given path 'referencedata/maritalstatus'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    And configure proxy = VPN_proxy
#    And configure proxy = 'http://10.74.11.24:3128'
#    And header x-ibm-client-id = '1009043d-8009-49ee-9fdb-bcd09dfc2960'
    When method get
    Then status 200
    And print response
    And match response.data == '#[] typesSchema'
    And match response.data contains {code:'<codeId>', description:'<codeDescription>'}

    Examples:
    | codeId | codeDescription |
    | D | Divorced |
    | M | Married |
    | O | Other |
    | U | Single |
    | W | Widowed |
