Feature: Non Staff Short Term Loan wrong infomation

  @STLMNTHLYOfferWrongInfo @WrongInfo
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
    And user selects which info is wrong "<wrongInfoFeedback>"
    And user must see application dashboard

    Examples:
      | username      | password      | offerDescription | correctInfo |STLdecidion|wrongInfoFeedback|
      | cml3006843486@nedbank | Testing123* | Test STL 1 |     yes  | interested |monthly income |

