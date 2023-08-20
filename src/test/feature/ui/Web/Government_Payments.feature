Feature: Government Payments

@ViewGovernmentPmtsEmptyState		@RTTODO		@smokeTODO  @ViewGovernmentPmtsEmptyStateSmoke
Scenario Outline: View Government Payments Empty State
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When Mob_I navigate to the Pay function
And On selecting the entry point from Payment Landing Screen for Government Payments, I should be directed to a new page
Then If I don't have any outstanding Government payments and no Processed Government payments that I have to action, I should be directed to the OB : View Government Payments - Empty state page

Examples:
|NedID		|Password |
|webtest2	|?	      |

@ViewGovernmentPmts		@RTTODO		@smokeTODO  @ViewGovernmentPmtsSmoke
Scenario Outline: View Government Payments
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When Mob_I navigate to the Pay function
And On selecting the entry point from Payment Landing Screen for Government Payments, I should be directed to a new page
Then If I have any outstanding Government payments or any Processed Government payments that I have to action, I should be directed to the OB : View Government Payments - Pending page

Examples:
|NedID		|Password |
|webtest2	|?	      |

#GD-8016	OB : Initiate Government Payments	Ajay Srivastava
#
#Description -
# On selecting one of the pallets under the Pending Government Payments list from View Government Payments, i should be directed to the payments page so that I can complete the payment.
#
#User story -
# As a user, I verify that.
#1.On selecting one of the pallet under Pending Government Payment list, I should be directed to the Initiate Government Payments page.
#2.The new page should be labeled with the <<Statement label>> from the View Government Payments
#3.I should be able to view the Amount field (non editable).
#4.I should be able to select the From account.
#5.I should be able to view the Payment date field.
#6.The Payment date field should be a non-editable date field and should be pre-populated with the current date.
#7.I should be able to view the Your reference field.
#8.The Your reference field should be pre-populated with the value that is available as part of the selected Government Payment information.
#9.The Your reference field should be a editable text field.
#10.I should be able to view the Their reference field.
#11.The Their reference field should be an non editable text field with same values as Your reference value pre-populated in it.
#12.I should be able to edit Notification field (dropdown)
#13.I should be able to select the Reject button.
#14.On selecting the Reject button, I should be prompted with a confirmation popup to reject the payment
#15.I should be able to select the Next button.
#16.On selecting the Next button, i should be directed to the Confirm Government Payments step of the payment process.
#17.I should be able to view X button/link as in the other payments flow
#18.I should be able to select X button which will prompt me with the cancel popup menu as in the other payment flow.


#GD-8022	OB : Review Government Payments	Raj Kumar
#
#Description -
# On selecting Next button from Initiate Government Payments screen, i should be directed to the confirm payments page so that I can complete the payment.
#
#User story -
# As a user, I verify that.
#1.On selecting Next button, I should be directed to the review page.
#2.The page should have a text area with the format Payment of R<<amount>> from my <<account type>> for my <<government payment type>> today
#3.I should have an Edit button.
#4.On selecting the Edit button, I should be directed to the Initiate Government Payment page.
#5.The page should have a label "Review transaction details"
#6.The information area should have the following information
#
#From account: <<Account type>>
#To: <<Government Payment type (SARS / DHA / UIF / CFUNDS>>
#Amount: R<<Amount>>
#Payment date: <<payment date>>
#Your reference: <<your reference>>
#Their reference <<Their reference>>
#
#7.I should be presented with a Pay now button.
#8.On selecting the Pay now button, the payment should be submitted for processing immediately.
#9.On Pay now, I should be directed to the Completion page.


#GD-8023	OB : Completion Government Payments	Vikrant
#
#Description -
# On selecting Pay now button from OB : Review Government Payments screen, i should be directed to the payments completion screen/page so that I can view the success / failure status of the payment I initiated..
#
#User story -
#1.On selecting Pay now button on OB : Review Government Payments screen/page, I should be directed to the Success or Failure payment screen/page based on the response from the payments API/service.


#GD-8024	OB : Successful Transaction	Vikrant
#
#Description -
# As a user, on selecting Confirm button on the Confirm Government Payments screen/page, I should be directed the success screen/page based on successful response from the payments API/service.
#
#User story -
# As a user, I verify that.
#1.I will be presented with a new page.
#2.The page will be labeled Transaction successful
#3.I should be presented with the following information in this page
#From : <<Account_type>> <<Account_number>>
#Towards : <<Payment Type>>
#Payment date : <<Payment_date>>
#Amount : <<Payment_amount>>
#Beneficiary reference: <<Beneficiary_reference>>
#My reference : <<My_reference>>
#Please keep the reference numbers safe for future quires.
#4.All above data / information presented should be in non editable text format as provided in the UX/UI
#5.I should be presented with a button
#6.The button should be labeled Go to overview if there is no pending Government payments
#7.On selecting the Go to overview button, I should be directed to the Overview page
#8.The button should be labeled Done if there is peding Government payments
#9.On selecting the Done button, I should be directed to the View Government Payments
#10.The government payment that was initiated should be removed from the View Government Payments as the transaction was successful.


#GD-8971	OB : View Profile Number	CC312165 (Jaun du Toit)
#
#Description
#As a online banking user, I should be able to view my profile number in the profile settings page so that I can use the profile number in Government Portals like SARS / UIF / DHA / CFUNDs that use my profile number to initaite payments towards Government Payments
#
#Acceptance Criteria -
#1.I should be able to select the Settings tab on the Overview page
#2.On selecting the Settings tab, I should be directed to the Settings page
#3.I should be able to view my Profile Number in the


#GD-9156	OB : View Government Payments - Processed payments	Shashwat Kesarwani
#
#Description
#As an online banking user, I should view all my processed Government payments on selecting Processed toggle button in OB : View Government Payments - Pending view.
#
#Acceptance criteria -
#1.On selecting Processed toggle option in OB : View Government Payments - Pending view, I view the following fields and controls.
#
#No processed payments -
#1.If there is no processed payments to view, I should view the following fields and controls
#2.I should have a back button
#3.On selecting the back button I should be directed to Pay page.
#4.The screen title should read Your government payment requests.
#5.I should able to view a radio button (toggle) option with options 1) Pending 2) Processed
#6.Processed option should be selected.
#7.I should view an information that reads There is no processed government payments to action. You can view your pending government payments in the last <<days>> days by selecting the Pending button.
#
#Processed payments -
#1.If there is processed payments to view, I should view the following fields and controls
#2.I should have a back button
#3.On selecting the back button I should be directed to Pay page.
#4.The screen title should read Your government payment requests.
#5.I should able to view a radio button (toggle) option with options 1) Pending 2) Processed
#6.Process option should be selected.
#7.I should view a table of list of processed / settled government payments.
#8.Each row should have the following information in it as shown below.
#
#
#Government entity
#
#Status
#
#Date actioned
#
#Amount
#
#Action
#
#*<<Statement label 1>><<reference number>> <<payment status>> <<date actioned>> <<amount> <<download icon>>
#*<<Statement label 2>><<reference number>> <<payment status>> <<date actioned>> <<amount> <<download icon>>
#
#9.On selecting the <<download icon>> on each pallet, I should be able to download the proof of payment of the selected transaction.
#10.365 days from the date of payment, each processed payment should be removed from the Processed Government Payments list.
