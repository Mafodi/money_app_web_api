@WebRegression @FNDWeb @FNDWebRegression @FND_Payments


Feature: Once Off Payment to Mobile Number

@Once_Off_Payment_Mobile_Number
Scenario Outline: Once Off Payment to Mobile Number Now Positive
Given Mob_I am Logged in to Banking web app with username"<NedID>" and password"<Password>"
When Mob_I navigate to the Pay function
And Mob_I should be able to Enter new recipient name"<RecipientName>"
And Mob_I should be able to select Pay to a cellphone
And Mob_I should be able to enter the recipients mobile number"<MobileNumber>"
And I should be able to see the next steps header
And Mob_After clicking on Next I should be able to move to the How much would you like to pay screen
And Mob_I want to capture the amount"<Amount>" to pay
And Mob_I should be able to select account"<Account>"
And Mob_The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
And Mob_I enter Your reference"<YourRef>"
And Mob_I choose the notification method"<NotifMethod>"
And Mob_I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
And Mob_I click on the Next button
And Mob_I should be able to see Payment from account"<FromAccType>"
And Mob_I should be able to see payment your reference"<YourRef>"
And Mob_The save beneficiary toggle should be able to be turned on and off by the user either sliding the toggle or clicking on it"<SaveBen>"
And Mob_I should be able to click on PAY to confirm the payment
Then Mob_I should be able to see a confirmation screen so that I know that the transfer is done
And Mob_I should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

Examples:
|NedID		|Password |RecipientName	|MobileNumber |Amount |Account	  |FromAccType		          |St2Done|TheirRef	|YourRef|NotifMethod|NotifValue				|SaveBen|
|webtest2	|Test11!@!! |Andrew Garden	|0827236901	  |100    |1950479609 |Mar Properties CC		  |Yes	  |			|DocJ	|Email		|seansn@nedbank.co.za	|No		|

