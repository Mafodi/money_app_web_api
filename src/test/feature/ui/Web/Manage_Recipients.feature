Feature: Manage Recipients

@ResendPOPRecipView		@RT		@smoke  @ResendPOPRecipViewSmoke
Scenario Outline: Resend POP from recipient view
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I can select the Recipients service from the menu bar present at the top of my WEB login view
And I can search for a desired beneficiary"<RecipientType>","<Recipient>"
And I should be able to select a Beneficiary of my preference from the list of Beneficiary listed under My Recipient
Then I am able to select the option to Resend POP from my last payments view on recipients
And I am able to edit the email address or FAX or cell phone number"<ShareHow>","<ShareDestValue>","<PrePopd>"
And A success screen must be displayed to the user
And The recipient record must not be updated"<RecipientType>","<Recipient>","<ShareDestValue>"

Examples:
|NedID		|Password |RecipientType|Recipient		|ShareHow |ShareDestValue |PrePopd|
|webtest2	|?	      |				|QuickPay Ben	|Email	  | 	          |Yes	  |
#|webtest2	|?	      |				|QuickPay Ben	|Fax	  |0865948576	  |No	  |

#GD-8853  Resend Prepaid POP from Recipient View
#
#1. I should be able to select the option to Resend POP from my last purchases view on recipients.
# 2. I should be able to resend a POP for any prepaid purchase which is displayed.
# 3. I should be able to edit the email address or cell phone number to which PoP is to be sent.
# 4. This edited contact detail must be utilized for the once off sharing of the POP only (It shouldn't update the recipient contact details).
# 6. I should get a confirmation of the share of PoP.
# 7. I should be able to see a new overlay screen, when I select the option to resend POP.
# 8. If I choose "Select from saved recipients" then I must see" Recipient name" field with search functionality.
# 9. The search will contain all recipients with contact information saved on the record.
# 10. Recipients with no contact information saved will be displayed with a message, "No contact information saved for this recipient."
# 11. If there is no contact information saved the user must be able to enter it "manually". The recipient record will not be updated when sending the POP(Similar to point#4).
# 12. If there is no recipient matching the search, display the message given in this zeplin screen - https://zpl.io/2pdddJr
# 13. Depending on the sharing method (SMS, FAX, Email) selected, the details must be captured accordingly. If the record has the specific info saved then pre-populate it. The user can edit this.
# 14. A success screen must be displayed to the user.
#
# Un-editable Fields
# - Recipient
# - Service Provider (for Airtime) / Meter no: (for electricity)
# - Amount
# - From Account
# - Payment Date
# - Reference
#
# Editable Fields
# - How would you like to share this Proof of Payment"; options,
# "Select from saved recipients"
# "Email"
# "SMS"
# "FAX"
#
#
#https://zpl.io/bAvGE5p



#GD-8687  Recipient payment history
#
#As a user, I verify that:
#
# - I should be able to see more of the older entries in my recipient payment
#   history in the recipients tab in Online banking. Currently, it is limited to the
#   last 3 payments.
#
#
# Note:
#
# Displaying more records from the payment history will also allow to repeat payments as well as share proof of payment for those transactions.
#
# Today, old internet banking displays the last 10 recipient payments.

#GD-8995  Proof of Payment Enhancement
#
#
#As a user,
# I should be able to see a new enhanced Proof of Payment details screen as per the new design.
# Please find the zeplin link for both Web view and Mobile view in the below links
#
#Zeplin Link
# Web view - https://app.zeplin.io/project/59a5a74b7c6d8ba71623f37e/screen/5c35eaba81e8042985858930
# Mobile view - https://app.zeplin.io/project/59a5a74b7c6d8ba71623f37e/screen/5c35eabac7dd36bdb7704c29
#?

#GD-9104  Resend POP from Recipient View Enhancement
#
#As a user, I verify that:
#
#  - I should be able to see the below label above the mode selection drop
#    down.
# How would you like to share this Proof of Payment?
# (Currently it reads "How would you like to share this POP?")
#
#  - I should be able to see the below updated list in the drop down list
#
#     - Email
#     - SMS
#     - Fax
#
#  - On selection of any of the above modes, the respective email, SMS or Fax number of the selected recipient should be displayed but editable.
#
#  - If the recipient doesn't have en Email, SMS or Fax saved, the field should be displayed as blank and editable.

