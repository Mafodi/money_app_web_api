@regression
Feature: Online purchase ONOFF
﻿
@OnlinePurchaseOnOff	@RT
Scenario Outline: Online purchase ONOFF
Given Prf_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I select the Cards menu option
When I select a card account to view or action on"<CardNameNo>"
And I can view the feature "Online purchases" toggle switch on the card services menu"<OnOff>"
And I can select to switch ON or OFF the "Online purchases" feature to enable or disable this feature on my card"<OnOff>"
Then The client is informed about the implications of enabling or disabling the online purchase feature on the card"<OnOff>"
And I can submit the request for switching ON or OFF "Online purchases" feature
And I can view the success message 'Online purchases have been deactivated' or 'Online purchases are now active'"<OnOff>"
And The toggle switch for "Online purchases" feature is switched ON or OFF"<OnOff>"

Examples:
|NedID		|Password	|CardNameNo		  |OnOff|
|webtest1	|Test11#@#	|4923********3524 |Off	|
|webtest1	|Test11#@#	|4923********3524 |On	|

@smoke  @OnlinePurchaseOnOffSmoke
Scenario Outline: Online purchase ONOFF
Given Prf_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I select the Cards menu option
When I select a card account to view or action on"<CardNameNo>"
And I can view the feature "Online purchases" toggle switch on the card services menu"<OnOff>"
And I can select to switch ON or OFF the "Online purchases" feature to enable or disable this feature on my card"<OnOff>"
Then The client is informed about the implications of enabling or disabling the online purchase feature on the card"<OnOff>"
And I can submit the request for switching ON or OFF "Online purchases" feature
And I can view the success message 'Online purchases have been deactivated' or 'Online purchases are now active'"<OnOff>"
And The toggle switch for "Online purchases" feature is switched ON or OFF"<OnOff>"

Examples:
|NedID		|Password	|CardNameNo	      |OnOff|
|webtest1	|Test11#@#	|4923********3524 |Off	|
|webtest1	|Test11#@#	|4923********3524 |On	|

