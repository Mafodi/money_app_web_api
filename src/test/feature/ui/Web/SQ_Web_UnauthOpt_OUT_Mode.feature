@WebRegression
Feature: UnauthOpt_OUT_Mode

  Background:Launch the browser profile with Deny Location Option
    When close the default opened_browser
    And  Launched the new browser successfully by 'Deny' the Geo_locations

  @Unauth_Opt_Out
  Scenario Outline:Verifying the functionality of Branch and ATM Locator in Unauthorized Opt Out process
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    When User Manually typed "<Location name>" on_the Search_bar and Clicks_enter
    Then Verify the List of Branches displayed on the Side_bar
    And Verify the "<Branch name>" Status Time_Kms displayed for the selected branch
    When Click on More branch_info option on "<Branch name>" Branch
    Then Verify that user landed with Address,Phone number ,Email,Branchcode and Opening hours and Features and In Branch Services page
    When Clicks on the cross button of the MoreBranch Info Screen
    Then Verify user gets back to the SideBar  Page
    When user click on the Advance_Filter Option
    And User selects the option of Opening hours "<Opening Hours Option>" Inbranch services "<In Branch Services1>" "<In Branch Services2>" "<In Branch Services3>"Features "<Features>"on the filter
    And Clicks on Apply_Filter button
    Then Verify the List of Branches displayed on the Side_bar
    When User Clicks_on ATM Tab
    And User Manually typed "<ATM Location name>" on_the Search_bar and Clicks_enter
    Then Verify the Ten ATM__displayed on the side bar
    And Verify the Address_Kms_Type displayed for all_ATM


    Examples:
      | Location name | Branch name       | Opening Hours Option |In Branch Services1    | In Branch Services2 | In Branch Services3| Features |ATM Location name  |
      | Johannesburg  | Nedbank Newtown Junction  | Open Saturdays         | Account enquiry        |Teller     |Statements           |Deposit taking ATM |Sandton |


  @Morebranchinfo_Unauth_Opt_Out
  Scenario Outline:Verifying the functionality of Morebranchinfo in Unauthorized Opt Out process
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    When User Manually typed "<Location name>" on_the Search_bar and Clicks_enter
    Then Verify the List of Branches displayed on the Side_bar
    And Verify the "<Branch name>" Status Time_Kms displayed for the selected branch
    When Click on More branch_info option on "<Branch name>" Branch
    Then Verify that user landed with Address,Phone number ,Email,Branchcode and Opening hours and Features and In Branch Services page
    When Clicks on the cross button of the MoreBranch Info Screen
    Then Verify user gets back to the SideBar  Page

    Examples:
      | Location name | Branch name              |
      | Johannesburg  | Nedbank Newtown Junction|


  @Branch_Searchbar_Unauth_Opt_Out
  Scenario Outline:Verifying the List of branches when user enters valid location in the Branch searchbar
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    And User Manually typed "<Location name>" on_the Search_bar and Clicks_enter
    Then Verify the List of Branches displayed on the Side_bar

    Examples:
      | Location name |
      | Johannesburg  |


  @Branch_Searchbar_Unauth_Opt_Out_Autosuggestion
  Scenario Outline:Verifying the Autosuggestions when user enters location in the Branch searchbar
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    Then User Manually typed "<Location name>" and verified  Autosuggestions

    Examples:
      | Location name |
      | San  |


  @Branch_Searchbar_Unauth_Opt_Out_Error
  Scenario Outline:Verifying the Error message when user enters Invalid location in the Branch searchbar
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    Then User Manually typed invalid "<Location name>" on_the Search_bar and verifies the error message

    Examples:
      | Location name |
      | Kenya  |


  @ATM_Searchbar_Unauth_Opt_Out
  Scenario Outline:Verifying the List of branches when user enters valid location in the ATM searchbar
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    And User clicks on ATM__Tab
    And User Manually typed "<ATM Location name>" on_the Search_bar and Clicks_enter
    Then Verify the Ten ATM__displayed on the side bar


    Examples:
      | ATM Location name |
      | Johannesburg  |


  @ATM_Searchbar_Unauth_Opt_Out_Autosuggestion
  Scenario Outline:Verifying the Autosuggestions when user enters location in the ATM searchbar
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    And User clicks on ATM__Tab
    Then User Manually typed "<Location name>" and verified  Autosuggestions

    Examples:
      | Location name |
      | San  |


  @ATM_Searchbar_Unauth_Opt_Out_Error
  Scenario Outline:Verifying the Error message when user enters Invalid location in the ATM searchbar
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    And User clicks on ATM__Tab
    Then User Manually typed invalid "<Location name>" on_the Search_bar and verifies the error message


    Examples:
      | Location name |
      | Kenya  |

  @Advancefilter_Unauth_Opt_Out
  Scenario Outline:Verifying the List of branches when user selects the options in advance filter
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    When User Manually typed "<Location name>" on_the Search_bar and Clicks_enter
    Then Verify the List of Branches displayed on the Side_bar
    When user click on the Advance_Filter Option
    And User selects the option of Opening hours "<Opening Hours Option>" Inbranch services "<In Branch Services1>" "<In Branch Services2>" "<In Branch Services3>"Features "<Features>"on the filter
    And Clicks on Apply_Filter button
    Then Verify the List of Branches displayed on the Side_bar


    Examples:
      | Opening Hours Option | In Branch Services1  | In Branch Services2 | In Branch Services3| Features |Location name|
      | Open Saturdays       |   Account enquiry    |Teller               |Statements          |Deposit taking ATM  |Johannesburg|


  @Advancefilter_Unauth_Opt_Out_Remove_Tag
  Scenario Outline:Verifying the "X" tag functionality of Advance filter when user selects Service options in advance filter
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    When User Manually typed "<Location name>" on_the Search_bar and Clicks_enter
    Then Verify the List of Branches displayed on the Side_bar
    When user click on the Advance_Filter Option
    And User selects the option of Opening hours "<Opening Hours Option>" Inbranch services "<In Branch Services1>" "<In Branch Services2>" "<In Branch Services3>"Features "<Features>"on the filter
    And Clicks on Apply_Filter button
    Then Verify the List of Branches displayed on the Side_bar
    When User click on Tag of the "<In Branch Services1>" "<In Branch Services2>"
    And Clicks on Apply_Filter button
    Then Verify the List of Branches displayed on the Side_bar


    Examples:
      | Opening Hours Option | In Branch Services1  | In Branch Services2 | In Branch Services3| Features |Location name|
      | Open Saturdays       |   Account enquiry    |Teller               |Statements          |Deposit taking ATM  |Johannesburg|



  @Advancefilter_Unauth_Opt_Out_Warning
  Scenario Outline:Verifying the Warning message when user selects morethan the 3 service options in advance filter
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    When User Manually typed "<Location name>" on_the Search_bar and Clicks_enter
    Then Verify the List of Branches displayed on the Side_bar
    When user click on the Advance_Filter Option
    And User selects the option of Opening hours "<Opening Hours Option>" Inbranch services "<In Branch Services1>" "<In Branch Services2>" "<In Branch Services3>" "<In Branch Services4>"Features "<Features>"on the filter
    And Clicks on Apply_Filter button
    Then Verify the List of Branches displayed on the Side_bar


    Examples:
      | Opening Hours Option | In Branch Services1  | In Branch Services2 | In Branch Services3|In Branch Services4| Features |Location name|
      | Open Saturdays       |   Account enquiry    |Teller               |Statements          |Forex                |Deposit taking ATM  |Johannesburg|


  @Advancefilter_Unauth_Opt_Out_Error
  Scenario Outline:Verifying the Error message when user enters selects the incorrect combination in advance filter
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    When User Manually typed "<Location name>" on_the Search_bar and Clicks_enter
    Then Verify the List of Branches displayed on the Side_bar
    When user click on the Advance_Filter Option
    And User selects the option of Opening hours "<Opening Hours Option>" Inbranch services "<In Branch Services1>" "<In Branch Services2>" "<In Branch Services3>"Features "<Features>"on the filter
    And Clicks on Apply_Filter button
    Then Verified the Error meesage

    Examples:
      | Opening Hours Option |  In Branch Services1  | In Branch Services2 | In Branch Services3 | Features |Location name|
      | Open Saturdays       |   Account enquiry     | Teller               |Statements         |Department of Home Affairs |Johannesburg|


  @Advancefilter_Unauth_Opt_Out_Clear_All_Filter
  Scenario Outline:Verifying the "X" tag functionality of Advance filter when user selects Service options in advance filter
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    When User Manually typed "<Location name>" on_the Search_bar and Clicks_enter
    Then Verify the List of Branches displayed on the Side_bar
    When user click on the Advance_Filter Option
    And User selects the option of Opening hours "<Opening Hours Option>" Inbranch services "<In Branch Services1>" "<In Branch Services2>" "<In Branch Services3>"Features "<Features>"on the filter
    And Clicks on Apply_Filter button
    Then Verify the List of Branches displayed on the Side_bar
    When Clicks on Clear all/Clear filter
    Then Verify the List of Branches displayed on the Side_bar



    Examples:
      | Opening Hours Option | In Branch Services1  | In Branch Services2 | In Branch Services3| Features |Location name|
      | Open Saturdays       |   Account enquiry    |Teller               |Statements          |Deposit taking ATM  |Johannesburg|





  @ATM_Unauth_Opt_Out
  Scenario Outline:Verifying the List of ATM's when user entering the location name in ATM search bar
    Given user launch Money App web application
    When User clicks on 'Branch locator' menu item
    Then Verify the List of Branches displayed on the Side_bar
    When User clicks on ATM__Tab
    And User Manually typed "<ATM Location name>" on_the Search_bar and Clicks_enter
    Then Verify the Ten ATM__displayed on the side bar
    And Verify the Address_Kms_Type displayed for all_ATM

    Examples:
      |ATM Location name|
      |Sandton|
