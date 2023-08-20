Feature: Put Qmatic branch waiting time

  Background:
    * def token = SmartQueue_Token
    * configure ssl = { keystore:'certs/NedbankIssuingSHA2.cer' }
    * configure charset = null
    * def baseURL = SmartQueue_BaseURL_V1


  @smart-queuing
  Scenario Outline: Put qmatic branch waiting time
    Given path 'branches/<branchCode>/queueTimes'
    And url baseURL
    And header Authorization = 'Bearer '+token
    And header X-IBM-Client-Id = '55190ade-6341-4672-ac7f-8543747e1660'
    And header X-IBM-Client-Secret = 'xJ1rU0vM8hF7wA8kC4jI4oB1gT7rT4eQ2nK0pR8lP5uI1vQ5cC'
    And request { "branchQueueTimes": [ {"code": "ACCD8AD7562","queueTime": "10"},{"code": "NEW6B6F7D55","queueTime": "20"},{"code": "BULF0D68094","queueTime": "30"},{"code": "CAR3A359C35","queueTime": "40"}]}
    When method put
    Then status 200
    And print response
    And match response.page == <page>
    And match response.pageSize == <page>
    And match response.pageLimit == <page>
#    And match response.resultData[*] contains  {"httpReturnCode": "200","resultCode": "R00","resultDescription": "OK"}

    Examples:
      | branchCode | page |
      | 1          | 0    |