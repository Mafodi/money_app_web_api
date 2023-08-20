@WebRegression @FNDRecipient @FNDWeb
Feature: Edit Recipient

  @FND_RecipientEditOwnDefinedBankRecipPositive	@RT
  Scenario Outline: Recipient Edit Bank Recipient Positive
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I can select the Recipients service from the menu bar present at the top of my WEB login view
    And I should be able to search a Bank Recipient by entering the recipient name in the editable text field"<RecipientName>"
    And Click on the recipient name to open up it's details
    And Click on edit or add details label to edit the recipient
    And Clear the editable email text field and put another email"<EmailAddress>"
    And Clear the editable cellphone no field and put another cellphone no"<CellphoneNo>"
    And Clear the editable fax no field and put another fax no"<FaxNumber>"
    And Clear the bank field and put another bank"<Bank1>"
    And I should be able to clear the account no field and put another account no"<AccNo1>"
    And the your reference field should be cleared and put another reference"<MyRef1>"
    And I should be able to clear the their reference field and put another reference"<TheirRef1>"
    And I should be able to select the Save Changes button on providing all mandatory fields.
    Then On selecting the Save button I should get a failure or success message for edit recipient
    And Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Edit Recipient action in the previous step before selecting the save button"<AccNo1>"

    Examples:
       |NedID	          |Password	        |RecipientName			       |EmailAddress		  |EmailDel	|CellphoneNo|CellDel|FaxNumber	|FaxDel	|Bank1							|AccNo1			|AccType1	|BranchNameCode1	|MyRef1							|TheirRef1					|BankDel1	|Bank2							|AccNo2			|AccType2	|BranchNameCode2|MyRef2							|TheirRef2					|BankDel2	|
       |marcel.status2019 |Testing02!	    |Apollo bank recipient         |abcd@nedbank.co.za   |			|0829988002	|		|0865948234	|		|INVESTEC BANK LIMITED			|10011290414	|Current	|					|Dr Robbertze - Misti op o/s	|1502251349_MC Snyman		|			|								|				|			|				|								|							|			|


  @FND_RecipientEditOwnDefinedMobileRecipPositive	@RT
  Scenario Outline: Recipient Edit Mobile Recipient Positive
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I can select the Recipients service from the menu bar present at the top of my WEB login view
    And I should be able to search a Mobile Recipient by entering the recipient name in the editable text field"<RecipientName>"
    And Click on the recipient name to open up it's details
    And Click on edit or add details label to edit the recipient
    And Clear the editable email text field and put another email"<EmailAddress>"
    And Clear the editable cellphone no field and put another cellphone no"<CellphoneNo>"
    And Clear the editable fax no field and put another fax no"<FaxNumber>"
    And Clear the cellphone number field and put another cellphone no to which payment is to be done"<CellphoneNo>"
    And the your reference field should be cleared and put another reference for edit mobile no"<MyRef1>"
    And I should be able to select the Save Changes button on providing all mandatory fields.
    Then On selecting the Save button I should get a failure or success message for edit recipient
    And Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Edit Recipient action in the previous step before selecting the save button for mobile recipient"<CellphoneNo>"

    Examples:
      |NedID	         |Password	       |RecipientName			|EmailAddress		  |EmailDel	|CellphoneNo|CellDel|FaxNumber	|FaxDel	|Bank1							|AccNo1			|AccType1	|BranchNameCode1	|MyRef1							|TheirRef1					|BankDel1	|Bank2							|AccNo2			|AccType2	|BranchNameCode2|MyRef2							|TheirRef2					|BankDel2	|
      |marcel.status2019 |Testing02!	    |Apollo Mobile Recipient|abcd@nedbank.co.za   |			|0829988002	|		|0865948234	|		|INVESTEC BANK LIMITED			|10011290414	|Current	|					|Dr Robbertze - Misti op o/s	|1502251349_MC Snyman		|			|								|				|			|				|								|							|			|


  @FND_RecipientEditOwnDefinedElectricityRecipPositive	@RT
  Scenario Outline: Recipient Edit Electricity Recipient Positive
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I can select the Recipients service from the menu bar present at the top of my WEB login view
    And I should be able to search a Electricity Recipient by entering the recipient name in the editable text field"<RecipientName>"
    And Click on the recipient name to open up it's details electric meter
    And Click on edit or add details label to edit the recipient
    And Clear the editable email text field and put another email"<EmailAddress>"
    And Clear the editable cellphone no field and put another cellphone no"<CellphoneNo>"
    And Clear the editable fax no field and put another fax no"<FaxNumber>"
    And Clear the electricity meter number field and put another meter no to which payment is to be done"<MeterNumber1>"
    And I should be able to select the Save Changes button on providing all mandatory fields.
    Then On selecting the Save button I should get a failure or success message for edit recipient
    And Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Edit Recipient action in the previous step before selecting the save button for electricity recipient"<MeterNumber1>"

    Examples:
      |NedID		        |Password	|RecipientName		|EmailAddress			|EmailDel	|CellphoneNo|CellDel|FaxNumber	|FaxDel	|MeterNumber1	|MyMeterReference1	|ElecDel1	|MeterNumber2	|MyMeterReference2	|ElecDel2	|
      |marcel.status2019    |Testing02!	|ssb electric meter	|seansn@nedbank.co.za	|Yes		|0848766923	|		|0848766923	|		|01050020017	|Snyman house elec	|			|01050020017	|Ward house elec	|			|
