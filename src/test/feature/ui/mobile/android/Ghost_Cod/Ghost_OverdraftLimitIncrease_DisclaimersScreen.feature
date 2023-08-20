
Feature: Overdraft Limit Increase Disclaimers Screen validation

  Description: Automation script Disclaimers  Screen for Overdraft

  Background:

  @Android_OD_LI_NavigateToDisclaimersScreeen
  Scenario Outline: Navigate to Disclaimers Screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    Then user should be navigated to the Disclaimers screen "<disclaimersHeading>"
    Examples:
      |Username           |Password   |disclaimersHeading |
      |Wakandafunc000012  |Testing1!  |Let's get started  |

  @Android_OD_LI_DisclaimersScreenTextValidations
  Scenario Outline: user validate text on 'Disclaimers' screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And user validate text on disclaimers screen "<disclaimersHeading>""<disclaimersSubHeading>""<permanentlyEmployedLabel>""<insolventLabel>""<spousal_consent_text>"
    Examples:
      |Username          |Password      |disclaimersHeading  |disclaimersSubHeading                                     |permanentlyEmployedLabel     |insolventLabel                                                                                                                                                                                  |spousal_consent_text                                                                                   |
      |Wakandafunc000012 |Testing1!     |Let's get started   |To get a decision in a few minutes, please confirm that:  |you're permanently employed; |neither you nor your spouse is insolvent, under administration, curatorship or undergoing debt counselling and that neither you nor your spouse has any pending disputes with a credit bureau;  |you consent to us processing your personal information so that we can provide banking services to you. |


  @Android_OD_LI_DisclaimersSelectOneCheckbox
  Scenario Outline: user select One Checkbox on 'Disclaimers' screen, Confirm button should only when all three checkboxes are checked
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And user ticks one checkboxes 'Permanently_Employed_Checkbox'
    Then confirm button should be disabled
    Examples:
      |Username          |Password    |
      |Wakandafunc000012 |Testing1!   |


  @Android_OD_DisclaimersSelectTwoCheckboxes
    Scenario Outline: Select two checkboxes on disclaimers screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And user ticks two checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox'
    Then confirm button should be disabled

    Examples:
      |Username          |Password    |
      |Wakandafunc000012 |Testing1!   |


  @Android_OD_DisclaimersSelectAllThreeCheckboxes
  Scenario Outline : user select All Three Checkboxes 'Disclaimers' screen, Confirm button should be disabled
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    Then confirm button should be enabled
    Examples:
      |Username          |Password    |
      |Wakandafunc000012 |Testing1!   |


  @Android_OD_DisclaimersScreenClicksOnThe_Back_button
  Scenario Outline: user clicks on the Back button on 'Disclaimers' screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And user clicks on the 'Back_Button'
    Then user should be navigated to the Campaign screen
    Examples:
      |Username          |Password    |
      |Wakandafunc000012 |Testing1!   |


  @Android_OD_DisclaimersScreenClicksOnThe_Confirm_button
  Scenario Outline: user clicks on the Confirm button on 'Disclaimers' screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And user clicks 'confirm button'
    Then user should be navigated to the Financial screen "<financialHeader>"
    Examples:
      |Username          |Password    |financialHeader|
      |Wakandafunc000012 |Testing1!   |Your information|
