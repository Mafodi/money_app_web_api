package platforms.ui.Web.StepDefinitions;

import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.FND_Recipient_Flow;
import platforms.ui.Web.Foundation_DataFactory;
import utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * Description: Step definition for Add Recipient to for funds transfer.
 * @author CC312417
 *
 */
public class FND_Add_Recipient extends CommonFunctions {

    LoginSteps login = new LoginSteps();
    FND_Recipient_Flow beneficiary = new FND_Recipient_Flow();
    private static Logger log = Logger.getLogger(LoginSteps.class);

    @Given("^Rec_I am logged in to Banking web app with username\"([^\"]*)\" and password\"([^\"]*)\"$")
    public void rec_i_am_logged_in_to_Banking_web_app_with_username_and_password(String userName, String password) throws Throwable {
        beneficiary.REC_I_AM_LOGGED_IN_TO_BANKING_WEB_APP_WITH_USERNAME_AND_PASSWORD(userName,password);
    }

    @When("^I can select the Recipients service from the menu bar present at the top of my WEB login view$")
    public void i_can_select_the_Recipients_service_from_the_menu_bar_present_at_the_top_of_my_WEB_login_view() throws Throwable {
        beneficiary.I_CAN_SELECT_THE_RECIPIENTS_SERVICE_FROM_THE_MENU_BAR_PRESENT_AT_THE_TOP_OF_MY_WEB_LOGIN_VIEW();
    }

    @When("^I should be able to select the Add a new recipient service link$")
    public void i_should_be_able_to_select_the_Add_a_new_recipient_service_link() throws Throwable {
        beneficiary.I_SHOULD_BE_ABLE_TO_SELECT_THE_ADD_A_NEW_RECIPIENT_SERVICE_LINK();
    }

    @When("^Enter Editable Text field with Label Recipient Name\"([^\"]*)\"$")
    public void enter_Editable_Text_field_with_Label_Recipient_Name(String name) throws Throwable {
        beneficiary.ENTER_EDITABLE_TEXT_FIELD_WITH_LABEL_RECIPIENT_NAME(name);    }

    @When("^Click Button with label Add Email$")
    public void click_Button_with_label_Add_Email() throws Throwable {
        beneficiary.CLICK_BUTTON_WITH_LABEL_ADD_EMAIL();
    }

    @When("^Enter editable text field with the label Email address\"([^\"]*)\" for adding the recipient email address$")
    public void enter_editable_text_field_with_the_label_Email_address_for_adding_the_recipient_email_address(String email) throws Throwable {
        beneficiary.ENTER_EDITABLE_TEXT_FIELD_WITH_THE_LABEL_EMAIL_ADDRESS_FOR_ADDING_THE_RECIPIENT_EMAIL_ADDRESS(email);
    }

    @When("^Click Button with label Add cell phone number$")
    public void click_Button_with_label_Add_cell_phone_number() throws Throwable {
        beneficiary.CLICK_BUTTON_WITH_LABEL_ADD_CELL_PHONE_NUMBER();
    }

    @When("^Enter editable numeric field with the label Cell Phone Number\"([^\"]*)\" for adding the recipient cell phone number$")
    public void enter_editable_numeric_field_with_the_label_Cell_Phone_Number_for_adding_the_recipient_cell_phone_number(String phoneNo) throws Throwable {
        beneficiary.ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_CELL_PHONE_NUMBER_FOR_ADDING_THE_RECIPIENT_CELL_PHONE_NUMBER(phoneNo);
    }

    @When("^Click Button with label Add fax number$")
    public void click_Button_with_label_Add_fax_number() throws Throwable {
        beneficiary.CLICK_BUTTON_WITH_LABEL_ADD_FAX_NUMBER();
    }

    @When("^Enter Editable numeric field with the label Fax Number for adding the recipient fax number\"([^\"]*)\"$")
    public void enter_Editable_numeric_field_with_the_label_Fax_Number_for_adding_the_recipient_fax_number(String faxNo) throws Throwable {
        beneficiary.ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_FAX_NUMBER_FOR_ADDING_THE_RECIPIENT_FAX_NUMBER(faxNo);
    }

    @When("^Click Button with the label Cellphone Number$")
    public void click_Button_with_the_label_Cellphone_Number() throws Throwable {
        beneficiary.CLICK_BUTTON_WITH_THE_LABEL_CELLPHONE_NUMBER();
    }

    @When("^Enter editable numeric field with the label Cellphone Number\"([^\"]*)\" for adding the recipient prepaid cell number$")
    public void enter_editable_numeric_field_with_the_label_Cellphone_Number_for_adding_the_recipient_prepaid_cell_number(String cellphoneNo) throws Throwable {
        beneficiary.ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_CELLPHONE_NUMBER_FOR_ADDING_THE_RECIPIENT_PREPAID_CELL_NUMBER(cellphoneNo);
    }


    @When("^Click Button with label Add Bank Accounts$")
    public void click_Button_with_label_Add_Bank_Accounts() throws Throwable {
        beneficiary.CLICK_BUTTON_WITH_LABEL_ADD_BANK_ACCOUNTS();
    }

    @When("^Enter editable drop down field with label Bank\"([^\"]*)\" and I should be able to select one of the listed banks to add the bank account$")
    public void enter_editable_drop_down_field_with_label_Bank_and_I_should_be_able_to_select_one_of_the_listed_banks_to_add_the_bank_account(String bankName) throws Throwable {
        beneficiary.ENTER_EDITABLE_DROP_DOWN_FIELD_WITH_LABEL_BANK_AND_I_SHOULD_BE_ABLE_TO_SELECT_ONE_OF_THE_LISTED_BANKS_TO_ADD_THE_BANK_ACCOUNT(bankName);
    }

    @When("^Enter editable numeric field with the label Account number\"([^\"]*)\" for adding the recipients Bank Account Details$")
    public void enter_editable_numeric_field_with_the_label_Account_number_for_adding_the_recipients_Bank_Account_Details(String bankAccount) throws Throwable {
        beneficiary.ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_ACCOUNT_NUMBER_FOR_ADDING_THE_RECIPIENTS_BANK_ACCOUNT_DETAILS(bankAccount);
    }

    @When("^Enter editable alphanumeric field with the label Your reference\"([^\"]*)\"")
    public void enter_editable_alphanumeric_field_with_the_label_My_reference_for_adding_the_recipients_Bank_Account_Details(String yourReference) throws Throwable {
        beneficiary.ENTER_EDITABLE_ALPHANUMERIC_FIELD_WITH_THE_LABEL_MY_REFERENCE_FOR_ADDING_THE_RECIPIENTS_BANK_ACCOUNT_DETAILS(yourReference);
    }

    @When("^Enter editable alphanumeric field with the label Your reference for mobile recipient\"([^\"]*)\"")
    public void enter_editable_alphanumeric_field_with_the_label_My_reference_for_adding_the_recipients_Bank_Account_Details_cellphone_No(String yourReference) throws Throwable {
        beneficiary.ENTER_EDITABLE_ALPHANUMERIC_FIELD_WITH_THE_LABEL_MY_REFERENCE_FOR_ADDING_THE_RECIPIENTS_BANK_ACCOUNT_DETAILS_CELLPHONE_NO(yourReference);
    }

    @When("^Enter Editable Text field with Label Their Reference\"([^\"]*)\"$")
    public void enter_Editable_Text_field_with_Label_Their_Reference(String theirReference) throws Throwable {
        beneficiary.ENTER_EDITABLE_TEXT_FIELD_WITH_LABEL_THEIR_REFERENCE(theirReference);
    }

    @When("^Click Button with the label Add meter number$")
    public void click_Button_with_the_label_Add_meter_number() throws Throwable {
        beneficiary.CLICK_BUTTON_WITH_THE_LABEL_ADD_METER_NUMBER();
    }

    @When("^Click Button with the label Add credit card$")
    public void click_Button_with_the_label_Add_credit_card() throws Throwable {
        beneficiary.CLICK_BUTTON_WITH_THE_LABEL_ADD_CREDIT_CARD();
    }

    @When("^Enter editable numeric field with the label Credit card Number\"([^\"]*)\" for adding the credit card number$")
    public void enter_editable_numeric_field_with_the_label_Credit_card_Number_for_adding_the_credit_card_number(String creditCardNo) throws Throwable {
        beneficiary.ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_CREDIT_CARD_NUMBER_FOR_ADDING_THE_CREDIT_CARD_NUMBER(creditCardNo);
    }

    @When("^Enter editable field with the label Your Reference\"([^\"]*)\" for adding the Credit card recipient My reference$")
    public void enter_editable_field_with_the_label_Your_Reference_for_adding_the_Credit_card_recipient_My_reference(String yourReference) throws Throwable {
        beneficiary.ENTER_EDITABLE_FIELD_WITH_THE_LABEL_YOUR_REFERENCE_FOR_ADDING_THE_CREDIT_CARD_RECIPIENT_MY_REFERENCE(yourReference);
    }

    @When("^Enter editable field with the label Their Reference\"([^\"]*)\" for adding the Credit card recipient Their reference$")
    public void enter_editable_field_with_the_label_Their_Reference_for_adding_the_Credit_card_recipient_Their_reference(String theirReference) throws Throwable {
        beneficiary.ENTER_EDITABLE_FIELD_WITH_THE_LABEL_THEIR_REFERENCE_FOR_ADDING_THE_CREDIT_CARD_RECIPIENT_THEIR_REFERENCE(theirReference);
    }

    @When("^Enter editable numeric field with the label Meter Number\"([^\"]*)\" for adding the recipient electricity meter number$")
    public void enter_editable_numeric_field_with_the_label_Meter_Number_for_adding_the_recipient_electricity_meter_number(String meterNo) throws Throwable {
        beneficiary.ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_METER_NUMBER_FOR_ADDING_THE_RECIPIENT_ELECTRICITY_METER_NUMBER(meterNo);
    }

    @When("^Enter editable numeric field with the label Your Reference\"([^\"]*)\" for adding the recipient electricity meter number$")
    public void enter_editable_numeric_field_with_the_label_My_Reference_for_adding_the_recipient_electricity_meter_number(String yourReference) throws Throwable {
        beneficiary.ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_MY_REFERENCE_FOR_ADDING_THE_RECIPIENT_ELECTRICITY_METER_NUMBER(yourReference);
    }

    @When("^I should be able to select the Save button on providing all mandatory fields\\.$")
    public void i_should_be_able_to_select_the_Save_button_on_providing_all_mandatory_fields() throws Throwable {
        beneficiary.I_SHOULD_BE_ABLE_TO_SELECT_THE_SAVE_BUTTON_ON_PROVIDING_ALL_MANDATORY_FIELDS();
    }

    @Then("^On selecting the Save button I should get a failure or success message$")
    public void on_selecting_the_Save_button_I_should_get_a_failure_or_success_message() throws Throwable {
        beneficiary.ON_SELECTING_THE_SAVE_BUTTON_I_SHOULD_GET_A_FAILURE_OR_SUCCESS_MESSAGE();
    }

    @Then("^On selecting the Save button I should get a failure or success message for edit recipient$")
    public void on_selecting_the_Save_button_I_should_get_a_failure_or_success_message_for_edit_recipient() throws Throwable {
        beneficiary.ON_SELECTING_THE_SAVE_BUTTON_I_SHOULD_GET_A_FAILURE_OR_SUCCESS_MESSAGE();
    }

    @Then("^On selecting the Save button in success scenario The ApproveIT service must be invoked once the SAVE button is pressed I should be presented with the success message which reads 'Recipient has been saved successfully' on the right indented section$")
    public void on_selecting_the_Save_button_in_success_scenario_The_ApproveIT_service_must_be_invoked_once_the_SAVE_button_is_pressed_I_should_be_presented_with_the_success_message_which_reads_Recipient_has_been_saved_successfully_on_the_right_indented_section() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Add Recipient action in the previous step before selecting the save button\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void below_the_success_message_I_should_be_presented_with_the_text_area_with_all_the_field_names_labels_and_the_values_provided_during_the_Add_Recipient_action_in_the_previous_step_before_selecting_the_save_button(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14, String arg15, String arg16, String arg17, String arg18, String arg19, String arg20, String arg21) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Add Recipient action in the previous step before selecting the save button for add recipient\"([^\"]*)\"$")
    public void below_the_success_message_I_should_be_presented_with_the_text_area_with_all_the_field_names_labels_and_the_values_provided_during_the_Add_Recipient_action_in_the_previous_step_before_selecting_the_save_button(String accountNo) throws Throwable {
        //beneficiary.BELOW_THE_SUCCESS_MESSAGE_I_SHOULD_BE_PRESENTED_WITH_THE_TEXT_AREA_WITH_ALL_THE_FIELD_NAMES_LABELS_AND_THE_VALUES_PROVIDED_DURING_THE_ADD_RECIPIENT_ACTION_IN_THE_PREVIOUS_STEP_BEFORE_SELECTING_THE_SAVE_BUTTON(accountNo);
    }

    @Then("^Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Add Recipient action in the previous step before selecting the save button for add recipient for credit card\"([^\"]*)\"$")
    public void below_the_success_message_I_should_be_presented_with_the_text_area_with_all_the_field_names_labels_and_the_values_provided_during_the_Add_Recipient_action_in_the_previous_step_before_selecting_the_save_button_for_add_recipient_for_credit_card(String creditCardNo) throws Throwable {
        //beneficiary.BELOW_THE_SUCCESS_MESSAGE_I_SHOULD_BE_PRESENTED_WITH_THE_TEXT_AREA_WITH_ALL_THE_FIELD_NAMES_LABELS_AND_THE_VALUES_PROVIDED_DURING_THE_ADD_RECIPIENT_ACTION_IN_THE_PREVIOUS_STEP_BEFORE_SELECTING_THE_SAVE_BUTTON_FOR_ADD_RECIPIENT_FOR_CREDIT_CARD(creditCardNo);
    }

    @Then("^Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Add Recipient action in the previous step before selecting the save button for add recipient meter no\"([^\"]*)\"$")
    public void below_the_success_message_I_should_be_presented_with_the_text_area_with_all_the_field_names_labels_and_the_values_provided_during_the_Add_Recipient_action_in_the_previous_step_before_selecting_the_save_button_meter_no(String meterNo) throws Throwable {
        //beneficiary.BELOW_THE_SUCCESS_MESSAGE_I_SHOULD_BE_PRESENTED_WITH_THE_TEXT_AREA_WITH_ALL_THE_FIELD_NAMES_LABELS_AND_THE_VALUES_PROVIDED_DURING_THE_ADD_RECIPIENT_ACTION_IN_THE_PREVIOUS_STEP_BEFORE_SELECTING_THE_SAVE_BUTTON_METER_NO(meterNo);
    }

    @Then("^Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Add mobile Recipient action in the previous step before selecting the save button\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void below_the_success_message_I_should_be_presented_with_the_text_area_with_all_the_field_names_labels_and_the_values_provided_during_the_Add_mobile_Recipient_action_in_the_previous_step_before_selecting_the_save_button(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Add credit card Recipient action in the previous step before selecting the save button\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void below_the_success_message_I_should_be_presented_with_the_text_area_with_all_the_field_names_labels_and_the_values_provided_during_the_Add_credit_card_Recipient_action_in_the_previous_step_before_selecting_the_save_button(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14, String arg15) throws Throwable {
    }

    @Then("^Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Edit Recipient action in the previous step before selecting the save button\"([^\"]*)\"$")
    public void below_the_success_message_I_should_be_presented_with_the_text_area_with_all_the_field_names_labels_and_the_values_provided_during_the_Edit_Recipient_action_in_the_previous_step_before_selecting_the_save_button(String accountNo) throws Throwable {
        //beneficiary.BELOW_THE_SUCCESS_MESSAGE_I_SHOULD_BE_PRESENTED_WITH_THE_TEXT_AREA_WITH_ALL_THE_FIELD_NAMES_LABELS_AND_THE_VALUES_PROVIDED_DURING_THE_EDIT_RECIPIENT_ACTION_IN_THE_PREVIOUS_STEP_BEFORE_SELECTING_THE_SAVE_BUTTON(accountNo);
    }

    @Then("^Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Add electricity Recipient action in the previous step before selecting the save button\"([^\"]*)\"$")
    public void below_the_success_message_I_should_be_presented_with_the_text_area_with_all_the_field_names_labels_and_the_values_provided_during_the_Add_electricity_Recipient_action_in_the_previous_step_before_selecting_the_save_button(String meterNo) throws Throwable {
        beneficiary.BELOW_THE_SUCCESS_MESSAGE_I_SHOULD_BE_PRESENTED_WITH_THE_TEXT_AREA_WITH_ALL_THE_FIELD_NAMES_LABELS_AND_THE_VALUES_PROVIDED_DURING_THE_ADD_ELECTRICITY_RECIPIENT_ACTION_IN_THE_PREVIOUS_STEP_BEFORE_SELECTING_THE_SAVE_BUTTON(meterNo);
    }

}
