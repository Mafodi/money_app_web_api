Feature: Non Staff Short Term Loan Bureau

  @STLMNTHLYOfferBureau @AllBureau
  Scenario Outline: as a user i want to take up an offer
    Given user launch prepaid web application
    And user enters username "<username>" and password "<password>"
    And user clicks on Login
    And user must see application dashboard
    When user clicks notification icon
    And user should see notifications
    And user clicks on for you
    And user selects offer from list "<offerDescription>"
    And user accepts or decline STL "<STLdecidion>"
    And user confirms the consent "<offerDescription>"
    And confirm income and expenses "<correctInfo>" "<offerDescription>"
    And user recalculate personal loan "<repaymentDate>" "<loanAmount>"
    And user reviews personal loan "<staff>" "<nedbankCreditInsurance>" "<offerDescription>"
    Then user sees the affordability screen

    Examples:
      | username      | password      | offerDescription | correctInfo | staff   |repaymentDate|nedbankCreditInsurance| repaymentDate |loanAmount|STLdecidion|reasonForLoan | email|
      | GhostStaff4 | Testing123* | Test WKLY Pass:One month loan up to R6 000.00 |     yes     |  no    | Salary date |        yes             |Salary date   | 5000| interested |Furniture|glens@nedbank.co.za|
