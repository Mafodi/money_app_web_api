@AndroidRegression @FNDomit @Lotto
Feature: View Lotto winning numbers
  @LottoWinningNumbers
  Scenario: View Lotto winning numbers
    Given User is on the buy Lotto screen
    When User selects View tickets
    And User selects QuickPlay
    And User selects lotto plus one and two
    Then User reviews purchase
    And completes Lotto QuickPlay purchase