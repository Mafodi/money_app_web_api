@regression
Feature: ENROL Log In Federated


@Enrol_Log_In_Federated		@smoke	@RT   @Enrol_Log_In_FederatedSmoke
Scenario Outline: ENROL Log In Federated
Given I Open Web Banking Application In Browser
When I am presented with a login page
And I can type my username"<NedID>"
And I can enter my password"<NedID>","<Password>"
And My password is masked
And I click on Login
Then I am presented with the Account Dashboard

Examples:
|NedID		|Password	|
|webtest2	|Testing23@!@	|
#|webtest3	|?	        |

@POEnrol_Log_In_Federated
Scenario Outline: PO ENROL Log In Federated
Given PO I Open Web Banking Application In Browser
When PO I am presented with a login page
And PO I can type my username"<NedID>"
And PO I can enter my password"<NedID>"
And PO My password is masked
And PO I click on Login
Then PO I am presented with the Account Dashboard

Examples:
|NedID		|
|webtest2	|

@Enrol_Log_In_InvalidCredentials	@smoke	@RT   @Enrol_Log_In_InvalidCredentialsSmoke
Scenario Outline: ENROL Log In Invalid credentials
Given I Open Web Banking Application In Browser
When I am presented with a login page
And I can type my username"<NedID>"
And I can enter my password"<NedID>","<Password>"
And My password is masked
And I click on the eye icon I can see my password
And I click on Login
Then I am presented with a login validation error

Examples:
|NedID		|Password	|
|webtesting1|Testing1000|

@UnlockNEDID
Scenario Outline: Unlock NEDID
Given I Open Web Banking Application In Browser
And NEDID is locked out"<>","<>"
When I run through process to unlock the NEDID"<>","<>"
Then The NEDID is unlocked with a new password

Examples:
|NedID		|Password	|
|webtesting1|Testing1000|

