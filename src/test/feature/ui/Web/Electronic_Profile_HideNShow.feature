@regression
Feature: Electronic Profile Hide And Show Account

@HideShowAccounts	@RT
Scenario Outline: Hide and Show Accounts
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I am able to view all accounts in the overview banking container that are marked as not hidden and not be able to see the hidden accounts"FirstView","<AccNames>","<ShowHide>"
When I navigate to the Hide and show accounts page
And The user can hide/unhide the accounts in the same session"<AccNames>","<ShowHide>"
Then I am able to view all accounts in the overview banking container that are marked as not hidden and not be able to see the hidden accounts"LastView","<AccNames>","<ShowHide>"
And The user must still be able to transact, buy and pay using a hidden account"<ChkTransact>","<AccNames>"

Examples:
|NedID		|Password	|AccNames			|ShowHide	|ChkTransact|
|webtest2	|Testing23@!@	|Mar Properties CC	|Hide		|Trf,Pay	|
|webtest2	|Testing23@!@	|Mar Properties CC	|Show		|			|
#|webtest3	|Test11!@!!	|PEAKFULL			|Hide		|QP,Buy		|
#|webtest3	|Test11!@!!	|PEAKFULL			|Show		|			|

@smoke  @HideShowAccountsSmoke
Scenario Outline: Hide and Show Accounts
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I am able to view all accounts in the overview banking container that are marked as not hidden and not be able to see the hidden accounts"FirstView","<AccNames>","<ShowHide>"
When I navigate to the Hide and show accounts page
And The user can hide/unhide the accounts in the same session"<AccNames>","<ShowHide>"
Then I am able to view all accounts in the overview banking container that are marked as not hidden and not be able to see the hidden accounts"LastView","<AccNames>","<ShowHide>"
And The user must still be able to transact, buy and pay using a hidden account"<ChkTransact>","<AccNames>"

Examples:
|NedID		|Password	|AccNames			|ShowHide	|ChkTransact|
|webtest2	|Testing23@!@	|Mar Properties CC	|Hide		|AnyOne		|
|webtest2	|Testing23@!@	|Mar Properties CC	|Show		|			|
#|webtest3	|Test11!@!!	|PEAKFULL			|Hide		|QP,Buy		|
#|webtest3	|Test11!@!!	|PEAKFULL			|Show		|			|
