Feature:Non Staff Personal Loan Monthly with own insurance

@PLOfferMNTHLYOwnInsurance @OwnInsurance
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
And user must see application dashboard

Examples:
| username    | password    | offerDescription                                  | correctInfo | staff   |nedbankCreditInsurance| repaymentDate |loanAmount|
| GhostCard2  | Testing123* | Test MNTHLY Pass:Personal loan. Up to R250 000.00 |     yes     |  no    |        no             |Salary date   |35000    |