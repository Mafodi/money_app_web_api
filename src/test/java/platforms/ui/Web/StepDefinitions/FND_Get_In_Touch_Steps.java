package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import platforms.ui.Web.FlowModel.FND_GetInTouch_Flow;
import platforms.ui.Web.Foundation_DataFactory;
import utils.CommonFunctions;



public class FND_Get_In_Touch_Steps  extends CommonFunctions {

    LoginSteps login = new LoginSteps();
   FND_GetInTouch_Flow GetInTouch= new FND_GetInTouch_Flow();
    private static org.apache.log4j.Logger log = Logger.getLogger(LoginSteps.class);


    @Given("^User logged into online banking$")
    public void user_logged_into_online_banking() {

        try {
            login.user_launch_prepaid_web_application();
            login.user_enters_username_and_password(Foundation_DataFactory.CCUser, Foundation_DataFactory.CCUserPassword );
            login.user_clicks_on_Login();
        } catch (Exception error) {
            logger.info("Unable to Login due to this error message" + error.getMessage());
        }
    }
    @When("^User navigates to Get in touch page$")
    public void user_navigates_to_Get_in_touch_page() throws Throwable {
        GetInTouch.USER_NAVIGATES_TO_GET_IN_TOUCH_PAGE();
    }

    @When("^User_can_view_the_details_of_the_banker_viz_Banker_Picture_Banker_Name_Bankers_Phone_number_Bankers_email_address\\(\\)$")
    public void user_can_view_the_details_of_the_banker_viz_banker_picture_banker_name_bankers_phone_number_bankers_email_address()  {
    GetInTouch.USER_CAN_VIEW_THE_DETAILS_OF_THE_BANKER_VIZ_BANKER_PICTURE_BANKER_NAME_BANKERS_PHONE_NUMBER_BANKER_EMAIL_ADDRESS();
    }

    @Then("^User_should_be_able_to_click_on_the_highlighted_email_address$")
    public void user_should_be_able_to_click_on_the_highlighted_email_address() throws InterruptedException {
        GetInTouch.USER_SHOULD_BE_ABLE_TO_CLICK_ON_THE_HIGHLIGHTED_EMAIL_ADDRESS();

    }

    @When("^I can click the relevant feedback icon\"([^\"]*)\"$")
    public void i_can_click_the_relevant_feedback_icon(String strFeedback) throws Throwable {
        GetInTouch.I_CAN_CLICK_THE_RELEVANT_FEEDBACK_ICON(strFeedback);
    }

    @When("^I can capture the description in the text box\"([^\"]*)\"$")
    public void i_can_capture_the_description_in_the_text_box(String strDescription)  {
        GetInTouch.I_CAN_CAPTURE_THE_DESCRIPTION_IN_THE_BOX(strDescription);

    }
    @Then("^I can view a thank you message, after I click the submit Feedback button$")
    public void i_can_view_a_thank_you_message_after_I_click_the_submit_Feedback_button()  {
        GetInTouch.I_CAN_VIEW_A_THANK_YOU_MESSAGE_AFTER_I_CLICK_THE_SUBMIT_FEEDBACK_BUTTON();

        }




}
