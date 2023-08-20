@AndroidRegression @FND @Lotto
Feature: Play Lotto QuickPlay
  @LottoQuickPlay
  Scenario: Play Lotto QuickPlay
    Given User is on the buy Lotto screen
    When User selects Buy tickets
    And User selects QuickPlay
    And User selects lotto plus one and two
    Then User reviews purchase
    And completes Lotto QuickPlay purchase