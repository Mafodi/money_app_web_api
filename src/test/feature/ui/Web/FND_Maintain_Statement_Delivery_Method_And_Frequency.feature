Feature: Maintain Statement delivery method and frequency
﻿
@ViewStatementPrefs	@RT
Scenario Outline: View Statement preferences
Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When In Overview I select the account number or name "<AccountNoName>" of account type "<AccType>"
And On the account view screen, In the feature block, I select Statements and documents
Then I can view the statement delivery method and statement frequency against each account

Examples:
|NedID		    |Password	    |AccountNoName	|AccType	|
|Kenneth2020	|Testing23@!@	|1522091386		|current	|
|webtest1	    |Test11#@#	    |D STAMP	    |savings	|
#|webtest2	    |Testing23@!@	|8001077069301	|loan		|

#MON-576  Update statement delivery method [Self- Web] [Current Account]
#Acceptance Criteria:
#I verify that:
#- I will have the option to change the method of the statement delivery for selected account(s)
#- I am able to set the preference for sending statements through email to one or many recipients for the specific account
#- The options available for change of method will be based on the business rule of the specific account
#- I confirm the updates done on statement delivery method
#
#Business Rules:
#- Statement must be delivered only on one of the delivery mode. (Either email or Post can be selected. Not both at a time)
#- Statements can be delivered on up to 2 email addresses (Only if the user selects Email option)
#- Delivery method details((Email address/ Postal address)) must be prepopulated from the system. Email 1 is editable. Email 2 is editable and optional field
#- The delivery method is defaulted to post
#- Statement delivery preferences will be updated in the next statement generation cycle
#
#Field level details:
#1. Account number
#Set of numbers to identify specific account. This is numeric field.
#eg -1234567890
#2. Account type
#Description of account type
#eg Current Account
#3. Statement delivery method
#Mode by which the statement would be delivered to client. Display the exisitng preference. This field becomes editable after user chooses to update delivery method.
#Modes:
#Email
#Post
#Do not send
#4. Delivery method details
#- Email (Email address1, Email address 2)
#- Postal address
#•Email 1, Email 2 , Postal address, must be pre populated based on existing preference.
#•Postal address is not editable
#•Email 1 and Email 2 are editable
#•Email 2 is optional
#•Email 1 must be prepopulated with Bank registered Email address. User can edit the prepopulated email address.
#•If Email 1 and Email 2 do not exist then the fields should be displayed as blank. User can capture email address here
#
#5. Statement Delivery frequency
#Intervals at which the statement would be delivered to the client
#Statement frequency cannot be updated. Whatever is the exisitng frequency must be dislayed.
#Possible values:
#Monthly
#Halfyearly
#Bimonthly
#Never
#Unknown

@UpdateStatementDelMethod	@RT
Scenario Outline: Update Statement delivery method
Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When In Overview I select the account number or name "<AccountNoName>" of account type "<AccType>"
And On the account view screen, In the feature block, I select Statements and documents
Then I can view the statement delivery method and statement frequency against each account
And I am able to set the preference for sending statements through email to one or many recipients for the specific account"<AlternativeEmailAddress>","<EmailAddress>","<AlternativeEmailAddress>"
And I confirm the updates done on statement delivery method

Examples:
|NedID		    |Password	    |AccountNoName	  |AccType	|SendPref   |EmailAddress         |AlternativeEmailAddress  |
|Kenneth2020	|Test11#@#	    |D STAMP		  |savings	|Email      |seansn@nedbank.co.za |soundmind4297@gmail.com  |
|webtest1	    |Test11#@#	    |D STAMP		  |savings	|Post       |seansn@nedbank.co.za |                         |
|webtest2	    |Testing23@!@	|Mar Properties CC|current	|Do not send|                     |                         |
|webtest2	    |Testing23@!@	|Mar Properties CC|current	|Post       |                     |                         |

  @UpdateStatementDelMethod	@RT
  Scenario Outline: Update Statement delivery method
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When In Overview I select the account number or name "<AccountNoName>" of account type "<AccType>"
    And On the account view screen, In the feature block, I select Statements and documents
    Then I can view the statement delivery method and statement frequency against each account
    And I will have the option to change the method of the statement delivery for selected account(s)"<SendPref>"
    And I confirm the updates done on statement delivery method

    Examples:
      |NedID		|Password	|AccountNoName	  |AccType	|SendPref   |EmailAddress         |AlternativeEmailAddress  |
      |webtest1	|Test11#@#	|D STAMP		  |savings	|Email      |seansn@nedbank.co.za |soundmind4297@gmail.com  |
      |webtest1	|Test11#@#	|D STAMP		  |savings	|Post       |                     |                         |
      |webtest2	|Testing23@!@	|Mar Properties CC|current	|Do not send|                     |                         |
      |webtest2	|Testing23@!@	|Mar Properties CC|current	|Post       |                     |                         |
