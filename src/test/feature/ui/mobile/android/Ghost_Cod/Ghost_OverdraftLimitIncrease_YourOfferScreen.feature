Feature: Overdraft limit increase Responsive App - Android - Present 'Your Offer' screen

  Description: Automation script Your Information Screen for Overdraft limit increase

  Background:
  @Android_OD_LI_NavigateToYourOfferScreen
  Scenario Outline: Navigate to your offer screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user clicks 'confirm button'
    Then user should be navigated to the Your Offer screen "<yourOfferHeader>"
    Examples:
      |Username         | Password    |
      |Wakandafunc000006| Testing1!   |



  @Android_OD_LI_YourOfferScreenValidateOfferSlider
  Scenario Outline: Navigate to your offer screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user clicks 'confirm button'
    And user validate current repayment amount
    And user validate Offer Slider
    And user clicks recalculate button
    Then repayment amount should be updated
    Examples:
      |Username         |Password    |
      |Wakandafunc000006| Testing1!  |



  @OD_LI_YourOfferScreenSelectInvalidOffer
  Scenario Outline: user select overdraft amount below minimum overdraft amount request
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user clicks 'confirm button'
    And user captures invalid amount
    Then error message should be displayed

    Examples:
      |Username         | Password  |
      |Wakandafunc000006| Testing1! |


  @OD_LI_YourOfferScreenValidateLoanAmountInputFieldIsUpdated
  Scenario Outline: Updating loan amount via slider should update amount on input field with same amount on slider
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user clicks 'confirm button'
    And user validate current loan amount
    And user validate Offer Slider
    Then the Overdraft amount input box should be updated to the same amount on slider
    Examples:
      |Username         | Password  |
      |Wakandafunc000006| Testing1! |


  @OD_LI_YourOfferScreenReviewAnnualIncreaseTogglesValidation
  Scenario Outline: user select amount below minimum overdraft amount request
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    And client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'
    And user clicks 'confirm button'
    And user clicks 'confirm button'
    And user clicks on the Yes toggle
    Then user validate annual increase tooltip text "<AnnualIncreaseToggleMessage>"
    Examples:
      |Username          | Password    |AnnualIncreaseToggleMessage                                                                                          |
      |Wakandafunc000012 | Testing1!   |You can opt for an annual limit increase. If you qualify for a limit increase, it will be applied automatically. |





