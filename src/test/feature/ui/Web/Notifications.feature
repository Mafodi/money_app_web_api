@notifications-web
Feature: In app notifications

  @notifications-web
  Scenario: View notification messages
    Given Existing customer logged onto Web
    Then web user can see notification icon
    When web user click notification icon
    Then web user can see messages notification
    And web user can see for you notifications
    When web user click on messages notifications
    Then web user is on messages page
    When web user open notifications messages

  @notifications-web
  Scenario: Navigate to notifications details
    Given Existing customer logged onto Web
    Then web user can see notification icon
    When web user click notification icon
    Then web user can see messages notification
    And web user can see for you notifications
    When web user click on messages notifications
    Then web user is on messages page
    When web user navigate to notifications message details

  @notifications-web
  Scenario: Delete message from the notification list
    Given Existing customer logged onto Web
    Then web user can see notification icon
    When web user click notification icon
    Then web user can see messages notification
    When web user click on messages notifications
    When web user click delete message icon
    And web user click cancel button
    And web user click delete message icon
    Then web user can see checkbox for message to delete
    When web user click checkbox for message to delete
    And web user click delete selected message
#    Then message is deleted from the notification list

  @notifications-web
  Scenario Outline: Notification offer accept and decline
    Given Existing customer logged onto Web
    Then web user can see notification icon
    When web user click notification icon
    Then web user can see messages notification
    And web user can see for you notifications
    When web user click on for you notifications
    Then web user is on for you notifications page
    When web user open first for you notification
    Then web user is on "<offer>" offer details page
    When web user accept offer from notification
    Then web user is on "<header>" offer get started page
    When web user click back button from notification offer
    Then web user is on "<offer>" offer details page
    When web user click notification offer no thanks button
    Then web user can see notification icon

    Examples:
      | offer         | header            |
      | Personal loan | Let's get started |

