Feature: Get nearest branches

  Background:
    * def token = SmartQueue_Token
    * def baseURL = SmartQueue_BaseURL
    * configure proxy = VPN_proxy

  @smart-queuing
  Scenario Outline: Get nearest branches
    Given path 'branches'
    And url baseURL
    And param latitude = <latitude>
    And param longitude = <longitude>
    And param resultSize = <resultSize>
    And header Authorization = 'Bearer '+token
    When method get
    Then status 200
    And print response
    And match response.data[0].distance contains '<addressOneDistance>'
#    And match response.data[50].distance contains '<addressTwoDistance>'
#    And match response.data[99].distance contains '<addressThreeDistance>'

    Examples:
      | latitude            | longitude          | resultSize | addressOneDistance | addressTwoDistance | addressThreeDistance |
      | -26.105000000000004 | 28.052498333333332 | 100        | 0.53 kms           | 14.84 kms          | 30.73 kms            |


  @smart-queuing
  Scenario Outline: Get nearest branches - invalid location
    Given path 'branches'
    And url baseURL
    And param latitude = <latitude>
    And param longitude = <longitude>
    And param resultSize = <resultSize>
    And header Authorization = 'Bearer '+token
    When method get
    Then status 400
    And print response

    Examples:
      | latitude | longitude | resultSize |
      | 120    | 200         | 100        |