@FND_Prepaids @FNDWebRegression2
Feature: Prepaid Purchase


  @PrepaidSMS
  Scenario Outline: Buy Prepaid SMS
    Given 	Prepaid_User is navigated to the home page dashboard
    When 	Prepaid_User navigates to Prepaids page
    Then I must be able to capture a recipient name"<RecipientName>"
    And I must be able to capture a cellphone number in the Recipient cellphone number field"<CellphoneNo>"
    And I must be able to select a provider"<Provider>"
    Then Next button must become active and I must be able to select it and continue to the next step
    And I must be able to capture a the type of recharge from a dropdown"<PrepaidType>"
    And I must be able to select the bundle amount"<BundleAmt>"
    Then Next button must become active and I must be able to select it and continue to the next step
    And I must be able to capture a reference - Your Reference"<YourRef>"
    Then Next button must become active and I must be able to select it and continue to the next step
    And I should be able to see the Review Screen
    And I should be able to click on Buy button to confirm the payment
    Then I should be able to see a confirmation screen so that I know that the purchase is done



    Examples:
      |RecipientName|CellphoneNo|Provider	  |PrepaidType|BundleAmt	|YourRef	|
      |Jenna	    |0836879512	|MTN		  |SMS	|17			  |DocJ		|
      |Chris	    |0740033923	|CELL C		  |SMS	|30	 |	Booking	|
      |Phillip	    |0829988002	|VODACOM		  |SMS	|25			|DocJ		|


