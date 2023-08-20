@AndroidRegression @FND @Lotto
Feature: Play Powerball QuickPlay
  @PowerQuickPlay
  Scenario: Play Powerball QuickPlay
    Given User is on the buy Powerball screen
    When User selects Buy powerball tickets
    And User selects powerball icon
    And User selects powerball QuickPlay
    And User selects powerball plus
    Then User reviews powerball purchase
    And completes Powerball QuickPlay purchase