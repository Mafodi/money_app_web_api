Feature: View notification on online banking application

  @Notification
  Scenario Outline: as a user i want to be able to view my notifications after login
    Given user launch prepaid web application
    And user enters username "<username>" and password "<password>"
    And user clicks on Login
    And user must see application dashboard
    When user clicks notification icon
    Then user should see notifications

    Examples:
      | username      | password    |
      | GhostStaff31  | Testing123* |

