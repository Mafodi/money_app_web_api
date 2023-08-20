Feature: CCLI_E2E_Flow  
Description: CCLI_E2E_Flow 

@CCLI_E2E_MoreNotification_IOS @Regression_PL_IOS
Scenario Outline: CCLI_E2E_Flow  
Given User_IOS launches the application
And User_IOS clicks on allow and ignore Update
And User_IOS clicks on continue button
#And User_IOS clicks on next button
And User_IOS clicks on New Login button
And User_IOS clicks on BusinessProfile button
Then User_IOS enters username and password

| username             | password    |
| wakandafunc000003        | Testing1!  |

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
|Test: Within 24 hours you could get a credit limit increase of up to R65 000.00 on your PLATINUM credit card with last number 1047. No additional documents required. |

And User_IOS clicks on iminterested button on campaign screen
And User_IOS scrolls letsgetstarted screen to bottom
And User_IOS clicks on all checkbox
And User_IOS clicks on confirm button
And User_IOS scrolls Your information screen to bottom
And User_IOS clicks confirm button on YourInformation screen
And User_IOS clicks on radioButton
#And User clicks on confirm button on disclosure screen
#And User clicks on confirm button for card delivery
#And User clicks on Agree Button
#And User clicks on Authorize button on Debichek screen
#And User enters emailid "<EmailId>"


Examples:
|SlectOption|EmailId             |
|Furniture  |vinitb@nedbank.co.za|
