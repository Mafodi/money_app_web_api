Feature: Get Loan applicant Type List

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def applicantsTypesSchema = {code:'#string', title:'#string', description:'#string'}

  @Digital-Home-Buying
  Scenario Outline: Get applicant types
    Given path 'referencedata/applicanttypes'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    When method get
    Then status 200
    And print response
    And match response.data == '#[] applicantsTypesSchema'
    And match response.data[*].code == <codeId>`
    And match response.data[*].title == <title>

    Examples:
    | codeId | title |
    | ["1", "3"] | ["Me alone", "Me and a co-applicant/s"]   |