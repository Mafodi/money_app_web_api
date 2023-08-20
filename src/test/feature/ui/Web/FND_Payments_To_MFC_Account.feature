@FND_Payments_MFC_Account
Feature: Payments to MFC Accounts

  @Once_Payment_To_MFC_Account
  Scenario Outline: Once of Payment to MFC account
    Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I Navigate to the Pay function
    And I should be able to click on view list icon to access the bank approved beneficiaries. Clicking on it will take to next screen with view all list
    And I should be able to search by name, mobile number or account no. and the records will auto filter based on the characters inputted"<RecipientType>","<RecipientName>"
    And I should be able to select from my list of beneficiaries"<RecipientName>"
    And I should be able to see the next steps header
    And PB_After clicking on Next I should be able to move to the How much would you like to pay screen
    And PB_I want to capture the amount"<Amount>" to pay
    And PB_I should be able to select account"<FromAccount>"
    And P_B_I The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
    And P_B_I enter Your reference"<YourRef>"
    And P_B_I enter Their reference"<TheirRef>"
    And P_B_I choose the notification method"<NotifMethod>"
    And P_B_I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
    And P_B_I click on the Next button
    And P_B_I should be able to see Payment from account type"<AccountType>"
    And P_B_I_should be able to see payment your reference"<YourRef>"
    And P_B_I should be able to click on PAY to confirm the payment
    Then P_B_I should be able to see a confirmation screen so that I know that the payment is done
    And P_B_I must be able to the see the recipient detail"<Recipient>"
    And P_B_I must be able to see the payment amount"<Amount>"
    And P_B_I must be able to see Transaction number displayed
    And P_B_I must be able to see the Payment date
    And P_B_I should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

    Examples:
      |NedID	      |Password  |RecipientType         |RecipientName                 |Amount |FromAccount    |AccountType      |St2Done  |YourRef  |TheirRef	|NotifMethod  |NotifValue     |
      |webtest3       |Home@123456 |Bank-approved         |MFC DIVISION OF NEDBANK     |300    |1522117849     |PEAKFULL         |Yes	   |70967680001   |70967680001    |Fax		   |0865948576    |


  @Future_Dated_Payment_To_MFC_Account
  Scenario Outline: Future Dated Payment to MFC account
    Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I Navigate to the Pay function
    And I should be able to click on view list icon to access the bank approved beneficiaries. Clicking on it will take to next screen with view all list
    And I should be able to search by name, mobile number or account no. and the records will auto filter based on the characters inputted"<RecipientType>","<RecipientName>"
    And I should be able to select from my list of beneficiaries"<RecipientName>"
    And I should be able to see the next steps header
    And PB_After clicking on Next I should be able to move to the How much would you like to pay screen
    And PB_I want to capture the amount"<Amount>" to pay
    And PB_I should be able to select account"<FromAccount>"
    And P_B_I The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
    And P_B_I enter Your reference"<YourRef>"
    And P_B_I enter Their reference"<TheirRef>"
    And P_B_I choose the notification method"<NotifMethod>"
    And P_B_I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
    And P_B_I click on the Next button
    And P_B_I should be able to see Payment from account type"<AccountType>"
    And P_B_I_should be able to see payment your reference"<YourRef>"
    And P_B_I should be able to click on PAY to confirm the payment
    Then P_B_I should be able to see a confirmation screen so that I know that the payment is done
    And P_B_I must be able to the see the recipient detail"<RecipientName>"
    And P_B_I must be able to see the payment amount"<Amount>"
    And P_B_I must be able to see Transaction number displayed
    And P_B_I must be able to see the Payment date
    And P_B_I should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

    Examples:
      |NedID	      |Password    |RecipientType         |RecipientName               |Amount |FromAccount   |AccountType       |St2Done  |YourRef       |TheirRef	     |NotifMethod  |NotifValue    |
      |webtest3       |Home@123456 |Bank-approved         |MFC DIVISION OF NEDBANK     |300    |1522117849     |PEAKFULL         |Yes	   |70967680001   |70967680001    |Fax		   |0865948576    |


  @Weeekly_Recurring_Payment_To_MFC_Account_with_End_date
  Scenario Outline: Weekly Recurring  Payment to MFC account With End date
    Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I Navigate to the Pay function
    And I should be able to click on view list icon to access the bank approved beneficiaries. Clicking on it will take to next screen with view all list
    And I should be able to search by name, mobile number or account no. and the records will auto filter based on the characters inputted"<RecipientType>","<RecipientName>"
    And I should be able to select from my list of beneficiaries"<RecipientName>"
    And I should be able to see the next steps header
    And PB_After clicking on Next I should be able to move to the How much would you like to pay screen
    And I want to capture the amount"<Amount>" to pay
    And I should be able to select account"<FromAccount>"
    And I should be able to select the future date
    And I should be able to select repeat payment option"<RuccuringOption>"
    And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
    And I enter Your reference"<YourRef>"
    And I enter Their reference"<TheirRef>"
    And I choose the notification method"<NotifMethod>"
    And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
    And I click on the Next button
    And P_B_I should be able to see Payment from account type"<AccountType>"
    And I_should be able to see payment your reference"<YourRef>"
    And CC_I should be able to click on PAY to confirm the payment
    Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
    And I must be able to the see the recipient details"<RecipientName>"
    And I_must be able to see the amount
    And I_must be able to see Transaction number displayed
    And I_must be able to see the Payment date
    And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

    Examples:
      |NedID	      |Password    |RecipientType         |RecipientName               |Amount |FromAccount    |AccountType        |RuccuringOption|St2Done  |YourRef       |TheirRef	|NotifMethod  |NotifValue    |
      |webtest3       |Home@123456 |Bank-approved         |MFC DIVISION OF NEDBANK     |300    |1522117849     |PEAKFULL           |Weekly         |Yes	     |70967680001   |70967680001    |Fax      |0865948576    |



  @Weekly_Recurring_Payment_To_MFC_Account_with_Occurrences
  Scenario Outline: Weekly Recurring  Payment to MFC account With Occurrences
    Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I Navigate to the Pay function
    And I should be able to click on view list icon to access the bank approved beneficiaries. Clicking on it will take to next screen with view all list
    And I should be able to search by name, mobile number or account no. and the records will auto filter based on the characters inputted"<RecipientType>","<RecipientName>"
    And I should be able to select from my list of beneficiaries"<RecipientName>"
    And I should be able to see the next steps header
    And PB_After clicking on Next I should be able to move to the How much would you like to pay screen
    And PB_I want to capture the amount"<Amount>" to pay
    And PB_I should be able to select account"<FromAccount>"
    And I should be able to select the future date
    And I should be able to select repeat payment option"<RuccuringOption>"
    And I should able to click on Occurrences and enter number of Occurrences"<Occurrences>"
    And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
    And I enter Your reference"<YourRef>"
    And I enter Their reference"<TheirRef>"
    And I choose the notification method"<NotifMethod>"
    And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
    And I click on the Next button
    And P_B_I should be able to see Payment from account type"<AccountType>"
    And I_should be able to see payment your reference"<YourRef>"
    And CC_I should be able to click on PAY to confirm the payment
    Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
    And I must be able to the see the recipient details"<RecipientName>"
    And I_must be able to see the amount
    And I_must be able to see Transaction number displayed
    And I_must be able to see the Payment date
    And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

    Examples:
      |NedID	      |Password    |RecipientType         |RecipientName               |Amount |FromAccount    |AccountType     |RuccuringOption|Occurrences|St2Done  |YourRef       |TheirRef	     |NotifMethod  |NotifValue    |
      |webtest3       |Home@123456 |Bank-approved         |MFC DIVISION OF NEDBANK     |300    |1522117849     |PEAKFULL        |Weekly         |         2 |Yes	  |70967680001   |70967680001    |Fax          |0865948576    |


  @Weeekly_Recurring_Payment_To_MFC_Account_with_End_date
  Scenario Outline: Monthly Recurring  Payment to MFC account With End date
    Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I Navigate to the Pay function
    And I should be able to click on view list icon to access the bank approved beneficiaries. Clicking on it will take to next screen with view all list
    And I should be able to search by name, mobile number or account no. and the records will auto filter based on the characters inputted"<RecipientType>","<RecipientName>"
    And I should be able to select from my list of beneficiaries"<RecipientName>"
    And I should be able to see the next steps header
    And PB_After clicking on Next I should be able to move to the How much would you like to pay screen
    And I want to capture the amount"<Amount>" to pay
    And I should be able to select account"<FromAccount>"
    And I should be able to select the future date
    And I should be able to select repeat payment option"<RuccuringOption>"
    And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
    And I enter Your reference"<YourRef>"
    And I enter Their reference"<TheirRef>"
    And I choose the notification method"<NotifMethod>"
    And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
    And I click on the Next button
    And P_B_I should be able to see Payment from account type"<AccountType>"
    And I_should be able to see payment your reference"<YourRef>"
    And CC_I should be able to click on PAY to confirm the payment
    Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
    And I must be able to the see the recipient details"<RecipientName>"
    And I_must be able to see the amount
    And I_must be able to see Transaction number displayed
    And I_must be able to see the Payment date
    And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

    Examples:
      |NedID	      |Password    |RecipientType         |RecipientName               |Amount |FromAccount    |AccountType       |RuccuringOption|St2Done      |YourRef       |TheirRef	|NotifMethod  |NotifValue    |
      |webtest3       |Home@123456 |Bank-approved         |MFC DIVISION OF NEDBANK     |300    |1522117849     |PEAKFULL          |Monthly         |Yes	     |70967680001   |70967680001    |Fax      |0865948576    |



  @Monthly_Recurring_Payment_To_MFC_Account_with_Occurrences
  Scenario Outline: Monthly Recurring  Payment to MFC account With Occurrences
    Given Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I Navigate to the Pay function
    And I should be able to click on view list icon to access the bank approved beneficiaries. Clicking on it will take to next screen with view all list
    And I should be able to search by name, mobile number or account no. and the records will auto filter based on the characters inputted"<RecipientType>","<RecipientName>"
    And I should be able to select from my list of beneficiaries"<RecipientName>"
    And I should be able to see the next steps header
    And PB_After clicking on Next I should be able to move to the How much would you like to pay screen
    And PB_I want to capture the amount"<Amount>" to pay
    And PB_I should be able to select account"<FromAccount>"
    And I should be able to select the future date
    And I should be able to select repeat payment option"<RuccuringOption>"
    And I should able to click on Occurrences and enter number of Occurrences"<Occurrences>"
    And The next button on this page should be disabled until the user completed all fields"<St2Done>" and there are no errors
    And I enter Your reference"<YourRef>"
    And I enter Their reference"<TheirRef>"
    And I choose the notification method"<NotifMethod>"
    And I enter notification value"<NotifValue>" appropriate to method"<NotifMethod>" chosen
    And I click on the Next button
    And P_B_I should be able to see Payment from account type"<AccountType>"
    And I_should be able to see payment your reference"<YourRef>"
    And CC_I should be able to click on PAY to confirm the payment
    Then CC_I should be able to see a confirmation screen so that I know that the transfer is done
    And I must be able to the see the recipient details"<RecipientName>"
    And I_must be able to see the amount
    And I_must be able to see Transaction number displayed
    And I_must be able to see the Payment date
    And I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment

    Examples:
      |NedID	      |Password    |RecipientType         |RecipientName               |Amount |FromAccount    |AccountType     |RuccuringOption|Occurrences|St2Done  |YourRef       |TheirRef	|NotifMethod  |NotifValue    |
      |webtest3       |Home@123456 |Bank-approved         |MFC DIVISION OF NEDBANK     |300    |1522117849     |PEAKFULL        |Monthly        |         2 |Yes	     |70967680001   |70967680001    |Fax      |0865948576    |
