@regression @FNDcards @FNDWebRegression
Feature: cards
﻿
@TapAndGoToggle	@RT
Scenario Outline: TapNGo ONOFF
Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I select the Cards menu option
When I select a card account to view or action on"<CardNameNo>"
And I can view the feature Use tap and go toggle switch on the card services menu
And I can select to switch ON or OFF the "Use tap and go" feature to enable or disable this feature on my card"<OnOff>"
Then The client is informed about the implications of enabling or disabling the contactless feature on the card"<OnOff>"
And I can submit the request for switching ON or OFF "Use tap and go" feature
Then The toggle switch for "Use tap and go" feature is switched ON or OFF"<OnOff>"

Examples:
|NedID		    |Password	    |CardNameNo		  |OnOff|
|Kenneth2020	|Testing23@!@	|5412********2794 |Off	|
#|webtest1	    |Test11#@#	    |5412********2794 |On	|
#|webtest1	    |Test11#@#	    |4923********3524 |Off	|
#|webtest1	    |Test11#@#	    |4923********3524 |On	|
#|webtest2	    |Test11@!@	    |<Active>		  |Off	|
#|webtest2	    |Test11@!@	    |<Active>		  |On	|


  @OnlinePurchaseToggle	@RT
  Scenario Outline: Online Purchase ONOFF
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    And I select the Cards menu option
    When I select a card account to view or action on"<CardNameNo>"
    And I can view the feature Online purchase toggle switch on the card services menu
    And I can select to switch ON or OFF the online purchase feature to enable or disable this feature on my card
    Then The client is informed about the implications of enabling or disabling online purchase on the card
    And I can submit the request for enabling or disabling the online purchase toggle feature
    And I can view the success message 'Online purchases are activated' or 'Online purchases are deactivated'

    Examples:
      |NedID		|Password	    |CardNameNo		  |OnOff|
      |Kenneth2020	|Testing23@!@	|4923********3524 |On	|
     # |webtest1	    |Test11#@#	|4923********3524 |Off	|
#|webtest1	|Test11#@#	|5412********2794 |On   |
#|webtest1	|Test11#@#	|5412********2794 |Off	|
#|webtest2	|Test11@!@	|<Active>				|On		|
#|webtest2	|Test11@!@	|<Active>				|Off	|

  @UseCardOverseas	@RT
  Scenario Outline: Use card overseas ONOFF
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    And I select the Cards menu option
    When I select a card account to view or action on"<CardNameNo>"
    And I can view the feature Online use card overseas on the card services menu and can click on it
    And I can select the card from the list and should be able to click on next
    Then I should be able to select the start and end travel date and click on next
    And I can submit the countries I am travelling to and should be able to select next
    And I should be able to fill the contact details "<email address>" and contact details while overseas "<overseas contact>" and should be able to click next
    And I should be able to submit it after reviewing the information

    Examples:
      |NedID		|Password	    |CardNameNo		  |OnOff|email address|overseas contact|
      |Kenneth2020	|Testing23@!@	|4923********3524 |On	|abc@gmail.com|+917876547867   |
     #|webtest1	    |Test11#@#	    |4923********3524 |Off	|             |                |
     #|webtest1	    |Test11#@#	    |5412********2794 |On   |             |                |
     #|webtest1	    |Test11#@#	    |5412********2794 |Off	|             |                |
     #|webtest2	    |Test11@!@	    |<Active>		  |On	|             |                |
     #|webtest2	    |Test11@!@	    |<Active>		  |Off	|             |                |

  @ChangeATMLimit	@RT
  Scenario Outline: Change of ATM limit
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    And I select the Cards menu option
    When I select a card account to view or action on"<CardNameNo>"
    And I can view the feature update ATM limits on the card services menu and can click on it
    And I can can change the ATM limit by sliding the slider to another value and the numeric value should be updated on the left
    Then I should be able to click on the change limit button
    And I should get a success message and i should be able to click on the done button

    Examples:
      |NedID		|Password	    |CardNameNo		  |
      |Kenneth2020	|Testing23@!@	|4923********3524 |
     #|webtest1	    |Test11#@#	    |4923********3524 |
     #|webtest1	    |Test11#@#	    |5412********2794 |
     #|webtest1	    |Test11#@#	    |5412********2794 |
     #|webtest2	    |Test11@!@	    |<Active>		  |
     #|webtest2	    |Test11@!@	    |<Active>		  |

  @FreezeCardToggle	@RT
  Scenario Outline: FreezeCard ONOFF
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    And I select the Cards menu option
    When I select a card account to view or action on"<CardNameNo>"
    And I can view the feature Freeze card toggle switch on the card services menu
    And I can select to switch ON or OFF the Freeze card feature to enable or disable this feature on my card
    Then The client is informed about the implications of freezing or unfreezing the card
    And I can submit the request for switching ON or OFF "Freeze card" feature
    And I can view the success message 'Un-freezeds card successful' or 'Card frozen successfully'

    Examples:
      |NedID		|Password	    |CardNameNo		  |OnOff|
      |Kenneth2020	|Testing23@!@	|4923********3524 |On	|
     # |webtest1	|Test11#@#	    |4923********3524 |Off	|
     #|webtest1	    |Test11#@#	    |5412********2794 |On   |
     #|webtest1	    |Test11#@#	    |5412********2794 |Off	|
     #|webtest2	    |Test11@!@	    |<Active>		  |On	|
     #|webtest2	    |Test11@!@	    |<Active>		  |Off	|