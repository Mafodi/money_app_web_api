@iosRegression @AgentConnectivity
Feature: Verify user is able to end the chat

   @LiveChatEndChatPopUp_Auth
   Scenario Outline: Authenticated user is ending chat and getting End chat popup.
     Given user is on Chatting screen on login with username "<username>" and password "<password>"
     When user sends message "<Message>"
     Then agent gets connected
     And user click on close chat icon
     Then End chat popup window should displayed with End and Cancel button
     And user click on End button

     Examples:
       |username  |password |Message|
       |Jeet@1720|Jeet@1720|End chat Authenticated|

   @LiveChatEndChatPopUp_Unauth
   Scenario Outline: Unauthenticated user is ending chat and getting End chat popup.
     Given user starts Unauthenticated chat screen with name "<name>" and email "<email>"
     When user sends message "<Message>" to unauth user
     Then agent gets connected to Unauth user
     And user click on close chat icon
     Then End chat popup window should displayed with End and Cancel button
     And user click on End button

     Examples:
       |name|email|Message|
       |Jouh|johnni@nedbasnk.co.za|Unautheticated |