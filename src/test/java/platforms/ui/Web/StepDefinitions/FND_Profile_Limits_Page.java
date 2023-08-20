package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;

import platforms.ui.Web.FlowModel.FND_Profile_Page_Flow;
import platforms.ui.Web.Foundation_DataFactory;
import utils.CommonFunctions;

public class FND_Profile_Limits_Page extends CommonFunctions {

    LoginSteps login = new LoginSteps();
    private static Logger log = Logger.getLogger(LoginSteps.class);
    FND_Profile_Page_Flow Prolimit= new FND_Profile_Page_Flow();



    @Given("^I am logged in to Banking web app with username\"([^\"]*)\" and password\"([^\"]*)\"$")
    public void i_am_logged_in_to_Banking_web_app_with_username_and_password(String arg1, String arg2) throws InterruptedException {
        try {
            login.user_launch_prepaid_web_application();
            login.user_enters_username_and_password(Foundation_DataFactory.CCUser, Foundation_DataFactory.CCUserPassword );
            login.user_clicks_on_Login();
            //login.user_must_logon_to_Money_Web_application();
        } catch (Exception error) {
            log.info("Unable to Login due to this error message" + error.getMessage());
        }
        Thread.sleep(1000);
    }
    @And("^I can navigate to the Profile limits page$")
    public void i_can_navigate_to_the_Profile_limits_page() throws InterruptedException {
    Prolimit.I_CAN_NAVIGATE_TO_THE_PROFILE_LIMITS_PAGE();
    }
    @And("^I can view all the Profile Limit Types under Settings - Profile Limits link in my web login$")
    public void i_can_view_all_the_Profile_Limit_Types_under_Settings_Profile_Limits_link_in_my_web_login() throws InterruptedException {
        Prolimit.I_CAN_VIEW_ALL_THE_PROFILE_LIMIT_TYPES_UNDER_SETTINGS_PROFILE_LIMITS_LINK_IN_MY_WEB_LOGIN();
    }
    @Given("^I can select Limit Type as Temporary for the transaction type\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void i_can_select_Limit_Type_as_Temporary_for_the_transaction_type(String strTransType, String strLimitType, String strAmount) throws Throwable {
        Prolimit.I_CAN_SELECT_LIMIT_TYPE_AS_TEMPORARY_FOR_THE_TRANSACTION_TYPE_AND_ENTER_AMOUNT( strTransType,strLimitType ,strAmount);
    }
    @Given("^I can select Limit Type as Permanent for the transaction type\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void i_can_select_Limit_Type_as_Permanent_for_the_transaction_type(String strTransType, String strLimitType, String strAmount) throws Throwable {
        Prolimit.I_CAN_SELECT_LIMIT_TYPE_AS_PERMANENT_FOR_THE_TRANSACTION_TYPE_AND_ENTER_AMOUNT( strTransType,strLimitType ,strAmount);
    }
    @And("^I can click the Update button or the Cancel button for limits\"([^\"]*)\"$")
    public void i_can_click_the_Update_button_or_the_Cancel_button_for_limits(String strAction) throws InterruptedException {
          Prolimit.I_CAN_CLICK_THE_UPDATE_BUTTON_OR_THE_CANCEL_BUTTON_FOR_LIMITS(strAction);
    }
    @And("^I can view the Successfully updated message\"([^\"]*)\"$")
    public void i_can_view_the_Successfully_updated_message(String strAction) throws Throwable {
        Prolimit. I_CAN_VIEW_THE_SUCCESSFULLY_UPDATED_MESSAGE(strAction);


    }










}