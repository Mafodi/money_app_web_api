@FND_Prepaids @FNDWebRegression
Feature: Prepaid Purchase

  @PrepaidNotification
  Scenario Outline: Buy Prepaid Airtime With Own Amount and Notification preference set
    Given 	Prepaid_User is navigated to the home page dashboard
    When 	Prepaid_User navigates to Prepaids page
    Then I must be able to capture a recipient name"<RecipientName>"
    And I must be able to capture a cellphone number in the Recipient cellphone number field"<CellphoneNo>"
    And I must be able to select a provider"<Provider>"
    Then Next button must become active and I must be able to select it and continue to the next step
    And I must be able to capture a the type of recharge from a dropdown"<PrepaidType>"
    And I must be able to select the bundle amount"<BundleAmt>"
    Then I should be able to enter the preferred amount "<OwnAmount>"
    Then Next button must become active and I must be able to select it and continue to the next step
    And I must be able to capture a reference - Your Reference"<YourRef>"
    Then I should be able to select the preferred notification method "<NotifMethod>" and capture "<NotifValue>"
    Then Next button must become active and I must be able to select it and continue to the next step
#    And I should be able to see the Review Screen
    And I should be able to click on Buy button to confirm the payment
    Then I should be able to see a confirmation screen so that I know that the purchase is done



    Examples:
      |RecipientName|CellphoneNo|Provider	  |PrepaidType|BundleAmt	|OwnAmount	|Account	  |AccountType|YourRef	|NotifMethod|NotifValue	          |SaveBen|EndPmtChoice|
      |Jzenna	    |0836879512	|MTN		  |Airtime	| Own amount 			|22			|1950479609	  |Mar Properties CC	  |DocJ		|SMS			|0781619503			          |No	  |Done		|
      |Czhris	    |0740033923	|CELL C		  |Airtime	| Own amount 		|13			|			  |			  |Booking	|SMS		|0865948576			  |No	  |Done		|
      |Pzhillip	    |0829988002	|VODACOM		  |Airtime	| Own amount 			|14			|1950479609	  |Mar Properties CC	  |DocJ		|Email			|pmakhate@nedbank.org		          |No	  |Done		|
      |Mzatume	    |0815793852	|TELKOM MOBILE		  |Airtime	| Own amount 		|15			|			  |			  |Booking	|SMS		|0865948576			  |No	  |Done		|

