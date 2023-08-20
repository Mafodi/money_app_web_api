Feature: PL_STL_E2E_Flow
Description: PL_STL_E2E_Flow 

@PL_STL_E2E_MoreNotification_IOS @Regression_PL_IOS 
Scenario Outline: PL_STL_E2E_Flow
Given User_IOS launches the application
And User_IOS clicks on allow and ignore Update
And User_IOS clicks on continue button
#And User_IOS clicks on next button
And User_IOS clicks on New Login button
And User_IOS clicks on BusinessProfile button
Then User_IOS enters username and password

| username         | password    |
| ghosttest1041    | GhostTest@149 |

And User_IOS clicks on t&c checkbox
Then User_IOS clicks on login button
And User_IOS clicks on skip button
#And User_IOS declines pin creation
And User_IOS clicks on ok snackbar
And User_IOS clicks on more option
And User_IOS clicks on notification tab
And User_IOS clicks on foryou tab
And User_IOS clicks on PLOffer

|PLOffer                                                                                                                            |
|Test MNTHLY Pass:One month loan up to R6 000.00. 8% initiation fee. Zero interest. Money in your account with a few simple clicks. |

And User_IOS clicks on iminterested button on campaign screen
And User_IOS scrolls letsgetstarted screen to bottom
And User_IOS clicks on all checkbox
And User_IOS clicks on confirm button
And User_IOS scrolls Your information screen to bottom
And User_IOS clicks confirm button on YourInformation screen
And User_IOS scrolls your offer screen to bottom
And User_IOS selects debit order date "<Date>"
And User_IOS clicks confirm button on YourOffer screen
And User_IOS scrolls review screen to bottom
And User_IOS clicks confirm button on Review screen
And User_IOS clicks on radioButton
And User_IOS scrolls disclosure screen to bottom
And User_IOS clicks on LoanReasonsOptions tabs
And User_IOS selects ReasonForLaon Option "<SlectOption>"
And User_IOS clicks on confirm button on disclosure screen
And User_IOS clicks on Agree Button
#And User_IOS clicks on Authorize button on Debichek screen
And User_IOS enters emailid "<EmailId>"
#And User clicks on confirm button on EmailSCreens
#And User clicks on Done Button on Screen
#And User clicks on more option
#And User clicks on notification tab
#And User clicks on foryou tab
#And User should not see any notification"<Text1>"

Examples:
|SlectOption|EmailId             |Date       |Text1|
|Furniture  |vinitb@nedbank.co.za|SD|You don’t have any notifications|
#|Furniture  |vinitb@nedbank.co.za|30 days after taking this loan|You don’t have any notifications|