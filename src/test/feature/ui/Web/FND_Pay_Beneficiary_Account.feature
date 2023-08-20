@WebRegression @FNDWeb @FNDWebRegression @FND_Payments

Feature:Pay Beneficiary Account

@Payment_To_Beneficiary_Account_Mobile
Scenario Outline: Pay Beneficiary Account mobile
Given Pmt_I am Logged in to Banking web app with username"<NedID>" and password"<Password>"
When I Navigate to the Pay function
And I should be able to click on view list icon to access the bank approved beneficiaries. Clicking on it will take to next screen with view all list
And I should be able to search by name, mobile number or account no. and the records will auto filter based on the characters inputted"<RecipientType>","<Recipient>"
And I should be able to select from my list of beneficiaries"<Recipient>"
And I should be able to see the next steps header
And PB_After clicking on Next I should be able to move to the How much would you like to pay screen
And PB_I want to capture the amount"<Amount>" to pay
And PB_I should be able to select account"<Account>"
And PB_The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
And PB_I enter Your reference"<YourRef>"
And PB_I choose the notification method"<NotifMethod>"
And PB_I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And PB_I click on the Next button
And PB_I should be able to see Payment from account type"<AccountType>"
And PB_I should be able to see payment your reference"<YourRef>"
And PB_I should be able to click on PAY to confirm the payment
Then I should be able to see a confirmation screen so that I know that the payment is done
And I must be able to the see the recipient detail"<Recipient>"
And PB_I must be able to see the payment amount"<Amount>"
And PB_I must be able to see Transaction number displayed
And PB_I must be able to see the Payment date
And PB_I should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

Examples:
|NedID		|Password          |RecipientType|Recipient      |Amount	  |Account	    |AccountType	  |St2Done|YourRef          |NotifMethod  |NotifValue			|
 |webtest2	|Testing23@!@	   |			 |0614994984     |50	      |1950479609	|Mar Properties CC|Yes	  |Flight Ticket    |SMS	      |0614994984			|



@Payment_To_Beneficiary_Bank_Account
Scenario Outline: Pay To Beneficiary Bank account

Given Pmt_I am Logged in to Banking web app with username"<NedID>" and password"<Password>"
When I Navigate to the Pay function
And I should be able to click on view list icon to access the bank approved beneficiaries. Clicking on it will take to next screen with view all list
And I should be able to search by name, mobile number or account no. and the records will auto filter based on the characters inputted"<RecipientType>","<Recipient>"
And I should be able to select from my list of beneficiaries"<Recipient>"
And I should be able to see the next steps header
And PB_After clicking on Next I should be able to move to the How much would you like to pay screen
And PB_I want to capture the amount"<Amount>" to pay
And PB_I should be able to select account"<Account>"
And P_B_I The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
And P_B_I enter Your reference"<YourRef>"
And P_B_I enter Their reference"<TheirRef>"
And P_B_I choose the notification method"<NotifMethod>"
And P_B_I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And P_B_I click on the Next button
And P_B_I should be able to see Payment from account type"<FromAccType>"
And P_B_I_should be able to see payment your reference"<YourRef>"
And P_B_I should be able to click on PAY to confirm the payment
Then P_B_I should be able to see a confirmation screen so that I know that the payment is done
And P_B_I must be able to the see the recipient detail"<Recipient>"
And P_B_I must be able to see the payment amount"<Amount>"
And P_B_I must be able to see Transaction number displayed
And P_B_I must be able to see the Payment date
And P_B_I should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

Examples:
|NedID		|Password     |RecipientType|Recipient		|Amount	|Account	|FromAccType        |St2Done    |YourRef  |TheirRef	|NotifMethod |NotifValue		            |
|webtest2	|Testing23@!@ |			    |Egoli Gas      |50    |1950479609	|Mar Properties CC  |Yes	    |Egoli    |	Jonn    |Email        |	braamw@egoligas.co.za		|


@Repeat_Payment_To_Beneficiary
Scenario Outline: Repeat Payment to  Beneficiary
Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When RPT_I can select the Recipients service from the menu bar present at the top of my WEB login view
And RPT_I can search for a desired beneficiary"<RecipientType>","<Recipient>"
And RPT_I should be able to select a Beneficiary of my preference from the list of Beneficiary listed under My Recipient
And RPT_I On selecting a Beneficiary of my preference, the Right side of the Page I have the option to repeat payment made to the recipient. 'Pay again'
And RPT_If I select this option I am taken to step one of 'Review payment details'
And RPT_The details are exactly as the payment I am repeating"<Recipient>"
And RPT_I can view but cant edit the Recipient, Bank, and Payment date
And RPT_I should be able to select account"<Account>"
And RPT_I want to capture the amount"<Amount>" to pay
And RPT_I enter Your reference"<YourRef>"
And RPT_I enter Their reference"<TheirRef>"
And RPT_I choose the notification method"<NotifMethod>"
And RPT_I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And RPT_I must select option Pay
Then RPT_ I should be able to see a confirmation screen so that I know that the payment is done
And RPT_I must be able to the see the recipient detail"<Recipient>"
And RPT_I must be able to see the bank name and account number in the bank line
And RPT_I must be able to see the payment amount"<Amount>"
And RPT_I must be able to see Transaction number displayed
And RPT_I should be able to see two buttons - New Payment and Go to Overview
And RPT_Clicking on new payment or Go To Overview should take me back to the first screen of payment"<EndPmtChoice>"

Examples:
  |NedID		      |Password	    |RecipientType	|Recipient         |Amount  |Account	    |YourRef                  |TheirRef	    |NotifMethod|NotifValue	  |EndPmtChoice  |
  |webtest3           |Home@123456 	|               |Crusaders         |100	    |1522117849	    |Geyser Replacement       |Jonney		|Fax		|0865948576	  |  Go back     |


@Cancel_Repeat_Payment_To_Beneficiary
Scenario Outline: Repeat Pay Beneficiary Cancel or Edit
Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When RPT_I can select the Recipients service from the menu bar present at the top of my WEB login view
And RPT_I can search for a desired beneficiary"<RecipientType>","<Recipient>"
And RPT_I should be able to select a Beneficiary of my preference from the list of Beneficiary listed under My Recipient
And RPT_I On selecting a Beneficiary of my preference, the Right side of the Page I have the option to repeat payment made to the recipient. 'Pay again'
And  RPT_If I select this option I am taken to step one of 'Review payment details'
And  RPT_The details are exactly as the payment I am repeating"<Recipient>"
And  RPT_I can view but cant edit the Recipient, Bank, and Payment date
And  RPT_I should be able to select account"<Account>"
And  RPT_I want to capture the amount"<Amount>" to pay
And  RPT_I enter Your reference"<YourRef>"
And  RPT_I enter Their reference"<TheirRef>"
And  RPT_I choose the notification method"<NotifMethod>"
And  RPT_I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
Then RPT I must select option Cancel or option Go back to cancel the payment and return to the recipient view"<Action>"

Examples:
|NedID		          |Password	    |RecipientType	|Recipient         |Amount    |Account	    |YourRef                |TheirRef	|NotifMethod|NotifValue	  |Action	|
|webtest3             |Home@123456 	|               |Crusaders         |100	      |1522117849	|Geyser Replacement     |Jonney		|Fax		|0865948576	  |  Go back |



  @Instant_Payment_To_Beneficiary_Bank_Account
  Scenario Outline: Instant Payment To Beneficiary Bank Account
    Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I Navigate to the Pay function
    And I should be able to click on view list icon to access the bank approved beneficiaries. Clicking on it will take to next screen with view all list
    And I should be able to search by name, mobile number or account no. and the records will auto filter based on the characters inputted"<RecipientType>","<Recipient>"
    And I should be able to select from my list of beneficiaries"<Recipient>"
    And I should be able to see the next steps header
    And PB_After clicking on Next I should be able to move to the How much would you like to pay screen
    And PB_I want to capture the amount"<Amount>" to pay
    And PTB_INS When I click on the instant payment toggle I must see the instant payment message
    And PTB_INS If it's instant payment then show text instant payment in the Date field else show only the date
    And PB_I should be able to select account"<Account>"
    And PB_The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
    And PB_I enter Your reference"<YourRef>"
    And P_B_I enter Their reference"<TheirRef>"
    And PB_I choose the notification method"<NotifMethod>"
    And PB_I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
    And PB_I click on the Next button
    And PB_I should be able to see Payment from account type"<AccountType>"
    And PB_I should be able to see payment your reference"<YourRef>"
    And PB_I should be able to click on PAY to confirm the payment
    Then I should be able to see a confirmation screen so that I know that the payment is done
    And P_B_I must be able to the see the recipient detail"<Recipient>"
    And PB_I must be able to see the payment amount"<Amount>"
    And PB_I must be able to see Transaction number displayed
    And PB_I must be able to see the Payment date
    And PB_I should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

    Examples:
      |NedID 	    |Password     |RecipientType|Recipient		|Amount	|Account	|AccountType       |St2Done    |YourRef      |TheirRef	|NotifMethod  |NotifValue		        |
      |webtest3	    |Home@123456  |			    |Crusaders      |50     |1522117849	|PEAKFULL          |Yes	       |Crusaders    |	Jonn    |Email        |	braamw@egoligas.co.za	|


  @Delete_Beneficiary_Cancel
Scenario Outline: Delete Beneficiary cancel
Given Pmt_I am Logged in to Banking web app with username"<NedID>" and password"<Password>"
When RPT_I can select the Recipients service from the menu bar present at the top of my WEB login view
And DLT_I can search for a desired beneficiary to delete"<RecipientType>" "<RecipientName>"
And DLT_I should be able to select a Beneficiary of my preference from the list of Beneficiary listed under My Recipient
And DLT_On selecting a Beneficiary of my preference, the Right side of the Page I have the option to edit or add details
And DLT_I_Should be able to see an option to delete button and click on it to delete
And DLT_I Should be able to confirm delete or cancel buttons and select one among them

      Examples:
|NedID		|Password   |RecipientType|RecipientName	|

|webtest2	|Test11!@!!|			    |Egoli Gas	    |

#  @Delete_Beneficiary_Confirm
#  Scenario Outline: Delete Beneficiary cancel
#    Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
#    When RPT_I can select the Recipients service from the menu bar present at the top of my WEB login view
#    And DLT_I can search for a desired beneficiary to delete"<RecipientType>" "<RecipientName>"
#    And DLT_I should be able to select a Beneficiary of my preference from the list of Beneficiary listed under My Recipient
#    And DLT_On selecting a Beneficiary of my preference, the Right side of the Page I have the option to edit or add details
#    And DLT_I_Should be able to see an option to delete button and click on it to delete
#    And DLT_I Should be able to confirm delete
#    Then On selecting the delete button i should get a success message that the recipient was deleted successfully
#
#    Examples:
#      |NedID		    |Password   |RecipientType|RecipientName	|
#
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	    |Home@123456|			  |HolidayContbn    |
##      |webtest3	        |Home@123456|             |MFC DIVISION OF NEDBANK|
##      |webtest3	        |Home@123456|             |MFC DIVISION OF NEDBANK|
#      |webtest3	        |Home@123456|             |MFC DIVISION OF NEDBANK|
#      |webtest3	        |Home@123456|             |MFC DIVISION OF NEDBANK|
#      |webtest3	        |Home@123456|             |MFC DIVISION OF NEDBANK|
#



