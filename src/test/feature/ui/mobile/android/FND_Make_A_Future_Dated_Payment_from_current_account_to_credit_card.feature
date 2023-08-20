 @AndroidRegression @FND
  Feature:
  @futuredatedpaymentfromcurrentacctocreditcard
  Scenario Outline: Make a future dated payment from current to credit card
    Given FD_User_pyt_CC is on the Payment screen
    When FD_User_pyt_CC navigates to Single Payment screen
    And FD_User_pyt_CC selects recipients icon
    And FD_User_pyt_CC should be able to search "<recipientsname>" and select
    Then FD_User_pyt_CC Clicking on next should take me to next screenThen PEM_AcctUser_schedule clicking on next should take me to next screen and select a future date
    And FD_User_pyt_CC should be able to make payment successfully

    Examples:
      |recipientsname|
      |NedbankCurrentaccount|


