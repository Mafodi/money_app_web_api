Feature: Overdraft  Responsive App - Android - Present 'Wrong Information' screen

  Description: Automation script Wrong Information Screen for Overdraft

  Background:


  @Android_OD_LI_NavigateToWrongInformationScreen
  Scenario Outline: Is Your Information correct? - Selecting No takes user to wrong information screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user select toggle 'Toogle_No'
    And user validate ToggleMessage
    And user clicks 'confirm button'
    Then wrong information screen is displayed "<wrongInfoHeader>"
    Examples:
      |Username          |Password    |wrongInfoHeader    |
      |Wakandafunc000006 |Testing1!   |Wrong information  |



  @Android_OD_WrongInformationScreenTextValidation
  Scenario Outline: user validates Text on the Wrong Information Screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user select toggle 'Toogle_No'
    And user clicks 'confirm button'
    Then user validates text on wrong information screen "<wrongInfoHeader>""<wrongInformationSubHeader>""<wrongInTotalIncomeLabel>""<wrongInfoTotalLivingExpensesLabel>""<wrongInfoTotalDebtObligationLabel>""<weWillBeInTouchText>"

    Examples:
      |Username           |Password  |wrongInfoHeader     |wrongInformationSubHeader                                                                   |wrongInTotalIncomeLabel  |wrongInfoTotalLivingExpensesLabel  |wrongInfoTotalDebtObligationLabel  |weWillBeInTouchText                |
      |Wakandafunc000006  |Testing1! |Wrong information  |Tell us which information is wrong, or call us on 0860 555 111 to update your information.  |Total monthly income       |Total monthly living expenses      |Total monthly debt obligations     |We'll be in touch to help you.     |


  @Android_OD_WrongInformationScreenValidationDoneButtonISEnabled
  Scenario Outline: user validates checkboxes on Wrong Information Screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user select toggle 'Toogle_No'
    And user clicks 'confirm button'
    And user select all checkboxes 'Total_Monthly_Income_Checkbox' 'Total_Monthly_Living_Expenses_Checkbox' 'Total_Monthly_Debt_Obligation_Checkbox'
    Then Done button should be enabled
    Examples:
      |Username          |Password |
      |Wakandafunc000006 |Testing1!|


  @Android_OD_WrongInformationScreenClickBackArrow
  Scenario Outline: When Clicking Back arrow on Wrong Information screen user should be navigated back to Your Information screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user select toggle 'Toogle_No'
    And user clicks 'confirm button'
    And user clicks on the 'Back_Arrow'
    Then user should be navigated to the Financial screen "<financialHeader>"
    Examples:
      |Username          |Password |financialHeader|
      |Wakandafunc000006 |Testing1!|Your information|

  @Android_OD_WrongInformnationScreenValidateDoneButtonIsDisabled
  Scenario Outline: user does not select any checkbox on the Wrong Information Screen then clicks Done Button
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user select toggle 'Toogle_No'
    And user clicks 'confirm button'
    Then Done Button should be disabled

    Examples:
      |Username          |Password |
      |Wakandafunc000006 |Testing1!|


  @Android_OD_WrongInformationScreenSelectAllCheckboxesThenClickDoneButton
  Scenario Outline: user checks all checkbox on Wrong Information Screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user select toggle 'Toogle_No'
    And user clicks 'confirm button'
    And user select all checkboxes 'Total_Monthly_Income_Checkbox' 'Total_Monthly_Living_Expenses_Checkbox' 'Total_Monthly_Debt_Obligation_Checkbox'
    And user select Done Button
    Then Nedbank money web dashboard should be displayed

    Examples:
      |Username          |Password |
      |Wakandafunc000006 |Testing1!|
