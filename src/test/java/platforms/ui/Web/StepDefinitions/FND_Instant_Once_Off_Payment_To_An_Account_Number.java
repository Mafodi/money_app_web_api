package platforms.ui.Web.StepDefinitions;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.FND_Payment_Flow;
import utils.Utils;


/**
 * Description: Step definition for Instant Once Off Payment to an Account Number functionality
 * @author cc318764
 *
 */
public class FND_Instant_Once_Off_Payment_To_An_Account_Number extends Utils {
	LoginSteps login = new LoginSteps();
	FND_Payment_Flow payment = new FND_Payment_Flow();
	private static Logger log = Logger.getLogger(LoginSteps.class);


	@When("^I navigate to the Pay function$")
	public void i_navigate_to_the_Pay_function() throws Throwable {
		payment.I_NAVIGATE_TO_THE_PAY_FUNCTION("Single Payment");
	}

	@When("^I_should be able to Enter new recipient name\"([^\"]*)\"$")
	public void i_should_be_able_to_Enter_new_recipient_name(String strRecipientName)throws Throwable{
		payment.I_MUST_BE_ABLE_TO_CAPTURE_THE_RECIPIENT_NAME(strRecipientName);

	}


		@When("^I_click on the method of payment-pay to bank account$")
		public void i_click_on_the_method_of_payment_pay_to_bank_account() throws Throwable {
			payment.I_CLICK_ON_THE_METHOD_OF_PAYMENT_PAY_TO_BANK_ACCOUNT();
		}

		@When("^I_enter Bank name\"([^\"]*)\"$")
		public void i_enter_Bank_name(String strBkName)throws Throwable  {
			payment.I_ENTER_BANK_NAME(strBkName);
		}


		@When("^I_enter Account No\"([^\"]*)\"$")
		public void i_enter_Account_No(String AccNumber) throws Throwable {
			payment.I_ENTER_ACCOUNT_NO(AccNumber);
		}

		@When("^I_Select alpha field with the label Account type\"([^\"]*)\" for adding the Bank Account Details$")
		public void i_select_alpha_field_with_the_label_Account_type_for_adding_the_Bank_Account_Details(String AccType) throws Throwable {
			payment.SELECT_ACCOUNT_TYPE(AccType);
		}

		@When("^I_should be able to see the next steps header$")
		public void i_should_be_able_to_see_the_next_steps_header() throws Throwable {
			payment.I_SHOULD_BE_ABLE_TO_SEE_THE_NEXT_STEPS_HEADER();
		}

		@When("^I_After clicking on Next I should be able to move to the How much would you like to pay screen$")
		public void i_after_clicking_on_Next_I_should_be_able_to_move_to_the_How_much_would_you_like_to_pay_screen() throws Throwable {
			payment.HOW_MUCH_WOULD_YOU_LIKE_TO_PAY_SCREEN_VALIDATION();
		}

		@When("^I_want to capture the amount\"([^\"]*)\" to pay$")
		public void i_want_to_capture_the_amount_to_pay(String amount) throws Throwable {
			payment.PB_I_WANT_TO_CAPTURE_THE_AMOUNT(amount);
		}

		@When("^When I click on the instant payment toggle I must see the instant payment message$")
		public void when_I_click_on_the_instant_payment_toggle_I_must_see_the_instant_payment_message() throws Throwable {
			payment.WHEN_I_WHEN_I_CLICK_ON_THE_INSTANT_PAYMENT_TOGGLE_I_MUST_SEE_THE_INSTANT_PAYMENT_MESSAGE();
		}

		@When("^If it's instant payment then show text instant payment in the Date field else show only the date$")
		public void if_it_s_instant_payment_then_show_text_instant_payment_in_the_Date_field_else_show_only_the_date() throws Throwable {
			payment.IF_IT_INSTANT_PAYMENT_THEN_SHOW_TEXT_INSTANT_PAYMENT_IN_THE_DATE_FIELD_ELSE_SHOW_ONLY_THE_DATE();
		}

		@When("^I_should be able to select account\"([^\"]*)\"$")
		public void i_should_be_able_to_select_account(String strAccount) throws Throwable {
			payment.PB_I_SHOULD_BE_ABLE_TO_SELECT_ACCOUNT(strAccount);

		}

		@When("^Next button on this page should be disabled until the user completed all fields\"([^\"]*)\" and there are no errors$")
		public void next_button_on_this_page_should_be_disabled_until_the_user_completed_all_fields_and_there_are_no_errors(String St2Done) throws Throwable {
			payment.NEXT_BUTTON_CLICK_WITH_OUT_ERRORS(St2Done);
		}

		@When("^I_enter Your reference\"([^\"]*)\"$")
		public void i_enter_Your_reference(String strYourRef) throws Throwable {
			payment.I_ENTER_YOUR_REFERENCE(strYourRef);
		}

		@When("^I_enter Their reference\"([^\"]*)\"$")
		public void i_enter_Their_reference(String strTheirRef) throws Throwable {
			payment.I_ENTER_THEIR_REFERENCE(strTheirRef);
		}

		@When("^I_choose the notification method\"([^\"]*)\"$")
		public void i_choose_the_notification_method(String strNotificationMethod) throws Throwable {
			payment.I_CHOOSE_THE_NOTIFICATION_METHOD(strNotificationMethod);
		}

		@When("^I_enter notification value\"([^\"]*)\" appropriate to method\"([^\"]*)\" chosen$")
		public void i_enter_notification_value_appropriate_to_method_chosen(String strNotificationValue, String strNotificationMethod) throws Throwable {
			payment.NOTIFICATION_VALUE_TO_THE_APPROPRIATE_METHOD(strNotificationValue, strNotificationMethod);
		}

		@When("^I_click on the Next button$")
		public void i_click_on_the_Next_button() throws Throwable {
			payment.I_CLICK_ON_THE_NEXT_BUTTON();
		}

		@When("^I_should be able to see Payment from account\"([^\"]*)\"$")
		public void i_should_be_able_to_see_Payment_from_account(String strAccountType) throws Throwable {
			payment.I_SHOULD_BE_ABLE_TO_SEE_PAYMENT_FROM_ACCOUNT_TYPE(strAccountType);
		}

		@When("^I_should be able to see your reference\"([^\"]*)\"$")
		public void i_should_be_able_to_see_your_reference(String strYourReff) throws Throwable {
			payment.I_SHOULD_BE_ABLE_TO_SEE_PAYMENT_YOUR_REFERENCE(strYourReff);
		}

		@When("^Save beneficiary toggle should be able to be turned on and off by the user either sliding the toggle or clicking on it\"([^\"]*)\"$")
		public void save_beneficiary_toggle_should_be_able_to_be_turned_on_and_off_by_the_user_either_sliding_the_toggle_or_clicking_on_it(String arg1) throws Throwable {
			payment.SAVE_BENEFICIARY_OPTION_SHOULD_BE_TURNED_OFF();
		}

		@When("^I_should be able to click on PAY to confirm the payment$")
		public void i_should_be_able_to_click_on_PAY_to_confirm_the_payment() throws Throwable {
			payment.I_SHOULD_BE_ABLE_TO_CLICK_ON_PAY_TO_CONFIRM_PAYMENT();
		}

		@Then("^I should be able to see a confirmation screen so that I know that the transfer is done$")
		public void i_should_be_able_to_see_a_confirmation_screen_so_that_I_know_that_the_transfer_is_done() throws Throwable {
			payment.I_SHOULD_SEE_CONFORMATION_SO_THAT_I_KNOW_PAYMENT_IS_DONE();
		}

		@Then("^I_must be able to the see the recipient detail\"([^\"]*)\"$")
		public void i_must_be_able_to_the_see_the_recipient_detail(String strRecipient) throws Throwable {
			payment.P_B_I_MUST_ABLE_TO_SEE_RECIPIENT_DETAILS(strRecipient);
		}

		@Then("^I must be able to see the payment amount\"([^\"]*)\"$")
		public void i_must_be_able_to_see_the_payment_amount(String arg1) throws Throwable {
			payment.I_MUST_ABLE_TO_SEE_PAYMENT_AMOUNT();
		}

		@Then("^I must be able to see Transaction number displayed$")
		public void i_must_be_able_to_see_Transaction_number_displayed() throws Throwable {
			payment.I_MUST_ABLE_TO_SEE_TRANSACTION_NUMBER();
		}

		@Then("^I must be able to see the Payment date$")
		public void i_must_be_able_to_see_the_Payment_date() throws Throwable {
			payment.I_MUST_ABLE_TO_SEE_PAYMENT_DATE();
		}

		@Then("^I should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment$")
		public void i_should_be_able_to_see_two_buttons_New_Payment_and_Overview_when_click_overview_should_take_me_back_to_the_first_screen_of_payment() throws Throwable {
			payment.I_SHOULD_BE_ABLE_TO_SEE_NEW_PAYMENT_OVERVIEW_BUTTONS_WHEN_CLICKED_OVERVIEW_SHOULD_TAKE_ME_FIRST_SCREEN_OF_PAYMENT();
		}


}