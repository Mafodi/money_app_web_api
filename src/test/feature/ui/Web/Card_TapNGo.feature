@regression
Feature: Tap and Go
﻿
@TapAndGo	@RT
Scenario Outline: Contactless ONOFF
Given Prf_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I select the Cards menu option
When I select a card account to view or action on"<CardNameNo>"
And I can view the feature "Use tap and go" toggle switch on the card services menu"<OnOff>"
And I can select to switch ON or OFF the "Use tap and go" feature to enable or disable this feature on my card"<OnOff>"
Then The client is informed about the implications of enabling or disabling the contactless feature on the card"<OnOff>"
And I can submit the request for switching ON or OFF "Use tap and go" feature
And I can view the success message 'Tap and go service is switched off' or 'Tap and go service is switched on'"<OnOff>"
And The toggle switch for "Use tap and go" feature is switched ON or OFF"<OnOff>"

Examples:
|NedID		|Password	|CardNameNo		  |OnOff|
|webtest1	|Test11#@#	|5412********2794 |Off	|
|webtest1	|Test11#@#	|5412********2794 |On	|
#|webtest1	|Test11#@#	|4923********3524 |Off	|
#|webtest1	|Test11#@#	|4923********3524 |On	|
#|webtest2	|Testing23@!@	|<Active>				|Off	|
#|webtest2	|Testing23@!@	|<Active>				|On		|

@smoke  @TapAndGoSmoke
Scenario Outline: Contactless ONOFF
Given Prf_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I select the Cards menu option
When I select a card account to view or action on"<CardNameNo>"
And I can view the feature "Use tap and go" toggle switch on the card services menu"<OnOff>"
And I can select to switch ON or OFF the "Use tap and go" feature to enable or disable this feature on my card"<OnOff>"
Then The client is informed about the implications of enabling or disabling the contactless feature on the card"<OnOff>"
And I can submit the request for switching ON or OFF "Use tap and go" feature
And I can view the success message 'Tap and go service is switched off' or 'Tap and go service is switched on'"<OnOff>"
And The toggle switch for "Use tap and go" feature is switched ON or OFF"<OnOff>"

Examples:
|NedID		|Password	|CardNameNo	      |OnOff|
|webtest1	|Test11#@#	|4923********3524 |Off	|
|webtest1	|Test11#@#	|4923********3524 |On	|
#|webtest1	|Test11#@#	|5412********2794 |Off	|
#|webtest1	|Test11#@#	|5412********2794 |On	|
