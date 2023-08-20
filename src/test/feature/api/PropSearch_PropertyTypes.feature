Feature:As a user I should be able to get property types

  Background:
    #* def HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'

    * def securityToken = read('TokenStore/api.security.token.txt')
    * def propertyTypesSchema = {code:'#string', description:'#string', isActive:'#boolean', isSectional:'#boolean', name:'#string'}

  @Digital-Home-Buying
  Scenario Outline: Get Property Types
    Given path 'referencedata/propertytypes'
    And url HomeLoans_BaseURL
    And configure proxy = VPN_proxy
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = HomeLoans_xIbmClientId
    When method get
    Then status 200
    And print response
    And match response.data == '#[] propertyTypesSchema'
    And match response.data contains {code:'<codeId>', description:'<description>', isActive:<isActive>, isSectional:<isSectional>, name:'<name>'}

    Examples:
    | codeId | description | isActive | isSectional | name |
 #   | 10     | Farm        | true     | true        | Farm |
 #   | 11     | Commercial  | true     | true        | Commercial |
 #   | 12     | Industrial  | true     | true        | Industrial |
    | 4      | House       | true     | true        | House      |
    | 5      | Apartment   | true     | true        | ApartmentOrFlat|
    | 6      | Townhouse   | true     | true        | Townhouse      |
 #   | 8      | Vacant Land | true     | true        | VacantLandOrPlot |
