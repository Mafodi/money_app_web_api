@WebRegression @FND_FutureDated_Payments
Feature: Future Dated Payments



 @Future_Dated_Payment_To_NEDBANK_Current_Account
 Scenario Outline: Future dated  payment to Current account
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When CC_I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<ToAccNo>"
  And Select alpha field with the label Account type"<ToAccType>" for adding the Bank Account Details
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<FromAccount>"
  And I should be able to select the future date
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
   |NedID	     |Password        |RecipientName   |BankName |ToAccNo     |ToAccType      |Amount |FromAccount |St2Done |YourRef  |TheirRef |NotifMethod|NotifValue    |
   |webtest3     |Home@123456     |HolidayContbn   |NEDBANK  |1748454560  |Current account|300    |1522117849  |Yes	 |Booking  |Wards	 |Fax		 |0865948576    |

 @Future_Dated_Payment_To_NEDBANK_Savings_Account
Scenario Outline: Future dated  payment to Savings account
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
 When CC_I navigate to the Pay function
And I should be able to Enter new recipient name"<RecipientName>"
And I click on the method of payment-pay to bank account
And I enter Bank name"<BankName>"
And I enter Account No"<ToAccNo>"
And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
And I should be able to see the next button and click it
And After clicking on Next I should be able to move to the How much would you like to pay screen
And I want to capture the amount"<Amount>" to pay
And I should be able to select account"<FromAccount>"
And I should be able to select the future date
And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
And I enter Your reference"<YourRef>"
And I enter Their reference"<TheirRef>"
And I choose the notification method"<NotifMethod>"
And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And I click on the Next button
And I_should be able to see payment your reference"<YourRef>"
And CC_I should be able to click on PAY to confirm the payment
Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
And I must be able to the see the recipient details"<RecipientName>"
And I_must be able to see the amount
And I_must be able to see Transaction number displayed
And I_must be able to see the Payment date
And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

Examples:
|NedID	      |Password      |RecipientName   | BankName        |ToAccNo      |AccType           |Amount |FromAccount   |St2Done    |YourRef  |TheirRef |NotifMethod|NotifValue    |
|webtest3     |Home@123456   |HolidayContbn   |NEDBANK          |2009206452   | Savings account  |500    |1522117849    |Yes	    |Booking  |Wards	|Fax		|0865948576	   |




 @Future_Dated_Payment_To_NEDBANK_Investment_Account
 Scenario Outline: Future dated  payment to Investment account
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When CC_I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<ToAccNo>"
  And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<FromAccount>"
  And I should be able to select the future date
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
   |NedID	     |Password     |RecipientName    | BankName         |ToAccNo           |AccType            |Amount  |FromAccount   |St2Done   |YourRef  |TheirRef |NotifMethod|NotifValue  |
   |webtest3     |Home@123456  |HolidayContbn    |NEDBANK           |55849862-9995     |Investment account |  150   |1522117849    |Yes	      |Booking  |Wards	  |Fax		|0865948576	 |


 @Future_Dated_Payment_To_NEDBANK_Home_Loan_Account
 Scenario Outline: Future dated  payment to Home Loan account
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When CC_I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<ToAccNo>"
  And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<FromAccount>"
  And I should be able to select the future date
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
   |NedID	     |Password    |RecipientName   | BankName             |ToAccNo          |AccType                 |Amount |FromAccount    |St2Done    |YourRef  |TheirRef |NotifMethod|NotifValue   |
   |webtest3     |Home@123456 |HolidayContbn   |NEDBANK               |1310311100101    | Home loan account 	 |300    |1522117849     |Yes	     |Booking  |Wards	|Fax		|0865948576	   |

# @Future_Dated_Payment_To_NEDBANK_Personal_loan_Account
# Scenario Outline: Future dated  payment to Personal Loan Account
# Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
#  When CC_I navigate to the Pay function
#  And I should be able to Enter new recipient name"<RecipientName>"
#  And I click on the method of payment-pay to bank account
#  And I enter Bank name"<BankName>"
#  And I enter Account No"<ToAccNo>"
#  And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
#  And I should be able to see the next button and click it
#  And After clicking on Next I should be able to move to the How much would you like to pay screen
#  And I want to capture the amount"<Amount>" to pay
#  And I should be able to select account"<FromAccount>"
#  And I should be able to select the future date
#  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
#  And I enter Your reference"<YourRef>"
#  And I enter Their reference"<TheirRef>"
#  And I choose the notification method"<NotifMethod>"
#  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
#  And I click on the Next button
#  And I_should be able to see payment your reference"<YourRef>"
#  And CC_I should be able to click on PAY to confirm the payment
#  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
#  And I must be able to the see the recipient details"<RecipientName>"
#  And I_must be able to see the amount
#  And I_must be able to see Transaction number displayed
#  And I_must be able to see the Payment date
#  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment
#
#  Examples:
#   |NedID	      |Password   |RecipientName   | BankName         |ToAccNo         |AccType               |Amount  |FromAccount  |St2Done |YourRef  |TheirRef |NotifMethod|NotifValue    |
#   |webtest3     |Home@123456  |HolidayContbn   |NEDBANK           |8004045997501   |Personal loan account |  150   |1522117849   |Yes	  |Booking  |Wards	  |Fax		  |0865948576	 |
#



 @Future_Dated_Payment_To_Credit_Card_Number
 Scenario Outline: Future dated  payment to Credit Card Number
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When CC_I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And CC_On the Pay screen I should see one more option in the pay options 'Pay to a credit card'
  And CC_On selection of pay to credit card I should see only a field to enter 'Credit card number'"<CreditCardNo>"
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<FromAccount>"
  And I should be able to select the future date
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
   |NedID		 |Password  |RecipientName   |CreditCardNo	 |Amount	    |FromAccount 	|St2Done|TheirRef	|YourRef|NotifMethod|NotifValue				|
   |webtest3     |Home@123456 |My credit card	|377090000353447|300	        |1522117849     |Yes	|CredCrdPmt	|DocJ	|Email		|seansn@nedbank.co.za	|


 @Future_Dated_Payment_To_Other_Bank_Account
 Scenario Outline: Future dated  payment to Other Bank account
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When CC_I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<ToAccNo>"
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<FromAccount>"
  And I should be able to select the future date
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment


  Examples:
   |NedID	      |Password   |RecipientName      |BankName                  |ToAccNo          |Amount |FromAccount |St2Done    |YourRef  |TheirRef |NotifMethod|NotifValue    |
   |webtest3     |Home@123456 |HolidayContbn      |STANDARD BANK SOUTH AFRICA|302355391        |300    |1522117849   |Yes	   |Booking  |Wards	   |Fax		   |0865948576    |


