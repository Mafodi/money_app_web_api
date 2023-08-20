@regressions @FNDElectricity @FNDWebRegression
Feature: Buy Prepaid Electricity


  @smoke  @FNDElectricityQQ
  Scenario Outline: Buy Once off  Prepaid Electricity
    Given ELE_User navigated to the  home page
    And I navigate to the Buy-Electricity function
    When I must be able to capture electricity recipient name"<RecipientName>"
    Then  I must be able to enter the recipient meter number"<MeterNo>"
    And I must be able to continue by selecting the Elec Next button
    When I  capture amount"<Amount>"
    Then I must be able to select a from account"<Account>" to purchase electricity
    And I must be able to continue by selecting the Elec Next button
    And I must be able to capture Your Reference"<YourRef>"
    And I must be able to continue by selecting the Elec Next button
    Then I must have the option to save the beneficiary
    And I must be able to confirm and proceed by selecting the Buy button
    Then I should be able to see a electricity confirmation screen so that I know that the purchase is done


    Examples:
      |RecipientName	|MeterNo	|Amount	|Account	  |YourRef|
      |Phill house	|01050020008|10	|1811959121	  |Topup  |

@smoke  @FNDElectricityQQ
Scenario Outline: Buy Once off  Prepaid Electricity  From the Preferred account
Given ELE_User navigated to the  home page
And I navigate to the Buy-Electricity function
  When I must be able to capture electricity recipient name"<RecipientName>"
Then  I must be able to enter the recipient meter number"<MeterNo>"
  And I must be able to continue by selecting the Elec Next button
When I  capture amount"<Amount>"
Then I must be able to select a from account"<Account>" to purchase electricity
  And I must be able to continue by selecting the Elec Next button
And I must be able to capture Your Reference"<YourRef>"
  And I must be able to continue by selecting the Elec Next button
  Then I must have the option to save the beneficiary
And I must be able to confirm and proceed by selecting the Buy button
Then I should be able to see a electricity confirmation screen so that I know that the purchase is done


Examples:
|RecipientName	|MeterNo	|Amount	|Account	  |YourRef|
|Snyman house	|01050020001|100	|1811959121	  |Topup  |


  @smoke  @FNDElectricityQQ
  Scenario Outline: Buy Once off  Prepaid Electricity  From the Preferred account with  Notification
    Given ELE_User navigated to the  home page
    And I navigate to the Buy-Electricity function
    When I must be able to capture electricity recipient name"<RecipientName>"
    Then  I must be able to enter the recipient meter number"<MeterNo>"
    And I must be able to continue by selecting the Elec Next button
    When I  capture amount"<Amount>"
    Then I must be able to select a from account"<Account>" to purchase electricity
    And I must be able to continue by selecting the Elec Next button
    And I must be able to capture Your Reference"<YourRef>"
    And I should be able to see the notification type and details"<NotifMethod>","<NotifValue>"
    And I must be able to continue by selecting the Elec Next button
#    Then I must have the option to save the beneficiary
    And I must be able to confirm and proceed by selecting the Buy button
    Then I should be able to see a electricity confirmation screen so that I know that the purchase is done


    Examples:
      |RecipientName	|MeterNo	|Amount	|Account	  |YourRef|NotifMethod|NotifValue|
      |Snyman house	|01050020001|100	|1811959121	  |Topup  |SMS      |0781619503|

