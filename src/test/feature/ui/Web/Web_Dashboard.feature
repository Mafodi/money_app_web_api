@regression
Feature: Quick Pay from Dashboard

@QuickPayPositive	@RT
Scenario Outline: Quick Pay Positive
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I select the Quick Pay icon on the dashboard
And I should be able to scroll through all the beneficiaries (accounts + mobile)"<Recipient>","<MultBenDetail>"
And DB_I should be able to select account"<Account>"
And QP_I want to capture the amount"<Amount>" to pay
And When I click on the instant payment toggle I should see the instant payment message"<InstPay>"
And QP_I click on the Next button
And Click of Next will navigate me to pay review screen.
And QP_I must be able to see the payment amount"<Amount>"
And I must be able to edit"<Edit>" the payment details"<EdtAmt>"
And DB_I should be able to click on PAY to confirm the payment
Then I should be able to see a confirmation message so that I know that the payment is done
#And QP_I must be able to see the Payment date (or today)"<Date>"

Examples:
|NedID		|Password	|Recipient		|MultBenDetail		|Amount	|Account	|InstPay|Date	|Edit	|EdtAmt	|
#|webtest3	|Test11!@!!	|Drs du Buisson	|					|100	|1522117849	|Yes	|Inst	|		|		|
|webtest2	|Testing23@!@	|QuickPay		|5049310004048828	|100	|1950479609	|		|		|Yes	|200	|

@smoke  @QuickPayPositiveSmoke
Scenario Outline: Quick Pay Positive
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I should be able to scroll through all the beneficiaries (accounts + mobile)"<Recipient>","<MultBenDetail>"
And DB_I should be able to select account"<Account>"
And QP_I want to capture the amount"<Amount>" to pay
And When I click on the instant payment toggle I should see the instant payment message"<InstPay>"
And QP_I click on the Next button
And Click of Next will navigate me to pay review screen.
And QP_I must be able to see the payment amount"<Amount>"
And I must be able to edit"<Edit>" the payment details"<EdtAmt>"
And I should be able to click on PAY to confirm the payment
Then I should be able to see a confirmation message so that I know that the payment is done
#And QP_I must be able to see the Payment date (or today)"<Date>"

Examples:
|NedID		|Password	|Recipient		|MultBenDetail		|Amount	|Account	|InstPay|Date	|Edit	|EdtAmt	|
|webtest3	|Test11!@!!	|Drs du Buisson	|					|100	|1522117849	|Yes	|Inst	|		|		|
#|webtest2	|Testing23@!@	|QuickPay		|5049310004048828	|100	|1950479609	|		|		|Yes	|200	|


#@QuickPayNegative
#Scenario Outline: Quick Pay Negative
#Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
#When I should be able to scroll through all the beneficiaries (accounts + mobile)"<Recipient>","<MultBenDetail>"
#And I should be able to select account"<Account>"
#And QP_I want to capture the amount"<Amount>" to pay
#And QP_I click on the Next button
#And Click of Next will navigate me to pay review screen.
#And When I click on the instant payment toggle I should see the instant payment message"<InstPay>"
#And QP_I must be able to see the payment amount"<Amount>"
#And I must be able to edit"<Edit>" the payment details"<EdtAmt>"
#And I should be able to click on PAY to confirm the payment
#Then I should be able to see a confirmation message so that I know that the payment is done
#And I must be able to see the Payment date (or today)"<Date>"
#
#Examples:
#|NedID		|Password	|Recipient		|MultBenDetail		|Amount	|Account	|InstPay|Date	|Edit	|EdtAmt	|
#|webtest2	|Testing23@!@	|Sean Snyman-Mu	|5587470000000278	|100	|1950479609	|		|		|Yes	|200	|
#|webtest3	|Test11!@!!	|Drs du Buisson	|					|100	|1522117849	|Yes	|Inst	|		|		|

#GD-2300 Widget View
#As a Nedbank client who has logged into internet banking
#I want to see my accounts
#sot that I can select the one I want to transact on.
#
#Acceptance Criteria
#As a user on the dashboard, I verify that:
#1. I can see my accounts displayed in widgets
#2. I can see the following in the widget:
#i. Account type;
#ii. Account number below the account type;
#iii. Current balance left aligned
#iv. Available balance right aligned on the same row
#v. At the bottom of the widget are:
#a) Transfer icon
#b) Pay icon
#c) Buy icon
#NB: These icon have the same hyperlinks as those displayed in the header


@QuickAccessTrf   @smoke    @RT   @QuickAccessTrfSmoke
Scenario Outline: Quick Access Transfer Positive
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I can see my accounts displayed in widgets.  At the bottom of the widget is a quick access "Transfer" icon.  Click this"<TransMethod>","<DashBAccType>","<FromAcc>"
Then I can run through a transfer"True","<FromAcc>","<ToAcc>","<Amount>","<Edit>","<EdtAmt>"

Examples:
|NedID	  |Password |TransMethod|DashBAccType |Amount |FromAcc    |ToAcc	  |Edit	|EdtAmt	|
|webtest2 |?	    |           |current      |100	  |1950479609 |1284082237 |Yes	|80		|


@QuickAccessPay   @smoke    @RT   @QuickAccessPaySmoke
Scenario Outline: Quick Access Pay Positive
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I can see my accounts displayed in widgets.  At the bottom of the widget is a quick access "Pay" icon.  Click this"<TransMethod>","<DashBAccType>","<Account>"
Then I can run through a once off payment"True","<RecipientName>","<BankName>","<AccNo>","<AccType>","<BranchNameCode>","<Amount>","<Account>","<FromAccType>","<St2Done>","<YourRef>","<TheirRef>","<NotifMethod>","<NotifValue>","<SaveBen>","<Date>","<EndPmtChoice>"

Examples:
|NedID		|Password |TransMethod|DashBAccType |RecipientName	|BankName	|AccNo		|AccType|BranchNameCode |Amount	|Account	|FromAccType		|St2Done|YourRef|TheirRef	|NotifMethod|NotifValue				|SaveBen|Date	|EndPmtChoice|
#|webtest3	|?	      |Single     |current      |MomHoliday		|Investec	|10010016176|		|				|100	|1522117849	|PEAKFULL			|Yes	|Holiday|Snymans	|SMS		|0827236901				|No		|		|New		|
|webtest2	|?	      |Single     |current      |HolidayContbn	|Nedb		|1748454560	|Current|				|100	|1950479609	|Mar Properties CC  |Yes	|Booking|Wards		|Fax		|0865948576				|No		|		|Done		|


#@QuickAccessBuyPrepaid   @smoke    @RT  #Design changes coming (leaving this out due to current complexity which will change) where transactions will go to a landing page for accessibility reasons
#Scenario Outline: Quick Access Buy Prepaid
#Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
#When I can see my accounts displayed in widgets.  At the bottom of the widget is a quick access "Pay" icon.  Click this"<TransMethod>","<DashBAccType>","<Account>"
#Then I can run through a once off payment"True","<RecipientName>","<BankName>","<AccNo>","<AccType>","<BranchNameCode>","<Amount>","<Account>","<FromAccType>","<St2Done>","<YourRef>","<TheirRef>","<NotifMethod>","<NotifValue>","<SaveBen>","<Date>","<EndPmtChoice>"
#
#Examples:
#|NedID		|Password |TransMethod|DashBAccType |RecipientName	|BankName	|AccNo		|AccType|BranchNameCode |Amount	|Account	|FromAccType		|St2Done|YourRef|TheirRef	|NotifMethod|NotifValue				|SaveBen|Date	|EndPmtChoice|
##|webtest3	|?	      |           |current      |MomHoliday		|Investec	|10010016176|		|				|100	|1522117849	|PEAKFULL			|Yes	|Holiday|Snymans	|SMS		|0827236901				|No		|		|New		|
#|webtest2	|?	      |           |current      |HolidayContbn	|Nedb		|1748454560	|Current|				|100	|1950479609	|J-Mar Properties CC|Yes	|Booking|Wards		|Fax		|0865948576				|No		|		|Done		|

#  @QuickAccessBuyElectricity   @smoke    @RT  #Design changes coming (leaving this out due to current complexity which will change) where transactions will go to a landing page for accessibility reasons

#  @QuickAccessBuyLotto   @smoke    @RT  #Design changes coming (leaving this out due to current complexity which will change) where transactions will go to a landing page for accessibility reasons
