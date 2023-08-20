@WebRegression @FND_Payments @FNDWebRegression2


Feature: Once Off Payment to an Account Number


@Once_Off_Pmt_To_NEDBANK_AccountNumber
Scenario Outline: Once Off Payment to an Account Number
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
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
And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
And I enter Your reference"<YourRef>"
And I enter Their reference"<TheirRef>"
And I choose the notification method"<NotifMethod>"
And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And I click on the Next button
And I should be able to see Payment from account type"<FromAccType>"
And I_should be able to see payment your reference"<YourRef>"
And The save beneficiary toggle should be able to be turned on and off by the user either sliding the toggle or clicking on it"<SaveBen>"
And CC_I should be able to click on PAY to confirm the payment
Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
And I must be able to the see the recipient details"<RecipientName>"
And I_must be able to see the amount
And I_must be able to see Transaction number displayed
And I_must be able to see the Payment date
And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

Examples:
|NedID	  |Password   |RecipientName   | BankName           |AccNo       |AccType          |Amount |Account    |FromAccType	     |St2Done |YourRef  |TheirRef |NotifMethod  |NotifValue    |SaveBen  |
|webtest2 |Testing23@!@  |HolidayContbn   |NEDBANK          |1748454560   |Current account |50.14 |1950479609  |Mar Properties CC|Yes	  |Booking  |Wards    |Fax		    |0865948576	   |No       |


@Once_Off_Pmt_To_Other_Bank_Account_Number
Scenario Outline: Once Off Payment to an Account Number
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I navigate to the Pay function
And I should be able to Enter new recipient name"<RecipientName>"
And I click on the method of payment-pay to bank account
And I enter Bank name"<BankName>"
And I enter Account No"<AccNo>"
And I should be able to see the next button and click it
And After clicking on Next I should be able to move to the How much would you like to pay screen
And I want to capture the amount"<Amount>" to pay
And I should be able to select account"<Account>"
And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
And I enter Your reference"<YourRef>"
And I enter Their reference"<TheirRef>"
And I choose the notification method"<NotifMethod>"
And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And I click on the Next button
And I should be able to see Payment from account type"<FromAccType>"
And I_should be able to see payment your reference"<YourRef>"
And The save beneficiary toggle should be able to be turned on and off by the user either sliding the toggle or clicking on it"<SaveBen>"
And CC_I should be able to click on PAY to confirm the payment
Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
And I must be able to the see the recipient details"<RecipientName>"
And I_must be able to see the amount
And I_must be able to see Transaction number displayed
And I_must be able to see the Payment date
And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment
Examples:
|NedID	  |Password   |RecipientName       | BankName                  |AccNo        |Amount |Account    |FromAccType	   |St2Done |YourRef  |TheirRef |NotifMethod |NotifValue       |SaveBen    |
|webtest2 |Testing23@!@  |HolidayContbn    |STANDARD BANK SOUTH AFRICA |302355391    |55.99  |1950479609|Mar Properties CC|Yes	    |DocJ	  |Sean	    |Fax         |098766566666     |No		    |
|webtest2 |Testing23@!@  |Donation lts     |CAPITEC BANK               |1425588547   |66.50  |1950479609 |Mar Properties CC|Yes	    |DocJ	  |Sean     |SMS         |0865948576	   |No          |


