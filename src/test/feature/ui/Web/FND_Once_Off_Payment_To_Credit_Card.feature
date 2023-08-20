@WebRegression @FNDWeb @FNDWebRegression @FND_Payments


Feature: Once Off Payment to Credit Card

@Once_Off_Payment_Cred_Card
Scenario Outline: Once Off Payment to Credit Card
Given CC_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When CC_I navigate to the Pay function
And CC_I should be able to Enter new recipient name"<RecipientName>"
And CC_On the Pay screen I should see one more option in the pay options 'Pay to a credit card'
And CC_On selection of pay to credit card I should see only a field to enter 'Credit card number'"<CreditCardNo>"
And  I should be able to see the next steps header
And CC_Mob_After clicking on Next I should be able to move to the How much would you like to pay screen
And CC_I want to capture the amount"<Amount>" to pay
And CC_I should be able to select account"<Account>"
And CC_The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
And CC_I enter Your reference"<YourRef>"
And CC_I enter Their reference"<TheirRef>"
And CC_I choose the notification method"<NotifMethod>"
And CC_I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And CC_I click on the Next button
And CC_I should be able to see Payment from account"<Account>"
And CC_I should be able to see payment your reference"<YourRef>"
And CC_The save beneficiary toggle should be able to be turned on and off by the user either sliding the toggle or clicking on it"<SaveBen>"
And CC_I should be able to click on PAY to confirm the payment
Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
And CC_I should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment
Examples:
|NedID		|Password  |RecipientName   |CreditCardNo	|Amount	|Account 	|St2Done|TheirRef	|YourRef|NotifMethod|NotifValue				|SaveBen|Date	|EndPmtChoice|
|webtest2	|Testing23@!@ |My credit card	|377090000353447|300	|1950479609	|Yes	|CredCrdPmt	|DocJ	|Email		|seansn@nedbank.co.za	|No		|		|Done		|

