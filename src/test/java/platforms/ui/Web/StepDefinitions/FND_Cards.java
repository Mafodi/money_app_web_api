package platforms.ui.Web.StepDefinitions;
import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.FND_Cards_Flow;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FND_Cards {

    LoginSteps login = new LoginSteps();
    FND_Cards_Flow cards = new FND_Cards_Flow();
    private static Logger log = Logger.getLogger(LoginSteps.class);

    @When("^I select the Cards menu option$")
    public void i_select_the_Cards_menu_option() throws Throwable {
        cards.I_SELECT_THE_CARDS_MENU_OPTION();
    }

    @When("^I select a card account to view or action on\"([^\"]*)\"$")
    public void i_select_a_card_account_to_view_or_action_on(String arg1) throws Throwable {
    }

    @When("^I can view the feature Freeze card toggle switch on the card services menu$")
    public void i_can_view_the_feature_Freeze_card_toggle_switch_on_the_card_services_menu() throws Throwable {
        cards.I_CAN_VIEW_THE_FEATURE_FREEZE_CARD_TOGGLE_SWITCH_ON_THE_CARD_SERVICES_MENU();
    }

    @When("^I can select to switch ON or OFF the Freeze card feature to enable or disable this feature on my card$")
    public void i_can_select_to_switch_ON_or_OFF_the_Freeze_card_feature_to_enable_or_disable_this_feature_on_my_card() throws Throwable {
        cards.I_CAN_SELECT_TO_SWITCH_ON_OR_OFF_THE_FREEZE_CARD_FEATURE_TO_ENABLE_OR_DISABLE_THIS_FEATURE_ON_MY_CARD();
    }

    @Then("^The client is informed about the implications of freezing or unfreezing the card$")
    public void the_client_is_informed_about_the_implications_of_freezing_or_unfreezing_the_card() throws Throwable {
    }

    @Then("^I can view the success message 'Un-freezeds card successful' or 'Card frozen successfully'$")
    public void i_can_view_the_success_message_Un_freezeds_card_successful_or_Card_frozen_successfully() throws Throwable {
        cards.I_CAN_VIEW_THE_SUCCESS_MESSAGE_UN_FREEZEDS_CARD_SUCCESSFUL_OR_CARD_FROZEN_SUCCESSFULLY();
    }

    @Then("^The toggle switch for Freeze card feature is switched ON or OFF$")
    public void the_toggle_switch_for_Freeze_card_feature_is_switched_ON_or_OFF() throws Throwable {
    }


    @When("^I can view the feature Use tap and go toggle switch on the card services menu$")
    public void i_can_view_the_feature_Use_tap_and_go_toggle_switch_on_the_card_services_menu() throws Throwable {
        cards.I_CAN_VIEW_THE_FEATURE_USE_TAP_AND_GO_TOGGLE_SWITCH_ON_THE_CARD_SERVICES_MENU();
    }

    @And("^I can select to switch ON or OFF the \"([^\"]*)\" feature to enable or disable this feature on my card\"([^\"]*)\"$")
    public void i_can_select_to_switch_ON_or_OFF_the_feature_to_enable_or_disable_this_feature_on_my_card(String arg1, String arg2) throws Throwable {
        cards.I_CAN_SELECT_TO_SWITCH_ON_OR_OFF_THE_FEATURE_TO_ENABLE_OR_DISABLE_THIS_FEATURE_ON_MY_CARD(arg1,arg2);
    }

    @Then("^The client is informed about the implications of enabling or disabling the contactless feature on the card\"([^\"]*)\"$")
    public void the_client_is_informed_about_the_implications_of_enabling_or_disabling_the_contactless_feature_on_the_card(String arg1) throws Throwable {
        cards.THE_CLIENT_IS_INFORMED_ABOUT_THE_IMPLICATIONS_OF_ENABLING_OR_DISABLING_THE_CONTACTLESS_FEATURE_ON_THE_CARD(arg1);
    }

    @And("^I can submit the request for switching ON or OFF \"([^\"]*)\" feature$")
    public void i_can_submit_the_request_for_switching_ON_or_OFF_feature(String arg1) throws Throwable {
        cards.I_CAN_SUBMIT_THE_REQUEST_FOR_SWITCHING_ON_OR_OFF_FEATURE(arg1);
    }

    @Then("^I can view the success message 'Tap and go service is switched off' or 'Tap and go service is switched on'\"([^\"]*)\"$")
    public void i_can_view_the_success_message_Tap_and_go_service_is_switched_off_or_Tap_and_go_service_is_switched_on(String arg1) throws Throwable {
    }

    @Then("^The toggle switch for \"([^\"]*)\" feature is switched ON or OFF\"([^\"]*)\"$")
    public void the_toggle_switch_for_feature_is_switched_ON_or_OFF(String arg1, String arg2) throws Throwable {
        cards.THE_TOGGLE_SWITCH_FOR_FEATURE_IS_SWITCHED_ON_OR_OFF(arg1,arg2);
    }

    @When("^I can view the feature Online purchase toggle switch on the card services menu$")
    public void i_can_view_the_feature_Online_purchase_toggle_switch_on_the_card_services_menu() throws Throwable {
        cards.I_CAN_VIEW_THE_FEATURE_ONLINE_PURCHASE_TOGGLE_SWITCH_ON_THE_CARD_SERVICES_MENU();
    }

    @When("^I can select to switch ON or OFF the online purchase feature to enable or disable this feature on my card$")
    public void i_can_select_to_switch_ON_or_OFF_the_online_purchase_feature_to_enable_or_disable_this_feature_on_my_card() throws Throwable {
        cards.I_CAN_SELECT_TO_SWITCH_ON_OR_OFF_THE_ONLINE_PURCHASE_FEATURE_TO_ENABLE_OR_DISABLE_THIS_FEATURE_ON_MY_CARD();
    }

    @Then("^The client is informed about the implications of enabling or disabling online purchase on the card$")
    public void the_client_is_informed_about_the_implications_of_enabling_or_disabling_online_purchase_on_the_card() throws Throwable {
        cards.THE_CLIENT_IS_INFORMED_ABOUT_THE_IMPLICATIONS_OF_ENABLING_OR_DISABLING_ONLINE_PURCHASE_ON_THE_CARD();
    }

    @Then("^I can submit the request for enabling or disabling the online purchase toggle feature$")
    public void i_can_submit_the_request_for_enabling_or_disabling_the_online_purchase_toggle_feature() throws Throwable {
        cards.I_CAN_SUBMIT_THE_REQUEST_FOR_ENABLING_OR_DISABLING_THE_ONLINE_PURCHASE_TOGGLE_FEATURE();
    }

    @Then("^I can view the success message 'Online purchases are activated' or 'Online purchases are deactivated'$")
    public void i_can_view_the_success_message_Online_purchases_are_activated_or_Online_purchases_are_deactivated() throws Throwable {
        cards.I_CAN_VIEW_THE_SUCCESS_MESSAGE_ONLINE_PURCHASES_ARE_ACTIVATED_OR_ONLINE_PURCHASES_ARE_DEACTIVATED();
    }

    @When("^I can view the feature Online use card overseas on the card services menu and can click on it$")
    public void i_can_view_the_feature_Online_use_card_overseas_on_the_card_services_menu_and_can_click_on_it() throws Throwable {
        cards.I_CAN_VIEW_THE_FEATURE_ONLINE_USE_CARD_OVERSEAS_ON_THE_CARD_SERVICES_MENU_AND_CAN_CLICK_ON_IT();
    }

    @When("^I can select the card from the list and should be able to click on next$")
    public void i_can_select_the_card_from_the_list_and_should_be_able_to_click_on_next() throws Throwable {
        cards.I_CAN_SELECT_THE_CARD_FROM_THE_LIST_AND_SHOULD_BE_ABLE_TO_CLICK_ON_NEXT();
    }

    @Then("^I should be able to select the start and end travel date and click on next$")
    public void i_should_be_able_to_select_the_start_and_end_travel_date_and_click_on_next() throws Throwable {
        cards.I_SHOULD_BE_ABLE_TO_SELECT_THE_START_AND_END_TRAVEL_DATE_AND_CLICK_ON_NEXT();
    }

    @Then("^I can submit the countries I am travelling to and should be able to select next$")
    public void i_can_submit_the_countries_I_am_travelling_to_and_should_be_able_to_select_next() throws Throwable {
        cards.I_CAN_SUBMIT_THE_COUNTRIES_I_AM_TRAVELLING_TO_AND_SHOULD_BE_ABLE_TO_SELECT_NEXT();
    }

    @Then("^I should be able to fill the contact details \"([^\"]*)\" and contact details while overseas \"([^\"]*)\" and should be able to click next$")
    public void i_should_be_able_to_fill_the_contact_details_and_contact_details_while_overseas_and_should_be_able_to_click_next(String email, String phone) throws Throwable {
        cards.I_SHOULD_BE_ABLE_TO_FILL_THE_CONTACT_DETAILS_AND_CONTACT_DETAILS_WHILE_OVERSEAS_AND_SHOULD_BE_ABLE_TO_CLICK_NEXT(email,phone);
    }

    @Then("^I should be able to submit it after reviewing the information$")
    public void i_should_be_able_to_submit_it_after_reviewing_the_information() throws Throwable {
        cards.I_SHOULD_BE_ABLE_TO_SUBMIT_IT_AFTER_REVIEWING_THE_INFORMATION();
    }

    @When("^I can view the feature update ATM limits on the card services menu and can click on it$")
    public void i_can_view_the_feature_update_ATM_limits_on_the_card_services_menu_and_can_click_on_it() throws Throwable {
        cards.I_CAN_VIEW_THE_FEATURE_UPDATE_ATM_LIMITS_ON_THE_CARD_SERVICES_MENU_AND_CAN_CLICK_ON_IT();
    }

    @When("^I can can change the ATM limit by sliding the slider to another value and the numeric value should be updated on the left$")
    public void i_can_can_change_the_ATM_limit_by_sliding_the_slider_to_another_value_and_the_numeric_value_should_be_updated_on_the_left() throws Throwable {
        cards.I_CAN_CAN_CHANGE_THE_ATM_LIMIT_BY_SLIDING_THE_SLIDER_TO_ANOTHER_VALUE_AND_THE_NUMERIC_VALUE_SHOULD_BE_UPDATED_ON_THE_LEFT();
    }

    @Then("^I should be able to click on the change limit button$")
    public void i_should_be_able_to_click_on_the_change_limit_button() throws Throwable {
        cards.I_SHOULD_BE_ABLE_TO_CLICK_ON_THE_CHANGE_LIMIT_BUTTON();
    }

    @Then("^I should get a success message and i should be able to click on the done button$")
    public void i_should_get_a_success_message_and_i_should_be_able_to_click_on_the_done_button() throws Throwable {
        cards.I_SHOULD_GET_A_SUCCESS_MESSAGE_AND_I_SHOULD_BE_ABLE_TO_CLICK_ON_THE_DONE_BUTTON();
    }

}
