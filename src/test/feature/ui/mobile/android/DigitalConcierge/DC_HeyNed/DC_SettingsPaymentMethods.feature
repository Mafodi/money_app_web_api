@AndroidRegression @DC_HeyNedSettings
Feature: Payment methods from HeyNed settings

  @17HeyNedSettingsAddAdditional
  Scenario Outline: A client add an additional card from HeyNed settings
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed settings
    And I capture Name displayed on card "<CardName>", Card number "<CardNumber>", Card MM/YY "<MM/YY>", Card CVV "<CVV>"
    Then I add the card as Payment method

    Examples:
      |Username |Password   |CardName   |CardNumber        |MM/YY  |CVV  |
      |DChome01 |Test@1234  |TT Malope  |4012888888881881  |07/24  |149  |

  @18HeyNedSettingsChangeDefaultCard
  Scenario Outline: A client changes default card from HeyNed settings
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed settings
    Then I set the added card as default

    Examples:
      |Username |Password   |
      |DChome01 |Test@1234  |

  @19HeyNedSettingsDeleteCard
  Scenario Outline: A client deletes card from HeyNed settings
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed settings
    Then I delete a card

    Examples:
      |Username |Password   |
      |DChome01 |Test@1234  |