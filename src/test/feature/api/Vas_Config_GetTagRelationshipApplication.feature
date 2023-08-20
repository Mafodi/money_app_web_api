@ConfigAPI
Feature: Tag Relationship Config API Feature
  As a user I should be able to make API calls for tag relationships

  Background:

    * callonce read('Vas_Config_SetUp.feature')
    * configure ssl = true
    * def AuthorizationKey = read('TokenStore/ConfigAPI.txt')



  @config-regression

    Scenario Outline: Get All Tag Relationships
      Given path pathForTagRelationships
      And url VasOpsConfig_BaseUrl
      And param MaxResultCount = <count>
      And header Authorization = 'Bearer '+AuthorizationKey
      When method get
      Then status 200
      And print response
      And match response != ''

      Examples:
        | count |
        | 10    |












