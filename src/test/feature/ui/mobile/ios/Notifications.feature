@notifications-ios
Feature: In app notifications

  @notifications-ios
  Scenario Outline: View transactions notifications
    Given Existing customer is logged on to the banking App
    Then ios user can see notification icon
    When ios user click notification icon
    Then ios user can see transaction notifications
    When ios user click transactions notifications
    Then ios user is on transactions notifications page
    When ios user search for a notification "<notification>"
    And ios user open first transaction notification
    Then ios user can see go to debit orders message
    When ios user click go to debit orders
    Then ios user can see debit orders header

    Examples:
      | notification          |
      | Overnight Transaction |

  @notifications-ios
  Scenario Outline: Filter transactions notifications
    Given Existing customer is logged on to the banking App
    Then ios user can see notification icon
    When ios user click notification icon
    Then ios user can see transaction notifications
    When ios user click transactions notifications
    Then ios user is on transactions notifications page
    When ios user click transactions notifications sort button
    Then ios user is on transaction sort page
    When ios user select transaction sort option "<sortBy>"
    Then ios transaction notifications are sorted by "<sortBy>"

    Examples:
      | sortBy        |
      | Highest amount |

  @notifications-ios
  Scenario: View messages notifications
    Given Existing customer is logged on to the banking App
    Then ios user can see notification icon
    When ios user click notification icon
    Then ios user can see messages notification
    When ios user click on messages notifications
    Then ios user is on messages page
    When ios user open first message notification
    Then ios user can see continue and no thanks buttons


  @notifications-ios
  Scenario: View offers for you notifications
    Given Existing customer is logged on to the banking App
    Then ios user can see notification icon
    When ios user click notification icon
    And ios user can see for you notifications
    When ios user click offers notifications
    Then ios user is on offers page
    When ios user open first offer notification

  @notifications-ios
  Scenario: Delete message from the notification list
    Given Existing customer is logged on to the banking App
    Then ios user can see notification icon
    When ios user click notification icon
    Then ios user can see messages notification
    When ios user click on messages notifications
    When ios user click delete message icon
    And ios user click cancel button
    And ios user click delete message icon
    Then ios user can see checkbox for message to delete
    When ios user click checkbox for message to delete
    And ios user click delete selected message
    Then ios message is deleted from the notification list

  @notifications-ios
  Scenario Outline: Notification offer accept and decline
    Given Existing customer is logged on to the banking App
    Then ios user can see notification icon
    When ios user click notification icon
    Then ios user can see messages notification
    And ios user can see for you notifications
    When ios user click on for you notifications
    Then ios user is on for you notifications page
    When ios user open first for you notification
    Then ios user is on "<offer>" offer details page
    When ios user accept offer from notification
    Then ios user is on "<header>" offer get started page
    When ios user click back button from notification offer
    Then ios user is on "<offer>" offer details page
    When ios user click notification offer no thanks button
    Then ios user can see notification icon

    Examples:
      | offer         | header            |
      | Personal loan | Let's get started |

