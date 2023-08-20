@iOSRegression  @FNDiOS @FNDiOSPayments
Feature:Make payment to Home loan Account
@FNDiOS_Paymentfromcurrenttohomeloansaccountnedbank
Scenario Outline: Make payment to existing nedbank home loan account beneficiary
    Given PEM_User_HL is on the Payment screen ios app
    When PEM_User_HL navigates to Single Payment screen ios app
    And PEM_User_HL selects recipients icon ios app
    And PEM_User_HL should be able to search "<recipientsname>" and select ios app
    Then PEM_User_HL Clicking on next should take me to next screen ios app
    And PEM_User_HL should be able to make payment successfully ios app

Examples:
|recipientsname|
|Nedbankhomeloanaccount|

