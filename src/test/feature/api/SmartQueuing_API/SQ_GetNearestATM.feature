Feature: Get nearest atm

  Background:
    * def token = SmartQueue_Token
    * def baseURL = SmartQueue_BaseURL
    * configure proxy = VPN_proxy

  @smart-queuing
  Scenario Outline: Get nearest atm
    And path 'atms'
    And url baseURL
    And param latitude = <latitude>
    And param longitude = <longitude>
    And param resultSize = <resultSize>
    And header Authorization = 'Bearer '+token
    When method get
    Then status 200
    And print response
    And match response.data[0].distance contains '<addressOneDistance>'
    And match response.data[1].distance contains '<addressTwoDistance>'
    And match response.data[3].distance contains '<addressThreeDistance>'
    And match response.data[3].distance contains '<addressFourDistance>'
    And match response.data[4].distance contains '<addressFiveDistance>'
    And match response.data[5].distance contains '<addressSixDistance>'
    And match response.data[6].distance contains '<addressSevenDistance>'
    And match response.data[7].distance contains '<addressEightDistance>'
    And match response.data[8].distance contains '<addressNineDistance>'
    And match response.data[9].distance contains '<addressTenDistance>'

    Examples:
      | latitude            | longitude          | resultSize | addressOneDistance | addressTwoDistance | addressThreeDistance | addressFourDistance | addressFiveDistance | addressSixDistance | addressSevenDistance | addressEightDistance | addressNineDistance | addressTenDistance |
      | -26.105000000000004 | 28.052498333333332 | 10         | 0.17 kms           | 0.22 kms           | 0.47 kms             | 0.47 kms            | 0.53 kms            | 0.53 kms           | 0.53 kms             | 0.53 kms             | 0.53 kms            | 0.57 kms           |


  @smart-queuing
  Scenario Outline: Nearest atm invalid location
    And path 'atms'
    And url baseURL
    And param latitude = <latitude>
    And param longitude = <longitude>
    And param resultSize = <resultSize>
    And header Authorization = 'Bearer '+token
    When method get
    Then status 400
    And print response
    And match response.message == "The request is invalid."
    And match response.modelState.latitude[*] ==  ["Latitude should be in proper format eg: (+/-34.65435678) and range"]
    And match response.modelState.longitude[*] == ["Longitude should be in proper format eg: (+/-34.65435678) and range"]

    Examples:
      | latitude | longitude | resultSize |
      | -570.65435678      | +650.65435678       | 1          |