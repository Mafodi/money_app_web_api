Feature: Get branch details

  Background:
    * def token = SmartQueue_Token
    * def baseURL = SmartQueue_BaseURL
    * configure proxy = VPN_proxy


  @smart-queuing
  Scenario Outline: Verify api is up and correct branch is appearing
    Given path 'branches/<branchCode>'
    And url baseURL
    And header Authorization = 'Bearer '+token
    When method get
    Then status 200
    And print currentdate
    And print response
    And match response.data.code contains <branchCode>
    And match response.data.name contains '<branchName>'

    Examples:
      | branchCode | branchName     |
      | 91         | Nedbank George |

  @smart-queuing
  Scenario Outline: Verify correct error code in case of Invalid Branch code in Branch details API
    Given path 'branches/<branchCode>'
    And url baseURL
    And header Authorization = 'Bearer '+token
    When method get
    Then status 500
    Then print response
    Then match response.metadata.resultData[*].httpReturnCode contains '<returnCode>'

    Examples:
      | branchCode | returnCode |
      | 0          | 500        |

  @smart-queuing
  Scenario Outline: Verify the distance calculation
    Given path 'branches/<branchCode>'
    And url baseURL
    And param latitude = '<latitude>'
    And param longitude = '<longitude>'
    And header Authorization = 'Bearer '+token
    When method get
    Then status 200
    And print response
    And match response.data.distance contains "1001.60 kms"

    Examples:
      | branchCode | latitude | longitude |
      | 836        | -21      | 20        |


  @smart-queuing
  Scenario Outline: Verify the Opening hours of the branch
    Given path 'branches/<branchCode>'
    And url baseURL
    And header Authorization = 'Bearer '+token
    When method get
    Then status 200
    And print response
    And match response.data.businessHours[*] contains {"day": "Monday","openingHour": "09:00","closingHour": "15:00","mondayHours": "09:00 - 15:00"}
    And match response.data.businessHours[*] contains {"day": "Tuesday","openingHour": "09:00","closingHour": "15:00","tuesdayHours": "09:00 - 15:00"}
    And match response.data.businessHours[*] contains {"day": "Wednesday","openingHour": "09:00","closingHour": "15:00","wednesdayHours": "09:00 - 15:00"}
    And match response.data.businessHours[*] contains {"day": "Thursday","openingHour": "09:00","closingHour": "15:00","thursdayHours": "09:00 - 15:00"}
    And match response.data.businessHours[*] contains {"day": "Friday","openingHour": "09:00","closingHour": "15:00","fridayHours": "09:00 - 15:00"}
    And match response.data.businessHours[*] contains {"day": "Saturday","openingHour": "09:00","closingHour": "12:00","saturdayHours": "09:00 - 12:00"}
    And match response.data.businessHours[*] contains {"day": "Sunday","openingHour": "Closed","closingHour": "Closed","sundayHours": "Closed - Closed"}

    Examples:
      | branchCode |
      | 836        |


  @smart-queuing
  Scenario Outline: Verify the facilities of the branch
    Given path 'branches/<branchCode>'
    And url baseURL
    And header Authorization = 'Bearer '+token
    When method get
    Then status 200
    And print response
    And match response.data.facilities[*] contains {"disclaimerMessage": "","name": "Deposit taking ATM","code": "DEPF024B140"}
    And match response.data.facilities[*] contains {"disclaimerMessage": "","name": "Self Service Kiosk","code": "SEL49C8D916"}
    And match response.data.facilities[*] contains {"disclaimerMessage": "","name": "Wi-Fi","code": "WIFC985DA73"}
    And match response.data.facilities[*] contains {"disclaimerMessage": "","name": "Wheel Chair Friendly with Staff Assistance*","code": "WHE2C99B58E"}

    Examples:
      | branchCode |
      | 836        |


  @smart-queuing
  Scenario Outline: Verify the services of the branch
    Given path 'branches/<branchCode>'
    And url baseURL
    And header Authorization = 'Bearer '+token
    When method get
    Then status 200
    And print response
    And match response.data.services[*] contains {"waitingTime": "00:00","disclaimerMessage": "","name": "Account enquiry","code": "ACCD8AD7562"}
    And match response.data.services[*] contains {"waitingTime": "00:00","disclaimerMessage": "","name": "New accounts and advice","code": "NEW6B6F7D55"}
    And match response.data.services[*] contains {"waitingTime": "00:00","disclaimerMessage": "","name": "Bulk teller","code": "BULF0D68094"}
    And match response.data.services[*] contains {"waitingTime": "00:00","disclaimerMessage": "","name": "Card/Collection","code": "CAR3A359C35"}
    And match response.data.services[*] contains {"waitingTime": "00:00","disclaimerMessage": "","name": "Personal loans","code": "PERA665BD53"}
    And match response.data.services[*] contains {"waitingTime": "00:00","disclaimerMessage": "","name": "Statements","code": "STAA639B78F"}
    And match response.data.services[*] contains {"waitingTime": "00:00","disclaimerMessage": "","name": "Teller","code": "TELACE07921"}

    Examples:
      | branchCode |
      | 836        |


  @smart-queuing
  Scenario Outline: Verify qmatic flag and email and address of the branch
    Given path 'branches/<branchCode>'
    And url baseURL
    And header Authorization = 'Bearer '+token
    When method get
    Then status 200
    And print response
    And match response.data.hasQMatic contains <qmaticStatus>
    And match response.data.contact.email contains '<email>'
    And match response.data.address.addressLine contains '<addressline>'

    Examples:
      | branchCode | qmaticStatus | email                   | addressline                    |
      | 836        | false        | WynbergBM@nedbank.co.za | Cnr Watt Street and 3rd Street |


  @smart-queuing
  Scenario Outline: Verify correct error code in case of Non-qmatic Branch code in Queuetimes API
    Given path 'branches/<branchCode>/queuetimes'
    And url baseURL
    And header Authorization = 'Bearer '+token
    When method get
    Then status 200
    Then print response
    Then match response.metadata.resultData[*].httpReturnCode contains '<returnCode>'

    Examples:
      | branchCode | returnCode |
      | 836        | 204        |

  @smart-queuing
  Scenario Outline: Verify correct error code in case of Invalid Branch code in Queuetimes API
    Given path 'branches/<branchCode>/queuetimes'
    And url baseURL
    And header Authorization = 'Bearer '+token
    When method get
    Then status 500
    Then print response
    Then match response.metadata.resultData[*].httpReturnCode contains '<returnCode>'

    Examples:
      | branchCode | returnCode |
      | 000        | 500        |


  @smart-queuing
  Scenario Outline: Verify Time stamp in Queuetimes API
    Given path 'branches/<branchCode>/queuetimes'
    And url baseURL
    And header Authorization = 'Bearer '+token
    When method get
    And print response
    And def apidate = response.data.modifiedOn.substring(0,16)
    And print apidate
    And def getDate =
      """
      function() {
        var SimpleDateFormat = Java.type('java.text.SimpleDateFormat');
        var sdf = new SimpleDateFormat('yyyy-MM-dd HH:mm:ss');
        var date = new java.util.Date();
        if(date.getSeconds()<=50){
        date.setSeconds(date.getSeconds() -28);}
        return sdf.format(date);
      }

      """

    And def currentdate = getDate().substring(0,16)
    And print currentdate
    And match apidate contains currentdate

    Examples:
      | branchCode |
      | 970        |


  @smart-queuing
  Scenario Outline: Verify the services and code, waiting times of the branch in Queuetimes API
    Given path 'branches/<branchCode>/queuetimes'
    And url baseURL
    And header Authorization = 'Bearer '+token
    When method get
    Then status 200
    And print response
    And match response.data.services contains {"code": "ACCD8AD7562","name": "Account enquiry","waitingTime": "#notnull"}
    And match response.data.services contains {"code": "BULF0D68094","name": "Bulk teller","waitingTime": "#notnull"}
    And match response.data.services contains {"code": "CAR3A359C35","name": "Card/Collection","waitingTime": "#notnull"}
    And match response.data.services contains {"code": "FORF9046AAA","name": "Forex","waitingTime": "#notnull"}
    And match response.data.services contains {"code": "INT2F8575D1","name": "International payments","waitingTime": "#notnull"}
    And match response.data.services contains {"code": "NEW6B6F7D55","name": "New accounts and advice","waitingTime": "#notnull"}
    And match response.data.services contains {"code": "SMAF443D037","name": "Small-business banker*","waitingTime": "*"}
    And match response.data.services contains {"code": "STAA639B78F","name": "Statements","waitingTime": "#notnull"}
    And match response.data.services contains {"code": "TELACE07921","name": "Teller","waitingTime": "#notnull"}


    Examples:
      | branchCode |
      | 970        |


  @smart-queuing
  Scenario Outline: Verify operatingmodel of the Standing Qmatic branch
    Given path 'branches/<branchCode>/queuetimes'
    And url baseURL
    And header Authorization = 'Bearer '+token
    When method get
    Then status 200
    And print response
    And match response.data.operatingModel contains '<operatingmodel>'


    Examples:
      | branchCode | operatingmodel |
      |121|	Standing|
      |35|	Standing|
      |102|	Standing|
      |17|	Standing|
      |63|	Standing|
      |310|	Standing|
      |148|	Standing|

