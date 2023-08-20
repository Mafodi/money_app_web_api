@WebRegression
Feature:Queuetimes_UnauthOpt_Out_Mode

  Background:Launch the browser profile with Deny Location option
    When close the default opened_browser
    And  Launched the new browser successfully by 'Deny' the Geo_locations

  @Queuetimes_Unauth_Opt_Out
  Scenario Outline:Verifying the functionality of Queuetimes in Unauthorized Opt Out process
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    And User Manually typed "<Location name>" on_the Search_bar and Clicks_enter
    Then Verify the List of Branches displayed on the Side_bar
    When Click on More branch_info option on "<Qmatic Branch name>" Branch
    Then Verify all the fields related to the Qmatic waiting times
    When Clicks on the cross button of the MoreBranch Info Screen
    Then Verify user gets back to the SideBar  Page
    When User clicks on Logout button

    Examples:
      |Location name|Qmatic Branch name|
      |Sandton      |Nedbank Sandton |
