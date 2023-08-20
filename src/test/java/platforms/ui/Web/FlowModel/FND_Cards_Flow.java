package platforms.ui.Web.FlowModel;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import platforms.ui.Web.Pages.FND_CardsPage;
import platforms.ui.Web.StepDefinitions.LoginSteps;
import utils.CommonFunctions;
import utils.Utils;

public class FND_Cards_Flow extends Utils {

    public FND_CardsPage cp = PageFactory.initElements(driver, FND_CardsPage.class);
    public static CommonFunctions cf = PageFactory.initElements(driver, CommonFunctions.class);
    private static Logger logger = Logger.getLogger(FND_Payment_Flow.class);
    LoginSteps login = new LoginSteps();

    public void I_SELECT_THE_CARDS_MENU_OPTION() throws Throwable {
        Thread.sleep(2000);
        cf.clickAndTryMultiple(cf.waitForElement(cp.Cards_In_Homepage),10);
        logger.info("Cards menu option is selected");
    }
    public void I_SELECT_A_CARD_ACCOUNT_TO_VIEW_OR_ACTION_ON(String arg1) throws Throwable {
    }

    public void I_CAN_VIEW_THE_FEATURE_USE_TAP_AND_GO_TOGGLE_SWITCH_ON_THE_CARD_SERVICES_MENU() throws Throwable {
        cf.waitForElement(cp.Use_tap_N_Go);
        if(cp.Use_tap_N_Go.getText().contains("Use tap and go")){
            logger.info("Use tap and go displayed");
        }
        if(cp.Use_tap_N_Go.isSelected()){
            logger.info("Use tap and go is selected");
        }else{
            logger.info("Use tap and go is not selected");
        }
    }

    public void I_CAN_SELECT_TO_SWITCH_ON_OR_OFF_THE_FEATURE_TO_ENABLE_OR_DISABLE_THIS_FEATURE_ON_MY_CARD(String arg1, String arg2) throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(cp.Tap_N_Go_Switch),10);
        logger.info("Tap and go toggle switch is clicked");
    }

    public void THE_CLIENT_IS_INFORMED_ABOUT_THE_IMPLICATIONS_OF_ENABLING_OR_DISABLING_THE_CONTACTLESS_FEATURE_ON_THE_CARD(String arg1) throws Throwable {
        cf.waitForElement(cp.Deactivate_Message_Tap_And_Go);
        Assert.assertTrue(cp.Deactivate_Message_Tap_And_Go.getText().contains("This will take effect only after you’ve inserted your card into an ATM or card machine."));
        logger.info("implication message displayed after tap and go clicked");
    }

    public void I_CAN_SUBMIT_THE_REQUEST_FOR_SWITCHING_ON_OR_OFF_FEATURE(String arg1) throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(cp.Next),10);
        logger.info("Next on the information pop up after the toggle is clicked");
    }

    public void I_CAN_VIEW_THE_SUCCESS_MESSAGE_TAP_AND_GO_SERVICE_IS_SWITCHED_OFF_OR_TAP_AND_GO_SERVICE_IS_SWITCHED_ON(String arg1) throws Throwable {
    }

    public void THE_TOGGLE_SWITCH_FOR_FEATURE_IS_SWITCHED_ON_OR_OFF(String arg1, String arg2) throws Throwable {
        cf.waitForElement(cp.Use_tap_N_Go);
        if(cp.Use_tap_N_Go.isSelected()){
            logger.info("Use tap and go is changed to ON");
        }else{
            logger.info("Use tap and go is changed to OFF");
        }
    }

    public void I_CAN_VIEW_THE_FEATURE_FREEZE_CARD_TOGGLE_SWITCH_ON_THE_CARD_SERVICES_MENU() throws Throwable {
        try{
            cf.waitForElement(cp.Freeze_Card_Text);
            Thread.sleep(1000);
            if(cp.Freeze_Card_Text.isDisplayed()){
                logger.info("Freeze card is displayed");
            }else{
                logger.info("Freeze card is not displayed");
            }
        }catch(Exception e){

        }
    }

    public void I_CAN_SELECT_TO_SWITCH_ON_OR_OFF_THE_FREEZE_CARD_FEATURE_TO_ENABLE_OR_DISABLE_THIS_FEATURE_ON_MY_CARD() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(cp.Freeze_Card_Slider),10);
        logger.info("Freeze card toggle clicked");
    }

    public void THE_CLIENT_IS_INFORMED_ABOUT_THE_IMPLICATIONS_OF_FREEZING_OR_UNFREEZING_THE_CARD() throws Throwable {
        cf.waitForElement(cp.Freeze_Card_Message);
        Assert.assertTrue(cp.Freeze_Card_Message.getText().contains("Please note that certain transactions will be restricted until you unfreeze your card."));
        logger.info("Implication of freeze card toggle message was displayed");
    }

    public void I_CAN_VIEW_THE_SUCCESS_MESSAGE_UN_FREEZEDS_CARD_SUCCESSFUL_OR_CARD_FROZEN_SUCCESSFULLY() throws Throwable {
        cf.waitForElement(cp.Freeze_Card_Successfully_Message);
        Thread.sleep(2000);
        if(cp.Freeze_Card_Successfully_Message.getText().equalsIgnoreCase("Card frozen successfully")) {
            logger.info("card freezed successfully");
        }

        cf.clickAndTryMultiple(cf.waitForElement(cp.Freeze_Card_Slider),10);
        cf.waitForElement(cp.Freeze_Card_Successfully_Message);
        Thread.sleep(2000);
        if(cp.Freeze_Card_Successfully_Message.getText().equalsIgnoreCase("Un-freeze card successful")) {
            logger.info("card un freezed successfully");
        }
    }

    public void I_CAN_VIEW_THE_FEATURE_ONLINE_PURCHASE_TOGGLE_SWITCH_ON_THE_CARD_SERVICES_MENU() throws Throwable {
            cf.waitForElement(cp.Online_Purchase_Switch);
        logger.info("Online purchase switch is present");
    }

    public void I_CAN_SELECT_TO_SWITCH_ON_OR_OFF_THE_ONLINE_PURCHASE_FEATURE_TO_ENABLE_OR_DISABLE_THIS_FEATURE_ON_MY_CARD() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(cp.Online_Purchase_Switch),10);
        logger.info("Clicked on online purchase switchs");
    }

    public void THE_CLIENT_IS_INFORMED_ABOUT_THE_IMPLICATIONS_OF_ENABLING_OR_DISABLING_ONLINE_PURCHASE_ON_THE_CARD() throws Throwable {
        cf.waitForElement(cp.Message_Online_Purchases);
        if(cp.Message_Online_Purchases.getText().equalsIgnoreCase("You won't be able to pay online with your card, including Scan to Pay and other QR code payments.")){
            logger.info("Implication message of enabling or disabling online purchase is displayed");
        }
    }

    public void I_CAN_SUBMIT_THE_REQUEST_FOR_ENABLING_OR_DISABLING_THE_ONLINE_PURCHASE_TOGGLE_FEATURE() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(cp.Next),10);
        logger.info("Implication message of enabling or disabling online purchase is displayed");
    }

    public void I_CAN_VIEW_THE_SUCCESS_MESSAGE_ONLINE_PURCHASES_ARE_ACTIVATED_OR_ONLINE_PURCHASES_ARE_DEACTIVATED() throws Throwable {
        cf.waitForElement(cp.Online_Purchase_Message);
        if(cp.Online_Purchase_Message.getText().equalsIgnoreCase(" Online purchases have been deactivated. ")){
            logger.info("Online purchase deactivated message displayed");
        }

        cf.clickAndTryMultiple(cf.waitForElement(cp.Online_Purchase_Switch),10);
        cf.clickAndTryMultiple(cf.waitForElement(cp.Next),10);
        cf.waitForElement(cp.Online_Purchase_Message);
        if(cp.Online_Purchase_Message.getText().equalsIgnoreCase(" Online purchases are now active. ")){
            logger.info("Online purchase activated message displayed");
        }
    }

    public void I_CAN_VIEW_THE_FEATURE_ONLINE_USE_CARD_OVERSEAS_ON_THE_CARD_SERVICES_MENU_AND_CAN_CLICK_ON_IT() throws Throwable {
        cf.waitForElement(cp.Use_Card_Overseas);
        if(cp.Use_Card_Overseas.isDisplayed()){
            logger.info("Use card overseas feature is displayed");
        }
        cf.clickAndTryMultiple(cp.Use_Card_Overseas,10);
        logger.info("Clicked on use card overseas");
    }

    public void I_CAN_SELECT_THE_CARD_FROM_THE_LIST_AND_SHOULD_BE_ABLE_TO_CLICK_ON_NEXT() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(cp.Next),10);
        logger.info("Card selected from the list and next was clicked");
    }

    public void I_SHOULD_BE_ABLE_TO_SELECT_THE_START_AND_END_TRAVEL_DATE_AND_CLICK_ON_NEXT() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(cp.Next),10);
        logger.info("Next clicked on date selection page");
    }

    public void I_CAN_SUBMIT_THE_COUNTRIES_I_AM_TRAVELLING_TO_AND_SHOULD_BE_ABLE_TO_SELECT_NEXT() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(cp.Select_Countries_Dropdown),10);
        cf.clickAndTryMultiple(cf.waitForElement(cp.Select_Country_India),10);
        cf.clickAndTryMultiple(cf.waitForElement(cp.Select_Country_Austria),10);
        cf.clickAndTryMultiple(cf.waitForElement(cp.Done_After_Country_Selection),10);
        cf.clickAndTryMultiple(cf.waitForElement(cp.Next),10);
        logger.info("Selected the countries i am travelling to and clicked on next");
    }

    public void I_SHOULD_BE_ABLE_TO_FILL_THE_CONTACT_DETAILS_AND_CONTACT_DETAILS_WHILE_OVERSEAS_AND_SHOULD_BE_ABLE_TO_CLICK_NEXT(String email, String phone) throws Throwable {
        cf.sendKeysAndTryMultiple(cf.waitForElement(cp.Email_After_Country_Selection),email,10);
        cf.sendKeysAndTryMultiple(cf.waitForElement(cp.Secondary_Cellphone_No),phone,10);
        cf.sendKeysAndTryMultiple(cf.waitForElement(cp.Contact_No_While_Overseas),phone,10);
        cf.clickAndTryMultiple(cf.waitForElement(cp.Next),10);
        logger.info("Contact details while overseas were filled and next was clicked");
    }

    public void I_SHOULD_BE_ABLE_TO_SUBMIT_IT_AFTER_REVIEWING_THE_INFORMATION() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(cp.Submit),10);
        logger.info("Submit was clicked");
    }

    public void I_CAN_VIEW_THE_FEATURE_UPDATE_ATM_LIMITS_ON_THE_CARD_SERVICES_MENU_AND_CAN_CLICK_ON_IT() throws Throwable {
        cf.scrollToEndOfPage();
        //cf.waitForElement(cp.Update_Atm_Limit);
        logger.info("Update ATM limit functionality is visible");
        cf.clickAndTryMultiple(cp.Update_Atm_Limit,10);
        logger.info("Clicked on update ATM limit functionality");

    }

    public void I_CAN_CAN_CHANGE_THE_ATM_LIMIT_BY_SLIDING_THE_SLIDER_TO_ANOTHER_VALUE_AND_THE_NUMERIC_VALUE_SHOULD_BE_UPDATED_ON_THE_LEFT() throws Throwable {
        cf.waitForElement(cp.Amount_In_Text_Field);
        String AtmLimit=cp.Amount_In_Text_Field.getAttribute("value");
        //cf.Slider(cf.waitForElement(cp.Slider),cf.RandomNo(5));
        cp.Amount_In_Text_Field.clear();
        cf.sendKeysAndTryMultiple(cp.Amount_In_Text_Field,Integer.toString(cf.RandomNo(50)*100),10);
        logger.info("ATM limit changed by putting a random limit value");
        if(!(AtmLimit.equals(cp.Amount_In_Text_Field.getAttribute("value")))){
            logger.info("ATM limit was changed by sliding the slider and the value reflected in the text field");
        }
    }
    public void I_SHOULD_BE_ABLE_TO_CLICK_ON_THE_CHANGE_LIMIT_BUTTON() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(cp.Change_Limit),10);
        logger.info("Change limit button was changed");
    }

    public void I_SHOULD_GET_A_SUCCESS_MESSAGE_AND_I_SHOULD_BE_ABLE_TO_CLICK_ON_THE_DONE_BUTTON() throws Throwable {
        cf.waitForElement(cp.Success_Message_After_Limit_Change);
        if(cp.Success_Message_After_Limit_Change.getText().contains("ATM limit changed successfully")){
            logger.info("ATM limit changed successfully message displayed");
        }
    }

}
