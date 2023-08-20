@iosRegression @DC_HeyNedCardManagement
Feature:Delete card from HeyNed settings

@Delete_Card
Scenario Outline: Delete the default card
  Given user is on HeyNed setting screen on login with username "<username>" and password "<password>"
  And user clicks on Payment methods screen
  And user can see the list of cards
  And user selects card "<CardName>"and swipe on the card to delete
  And user can delete card
Examples:
|username|password|CardName|
|greenbank754|Testing2!|MIKE TEST|
