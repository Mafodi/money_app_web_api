Feature: Get advanced filters

  Background:
    * def token = SmartQueue_Token
    * header Authorization = 'Bearer '+token
    * def baseURL = SmartQueue_BaseURL
    * configure proxy = VPN_proxy


  @smart-queuing
  Scenario: Verify the extendedPeriod is appearing
    Given path 'branches/advancefilters'
    And url baseURL
    When method get
    Then status 200
    And print response
    And match response.data.extendedPeriod[*].name contains "Open Saturdays","Open Sundays","Extended hours"

  @smart-queuing
  Scenario: Verify the Services is appearing
    Given path 'branches/advancefilters'
    And url baseURL
    When method get
    Then status 200
    And print response
    And match response.data.services[*] contains {"name": "Account enquiry","code": "ACCD8AD7562"}
    And match response.data.services[*] contains {"name": "New accounts and advice","code": "NEW6B6F7D55"}
    And match response.data.services[*] contains {"name": "Bulk teller","code": "BULF0D68094"}
    And match response.data.services[*] contains {"name": "Card/Collection","code": "CAR3A359C35"}
    And match response.data.services[*] contains {"name": "Forex","code": "FORF9046AAA"}
    And match response.data.services[*] contains {"name": "International payments","code": "INT2F8575D1"}
    And match response.data.services[*] contains {"name": "Personal loans","code": "PERA665BD53"}
    And match response.data.services[*] contains {"name": "Statements","code": "STAA639B78F"}
    And match response.data.services[*] contains { "name": "Small-business banker","code": "SMAF443D037"}
    And match response.data.services[*] contains {"name": "Teller","code": "TELACE07921"}

  @smart-queuing
  Scenario: Verify the Facilities is appearing
    Given path 'branches/advancefilters'
    And url baseURL
    When method get
    Then status 200
    And print response
    And match response.data.facilities[*] contains {"name": "Deposit taking ATM","code": "DEPF024B140"}
    And match response.data.facilities[*] contains {"name": "Non deposit-taking ATM","code": "NON3377C964"}
    And match response.data.facilities[*] contains {"name": "Self Service Kiosk","code": "SEL49C8D916"}
    And match response.data.facilities[*] contains {"name": "Video Banking","code": "VID277F72D3"}
    And match response.data.facilities[*] contains {"name": "Wheel Chair Friendly","code": "WHE3ECB32EE"}
    And match response.data.facilities[*] contains {"name": "Wheel Chair Friendly with Staff Assistance","code": "WHE2C99B58E"}
    And match response.data.facilities[*] contains {"name": "Department of Home Affairs","code": "DHA14CFAABF"}
    And match response.data.facilities[*] contains {"name": "Interactive Teller","code": "INT519E2FD7"}