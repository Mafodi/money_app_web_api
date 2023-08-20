Feature:As a user I should be able to search properties

  Background:
#    * def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def propSearchSchema = {erfSize:'#number', erfSizeUnit:'#string', bedrooms:'#number', bathrooms:'#number', garages:'#number', price:'#number', houseSize:'#number', listingUrl:'#string', imageUrls:'#[]', propertyType:'#string', suburbId:'#number', suburbName:'#string', provinceName:'#string', id:'#string', availability:'#boolean'}

  @Digital-Home-Buying
  Scenario Outline: Search property
    Given path 'properties'
    And url HomeLoans_BaseURL
    And param minprice = '<minPrice>'
    And param maxprice = '<maxPrice>'
    And param suburbid = '<suburbId>'
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+ securityToken
    And configure proxy = VPN_proxy
    And header x-ibm-client-id = HomeLoans_xIbmClientId
#    And configure proxy = 'http://10.74.11.24:3128'
#    And header x-ibm-client-id = 'ada1292d-01fa-4d52-a85d-3194c07d8414'
    When method get
    Then status 200
    And print response
    And match response.data == '#[] ^* propSearchSchema'
    And print response.data.length

    Examples:
    | suburbId | minPrice | maxPrice |
    | 4251 | 800000.00 | 2200000.00 |