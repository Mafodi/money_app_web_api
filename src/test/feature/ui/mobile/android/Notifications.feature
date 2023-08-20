@notifications-android
Feature: In app notifications

  @notifications-android
  Scenario: Open a push notification
    Given user launch the android money app
    When android user open push notification with title

  @notifications-android
  Scenario Outline: View transactions notifications
    Given Existing customer is logged on to the banking App
    Then android user can see notification icon
    When android user click notification icon
    Then android user can see transaction notifications
    When android user click transactions notifications
    Then android user is on transactions notifications page
    When android user search for a notification "<notification>"
    And android user open first transaction notification
    Then android user can see transaction type
#    When android user click go to debit orders or report fraud

    Examples:
      | notification          |
      | Overnight Transaction |

  @notifications-android
  Scenario Outline: Filter transactions notifications
    Given Existing customer is logged on to the banking App
    Then android user can see notification icon
    When android user click notification icon
    Then android user can see transaction notifications
    When android user click transactions notifications
    Then android user is on transactions notifications page
    When android user click transactions notifications sort button
    Then android user is on transaction sort page
    When android user select transaction sort option "<sortBy>"
    Then android transaction notifications are sorted by "<sortBy>"

    Examples:
      | sortBy         |
      | Highest amount |

  @notifications-android
  Scenario: View notification messages
    Given Existing customer is logged on to the banking App
    Then android user can see notification icon
    When android user click notification icon
    Then android user can see messages notification
    When android user click on messages notifications
    Then android user is on messages page
    When android user open notification messages


  @notifications-android
  Scenario: View offers for you notifications
    Given Existing customer is logged on to the banking App
    Then android user can see notification icon
    When android user click notification icon
    And android user can see for you notifications
    When android user click offers notifications
    Then android user is on offers page
    When android user open first offer notification
    Then android user is on offers page





