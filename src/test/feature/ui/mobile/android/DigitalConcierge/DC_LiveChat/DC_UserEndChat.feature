@AndroidRegression
Feature: Verify user is able to end the chat

   @03LiveChatEndChatPopUp_Auth
   Scenario Outline: Authenticated user is ending chat and getting End chat popup.
     Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
     When I navigate to Nedbank service agent
     And The chat message "<Message>" initiated
     And The agent is connected to chat
     Then I should end the chat

     Examples:
       |Username  |Password   |Message                 |
       |test@6165 |Test@1234  |End chat Authenticated  |

   @03LiveChatEndChatPopUp_Unauth
   Scenario Outline: Unauthenticated user is ending chat and getting End chat popup.
     Given As a client I am on the NedbankMoneyApp
     When I navigate to unauthenticated chat
     And I capture Name "<Name>" and Email address "<Email>"
     And The chat initiated
     And The agent is connected to chat
     Then I should end the chat

     Examples:
       |Name   |Email                       |
       |Saroj  |saroj.kandan@nedbank.co.za  |