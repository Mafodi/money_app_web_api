Feature: V2 Login Steps
Description: V2 Login Steps

@LoginProcess @smoke
Scenario: User goes through the login process
Given User launches the application
And User clicks on allow and ignore Update
#And User clicks on continue button
And User clicks on next button
And User clicks on New Login button
Then User enters username and password

| username   | password    |
| ghostacc74  | Testing123* |

And User clicks on t&c checkbox
Then User clicks on login button