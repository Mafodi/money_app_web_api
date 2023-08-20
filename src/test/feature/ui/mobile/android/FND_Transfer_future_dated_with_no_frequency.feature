
Feature: Verify customer makes a Trasnfer with future dates with no frequency


@Transferfuturedatedwithnofrequency
Scenario Outline: Verify customer makes a Trasnfer with future dates with no frequency
Given Tf_User accesses Ned app and landing pg displayed
When Tf_User clicks on get started button
And 	Tf_User captures NedbankID "<NedID>" and password "<Password>"
And 	Tf_User clicks Login button
And 	Tf_User waits for login approval
And 	Tf__Dashboard page should display
And 	Tf__I Click on Transact and verify sub-menu option of Transfer
And 	Tf__The sub menu option for Transact should open and Transfer menu item should be there
When Tf__Click on Transfer
Then Tf__Verify the Transfer screen is opened
And 	I_f Enter Transfer "<Amount>"
And 	I_f Select The Default From Account
And 	I_f Select The Default To Account
And I_f captures "<Month>","<day>","<year>" 
And 	I_f Add The Reference"<Ref>"
And 	I_f Click On Transfer Now Button
And 	I_f Validate Successful Transfer Message
#And 	I_f Validate Fields On Transfer Success Screen
And 	I_f Click Finish Button
Then f_App Should Navigate To Overview Screen

Examples:
|NedID|        Password|Amount|  Ref             |Month|day|year|
|greenbank812  |Testing2!|100 |tranferfuturedated|June|28|2019  |
