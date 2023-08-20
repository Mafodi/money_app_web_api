@regression
Feature: Scheduling Transactions


@ScheduledTransPmtAccPositive	@RT
Scenario Outline: Scheduling Payment Positive
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I navigate to the Pay function
And I should be able to Enter new recipient name"<RecipientName>"
And I click on the method of payment-pay to bank account
And I enter Bank name"<BankName>"
And I enter Account No"<AccNo>"
And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
And I must be able to enter the branch code"<BranchNameCode>" if there is no universal branch code for the bank selected
And I should be able to see the next steps header
And After clicking on Next I should be able to move to the How much would you like to pay screen
And I want to capture the amount"<Amount>" to pay
And I should be able to select account"<Account>"
And I must be able to select the a date for my scheduled or repeat payment"<Date>"
And Once a date has been selected, close the calendar dropdown and display the selected date in the payment date field
And I should be able to set the Payment frequency (repeat payment) to one of: Monthly, Weekly or Never"<RepeatPmt>"
And On the 'number of repeats' field, the user should be able to type in the number of times they would like to repeat the payment"<Occurances>"
And End Date is selected 'Payment End Date' field should be displayed below where the 'in x weeks' should be pre-populated based on the selection of Monthly or Weekly in the Payment Repeat field above"<EndDate>"
And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
And I enter Your reference"<YourRef>"
And I enter Their reference"<TheirRef>"
And I choose the notification method"<NotifMethod>"
And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And I click on the Next button
And I should be able to see Payment from account"<Account>"
And I should be able to see payment recipient reference"<TheirRef>" and your reference"<YourRef>"
And All details should be as selected on previous screen"<RecipientName>","<BankName>","<AccNo>"
And The save beneficiary toggle should be able to be turned on and off by the user either sliding the toggle or clicking on it"<SaveBen>"
And I should be able to click on PAY to confirm the payment
Then I should be able to see a confirmation screen so that I know that the transfer is done
And I must be able to the see the recipient name"<RecipientName>"
And I must be able to see the bank"<BankName>" and account number"<AccNo>" in the bank line
And I must be able to see the payment amount"<Amount>"
And I must be able to see payment from account type"<FromAccType>"
And I must be able to see Transaction number displayed
And I must be able to see the Payment date (or today)"<Date>"
And I should be able to see two buttons - New Payment and Done"<EndPmtChoice>". Clicking on Done should take me back to dashboard. Clicking on new payment should take me back to the first screen of payment
And Once payment is complete, the scheduled transaction must be viewable in upcoming payments under Accounts & servicing- Scheduled payment

Examples:
|NedID	  |Password |RecipientName|BankName	|AccNo		    |AccType    |BranchNameCode |Amount	|Account	|FromAccType	  |St2Done|YourRef|TheirRef	|NotifMethod|NotifValue				|SaveBen|Date	|RepeatPmt	|EndDate	|Occurances	|EndPmtChoice|
|webtest3 |Test11!@!!	    |Donation	  |FNB		|62606170158    |		    |				|100.12	|1522117849	|PEAKFULL		  |Yes	  |DocJ	  |Sean		|Email		|seansn@nedbank.co.za	|Yes	|+15	|			|			|			|Done		|


@smoke  @ScheduledTransPmtAccPositiveSmoke
Scenario Outline: Scheduling Payment Positive
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I navigate to the Pay function
And I should be able to Enter new recipient name"<RecipientName>"
And I click on the method of payment-pay to bank account
And I enter Bank name"<BankName>"
And I enter Account No"<AccNo>"
And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
And I must be able to enter the branch code"<BranchNameCode>" if there is no universal branch code for the bank selected
And I should be able to see the next steps header
And After clicking on Next I should be able to move to the How much would you like to pay screen
And I want to capture the amount"<Amount>" to pay
And I should be able to select account"<Account>"
And I must be able to select the a date for my scheduled or repeat payment"<Date>"
And Once a date has been selected, close the calendar dropdown and display the selected date in the payment date field
And I should be able to set the Payment frequency (repeat payment) to one of: Monthly, Weekly or Never"<RepeatPmt>"
And On the 'number of repeats' field, the user should be able to type in the number of times they would like to repeat the payment"<Occurances>"
And End Date is selected 'Payment End Date' field should be displayed below where the 'in x weeks' should be pre-populated based on the selection of Monthly or Weekly in the Payment Repeat field above"<EndDate>"
And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
And I enter Your reference"<YourRef>"
And I enter Their reference"<TheirRef>"
And I choose the notification method"<NotifMethod>"
And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And I click on the Next button
And I should be able to see Payment from account"<Account>"
And I should be able to see payment recipient reference"<TheirRef>" and your reference"<YourRef>"
And All details should be as selected on previous screen"<RecipientName>","<BankName>","<AccNo>"
And The save beneficiary toggle should be able to be turned on and off by the user either sliding the toggle or clicking on it"<SaveBen>"
And I should be able to click on PAY to confirm the payment
Then I should be able to see a confirmation screen so that I know that the transfer is done
And I must be able to the see the recipient name"<RecipientName>"
And I must be able to see the bank"<BankName>" and account number"<AccNo>" in the bank line
And I must be able to see the payment amount"<Amount>"
And I must be able to see payment from account type"<FromAccType>"
And I must be able to see Transaction number displayed
And I must be able to see the Payment date (or today)"<Date>"
And I should be able to see two buttons - New Payment and Done"<EndPmtChoice>". Clicking on Done should take me back to dashboard. Clicking on new payment should take me back to the first screen of payment
And Once payment is complete, the scheduled transaction must be viewable in upcoming payments under Accounts & servicing- Scheduled payment

Examples:
|NedID		|Password |RecipientName|BankName	|AccNo		|AccType|BranchNameCode |Amount	|Account	|FromAccType	  |St2Done|YourRef|TheirRef	|NotifMethod|NotifValue				|SaveBen|Date	|RepeatPmt	|EndDate	|Occurances	|EndPmtChoice|
|webtest2	|Testing23@!@	      |Donation		|ABSA 		|4047594620 |		|				|100.78	|1950479609	|Mar Properties CC|Yes	  |DocJ	|Sean		|			|						|Yes	|+5		|Weekly		|			|40			|Done		|

#And I must not be able to select a date in the past 
#And I must not be able to select a date which is more than 1 year from todays date (disable dates

@TransferRecurringPositive  @RT
Scenario Outline: Once Off Transfer Recurring Positive
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I navigate to the transfer function
Then I must be able to enter the amount"<Amount>" that I desire to transfer
And I must be able to select the from"<FromAcc>" and to"<ToAcc>" account for the transfer
And I must be able to see the transfer limit that I am allowed to transfer
And I must be able to select the a date for my scheduled or repeat payment"<Date>"
And I should be able to set the Payment frequency (repeat payment) to one of: Monthly, Weekly or Never"<RepeatTrf>"
And On the 'number of repeats' field, the user should be able to type in the number of times they would like to repeat the payment"<Occurances>"
And End Date is selected 'Payment End Date' field should be displayed below where the 'in x weeks' should be pre-populated based on the selection of Monthly or Weekly in the Payment Repeat field above"<EndDate>"
#And Maximum frequency"<Freq>" occurrences"<Duration>" weeks or months
And I must select confirm in order to review the transfer details
#And If recurring I must be able to see the details of a recurring transfer as part of the pay date
And I must be able to see transfer from account type name
And I must be able to see transfer to account type name
And I must be able to see transfer amount"<Amount>"
#And I must be able to edit"<Edit>" the transfer details"<EdtAmt>". If I select this option I must return to the transfer details screen
And I should be able to click on Transfer to confirm the payment
And I must be able to see Transaction number

Examples:
|NedID	  |Password |Amount	|FromAcc	|ToAcc		  |Date	|RepeatTrf|EndDate|Occurances |
|webtest2 |Testing23@!@        |100	|1950479609	|1284082237	  |+100 |         |       |	          |

@TransferRecurringPositiveSmoke  @smoke
Scenario Outline: Once Off Transfer Recurring Positive
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I navigate to the transfer function
Then I must be able to enter the amount"<Amount>" that I desire to transfer
And I must be able to select the from"<FromAcc>" and to"<ToAcc>" account for the transfer
And I must be able to see the transfer limit that I am allowed to transfer
And I must be able to select the a date for my scheduled or repeat payment"<Date>"
And I should be able to set the Payment frequency (repeat payment) to one of: Monthly, Weekly or Never"<RepeatTrf>"
And On the 'number of repeats' field, the user should be able to type in the number of times they would like to repeat the payment"<Occurances>"
And End Date is selected 'Payment End Date' field should be displayed below where the 'in x weeks' should be pre-populated based on the selection of Monthly or Weekly in the Payment Repeat field above"<EndDate>"
And I must select confirm in order to review the transfer details
And I must be able to see transfer from account type name
And I must be able to see transfer to account type name
And I must be able to see transfer amount"<Amount>"
And I should be able to click on Transfer to confirm the payment
And I must be able to see Transaction number

Examples:
|NedID	  |Password |Amount	|FromAcc	|ToAcc		  |Date	|RepeatTrf|EndDate|Occurances |
|webtest2 |Testing23@!@        |100	|1950479609	|1284082237	  |+100 |         |       |	          |
|webtest2 |Testing23@!@        |100	|1950479609	|1284082237	  |+10  |Monthly  |       |6	      |


@BuyPrepaidSchedPositive	@RT
Scenario Outline: Buy Prepaid Scheduled Positive
Given Buy_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I navigate to the Buy-Recharge function
When I must be able to capture a recipient name"<RecipientName>"
And I must be able to capture a cellphone number in the Recipient cellphone number field"<CellphoneNo>"
And I must be able to select a provider"<Provider>"
And Next button must become active and I must be able to select it and continue to the next step
And I must be able to capture a the type of recharge from a dropdown"<PrepaidType>"
And I must be able to select the bundle amount"<BundleAmt>"
And If I select Own Amount in the bundle drop down then I must be able to see the Own airtime amount field"<OwnAmount>"
And I must be able to see my monthly purchase limit in text below the bundle field
And I must be able to select a from account"<Account>"
And I must be able to select the a date for my scheduled or repeat payment"<Date>"
And I should be able to set the Buy frequency (repeat payment) to one of: Monthly, Weekly or Never"<RepeatBuy>"
And On the 'number of repeats' field, the user should be able to type in the number of times they would like to repeat the payment"<Occurances>"
And End Date is selected 'Payment End Date' field should be displayed below where the 'in x weeks' should be pre-populated based on the selection of Monthly or Weekly in the Payment Repeat field above"<EndDate>"
And Next button must become active and I must be able to select it and continue to the next step
And I must be able to capture a reference - Your Reference"<YourRef>"
And I must be able to select from a dropdown one of the following methods SMS Email Fax"<NotifMethod>"
And I can enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And Next button must become active and I must be able to select it and continue to the next step
And I should be able to see recipient details"<RecipientName>","<CellphoneNo>"
And I should be able to see mobile provider"<Provider>"
And I should be able to see the amount"<BundleAmt>","<OwnAmount>" and prepaid type"<PrepaidType>"
And I should be able to see Purchase from account"<AccountType>"
And I should be able to see the notification method and details if selected"<NotifMethod>","<NotifValue>"
And I should be able to see the my reference"<YourRef>"
And I must have the option to save the beneficiary as a toggle"<SaveBen>"
And I should be able to click on Buy button to confirm the payment
Then I should be able to see a confirmation screen so that I know that the purchase is done
#And I should be able to see Message of Payment success with the same details as the review screen
#And On clicking on done the user should move to the Overview page

Examples:
|NedID		|Password |RecipientName|CellphoneNo|Provider	|PrepaidType|BundleAmt	|OwnAmount|Account	    |AccountType|YourRef  |NotifMethod|NotifValue			|SaveBen|Date	|RepeatBuy|EndDate|Occurances |EndPmtChoice|
|webtest3	|Test11!@!!	      |Misti		|0828607709	|VODACOM	|Data		|63	 		|         |1522117849	|Current	|MistiData|Email	  |seansn@nedbank.co.za	|No	    |+90    |         |       |           |Done		  |
|webtest2	|Testing23@!@	      |Jethro		|0836879512	|MTN		|Airtime	|Own	    |250      |1950479609	|Current	|DocJ	  |			  |						|No		|+10    |Monthly  |       |6	      |Done		  |
|webtest2	|Testing23@!@	      |Chris		|0622212759	|CELL C		|Data		|249		|         |1950479609	|Current	|Booking  |Fax		  |0865948576			|No		|+15    |Monthly  |+200   |           |Done		  |

@BuyPrepaidSchedPositiveSmoke	@smoke
Scenario Outline: Buy Prepaid Scheduled Positive
Given Buy_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I navigate to the Buy-Recharge function
When I must be able to capture a recipient name"<RecipientName>"
And I must be able to capture a cellphone number in the Recipient cellphone number field"<CellphoneNo>"
And I must be able to select a provider"<Provider>"
And Next button must become active and I must be able to select it and continue to the next step
And I must be able to capture a the type of recharge from a dropdown"<PrepaidType>"
And I must be able to select the bundle amount"<BundleAmt>"
And If I select Own Amount in the bundle drop down then I must be able to see the Own airtime amount field"<OwnAmount>"
And I must be able to see my monthly purchase limit in text below the bundle field
And I must be able to select a from account"<Account>"
And I must be able to select the a date for my scheduled or repeat payment"<Date>"
And I should be able to set the Buy frequency (repeat payment) to one of: Monthly, Weekly or Never"<RepeatBuy>"
And On the 'number of repeats' field, the user should be able to type in the number of times they would like to repeat the payment"<Occurances>"
And End Date is selected 'Payment End Date' field should be displayed below where the 'in x weeks' should be pre-populated based on the selection of Monthly or Weekly in the Payment Repeat field above"<EndDate>"
And Next button must become active and I must be able to select it and continue to the next step
And I must be able to capture a reference - Your Reference"<YourRef>"
And I must be able to select from a dropdown one of the following methods SMS Email Fax"<NotifMethod>"
And I can enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And Next button must become active and I must be able to select it and continue to the next step
And I should be able to see recipient details"<RecipientName>","<CellphoneNo>"
And I should be able to see mobile provider"<Provider>"
And I should be able to see the amount"<BundleAmt>","<OwnAmount>" and prepaid type"<PrepaidType>"
And I should be able to see Purchase from account"<AccountType>"
And I should be able to see the notification method and details if selected"<NotifMethod>","<NotifValue>"
And I should be able to see the my reference"<YourRef>"
And I must have the option to save the beneficiary as a toggle"<SaveBen>"
And I should be able to click on Buy button to confirm the payment
Then I should be able to see a confirmation screen so that I know that the purchase is done

Examples:
|NedID		|Password |RecipientName|CellphoneNo|Provider	|PrepaidType|BundleAmt	|OwnAmount|Account	    |AccountType|YourRef  |NotifMethod|NotifValue			|SaveBen|Date	|RepeatBuy|EndDate|Occurances |EndPmtChoice|
|webtest3	|Test11!@!!	      |Misti		|0828607709	|VODACOM	|Data		|63	 		|         |1522117849	|Current	|MistiData|Email	  |seansn@nedbank.co.za	|No	    |+90    |         |       |           |Done		  |
|webtest3	|Test11!@!!	      |Krishna		|0828607709	|VODACOM    |SMS		|25		    |         |1522117849	|Current	|Holiday  |SMS		  |0827236901			|No		|+1     |Weekly	  |       |15		  |New		  |

@PayToBenSched	@RT   @PayToBenSchedSmoke	@smoke
Scenario Outline: Pay Beneficiary Account Scheduled
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I navigate to the Pay function
And I should be able to click on view list icon to access the bank approved beneficiaries. Clicking on it will take to next screen with view all list
And I should be able to search by name, mobile number or account no. and the records will auto filter based on the characters inputted"<RecipientType>","<Recipient>"
And I should be able to select from my list of beneficiaries
#And I should be able to see the next steps header
And PB_After clicking on Next I should be able to move to the How much would you like to pay screen
And PB_I want to capture the amount"<Amount>" to pay
And PB_I should be able to select account"<Account>"
And PB_I must be able to select the a date for my scheduled or repeat payment"<Date>"
And PB_I should be able to set the Payment frequency (repeat payment) to one of: Monthly, Weekly or Never"<RepeatPmt>"
And PB_On the 'number of repeats' field, the user should be able to type in the number of times they would like to repeat the payment"<Occurances>"
And PB_End Date is selected 'Payment End Date' field should be displayed below where the 'in x weeks' should be pre-populated based on the selection of Monthly or Weekly in the Payment Repeat field above"<EndDate>"
And PB_The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
And PB_I enter Your reference"<YourRef>"
And PB_I enter Their reference"<TheirRef>"
And PB_I choose the notification method"<NotifMethod>"
And PB_I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And PB_I click on the Next button
And PB_I should be able to see Payment from account"<Account>"
And PB_I should be able to see payment recipient reference"<TheirRef>" and your reference"<YourRef>"
And PB_The save beneficiary toggle should be able to be turned on and off by the user either sliding the toggle or clicking on it"<SaveBen>"
And PB_I should be able to click on PAY to confirm the payment
Then I should be able to see a confirmation screen so that I know that the payment is done"<RecipientType>"
And I must be able to the see the recipient detail
And I must be able to see the bank name and account number in the bank line
And PB_I must be able to see the payment amount"<Amount>"
And PB_I must be able to see payment from account type"<FromAccType>"
And PB_I must be able to see Transaction number displayed
And PB_I must be able to see the Payment date (or today)"<Date>"
And PB_I should be able to see two buttons - New Payment and Done"<EndPmtChoice>". Clicking on Done should take me back to dashboard. Clicking on new payment should take me back to the first screen of payment

Examples:
|NedID		|Password |RecipientType|Recipient		                |Amount	|Account	|FromAccType  |St2Done|YourRef      |TheirRef   |NotifMethod|NotifValue |Date	|RepeatPmt	|EndDate	|Occurances	|SaveBen|EndPmtChoice |Notes          |
|webtest3	|Test11!@!!	      |Bank-approved|MFC DIV OF NEDBANK-COLLECTIONS	|300.25	|1522117849	|PEAKFULL     |Yes	  |Lambo prt pmt|16213710001|		    |			|+56	|Monthly    |		    |6          |Yes    |Done		  |Current to MFC |

@OnceOffPaymentCredCrdScheduled	  @smoke		@RT   @OnceOffPaymentCredCrdScheduledSmoke
Scenario Outline: Once Off Payment to Credit Card Scheduled
Given Mob_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When Mob_I navigate to the Pay function
And Mob_I should be able to Enter new recipient name"<RecipientName>"
And On the Pay screen I should see one more option in the pay options 'Pay to a credit card'
And On selection of pay to credit card I should see only a field to enter 'Credit card number'"<CreditCardNo>"
And Mob_After clicking on Next I should be able to move to the How much would you like to pay screen
And Mob_I want to capture the amount"<Amount>" to pay
And Mob_I should be able to select account"<Account>"
And I must be able to select the a date for my scheduled or repeat payment"<Date>"
And Mob_The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
And Mob_I enter Your reference"<YourRef>"
And I enter Their reference"<TheirRef>"
And CC_I choose the notification method"<NotifMethod>"
And Mob_I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And Mob_I click on the Next button
And Mob_I should be able to see Payment from account"<Account>"
And Mob_I should be able to see payment recipient reference"<TheirRef>" and your reference"<YourRef>"
And Mob_The save beneficiary toggle should be able to be turned on and off by the user either sliding the toggle or clicking on it"<SaveBen>"
And Mob_I should be able to click on PAY to confirm the payment
Then Mob_I should be able to see a confirmation screen so that I know that the transfer is done
And Mob_I should be able to see two buttons - New Payment and Done"<EndPmtChoice>". Clicking on Done should take me back to dashboard. Clicking on new payment should take me back to the first screen of payment

Examples:
|NedID	  |Password |RecipientName  |CreditCardNo   |Amount	|Account	|St2Done|TheirRef	|YourRef|NotifMethod|NotifValue			  |SaveBen|Date	|RepeatPmt|EndDate|Occurances |EndPmtChoice|
|webtest2 |Testing23@!@	    |MyCreditCardFD |377090000353447|300.56	|1950479609	|Yes	|CredCrdPmt	|DocJ	|Email		|seansn@nedbank.co.za |Yes	  |+24	|         |       |           |Done		  |

