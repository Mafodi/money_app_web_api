package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.FND_Payment_Flow;
import platforms.ui.Web.Foundation_DataFactory;
import utils.CommonFunctions;

public class FND_Pay_Beneficiary_Account extends CommonFunctions {
    FND_Payment_Flow payment = new FND_Payment_Flow();
    LoginSteps login = new LoginSteps();
    private static Logger log = Logger.getLogger(LoginSteps.class);


    // PayToBenPositive started

    @Given("^Pmt_I am Logged in to Banking web app with username\"([^\"]*)\" and password\"([^\"]*)\"$")
    public void Pmt_i_am_Logged_in_to_Banking_web_app_with_username_and_password(String arg1, String arg2) {

        try {
            login.user_launch_prepaid_web_application();
            login.user_enters_username_and_password(Foundation_DataFactory.CCUser, Foundation_DataFactory.CCUserPassword);
            login.user_clicks_on_Login();
            login.user_must_logon_to_Money_Web_application();
        } catch (Exception error) {
            log.info("Unable to Login due to this error message" + error.getMessage());
        }
    }

    @When("^I Navigate to the Pay function$")
    public void i_Navigate_to_the_Pay_function() throws Throwable {
        payment.I_NAVIGATE_TO_THE_PAY_FUNCTION("Single Payment");

    }

    @And("^I should be able to click on view list icon to access the bank approved beneficiaries\\. Clicking on it will take to next screen with view all list$")
    public void i_should_be_able_to_click_on_view_list_icon_to_access_the_bank_approved_beneficiaries_Clicking_on_it_will_take_to_next_screen_with_view_all_list() {
        payment.I_SHOULD_CLICK_ON_THE_BANK_APPROVED_BENEFICIARIES_AND_IT_WILL_TAKE_TO_NEXT_SCREEN_WITH_VIEW_ALL_LIST();

    }

    @And("^I should be able to search by name, mobile number or account no\\. and the records will auto filter based on the characters inputted\"([^\"]*)\",\"([^\"]*)\"$")
    public void i_should_be_able_to_search_by_name_mobile_number_or_account_no_and_the_records_will_auto_filter_based_on_the_characters_inputted(String strRecipientType, String strRecipient) throws Throwable {
        payment.SHOULD_SEARCH_BY_NAME_OR_MOBILE_NUMBER_OR_ACCOUNT_NO_AND_RECORDS_WILL_AUTO_FILTER_BASED_ON_CHARACTERS_INPUTTED(strRecipientType, strRecipient);

    }

    @When("^I should be able to select from my list of beneficiaries\"([^\"]*)\"$")
    public void i_should_be_able_to_select_from_my_list_of_beneficiaries(String StrRecipient) {
        payment.I_SHOULD_BE_ABLE_TO_SELECT_FROM_MY_LIST_OF_BENEFICIARIES(StrRecipient);

    }

    @And("^I should be able to see the next steps header$")
    public void i_should_be_able_to_see_the_next_steps_header()  {
        payment.I_SHOULD_BE_ABLE_TO_SEE_THE_NEXT_STEPS_HEADER();

    }

    @And("^PB_After clicking on Next I should be able to move to the How much would you like to pay screen$")
    public void pb_after_clicking_on_Next_I_should_be_able_to_move_to_the_How_much_would_you_like_to_pay_screen() {
        payment.HOW_MUCH_WOULD_YOU_LIKE_TO_PAY_SCREEN_VALIDATION();
    }

    @And("^PB_I want to capture the amount\"([^\"]*)\" to pay$")
    public void pb_i_want_to_capture_the_amount_to_pay(String amount) throws InterruptedException {
        payment.PB_I_WANT_TO_CAPTURE_THE_AMOUNT(amount);
    }

    @When("^PTB_INS When I click on the instant payment toggle I must see the instant payment message$")
    public void ptb_ins_When_I_click_on_the_instant_payment_toggle_I_must_see_the_instant_payment_message() {
        payment.WHEN_I_WHEN_I_CLICK_ON_THE_INSTANT_PAYMENT_TOGGLE_I_MUST_SEE_THE_INSTANT_PAYMENT_MESSAGE();
    }

    @When("^PTB_INS If it's instant payment then show text instant payment in the Date field else show only the date$")
    public void ptb_ins_If_it_s_instant_payment_then_show_text_instant_payment_in_the_Date_field_else_show_only_the_date() {
        payment.IF_IT_INSTANT_PAYMENT_THEN_SHOW_TEXT_INSTANT_PAYMENT_IN_THE_DATE_FIELD_ELSE_SHOW_ONLY_THE_DATE();
    }

    @And("^PB_I should be able to select account\"([^\"]*)\"$")
    public void pb_i_should_be_able_to_select_account(String strAccount) {
        payment.PB_I_SHOULD_BE_ABLE_TO_SELECT_ACCOUNT(strAccount);
    }

    @And("^PB_The next button on this page should be disabled until the user completed all fields\"([^\"]*)\" and there are no errors$")
    public void pb_the_next_button_on_this_page_should_be_disabled_until_the_user_completed_all_fields_and_there_are_no_errors(String St2Done)  {
        payment.NEXT_BUTTON_CLICK_WITH_OUT_ERRORS(St2Done);
    }

    @And("^PB_I enter Your reference\"([^\"]*)\"$")
    public void pb_i_enter_Your_reference(String strYourRef) {
        payment.I_ENTER_YOUR_REFERENCE(strYourRef);
    }


    @And("^PB_I choose the notification method\"([^\"]*)\"$")
    public void pb_i_choose_the_notification_method(String strNotificationMethod) {
        payment.I_CHOOSE_THE_NOTIFICATION_METHOD(strNotificationMethod);

    }

    @And("^PB_I enter notification value\"([^\"]*)\" appropriate to method\"([^\"]*)\" chosen$")
    public void pb_i_enter_notification_value_appropriate_to_method_chosen(String strNotificationValue, String
            strNotificationMethod) throws Throwable {
        payment.NOTIFICATION_VALUE_TO_THE_APPROPRIATE_METHOD(strNotificationValue, strNotificationMethod);
    }

    @And("^PB_I click on the Next button$")
    public void pb_i_click_on_the_Next_button() {
        payment.I_CLICK_ON_THE_NEXT_BUTTON();

    }

    @And("^PB_I should be able to see Payment from account type\"([^\"]*)\"$")
    public void pb_i_should_be_able_to_see_Payment_from_account_type(String strAccountType) {
        payment.I_SHOULD_BE_ABLE_TO_SEE_PAYMENT_FROM_ACCOUNT_TYPE(strAccountType);

    }

    @When("^PB_I should be able to see payment your reference\"([^\"]*)\"$")
    public void pb_i_should_be_able_to_see_payment_your_referencee(String strYourReff) {
        payment.I_SHOULD_BE_ABLE_TO_SEE_PAYMENT_YOUR_REFERENCE(strYourReff);

    }

    @And("^PB_I should be able to click on PAY to confirm the payment$")
    public void pb_i_should_be_able_to_click_on_PAY_to_confirm_the_payment()  {
        payment.I_SHOULD_BE_ABLE_TO_CLICK_ON_PAY_TO_CONFIRM_PAYMENT();

    }

    @Then("^I should be able to see a confirmation screen so that I know that the payment is done$")
    public void i_should_be_able_to_see_a_confirmation_screen_so_that_I_know_that_the_payment_is_done() {
        payment.I_SHOULD_SEE_CONFORMATION_SO_THAT_I_KNOW_PAYMENT_IS_DONE();

    }

    @Then("^I must be able to the see the recipient detail\"([^\"]*)\"$")
    public void i_must_be_able_to_the_see_the_recipient_detail(String strRecipient) {
        payment.I_MUST_ABLE_TO_SEE_RECIPIENT_MOBILE_DETAILS(strRecipient);


    }

    @Then("^PB_I must be able to see the payment amount\"([^\"]*)\"$")
    public void pb_i_must_be_able_to_see_the_payment_amount(String arg1) {
        payment.I_MUST_ABLE_TO_SEE_PAYMENT_AMOUNT();

    }

    @Then("^PB_I must be able to see Transaction number displayed$")
    public void pb_i_must_be_able_to_see_Transaction_number_displayed() {
        payment.I_MUST_ABLE_TO_SEE_TRANSACTION_NUMBER();
    }

    @Then("^PB_I must be able to see the Payment date$")
    public void pb_i_must_be_able_to_see_the_Payment_date() {
        payment.I_MUST_ABLE_TO_SEE_PAYMENT_DATE();

    }

    @Then("^PB_I should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment$")
    public void pb_i_should_be_able_to_see_two_buttons_New_Payment_and_Overview_when_click_overview_should_take_me_back_to_the_first_screen_of_payment
            () throws Throwable {
        payment.I_SHOULD_BE_ABLE_TO_SEE_NEW_PAYMENT_OVERVIEW_BUTTONS_WHEN_CLICKED_OVERVIEW_SHOULD_TAKE_ME_FIRST_SCREEN_OF_PAYMENT();
    }

    //PayToBenPositive end


    //PayToBenPositiveSmoke started


    @When("^P_B_I_navigate to the Pay function$")
    public void p_b_i_navigate_to_the_Pay_function() throws Throwable {
        Thread.sleep(1000);
        payment.I_NAVIGATE_TO_THE_PAY_FUNCTION("Single Payment");
        log.info("user able to clicks on PAY and Single Payment");

    }

    @When("^P_B_I should be able to click on view list icon to access the bank approved beneficiaries\\. Clicking on it will take to next screen with view all list$")
    public void p_b_i_should_be_able_to_click_on_view_list_icon_to_access_the_bank_approved_beneficiaries_Clicking_on_it_will_take_to_next_screen_with_view_all_list
            () {
        payment.I_SHOULD_CLICK_ON_THE_BANK_APPROVED_BENEFICIARIES_AND_IT_WILL_TAKE_TO_NEXT_SCREEN_WITH_VIEW_ALL_LIST();
        log.info("user able to get bank approved beneficiaries");
    }


    @When("^P_B_I should be able to search by name, mobile number or account no\\. and the records will auto filter based on the characters inputted\"([^\"]*)\",\"([^\"]*)\"$")
    public void p_b_i_should_be_able_to_search_by_name_mobile_number_or_account_no_and_the_records_will_auto_filter_based_on_the_characters_inputted
            (String strRecipientType, String strRecipient) throws Throwable {
        payment.SHOULD_SEARCH_BY_NAME_OR_MOBILE_NUMBER_OR_ACCOUNT_NO_AND_RECORDS_WILL_AUTO_FILTER_BASED_ON_CHARACTERS_INPUTTED(strRecipientType, strRecipient);
        log.info("user searches beneficiaries by name or mobile number and account number");
    }

    @When("^P_B_I should be able to see the next steps header$")
    public void p_b_i_should_be_able_to_see_the_next_steps_header() {
        payment.I_SHOULD_BE_ABLE_TO_SEE_THE_NEXT_STEPS_HEADER();

    }

    @When("^P_B_After clicking on Next I should be able to move to the How much would you like to pay screen$")
    public void p_b_after_clicking_on_Next_I_should_be_able_to_move_to_the_How_much_would_you_like_to_pay_screen()  {
        payment.HOW_MUCH_WOULD_YOU_LIKE_TO_PAY_SCREEN_VALIDATION();
    }

    @When("^P_B_I want to capture the amount\"([^\"]*)\" to pay$")
    public void p_b_i_want_to_capture_the_amount_to_pay(String amount) throws InterruptedException {
        payment.PB_I_WANT_TO_CAPTURE_THE_AMOUNT(amount);
    }

    @When("^P_B_I should be able to select account\"([^\"]*)\"$")
    public void p_b_i_should_be_able_to_select_account(String strAccount) {
        payment.PB_I_SHOULD_BE_ABLE_TO_SELECT_ACCOUNT(strAccount);

    }

    @When("^P_B_I The next button on this page should be disabled until the user completed all fields\"([^\"]*)\" and there are no errors$")
    public void p_b_the_next_button_on_this_page_should_be_disabled_until_the_user_completed_all_fields_and_there_are_no_errors(String St2Done)  {
        payment.NEXT_BUTTON_CLICK_WITH_OUT_ERRORS(St2Done);
    }

    @When("^P_B_I enter Your reference\"([^\"]*)\"$")
    public void p_b_i_enter_Your_reference(String strYourRef) {

        payment.I_ENTER_YOUR_REFERENCE(strYourRef);

    }

    @When("^P_B_I enter Their reference\"([^\"]*)\"$")
    public void p_b_i_enter_Their_reference(String strTheirRef) {

        payment.I_ENTER_THEIR_REFERENCE(strTheirRef);
    }

    @When("^P_B_I choose the notification method\"([^\"]*)\"$")
    public void p_b_i_choose_the_notification_method(String strNotificationMethod) {
        payment.I_CHOOSE_THE_NOTIFICATION_METHOD(strNotificationMethod);

    }

    @When("^P_B_I enter notification value\"([^\"]*)\" appropriate to method\"([^\"]*)\" chosen$")
    public void p_b_i_enter_notification_value_appropriate_to_method_chosen(String strNotificationValue, String strNotificationMethod) throws Throwable {
        payment.NOTIFICATION_VALUE_TO_THE_APPROPRIATE_METHOD(strNotificationValue, strNotificationMethod);

    }

    @When("^P_B_I click on the Next button$")
    public void p_b_i_click_on_the_Next_button() {
        payment.I_CLICK_ON_THE_NEXT_BUTTON();

    }

    @When("^P_B_I should be able to see Payment from account type\"([^\"]*)\"$")
    public void p_b_i_should_be_able_to_see_Payment_from_account_type(String strAccountType) {
        payment.I_SHOULD_BE_ABLE_TO_SEE_PAYMENT_FROM_ACCOUNT_TYPE(strAccountType);

    }

    @When("^P_B_I_should be able to see payment your reference\"([^\"]*)\"")
    public void p_b_i_should_be_able_to_see_payment_your_reference(String strYourReff) {

        payment.I_SHOULD_BE_ABLE_TO_SEE_PAYMENT_YOUR_REFERENCE(strYourReff);

    }

    @When("^P_B_I should be able to click on PAY to confirm the payment$")
    public void p_b_i_should_be_able_to_click_on_PAY_to_confirm_the_payment()  {
        payment.I_SHOULD_BE_ABLE_TO_CLICK_ON_PAY_TO_CONFIRM_PAYMENT();

    }

    @Then("^P_B_I should be able to see a confirmation screen so that I know that the payment is done$")
    public void pb_i_should_be_able_to_see_a_confirmation_screen_so_that_I_know_that_the_payment_is_done() {
        payment.I_SHOULD_SEE_CONFORMATION_SO_THAT_I_KNOW_PAYMENT_IS_DONE();

    }

    @Then("^P_B_I must be able to the see the recipient detail\"([^\"]*)\"$")
    public void p_b_i_must_be_able_to_the_see_the_recipient_detail(String strRecipient) {
        payment.P_B_I_MUST_ABLE_TO_SEE_RECIPIENT_DETAILS(strRecipient);

    }

    @Then("^P_B_I must be able to see the payment amount\"([^\"]*)\"$")
    public void p_b_i_must_be_able_to_see_the_payment_amount(String amount) {
        payment.I_MUST_ABLE_TO_SEE_PAYMENT_AMOUNT();

    }

    @Then("^P_B_I must be able to see Transaction number displayed$")
    public void p_b_i_must_be_able_to_see_Transaction_number_displayed() {
        payment.I_MUST_ABLE_TO_SEE_TRANSACTION_NUMBER();

    }

    @Then("^P_B_I must be able to see the Payment date$")
    public void p_b_i_must_be_able_to_see_the_Payment_date() {
        payment.I_MUST_ABLE_TO_SEE_PAYMENT_DATE();

    }

    @Then("^P_B_I should be able to see two buttons - New Payment and Overview- when click overview should take me back to the first screen of payment$")
    public void p_b_i_should_be_able_to_see_two_buttons_New_Payment_and_Overview_when_click_overview_should_take_me_back_to_the_first_screen_of_payment() throws Throwable {
        payment.I_SHOULD_BE_ABLE_TO_SEE_NEW_PAYMENT_OVERVIEW_BUTTONS_WHEN_CLICKED_OVERVIEW_SHOULD_TAKE_ME_FIRST_SCREEN_OF_PAYMENT();

    }

    //@PayToBenPositiveSmoke "END"


    // @RepeatPayToBenPositive  "START"

    @Given("^Given Rec_I am logged in to Banking web app with username\"([^\"]*)\" and password\"([^\"]*)\"$")
    public void given_Rec_I_am_logged_in_to_Banking_web_app_with_username_and_password(String userName, String password) {
        payment.REC_I_AM_LOGGED_IN_TO_BANKING_WEB_APP_WITH_USERNAME_AND_PASSWORD(userName, password);
    }

    @When("^RPT_I can select the Recipients service from the menu bar present at the top of my WEB login view$")
    public void rpt_i_can_select_the_Recipients_service_from_the_menu_bar_present_at_the_top_of_my_WEB_login_view()  {

        payment.I_NAVIGATE_TO_THE_RECIPIENTS_FUNCTION();
    }

    @When("^RPT_I can search for a desired beneficiary\"([^\"]*)\",\"([^\"]*)\"$")
    public void rpt_i_can_search_for_a_desired_beneficiary(String strRecipientType, String strRecipient) throws InterruptedException {
        payment.I_CAN_SEARCH_FOR_DESIRED_BENEFICIARY(strRecipientType, strRecipient);
    }

    @When("^RPT_I should be able to select a Beneficiary of my preference from the list of Beneficiary listed under My Recipient$")
    public void rpt_i_should_be_able_to_select_a_Beneficiary_of_my_preference_from_the_list_of_Beneficiary_listed_under_My_Recipient() {
        payment.I_SHOULD_BE_ABLE_TO_SELECT_BENEFICIARY_OF_MY_PREFERENCE_FROM_THE_LIST_OF_BENEFICIARY_LISTED_UNDER_MY_RECIPIENT();

    }

    @When("^RPT_I On selecting a Beneficiary of my preference, the Right side of the Page I have the option to repeat payment made to the recipient\\. 'Pay again'$")
    public void rpt_i_On_selecting_a_Beneficiary_of_my_preference_the_Right_side_of_the_Page_I_have_the_option_to_repeat_payment_made_to_the_recipient_Pay_again() {
        payment.ON_SELECTING_BENEFICIARY_OF_MY_PREFERENCE_RIGHT_SIDE_OF_THE_PAGE_SELECT_THE_OPTION_TO_REPEAT_LAST_PAYMENTS_MADE_TO_RECIPIENT_PAY_AGAIN();

    }

    @When("^RPT_If I select this option I am taken to step one of 'Review payment details'$")
    public void rpt_if_I_select_this_option_I_am_taken_to_step_one_of_Review_payment_details() {
        payment.RPT_IF_I_SELECT_THIS_OPTION_I_AM_ABLE_TO_STEP_ONE_OF_REVIEW_PAYMENT_DETAILS();
    }

    @When("^RPT_The details are exactly as the payment I am repeating\"([^\"]*)\"$")
    public void rpt_the_details_are_exactly_as_the_payment_I_am_repeating(String strRecepient) {
        payment.RPT_THE_DETAILS_ARE_EXACTLY_AS_THE_PAYMENT_I_AM_REPEATING(strRecepient);
    }

    @When("^RPT_I can view but cant edit the Recipient, Bank, and Payment date$")
    public void rpt_i_can_view_but_cant_edit_the_Recipient_Bank_and_Payment_date() {
        payment.RPT_I_CAN_VIEW_BUT_CANT_EDIT_THE_RECEPIENT_BANK_PAYMENT_DATE();
    }

    @When("^RPT_I should be able to select account\"([^\"]*)\"$")
    public void rpt_i_should_be_able_to_select_account(String strAccount) {
        payment.PB_I_SHOULD_BE_ABLE_TO_SELECT_ACCOUNT(strAccount);
    }

    @When("^RPT_I want to capture the amount\"([^\"]*)\" to pay$")
    public void rpt_i_want_to_capture_the_amount_to_pay(String amount) throws InterruptedException {
        payment.PB_I_WANT_TO_CAPTURE_THE_AMOUNT(amount);
    }

    @When("^RPT_I enter Your reference\"([^\"]*)\"$")
    public void rpt_i_enter_Your_reference(String strYourRef) {
        payment.I_ENTER_YOUR_REFERENCE(strYourRef);
    }

    @When("^RPT_I enter Their reference\"([^\"]*)\"$")
    public void rpt_i_enter_Their_reference(String strTheirRef) {
        payment.I_ENTER_THEIR_REFERENCE(strTheirRef);
    }

    @When("^RPT_I choose the notification method\"([^\"]*)\"$")
    public void rpt_i_choose_the_notification_method(String strNotificationMethod) {
        payment.I_CHOOSE_THE_NOTIFICATION_METHOD(strNotificationMethod);
    }

    @When("^RPT_I enter notification value\"([^\"]*)\" appropriate to method\"([^\"]*)\" chosen$")
    public void rpt_i_enter_notification_value_appropriate_to_method_chosen(String strNotificationValue, String strNotificationMethod) throws Throwable {
        payment.NOTIFICATION_VALUE_TO_THE_APPROPRIATE_METHOD(strNotificationValue, strNotificationMethod);
    }

    @When("^RPT_I must select option Pay$")
    public void rpt_i_must_select_option_Pay() {
        payment.I_MUST_SELECT_OPTION_PAY();

    }

    @Then("^RPT_ I should be able to see a confirmation screen so that I know that the payment is done$")
    public void rpt__I_should_be_able_to_see_a_confirmation_screen_so_that_I_know_that_the_payment_is_done() {
        payment.RPT_I_SHOULD_SEE_CONFORMATION_SO_THAT_I_KNOW_PAYMENT_IS_DONE();
    }

    @Then("^RPT_I must be able to the see the recipient detail\"([^\"]*)\"$")
    public void rpt_i_must_be_able_to_the_see_the_recipient_detail(String strRecipient) throws Throwable {
        payment.RPT_I_MUST_ABLE_TO_SEE_RECIPIENT_DETAILS(strRecipient);

    }

    @Then("^RPT_I must be able to see the bank name and account number in the bank line$")
    public void rpt_i_must_be_able_to_see_the_bank_name_and_account_number_in_the_bank_line() {
        payment.RPT_I_MUST_BE_ABLE_TO_SEE_THE_BANK_NAME_AND_ACCOUNT_NUMBER_IN_THE_BANK_LINE();
    }

    @Then("^RPT_I must be able to see the payment amount\"([^\"]*)\"$")
    public void rpt_i_must_be_able_to_see_the_payment_amount(String amount) {
        payment.RPT_I_MUST_ABLE_TO_SEE_PAYMENT_AMOUNT(amount);
    }

    @Then("^RPT_I must be able to see Transaction number displayed$")
    public void rpt_i_must_be_able_to_see_Transaction_number_displayed() {
        payment.RPT_I_MUST_BE_ABLE_TO_SEE_TRANSACTION_NUMBER_DISPLAYED();
    }

    @Then("^RPT_I must be able to see the Payment date as today\"([^\"]*)\"$")
    public void rpt_i_must_be_able_to_see_the_Payment_date_as_today(String arg1) {
        payment.RPT_I_MUST_ABLE_TO_SEE_PAYMENT_DATE();
    }

    @Then("^RPT_I should be able to see two buttons - New Payment and Go to Overview$")
    public void rpt_i_should_be_able_to_see_two_buttons_New_Payment_and_Go_to_Overview() {
        payment.I_SHOULD_BE_ABLE_TO_SEE_TWO_BUTTONS_NEW_PAYMENT_AND_GO_TO_OVERVIEW();

    }

    @Then("^RPT_Clicking on new payment or Go To Overview should take me back to the first screen of payment\"([^\"]*)\"$")
    public void rpt_clicking_on_new_payment_or_Go_To_Overview_should_take_me_back_to_the_first_screen_of_payment(String EndPmtChoice) throws Throwable {
        payment.CLICKING_ON_NEW_PAYEMENT_OR_GO_TO_OVERVIEW_SHOULD_TAKE_ME_BACK_TO_THE_FIRST_SCREEN_OF_PAYMENT(EndPmtChoice);
    }

    @Then("^RPT I must select option Cancel or option Go back to cancel the payment and return to the recipient view\"([^\"]*)\"$")
    public void rpt_I_must_select_option_Cancel_or_option_Go_back_to_cancel_the_payment_and_return_to_the_recipient_view(String arg1) {
        payment.RPT_I_MUST_SELECT_OPTION_CANCEL_OR_OPTION_GO_BACK_TO_CANCEL_THE_PAYMENT_AND_RETURN_TO_THE_RECIPIENT_VIEW();
    }


    @When("^PTB_INS navigate to the Pay function$")
    public void ptb_ins_navigate_to_the_Pay_function() throws Throwable {
        payment.I_NAVIGATE_TO_THE_PAY_FUNCTION("Single Payment");
        log.info("user able to clicks on PAY and Single Payment");

    }

    @When("^PTB_INS should be able to click on view list icon to access the bank approved beneficiaries\\. Clicking on it will take to next screen with view all list$")
    public void ptb_ins_should_be_able_to_click_on_view_list_icon_to_access_the_bank_approved_beneficiaries_Clicking_on_it_will_take_to_next_screen_with_view_all_list() {
        payment.I_SHOULD_CLICK_ON_THE_BANK_APPROVED_BENEFICIARIES_AND_IT_WILL_TAKE_TO_NEXT_SCREEN_WITH_VIEW_ALL_LIST();
        log.info("user able to get bank approved beneficiaries");
    }

    @When("^PTB_INS should be able to search by name, mobile number or account no\\. and the records will auto filter based on the characters inputted\"([^\"]*)\",\"([^\"]*)\"$")
    public void ptb_ins_should_be_able_to_search_by_name_mobile_number_or_account_no_and_the_records_will_auto_filter_based_on_the_characters_inputted(String strRecipientType, String strRecipient) throws Throwable {
        payment.SHOULD_SEARCH_BY_NAME_OR_MOBILE_NUMBER_OR_ACCOUNT_NO_AND_RECORDS_WILL_AUTO_FILTER_BASED_ON_CHARACTERS_INPUTTED(strRecipientType, strRecipient);
        log.info("user searches beneficiaries by name or mobile number and account number");
    }

    @When("^PTB_I should be able to select from my list of beneficiaries\"([^\"]*)\"$")
    public void ptb_ins_i_should_be_able_to_select_from_my_list_of_beneficiaries(String StrRecipient) {
        payment.I_SHOULD_BE_ABLE_TO_SELECT_FROM_MY_LIST_OF_BENEFICIARIES(StrRecipient);

    }

    @When("^PTB_INS should be able to see the next steps header$")
    public void ptb_ins_should_be_able_to_see_the_next_steps_header()  {
        payment.I_SHOULD_BE_ABLE_TO_SEE_THE_NEXT_STEPS_HEADER();

    }

    @When("^PTB_INS_After clicking on Next I should be able to move to the How much would you like to pay screen$")
    public void ptb_ins_after_clicking_on_Next_I_should_be_able_to_move_to_the_How_much_would_you_like_to_pay_screen() {
        payment.HOW_MUCH_WOULD_YOU_LIKE_TO_PAY_SCREEN_VALIDATION();
    }

    @When("^PTB_INS_I want to capture the amount\"([^\"]*)\" to pay$")
    public void ptb_ins_i_want_to_capture_the_amount_to_pay(String amount) throws InterruptedException {
        payment.PB_I_WANT_TO_CAPTURE_THE_AMOUNT(amount);

    }


    // Started @DeleteBeneficiary
    @And("^DLT_I can search for a desired beneficiary to delete\"([^\"]*)\" \"([^\"]*)\"$")
    public void rpn_iCanSearchForADesiredBeneficiaryToDelete(String strRecipientTpye, String strRecipient) throws Throwable {
        payment.I_CAN_SEARCH_FOR_DESIRED_BENEFICIARY_TO_DELETE(strRecipientTpye, strRecipient);

    }

    @And("^DLT_I should be able to select a Beneficiary of my preference from the list of Beneficiary listed under My Recipient$")
    public void DLT_i_should_be_able_to_select_a_Beneficiary_of_my_preference_from_the_list_of_Beneficiary_listed_under_My_Recipient() {
        payment.I_SHOULD_BE_ABLE_TO_SELECT_A_BENEFICIARY_OF_MY_PREFERENCE_FROM_THE_LIST_OF_BENEFICIARY_LISTED_UNDER_MY_RECIPIENT();

    }

    @And("^DLT_On selecting a Beneficiary of my preference, the Right side of the Page I have the option to edit or add details$")
    public void dlt_On_selecting_a_Beneficiary_of_my_preference_the_Right_side_of_the_Page_I_have_the_option_to_edit_or_add_details() {
        payment.ON_SELECTING_A_BENEFICIARY_OF_MY_PREFERENCE_THE_RIGHT_SIDE_OF_THE_PAGE_I_HAVE_THE_OPTION_TO_EDIT_OR_ADD_DETAILS();
    }


    @And("^DLT_I_Should be able to see an option to delete button and click on it to delete$")
    public void dlt_i_should_be_able_to_see_an_option_to_delete_button_and_click_on_it_to_delete() {
        payment.I_SHOULD_BE_ABLE_TO_SEE_AN_OPTION_TO_DELETE_RECIPIENT_BUTTON_AND_SELECT_TO_DELETE();
    }

    @Then("^DLT_I Should be able to confirm delete or cancel buttons and select one among them$")
    public void dlt_i_Should_be_able_to_confirm_delete_or_cancel_buttons_and_select_one_among_them() {
        payment.I_SHOULD_BE_BE_TO_CONFIRM_DELETE_OPTION_OR_CANCEL_BUTTONS_AND_SELECT_ONE_AMONG_THEM();
    }
    @When("^DLT_I Should be able to confirm delete$")
    public void dlt_i_Should_be_able_to_confirm_delete()  {
        payment.I_SHOULD_CONFIRM_BENEFICIARY_DELETE();

    }
    @Then("^On selecting the delete button i should get a success message that the recipient was deleted successfully$")
    public void on_selecting_the_delete_button_i_should_get_a_success_message_that_the_recipient_was_deleted_successfully()  {
       payment.I_SHOULD_GET_SUCCESS_MESSAGE_AFTER_DELETED();
    }

    //Future dated payments Step Definitions


    @When("^I should be able to select the future date$")
    public void i_should_be_able_to_select_the_future_date()  {

        payment.I_SHOULD_BE_ABLE_TO_SELECT_THE_FUTURE_DATE();
    }
    //Weekly reccuring payments with end date


    @When("^I should be able to select repeat payment option\"([^\"]*)\"$")
    public void i_should_be_able_to_select_repeat_payment_option(String Repeat_Option)  {
        payment.I_SHOULD_BE_ABLE_TO_SELECT_REPEAT_PAYMENT_OPTION(Repeat_Option);
    }

//Weekly reccuring payments with Occurrences

    @When("^I should able to click on Occurrences and enter number of Occurrences\"([^\"]*)\"$")
    public void i_should_able_to_click_on_Occurrences_and_enter_number_of_Occurrences(String Occurrences)  {
        payment.I_SHOULD_ABLE_TO_CLICK_ON_OCCURRENCES_AND_ENTER_NUMBER_OF_OCCURRENCES(Occurrences);

    }
}