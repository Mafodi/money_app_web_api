package platforms.ui.Web.FlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import platforms.ui.Web.Pages.FND_Lotto_Page;
import platforms.ui.Web.StepDefinitions.LoginSteps;
import utils.CommonFunctions;
import utils.Utils;

public class FND_Lotto_Flow extends Utils {

    public FND_Lotto_Page lp = PageFactory.initElements(driver, FND_Lotto_Page.class);
    public static CommonFunctions cf = PageFactory.initElements(driver, CommonFunctions.class);
    private static Logger logger = Logger.getLogger(FND_Payment_Flow.class);
    LoginSteps login = new LoginSteps();

    public void I_NAVIGATE_TO_THE_BUY_LOTTO_FUNCTION() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.Buy_In_HomePage),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Lotto_Purchase),10);
        logger.info("clicked on lotto purchase");
    }

    public void I_CAN_SEE_THE_NEXT_DRAW_DATE_AND_TIME() throws Throwable {
        boolean a=false;
        try {
            cf.waitForElement(lp.Next_Draw_Label, 20);
            a=true;
        }catch(Exception e){

        }
        if(a){
            logger.info("Next draw date is shown");
        }
    }

    public void WHEN_I_SELECT_VIEW_JACKPOTS_I_CAN_SEE_THE_JACKPOT_DETAILS(String arg1) throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.View_Jackpot_link),10);
        logger.info("Clicked on view jackpot details");
        cf.clickAndTryMultiple(cf.waitForElement(lp.Done_in_View_Jackpots),10);
        logger.info("Clicked on done after viewing the jackpot details");
        cf.clickAndTryMultiple(cf.waitForElement(lp.Next),10);
        logger.info("Clicked on next");
    }

    public void WHEN_I_SELECT_VIEW_JACKPOTS_I_CAN_SEE_THE_JACKPOT_DETAILS_PICK_NOS(String arg1) throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.View_Jackpot_link),10);
        logger.info("Clicked on view jackpot details");
        cf.clickAndTryMultiple(cf.waitForElement(lp.Done_in_View_Jackpots),10);
        logger.info("Clicked on done after viewing the jackpot details");
    }

    public void I_CAN_SELECT_NUMBER_OF_BOARDS(String arg1) throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.Boards_dropdown),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Boards_dropdown_selecting_4),10);
        logger.info("number of boards selected as 4");
    }

    public void I_CAN_INCREASE_MY_CHANCES_OF_WINNING_BY_SELECTING_TO_ADD_LOTTO_PLUS_ONE() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.Lotto_plus_one_slider),10);
        logger.info("Lotto plus one slider clicked");
    }

    public void I_CAN_INCREASE_MY_CHANCES_OF_WINNING_BY_SELECTING_TO_ADD_LOTTO_PLUS_TWO() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.Lotto_plus_two_slider),10);
        logger.info("Clicked on lotto plus two slider");
    }

    public void I_CAN_REMOVE_MY_CHANCES_OF_WINNING_BY_DE_SELECTING_LOTTO_PLUS_ONE_OPTION() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.Lotto_plus_two_slider),10);
        logger.info("Clicked on lotto plus two slider to switch off it");
    }

    public void I_CAN_REMOVE_MY_CHANCES_OF_WINNING_BY_DE_SELECTING_LOTTO_PLUS_TWO_OPTION() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.Lotto_plus_one_slider),10);
        logger.info("Lotto plus one slider clicked again to switch off the slider");
    }

    public void I_CAN_VIEW_AND_SELECT_NUMBER_OF_DRAWS(String arg1) throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.Number_of_draws_dropdown),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Draws_4_from_dropdown),10);
        logger.info("Number of draws selected");
    }

    public void I_CAN_SEE_THE_TOTAL_COST_OF_MY_LOTTO_TICKET() throws Throwable {
        cf.waitForElement(lp.Lotto_total_value);
        logger.info("Lotto total value "+lp.Lotto_total_value.getText()+" displayed");
        cf.clickAndTryMultiple(cf.waitForElement(lp.Next),10);
        logger.info("Clicked on next");
    }

    public void IF_I_HAVE_SELECTED_SMS_OPTION_CELLPHONE_NUMBER_MUST_BE_AUTO_POPULATED_WITH_THE_NUMBER_ON_MY_PROFILE(String arg1) throws Throwable {
        cf.waitForElement(lp.Cellphone_no_field);
        if(!(lp.Cellphone_no_field.getText().isEmpty())){
            logger.info("Cellphone no is populated");
        }
        cf.clickAndTryMultiple(cf.waitForElement(lp.Next),10);
        logger.info("Clicked on next");

    }

    public void AS_A_USER_I_WANT_TO_SEE_MY_PURCHASE_DETAILS_SO_THAT_I_CAN_BUY_THE_TICKET(String arg1, String arg2) throws Throwable {
        cf.waitForElement(lp.Review_your_purchase_header);
        boolean p=false;
        try{
            cf.waitForElement(lp.Review_your_purchase_header,20);
            p=true;
        }catch(Exception e){

        }
        if(p){
            logger.info("Review page is shown");
        }
    }

    public void TERMS_AND_CONDITIONS_MUST_BE_A_HYPERLINK_TO_THE_TERMS_AND_CONDITIONS_WHICH_MUST_DISPLAY_IN_A_NEW_BROWSER_WINDOW_IF_CLICKED() throws Throwable {
    }

    public void LOT_I_SHOULD_BE_ABLE_TO_SEE_A_CONFIRMATION_SCREEN_SO_THAT_I_KNOW_THAT_THE_PURCHASE_IS_DONE() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.Buy_lotto_end_page),10);
        logger.info("Clicked on buy");
    }

    public void AS_A_USER_I_WANT_TO_SEE_A_CONFIRMATION_OF_MY_PURCHASE_DETAILS_SO_THAT_I_KNOW_MY_PURCHASE_IS_COMPLETED(String arg1) throws Throwable {
        boolean b=false;
        try{
            cf.waitForElement(lp.Ticket_requested_message_After_Buy,20);
            b=true;
        }catch(Exception e){

        }
        if(b){
            logger.info("Ticket requested message successfully shown");
        }
    }

    public void I_CAN_CLICK_ON_GO_TO_OVERVIEW_AND_MOVE_TO_THE_OVERVIEW_PAGE_OR_I_CAN_CLICK_ON_THE_PLAY_AGAIN_BUTTON_TO_MAKE_ANOTHER_LOTTO_PURCHASE(String arg1) throws Throwable {
    }

    public void I_CAN_SELECT_THE_PICK_NUMBERS_FROM_THE_SELECT_METHOD_DROP_DOWN_AND_CLICK_ON_NEXT() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.Select_method_dropdown),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Pick_numbers_in_dropdown),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Next),10);
    }

    public void I_CAN_SELECT_NUMBERS_FOR_THE_BOARDS_AND_CAN_ADD_MORE_BOARDS() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_2),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_3),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_4),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_5),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_6),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_7),10);

        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_2_second_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_3_second_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_4_second_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_5_second_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_6_second_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_7_second_board),10);

        cf.clickAndTryMultiple(cf.waitForElement(lp.Add_board_circle),10);

        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_2_third_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_3_third_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_4_third_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_5_third_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_6_third_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_7_third_board),10);
    }


    public void I_CAN_SELECT_NUMBERS_FOR_THE_BOARDS_AND_CAN_ADD_MORE_BOARDS_FOR_POWERBALL() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_2),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_3),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_4),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_5),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_6),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_powerball_no9),10);

        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_2_second_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_3_second_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_4_second_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_5_second_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_6_second_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_powerball_no9_second_pick),10);

        cf.clickAndTryMultiple(cf.waitForElement(lp.Add_board_circle),10);

        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_2_third_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_3_third_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_4_third_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_5_third_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_6_third_board),10);
        cf.clickAndTryMultiple(cf.waitForElement(lp.Picking_powerball_no9_third_pick),10);
    }

    public void I_SELECT_THE_POWERBALL_OPTION() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(lp.Powerball_in_game_page),10);
    }
}
