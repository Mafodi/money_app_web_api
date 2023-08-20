@FND_Prepaids @FNDWebeeee
Feature: Reccuring  Monthly Prepaid purchase


  @PrepaidData
  Scenario Outline: Buy Prepaid Data
    Given 	Prepaid_User is navigated to the home page dashboard
    When 	Prepaid_User navigates to Prepaids page
    Then I must be able to capture a recipient name"<RecipientName>"
    And I must be able to capture a cellphone number in the Recipient cellphone number field"<CellphoneNo>"
    And I must be able to select a provider"<Provider>"
    Then Next button must become active and I must be able to select it and continue to the next step
    And I must be able to capture a the type of recharge from a dropdown"<PrepaidType>"
    And I must be able to select the bundle amount"<BundleAmt>"
    When I select the preferred prepaid date "<PrepaidsDate>"
    And I must be able to select the preferred frequency Monthly "<RepeatMethod>"
    And I must be able to enter the  occurrence number "<Occurrence>"
    Then Next button must become active and I must be able to select it and continue to the next step
    And I must be able to capture a reference - Your Reference"<YourRef>"
    Then Next button must become active and I must be able to select it and continue to the next step
#    And I should be able to see the Review Screen
    And I should be able to click on Buy button to confirm the payment
    Then I should be able to see a confirmation screen so that I know that the purchase is done



    Examples:
      |RecipientName|CellphoneNo|Provider	  |PrepaidType|BundleAmt	|YourRef	|PrepaidsDate|RepeatMethod|Occurrence|
      |Jennas	    |0836879512	|MTN		  |Data	|29			|DocJ		|Saturday, 29 February 2020                                                |Weekly  |5    |
      |Chriss	    |0740033923	|CELL C		  |Data	|29		|Booking	|Saturday, 29 February 2020                                                |Weekly  |5    |
      |Phillips	    |0829988002	|VODACOM		  |Data	|29			|DocJ		|Saturday, 29 February 2020                                                |Weekly  |5    |
      |Matumess	    |0815793852	|TELKOM MOBILE		  |Data	|100		|Booking	|Saturday, 29 February 2020                                                |Weekly  |5    |
      |Matumes	    |0815793852	|TELKOM MOBILE		  |FreeMe DATA	|100		|Booking	|Saturday, 29 February 2020                                                |Weekly  |5    |


