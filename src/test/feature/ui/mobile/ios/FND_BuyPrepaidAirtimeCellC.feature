@iOSRegression @FNDiOS @PrepaidiOS
Feature: Buy CellC airtime bundle
  @BuyPrepaidAirtimeVodacomiOS
  Scenario Outline: Buy CellC airtime bundle
    Given User is on the buy prepaid screen for CellC ios app
    When User selects Buy prepaid CellC airtime data sms ios app
    And User selects CellC beneficiary "<recipient>"
    And User selects CellC provider ios app
    And User selects CellC airtime ios app
    And User selects CellC bundle ios app
    And User enters CellC reference "<reference>"
    Then User reviews CellC airtime purchase ios app
    And completes CellC airtime bundle purchase ios app

    Examples:
      |recipient|reference|
      |CellC|TestCellCAir|