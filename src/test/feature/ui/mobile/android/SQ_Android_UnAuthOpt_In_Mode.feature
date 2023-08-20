Feature: Verify the UnAuthOpt_In_Mode flow scenarios

  @SQ_UnAuthOpt_In_Mode @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of the complete end to end Opt In flow in unauthenticated mode
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And User search for the "<Location>" and navigates to the branch "<BranchName>" on android app
    Then Verify the "<BranchName>" , Status Time and Kms displayed for the branch on android app
    And Verify the In Branch Services is appearing correctly
    And Verify the opening hours section is appearing correctly
    And Verify the features section is appearing correctly
    And Verify the address, phonenumber, email, branchcode, opening hours, features and In Branch Services on android app screen
    And User clicks on the back button on android app
    Then Verify user gets back to the map screen on android app
    And user click on the AdvanceFilter Option on android app
    When User selects the option of Openings hours, Inbranch services, and Features on the filter section
    And clicks on Apply_Filters button on android app
    Then Verify the list of Branches displayed on the map
    And switch the ATM tab on android app
    And click on the atm pin "<ATMName>" on android app
    And Verify "<ATMName>" , address, distance, Get map Direction and Ride with Uber on bottom of the screen

    Examples:
      | Location  | BranchName         | ATMName |
      | Rosebank | Nedbank Rosebank |NEDBANK HYDE PARK 2|

  @SQ_UnAuthOpt_In_Mode_QMatic @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of the complete end to end Opt In flow in unauthenticated mode for QMatics branches
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And User search for the "<Location>" and navigates to the branch "<BranchName>" on android app
    Then Verify the "<BranchName>" , Status Time and Kms displayed for the branch on android app
    And Verify the In Branch Services and Estimated waiting times is appearing correctly
    And Verify the opening hours section is appearing correctly
    And Verify the features section is appearing correctly
    And Verify the address, phonenumber, email, branchcode, opening hours, features and In Branch Services on android app screen
    And User clicks on the back button on android app
    Then Verify user gets back to the map screen on android app
    And user click on the AdvanceFilter Option on android app
    When User selects the option of Openings hours, Inbranch services, and Features on the filter section
    And clicks on Apply_Filters button on android app
    Then Verify the list of Branches displayed on the map
    And switch the ATM tab on android app
    And click on the atm pin "<ATMName>" on android app
    And Verify "<ATMName>" , address, distance, Get map Direction and Ride with Uber on bottom of the screen

    Examples:
      | Location | BranchName       |ATMName|
      | Rosebank  |Nedbank Sandton|GAUTRAIN STATION|

  @SQ_UnAuthOpt_In_Mode_BranchDetails_NonQMatic @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of the Branch details flow in unauthenticated mode for Non QMatic
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And User search for the "<Location>" and navigates to the branch "<BranchName>" on android app
    Then Verify the "<BranchName>" , Status Time and Kms displayed for the branch on android app
    And Verify the In Branch Services is appearing correctly
    And Verify the opening hours section is appearing correctly
    And Verify the features section is appearing correctly
    And Verify the address, phonenumber, email, branchcode, opening hours, features and In Branch Services on android app screen

    Examples:
      | Location | BranchName       |
      | Sandton  |Nedbank Rosebank|

  @SQ_UnAuthOpt_In_Mode_BranchDetails_QMatic @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of the Branch details flow in unauthenticated mode for QMatic
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And User search for the "<Location>" and navigates to the branch "<BranchName>" on android app
    Then Verify the "<BranchName>" , Status Time and Kms displayed for the branch on android app
    And Verify the In Branch Services and Estimated waiting times is appearing correctly
    And Verify the opening hours section is appearing correctly
    And Verify the features section is appearing correctly
    And Verify the address, phonenumber, email, branchcode, opening hours, features and In Branch Services on android app screen

    Examples:
      | Location | BranchName       |
      | Springbok  |Nedbank Springbok|

  @SQ_UnAuthOpt_In_Mode_ATM @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of the ATM flow in unauthenticated mode
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And switch the ATM tab on android app
    And User search for the "<Location>" and navigates to the searched location on android app
    And click on the atm pin "<ATMName>" on android app
    And Verify "<ATMName>" , address, distance, Get map Direction and Ride with Uber on bottom of the screen

    Examples:
      | Location      |ATMName|
      | Sandton  |GAUTRAIN STATION|

  @SQ_UnAuthOpt_In_Mode_AdvancedFilterError @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of advanced filter Opt In negative flow i.e. No results on applying filter in unauthenticated mode
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And User search for the "<Location>" in the search bar
    And user click on the AdvanceFilter Option on android app
    When User selects the option of Openings hours i.e. Filter which gives No Result on the filter section
    And clicks on Apply_Filters button on android app
    Then Verify the proper error message is appearing on the map screen


    Examples:
      | Location  |
      | Springbok |

  @SQ_UnAuthOpt_In_Mode_AutosuggestionCheckBranch @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of branch autosuggestion functionality check while searching branch in unauthenticated mode
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And User enter three character "<FirstThreeLetterLocation>" in the search bar
    Then Verify that relevant autosuggestions "<Location>" should appear

    Examples:
      | FirstThreeLetterLocation  | Location |
      | Spr | Springbok |

  @SQ_UnAuthOpt_In_Mode_BranchValidSearch @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of valid branch search flow in unauthenticated mode
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And User search for the "<Location>" in the search bar
    Then Verify the relevant branch "<BranchName>" is appearing on the map

    Examples:
      | Location  | BranchName |
      | Springbok | Nedbank Springbok |

  @SQ_UnAuthOpt_In_Mode_ATMValidSearch @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of valid ATM search flow in unauthenticated mode
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And switch the ATM tab on android app
    And User search for the "<Location>" and navigates to the searched location on android app
    And verify the atm pin "<ATMName>" on android app

    Examples:
      | Location      |ATMName|
      | Sandton  |GAUTRAIN STATION|

  @SQ_UnAuthOpt_In_Mode_InvalidSearch @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of invalid search flow and validating the error message with that respect in unauthenticated mode
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And User search for the valid/invalid "<Location>" in the search bar
    Then Verify the proper error message is appearing on the map screen

    Examples:
      | Location  |
      | dfgdfgdfgd |

  @SQ_UnAuthOpt_In_Mode_BranchClearSearchButton @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of branch clear search text field functionality on search bar in unauthenticated mode
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And User search for the valid/invalid "<Location>" in the search bar
    Then user clicks on close button
    Then Verify the search location got cleared

    Examples:
      | Location  |
      | Springbok |

  @SQ_UnAuthOpt_In_Mode_ClearFilter @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of the clear filter functionality in unauthenticated mode
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And User search for the "<Location>" in the search bar
    And user click on the AdvanceFilter Option on android app
    When User selects the option of Openings hours i.e. Filter which gives No Result on the filter section
    And clicks on Clear_Filters button on android app
    Then Verify that selected filter values are cleared out


    Examples:
      | Location  |
      | Springbok |

  @SQ_UnAuthOpt_In_Mode_MultiServiceFilter @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of the multi service filter functionality in unauthenticated mode
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And User search for the "<Location>" in the search bar
    And user click on the AdvanceFilter Option on android app
    And User selects multiple services in services filter
    Then Verify that selected services are appearing


    Examples:
      | Location  |
      | Springbok |

  @SQ_UnAuthOpt_In_Mode_MultiServiceFilterError @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of the validation check on more than 3 service selections in unauthenticated mode
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And User search for the "<Location>" in the search bar
    And user click on the AdvanceFilter Option on android app
    And User selects multiple services in services filter i.e. more than three services
    Then Verify that proper error message should appear


    Examples:
      | Location  |
      | Springbok |

  @SQ_UnAuthOpt_In_Mode_MultiServiceFilterClearAll @RunAll_UnAuthOptInMode
  Scenario Outline: Verification of the clear All services filter functionality in unauthenticated mode
    Given android app is launched
    When user clicks on top menu bar
    When user navigates to Branch locator on android app
    And click on Next button on network permission screen
    Then Verify that list of ten closest active branches on the map should displayed on android app
    And User search for the "<Location>" in the search bar
    And user click on the AdvanceFilter Option on android app
    And User selects multiple services in services filter
    And User clicks on the Clear All
    Then Verify that all the selected services are cleared out


    Examples:
      | Location  |
      | Springbok |