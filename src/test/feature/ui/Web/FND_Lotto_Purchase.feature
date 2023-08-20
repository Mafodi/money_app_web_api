@regression @FNDRegression @BuyLotto
Feature: Buy Lotto

  @BuyLottoPickNumbersPositive	@RT
  Scenario Outline: Buy Lotto Pick Numbers Positive
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I navigate to the Buy-Lotto function
    And I can see the next draw date and time
    And When I select View jackpots I can see the jackpot details pick nos"<GameType>"
    And I can select the pick numbers from the select method drop down and click on next
    And I can select numbers for the boards and can add more boards
    And I can increase my chances of winning by selecting to add LOTTO Plus One
    And I can increase my chances of winning by selecting to add LOTTO Plus Two
    And I can remove my chances of winning by de-selecting LOTTO Plus One option
    And I can remove my chances of winning by de-selecting LOTTO Plus Two option
    And I can view and select number of draws"<NoDraws>"
    And I can see the total cost of my LOTTO ticket
    And If I have selected SMS option cellphone number must be auto populated with the number on my profile"<NotifMethod>"
    And As a user I want to see my purchase details so that I can buy the ticket"<GameType>","<BoardANumbers>"
    And Terms and conditions must be a hyperlink to the terms and conditions which must display in a new browser window if clicked
    And I should be able to click on Buy button to confirm the payment
    Then LOT_I should be able to see a confirmation screen so that I know that the purchase is done
    And As a user I want to see a confirmation of my purchase details so that I know my purchase is completed"<GameType>"
    And I can click on Go to overview and move to the Overview page or I can click on the Play again button to make another LOTTO purchase"<EndPmtChoice>"

    Examples:
      |NedID		 |Password	    |GameType	|ViewJackpot|PlayMethod	|BoardANumbers	|BoardBNumbers	|AddBrd	|BoardCNumbers	|LP1|LP2|NoLP1	|NoLP2	|NoDraws|Account	|FromAccType		|YourRef|NotifMethod|NotifValue				|VwTerms|PrtPmtPrf	|EndPmtChoice|
      |Kenneth2020 |Testing23@!@	|LOTTO		|Yes		|Quick Pick	|5				|				|		|				|Yes|Yes|		|Yes	|2 draws|1950479609	|J-Mar Properties CC|		|Email		|seansn@nedbank.co.za	|No		|			|New		|
   #|Test@5799	 |Test11@!@	    |LOTTO		|			|Quick Pick	|3				|				|		|				|Yes|Yes|Yes	|		|7 draws|1522117849	|Current			|DocJ	|SMS		|0827236901				|Yes	|			|Overview	|


  @BuyPowerballPickNumbersPositive	@RT
  Scenario Outline: Buy Powerball Pick Numbers Positive
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I navigate to the Buy-Lotto function
    And I can see the next draw date and time
    And i select the powerball option
    And When I select View jackpots I can see the jackpot details pick nos"<GameType>"
    And I can select the pick numbers from the select method drop down and click on next
    And I can select numbers for the boards and can add more boards for powerball
    And I can increase my chances of winning by selecting to add LOTTO Plus One
    And I can remove my chances of winning by de-selecting LOTTO Plus Two option
    And I can view and select number of draws"<NoDraws>"
    And I can see the total cost of my LOTTO ticket
    And If I have selected SMS option cellphone number must be auto populated with the number on my profile"<NotifMethod>"
    And As a user I want to see my purchase details so that I can buy the ticket"<GameType>","<BoardANumbers>"
    And Terms and conditions must be a hyperlink to the terms and conditions which must display in a new browser window if clicked
    And I should be able to click on Buy button to confirm the payment
    Then LOT_I should be able to see a confirmation screen so that I know that the purchase is done
    And As a user I want to see a confirmation of my purchase details so that I know my purchase is completed"<GameType>"
    And I can click on Go to overview and move to the Overview page or I can click on the Play again button to make another LOTTO purchase"<EndPmtChoice>"

    Examples:
      |NedID		 |Password	    |GameType	|ViewJackpot|PlayMethod	|BoardANumbers	|BoardBNumbers	|AddBrd	|BoardCNumbers	|LP1|LP2|NoLP1	|NoLP2	|NoDraws|Account	|FromAccType		|YourRef|NotifMethod|NotifValue				|VwTerms|PrtPmtPrf	|EndPmtChoice|
      |Kenneth2020 |Testing23@!@	|LOTTO		|Yes		|Quick Pick	|5				|				|		|				|Yes|Yes|		|Yes	|2 draws|1950479609	|J-Mar Properties CC|		|Email		|seansn@nedbank.co.za	|No		|			|New		|
   #|Test@5799	 |Test11@!@	    |LOTTO		|			|Quick Pick	|3				|				|		|				|Yes|Yes|Yes	|		|7 draws|1522117849	|Current			|DocJ	|SMS		|0827236901				|Yes	|			|Overview	|


  @BuyLottoQuickPickPositive	@RT
  Scenario Outline: Buy Lotto Quick Pick Lotto Positive
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I navigate to the Buy-Lotto function
    And I can see the next draw date and time
    And When I select View jackpots I can see the jackpot details"<GameType>"
    And I can select number of boards"<BoardANumbers>"
    And I can increase my chances of winning by selecting to add LOTTO Plus One
    And I can increase my chances of winning by selecting to add LOTTO Plus Two
    And I can remove my chances of winning by de-selecting LOTTO Plus One option
    And I can remove my chances of winning by de-selecting LOTTO Plus Two option
    And I can view and select number of draws"<NoDraws>"
    And I can see the total cost of my LOTTO ticket
    And If I have selected SMS option cellphone number must be auto populated with the number on my profile"<NotifMethod>"
    And As a user I want to see my purchase details so that I can buy the ticket"<GameType>","<BoardANumbers>"
    And Terms and conditions must be a hyperlink to the terms and conditions which must display in a new browser window if clicked
    And I should be able to click on Buy button to confirm the payment
    Then LOT_I should be able to see a confirmation screen so that I know that the purchase is done
    And As a user I want to see a confirmation of my purchase details so that I know my purchase is completed"<GameType>"
    And I can click on Go to overview and move to the Overview page or I can click on the Play again button to make another LOTTO purchase"<EndPmtChoice>"

    Examples:
      |NedID		 |Password	    |GameType	|ViewJackpot|PlayMethod	|BoardANumbers	|BoardBNumbers	|AddBrd	|BoardCNumbers	|LP1|LP2|NoLP1	|NoLP2	|NoDraws|Account	|FromAccType		|YourRef|NotifMethod|NotifValue				|VwTerms|PrtPmtPrf	|EndPmtChoice|
      |Kenneth2020 |Testing23@!@	|LOTTO		|Yes		|Quick Pick	|5				|				|		|				|Yes|Yes|		|Yes	|2 draws|1950479609	|J-Mar Properties CC|		|Email		|seansn@nedbank.co.za	|No		|			|New		|
#|Test@5799	 |Test11@!@	    |LOTTO		|			|Quick Pick	|3				|				|		|				|Yes|Yes|Yes	|		|7 draws|1522117849	|Current			|DocJ	|SMS		|0827236901				|Yes	|			|Overview	|


  @BuyPowerballQuickPickPositive	@RT
  Scenario Outline: Buy Powerball Quick Pick Positive
    Given Rec_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    When I navigate to the Buy-Lotto function
    And I can see the next draw date and time
    And i select the powerball option
    And When I select View jackpots I can see the jackpot details"<GameType>"
    And I can select number of boards"<BoardANumbers>"
    And I can increase my chances of winning by selecting to add LOTTO Plus One
    And I can remove my chances of winning by de-selecting LOTTO Plus Two option
    And I can view and select number of draws"<NoDraws>"
    And I can see the total cost of my LOTTO ticket
    And If I have selected SMS option cellphone number must be auto populated with the number on my profile"<NotifMethod>"
    And As a user I want to see my purchase details so that I can buy the ticket"<GameType>","<BoardANumbers>"
    And Terms and conditions must be a hyperlink to the terms and conditions which must display in a new browser window if clicked
    And I should be able to click on Buy button to confirm the payment
    Then LOT_I should be able to see a confirmation screen so that I know that the purchase is done
    And As a user I want to see a confirmation of my purchase details so that I know my purchase is completed"<GameType>"
    And I can click on Go to overview and move to the Overview page or I can click on the Play again button to make another LOTTO purchase"<EndPmtChoice>"

    Examples:
      |NedID		    |Password	    |GameType	|ViewJackpot|PlayMethod	|BoardANumbers	|BoardBNumbers	|AddBrd	|BoardCNumbers	|LP1|LP2|NoLP1	|NoLP2	|NoDraws|Account	|FromAccType		|YourRef|NotifMethod|NotifValue				|VwTerms|PrtPmtPrf	|EndPmtChoice|
      |Kenneth2020	|Testing23@!@	|PowerBall	|Yes		|Quick Pick	|4				|				|		|				|Yes|	|		|		|2 draws|1950479609	|J-Mar Properties CC|DocJ	|Email		|seansn@nedbank.co.za	|No		|			|New		|
#|webtest3	    |Test11!@!!	    |PowerBall	|			|Quick Pick |2				|				|		|				|Yes|	|Yes	|		|7 draws|1522117849	|Current			|		|SMS		|0827236901				|Yes	|			|Overview	|

