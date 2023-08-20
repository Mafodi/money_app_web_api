Feature: Get Qmatic branch waiting time

  Background:
    * def token = SmartQueue_Token
    * configure ssl = { keystore:'certs/NedbankIssuingSHA2.cer' }
    * configure charset = null
    * def baseURL = SmartQueue_BaseURL_V1

  @smart-queuing
  Scenario Outline: Get qmatic branch waiting time
    Given path 'branches'
    And url baseURL
    And param qmaticBranchId = <qmaticBranchId>
    And header Authorization = 'Bearer '+token
    And header X-IBM-Client-Id = '55190ade-6341-4672-ac7f-8543747e1660'
    And header X-IBM-Client-Secret = 'xJ1rU0vM8hF7wA8kC4jI4oB1gT7rT4eQ2nK0pR8lP5uI1vQ5cC'
    And configure connectTimeout = 6000
    When method get
    Then status 200
    And print response
    And match response.data.code == <branchCode>
    And match response.data.name == '<branchName>'
    And match response.metadata.resultData[*] contains  {"httpReturnCode": "200","resultCode": "R00","resultDescription": "OK"}

    Examples:
      | qmaticBranchId | branchCode | branchName      |
      | 1              | 933        | Nedbank Sandown |