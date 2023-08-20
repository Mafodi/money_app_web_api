Feature: PL_STL_E2E_Flow
  Description: PL_STL_E2E_Flow

  @PL_STL_E2E_MoreNotification @Regression_PL
  Scenario Outline: PL_STL_E2E_Flow
    Given User launches the application
    And User clicks on allow and ignore Update
    #And User clicks on continue button
    And User clicks on next button
    And User clicks on New Login button
    And User clicks on BusinessProfile button
    Then User enters username and password
      | username      | password      |
      | ghosttest1041 | GhostTest@149 |
    And User clicks on t&c checkbox
    Then User clicks on login button
    And User clicks on skip button for pin
    #And User declines pin creation
    Then Home screen page should display
    And User clicks on ok snackbar
    And User clicks on more option
    And User clicks on notification tab
    And User clicks on foryou tab
    And User clicks on PLOffer
      | PLOffer                                                                                                                            |
      | Test MNTHLY Pass:One month loan up to R6 000.00. 8% initiation fee. Zero interest. Money in your account with a few simple clicks. |
    And User clicks on iminterested button on campaign screen
    And User scrolls letsgetstarted screen to bottom
    And User clicks on all checkbox
    And User clicks on confirm button
    And User scrolls Your information screen to bottom
    And User clicks confirm button on YourInformation screen
    And User scrolls your offer screen to bottom
    And User selects debit order date "<Date>"
    And User clicks confirm button on YourOffer screen
    And User scrolls review screen to bottom
    And User clicks confirm button on Review screen
    And User scrolls disclosure screen to bottom
    And User clicks on radioButton
    And User clicks on LoanReasonsOptions tabs
    And User selects ReasonForLaon Option "<SlectOption>"
    #And User scrolls disclosure screen to bottom
    And User clicks on confirm button on disclosure screen
    And User clicks on Agree Button
    #And User clicks on Authorize button on Debichek screen
    And User enters emailid "<EmailId>"

    #And User clicks on confirm button on EmailSCreens
    #And User clicks on Done Button on Screen
    #And User clicks on more option
    #And User clicks on notification tab
    #And User clicks on foryou tab
    #And User should not see any notification"<Text1>"
    Examples: 
      | SlectOption | EmailId              | Date                           | Text1                            |
      | Furniture   | vinitb@nedbank.co.za | Salary date                    | You don’t have any notifications |
      | Furniture   | vinitb@nedbank.co.za | 30 days after taking this loan | You don’t have any notifications |
