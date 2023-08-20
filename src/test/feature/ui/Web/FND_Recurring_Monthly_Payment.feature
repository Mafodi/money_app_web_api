@WebRegression @FNDWebRegression2 @FND_Recurring_Payments_Monthly
Feature: Recurring Monthly Payments

 @Recurring_Monthly_Payment_To_NEDBANK_Current_Account_Repeat_By_End_Date
 Scenario Outline: Recurring Monthly  payment to Current account Repeat By End date
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<AccNo>"
  And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<Account>"
  And I should be able to select the future date
  And I should be able to select repeat payment option"<ReccuringOption>"
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I should be able to see Payment from account type"<FromAccType>"
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
  |NedID	     |Password               |RecipientName     | BankName        |AccNo        |AccType          |Amount |Account    |FromAccType  |ReccuringOption  |St2Done    |YourRef  |TheirRef  |NotifMethod| NotifValue  |
   |webtest3     |Home@123456            |HolidayContbn     |NEDBANK          |1748454560   |Current account  |50.14  |1522117849 |PEAKFULL     |Monthly          |  Yes	  |Booking  |Wards     |Fax		   |0865948576   |

 @Recurring_Monthly_Payment_To_NEDBANK_Savings_Account_Repeat_By_End_Date
 Scenario Outline: Recurring Monthly   payment to NedBank Savings account Repeat By End date
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<AccNo>"
  And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<Account>"
  And I should be able to select the future date
  And I should be able to select repeat payment option"<RuccuringOption>"
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I should be able to see Payment from account type"<FromAccType>"
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
  |NedID	     |Password               |RecipientName     | BankName        |AccNo        |AccType          |Amount |Account    |FromAccType  |RuccuringOption  |St2Done    |YourRef  |TheirRef  |NotifMethod| NotifValue  |
   |webtest3     |Home@123456            |HolidayContbn     |NEDBANK          |1748454560   |Current account  |50.14  |1522117849 |PEAKFULL     |Monthly          |  Yes	  |Booking  |Wards     |Fax		   |0865948576   |

 @Recurring_Monthly_Payment_To_NEDBANK_Investment_Account_Repeat_By_End_Date
 Scenario Outline: Recurring Monthly   payment to NedBank  Investment account Repeat By End date
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<AccNo>"
  And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<Account>"
  And I should be able to select the future date
  And I should be able to select repeat payment option"<ReccuringOption>"
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I should be able to see Payment from account type"<FromAccType>"
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
   |NedID	     |Password               |RecipientName     | BankName        |AccNo        |AccType          |Amount |Account    |FromAccType  |ReccuringOption   |St2Done     |YourRef  |TheirRef  |NotifMethod  | NotifValue  |
   |webtest3     |Home@123456            |HolidayContbn     |NEDBANK          |1748454560   |Current account  |50.14  |1522117849 |PEAKFULL     |Monthly           |  Yes	    |Booking  |Wards     |Fax		   |0865948576   |

 @Recurring_Monthly_Payment_To_NEDBANK_Homeloan_Account_Repeat_By_End_Date
 Scenario Outline: Recurring Monthly  payment to Homeloan account Repeat By End date
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<AccNo>"
  And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<Account>"
  And I should be able to select the future date
  And I should be able to select repeat payment option"<ReccuringOption>"
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I should be able to see Payment from account type"<FromAccType>"
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
   | NedID	       |Password               |RecipientName     | BankName        |AccNo        |AccType          |Amount |Account    |FromAccType  |ReccuringOption  |St2Done    |YourRef  |TheirRef  |NotifMethod| NotifValue  |
   |webtest3       |Home@123456            |HolidayContbn     |NEDBANK          |1748454560   |Current account  |50.14  |1522117849 |PEAKFULL     |Monthly          |  Yes	    |Booking  |Wards     |Fax	     |0865948576   |

  #  @Recurring_Monthly_Payment_To_NEDBANK_Personal_loan_Account_Repeat_By_End_Date
# Scenario Outline: Recurring Monthly payment to Personal Loan Account Repeat By End date
#  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
#  When I navigate to the Pay function
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
#  And I should be able to select repeat payment option"<RuccuringOption>"
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
#  | NedID	      |Password            |RecipientName    | BankName        |AccNo          |AccType               |Amount  |Account    |FromAccType  |ReccuringOption  |St2Done    |YourRef  |TheirRef  |NotifMethod   | NotifValue    |
#   |webtest3     |Home@123456         |HolidayContbn    |NEDBANK          |558498629995   |Personal loan account |  150   |1522117849 |PEAKFULL     |Monthly          |  Yes	   |Booking  |Wards     |Fax		   |0865948576   |
#558498629995


 @Recurring_Monthly_Payment_To_Other_Bank_Account_Repeat_By_End_Date
 Scenario Outline: Recurring Monthly  payment to Other Bank account Repeat By End date
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<AccNo>"
  And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<Account>"
  And I should be able to select the future date
  And I should be able to select repeat payment option"<ReccuringOption>"
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I should be able to see Payment from account type"<FromAccType>"
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
 | NedID	   |Password               |RecipientName     | BankName        |AccNo        |AccType          |Amount |Account    |FromAccType  |ReccuringOption  |St2Done    |YourRef  |TheirRef  |NotifMethod| NotifValue    |
 |webtest3     |Home@123456            |HolidayContbn     |NEDBANK          |1748454560   |Current account  |50.14  |1522117849 |PEAKFULL     |Monthly          |  Yes	    |Booking  |Wards     |Fax		   |0865948576   |


 @Recurring_Monthly_Payments_Other_AccountNumber_Repeat_By_End_Date
 Scenario Outline: Recurring Monthly  payment to Other Bank account Repeat by end date
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When INS I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<AccNo>"
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<Account>"
  And I should be able to select the future date
  And I should be able to select repeat payment option"<RuccuringOption>"
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I should be able to see Payment from account type"<FromAccType>"
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
   |NedID	     |Password       |RecipientName   | BankName                 |AccNo          |Amount  |Account      |FromAccType	 |RuccuringOption  |St2Done    |YourRef    |TheirRef  |NotifMethod | NotifValue  |
   |webtest3     |Home@123456    |HolidayContbn   |STANDARD BANK SOUTH AFRICA|302355391      |50.14   |1522117849   |PEAKFULL        |Monthly          |Yes	       |Booking    |Wards	  |Fax		   |0865948576   |


 @Recurring_Monthly_Payments__NEDBANK_Current_Account_Repeat_By_Occurrences
 Scenario Outline: Recurring Weekly  payment to Current account Repeat by Occurrences
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When INS I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<AccNo>"
  And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<Account>"
  And I should be able to select the future date
  And I should be able to select repeat payment option"<RuccuringOption>"
  And I should able to click on Occurrences and enter number of Occurrences"<Occurrences>"
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I should be able to see Payment from account type"<FromAccType>"
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
   |NedID	     |Password       |RecipientName     | BankName        |AccNo        |AccType          |Amount |Account    |FromAccType	      |RuccuringOption  |Occurrences|St2Done    |YourRef  |TheirRef  |NotifMethod| NotifValue    |
   |webtest3     |Home@123456    |HolidayContbn     |NEDBANK          |1748454560   |Current account  |100    |1522117849 |PEAKFULL           |Monthly          |         2|Yes	        |Booking  |Wards     |Fax		   |0865948576   |

 @Recurring_Monthly_Payments_NEDBANK_Saving_Account_Repeat_By_Occurrences
 Scenario Outline: Recurring Monthly payment to Savings account Repeat by Occurrences
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When INS I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<AccNo>"
  And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<Account>"
  And I should be able to select the future date
  And I should be able to select repeat payment option"<RuccuringOption>"
  And I should able to click on Occurrences and enter number of Occurrences"<Occurrences>"
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I should be able to see Payment from account type"<FromAccType>"
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
   |NedID	     |Password       |RecipientName     | BankName    |AccNo        |AccType          |Amount          |Account    |FromAccType	     |RuccuringOption  |Occurrences|St2Done    |YourRef  |TheirRef  |NotifMethod   |NotifValue      |
   |webtest3     |Home@123456    |HolidayContbn     |NEDBANK      |2009206452   |Savings account  |100             |1522117849 |PEAKFULL         |Monthly           |     2     |Yes	       |Booking  |Wards	    |Fax		   |0865948576  	|


 @Recurring_Weekly_Payments_NEDBANK_Investment_Account_Repeat_By_Occurrences
 Scenario Outline: Recurring Monthly  payment to Investment account Repeat by Occurrences
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When INS I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<AccNo>"
  And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<Account>"
  And I should be able to select the future date
  And I should be able to select repeat payment option"<RuccuringOption>"
  And I should able to click on Occurrences and enter number of Occurrences"<Occurrences>"
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I should be able to see Payment from account type"<FromAccType>"
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
   |NedID	     |Password       |RecipientName  | BankName        |AccNo           |AccType             |Amount |Account    |FromAccType   |RuccuringOption  |Occurrences|St2Done     |YourRef  |TheirRef   |NotifMethod| NotifValue   |
   |webtest3     |Home@123456    |HolidayContbn  |NEDBANK          |55849862-9995   |Investment account  |150    |1522117849 |PEAKFULL      |Monthly          |          2|Yes	       |Booking  |Wards	     |Fax	     |0865948576    |


 @Recurring_Monthly_Payments_NEDBANK_Homeloan_Account_Repeat_By_Occurrences
 Scenario Outline: Recurring Monthly  payment to Homeloan account Repeat by Occurrences
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When INS I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<AccNo>"
  And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<Account>"
  And I should be able to select the future date
  And I should be able to select repeat payment option"<RuccuringOption>"
  And I should able to click on Occurrences and enter number of Occurrences"<Occurrences>"
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I should be able to see Payment from account type"<FromAccType>"
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
   |NedID	     |Password       |RecipientName  | BankName        |AccNo             |AccType           |Amount |Account    |FromAccType     |RuccuringOption   |Occurrences|St2Done    |YourRef  |TheirRef  |NotifMethod | NotifValue  |
   |webtest3     |Home@123456    |HolidayContbn  |NEDBANK          |1310311100101     | Home loan account|100    |1522117849 |PEAKFULL        |Monthly           |          2|Yes	     |Booking  |Wards	  |Fax		   |0865948576   |


# @Recurring_Monthly_Payments_NEDBANK_Personal_loan_Account_Repeat_By_Occurrences
# Scenario Outline:Recurring Monthly payment to Personal Loan Account Repeat by Occurrences
#  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
#  When CC_I navigate to the Pay function
#  And I should be able to Enter new recipient name"<RecipientName>"
#  And I click on the method of payment-pay to bank account
#  And I enter Bank name"<BankName>"
#  And I enter Account No"<ToAccNo>"
#  And Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
#  And I should be able to see the next button and click it
#  And After clicking on Next I should be able to move to the How much would you like to pay screen
#  And I want to capture the amount"<Amount>" to pay
#  And I should be able to select account"<Account>"
#  And I should be able to select the future date
#  And I should be able to select repeat payment option"<RuccuringOption>"
#  And I should able to click on Occurrences and enter number of Occurrences"<Occurrences>"
#  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
#  And I enter Your reference"<YourRef>"
#  And I enter Their reference"<TheirRef>"
#  And I choose the notification method"<NotifMethod>"
#  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
#  And I click on the Next button
#  And I should be able to see Payment from account type"<FromAccType>"
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
#   |NedID        |Password       |RecipientName      | BankName   |ToAccNo        |AccType                |Amount  |Account    |FromAccType  |RuccuringOption   |Occurrences|St2Done      |YourRef  |TheirRef  |NotifMethod | NotifValue  |
#   |webtest3     |Home@123456    |HolidayContbn      |NEDBANK     |558498629995   |Personal loan account  |  150   |1522117849 |PEAKFULL     |Monthly           |       2   | Yes	       |Booking  |Wards	    |Fax	     |0865948576   |
#                                                               8004045997501


 @Recurring_Monthly_Payments_Other_Bank_AccountNumber_Repeat_By_Occurrences
 Scenario Outline: Recurring Monthly  payment to Other Bank account Repeat by Occurrences
  Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  When INS I navigate to the Pay function
  And I should be able to Enter new recipient name"<RecipientName>"
  And I click on the method of payment-pay to bank account
  And I enter Bank name"<BankName>"
  And I enter Account No"<AccNo>"
  And I should be able to see the next button and click it
  And After clicking on Next I should be able to move to the How much would you like to pay screen
  And I want to capture the amount"<Amount>" to pay
  And I should be able to select account"<Account>"
  And I should be able to select the future date
  And I should be able to select repeat payment option"<RuccuringOption>"
  And I should able to click on Occurrences and enter number of Occurrences"<Occurrences>"
  And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
  And I enter Your reference"<YourRef>"
  And I enter Their reference"<TheirRef>"
  And I choose the notification method"<NotifMethod>"
  And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
  And I click on the Next button
  And I should be able to see Payment from account type"<FromAccType>"
  And I_should be able to see payment your reference"<YourRef>"
  And CC_I should be able to click on PAY to confirm the payment
  Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
  And I must be able to the see the recipient details"<RecipientName>"
  And I_must be able to see the amount
  And I_must be able to see Transaction number displayed
  And I_must be able to see the Payment date
  And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

  Examples:
   |NedID	     |Password        |RecipientName   | BankName                 |AccNo           |Amount  |Account    |FromAccType     |RuccuringOption   |Occurrences  |St2Done    |YourRef  |TheirRef  |NotifMethod | NotifValue  |
   |webtest3     |Home@123456     |HolidayContbn   |STANDARD BANK SOUTH AFRICA|302355391       |100  |1522117849    |PEAKFULL        |Monthly           |            3|Yes	      |Booking  |Wards	   |Fax		    |0865948576   |


