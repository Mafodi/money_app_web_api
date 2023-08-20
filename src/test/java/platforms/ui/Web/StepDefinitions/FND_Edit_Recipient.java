package platforms.ui.Web.StepDefinitions;

import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.FND_Recipient_Flow;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FND_Edit_Recipient {

    LoginSteps login = new LoginSteps();
    FND_Recipient_Flow beneficiary = new FND_Recipient_Flow();
    private static Logger log = Logger.getLogger(LoginSteps.class);

    @When("^I should be able to search a Bank Recipient by entering the recipient name in the editable text field\"([^\"]*)\"$")
    public void i_should_be_able_to_search_a_Bank_Recipient_by_entering_the_recipient_name_in_the_editable_text_field(String beneficiaryName) throws Throwable {
        beneficiary.I_SHOULD_BE_ABLE_TO_SEARCH_A_BANK_RECIPIENT_BY_ENTERING_THE_RECIPIENT_NAME_IN_THE_EDITABLE_TEXT_FIELD(beneficiaryName);
    }

    @When("^Click on the recipient name to open up it's details$")
    public void click_on_the_recipient_name_to_open_up_it_s_details() throws Throwable {
        beneficiary.CLICK_ON_THE_RECIPIENT_NAME_TO_OPEN_UP_ITS_DETAILS();
    }
    @When("^Click on the recipient name to open up it's details electric meter$")
    public void click_on_the_recipient_name_to_open_up_it_s_details_electric_meter() throws Throwable {
        beneficiary.CLICK_ON_THE_RECIPIENT_NAME_TO_OPEN_UP_ITS_DETAILS_ELECTRIC_METER();
    }

    @When("^Click on edit or add details label to edit the recipient$")
    public void click_on_edit_or_add_details_label_to_edit_the_recipient() throws Throwable {
        beneficiary.CLICK_ON_EDIT_OR_ADD_DETAILS_LABEL_TO_EDIT_THE_RECIPIENT();
    }

    @When("^Clear the editable email text field and put another email\"([^\"]*)\"$")
    public void clear_the_editable_email_text_field_and_put_another_email(String email) throws Throwable {
        beneficiary.CLEAR_THE_EDITABLE_EMAIL_TEXT_FIELD_AND_PUT_ANOTHER_EMAIL(email);
    }

    @When("^Clear the editable cellphone no field and put another cellphone no\"([^\"]*)\"$")
    public void clear_the_editable_cellphone_no_field_and_put_another_cellphone_no(String cellphoneNo) throws Throwable {
        beneficiary.CLEAR_THE_EDITABLE_CELLPHONE_NO_FIELD_AND_PUT_ANOTHER_CELLPHONE_NO(cellphoneNo);
    }

    @When("^Clear the editable fax no field and put another fax no\"([^\"]*)\"$")
    public void clear_the_editable_fax_no_field_and_put_another_fax_no(String faxNo) throws Throwable {
        beneficiary.CLEAR_THE_EDITABLE_FAX_NO_FIELD_AND_PUT_ANOTHER_FAX_NO(faxNo);
    }

    @When("^Clear the bank field and put another bank\"([^\"]*)\"$")
    public void clear_the_bank_field_and_put_another_bank(String bankName) throws Throwable {
        beneficiary.CLEAR_THE_BANK_FIELD_AND_PUT_ANOTHER_BANK(bankName);
    }

    @When("^I should be able to clear the account no field and put another account no\"([^\"]*)\"$")
    public void i_should_be_able_to_clear_the_account_no_field_and_put_another_account_no(String bankAccountNo) throws Throwable {
        beneficiary.I_SHOULD_BE_ABLE_TO_CLEAR_THE_ACCOUNT_NO_FIELD_AND_PUT_ANOTHER_ACCOUNT_NO(bankAccountNo);
    }

    @When("^the your reference field should be cleared and put another reference\"([^\"]*)\"$")
    public void the_your_reference_field_should_be_cleared_and_put_another_reference(String yourReference) throws Throwable {
        beneficiary.THE_YOUR_REFERENCE_FIELD_SHOULD_BE_CLEARED_AND_PUT_ANOTHER_REFERENCE(yourReference);

    }

    @When("^I should be able to clear the their reference field and put another reference\"([^\"]*)\"$")
    public void i_should_be_able_to_clear_the_their_reference_field_and_put_another_reference(String theirReference) throws Throwable {
        beneficiary.I_SHOULD_BE_ABLE_TO_CLEAR_THE_THEIR_REFERENCE_FIELD_AND_PUT_ANOTHER_REFERENCE(theirReference);
    }

    @When("^I should be able to select the Save Changes button on providing all mandatory fields\\.$")
    public void i_should_be_able_to_select_the_Save_Changes_button_on_providing_all_mandatory_fields() throws Throwable {
        beneficiary.I_SHOULD_BE_ABLE_TO_SELECT_THE_SAVE_CHANGES_BUTTON_ON_PROVIDING_ALL_MANDATORY_FIELDS();
    }

    @When("^I should be able to search a Mobile Recipient by entering the recipient name in the editable text field\"([^\"]*)\"$")
    public void i_should_be_able_to_search_a_Mobile_Recipient_by_entering_the_recipient_name_in_the_editable_text_field(String beneficiaryName) throws Throwable {
        beneficiary.I_SHOULD_BE_ABLE_TO_SEARCH_A_MOBILE_RECIPIENT_BY_ENTERING_THE_RECIPIENT_NAME_IN_THE_EDITABLE_TEXT_FIELD(beneficiaryName);
    }

    @When("^Clear the cellphone number field and put another cellphone no to which payment is to be done\"([^\"]*)\"$")
    public void clear_the_cellphone_number_field_and_put_another_cellphone_no_to_which_payment_is_to_be_done(String cellphoneNo) throws Throwable {
        beneficiary.CLEAR_THE_CELLPHONE_NUMBER_FIELD_AND_PUT_ANOTHER_CELLPHONE_NO_TO_WHICH_PAYMENT_IS_TO_BE_DONE(cellphoneNo);
    }

    @When("^the your reference field should be cleared and put another reference for edit mobile no\"([^\"]*)\"$")
    public void the_your_reference_field_should_be_cleared_and_put_another_reference_for_edit_mobile_no(String yourReference) throws Throwable {
        beneficiary.THE_YOUR_REFERENCE_FIELD_SHOULD_BE_CLEARED_AND_PUT_ANOTHER_REFERENCE_FOR_EDIT_MOBILE_NO(yourReference);
    }

    @When("^I should be able to search a Electricity Recipient by entering the recipient name in the editable text field\"([^\"]*)\"$")
    public void i_should_be_able_to_search_a_Electricity_Recipient_by_entering_the_recipient_name_in_the_editable_text_field(String beneficiaryName) throws Throwable {
        beneficiary.I_SHOULD_BE_ABLE_TO_SEARCH_A_ELECTRICITY_RECIPIENT_BY_ENTERING_THE_RECIPIENT_NAME_IN_THE_EDITABLE_TEXT_FIELD(beneficiaryName);
    }

    @When("^Clear the electricity meter number field and put another meter no to which payment is to be done\"([^\"]*)\"$")
    public void clear_the_electricity_meter_number_field_and_put_another_meter_no_to_which_payment_is_to_be_done(String meterNo) throws Throwable {
       // beneficiary.CLEAR_THE_ELECTRICITY_METER_NUMBER_FIELD_AND_PUT_ANOTHER_METER_NO_TO_WHICH_PAYMENT_IS_TO_BE_DONE(meterNo);
    }

    @When("^the your reference field should be cleared and put another reference for edit electricity meter no\"([^\"]*)\"$")
    public void the_your_reference_field_should_be_cleared_and_put_another_reference_for_edit_electricity_meter_no(String arg1) throws Throwable {
    }

    @Then("^Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Edit Recipient action in the previous step before selecting the save button for electricity recipient\"([^\"]*)\"$")
    public void below_the_success_message_I_should_be_presented_with_the_text_area_with_all_the_field_names_labels_and_the_values_provided_during_the_Edit_Recipient_action_in_the_previous_step_before_selecting_the_save_button_for_electricity_recipient(String arg1) throws Throwable {
    }

    @Then("^I should be able to click on the delete button to delete the recipient both in the page and the popup\\.$")
    public void i_should_be_able_to_click_on_the_delete_button_to_delete_the_recipient_both_in_the_page_and_the_popup() throws Throwable {
        beneficiary.I_SHOULD_BE_ABLE_TO_CLICK_ON_THE_DELETE_BUTTON_TO_DELETE_THE_RECIPIENT_BOTH_IN_THE_PAGE_AND_THE_POPUP();
    }

    @Then("^On selecting the delete button i should get a success message that the recipient was deleted successfully\\.$")
    public void on_selecting_the_delete_button_i_should_get_a_success_message_that_the_recipient_was_deleted_successfully() throws Throwable {
        beneficiary.ON_SELECTING_THE_DELETE_BUTTON_I_SHOULD_GET_A_SUCCESS_MESSAGE_THAT_THE_RECIPIENT_WAS_DELETED_SUCCESSFULLY();
    }

    @Then("^Below the success message I should be presented with the text area with all the field names / labels and the values provided during the Edit Recipient action in the previous step before selecting the save button for mobile recipient\"([^\"]*)\"$")
    public void below_the_success_message_I_should_be_presented_with_the_text_area_with_all_the_field_names_labels_and_the_values_provided_during_the_Edit_Recipient_action_in_the_previous_step_before_selecting_the_save_button_for_mobile_recipient(String mobileNo) throws Throwable {
       // beneficiary.BELOW_THE_SUCCESS_MESSAGE_I_SHOULD_BE_PRESENTED_WITH_THE_TEXT_AREA_WITH_ALL_THE_FIELD_NAMES_LABELS_AND_THE_VALUES_PROVIDED_DURING_THE_EDIT_RECIPIENT_ACTION_IN_THE_PREVIOUS_STEP_BEFORE_SELECTING_THE_SAVE_BUTTON_FOR_MOBILE_RECIPIENT(mobileNo);
    }
}
