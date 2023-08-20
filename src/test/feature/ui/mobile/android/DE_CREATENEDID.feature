Feature: Creating NedId
  Scenario Outline: User need to create nedbank ID

    Given User is promted to create nedbank ID
    When User click create
    And User enters a nedbank id username "<ned_username>" and nedbank id password "<ned_password>"
    Then User validates

    Examples:
      |ned_username|ned_password|
      |NEDUSERNAME|NEDPASWORD|