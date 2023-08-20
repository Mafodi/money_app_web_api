@iosRegression @DC_CreditCardhatRouting
Feature: Chat routing through credit card application

  @LiveChatCreditCardChatRouting_Auth
  Scenario Outline: Authenticated user routing to chat from to Credit card Agent
    Given user is on Chatting screen on login with username "<username>" and password "<password>"
    When user sends message "<Message>"
    Then agent gets connected
    And user needs to come back to overview screen
    And user clicks on More button
    And user click on Apply
    Then user will be Get the perfect solution for your needs page should display
    And user click on Open a bank account or bundle
    And user clicks on Credit cards
    Then user clicks on Chat with a Nedbank agent button
    Then Chat page gets opened

    Examples:
      |username|password|Message|
      |Jeet@1720|Jeet@1720|testing|
