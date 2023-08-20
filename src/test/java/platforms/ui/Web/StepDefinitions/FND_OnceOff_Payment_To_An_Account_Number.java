package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import platforms.ui.Web.FlowModel.FND_Payment_Flow;
import platforms.ui.Web.Foundation_DataFactory;
import utils.CommonFunctions;

public class FND_OnceOff_Payment_To_An_Account_Number extends CommonFunctions {

    LoginSteps login = new LoginSteps();
    FND_Payment_Flow payment = new FND_Payment_Flow();
    private static Logger log = Logger.getLogger(LoginSteps.class);


    @Given("^Pmt_I am logged in to Banking web app with username\"([^\"]*)\" and password\"([^\"]*)\"$")
    public void pmt_i_am_logged_in_to_Banking_web_app_with_username_and_password(String arg1, String arg2)  {

        try {
            login.user_launch_prepaid_web_application();
            login.user_enters_username_and_password(Foundation_DataFactory.CCUser, Foundation_DataFactory.CCUserPassword );
            login.user_clicks_on_Login();
        } catch (Exception error) {
            logger.info("Unable to Login due to this error message" + error.getMessage());
        }
    }
    @When("^INS I navigate to the Pay function$")
    public void INS_i_navigate_to_the_Pay_function() throws Throwable {
        Thread.sleep(2000);
        payment.I_NAVIGATE_TO_THE_PAY_FUNCTION("Single Payment");
        log.info("user able to clicks on PAY and Single Payment");

    }

    @When("^I should be able to Enter new recipient name\"([^\"]*)\"$")
    public void i_should_be_able_to_Enter_new_recipient_name(String strRecipientName)  {
        payment.I_MUST_BE_ABLE_TO_CAPTURE_THE_RECIPIENT_NAME(strRecipientName);
    }

    @When("^I click on the method of payment-pay to bank account$")
    public void i_click_on_the_method_of_payment_pay_to_bank_account() throws Throwable {
        payment.I_CLICK_ON_THE_METHOD_OF_PAYMENT_PAY_TO_BANK_ACCOUNT();

    }

    @When("^I enter Bank name\"([^\"]*)\"$")
    public void i_enter_Bank_name(String strBkName) throws Throwable {

        payment.I_ENTER_BANK_NAME(strBkName);
    }

    @When("^I enter Account No\"([^\"]*)\"$")
    public void i_enter_Account_No(String AccNumber)  {
        payment.I_ENTER_ACCOUNT_NO(AccNumber);

    }

    @When("^Select alpha field with the label Account type\"([^\"]*)\" for adding the Bank Account Details$")
    public void select_alpha_field_with_the_label_Account_type_for_adding_the_Bank_Account_Details(String AccType)  {
        payment.SELECT_ACCOUNT_TYPE(AccType);

    }

    @When("^I should be able to see the next button and click it$")
    public void i_should_be_able_to_see_the_next_button_and_click_it()  {
        payment.I_SHOULD_BE_ABLE_TO_SEE_THE_NEXT_STEPS_HEADER();

    }

    @When("^After clicking on Next I should be able to move to the How much would you like to pay screen$")
    public void after_clicking_on_Next_I_should_be_able_to_move_to_the_How_much_would_you_like_to_pay_screen()  {
        payment.HOW_MUCH_WOULD_YOU_LIKE_TO_PAY_SCREEN_VALIDATION();
    }

    @When("^I want to capture the amount\"([^\"]*)\" to pay$")
    public void i_want_to_capture_the_amount_to_pay(String amount) throws Throwable {
        payment.PB_I_WANT_TO_CAPTURE_THE_AMOUNT(amount);

    }

    @When("^I should be able to select account\"([^\"]*)\"$")
    public void i_should_be_able_to_select_account(String strAccount)  {
        payment.PB_I_SHOULD_BE_ABLE_TO_SELECT_ACCOUNT(strAccount);

    }

    @When("^The next button on this page should be disabled until the user completed all fields\"([^\"]*)\" and there are no errors$")
    public void the_next_button_on_this_page_should_be_disabled_until_the_user_completed_all_fields_and_there_are_no_errors(String St2Done)  {
        payment.NEXT_BUTTON_CLICK_WITH_OUT_ERRORS(St2Done);
    }

    @When("^I enter Your reference\"([^\"]*)\"$")
    public void i_enter_Your_reference(String strYourRef)  {

        payment.I_ENTER_YOUR_REFERENCE(strYourRef);
    }

    @When("^I enter Their reference\"([^\"]*)\"$")
    public void i_enter_Their_reference(String strTheirRef)
    {
        payment.I_ENTER_THEIR_REFERENCE(strTheirRef);
    }

    @When("^I choose the notification method\"([^\"]*)\"$")
    public void i_choose_the_notification_method(String strNotificationMethod)
    {
        payment.I_CHOOSE_THE_NOTIFICATION_METHOD(strNotificationMethod);
    }

    @When("^I enter notification value\"([^\"]*)\" appropriate to method\"([^\"]*)\" chosen$")
    public void i_enter_notification_value_appropriate_to_method_chosen(String strNotificationValue, String strNotificationMethod) throws Throwable {
        payment.NOTIFICATION_VALUE_TO_THE_APPROPRIATE_METHOD(strNotificationValue, strNotificationMethod);
    }

    @When("^I click on the Next button$")
    public void i_click_on_the_Next_button()   {

        payment.I_CLICK_ON_THE_NEXT_BUTTON();
    }

    @When("^I should be able to see Payment from account type\"([^\"]*)\"$")
    public void i_should_be_able_to_see_Payment_from_account_type(String strAccountType)  {
        payment.I_SHOULD_BE_ABLE_TO_SEE_PAYMENT_FROM_ACCOUNT_TYPE(strAccountType);
    }

    @When("^I_should be able to see payment your reference\"([^\"]*)\"$")
    public void i_should_be_able_to_see_payment_your_reference(String strYourReff)  {
        payment.I_SHOULD_BE_ABLE_TO_SEE_PAYMENT_YOUR_REFERENCE(strYourReff);
    }

    @When("^The save beneficiary toggle should be able to be turned on and off by the user either sliding the toggle or clicking on it\"([^\"]*)\"$")
    public void the_save_beneficiary_toggle_should_be_able_to_be_turned_on_and_off_by_the_user_either_sliding_the_toggle_or_clicking_on_it(String arg1)  {
        payment.SAVE_BENEFICIARY_OPTION_SHOULD_BE_TURNED_OFF();
    }

    @When("^I should be able to click on PAY to confirm the payment$")
    public void i_should_be_able_to_click_on_PAY_to_confirm_the_payment()  {
        payment.I_SHOULD_BE_ABLE_TO_CLICK_ON_PAY_TO_CONFIRM_PAYMENT();

    }

    @Then("^should be able to see a confirmation screen so that I know that the payment is done$")
    public void should_be_able_to_see_a_confirmation_screen_so_that_I_know_that_the_payment_is_done()  {
        payment.I_SHOULD_SEE_CONFORMATION_SO_THAT_I_KNOW_PAYMENT_IS_DONE();

    }

    @Then("^I must be able to the see the recipient details\"([^\"]*)\"$")
    public void i_must_be_able_to_the_see_the_recipient_details(String strRecipient)  {
        payment.P_B_I_MUST_ABLE_TO_SEE_RECIPIENT_DETAILS(strRecipient);

    }

    @Then("^I_must be able to see the amount$")
    public void i_must_be_able_to_see_the_amount() {
        payment.I_MUST_ABLE_TO_SEE_PAYMENT_AMOUNT();

    }

    @Then("^I_must be able to see Transaction number displayed$")
    public void i_must_be_able_to_see_Transaction_number_displayed()  {
        payment.I_MUST_ABLE_TO_SEE_TRANSACTION_NUMBER();
    }

    @Then("^I_must be able to see the Payment date$")
    public void i_must_be_able_to_see_the_Payment_date()
    {
        payment.I_MUST_ABLE_TO_SEE_PAYMENT_DATE();
    }

    @Then("^I_should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment$")
    public void i_should_be_able_to_see_two_buttons_New_Payment_and_Overview_when_click_overview_should_take_me_back_to_the_first_screen_of_payment() throws Throwable {
        payment.I_SHOULD_BE_ABLE_TO_SEE_NEW_PAYMENT_OVERVIEW_BUTTONS_WHEN_CLICKED_OVERVIEW_SHOULD_TAKE_ME_FIRST_SCREEN_OF_PAYMENT();
    }

}



