@AndroidRegression @DC_HeyNedPayments
Feature: Make a payment using various pay methods

  @12HeyNedMakePaymentDefaultCard
  Scenario Outline: A client pays for a service using default card
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I search a task name "<Task>"
    And The task is searched successfully
    Then Process a default card payment

    Examples:
      |Username   |Password   |Task                                   |
      |DChome01   |Test@1234  |Automation payments using default card |

  @13HeyNedMakePaymentNedbankCard
  Scenario Outline: A client pays for a service using a Nedbank card
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I search a task name "<Task>"
    And The task is searched successfully
    Then Process a Nedbank card payment using "<CVV>"

    Examples:
      |Username   |Password   |Task                                    |CVV  |
      |DChome01   |Test@1234  |Automation payments using Nedbank card  |125  |

  @14HeyNedMakePaymentLoadCard
  Scenario Outline: A client pays for a service using loaded card
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I search a task name "<Task>"
    And The task is searched successfully
    Then Process a load card payment using Card Name "<CardName>", Card Number "<CardNumber>", MM/YY "<MM/YY>" and CVV "<CVV>"

    Examples:
      |Username   |Password   |Task                                 |CardName         |CardNumber        |MM/YY  |CVV |
      |DChome01   |Test@1234  |Automation payments using load card  |Ms NSG Malobola  |5454545454545454  |02/23  |465 |