
Feature: Overdraft Limit Increase Campaign Screen validation

  Description: Automation script Campaign  Screen for Overdraft

  Background:

  @Android_OD_LI_NavigateToCampaign
  Scenario Outline: Navigate to Campaign Screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    Examples:
      |Username           |Password   |
      |Wakandafunc000012  |Testing1!  |


  @Android_OD_CampaignScreenValidation
    Scenario Outline: Validate campaign screen UI
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And Validate Text on the Campaign screen "<campaignHeading>""<campaignSubHeading>""<featuresAndBenefitsLabel>""<firstBenefit>""<secondBenefit>""<ThirdBenefit>"
    Examples:
    |Username         |Password | campaignHeading |campaignSubHeading                                                                             | featuresAndBenefitsLabel| firstBenefit                                            | secondBenefit      | ThirdBenefit                        |
    |Wakandafunc000012|Testing1!|Good news!       |As a loyal Nedbank client, you may qualify for an increase on your existing limit up to| Features and benefits:  |Your new limit will be available within one business day.| No additional cost.| No paperwork or documents to submit.|


  @Android_OD_LI_CampaignScreenSelectNo_Thanks
  Scenario Outline: Upon selecting No Thanks Button client should be navigated back to the Dashboard screen
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks 'No Thanks' Button
    Then client should be navigated back to the Offers screen
    Examples:
      |Username           |Password |
      |Wakandafunc000012  |Testing1!|


  @Android_OD_LI_CampaignScreenSelect_Im_Interested
  Scenario Outline: Upon selecting I'm Interested Button client should be navigated to next screen(Let's get started screen)
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    And client navigates to Campaign screen
    And client clicks on 'Im interested' button
    Then user should be navigated to the Disclaimers screen "<disclaimersHeading>"
    Examples:
      |Username          |Password |disclaimersHeading|
      |Wakandafunc000012 |Testing1!|Let's get started |
