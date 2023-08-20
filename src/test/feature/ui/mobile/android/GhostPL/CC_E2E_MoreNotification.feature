Feature: CC_E2E_Flow
  Description: CC_E2E_Flow

  @CC_E2E_MoreNotification @Regression_PL
  Scenario Outline: CC_E2E_Flow
    Given User launches the application
    And User clicks on allow and ignore Update
    #And User clicks on continue button
    And User clicks on next button
    And User clicks on New Login button
    And User clicks on BusinessProfile button
    Then User enters username and password
      | username          | password  |
      | Wakandafunc000012 | Testing1! |
    And User clicks on t&c checkbox
    Then User clicks on login button
    And User clicks on skip button for pin
    And User clicks on next button to link accounts
    #And User declines pin creation
    Then Home screen page should display
    And User clicks on ok snackbar
    And User clicks on more option
    And User clicks on notification tab
    And User clicks on foryou tab
    And User clicks on PLOffer
      | PLOffer                                                                                                                                                      |
      | Test Pass:Within 24 hours you could get a credit limit increase of up to R30 000.00 on your credit card with last number . No additional documents required. |
   
    And User clicks on iminterested button on campaign screen
    And User scrolls letsgetstarted screen to bottom
    And User clicks on all checkbox
    And User clicks on confirm button
    And User scrolls Your information screen to bottom
    And User clicks confirm button on YourInformation screen
    And User scrolls review screen to bottom
    And User clicks yes on review my credit limit
    And User scrolls review screen to bottom
    And User clicks confirm button on Review screen
    And User scrolls disclosure screen to bottom
    And User clicks on radioButton
    And User clicks on confirm button on disclosure screen
    And User clicks on confirm button for card delivery
    And User clicks on Agree Button
    #And User clicks on Authorize button on Debichek screen
    And User enters emailid "<EmailId>"

    Examples: 
      | SlectOption | EmailId              |
      | Furniture   | vinitb@nedbank.co.za |
