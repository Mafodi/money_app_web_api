@regression
Feature: Lotto History

@ViewLottoPallette	@RT @smoke  @ViewLottoPalletteSmoke
Scenario Outline: View Lotto Pallet
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I should be presented with the LOTTO canvas
Then Title with the label LOTTO
And The last three LOTTO purchase in the last ninety days should be presented as pallets with in the LOTTO canvas
And The three LOTTO purchase pallet should be sorted based on date of purchase with the latest purchase being the top most item
And Each pallet has the following fields in them - date of purchase in dd/mm/yyyy format AND LOTTO game name AND Purchase value
And Select-able link with the label 'View more tickets' at the bottom of the canvas

Examples:
|NedID		|Password	|
|webtest2	|Testing23@!@	|
#|webtest3	|?	        |

#MON-235	View LOTTO ticket Details – WEB
#As a user I should be able to view the details of the selected game from my Play History
#
#Acceptance Criteria –
#As a user I verify that :
#1.On selecting one of the history item from the View LOTTO pallet - WEB or from View LOTTO purchase history table - WEB, I should be directed to a new page
#2.The new page should have the following sections / canvas.
# i. Ticket Information
# ii. Boards
# iii. Replay button
#3.The page should be titled LOTTO purchase details
#4.Back button before the title LOTTO purchase details. On selecting the back button, I should be either directed to the View LOTTO / PowerBall history list - WEB page / screen or View LOTTO pallet - WEB page or screen based on the entry is from.
#5.The Ticket information section / canvas should have the following fields and controls.
# i. Non editable text field with the label Description. The Description is auto populated with the game name. The game name should be one of the below values.
# a. LOTTO Quickpick or LOTTO Pick own numbers if the user has played LOTTO alone
# b. LOTTO PLUS 1 Quickpick or LOTTO PLUS 1 Pick own numbers if the user has played LOTTO & LOTTO PLUS 1 alone
# c. LOTTO PLUS 2 Quickpick or LOTTO PLUS 2 Pick own numbers if the user has played LOTTO, LOTTO PLUS 1 & LOTTO PLUS 2.
# ii. Non editable text field with the label From account. The From account is auto populated with the account used for the purchase. The From account should be in the format <<account type>> - <<account number>>. The <<account type>> examples are CC for Credit Card, CA for Current Account, SA for Saving Account
# iii. Non editable text field with the label Draw numbers. The Draw numbers is auto populated with the draw numbers based on the number of draws for that purchase. If single draw purchase the format is #<<draw number>>. If multi draw purchase the format is #<<draw number>> to #<<draw number>>
# iv. Non editable text field with the label Number of draws. The Number of draws is auto populated with the number of draws for the purchase.
# v. Non editable text field with the label Purchase date. The Purchase date is auto populated with the date of purchase and time of purchase in the format <<dd/mm/yyyy hh:mm>>. The time is a 24 hour clock.
# vi. Non editable text field with the label Cost. The Cost is auto populated with the purchase value for the purchase.
# vii. Non editable text field with the label Number of boards. The Number of boards is auto populated with the number of boards for the purchase
# viii. Non editable text field with the label Purchase reference number. The Purchase reference number is auto populated with the Reference number for the purchase
#6.The Boards should have the following fields and controls
# i. Each board is represented with label A to T based on the boards from the purchase history.
# ii. Each board should have the color code applied on the 6 balls of the board.
# iii. The color codes are defined here.
#7.On selecting the Replay button I should be directed to Replay selected LOTTO ticket - WEB

#MON_839	View Powerball ticket Details – WEB
#As a user I should be able to view the details of the selected game from my Play History
#
#*Acceptance Criteria –*
#As a user I verify that :
# On selecting one of the history item from the [View LOTTO pallet - WEB|https://greenbank.atlassian.net/browse/MON-233] or from [View LOTTO purchase history table - WEB|https://greenbank.atlassian.net/browse/MON-840], I should be directed to a new page
# The new page should have the following sections / canvas.
# 	i.	Ticket Information
#	ii.	Boards
#	iii.	Replay button
# The page should be titled *LOTTO purchase details*
# *Back* button before the title *LOTTO purchase details*. On selecting the back button, I should  be either directed to the  *[View LOTTO / PowerBall history list - WEB|https://greenbank.atlassian.net/browse/MON-838]* page / screen or *[View LOTTO pallet - WEB|https://greenbank.atlassian.net/browse/MON-233]* page or screen based on the entry is from.
# The *Ticket information* section / canvas should have the following fields and controls.
# 	i.	Non editable text field with the label *Description*. The Description is auto populated with the game name. The game name should be one of the below values.
# 	a.	*PowerBall Quickpick* or *PowerBall Pick own numbers* if the user has played PowerBall alone
# 	b.	*PowerBall PLUS Quickpick* or *PowerBall PLUS Pick own numbers* if the user has played PowerBall & PowerBall PLUS.
#	ii.	Non editable text field with the label *From account*. The From account is auto populated with the account used for the purchase. The *From account* should be in the format *<<account type>> - <<account number>>*.  The <<account type>> examples are *CC* for Credit Card, *CA* for Current Account, *SA* for Saving Account
#	iii.	Non editable text field with the label *Draw numbers*. The Draw numbers is auto populated with the draw numbers based on the number of draws for that purchase. If single draw purchase the format is *#<<draw number>>*. If multi draw purchase the format is *#<<draw number>> to #<<draw number>>*
# 	iv.	Non editable text field with the label *Number of draws*. The Number of draws is auto populated with the number of draws for the purchase.
#	v.	Non editable text field with the label *Purchase date*. The Purchase date is auto populated with the date of purchase and time of purchase in the format <<dd/mm/yyyy hh:mm>>. The time is a 24 hour clock.
#	vi.	Non editable text field with the label *Cost*. The Cost is auto populated with the purchase value for the purchase.
# 	vii.	Non editable text field with the label *Number of boards*. The Number of boards is auto populated with the number of boards for the purchase
#	viii.	Non editable text field with the label *Purchase reference number*. The Purchase reference number is auto populated with the Reference number for the purchase
# The Boards should have the following fields and controls
# 	i.	Each board is represented with label A to T based on the boards from the purchase history.
#	ii.	Each board should have the color code applied on the 6 balls of the board.
#	iii.	The color codes are defined here.
# On selecting the Replay button I should be directed to *[Replay selected PowerBall ticket - WEB|https://greenbank.atlassian.net/browse/MON-842]*

#*Negative Flow –*
#https://greenbank.atlassian.net/browse/MON-1094

#Note : FromWhere parameter:
#Pallet = Where the ticket is chosen from a pallet on the overview screen
@ViewLottoTicketDets	@RT
Scenario Outline: View Lotto Ticket Details
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When Selecting the View more tickets, I should be directed to View LOTTO / Power Ball history list - WEB"<FromWhere>"
And Selecting one of the history items from the View LOTTO pallet - WEB or from View LOTTO purchase history table - WEB, I should be directed to a new page"<GameType>","<FromWhere>"
And Selecting one of the three LOTTO purchase pallet items, I should be directed to View LOTTO ticket Details - WEB or View PowerBall ticket Details - WEB"<GameType>","<FromWhere>"
Then The new page should have the following sections - Ticket Information AND Boards AND Replay button
And The Ticket information section / canvas should have the following fields and controls. see 'MON-235->5->i-viii'"<GameType>","<FromWhere>"
And The Boards should have the following fields and controls. see 'MON-235->6->i-iii'"<FromWhere>"
And On selecting the back button, I should be either directed to the View LOTTO / PowerBall history list - WEB page / screen or View LOTTO pallet - WEB page or screen based on where the entry is from"<FromWhere>","<Action>"
And On selecting the Replay button I should be directed to Replay selected LOTTO ticket - WEB"<GameType>","<Action>"

Examples:
|NedID		|Password	|GameType	|FromWhere	|Action	|
|webtest2	|Testing23@!@	|LOTTO		|History	|Back	|
|webtest3	|Test11!@!!	|PowerBall	|History	|Replay	|
#|webtest3	|Test11!@!!	|LOTTO		|Pallet		|Back	|
#|webtest2	|Testing23@!@	|PowerBall	|Pallet		|Replay	|

@smoke  @ViewLottoTicketDetsSmoke
Scenario Outline: View Lotto Ticket Details
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When Selecting the View more tickets, I should be directed to View LOTTO / Power Ball history list - WEB"<FromWhere>"
And Selecting one of the history items from the View LOTTO pallet - WEB or from View LOTTO purchase history table - WEB, I should be directed to a new page"<GameType>","<FromWhere>"
And Selecting one of the three LOTTO purchase pallet items, I should be directed to View LOTTO ticket Details - WEB or View PowerBall ticket Details - WEB"<GameType>","<FromWhere>"
Then The new page should have the following sections - Ticket Information AND Boards AND Replay button
And The Ticket information section / canvas should have the following fields and controls. see 'MON-235->5->i-viii'"<GameType>","<FromWhere>"
And The Boards should have the following fields and controls. see 'MON-235->6->i-iii'"<FromWhere>"
And On selecting the back button, I should be either directed to the View LOTTO / PowerBall history list - WEB page / screen or View LOTTO pallet - WEB page or screen based on where the entry is from"<FromWhere>","<Action>"
And On selecting the Replay button I should be directed to Replay selected LOTTO ticket - WEB"<GameType>","<Action>"

Examples:
|NedID		|Password	|GameType	|FromWhere	|Action	|
|webtest2	|Testing23@!@	|LOTTO		|History	|Back	|
#|webtest3	|Testing23@!@	|LOTTO		|History	|Back	|

#MON_239	View Winning Numbers – WEB
#As a user I should be able to view the winning numbers for the following games.
#i. LOTTO
#ii. LOTTO PLUS 1
#iii. LOTTO PLUS 2
#iv. PowerBall
#v. PowerBall PLUS
#
#Acceptance Criteria –
#As a user I verify that :
#1.On selecting the View winning numbers from View LOTTO / PowerBall history list - WEB service, I should be presented with the new screen.
#2.The new screen should have the following fields and sections
#i. Title with the label LOTTO winning numbers
#ii. Back button before the title LOTTO Winning numbers. On selecting the back button, I should be directed to the View LOTTO / PowerBall history list - WEB page / screen.
#iii. Table with the column titles Draw date / Game / Winning numbers
#3.The Table should have 5 rows.
#4.The first row of the table should be populated with the last draw details in each of the column (Draw date / Game / Winning numbers) for LOTTO
#5.The second row of the table should be populated with the last draw details in each of the column (Draw date / Game / Winning numbers) for LOTTO PLUS 1
#6.The third row of the table should be populated with the last draw details in each of the column (Draw date / Game / Winning numbers) for LOTTO PLUS 2
#7.The fourth row of the table should be populated with the last draw details in each of the column (Draw date / Game / Winning numbers) for PowerBall
#8.The fifth row of the table should be populated with the last draw details in each of the column (Draw date / Game / Winning numbers) for PowerBall PLUS
#9.Each of the row should be select-able.
#10.On selecting the LOTTO row, I should be directed to a View LOTTO winning details
#11.On selecting the LOTTO PLUS 1 row, I should be directed to a View LOTTO PLUS 1 winning details
#12.On selecting the LOTTO PLUS 2 row, I should be directed to a View LOTTO PLUS 2 winning details
#13.On selecting the PowerBall row, I should be directed to a View PowerBall winning details
#14.On selecting the PowerBall PLUS row, I should be directed to a View PowerBall PLUS winning details
#
#Negative Flow –
#https://greenbank.atlassian.net/browse/MON-1094

@ViewLottoWinningNumbers	@RT
Scenario Outline: View LOTTO Winning Numbers
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When Selecting the View more tickets, I should be directed to View LOTTO / Power Ball history list - WEB"History"
And Selecting the View winning numbers from View LOTTO / PowerBall history list - WEB service, I should be presented with the new screen
Then The Table should have five rows for the different game types
And Each of the rows should be selectable"5"

Examples:
|NedID		|Password	|
|webtest2	|Testing23@!@	|

@smoke  @ViewLottoWinningNumbersSmoke
Scenario Outline: View LOTTO Winning Numbers
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When Selecting the View more tickets, I should be directed to View LOTTO / Power Ball history list - WEB"History"
And Selecting the View winning numbers from View LOTTO / PowerBall history list - WEB service, I should be presented with the new screen
Then The Table should have five rows for the different game types
And Each of the rows should be selectable"1"

Examples:
|NedID		|Password	|
|webtest3	|Test11!@!!	|


#MON-860	View LOTTO winning details – WEB
#MON-861	View LOTTO Plus 1 winning details - WEB
#MON-862	View LOTTO Plus 2 winning details - WEB

#As a user I verify that:
#1.On selecting the LOTTO row from View winning numbers - Web screen / page, I should be directed to a new page.
#2.The new page / screen should have the following sections, fields and controls.
#i. Title with the label LOTTO draw details
#ii. Winning details table with the column Draw date / Game / Winning numbers
#iii. Payouts canvas
#iv. Draw details canvas
#3.The winning details table is populated with one row with the last draw date , game name <<LOTTO>> and the winning numbers with the bonus ball separated by a + symbol.
#4.The winning numbers should be color coded. The color codes are defined in LOTTO color code for LOTTO balls
#5.The Payout canvas has the following fields and controls.
#6.Non editable label with the text Payouts (per winner)
#i. Non editable text area with the label *Div 1 - Six correct balls (<<Number of Winners>>)
#R <<Winning Prize Money for Div 1>>*
#ii. <<Number of winners>> & <<Winning Prize Money for Div 1>> for Div 1 is auto populated based on the number of winners and winning prize money from API for LOTTO
#iii. Non editable text area with the label *Div 2 - Five correct balls + bonus ball (<<Number of Winners>>)
#R <<Winning Prize Money for Div 2>>*
#iv. <<Number of winners>> & <<Winning Prize Money for Div 2>> for Div 2 is auto populated based on the number of winners and winning prize money from API for LOTTO
#v. Non editable text area with the label *Div 3 - Five correct balls (<<Number of Winners>>)
#R <<Winning Prize Money for Div 3>>*
#vi. <<Number of winners>> & <<Winning Prize Money for Div 3>> for Div 3 is auto populated based on the number of winners and winning prize money from API for LOTTO
#vii. Non editable text area with the label *Div 4 - Four correct balls + bonus ball (<<Number of Winners>>)
#R <<Winning Prize Money for Div 4>>*
#viii. <<Number of winners>> & <<Winning Prize Money for Div 4>> for Div 4 is auto populated based on the number of winners and winning prize money from API for LOTTO
#ix. Non editable text area with the label *Div 5 - Four correct balls (<<Number of Winners>>)
#R <<Winning Prize Money for Div 5>>*
#x. <<Number of winners>> & <<Winning Prize Money for Div 5>> for Div 5 is auto populated based on the number of winners and winning prize money from API for LOTTO
#xi. Non editable text area with the label *Div 6 - Three correct balls + bonus ball (<<Number of Winners>>)
#R <<Winning Prize Money for Div 6>>*
#xii. <<Number of winners>> & <<Winning Prize Money for Div 6>> for Div 6 is auto populated based on the number of winners and winning prize money from API for LOTTO
#xiii. Non editable text area with the label *Div 7 - Three correct balls (<<Number of Winners>>)
#R <<Winning Prize Money for Div 7>>*
#xiv. <<Number of winners>> & <<Winning Prize Money for Div 7>> for Div 7 is auto populated based on the number of winners and winning prize money from API for LOTTO
#xv. Non editable text area with the label *Div 8 - Two correct balls + bonus ball (<<Number of Winners>>)
#R <<Winning Prize Money for Div 8>>*
#xvi. <<Number of winners>> & <<Winning Prize Money for Div 8>> for Div 8 is auto populated based on the number of winners and winning prize money from API for LOTTO
#7.The Draw Details canvas has the following fields and controls.
#8.Non editable label with the text Draw Details
#i. Non editable Label *Total Sales * R <<Total Sales Value>>. The Total Sales Value is auto populated based on the API input
#ii. Non editable Label *Total prize pool * R <<Total Prize Pool Value>>. The Total Prize Pool Value is auto populated based on the API input
#iii. Non editable Label *Draw machine * <<Machine Name used for the draw>>. The Machine Name is auto populated based on the API input
#iv. Non editable Label *Ball set * <<Ball set used for the draw>>. The Ball set name is auto populated based on the API input

#MON-863	View LOTTO Powerball winning details - WEB
#MON-864	View LOTTO Powerball Plus winning details - WEB

#As a user I should be able to view the details of PowerBall for the last PowerBall draw.
#
#*Acceptance Criteria –*
#As a user I verify that:
## On selecting the PowerBall row from [View winning numbers - Web|https://greenbank.atlassian.net/browse/MON-239] screen / page, I should be directed to a new page.
## The new page / screen should have the following sections, fields and controls.
#i.	Title with the label *PowerBall draw details*
#ii.	Winning details table with the column *Draw date / Game / Winning numbers*
#iii.	Payouts canvas
#iv.	Draw details canvas
## The winning details table is populated with one row with the last draw date , game name *<<PowerBall>>* and the winning numbers with the powerBall ball.
## The winning numbers should be color coded. The color codes are defined in [PowerBall color code|https://greenbank.atlassian.net/browse/MON-719]
## The Payout canvas has the following fields and controls.
## Non editable label with the text *PAYOUTS (PER WINNER)*
#i. Non editable text area with the label *Div 1 \- Five correct balls \+ PowerBall (<<Number of Winners>> winners)
#R<<Winning Prize Money for Div 1>>*
#ii. <<Number of winners>> & <<Winning Prize Money for Div 1>> for Div 1 is auto populated based on the number of winners and winning prize money from API
#iii. Non editable text area with the label *Div 2 \- Five correct balls (<<Number of Winners>> winners)
#R <<Winning Prize Money for Div 2>>*
#iv. <<Number of winners>> & <<Winning Prize Money for Div 2>> for Div 2 is auto populated based on the number of winners and winning prize money from API
#v. Non editable text area with the label *Div 3 \- Four correct balls \+ PowerBall (<<Number of Winners>> winners)
#R <<Winning Prize Money for Div 3>>*
#vi. <<Number of winners>> & <<Winning Prize Money for Div 3>> for Div 3 is auto populated based on the number of winners and winning prize money from API
#vii. Non editable text area with the label *Div 4 \- Four correct balls (<<Number of Winners>> winners)
#R <<Winning Prize Money for Div 4>>*
#viii. <<Number of winners>> & <<Winning Prize Money for Div 4>> for Div 4 is auto populated based on the number of winners and winning prize money from API
#ix. Non editable text area with the label *Div 5 \- Three correct balls \+ PowerBall (<<Number of Winners>> winner)
#R <<Winning Prize Money for Div 5>>*
#x. <<Number of winners>> & <<Winning Prize Money for Div 5>> for Div 5 is auto populated based on the number of winners and winning prize money from API
#xi. Non editable text area with the label *Div 6 \- Three correct balls (<<Number of Winners>> winners)
#R <<Winning Prize Money for Div 6>>*
#xii. <<Number of winners>> & <<Winning Prize Money for Div 6>> for Div 6 is auto populated based on the number of winners and winning prize money from API
#xiii. Non editable text area with the label *Div 7 \- Two correct balls \+ PowerBall (<<Number of Winners>> winners)
#R <<Winning Prize Money for Div 7>>*
#xiv. <<Number of winners>> & <<Winning Prize Money for Div 7>> for Div 7 is auto populated based on the number of winners and winning prize money from API
#xv. Non editable text area with the label *Div 8 – One correct balls \+ PowerBall (<<Number of Winners>> winners)
#R <<Winning Prize Money for Div 8>>*
#xvi. <<Number of winners>> & <<Winning Prize Money for Div 8>> for Div 8 is auto populated based on the number of winners and winning prize money from API
#xvii. Non editable text area with the label *Div 9 – Match PowerBall (<<Number of Winners>> winners)
#R <<Winning Prize Money for Div 9>>*
#xviii. <<Number of winners>> & <<Winning Prize Money for Div 9>> for Div 9 is auto populated based on the number of winners and winning prize money from API
## The *Draw Details* canvas has the following fields and controls.
## Non editable label with the text *Draw Details*
#i. Non editable Label *Total Sales * R <<Total Sales Value>>. The Total Sales Value is auto populated based on the API input
#ii. Non editable Label *Total prize pool * R <<Total Prize Pool Value>>. The Total Prize Pool Value is auto populated based on the API input
#iii. Non editable Label *Draw machine * <<Machine Name used for the draw>>. The Machine Name is auto populated based on the API input
#iv. Non editable Label *Ball set * <<Ball set used for the draw>>. The Ball set name is auto populated based on the API input

@ViewWinningDetails	@RT
Scenario Outline: View Winning Details
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When Selecting the View more tickets, I should be directed to View LOTTO / Power Ball history list - WEB"History"
And Selecting the View winning numbers from View LOTTO / PowerBall history list - WEB service, I should be presented with the new screen
And On selecting the "<GameType>" row from the View winning numbers page, I should be directed to a new page
Then The winning details table is populated with one row with the last draw date, game name"<GameType>" and the winning numbers with the bonus ball separated by a + symbol
And The Payout canvas has the fields and controls showing eight or nine divisions"<GameType>"
And The Draw Details canvas has the four fields and controls

Examples:
|NedID		|Password |GameType	    |
|webtest2	|?	      |LOTTO          |
|webtest2	|?	      |LOTTO PLUS 2   |
|webtest2	|?	      |PowerBall PLUS |
|webtest3	|?	      |LOTTO PLUS 1   |
|webtest3	|?	      |PowerBall      |

@smoke  @ViewWinningDetailsSmoke
Scenario Outline: View Winning Details
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When Selecting the View more tickets, I should be directed to View LOTTO / Power Ball history list - WEB"History"
And Selecting the View winning numbers from View LOTTO / PowerBall history list - WEB service, I should be presented with the new screen
And On selecting the "<GameType>" row from the View winning numbers page, I should be directed to a new page
Then The winning details table is populated with one row with the last draw date, game name"<GameType>" and the winning numbers with the bonus ball separated by a + symbol
And The Payout canvas has the fields and controls showing eight or nine divisions"<GameType>"
And The Draw Details canvas has the four fields and controls

Examples:
|NedID		|Password	|GameType	    |
|webtest2	|Testing23@!@	|LOTTO          |
#|webtest3	|Testing23@!@	|LOTTO          |

#MON-842	Replay selected Powerball ticket - WEB
#Description –
#As a user, I should be able to replay a game with the same boards or same number of boards based on the game type.
#
#Acceptance Criteria –
#1.On selecting the Replay Button in the View PowerBall ticket Details - WEB or View LOTTO / PowerBall history list - WEB screen, I should be re-directed to the 2nd page of the buy LOTTO screen from MVP0.
#2.The game type Quickpick or Pick Own Numbers determine how the screens will be auto populated.
#3.Pick Own Numbers
#i. The Boards should be auto populated with the game / ticket from which the replay was initiated. I should be able to delete , add and change the auto populated boards
#ii. PowerBall PLUS toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated. I should be able to change the toggle for PowerBall PLUS based on my preference.
#iii. The Number of draws field is should be auto populated to reflect the game / ticket from which the replay was initiated. The draw numbers should be updated accordingly to reflect the new draw numbers starting from the next draw in the format 1 draw #<<draw number>> or n draws #<<draw number>> to <<draw number>>. I should be able to change the number of draws to my preference.
#iv. The Account number drop down is auto populated based on the game / ticket from which the replay was initiated. I should be able to change the account number based on my preference.
#v. The Total value is calculated and auto populated based on the number of boards played and the number of draws and the PowerBall PLUS toggle switch values.
#vii. On selecting the Next button in the buy flow, I should be directed to the next screen in the buy flow as defined in MVP0.
#1.Qucikpick
#i. The Number of boards should be auto populated with the game / ticket from which the replay was initiated. I should be able to change the number of boards based on my preference.
#ii. PowerBall PLUS toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated. I should be able to change the toggle for PowerBall PLUS based on my preference.
#iii. The Number of draws field is should be auto populated to reflect the game / ticket from which the replay was initiated. The draw numbers should be updated accordingly to reflect the new draw numbers starting from the next draw in the format 1 draw #<<draw number>> or n draws #<<draw number>> to <<draw number>>. I should be able to change the number of draws to my preference.
#iv. The Account number drop down is auto populated based on the game / ticket from which the replay was initiated. I should be able to change the account number based on my preference.
#v. The Total value is calculated and auto populated based on the number of boards played and the number of draws and the PowerBall PLUS toggle switch values.
#vii. On selecting the Next button in the buy flow, I should be directed to the next screen in the buy flow as defined in MVP0.
#
#Negative Flow -
#https://greenbank.atlassian.net/browse/MON-1094

#MON-236	Replay selected LOTTO ticket – WEB
#Description –
#As a user, I should be able to replay a game with the same boards or same number of boards based on the game type.
#
#Acceptance Criteria –
#1.On selecting the Replay Button in the View LOTTO ticket Details - WEB or View LOTTO / PowerBall history list - WEB screen, I should be re-directed to the 2nd page of the buy LOTTO screen from MVP0.
#2.The game type Quickpick or Pick Own Numbers determine how the screens will be auto populated.
#3.Qucikpick
#i. The Number of boards should be auto populated with the game / ticket from which the replay was initiated. I should be able to change the number of boards based on my preference
#ii. LOTTO PLUS 1 toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated. I should be able to change the toggle for LOTTO PLUS 1 based on my preference.
#iii. LOTTO PLUS 2 toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated. I should be able to change the toggle for LOTTO PLUS 2 based on my preference.
#iv. The Number of draws field is should be auto populated to reflect the game / ticket from which the replay was initiated. The draw numbers should be updated accordingly to reflect the new draw numbers starting from the next draw in the format 1 draw #<<draw number>> or n draws #<<draw number>> to <<draw number>>. I should be able to change the number of draws to my preference.
#v. The Account number drop down is auto populated based on the game / ticket from which the replay was initiated. I should be able to change the account number based on my preference.
#vi. The Total value is calculated and auto populated based on the number of boards played and the number of draws and the LOTTO PLUS 1 and LOTTO PLUS 2 toggle switch values.
#vii. On selecting the Next button in the buy flow, I should be directed to the next screen in the buy flow as defined in MVP0.
#4.Pick Own Numbers
#i. The Boards should be auto populated with the game / ticket from which the replay was initiated. I should be able to delete , add and change the auto populated boards
#ii. LOTTO PLUS 1 toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated. I should be able to change the toggle for LOTTO PLUS 1 based on my preference.
#iii. LOTTO PLUS 2 toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated. I should be able to change the toggle for LOTTO PLUS 2 based on my preference.
#iv. The Number of draws field is should be auto populated to reflect the game / ticket from which the replay was initiated. The draw numbers should be updated accordingly to reflect the new draw numbers starting from the next draw in the format 1 draw #<<draw number>> or n draws #<<draw number>> to <<draw number>>. I should be able to change the number of draws to my preference.
#v. The Account number drop down is auto populated based on the game / ticket from which the replay was initiated. I should be able to change the account number based on my preference.
#vi. The Total value is calculated and auto populated based on the number of boards played and the number of draws and the LOTTO PLUS 1 and LOTTO PLUS 2 toggle switch values.
#vii. On selecting the Next button in the buy flow, I should be directed to the next screen in the buy flow as defined in MVP0.
#
#Negative Flow -
#https://greenbank.atlassian.net/browse/MON-1094

@ReplaySelectedQuickPickTicket	@RT
Scenario Outline: Replay Selected QuickPick Ticket
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When Selecting the View more tickets, I should be directed to View LOTTO / Power Ball history list - WEB"History"
Then On selecting the Replay Button in the View LOTTO ticket Details - WEB or View LOTTO / PowerBall history list - WEB screen, I should be re-directed to the second page of the buy LOTTO screen"<GameTitleDetails>","<FromWhere>"
And The Number of boards should be auto populated with the game / ticket from which the replay was initiated"<BoardANumbers>"
And I should be able to change the number of boards based on my preference"<BoardANumbersRP>"
And LOTTO PLUS ONE toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated"<LP1>","<NoLP1>","<Game>"
And LOTTO PLUS TWO toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated"<LP2>","<NoLP2>","<NoLP1>","<Game>"
And I should be able to change the toggle for LOTTO PLUS ONE and TWO based on my preference"<LP1RP>","<LP2RP>","<Game>"
And The Number of draws field should be auto populated to reflect the game / ticket from which the replay was initiated. The draw numbers should be updated accordingly to reflect the new draw numbers starting from the next draw in the format one draw #<<draw number>> or n draws #<<draw number>> to <<draw number>>"<NoDraws>","<GameType>"
And I should be able to change the number of draws to my preference"<NoDrawsRP>","<GameType>"
And The Account number drop down is auto populated based on the game / ticket from which the replay was initiated"<Account>"
And I should be able to change the account number based on my preference"<AccountRP>"
And The Total value is calculated and auto populated based on the number of boards played and the number of draws and the LOTTO PLUS '1' and LOTTO PLUS '2' toggle switch values"<BoardANumbersRP>","","","<LP1RP>","<LP2RP>","","","","","","<NoDrawsRP>"
And On selecting the Next button in the buy flow, I should be directed to the next screen in the buy flow

Examples:
|NedID		|Password	|Game     |GameType   |GameTitleDetails	                              |FromWhere|BoardANumbers|BoardANumbersRP|LP1|LP2|NoLP1|NoLP2|LP1RP|LP2RP|NoDraws|NoDrawsRP|Account    |AccountRP  |
|webtest2	|Testing23@!@	|LOTTO    |quick pick |LOTTO PLUS 1 ticket for 5 boards for 2 draws   |History  |5			  |3              |Yes|Yes|     |Yes  |No   |     |2 draws|1 draw   |1950479609 |1284082237 |
|webtest2	|Testing23@!@	|PowerBall|quick pick |PowerBall PLUS ticket for 4 boards for 2 draws |Details  |4			  |2              |Yes|	  |	    |	  |No   |     |2 draws|3 draws  |1950479609 |1284082237 |

@smoke  @ReplaySelectedQuickPickTicketSmoke
Scenario Outline: Replay Selected QuickPick Ticket
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When Selecting the View more tickets, I should be directed to View LOTTO / Power Ball history list - WEB"History"
Then On selecting the Replay Button in the View LOTTO ticket Details - WEB or View LOTTO / PowerBall history list - WEB screen, I should be re-directed to the second page of the buy LOTTO screen"<GameTitleDetails>","<FromWhere>"
And The Number of boards should be auto populated with the game / ticket from which the replay was initiated"<BoardANumbers>"
And I should be able to change the number of boards based on my preference"<BoardANumbersRP>"
And LOTTO PLUS ONE toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated"<LP1>","<NoLP1>","<Game>"
And LOTTO PLUS TWO toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated"<LP2>","<NoLP2>","<NoLP1>","<Game>"
And I should be able to change the toggle for LOTTO PLUS ONE and TWO based on my preference"<LP1RP>","<LP2RP>","<Game>"
And The Number of draws field should be auto populated to reflect the game / ticket from which the replay was initiated. The draw numbers should be updated accordingly to reflect the new draw numbers starting from the next draw in the format one draw #<<draw number>> or n draws #<<draw number>> to <<draw number>>"<NoDraws>","<GameType>"
And I should be able to change the number of draws to my preference"<NoDrawsRP>","<GameType>"
And The Account number drop down is auto populated based on the game / ticket from which the replay was initiated"<Account>"
And I should be able to change the account number based on my preference"<AccountRP>"
And The Total value is calculated and auto populated based on the number of boards played and the number of draws and the LOTTO PLUS '1' and LOTTO PLUS '2' toggle switch values"<BoardANumbersRP>","","","<LP1RP>","<LP2RP>","","","","","","<NoDrawsRP>"
And On selecting the Next button in the buy flow, I should be directed to the next screen in the buy flow

Examples:
|NedID		|Password |Game     |GameType   |GameTitleDetails	                          |FromWhere|BoardANumbers|BoardANumbersRP|LP1|LP2|NoLP1|NoLP2|LP1RP|LP2RP|NoDraws|NoDrawsRP|Account    |AccountRP  |
|webtest2	|?	      |LOTTO    |quick pick |LOTTO PLUS 1 ticket for 5 boards for 2 draws |History  |5			  |3              |Yes|Yes|     |Yes  |No   |     |2 draws|1 draw   |1950479609 |1284082237 |

@ReplaySelectedPickNumbersTicket	@RT
Scenario Outline: Replay Selected PickNumbers Ticket
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When Selecting the View more tickets, I should be directed to View LOTTO / Power Ball history list - WEB"History"
Then On selecting the Replay Button in the View LOTTO ticket Details - WEB or View LOTTO / PowerBall history list - WEB screen, I should be re-directed to the second page of the buy LOTTO screen"<GameTitleDetails>","<FromWhere>"
And The Boards should be auto populated with the game / ticket from which the replay was initiated"<BoardANumbers>","<BoardBNumbers>","<BoardCNumbers>"
And I should be able to delete, add and change the auto populated boards"<BoardANumbersRP>","<BoardBNumbersRP>","<BoardCNumbersRP>","<BoardANumbers>","<BoardBNumbers>","<BoardCNumbers>","<Game>"
And LOTTO PLUS ONE toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated"<LP1>","<NoLP1>","<Game>"
And LOTTO PLUS TWO toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated"<LP2>","<NoLP2>","<NoLP1>","<Game>"
And I should be able to change the toggle for LOTTO PLUS ONE and TWO based on my preference"<LP1RP>","<LP2RP>","<Game>"
And The Number of draws field should be auto populated to reflect the game / ticket from which the replay was initiated. The draw numbers should be updated accordingly to reflect the new draw numbers starting from the next draw in the format one draw #<<draw number>> or n draws #<<draw number>> to <<draw number>>"<NoDraws>","<GameType>"
And I should be able to change the number of draws to my preference"<NoDrawsRP>","<GameType>"
And The Account number drop down is auto populated based on the game / ticket from which the replay was initiated"<Account>"
And I should be able to change the account number based on my preference"<AccountRP>"
And I should be able to change the account number based on my preference"<Account>"
And The Total value is calculated and auto populated based on the number of boards played and the number of draws and the LOTTO PLUS '1' and LOTTO PLUS '2' toggle switch values"<BoardANumbers>","<BoardBNumbers>","<BoardCNumbers>","<LP1>","<LP2>","<NoLP1>","<NoLP2>","<LP1RP>","<LP2RP>","<NoDraws>","<NoDrawsRP>"
And On selecting the Next button in the buy flow, I should be directed to the next screen in the buy flow

Examples:
|NedID		|Password	|Game     |GameType	    |GameTitleDetails	                          |FromWhere|BoardANumbers	  |BoardANumbersRP  |BoardBNumbers	  |BoardBNumbersRP  |BoardCNumbers		|BoardCNumbersRP  |LP1|LP2|NoLP1|NoLP2|LP1RP|LP2RP|NoDraws|NoDrawsRP|Account    |AccountRP  |
#|webtest3	|Test11!@!!	|PowerBall|pick numbers |PowerBall ticket for 3 boards for 4 draws    |History  |1,5,3,18,11,20	  |2,6,4,19,12,10   |36,45,34,3,11,8  |18,23,17,2,6,4   |45,41,8,37,26,3	|                 |Yes|	  |Yes	|	  |Yes  |     |4 draws|         |1522117849	|1001088883 |
|webtest3	|Test11!@!!	|LOTTO	  |pick numbers |LOTTO PLUS 1 ticket for 3 boards for 7 draws |Details  |46,45,13,5,47,41 |35,34,2,46,36,30 |30,25,22,33,52,7 |15,13,11,17,26,4 |38,44,8,17,14,15	|Delete           |Yes|Yes|	    |Yes  |     |Yes  |7 draws|5 draws  |1522117849	|           |

@smoke  @ReplaySelectedPickNumbersTicketSmoke
Scenario Outline: Replay Selected PickNumbers Ticket
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When Selecting the View more tickets, I should be directed to View LOTTO / Power Ball history list - WEB"History"
Then On selecting the Replay Button in the View LOTTO ticket Details - WEB or View LOTTO / PowerBall history list - WEB screen, I should be re-directed to the second page of the buy LOTTO screen"<GameTitleDetails>","<FromWhere>"
And The Boards should be auto populated with the game / ticket from which the replay was initiated"<BoardANumbers>","<BoardBNumbers>","<BoardCNumbers>"
And I should be able to delete, add and change the auto populated boards"<BoardANumbersRP>","<BoardBNumbersRP>","<BoardCNumbersRP>","<BoardANumbers>","<BoardBNumbers>","<BoardCNumbers>","<Game>"
And LOTTO PLUS ONE toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated"<LP1>","<NoLP1>","<Game>"
And LOTTO PLUS TWO toggle switch should be auto populated to reflect the game / ticket from which the replay was initiated"<LP2>","<NoLP2>","<NoLP1>","<Game>"
And I should be able to change the toggle for LOTTO PLUS ONE and TWO based on my preference"<LP1RP>","<LP2RP>","<Game>"
And The Number of draws field should be auto populated to reflect the game / ticket from which the replay was initiated. The draw numbers should be updated accordingly to reflect the new draw numbers starting from the next draw in the format one draw #<<draw number>> or n draws #<<draw number>> to <<draw number>>"<NoDraws>","<GameType>"
And I should be able to change the number of draws to my preference"<NoDrawsRP>","<GameType>"
And The Account number drop down is auto populated based on the game / ticket from which the replay was initiated"<Account>"
And I should be able to change the account number based on my preference"<AccountRP>"
And I should be able to change the account number based on my preference"<Account>"
And The Total value is calculated and auto populated based on the number of boards played and the number of draws and the LOTTO PLUS '1' and LOTTO PLUS '2' toggle switch values"<BoardANumbers>","<BoardBNumbers>","<BoardCNumbers>","<LP1>","<LP2>","<NoLP1>","<NoLP2>","<LP1RP>","<LP2RP>","<NoDraws>","<NoDrawsRP>"
And On selecting the Next button in the buy flow, I should be directed to the next screen in the buy flow

Examples:
|NedID		|Password	|Game     |GameType	    |GameTitleDetails	                      |FromWhere|BoardANumbers	  |BoardANumbersRP  |BoardBNumbers	  |BoardBNumbersRP  |BoardCNumbers		|BoardCNumbersRP  |LP1|LP2|NoLP1|NoLP2|LP1RP|LP2RP|NoDraws|NoDrawsRP|Account    |AccountRP  |
|webtest3	|Test11!@!!	|PowerBall|pick numbers |PowerBall ticket for 3 boards for 4 draws|History  |1,5,3,18,11,20	  |2,6,4,19,12,10   |36,45,34,3,11,8  |18,23,17,2,6,4   |45,41,8,37,26,3	|                 |Yes|	  |Yes	|	  |Yes  |     |4 draws|         |1522117849	|1001088883 |
