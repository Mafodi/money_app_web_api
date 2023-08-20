Feature: Maintain Overdraft
﻿
@MaintainOverdraftLimit	@RT	@smoke  @MaintainOverdraftLimitSmoke
Scenario Outline: Maintain Overdraft Limit
Given Prf_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When In Overview I select the account number or name "<AccountNoName>" of account type "<AccType>"
And I press the View More Balances link
And I press the Manage link on the overdraft container
Then I should be able to select the change limit option on manage overdraft screen
And I should be able to see the next screen 'request to change limit'
And I should be able to see the current overdraft limit and new limit on the screen
And New limit should have a default value as '1000' less than current limit
And The value in new limit will change in accordance to position of scrubber
And I should be able to enter my new limit for overdraft in new limit input field"<NewLimit>"
And I should be able to see my phone number which is registered with the bank, this field is editable and I am able to provide alternate south african phone number"<Phone>"
And I should be able to see my email address which is registered with the bank, this field is editable and I am able to provide alternate email address"<Email>"
And Once submitted I should be able see that cancel overdraft and change limit option is grey out for '24' hours
And I should be able to click close option and then will go to the account details screen
And I should be able to see the remaining hours after which I should be able to select cancel overdraft or change limit option again

Examples:
|NedID		  |Password	|AccountNoName  |AccType  |NewLimit |Phone      |Email                |
|greenbank812 |?        |1001228138     |current  |10000    |0827236901 |seansn@nedbank.co.za |

@CancelOverdraft	@RT	@smoke  @CancelOverdraftSmoke
Scenario Outline: Cancel Overdraft
Given Prf_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When In Overview I select the account number or name "<AccountNoName>" of account type "<AccType>"
And I press the View More Balances link
And I press the Manage link on the overdraft container
Then I should be able to select the cancel overdraft option on manage overdraft screen
And I should be able to see the next screen request to cancel overdraft screen
And I should be able to write a reason for cancelling overdraft"<ReasonForCancellingOverdraft>"
And I should be able to see description 'Please confirm your contact details below and one of our consultants will be in touch with you within '1' working day'
And I should be able to see my phone number which is registered with the bank, this field is editable and I am able to provide alternate south african phone number"<Phone>"
And I should be able to see my email address which is registered with the bank, this field is editable and I am able to provide alternate email address"<Email>"
And Once submitted I should be able see that cancel overdraft and change limit option is grey out for '24' hours
And I should be able to click close option and then will go to the account details screen
And I should be able to see the remaining hours after which I should be able to select cancel overdraft or change limit option again

Examples:
|NedID		  |Password	|AccountNoName  |AccType  |ReasonForCancellingOverdraft |Phone      |Email                |
|greenbank812 |?        |1001228138     |current  |I hate having debt.          |0827236901 |seansn@nedbank.co.za |
