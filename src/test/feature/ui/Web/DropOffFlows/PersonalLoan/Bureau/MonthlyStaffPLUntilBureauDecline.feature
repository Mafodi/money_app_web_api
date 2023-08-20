Feature: Staff Personal Loan Monthly Bureau

  @PLStaffOfferMNTHLYBureau @AllBureau
  Scenario Outline: as a user i want to take up an offer
    Given user launch prepaid web application
    And user enters username "<username>" and password "<password>"
    And user clicks on Login
    And user must see application dashboard
    When user clicks notification icon
    And user should see notifications
    And user clicks on for you
    And user selects offer from list "<offerDescription>"
    And user confirms the consent "<offerDescription>"
    And confirm income and expenses "<correctInfo>" "<offerDescription>"
    And user recalculate personal loan "<repaymentDate>" "<loanAmount>"
    And user reviews personal loan "<staff>" "<nedbankCreditInsurance>" "<offerDescription>"
Then user sees the affordability screen

    Examples:
      | username     | password    | offerDescription                                  | correctInfo | staff   | nedbankCreditInsurance  | repaymentDate|loanAmount|
      | GhostStaff26 | Testing123* | Test MNTHLY Pass:Personal loan. Up to R250 000.00 |     yes     |  yes    |         yes             |Salary date   |35000     |