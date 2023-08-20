@ios-branch-and-atm-locator
Feature: Validate the AuthOpt_In_Mode flow

  @auth_opt_in_nonqmatic  @AllScenarios_authOptin
  Scenario Outline: Verification of Branch Details flow in Auth opt in for non qmatic branch
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    When ios user select next button
    When ios user search for a branch "<Location>"
    And ios user select "<BranchLocation>" from search results
    Then ios user can see branch locations listed on the map
    When ios user select branch "<BranchName>" location from the map
    Then ios user is on branch details page
    When ios user select branch In services label and is on In services screen
    When ios user select branch opening hours label
    Then ios user is on opening hours page
    When ios user select branch features label
    Then ios user is on features page
    And ios user can see get map directions button
    And ios user can see get map get uber ride button

    Examples:
      | username   | password  | Location | BranchLocation | BranchName |
      | Praveen123 | Testing1! | Springbok        | Springbok    | Nedbank Springbok |

  @auth_opt_in_qmatic  @AllScenarios_authOptin
  Scenario Outline: Verification of Branch Details flow in Auth opt in for QMatic branch
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    When ios user select next button
    When ios user search for a branch "<Location>"
    And ios user select "<BranchLocation>" from search results
    Then ios user can see branch locations listed on the map
    When ios user select branch "<BranchName>" location from the map
    Then ios user is on branch details page
    When ios user select branch In services waiting times label and is on In services waiting times screen
    When ios user select branch opening hours label
    Then ios user is on opening hours page
    When ios user select branch features label
    Then ios user is on features page
    And ios user can see get map directions button
    And ios user can see get map get uber ride button

    Examples:
      | username   | password   | Location | BranchLocation | BranchName |
      | Praveen123 | Testing1! | Sandton        | Sandton    | Nedbank Sandton |

  @auth_opt_in_AdvancedFilter @AllScenarios_authOptin
  Scenario Outline: Verification of Advanced filter flow in Auth opt in
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    When ios user select next button
    When ios user search for a branch "<Location>"
    And ios user select "<BranchLocation>" from search results
    Then ios user can see branch locations listed on the map
    When ios user select filter button
    Then ios user is on filter branch page
    When ios user select opening hours "<Opening hours>" filter option
    And ios user select services "<Services>" filter option
    And ios user select features "<Features>" filter option
    And ios user select apply filter button
    Then ios user can branch map is filtered

    Examples:
      | username   | password  | Location | BranchLocation |Opening hours|Services|Features|
      | Praveen123 | Testing1! | Sandton     |Sandton      | Open Saturdays | Account enquiry| Deposit taking ATM|

  @auth_opt_in_ATMFlow @AllScenarios_authOptin
  Scenario Outline: Verification of ATM flow in Auth opt in
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    And ios user select next button
    When ios user select atm tab
    When ios user search for a branch "<Location>"
    And ios user select "<BranchLocation>" from search results
    Then ios user can see atm locations listed on the map
    When ios user select atm location from the map
    Then ios user can see get map get uber ride button

    Examples:
      | username   | password   | Location | BranchLocation |
      | Praveen123 | Testing1!  | Sandton        | Sandton    |

  @SQ_AuthOpt_In_Mode_AdvancedFilterError_iOS @AllScenarios_authOptin
  Scenario Outline: Verification of advanced filter Opt In negative flow i.e. No results on applying filter in authenticated mode
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    And ios user select next button
    When ios user search for a branch "<Location>"
    And ios user select "<BranchLocation>" from search results
    Then ios user can see branch locations listed on the map
    When ios user select filter button
    Then ios user is on filter branch page
    When ios user select opening hours "<Opening hours>" filter option which gives no results
    And ios user select apply filter button
    Then user should get proper error message


    Examples:
      | username   | password| Location |BranchLocation | Opening hours |
      | Praveen123 | Testing1!| Sandton  |Sandton    | Open Sundays    |

  @SQ_AuthOpt_In_Mode_AutosuggestionCheck_iOS @AllScenarios_authOptin
  Scenario Outline: Verification of branch autosuggestion functionality check while searching branch in authenticated mode
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    And ios user select next button
    When ios user search for a branch location "<FirstThreeLetterLocation>" in the search bar
    Then Verify that relevant autosuggestions "<Location>" should appear in iOS

    Examples:
      | username   | password | FirstThreeLetterLocation  | Location |
      | Praveen123 | Testing1!| Spr | Springbok |

  @SQ_AuthOpt_In_Mode_ATMAutosuggestionCheck_iOS @AllScenarios_authOptin
  Scenario Outline: Verification of ATM autosuggestion functionality check while searching branch in authenticated mode
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    And ios user select next button
    When ios user select atm tab
    When ios user search for a branch location "<FirstThreeLetterLocation>" in the search bar
    Then Verify that relevant autosuggestions "<Location>" should appear in iOS

    Examples:
      | username   | password| FirstThreeLetterLocation  | Location |
      | Praveen123 | Testing1!| Spr | Springbok |

  @SQ_AuthOpt_In_Mode_BranchValidSearch_iOS @AllScenarios_authOptin
  Scenario Outline: Verification of valid branch search flow in authenticated mode
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    And ios user select next button
    When ios user search for a branch "<Location>"
    And ios user select "<BranchLocation>" from search results
    Then ios user can see branch locations listed on the map

    Examples:
      | username   | password| Location | BranchLocation |
      | Praveen123 | Testing1!| Sandton        | Sandton |

  @SQ_AuthOpt_In_Mode_ATMValidSearch_iOS @AllScenarios_authOptin
  Scenario Outline: Verification of valid atm search flow in authenticated mode
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    And ios user select next button
    When ios user select atm tab
    When ios user search for a branch "<Location>"
    And ios user select "<BranchLocation>" from search results
    Then ios user can see atm locations listed on the map

    Examples:
      | username   | password| Location | BranchLocation |
      | Praveen123 | Testing1! | Sandton        | Sandton |

  @SQ_AuthOpt_In_Mode_BranchClearSearchButton_iOS @AllScenarios_authOptin
  Scenario Outline: Verification of branch clear search text field functionality on search bar in authenticated mode
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    And ios user select next button
    When ios user search for a branch "<Location>"
    Then user clicks on clear search field button in iOS
    Then Verify the search location got cleared in iOS

    Examples:
      | username   | password| Location  |
      | Praveen123 | Testing1!| Sandton |

  @SQ_AuthOpt_In_Mode_ClearFilter_iOS @AllScenarios_authOptin
  Scenario Outline: Verification of the clear filter functionality in authenticated mode
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    And ios user select next button
    When ios user search for a branch "<Location>"
    And ios user select "<BranchLocation>" from search results
    Then ios user can see branch locations listed on the map
    When ios user select filter button
    Then ios user is on filter branch page
    When ios user select opening hours "<Opening hours>" filter option
    And clicks on Clear_Filters button in iOS app
    Then Verify that selected filter values are cleared out in iOS app


    Examples:
      | username   | password| Location  | Opening hours |BranchLocation|
      | Praveen123 | Testing1!| Sandton | Open Saturdays    |Sandton    |

  @SQ_AuthOpt_In_Mode_MultiServiceFilter_iOS @AllScenarios_authOptin
  Scenario Outline: Verification of the multi service filter functionality in authenticated mode
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    And ios user select next button
    When ios user search for a branch "<Location>"
    And ios user select "<BranchLocation>" from search results
    Then ios user can see branch locations listed on the map
    When ios user select filter button
    Then ios user is on filter branch page
    When ios user select opening hours "<Opening hours>" filter option
    And ios user select multiple services in filter options
    Then Verify that selected services are appearing in iOS app

    Examples:
      | username   | password| Location |BranchLocation |Opening hours |
      | Praveen123 | Testing1!| Sandton  |Sandton    |Open Saturdays    |


  @SQ_AuthOpt_In_Mode_MultiServiceFilterClearAll_iOS @AllScenarios_authOptin
  Scenario Outline: Verification of the clear All services filter functionality in authenticated mode
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    And ios user select next button
    When ios user search for a branch "<Location>"
    And ios user select "<BranchLocation>" from search results
    Then ios user can see branch locations listed on the map
    When ios user select filter button
    Then ios user is on filter branch page
    When ios user select opening hours "<Opening hours>" filter option
    And ios user select multiple services in filter options
    And User clicks on the Clear All in iOS app
    Then Verify that all the selected services are cleared out in iOS app


    Examples:
      | username   | password| Location  |Opening hours |BranchLocation|
      | Praveen123 | Testing1!| Standton |Open Saturdays    |Standton  |

  @SQ_AuthOpt_In_Mode_MultiServiceFilterError_iOS @AllScenarios_authOptin
  Scenario Outline: Verification of the validation check on more than 3 service selections in authenticated mode
    Given user launches iOS money app
    When user allow location services
    And ios user select continue button
    And ios user select login button
    When user enters username "<username>" and password "<password>"
    Then user should be on ios welcome screen
    When ios user close app inter action blocking views
    And ios user select post login more menu
    And ios user select atm and branch locator
    And ios user select next button
    When ios user search for a branch "<Location>"
    And ios user select "<BranchLocation>" from search results
    Then ios user can see branch locations listed on the map
    When ios user select filter button
    Then ios user is on filter branch page
    When ios user select opening hours "<Opening hours>" filter option
    And ios user select multiple services in filter options i.e. more than three services in iOS app



    Examples:
      | username   | password| Location  |Opening hours |BranchLocation|
      | Praveen123 | Testing1!| Sandton |Open Saturdays    |Sandton     |


