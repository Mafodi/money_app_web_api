@regression
Feature: Card (Freeze) ONOFF
﻿

@FreezeCardOnOff	@RT
Scenario Outline: FreezeCard ONOFF
Given Prf_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I select the Cards menu option
When I select a card account to view or action on"<CardNameNo>"
And I can view the feature "Freeze card" toggle switch on the card services menu"<OnOff>"
And I can select to switch ON or OFF the "Freeze card" feature to enable or disable this feature on my card"<OnOff>"
Then The client is informed about the implications of freezing or unfreezing the card"<OnOff>"
And I can submit the request for switching ON or OFF "Freeze card" feature
And I can view the success message 'Un-freeze card successful' or 'Card frozen successfully'"<OnOff>"
And The toggle switch for "Freeze card" feature is switched ON or OFF"<OnOff>"

Examples:
|NedID		|Password	|CardNameNo		  |OnOff|
|webtest1	|Test11#@#	|4923********3524 |On	|
|webtest1	|Test11#@#	|4923********3524 |Off	|
#|webtest1	|Test11#@#	|5412********2794 |On   |
#|webtest1	|Test11#@#	|5412********2794 |Off	|
#|webtest2	|Testing23@!@	|<Active>				|On		|
#|webtest2	|Testing23@!@	|<Active>				|Off	|

@smoke  @FreezeCardOnOffSmoke
Scenario Outline: FreezeCard ONOFF
Given Prf_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I select the Cards menu option
When I select a card account to view or action on"<CardNameNo>"
And I can view the feature "Freeze card" toggle switch on the card services menu"<OnOff>"
And I can select to switch ON or OFF the "Freeze card" feature to enable or disable this feature on my card"<OnOff>"
Then The client is informed about the implications of freezing or unfreezing the card"<OnOff>"
And I can submit the request for switching ON or OFF "Freeze card" feature
And I can view the success message 'Un-freeze card successful' or 'Card frozen successfully'"<OnOff>"
And The toggle switch for "Freeze card" feature is switched ON or OFF"<OnOff>"

Examples:
|NedID		|Password	|CardNameNo	      |OnOff|
|webtest1	|Test11#@#	|4923********3524 |Off	|
|webtest1	|Test11#@#	|4923********3524 |On	|
#|webtest1	|Test11#@#	|5412********2794 |On	|
#|webtest1	|Test11#@#	|5412********2794 |Off	|
