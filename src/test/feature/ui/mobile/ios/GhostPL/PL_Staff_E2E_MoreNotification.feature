Feature: PL_Staff_E2E_Flow 
Description: PL_Staff_E2E_Flow 

@PL_Staff_E2E_MoreNotification_IOS @Regression_PL_IOS @Test_1
Scenario Outline: PL_Staff_E2E_Flow
Given User_IOS launches the application
And User_IOS clicks on allow and ignore Update
And User_IOS clicks on continue button
#And User_IOS clicks on next button
And User_IOS clicks on New Login button
And User_IOS clicks on BusinessProfile button
Then User_IOS enters username and password

| username     | password    |
| ghoststaff4  | Testing123* |

And User_IOS clicks on t&c checkbox
Then User_IOS clicks on login button
And User_IOS clicks on skip button
#And User_IOS declines pin creation
And User_IOS clicks on ok snackbar
And User_IOS clicks on more option
And User_IOS clicks on notification tab
And User_IOS clicks on foryou tab
And User_IOS clicks on PLOffer

|PLOffer                                                                                                                                                                               |
|Test MNTHLY Pass:Personal loan. 10% interest rate. Loan up to R50 000.00. Money in your account with a few simple clicks. |

And User_IOS clicks on iminterested button on campaign screen
And User_IOS scrolls letsgetstarted screen to bottom
And User_IOS clicks on all checkbox
And User_IOS clicks on confirm button
And User_IOS scrolls Your information screen to bottom
And User_IOS clicks confirm button on YourInformation screen
And User_IOS scrolls your offer screen to bottom
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
|SlectOption|EmailId             |Text1|
|Furniture  |vinitb@nedbank.co.za|You don’t have any notifications|
