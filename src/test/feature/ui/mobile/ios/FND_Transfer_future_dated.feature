
Feature: Verify customer makes a schedule weekly and monthly tranfer


@Transferscheduleweeklyandmonthly
Scenario: Verify customer makes a schedule weekly and monthly tranfer
  Given Tss_User is on the Transfer screen ios app
  When Tss_User enters amount to transfer ios app
  And Tss_User selects from account ios app
  And Tss_User selects to account ios app
  And Tss_User selects future date ios app
  Then Tss_User Clicking on next should take user to review transfer screen ios app
  And Tss_User should be able to make transfer successfully ios app


