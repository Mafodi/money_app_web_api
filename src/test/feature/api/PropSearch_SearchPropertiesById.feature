Feature:As a user I should be able to search property by id

  Background:
#    * def propSearchSchema = {erfSize:'#number', erfSizeUnit:'#string', bedrooms:'#number', bathrooms:'#number', garages:'#number', price:'#number', houseSize:'#number', listingUrl:'#string', imageUrls:'#[]', propertyType:'#string', suburbId:'#number', suburbName:'#string', provinceName:'#string', id:'#string', availability:'#boolean'}
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * call read("PropSearch_SearchProperties.feature")

  @Digital-Home-Buying
  Scenario Outline: Search property by ID
    Given path 'properties/<propid>'
    And url HomeLoans_BaseURL
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And configure proxy = VPN_proxy
    And header x-ibm-client-id = HomeLoans_xIbmClientId
#    And configure proxy = 'http://10.74.11.24:3128'
#    And header x-ibm-client-id = 'ada1292d-01fa-4d52-a85d-3194c07d8414'
    When method get
    Then status 200
    And print response
    And match response.data != ''

  Examples:
    | propid |
    | P24-106530490 |
    | P24-106861394 |