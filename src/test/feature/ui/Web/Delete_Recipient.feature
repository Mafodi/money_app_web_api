@regression
Feature: Delete Recipient

@RecipientDeleteOwnDefinedRecipPositive		@RT
Scenario Outline: Recipient Delete Positive
Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I can select the Recipients service from the menu bar present at the top of my WEB login view
And I can search for a desired beneficiary"","<RecipientName>"
And I should be able to select a Beneficiary of my preference from the list of Beneficiary listed under My Recipient
And On selecting a Beneficiary of my preference, the Right side of the Page should be populated with the Beneficiary details in Non editable text"<RecipientName>"
And Select the Edit or add details link
And On selecting the Delete recepient link, I should be presented with a confirmation message
And On selection of the Delete recipient button I should be presented with the beneficiary details of the first beneficiary in my list
Then Success message Your beneficiary has been sucessfully deleted

Examples:
|NedID		|Password |RecipientName		  |DelConf|ExpectDiffResult	|
|webtest3	|Test11!@!!	      |Dr Zwonikoff	          |		|					|
|webtest3	|Test11!@!!	      |Jed Ward - Supper contb|		|					|


@smoke  @RecipientDeleteOwnDefinedRecipPositiveSmoke
Scenario Outline: Recipient Delete Positive
Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I can select the Recipients service from the menu bar present at the top of my WEB login view
And I can search for a desired beneficiary"","<RecipientName>"
And I should be able to select a Beneficiary of my preference from the list of Beneficiary listed under My Recipient
And On selecting a Beneficiary of my preference, the Right side of the Page should be populated with the Beneficiary details in Non editable text"<RecipientName>"
And Select the Edit or add details link
And On selecting the Delete recepient link, I should be presented with a confirmation message
And On selection of the Delete recipient button I should be presented with the beneficiary details of the first beneficiary in my list
Then Success message Your beneficiary has been sucessfully deleted

Examples:
|NedID		|Password |RecipientName		  |DelConf|ExpectDiffResult	|
|webtest3	|Test11!@!!	      |Dr Zwonikoff	          |		  |					|
|webtest2	|Testing23@!@	      |	                      |		  |No results found	|
