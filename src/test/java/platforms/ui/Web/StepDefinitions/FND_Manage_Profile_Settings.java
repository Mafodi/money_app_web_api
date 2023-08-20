package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.FND_Profile_Page_Flow;
import platforms.ui.Web.Foundation_DataFactory;

public class FND_Manage_Profile_Settings {
    LoginSteps login = new LoginSteps();
    private static Logger log = Logger.getLogger(LoginSteps.class);
    FND_Profile_Page_Flow Prolimit = new FND_Profile_Page_Flow();

    @Given("^Prf_I am logged in to Banking web app with username\"([^\"]*)\" and password\"([^\"]*)\"$")
    public void prf_i_am_logged_in_to_Banking_web_app_with_username_and_password(String arg1, String arg2) {
        try {
            login.user_launch_prepaid_web_application();
            login.user_enters_username_and_password(Foundation_DataFactory.CCUser, Foundation_DataFactory.CCUserPassword);
            login.user_clicks_on_Login();
            //login.user_must_logon_to_Money_Web_application();
        } catch (Exception error) {
            log.info("Unable to Login due to this error message" + error.getMessage());
        }
    }

    @Given("^I can navigate to the Profile details page$")
    public void i_can_navigate_to_the_Profile_details_page() throws InterruptedException {
        Prolimit.I_CAN_NAVIGATE_TO_THE_PROFILE_DETAILS_PAGE();
    }

    @Given("^I can view a clickable Edit link$")
    public void i_can_view_a_clickable_Edit_link() throws Throwable {
        Prolimit.I_CAN_VIEW_A_CLICKABLE_EDIT_LINK();
    }

    @Given("^I can enter preferred name\"([^\"]*)\"$")
    public void i_can_enter_preferred_name(String strPreferredName) throws InterruptedException {
        Prolimit.I_CAN_ENTER_PREFERRED_NAME(strPreferredName);
    }


    @Given("^I can click the Update button or the Cancel button\"([^\"]*)\"$")
    public void i_can_click_the_Update_button_or_the_Cancel_button(String Action) {
        Prolimit.I_CAN_CLICK_THE_UPDATE_BUTTON_OR_THE_CANCEL_BUTTON(Action);
    }

    @Then("^I can view the Success message if click on Update button\"([^\"]*)\" otherwise no changes have been made$")
    public void i_can_view_the_Success_message_if_click_on_Update_button_otherwise_no_changes_have_been_made(String Action) {
        Prolimit.I_CAN_VIEW_THE_SUCCESS_MESSAGE_IF_CLICK_ON_UPDATE_BUTTON_OTHERWISE_NO_CHANGES_HAVE_BEEN_MADE(Action);
    }


    @Then("^User can able to click on contact details Edit button to change his contact details$")
    public void User_can_able_to_click_on_contact_details_Edit_button_to_change_his_contact_details() {
        Prolimit.USER_CAN_ABLE_TO_CLICK_ON_CONTACT_DETAILS_EDIT_BUTTON_TO_CHANGE_HIS_PERSONAL_DETAILS();
    }

    @Given("^User modifies his contact details\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void user_modifies_his_contact_details(String strEmail, String strCellNumber, String strHomeContact, String strWorkContact) {
        Prolimit.USER_MODIFIES_HIS_CONTACT_DETAILS(strEmail, strCellNumber, strHomeContact, strWorkContact);
    }

    @Given("^User can able to click on Residential address Edit button to change his address details$")
    public void user_can_able_to_click_on_Residential_address_Edit_button_to_change_his_address_details() {
        Prolimit.USER_CAN_ABLE_TO_CLICK_ON_RESIDENTIAL_ADDRESS_EDIT_BUTTON_TO_CHANGE_HIS_ADDRESS_DETAILS();
    }

    @Given("^User can able to click on Postal address Edit button to change his address details$")
    public void user_can_able_to_click_on_Postal_address_Edit_button_to_change_his_address_details() {
        Prolimit.USER_CAN_ABLE_TO_CLICK_ON_POSTAL_ADDRESS_EDIT_BUTTON_TO_CHANGE_HIS_ADDRESS_DETAILS();
    }

    @Given("^User modifies his Residential address\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",$")
    public void user_modifies_his_Residential_address(String strAddress1, String strAddress2, String strProvince, String strCity, String strSuburb) throws Throwable {
        Prolimit.USER_MODIFIES_HIS_RESIDENTIAL_ADDRESS(strAddress1, strAddress2, strProvince, strCity, strSuburb);
    }

    @Given("^User modifies his Postal address\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void user_modifies_his_Postal_address(String strPostAdd1, String strPostAdd2, String strPostProvince, String strPostCity, String strPostSuburb) throws Throwable {
        Prolimit.USER_MODIFIES_HIS_POSTAL_ADDRESS(strPostAdd1, strPostAdd2, strPostProvince, strPostCity, strPostSuburb);
    }

    @Then("^User Clicks on consent for Nedbank to update your personal details\\.$")
    public void user_Clicks_on_consent_for_Nedbank_to_update_your_personal_details() {
        Prolimit.USER_CLICKS_ON_CONSENT_FOR_NEDBANK_TO_UPDATE_YOUR_PERSONAL_DETAILS();
    }

    @Then("^User Clicks on the Save Changes button$")
    public void user_Clicks_on_the_Save_Changes_button() {
        Prolimit.USER_CLICKS_ON_THE_SAVE_CHANGES_BUTTON();
    }

    @Then("^User can view the Successfully updated message$")
    public void user_can_view_the_Successfully_updated_message() {
        Prolimit.USER_CAN_VIEW_THE_SUCCESSFULLY_UPDATED_MESSAGE();

    }
   //@UpdatePreferredNameThroughDashBoard

    @Given("^I can navigate to the Profile Initial link$")
    public void i_can_navigate_to_the_Profile_Initial_link() throws InterruptedException {
        Prolimit.I_CAN_NAVIGATE_TO_THE_PROFILE_INITIAL_LINK();

    }

    @Given("^I can click on Choose profile settling icon$")
    public void i_can_click_on_Choose_profile_settling_icon() throws InterruptedException {
        Prolimit.I_CAN_CLICK_ON_CHOOSE_PROFILE_SETTING_ICON();

    }
}