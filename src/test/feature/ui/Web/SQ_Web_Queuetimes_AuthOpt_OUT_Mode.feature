@WebRegression
Feature:Queuetimes_AuthOpt_Out_Mode

  Background:Launch the browser profile with Deny Location option
    When close the default opened_browser
    And  Launched the new browser successfully by 'Deny' the Geo_locations

  @Queuetimes_Auth_Opt_Out
  Scenario Outline:Verifying the functionality of Queuetimes in Authorized Opt Out process
    Given user launch Money App web application
    When Web user enter username "<username>" and password "<password>"
    And User clicks on Login button
    Then user must log on to Money Web application
    When Click on Find now option to validate the List of Branches
    And User Manually typed "<Location name>" on_the Search_bar and Clicks_enter
    Then Verify the List of Branches displayed on the Side_bar
    When Click on More branch_info option on "<Qmatic Branch name>" Branch
    Then Verify all the fields related to the Qmatic waiting times
    When Clicks on the cross button of the MoreBranch Info Screen
    Then Verify user gets back to the SideBar  Page
    When User clicks on Logout button

    Examples:
      |username    |password  |Location name|Qmatic Branch name|
      | Praveen123 | Testing1!|Sandton      |Nedbank Sandton |
