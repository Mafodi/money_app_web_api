@OrderAPI
Feature:Order API

  Background:

    * def securityToken = read('TokenStore/api.security.token.txt')
    * callonce read('Vas_Config_SetUp.feature')
    * def Timeout = 80000
    * configure ssl = true
    * def VPN_proxy = 'http://10.74.11.24:3128'

  @order-regression
  Scenario Outline: Get Order

    Given path '/orders'
    And url VAS_OrderEngine_BaseURL
    And print '######## Security token ######## '+securityToken
    And configure connectTimeout = Timeout
    And param MaxResultCount = <count>
    And param ProductType = 'Voucher'
    And header Authorization = 'Bearer '+securityToken
    When method get
    Then status 200
    And print response
    Examples:
      | count |
      | 20    |


  @order-regression
  Scenario: Create new Order from Json

    * def CreateOrder = read('jsonData/VASCreateOrder.json')

    Given path '/orders'
    And url VAS_OrderEngine_BaseURL
    And print '######## Security token ######## '+securityToken
    And configure proxy = VPN_proxy
    And configure connectTimeout = Timeout
    And header Authorization = 'Bearer '+securityToken
    And def GUIDNo = GUUIDGenerator()
    And print GUIDNo
    And set CreateOrder.requestId = GUIDNo
    And print CreateOrder
    And request CreateOrder
    When method post
    Then status 201
    And print response
    And def referenceId = response.result.secureTransaction.verificationReferenceId
    And def GUIId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASOrderGUI.txt',GUIDNo)
    And def refId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASOrderRefId.txt',referenceId)
    And def OrderId = response.result.orders[0].orderId
    And def OrderEngId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASOrderId.txt',OrderId)
    And match response.result ==
    """
    {
    "requestId": '#string',
    "orders": [
      {
        "orderId": '#string',
        "product": {
          "productId": '#string',
          "productName": '#string',
          "productDescription": '#string',
          "productCategory": '#string',
          "vendorName": '#string',
          "additionalContent": '#string',
          "productType": {
            "productTypeId": #number,
            "productTypeName": '#string'
          },
          "expired": #boolean
        },
        "orderRequestedDate": '#string',
        "amount": #number,
        "quantity": #number,
        "paymentReference": '#string',
        "fromItemAccountId": '#string',
        "orderStatus": '#string',
        "orderReferenceNumber": '#string',
        "recipient": {
          "beneficiaryID": #number,
           "beneficiaryName": '#string',
          "beneficiaryType": '#string',
          "destination": '#string',
          "expired": #boolean
        },
        "result": [
          {
            "status": '#string',
            "code": '#string',
            "description": '#string'
          }
        ],
        "webIcon": '#string',
        "iosIcon": '#string',
        "androidIcon": '#string',
        "fromAccountNumber": '#string',
        "vendorReferenceNumber": '#string'
      }
    ],
    "secureTransaction": {
      "verificationReferenceId": #number,
      "customId": '#string',
      "status": '#string'
    }
  }
    """


#  @order-regression
#  Scenario: Get verification reference id
#    * def sleep =
#      """
#      function(seconds){
#        for(i = 0; i <= seconds; i++)
#        {
#          java.lang.Thread.sleep(1*1000);
#          karate.log(i);
#        }
#      }
#      """
#    * call sleep 10
#    * def referenceId = read('jsonData/VASOrderRefId.txt')
#    * def GUIDNo = read('jsonData/VASOrderGUI.txt')
#
#    Given path '/orders/verifications/',referenceId
#    And url VAS_OrderEngine_BaseURL
#    And print '######## Security token ######## '+securityToken
#    And configure proxy = VPN_proxy
#    And configure connectTimeout = 60000
#    And header Authorization = 'Bearer '+securityToken
#    And param verificationreferenceid = referenceId
#    And param requestId = GUIDNo
#    When method get
#    Then status 200
#    And print response
#    And match response != ''
#
#
#
#  @order-regression
#  Scenario: Approve Order from Json
#
#    * def CreateOrder = read('jsonData/VASCreateOrder.json')
#    * def GUIDNo = read('jsonData/VASOrderGUI.txt')
#
#
#    Given path '/orders'
#    And url VAS_OrderEngine_BaseURL
#    And print '######## Security token ######## '+securityToken
#    And configure proxy = VPN_proxy
#    And configure connectTimeout = Timeout
#    And header Authorization = 'Bearer '+securityToken
#    And set CreateOrder.requestId = GUIDNo
#    And print CreateOrder
#    And request CreateOrder
#    When method post
#    Then status 201
#    And print response
#    And match response.result.orders[0].vendorReferenceNumber != ''
#    And def OrderId = response.result.orders[0].orderId
#    And def OrderEngId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASOrderId.txt',OrderId)

  @order-regression
  Scenario: Get Order Id By Id

    * def OrderId = read('jsonData/VASOrderId.txt')

    Given path '/orders/' , OrderId
    And url VAS_OrderEngine_BaseURL
    And print '######## Security token ######## '+securityToken
    And configure connectTimeout = Timeout
    And header Authorization = 'Bearer '+securityToken
    When method get
    Then status 200
    And print response.result
#    And match response.result.vendorReferenceNumber != ''
    And def ProductId = response.result.product.productId
    And def proId = KarateUtil.WriteToFile('src/test/feature/api/jsonData/VASOrderProductId.txt',ProductId)
    And match response.result ==
    """
    {
      "orderId": '#string',
      "product": {
        "productId": '#string',
        "productName": '#string',
        "productDescription": '#string',
        "productCategory": '#string',
        "vendorName": '#string',
        "productType": {
          "productTypeId": #number,
          "productTypeName": '#string'
        },
        "additionalContent": '#string',
        "expired": #boolean
      },
      "orderRequestedDate": '#string',
      "amount": #number,
      "paymentReference": '#string',
      "fromItemAccountId": '#string',
      "fromAccountNumber": '#string',
      "orderStatus": '#string',
      "orderReferenceNumber": '#string',
      "recipient": {
      "beneficiaryID": #number,
      "beneficiaryName": '#string',
      "beneficiaryType": '#string',
      "destination": '#string',
        "expired": #boolean
      },
      "webIcon": '#string',
      "iosIcon": '#string',
      "androidIcon": '#string',
      "channelId": #number,
      "result": [
        {
          "status": '#string',
          "code": '#string',
          "description": '#string'
        }
      ]
    }
    """
