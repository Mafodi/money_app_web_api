Feature: CL_E2E_Flow
  Description: CL_E2E_Flow

  @CL_E2E_MoreNotification @Regression_PL
  Scenario Outline: CL_E2E_Flow
    Given User launches the application
    And User clicks on allow and ignore Update
    #And User clicks on continue button
    And User clicks on next button
    And User clicks on New Login button
    And User clicks on BusinessProfile button
    Then User enters username and password
      | username   | password    |
      | ghostcons8 | Testing123* |
    And User clicks on t&c checkbox
    Then User clicks on login button
    And User clicks on skip button for pin
    #And User declines pin creation
    Then Home screen page should display
    And User clicks on ok snackbar
    And User clicks on more option
    And User clicks on notification tab
    And User clicks on foryou tab
    And User clicks on CLOffer
      | CLOffer                                                                                                                                                            |
      | Test MNTHLY Pass:Consolidation loan. Up to R204 100.00 additional cash out on your existing Nedbank Personal loan. Money in your account with a few simple clicks. |
    And User clicks on iminterested button on campaign screen
    And User scrolls letsgetstarted screen to bottom
    And User clicks on all checkbox
    And User clicks on confirm button
    And User scrolls Your information screen to bottom
    And User clicks confirm button on YourInformation screen
    And User scrolls your offer screen to bottom
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

    Examples: 
      | SlectOption | EmailId              |
      | Furniture   | vinitb@nedbank.co.za |
