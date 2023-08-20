
Feature: Verify customer makes a Trasnfer with future dates with no frequency


@Transferfuturedatedwithnofrequency
Scenario: Verify customer makes a Trasnfer with future dates with no frequency
  Given Tf_User is on the Transfer screen ios app
  When Tf_User enters amount to transfer ios app
  And Tf_User selects from account ios app
  And Tf_User selects to account ios app
  And Tf_User selects future date ios app
  Then Tf_User Clicking on next should take user to review transfer screen ios app
  And Tf_User should be able to make transfer successfully ios app


