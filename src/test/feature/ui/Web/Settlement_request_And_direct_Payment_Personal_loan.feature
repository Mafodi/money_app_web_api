@regression
Feature: Settlement request and direct payment - Personal loan
﻿
@GenerateEmailSettlementPL	@RT
Scenario Outline: Generate and email settlement quote PL
Given Prf_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When In Overview I select the account number or name "<AccountNoName>" of account type "<AccType>"
And I can select 'Get settlement quote' to proceed with the flow
And I can either proceed [select send] with default email ID [auto populated, as on CIS] or choose to enter one different email id in correct format or choose to 'close' and cancel the flow, and be back to the previous screen"<Option>","<EmailAddress>"
Then I can see the success message once the email is sent
And Select Close, to return to previous product landing screen

Examples:
|NedID		 |Password|AccountNoName |AccType|Option|EmailAddress         |
|webloantest1|Test11#@#	      |8002912070501 |loan	 |      |seansn@nedbank.co.za |
|webloantest1|Test11#@#	      |8002912070501 |loan	 |Close |seansn@nedbank.co.za |

@smoke  @GenerateEmailSettlementPLSmoke
Scenario Outline: Generate and email settlement quote PL
Given Prf_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When In Overview I select the account number or name "<AccountNoName>" of account type "<AccType>"
And I can select 'Get settlement quote' to proceed with the flow
And I can either proceed [select send] with default email ID [auto populated, as on CIS] or choose to enter one different email id in correct format or choose to 'close' and cancel the flow, and be back to the previous screen"<Option>","<EmailAddress>"
Then I can see the success message once the email is sent
And Select Close, to return to previous product landing screen

Examples:
|NedID		 |Password|AccountNoName |AccType|Option|EmailAddress         |
|webloantest1|Test11#@#	      |8002912070501 |loan	 |      |seansn@nedbank.co.za |
