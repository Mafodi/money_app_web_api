Feature: View HeyNed Terms and Conditions

  @21HeyNedSettingsTsAndCs
  Scenario Outline: A client navigates to the HeyNed Terms and Conditions
    Given As a client I am on the NedbankMoneyApp
    When I capture Username "<Username>" and Password "<Password>"
    And I click Login button
    Then Home screen page should display
    And I click on the More option
    Then More options menu should display
    And I click Terms and Conditions
    Then I should land on Review our terms and conditions screen
    And I click on HeyNed
    Then I should land on HeyNed Terms and Conditions

    Examples:
      |Username   |Password   |
      |DCtest106  |Test@1234  |

  @22HeyNedSubscriptionTsAndCs
  Scenario Outline: A client reviews HeyNed Terms and Condition before subscription
    Given As a client I am on the NedbankMoneyApp
    When I capture Username "<Username>" and Password "<Password>"
    And I click Login button
    Then Home screen page should display
    And I click on the chat icon from the home screen
    Then I should land on the chat platform options
    And I select the lifestyle option
    Then I should see the education screens
    And I select the Get started button
    And I click on T&Cs

    Examples:
      |Username   |Password   |
      |DCtest104  |Test@1234  |