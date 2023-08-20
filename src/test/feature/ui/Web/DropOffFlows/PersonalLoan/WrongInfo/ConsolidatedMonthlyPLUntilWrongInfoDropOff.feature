Feature: Non Staff Consolidate Monthly with wrong infomation

  @PLConOfferMNTHLYOwnInsurance @OwnInsurance
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
And user selects which info is wrong "<wrongInfoFeedback>"
And user must see application dashboard

    Examples:
      | username   | password    | offerDescription                                       | correctInfo |wrongInfoFeedback|
      | GhostCard2 | Testing123* | Test MNTHLY Pass:Consolidation loan. Up to R156 300.00 |     yes     |monthly income |

