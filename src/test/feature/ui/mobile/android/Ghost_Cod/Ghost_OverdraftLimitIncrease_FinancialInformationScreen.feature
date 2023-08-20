
Feature: Overdraft Limit Increase Financial Information Screen validation

  Description: Automation script Financial Information  Screen for Overdraft

  Background:

  @OAndroid_OD_LI_NavigateToFinancialInformationScreeen
  Scenario Outline: Navigate to Financial Information Screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    Examples:
      |Username           |Password   |
      |Wakandafunc000012  |Testing1!  |


  @Android_OD_LI_FinancialInformationScreenTextValidation
  Scenario Outline: user validate text on 'Financial Information' screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    Then user validate your Information screen text "<financialInfoStepper>""<financialHeader>""<FinancialSubHeader>""<totalMonthlyIncome>""<TotalMonthlyLivingExpenses>""<TotalMonthlyDebtObligations>""<CorrectInformationText>"
    Examples:
      |Username          |Password  |financialInfoStepper        |financialHeader   |FinancialSubHeader               |totalMonthlyIncome   |TotalMonthlyLivingExpenses      |TotalMonthlyDebtObligations     |CorrectInformationText          |
      |Wakandafunc000006 |Testing1! |Step 01 of 03  |Your information  |Your monthly income and expenses |Total monthly income |Total monthly living expenses   |Total monthly debt obligations  |Is your information correct?    |


@Android_OD_LI_FinancialInformationMonthlyIncomeAndExpensesValidation
Scenario Outline: user validate Monthly Income and Expenses
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    Then user validate monthly income and expenses "<totalMonthlyIncomeValue>""<totalMonthlyLivingExpensesValue>""<totalMonthlyDebtObligationsValue>"
    Examples:
    |Username          |Password |totalMonthlyIncomeValue |totalMonthlyLivingExpensesValue |totalMonthlyDebtObligationsValue|
    |Wakandafunc000006 |Testing1!|R1 000.00               |R4 508.11                       |R250.00                        |


@Android_OD_LI_FinancialInformationScreenToolTipValidation
Scenario Outline: user validate Tooltips on Financial Information screen
  Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
  And client navigates to Campaign screen
  And client clicks on 'Im interested' button
  And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
  And user clicks 'confirm button'
  Then user validate tooltips on your information screen "<totalMonthlyIncomeToolTip>""<totalMonthlyLivingExpensesToolTip>""<totalMonthlyDebtObligations>"
Examples:
|Username         |Password  |totalMonthlyIncomeToolTip                               |totalMonthlyLivingExpensesToolTip                                         |totalMonthlyDebtObligations                                                                       |
|Wakandafunc000006|Testing1! |This information comes from your Nedbank salary account.|This can include rent, food, transport, medical expenses and school fees. |This can include car finance, home loans, cellphone contracts, credit cards and store card accounts. |


@Android_OD_LI_FinancialInformationScreenClickConfirmButton
Scenario Outline: Upon clicking Confirm button on Financial Information screen client should be navigated to Offer Screen
  Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
  And client navigates to Campaign screen
  And client clicks on 'Im interested' button
  And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
  And user clicks 'confirm button'
  And user clicks 'confirm button'
  Then user should be navigated to Your Offer screen "<offerHeader>"
  Examples:
|Username          |Password  |offerHeader|
|Wakandafunc000006 |Testing1! |Your offer |


  @Android_OD_LI_FinancialInformationScreenClicksOnThe_Back_button
  Scenario Outline: user clicks on the Back button on 'Financial Information' screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user clicks on the 'Back_Arrow'
    Then user should be navigated to the Disclaimers screen "<disclaimersHeading>"
    Examples:
      |Username          |Password    |disclaimersHeading|
      |Wakandafunc000006 |Testing1!   |Let's get started |


  @Android_OD_LI_FinancialInformationScreenClicksOnThe_X_button
  Scenario Outline: user clicks on the X button on 'Financial Information' screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user clicks on the 'X_Button'
    Then user should be navigated to the leaving so soon screen "<leavingSoSoonHeader>"
    Examples:
      |Username          |Password    |leavingSoSoonHeader|
      |Wakandafunc000006 |Testing1!   |Leaving so soon?   |



  @Android_OD_LI_FinancialInformationScreenClicksOnThe_Confirm_button
  Scenario Outline: user clicks on the Confirm button on 'Financial Information' screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user clicks 'confirm button'
    Then user should be navigated to the Your Offer screen "<yourOfferHeader>"
    Examples:
      |Username          |Password    |yourOfferHeader|
      |Wakandafunc000006 |Testing1!   |Your offer     |


@Android_OD_LI_FinancialInformationScreenDropOffIncorrectIncorrectInformation
Scenario Outline: Is Your Information correct? - user select No toggle
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

