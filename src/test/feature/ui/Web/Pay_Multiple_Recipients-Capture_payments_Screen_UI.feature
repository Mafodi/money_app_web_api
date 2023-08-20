@regression
Feature: Pay Multiple Recipients

@PayMultRecipientsCan	@RT   @smoke  @PayMultRecipientsCanSmoke
Scenario Outline: Payment to Multiple Recipients Cancel
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I must have an option under pay to make multiple payments 'Multiple payments to recipients'
When I capture one or more payments"<CaptureData>"
Then I should be able to progress the payment to the review stage
When I review captured data on review screen
Then I am able to cancel

Examples:
|NedID	  |Password |CaptureData  |
|webtest3 |?        |<MultPmt1>   |

@PayMultRecipientsPos		@RT
Scenario Outline: Payment to Multiple Recipients Complete
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I must have an option under pay to make multiple payments 'Multiple payments to recipients'
When I capture one or more payments"<CaptureData>"
Then I should be able to progress the payment to the review stage
When I review captured data on review screen
Then I am able to proceed
When I confirm processed payment data
When I print proof of payment
Then I am able to print the proof of payment for all the payments. All payments will be concatenated into one print option and can be saved as one PDF
And I am Able to select the pay another option which will take me back to the multi payment screen OR I am able to select an option to 'Go to overview' which will take me to the overview screen"<EndOption>"

Examples:
|NedID	  |Password |CaptureData  |EndOption|Note         |
|webtest3 |?        |<MultPmt1>   |Another  |>1 payments  |
|webtest2 |?        |<MultPmt2>   |Overview |1 payment    |

@smoke  @PayMultRecipientsPosSmoke
Scenario Outline: Payment to Multiple Recipients Complete
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I must have an option under pay to make multiple payments 'Multiple payments to recipients'
When I capture one or more payments"<CaptureData>"
Then I should be able to progress the payment to the review stage
When I review captured data on review screen
Then I am able to proceed
When I confirm processed payment data
When I print proof of payment
Then I am able to print the proof of payment for all the payments. All payments will be concatenated into one print option and can be saved as one PDF
And I am Able to select the pay another option which will take me back to the multi payment screen OR I am able to select an option to 'Go to overview' which will take me to the overview screen"<EndOption>"

Examples:
|NedID	  |Password |CaptureData  |EndOption|Note         |
|webtest3 |?        |<MultPmt1>   |Another  |>1 payments  |

@PayMultRecipientsEditTODO		@RTTODO
Scenario Outline: Payment to Multiple Recipients Edit
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I must have an option under pay to make multiple payments 'Multiple payments to recipients'
When I capture one or more payments"<CaptureData>"
Then I should be able to progress the payment to the review stage
When I update captured data on review screen
Then I am able to proceed
When I confirm processed payment data
When I print proof of payment
Then I am able to print the proof of payment for all the payments. All payments will be concatenated into one print option and can be saved as one PDF
And I am Able to select the pay another option which will take me back to the multi payment screen OR I am able to select an option to 'Go to overview' which will take me to the overview screen"<EndOption>"

Examples:
|NedID	  |Password |CaptureData    |EndOption|Note         |
|webtest3 |?        |<MultPmt1Edit> |Another  |>1 payments  |
#|webtest2 |?        |<MultPmt2Del>  |Overview |>1 payments  |

@smokeTODO  @PayMultRecipientsEditSmokeTODO
Scenario Outline: Payment to Multiple Recipients Edit
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I must have an option under pay to make multiple payments 'Multiple payments to recipients'
When I capture one or more payments"<CaptureData>"
Then I should be able to progress the payment to the review stage
When I update captured data on review screen
Then I am able to proceed
When I confirm processed payment data
When I print proof of payment
Then I am able to print the proof of payment for all the payments. All payments will be concatenated into one print option and can be saved as one PDF
And I am Able to select the pay another option which will take me back to the multi payment screen OR I am able to select an option to 'Go to overview' which will take me to the overview screen"<EndOption>"

Examples:
|NedID	  |Password |CaptureData    |EndOption|Note         |
|webtest3 |Test11!@!!       |<MultPmt1Edit> |Another  |>1 payments  |

#GD-7114    Pay Multiple Recipients - Review Screen (UI)
#  Acceptance Criteria:
#  1. I will see a review screen once I have selected pay on the capture payment details screen. GD-6765
#  2. I am able to view a list of all payments i created on the payment details screen. GD-6765
#  3. I am unable to edit a payment here.
#  4. I can edit payment details by selecting the edit link. This will return me to the capture payment details screen for GD-6765.
#  5. I will see a total for all the payment, number of payment and totals as per the capture screen in GD-6765.
#  6. I can delete a payment from the list.
#  7. If I delete a payment and it is the only payment in the list I will receive the pop up to confirm that I will be canceling the transaction.
#  8. If I delete a payment and there are still other payments in the list I will receive the pop up to confirm that I will be removing this payment from the list.
#  9. I am able to proceed or cancel.
#  10. If I select confirm all payments will be processed and I will view a summary confirmation screen.

#GD-7115    Pay Multiple Recipients - Confirmation Screen (UI)
#  Acceptance Criteria:
#  1. I must view a confirmation of all my payments.
#  2, If a payment was successful it will display as successful.
#  3. If a payment was unsuccessful then it will display as unsuccessful with the relevant API error
#  4. I am able to see the account that I paid from.
#  5. I am able to see the new balance for this account.
#  6. I am able to see the number of payments.
#  7. I am able to see the Total Paid.
#  8. I am able to see the payment details.
#  9. I am able to select an option to "Go to overview" which will take me to the overview screen.
#  10. I am Able to select the pay another option which will take me back to the multi payment screen.
#  11. I am able to print the proof of payment for each payment separately. Split to GD-7155
#  12. I am able to print the proof of payment for all the payments. All payments will be concatenated into one print option and can be saved ass one PDF. Split to GD-7155
#  13. If one or more payments are unsuccessful then there I must have a retry option for each failed transaction.
#  14. If I select retry for a particular failed transaction then only that transaction must be retried.
#  15. If the retried transaction is successful change the record to a successful state. (Green tick etc)
#  16. If the retried transaction is not successful change the record must remain in the unsuccessful state (red tick and retry button available). The user can only retry once so the retry button must be removed. A message will be displayed to the user. (TBC)

#GD-7119    Pay Multiple Recipients - Capture payments screen (Validations)
#  Acceptance Criteria:
#  1. If the total payment amount is greater than the balance then I should see an error which indicates that I need to either change the from account or the amount/s (to reduce the total).
#  2. If the amount entered for a particular recipient is empty then I must NOT see the red error. "* Please enter an amount." The payment is not added unless there is an amount.
#  3. If the amount entered for a particular recipient is greater than the applicable limit then I must see the grey notification. "Daily limit exceeded."
#  4. The daily limit must reflect as follows: Daily Limit - total of all payments in the multi pay schedule.
#  5. If the your reference entered for a particular recipient is empty then I must see the red error. "* Please enter a reference for your account."
#  6. If the their reference entered for a particular recipient is empty then I must see the red error. "* Please enter a reference for your recipient."
#  7. If the the notification details entered for a particular recipient is empty then I must see the red error.
#  If email selected then "* Please enter an email address."
#  If fax selected then "* Please enter the number."
#  If sms selected then "* Please enter the number."

#GD-7150    Pay Multiple Recipients - Review Screen (API & Validations)

#GD-7120    Pay Multiple Recipients - Confirmation Screen (Error Handling)
#  Acceptance Criteria:
#  1. On the success screen I must see a valid reason why a particular payment has failed.
#  2. If a payment failed there will be no transaction number.
#  3. If a payment failed there will be a failed icon next to the record.
#  4. If a payment failed there will be no option to print the proof of payment.
#  5. If one or more payments are unsuccessful then there I must have a retry option for each failed transaction. If all fail then display an alert at the top of the page with a retry button to retry all the transactions.
#  6. If I select retry for a particular failed transaction then only that transaction must be retried.
#  7. If the retried transaction is successful change the record to a successful state. (Green tick etc)
#  8. If the retried transaction is not successful change the record must remain in the unsuccessful state (red tick and retry button available). The user can only retry once so the retry button must be removed. A message will be displayed to the user. (TBC)

#GD-7155    Pay Multiple Recipients - Print POP/s
#  Acceptance Criteria:
#  1. I must view a confirmation of all my payments.
#  2, If a payment was successful it will display as successful.
#  3. If a payment was unsuccessful then it will display as unsuccessful with the relevant API error
#  4. I am able to see the account that I paid from.
#  5. I am able to see the new balance for this account.
#  6. I am able to see the number of payments.
#  7. I am able to see the Total Paid.
#  8. I am able to see the payment details.
#  9. I am able to select an option to "Go to overview" which will take me to the overview screen.
#  10. I am Able to select the pay another option which will take me back to the multi payment screen.
#  11. I am able to print the proof of payment for each payment separately. Split to GD-7155
#  12. I am able to print the proof of payment for all the payments. All payments will be concatenated into one print option and can be saved ass one PDF. Split to GD-7155
#  13. If one or more payments are unsuccessful then there I must have a retry option for each failed transaction.
#  14. If I select retry for a particular failed transaction then only that transaction must be retried.
#  15. If the retried transaction is successful change the record to a successful state. (Green tick etc)
#  16. If the retried transaction is not successful change the record must remain in the unsuccessful state (red tick and retry button available). The user can only retry once so the retry button must be removed. A message will be displayed to the user. (TBC)
