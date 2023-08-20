@regression
Feature: Share Account Details - Proof Of Account


@ShareAccDetails	@RT
Scenario Outline: Share Account Details
Given Prf_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When In Everyday Banking I select the CASA, Home or Personal loan account"<AccountNoName>","<AccType>"
And On the account view screen, In the feature block, I select Account Details
And I select 'Share proof of account via email' within the Account Details block
Then My CIS email will be the first default email displayed on the screen, which I can also edit. If I do not have an email on my CIS profile, this field will be blank
And I will be able to provide email address for the recipient"<EmailAddress>"
And I will be able to provide one or many email addresses (maximum amount is ten recipients per session)"<EmailAddress>","<More>"
And I will be able to edit and remove email addresses"<Edit>","<EditEmailAddress>","<Remove>"
And Once all the email address(es) have been entered the client selects send. The client will receive a success message 'Your Proof of account has been sent' and all the email recipients are listed on the screen

Examples:
|NedID		|Password	|AccountNoName	|AccType	|EmailAddress			|More	|Edit	|EditEmailAddress		|Remove	|
|webtest2	|Testing23@!@	|8001077069301	|loan		|soundmind4297@gmail.com|2		|1		|seansn@nedbank.co.za	|2		|
|webtest3	|Test11!@!!	|1522091386		|current	|seansn@nedbank.co.za	|		|		|						|		|
|webtest1	|Test11#@#	|D STAMP	    |savings	|SADtest1@nedbank.co.za	|8		|		|						|		|

@smoke  @ShareAccDetailsSmoke
Scenario Outline: Share Account Details
Given Prf_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When In Everyday Banking I select the CASA, Home or Personal loan account"<AccountNoName>","<AccType>"
And On the account view screen, In the feature block, I select Account Details
And I select 'Share proof of account via email' within the Account Details block
Then My CIS email will be the first default email displayed on the screen, which I can also edit. If I do not have an email on my CIS profile, this field will be blank
And I will be able to provide email address for the recipient"<EmailAddress>"
And I will be able to provide one or many email addresses (maximum amount is ten recipients per session)"<EmailAddress>","<More>"
And I will be able to edit and remove email addresses"<Edit>","<EditEmailAddress>","<Remove>"
And Once all the email address(es) have been entered the client selects send. The client will receive a success message 'Your Proof of account has been sent' and all the email recipients are listed on the screen

Examples:
|NedID		|Password	|AccountNoName	|AccType	|EmailAddress			|More	|Edit	|EditEmailAddress		|Remove	|
|webtest2	|Testing23@!@	|8001077069301	|loan		|soundmind4297@gmail.com|2		|1		|seansn@nedbank.co.za	|2		|
#|webtest3	|?      	|1522091386		|current	|seansn@nedbank.co.za	|		|		|						|		|
