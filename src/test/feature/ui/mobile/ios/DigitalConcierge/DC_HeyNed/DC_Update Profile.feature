@iosRegression @DC_HeyNedProfile
Feature: Update HeyNed user profile details

@Update_Profile_Information
Scenario Outline: Update HeyNed user profile details from HeyNed Setting
  Given user is on HeyNed setting screen on login with username "<username>" and password "<password>"
  And Click on Profile
  And I should be able to see the profile details and can Edit it
  And I enter valid details "<Name>","<Surname>","<ContactNumber>","<EmailAddress>"
  And click on Save button
  Then I can see the updated profile details on Profile screen
Examples:
  |username|password|Name|Surname|ContactNumber|EmailAddress|
  |Jeet@1720|Jeet@1720|trieal|bsdfoss|0834410677|ddddd@nedbank.co.za|