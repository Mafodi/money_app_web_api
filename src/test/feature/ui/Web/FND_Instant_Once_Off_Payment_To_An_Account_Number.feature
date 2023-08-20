@WebRegression @FNDWeb @FNDWebRegression @FND_Payments




Feature: Instant Once Off Payment to an Account Number

@Instant_And_Once_Off_Payment_To_Account_Number
Scenario Outline: Instant Once Off Payment to an Account Number
Given Mob_I am logged into online banking
When I navigate to the Pay function
And I_should be able to Enter new recipient name"<RecipientName>"
And I_click on the method of payment-pay to bank account
And I_enter Bank name"<BankName>"
And I_enter Account No"<AccNo>"
And I_Select alpha field with the label Account type"<AccType>" for adding the Bank Account Details
And I_should be able to see the next steps header
And I_After clicking on Next I should be able to move to the How much would you like to pay screen
And I_want to capture the amount"<Amount>" to pay
And When I click on the instant payment toggle I must see the instant payment message
And If it's instant payment then show text instant payment in the Date field else show only the date
And I_should be able to select account"<Account>"
And Next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
And I_enter Your reference"<YourRef>"
And I_enter Their reference"<TheirRef>"
And I_choose the notification method"<NotifMethod>"
And I_enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And I_click on the Next button
And I_should be able to see Payment from account"<Account>"
And I_should be able to see your reference"<YourRef>"
And Save beneficiary toggle should be able to be turned on and off by the user either sliding the toggle or clicking on it"<SaveBen>"
And I_should be able to click on PAY to confirm the payment
Then I should be able to see a confirmation screen so that I know that the transfer is done
And I_must be able to the see the recipient detail"<Recipient>"
And I must be able to see the payment amount"<Amount>"
And I must be able to see Transaction number displayed
And I must be able to see the Payment date
And I should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

Examples:
|NedID		|Password     |RecipientName  |BankName	|AccNo		|AccType|BranchNameCode |Amount	|Account	|FromAccType	  |St2Done|YourRef|TheirRef	|NotifMethod|NotifValue	|SaveBen|Date	|EndPmtChoice|
|webtest3	|Test11!@!!   |Donation best  |ABSA 	|4047594620 |		|				|100.45	|1950479609	|Mar Properties CC|Yes	  |DocJ	|Sean		|			|			|No		|Inst	|Done		|
