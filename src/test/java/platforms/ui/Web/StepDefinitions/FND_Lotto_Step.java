package platforms.ui.Web.StepDefinitions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import platforms.ui.Web.FlowModel.FND_Lotto_Flow;

public class FND_Lotto_Step {

    FND_Lotto_Flow lotto=new FND_Lotto_Flow();

    @When("^I navigate to the Buy-Lotto function$")
    public void i_navigate_to_the_Buy_Lotto_function() throws Throwable {
        lotto.I_NAVIGATE_TO_THE_BUY_LOTTO_FUNCTION();
    }

    @When("^I can see the next draw date and time$")
    public void i_can_see_the_next_draw_date_and_time() throws Throwable {
        lotto.I_CAN_SEE_THE_NEXT_DRAW_DATE_AND_TIME();
    }

    @When("^When I select View jackpots I can see the jackpot details\"([^\"]*)\"$")
    public void when_I_select_View_jackpots_I_can_see_the_jackpot_details(String arg1) throws Throwable {
        lotto.WHEN_I_SELECT_VIEW_JACKPOTS_I_CAN_SEE_THE_JACKPOT_DETAILS(arg1);
    }

    @When("^When I select View jackpots I can see the jackpot details pick nos\"([^\"]*)\"$")
    public void when_I_select_View_jackpots_I_can_see_the_jackpot_details_pick_nos(String arg1) throws Throwable {
        lotto.WHEN_I_SELECT_VIEW_JACKPOTS_I_CAN_SEE_THE_JACKPOT_DETAILS_PICK_NOS(arg1);
    }

    @When("^I can select number of boards\"([^\"]*)\"$")
    public void i_can_select_number_of_boards(String arg1) throws Throwable {
        lotto.I_CAN_SELECT_NUMBER_OF_BOARDS(arg1);
    }

    @When("^I can increase my chances of winning by selecting to add LOTTO Plus One$")
    public void i_can_increase_my_chances_of_winning_by_selecting_to_add_LOTTO_Plus_One() throws Throwable {
        lotto.I_CAN_INCREASE_MY_CHANCES_OF_WINNING_BY_SELECTING_TO_ADD_LOTTO_PLUS_ONE();
    }

    @When("^I can increase my chances of winning by selecting to add LOTTO Plus Two$")
    public void i_can_increase_my_chances_of_winning_by_selecting_to_add_LOTTO_Plus_Two() throws Throwable {
        lotto.I_CAN_INCREASE_MY_CHANCES_OF_WINNING_BY_SELECTING_TO_ADD_LOTTO_PLUS_TWO();
    }

    @When("^I can remove my chances of winning by de-selecting LOTTO Plus One option$")
    public void i_can_remove_my_chances_of_winning_by_de_selecting_LOTTO_Plus_One_option() throws Throwable {
        lotto.I_CAN_REMOVE_MY_CHANCES_OF_WINNING_BY_DE_SELECTING_LOTTO_PLUS_ONE_OPTION();
    }

    @When("^I can remove my chances of winning by de-selecting LOTTO Plus Two option$")
    public void i_can_remove_my_chances_of_winning_by_de_selecting_LOTTO_Plus_Two_option() throws Throwable {
        lotto.I_CAN_REMOVE_MY_CHANCES_OF_WINNING_BY_DE_SELECTING_LOTTO_PLUS_TWO_OPTION();
    }

    @When("^I can view and select number of draws\"([^\"]*)\"$")
    public void i_can_view_and_select_number_of_draws(String arg1) throws Throwable {
        lotto.I_CAN_VIEW_AND_SELECT_NUMBER_OF_DRAWS(arg1);
    }

    @When("^I can see the total cost of my LOTTO ticket$")
    public void i_can_see_the_total_cost_of_my_LOTTO_ticket() throws Throwable {
        lotto.I_CAN_SEE_THE_TOTAL_COST_OF_MY_LOTTO_TICKET();
    }

    @When("^If I have selected SMS option cellphone number must be auto populated with the number on my profile\"([^\"]*)\"$")
    public void if_I_have_selected_SMS_option_cellphone_number_must_be_auto_populated_with_the_number_on_my_profile(String arg1) throws Throwable {
        lotto.IF_I_HAVE_SELECTED_SMS_OPTION_CELLPHONE_NUMBER_MUST_BE_AUTO_POPULATED_WITH_THE_NUMBER_ON_MY_PROFILE(arg1);
    }

    @When("^As a user I want to see my purchase details so that I can buy the ticket\"([^\"]*)\",\"([^\"]*)\"$")
    public void as_a_user_I_want_to_see_my_purchase_details_so_that_I_can_buy_the_ticket(String arg1, String arg2) throws Throwable {
        lotto.AS_A_USER_I_WANT_TO_SEE_MY_PURCHASE_DETAILS_SO_THAT_I_CAN_BUY_THE_TICKET(arg1,arg2);
    }

    @When("^Terms and conditions must be a hyperlink to the terms and conditions which must display in a new browser window if clicked$")
    public void terms_and_conditions_must_be_a_hyperlink_to_the_terms_and_conditions_which_must_display_in_a_new_browser_window_if_clicked() throws Throwable {
        lotto.TERMS_AND_CONDITIONS_MUST_BE_A_HYPERLINK_TO_THE_TERMS_AND_CONDITIONS_WHICH_MUST_DISPLAY_IN_A_NEW_BROWSER_WINDOW_IF_CLICKED();
    }

    @Then("^LOT_I should be able to see a confirmation screen so that I know that the purchase is done$")
    public void lot_i_should_be_able_to_see_a_confirmation_screen_so_that_I_know_that_the_purchase_is_done() throws Throwable {
        lotto.LOT_I_SHOULD_BE_ABLE_TO_SEE_A_CONFIRMATION_SCREEN_SO_THAT_I_KNOW_THAT_THE_PURCHASE_IS_DONE();
    }

    @Then("^As a user I want to see a confirmation of my purchase details so that I know my purchase is completed\"([^\"]*)\"$")
    public void as_a_user_I_want_to_see_a_confirmation_of_my_purchase_details_so_that_I_know_my_purchase_is_completed(String arg1) throws Throwable {
        lotto.AS_A_USER_I_WANT_TO_SEE_A_CONFIRMATION_OF_MY_PURCHASE_DETAILS_SO_THAT_I_KNOW_MY_PURCHASE_IS_COMPLETED(arg1);
    }

    @Then("^I can click on Go to overview and move to the Overview page or I can click on the Play again button to make another LOTTO purchase\"([^\"]*)\"$")
    public void i_can_click_on_Go_to_overview_and_move_to_the_Overview_page_or_I_can_click_on_the_Play_again_button_to_make_another_LOTTO_purchase(String arg1) throws Throwable {
        lotto.I_CAN_CLICK_ON_GO_TO_OVERVIEW_AND_MOVE_TO_THE_OVERVIEW_PAGE_OR_I_CAN_CLICK_ON_THE_PLAY_AGAIN_BUTTON_TO_MAKE_ANOTHER_LOTTO_PURCHASE(arg1);
    }

    @When("^I can select the pick numbers from the select method drop down and click on next$")
    public void i_can_select_the_pick_numbers_from_the_select_method_drop_down_and_click_on_next() throws Throwable {
        lotto.I_CAN_SELECT_THE_PICK_NUMBERS_FROM_THE_SELECT_METHOD_DROP_DOWN_AND_CLICK_ON_NEXT();
    }

    @When("^I can select numbers for the boards and can add more boards$")
    public void i_can_select_numbers_for_the_boards_and_can_add_more_boards() throws Throwable {
        lotto.I_CAN_SELECT_NUMBERS_FOR_THE_BOARDS_AND_CAN_ADD_MORE_BOARDS();
    }

    @When("^I can select numbers for the boards and can add more boards for powerball$")
    public void i_can_select_numbers_for_the_boards_and_can_add_more_boards_for_powerball() throws Throwable {
        lotto.I_CAN_SELECT_NUMBERS_FOR_THE_BOARDS_AND_CAN_ADD_MORE_BOARDS_FOR_POWERBALL();
    }

    @When("^i select the powerball option$")
    public void i_select_the_powerball_option() throws Throwable {
        lotto.I_SELECT_THE_POWERBALL_OPTION();
    }

}
