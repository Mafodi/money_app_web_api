package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.FND_Payment_Flow;
import platforms.ui.Web.Foundation_DataFactory;
import utils.CommonFunctions;

/**
 * Description: Step definition for Once Off Payment to Mobile Number functionality
 * @author NB150565
 *
 */
public class FND_OnceOff_Payment_To_Mobile_Number extends CommonFunctions {

	LoginSteps login = new LoginSteps();
	FND_Payment_Flow payment = new FND_Payment_Flow();
	private static Logger log = Logger.getLogger(LoginSteps.class);

	@Given("^Mob_I am Logged in to Banking web app with username\"([^\"]*)\" and password\"([^\"]*)\"$")
	public void mob_i_am_Logged_in_to_Banking_web_app_with_username_and_password(String arg1, String arg2) throws InterruptedException {

		login.user_launch_prepaid_web_application();
		login.user_enters_username_and_password(Foundation_DataFactory.CCUser, Foundation_DataFactory.CCUserPassword);
		login.user_clicks_on_Login();
		log.info("user able to enter username and password and clicks on Login");
	}
	@When("^Mob_I navigate to the Pay function$")
	public void i_navigate_to_the_Pay_function() throws Throwable
	{
		payment.I_NAVIGATE_TO_THE_PAY_FUNCTION("Single Payment");
	}
	
	@When("^Mob_I should be able to Enter new recipient name\"([^\"]*)\"$")
	public void i_should_be_able_to_Enter_new_recipient_name(String strRecipientName)  {

		payment.I_MUST_BE_ABLE_TO_CAPTURE_THE_RECIPIENT_NAME(strRecipientName);

	}

	@When("^Mob_I should be able to select Pay to a cellphone$")
	public void i_should_be_able_to_select_Pay_to_a_cellphone()  {
		payment.I_SHOULD_BE_ABLE_TO_SELECT_PAY_TO_A_CELLPHONE();

	}

	@When("^Mob_I should be able to enter the recipients mobile number\"([^\"]*)\"$")
	public void i_should_be_able_to_enter_the_recipients_mobile_number(String strMobileNo){
			payment.I_SHOULD_BE_ABLE_TO_ENTER_THE_RECIPIENTS_MOBILE_NUMBER(strMobileNo);

	}

	@When("^Mob_After clicking on Next I should be able to move to the How much would you like to pay screen$")
	public void after_clicking_on_Next_I_should_be_able_to_move_to_the_How_much_would_you_like_to_pay_screen()  {
			payment.AFTER_CLICKING_ON_NEXT_I_SHOULD_BE_ABLE_TO_MOVE_TO_THE_HOW_MUCH_WOULD_LIKE_TO_PAY_SCREEN();
		}
	@When("^Mob_I want to capture the amount\"([^\"]*)\" to pay$")
	public void i_want_to_capture_the_amount_to_pay(String strAmount) throws InterruptedException {
		payment.PB_I_WANT_TO_CAPTURE_THE_AMOUNT(strAmount);
	}

	@When("^Mob_I should be able to select account\"([^\"]*)\"$")
	public void i_should_be_able_to_select_account(String strAccount)  {
		payment.PB_I_SHOULD_BE_ABLE_TO_SELECT_ACCOUNT(strAccount);

	}
	@When("^Mob_The next button on this page should be disabled until the user completed all fields\"([^\"]*)\" and there are no errors$")
	public void the_next_button_on_this_page_should_be_disabled_until_the_user_completed_all_fields_and_there_are_no_errors(String strStep2Done)  {
		payment.NEXT_BUTTON_CLICK_WITH_OUT_ERRORS(strStep2Done);
	}

	@When("^Mob_I enter Your reference\"([^\"]*)\"$")
	public void i_enter_Your_reference(String strYourRef)  {
		payment.I_ENTER_YOUR_REFERENCE(strYourRef);
	}
	@When("^Mob_I choose the notification method\"([^\"]*)\"$")
	public void mob_i_choose_the_notification_method(String strNotificationMethod)  {
		payment.I_CHOOSE_THE_NOTIFICATION_METHOD(strNotificationMethod);
	}

	@When("^Mob_I enter notification value\"([^\"]*)\" appropriate to method\"([^\"]*)\" chosen$")
	public void i_enter_notification_value_appropriate_to_method_chosen(String strNotificationValue, String strNotificationMethod) throws InterruptedException {
		payment.NOTIFICATION_VALUE_TO_THE_APPROPRIATE_METHOD(strNotificationValue, strNotificationMethod);
	}

	@When("^Mob_I click on the Next button$")
	public void i_click_on_the_Next_button()  {
		payment.I_CLICK_ON_THE_NEXT_BUTTON();


	}

	@When("^Mob_I should be able to see Payment from account\"([^\"]*)\"$")
	public void i_should_be_able_to_see_Payment_from_account(String strFromAcc)  {
		payment.I_SHOULD_BE_ABLE_TO_SEE_PAYMENT_FROM_ACCOUNT_TYPE(strFromAcc);

	}
	@When("^Mob_I should be able to see payment your reference\"([^\"]*)\"$")
	public void mob_i_should_be_able_to_see_payment_your_reference(String strYourReff)  {
		payment.I_SHOULD_BE_ABLE_TO_SEE_PAYMENT_YOUR_REFERENCE(strYourReff);
	}
	@When("^Mob_The save beneficiary toggle should be able to be turned on and off by the user either sliding the toggle or clicking on it\"([^\"]*)\"$")
	public void the_save_beneficiary_toggle_should_be_able_to_be_turned_on_and_off_by_the_user_either_sliding_the_toggle_or_clicking_on_it(String strSaveBen)  {
		payment.SAVE_BENEFICIARY_OPTION_SHOULD_BE_TURNED_OFF();
	}
	@When("^Mob_I should be able to click on PAY to confirm the payment$")
	public void i_should_be_able_to_click_on_PAY_to_confirm_the_payment()  {
		payment.I_SHOULD_BE_ABLE_TO_CLICK_ON_PAY_TO_CONFIRM_PAYMENT();
	}

	@Then("^Mob_I should be able to see a confirmation screen so that I know that the transfer is done$")
	public void i_should_be_able_to_see_a_confirmation_screen_so_that_I_know_that_the_transfer_is_done()  {
		payment.I_SHOULD_SEE_CONFORMATION_SO_THAT_I_KNOW_PAYMENT_IS_DONE();
	}

	@Then("^Mob_I should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment$")
	public void mob_i_should_be_able_to_see_two_buttons_New_Payment_and_Overview_when_click_overview_should_take_me_back_to_the_first_screen_of_payment
			() throws Throwable {
		payment.I_SHOULD_BE_ABLE_TO_SEE_NEW_PAYMENT_OVERVIEW_BUTTONS_WHEN_CLICKED_OVERVIEW_SHOULD_TAKE_ME_FIRST_SCREEN_OF_PAYMENT();
	}

	@Given("^Mob_I am logged into online banking$")
	public void mob_iAmLoggedIntoOnlineBanking() {
		try {
			login.user_launch_prepaid_web_application();
			login.user_enters_username_and_password(Foundation_DataFactory.uname, Foundation_DataFactory.pwd);
			login.user_clicks_on_Login();
			//login.user_must_logon_to_Money_Web_application();
		} catch (Exception error) {
			log.info("Unable to Login due to this error message" + error.getMessage());
	}



	}}
