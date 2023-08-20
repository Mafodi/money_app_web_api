@WebRegression @VAS
Feature: Vouchers validations

  Background: Voucher flow
    Given Existing customer logged onto Web
    And User clicks buy button
    When User want to buy voucher
    Then User should navigate to voucher screen


  @VASOwnAmountVoucherValidations
  Scenario: Own Amount voucher validations

    And User want to select Own Amount Voucher
    And User should navigate to Voucher Details screen
    And User Capture Own Amount Voucher details
    And User want to enter their own amount
    And user should see error message
    And buy voucher button should be disabled
    And user want to reEnter Own Amount
    And buy voucher button should be Enabled
    And User should click on Buy Voucher
    And User should navigate to Voucher payment screen


  @VASReferenceValidations
  Scenario: Voucher reference validations

    And User want to select Voucher
    And User should navigate to Voucher Options
    And User want to select a product
    And User should navigate to Voucher Details screen
    And User Capture Voucher details
    And User should click on Buy Voucher
    And User should navigate to Voucher payment screen
    And User want to edit reference
    And user should see Ref error message
    And buy button from payment screen should be disabled
