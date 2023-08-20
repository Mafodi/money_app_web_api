@regression
Feature: Electronic Profile Account Rename

@EditAccDescPositive @RT
Scenario Outline: Edit Account Description Positive
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I can select a specific account to edit from the list of accounts"<AccName>"
Then I can edit the account description"<NewDescription>"
And I will be able to cancel the request"<Cancel>"
And I will get a success message on completing the request"<Cancel>"
And I can view the changes made to client's account description"<Cancel>","<AccName>","<NewDescription>"

Examples:
|NedID		|Password	|AccName			|NewDescription		|Cancel	|
|webtest3	|Test11!@!!	|BOND				|Bond Residential	|		|
|webtest3	|Test11!@!!	|Bond Residential	|BOND				|		|
|webtest2	|Testing23@!@	|MB SIMPSON			|Martin B Simpson	|Yes	|
|webtest2	|Testing23@!@	|MB SIMPSON			|Martin B Simpson	|		|
|webtest2	|Testing23@!@	|Martin B Simpson	|MB SIMPSON			|		|

@smoke  @EditAccDescPositiveSmoke
Scenario Outline: Edit Account Description Positive
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I can select a specific account to edit from the list of accounts"<AccName>"
Then I can edit the account description"<NewDescription>"
And I will be able to cancel the request"<Cancel>"
And I will get a success message on completing the request"<Cancel>"
And I can view the changes made to client's account description"<Cancel>","<AccName>","<NewDescription>"

Examples:
|NedID		|Password	|AccName			|NewDescription		|Cancel	|
|webtest3	|Test11!@!!	|BOND				|Bond Residential	|		|
|webtest3	|Test11!@!!	|Bond Residential	|BOND				|		|
