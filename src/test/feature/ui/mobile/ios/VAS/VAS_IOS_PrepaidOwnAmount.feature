@iosRegression @vasiosregression
Feature: Own Amount Screen Prepaid Feature


  @VasprepaidOwnAmountValidations
  Scenario Outline: Buy Own Amount airtime less than minimum amount
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    And User chooses "CellC" to buy a prepaid product for
    And User chooses "Own Amount" to top up airtime
    And User enters "3" to Top Up airtime
    Then minimum validation occurs and next button is disabled


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|


  @VasprepaidOwnAmountValidations
  Scenario Outline: Buy Own Amount airtime more than maximum amount
    Given user launch the money app new ios app
    And user chooses "Business Profile" on select profile screen
    And user enters a username "<username>" and password "<password>" for first login ios app
    And User selects IOS Transact icon
    And User selects IOS Buy button
    And User chooses "Buy prepaid data, airtime or SMSs" on Vas Offering Screen
    And User chooses "CellC" to buy a prepaid product for
    And User chooses "Own Amount" to top up airtime
    And User enters "5700" to Top Up airtime
    Then maximum validation occurs and next button is disabled


    Examples:
      |username     |password |
      |Vasprofile10 |Testing1!|


