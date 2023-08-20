
@regression
Feature: View Banker Details
﻿

@ViewBankerInfo	@RT	@smoke  @ViewBankerInfoSmoke
Scenario Outline: View Banker Information
Given Prf_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I click on the expand icon of 'Your Banker'
Then I can view the details of the banker viz. Banker Picture, Banker Name, Bankers Phone number, Bankers email address
And I should be able to click on the highlighted email address

Examples:
|NedID		|Password	|
|webtest2	|Testing23@!@	|
#|webtest3	|?	        |
