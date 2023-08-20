@AndroidRegression @DC_HeyNedSubscription
Feature: Subscribe to HeyNed lifestyle assistant service

  @01HeyNedFreeSubscription
  Scenario Outline: Create a free HeyNed subscription for a new subscriber
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I navigate to Create your HeyNed profile screen
    And I capture profile Name "<Name>", Surname "<Surname>", Cellphone "<Cellphone>" and Email "<Email>"
    Then I should land on the HeyNed service is active screen

    Examples:
      |Username   |Password   |Name   |Surname  |Cellphone  |Email                      |
      |test@6165  |Test@1234  |Saroj  |Kandan   |0822934929 |saroj.kandan@nedbank.co.za |

    #This scenario requires a user with Nedbank cards and R99 subscription
  @02HeyNedNedbankCardSubscription
  Scenario Outline: Create a HeyNed subscription using Nedbank card for a new subscriber
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I navigate to Create your HeyNed profile screen
    And I capture profile Name "<Name>", Surname "<Surname>", Cellphone "<Cellphone>" and Email "<Email>"
    And I capture Nedbank card CVV number "<CVV>"
    Then I should land on the HeyNed service is active screen

    Examples:
      |Username  |Password   |Name  |Surname  |Cellphone  |Email                     |CVV  |
      |DChome01  |Test@1234  |Andre |Swart    |0833136513 |andre.swart@nedbank.co.za |123  |

  @03HeyNedLoadCardSubscription
  Scenario Outline: Create HeyNed subscription using load card for a new subscriber
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I navigate to Create your HeyNed profile screen
    And I capture profile Name "<Name>", Surname "<Surname>", Cellphone "<Cellphone>" and Email "<Email>"
    And I capture Add card name "<CardName>", number "<CardNumber>", MM/YY "<MM/YY>", CVV "<CVV>"
    Then I should land on the HeyNed service is active screen

    Examples:
      |Username   |Password   |Name       |Surname    |Cellphone  |Email                            |CardName       |CardNumber       |MM/YY  |CVV  |
      |test@6154  |Test@5164  |Mosebjadi  |Mashakwe   |0821816881 |mosebjadi.mashakwe@nedbank.co.za |Ms MR Mashakwe |4242424242424242 |05/22  |123  |

  @04HeyNedSubscriptionTermsAndConditions
  Scenario Outline: Review HeyNed subscription Terms and Conditions
    Given As a client I am logged into NedbankMoneyApp with Username "<Username>" and Password "<Password>"
    When I navigate to HeyNed lifestyle assistant
    And I navigate to Create your HeyNed profile screen
    Then I click on T&Css

    Examples:
      |Username   |Password   |
      |test@6154  |Test@5164  |