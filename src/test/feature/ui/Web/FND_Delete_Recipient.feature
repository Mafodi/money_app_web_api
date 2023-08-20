@WebRegression @FNDRecipient @FNDWeb @FNDDeleteRecipient
Feature: Delete Recipient

  @FND_RecipientDeleteOwnDefinedBankRecipPositive	@RT
  Scenario Outline: Recipient Delete Bank Recipient Positive
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I can select the Recipients service from the menu bar present at the top of my WEB login view
    And I should be able to select the Add a new recipient service link
    And Enter Editable Text field with Label Recipient Name"<RecipientName>"
    And Click Button with label Add Email
    And Enter editable text field with the label Email address"<EmailAddress>" for adding the recipient email address
    And Click Button with label Add cell phone number
    And Enter editable numeric field with the label Cell Phone Number"<CellphoneNo>" for adding the recipient cell phone number
    And Click Button with label Add fax number
    And Enter Editable numeric field with the label Fax Number for adding the recipient fax number"<FaxNumber>"
    And Click Button with label Add Bank Accounts
    And Enter editable drop down field with label Bank"<Bank1>" and I should be able to select one of the listed banks to add the bank account
    And Enter editable numeric field with the label Account number"<AccNo1>" for adding the recipients Bank Account Details
    And Enter editable alphanumeric field with the label Your reference"<MyRef1>"
    And Enter Editable Text field with Label Their Reference"<TheirRef1>"
    And I should be able to select the Save button on providing all mandatory fields.
    Then On selecting the Save button I should get a failure or success message
    And On selecting the Save button in success scenario The ApproveIT service must be invoked once the SAVE button is pressed I should be presented with the success message which reads 'Recipient has been saved successfully' on the right indented section
    And Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Add Recipient action in the previous step before selecting the save button for add recipient"<AccNo1>"
    And Click on edit or add details label to edit the recipient
    And I should be able to click on the delete button to delete the recipient both in the page and the popup.
    Then On selecting the delete button i should get a success message that the recipient was deleted successfully.

    Examples:
      |NedID	  |Password	        |RecipientName			|EmailAddress		  |EmailDel	|CellphoneNo|CellDel|FaxNumber	|FaxDel	|Bank1							|AccNo1			|AccType1	|BranchNameCode1	|MyRef1							|TheirRef1					|BankDel1	|Bank2							|AccNo2			|AccType2	|BranchNameCode2|MyRef2							|TheirRef2					|BankDel2	|
#|webtest3 |Test11!@!!	    |Dr Ssb	                |seansn@nedbank.co.za |			|0827236901	|		|0865948576	|		|STANDARD BANK OF SOUTH	        |2887967234		|Current	|	                |Dr Zwonikoff - Misti			|28624						|			|								|				|			|				|								|							|			|
      |Kenneth2020 |Testing23@!@		|Apollo bank recipient  |seansn@nedbank.co.za |			|0827236901	|		|0865948576	|		|ABSA BANK						|4048654930		|Current	|					|Geyser element replaced		|Snyman element				|			|								|				|			|				|								|							|			|
#|webtest3 |Test11!@!!	    |Alida Taylor (Art)		|seansn@nedbank.co.za |			|0827236901	|		|0865948576	|		|NEDBANK						|1009520237		|Current	|					|Alida (Chris Art lessons)		|Christopher Snyman			|			|								|				|			|				|								|							|			|
#|webtest2 |Testing23@!@	    |Basani (Perfumes)		|seansn@nedbank.co.za |			|0827236901	|		|0865948576	|		|FIRST NATIONAL BANK			|62509282167	|Current	| 			        |Basani (perfume gift for Misti	|Sean Snyman - perfume gift	|			|								|				|			|				|								|							|			|
#|webtest2 |Testing23@!@	    |BondPaymnt				|seansn@nedbank.co.za |			|0827236901	|		|0865948576	|		|NEDBANK - PEOPLES MORTGAGE LTD	|8264898900101	|Current	|					|BondAcc						|1 Thornhill Rd-Snymn		|			|								|				|			|				|								|							|			|
#|webtest2 |Testing23@!@	    |Dr Robbertze			|seansn@nedbank.co.za |			|0827236901	|		|0865948576	|		|INVESTEC BANK LIMITED			|10011290414	|Current	|					|Dr Robbertze - Misti op o/s	|1502251349_MC Snyman		|			|								|				|			|				|								|							|			|


  @FND_RecipientDeleteOwnDefinedMobileRecipPositive		@smoke	@RT
  Scenario Outline: Recipient Delete Mobile Recipient Positive
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I can select the Recipients service from the menu bar present at the top of my WEB login view
    And I should be able to select the Add a new recipient service link
    And Enter Editable Text field with Label Recipient Name"<RecipientName>"
    And Click Button with label Add Email
    And Enter editable text field with the label Email address"<EmailAddress>" for adding the recipient email address
    And Click Button with label Add cell phone number
    And Enter editable numeric field with the label Cell Phone Number"<CellphoneNo>" for adding the recipient cell phone number
    And Click Button with label Add fax number
    And Enter Editable numeric field with the label Fax Number for adding the recipient fax number"<FaxNumber>"
    And Click Button with the label Cellphone Number
    And Enter editable numeric field with the label Cellphone Number"<CellNo1>" for adding the recipient prepaid cell number
    And Enter editable alphanumeric field with the label Your reference for mobile recipient"<MyRef1>"
    And I should be able to select the Save button on providing all mandatory fields.
    Then On selecting the Save button I should get a failure or success message
    And On selecting the Save button in success scenario The ApproveIT service must be invoked once the SAVE button is pressed I should be presented with the success message which reads 'Recipient has been saved successfully' on the right indented section
    And Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Add Recipient action in the previous step before selecting the save button for add recipient"<CellphoneNo>"
    And Click on edit or add details label to edit the recipient
    And I should be able to click on the delete button to delete the recipient both in the page and the popup.
    Then On selecting the delete button i should get a success message that the recipient was deleted successfully.

    Examples:
      |NedID		|Password	|RecipientName		|EmailAddress			|EmailDel	|CellphoneNo|CellDel|FaxNumber	|FaxDel	|CellNo1	|MyRef1				|MobDel1|CellNo2	|MyRef2				|MobDel2|
      |Kenneth2020	|Testing23@!@	|Lecton mobile reci	|Lecton1234@gmail.com	|Yes		|0848766923	|		|0848766923	|		|0848766923	|Lecton - Gardening	|		|0738338266	|Lecton - Gardening2|Yes	|


  @FND_RecipientDeleteOwnDefinedElectricityRecipPositive		@smoke	@RT   @RecipientAddOwnDefinedElectricityRecipPositiveSmoke
  Scenario Outline: Recipient Delete Electricity Recipient Positive
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I can select the Recipients service from the menu bar present at the top of my WEB login view
    And I should be able to select the Add a new recipient service link
    And Enter Editable Text field with Label Recipient Name"<RecipientName>"
    And Click Button with label Add Email
    And Enter editable text field with the label Email address"<EmailAddress>" for adding the recipient email address
    And Click Button with label Add cell phone number
    And Enter editable numeric field with the label Cell Phone Number"<CellphoneNo>" for adding the recipient cell phone number
    And Click Button with label Add fax number
    And Enter Editable numeric field with the label Fax Number for adding the recipient fax number"<FaxNumber>"
    And Click Button with the label Add meter number
    And Enter editable numeric field with the label Meter Number"<MeterNumber1>" for adding the recipient electricity meter number
    And Enter editable numeric field with the label Your Reference"<MyMeterReference1>" for adding the recipient electricity meter number
    And I should be able to select the Save button on providing all mandatory fields.
    Then On selecting the Save button I should get a failure or success message
    And On selecting the Save button in success scenario The ApproveIT service must be invoked once the SAVE button is pressed I should be presented with the success message which reads 'Recipient has been saved successfully' on the right indented section
    And Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Add Recipient action in the previous step before selecting the save button for add recipient meter no"<MeterNumber1>"
    And Click on edit or add details label to edit the recipient
    And I should be able to click on the delete button to delete the recipient both in the page and the popup.
    Then On selecting the delete button i should get a success message that the recipient was deleted successfully.

    Examples:
      |NedID		|Password	|RecipientName		|EmailAddress			|EmailDel	|CellphoneNo|CellDel|FaxNumber	|FaxDel	|MeterNumber1	|MyMeterReference1	|ElecDel1	|MeterNumber2	|MyMeterReference2	|ElecDel2	|
      |Kenneth2020	|Testing23@!@	|ssb electric meter	|seansn@nedbank.co.za	|Yes		|0848766923	|		|0848766923	|		|01050020017	|Snyman house elec	|			|01050020017	|Ward house elec	|			|


  @FND_RecipientDeleteOwnDefinedCreditcardRecipPositive	@RT
  Scenario Outline: Recipient Delete Credit Card Recipient Positive
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I can select the Recipients service from the menu bar present at the top of my WEB login view
    And I should be able to select the Add a new recipient service link
    And Enter Editable Text field with Label Recipient Name"<RecipientName>"
    And Click Button with label Add Email
    And Enter editable text field with the label Email address"<EmailAddress>" for adding the recipient email address
    And Click Button with label Add cell phone number
    And Enter editable numeric field with the label Cell Phone Number"<CellphoneNo>" for adding the recipient cell phone number
    And Click Button with label Add fax number
    And Enter Editable numeric field with the label Fax Number for adding the recipient fax number"<FaxNumber>"
    And Click Button with the label Add credit card
    And Enter editable numeric field with the label Credit card Number"<CreditCardNumber1>" for adding the credit card number
    And Enter editable field with the label Your Reference"<MyRef1>" for adding the Credit card recipient My reference
    And Enter editable field with the label Their Reference"<TheirRef1>" for adding the Credit card recipient Their reference
    And I should be able to select the Save button on providing all mandatory fields.
    Then On selecting the Save button I should get a failure or success message
    And On selecting the Save button in success scenario The ApproveIT service must be invoked once the SAVE button is pressed I should be presented with the success message which reads 'Recipient has been saved successfully' on the right indented section
    And Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Add Recipient action in the previous step before selecting the save button for add recipient for credit card"<CreditCardNumber1>"
    And Click on edit or add details label to edit the recipient
    And I should be able to click on the delete button to delete the recipient both in the page and the popup.
    Then On selecting the delete button i should get a success message that the recipient was deleted successfully.

    Examples:
      |NedID		|Password	|RecipientName			|EmailAddress			|EmailDel	|CellphoneNo|CellDel|FaxNumber	|FaxDel	|CreditCardNumber1	|MyRef1							|TheirRef1					|CCDel1	|CreditCardNumber2	|MyRef2							|TheirRef2					|CCDel2	|
      |Kenneth2020	|Testing23@!@	|Jed Ward credit card   |seansn@nedbank.co.za	|Yes		|0827236901	|		|0865948576	|		|4790125004087616	|Jed - supper contribution amts	|Snyman supper contbn		|		|					|								|							|		|
#|webtest2	|Testing23@!@	|Sean Snyman-Music		|seansn@nedbank.co.za	|			|			|		|			|		|5587470000000278	|Sean Sny-Piano/Keys/Composing	|Band payment				|		|5587470000282843	|Sean Dr Card					|Music services				|Yes	|

