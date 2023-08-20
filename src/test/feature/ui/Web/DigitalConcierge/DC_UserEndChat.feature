@WebRegression
Feature: Verify user is able to end the web chat

   @03LiveChatEndChatPopUp_Auth
   Scenario Outline: Authenticated user is ending chat and getting End chat popup.
     Given As a client I am logged-in with Username "<Username>" and Password "<Password>"
     When I navigate to chat
     And I initiate chat "<Message>"
     And The agent is connected to web chat
     Then I should end the web chat

     Examples:
       |Username  |Password   |Message                |
       |DCtest302 |Test@1234  |End chat Authenticated |

   @03LiveChatEndChatPopUp_Unauth
   Scenario Outline: Unauthenticated user is ending chat and getting End chat popup.
     Given As a client I am on Online Banking
     When I capture Name "<Name>" and Email address "<Email>" unauthenticated
     And I am queued to chat
     And The agent is connected to web chat
     Then I should end the web chat

     Examples:
       |Name    |Email                  |
       |Zimasa  |zimasat@nedbank.co.za  |