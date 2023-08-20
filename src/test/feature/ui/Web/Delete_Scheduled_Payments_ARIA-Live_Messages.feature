Feature: Delete Scheduled Payments ARIA - Live Messages

Background:
Given Prf_I am logged in to Banking web app with
  |NedID    |Password |
  |webtest2 |?		  |
#  |seansn@nedbank.co.za |?        |
When In Everyday Banking I select the CASA or Credit card account
  |AccountNoName|AccType|
  |1950479609	|current|
#  |1725004828	|current|
And On the account view screen, In the feature block, I select Scheduled payments

@DeleteSchedPmt		@RT
Scenario Outline: Delete Scheduled Payments
Given I select a scheduled payment item within the Scheduled payments block"<AccType>","<TransType>"
Then As I select the option to delete a scheduled payment the screen reader must provide the following message to me: 'Are you sure you want to delete this scheduled payment?'
And When I successfully delete a scheduled payment I must get feedback that it was successfully deleted. 'Scheduled payment successfully deleted.'
And If you choose to delete this payment, all occurrences of this payment will also be deleted.

Examples:
|AccType|TransType	|
|current|Transfer	|
|current|Transfer	|
|current|Buy		|

@smoke  @DeleteSchedPmtSmoke
Scenario Outline: Delete Scheduled Payments
Given I select a scheduled payment item within the Scheduled payments block"<AccType>","<TransType>"
Then As I select the option to delete a scheduled payment the screen reader must provide the following message to me: 'Are you sure you want to delete this scheduled payment?'
And When I successfully delete a scheduled payment I must get feedback that it was successfully deleted. 'Scheduled payment successfully deleted.'
And If you choose to delete this payment, all occurrences of this payment will also be deleted.

Examples:
|AccType|TransType	|
|current|Transfer	|
