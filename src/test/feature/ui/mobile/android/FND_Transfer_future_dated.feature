
Feature: Verify customer makes a schedule weekly and monthly tranfer


@Transferscheduleweeklyandmonthly
Scenario Outline: Verify customer makes a schedule weekly and monthly tranfer
Given Tw_User accesses Ned app and landing pg displayed
When Tw_User clicks on get started button
And 	Tw_User captures NedbankID "<NedID>" and password "<Password>"
And 	Tw_User clicks Login button
And 	Tw_User waits for login approval
And 	Tw__Dashboard page should display
And 	Tw__I Click on Transact and verify sub-menu option of Transfer
And 	Tw__The sub menu option for Transact should open and Transfer menu item should be there
When Tw__Click on Transfer
Then Tw__Verify the Transfer screen is opened
And 	I_w Enter Transfer "<Amount>"
And 	I_w Select The Default From Account
And 	I_w Select The Default To Account
And I_w captures "<Month>","<day>","<year>" and selects next "<frequency>"
And 	I_w Add The Reference"<Ref>"
And 	I_w Click On Transfer Now Button
And 	I_w Validate Successful Transfer Message
And 	I_w Validate Fields On Transfer Success Screen
And 	I_w Click Finish Button
Then w_App Should Navigate To Overview Screen

Examples:
|NedID|        Password|Amount|  Ref    |Month|day|year|frequency|
|greenbank812  |Testing2!|100 |weeklyrep|July|28|2019  |Weekly|
|greenbank812  |Testing2!|100 |monthlyrep|June|28|2019  |Monthly|