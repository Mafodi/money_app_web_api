Feature: Staff Personal Loan Monthly

  @PLStaffOfferMNTHLY @fullFlow
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
    And user confirms disclosure "<offerDescription>"
    And user accept terms and conditions
#And user authorises the debicheck
    Then user cancels application
    And user options to be back later
    #And user completes the offer "<reasonForLoan>" "<email>"
    #And user sees successful screen

    Examples:
      | username     | password    | offerDescription                                  | correctInfo | staff   | nedbankCreditInsurance  | repaymentDate|loanAmount|STLdecidion|
      | GhostStaff26 | Testing123* | Test MNTHLY Pass:Personal loan. Up to R250 000.00 |     yes     |  yes    |         yes             |Salary date   |35000     |interested |