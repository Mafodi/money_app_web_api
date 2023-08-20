package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.FND_Statement_Flow;


public class FND_Statements {

    FND_Statement_Flow stmnt = new FND_Statement_Flow();

    @When("^In Overview I select the account number or name \"([^\"]*)\" of account type \"([^\"]*)\"$")
    public void in_Overview_I_select_the_account_number_or_name_of_account_type(String arg1, String arg2) throws Throwable {
        stmnt.IN_OVERVIEW_I_SELECT_THE_ACCOUNT_NUMBER_OR_NAME_OF_ACCOUNT_TYPE(arg1,arg2);
    }

    @When("^On the account view screen, In the feature block, I select Statements and documents$")
    public void on_the_account_view_screen_In_the_feature_block_I_select_Statements_and_documents() throws Throwable {
        stmnt.ON_THE_ACCOUNT_VIEW_SCREEN_IN_THE_FEATURE_BLOCK_I_SELECT_STATEMENTS_AND_DOCUMENTS();
    }

    @Then("^I can view the statement delivery method and statement frequency against each account$")
    public void i_can_view_the_statement_delivery_method_and_statement_frequency_against_each_account() throws Throwable {
        stmnt.I_CAN_VIEW_THE_STATEMENT_DELIVERY_METHOD_AND_STATEMENT_FREQUENCY_AGAINST_EACH_ACCOUNT();
    }

    @Then("^I will have the option to change the method of the statement delivery for selected account\\(s\\)\"([^\"]*)\"$")
    public void i_will_have_the_option_to_change_the_method_of_the_statement_delivery_for_selected_account_s(String arg1) throws Throwable {
        stmnt.I_WILL_HAVE_THE_OPTION_TO_CHANGE_THE_METHOD_OF_THE_STATEMENT_DELIVERY_FOR_SELECTED_ACCOUNT_S(arg1);
    }

    @Then("^I am able to set the preference for sending statements through email to one or many recipients for the specific account\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void i_am_able_to_set_the_preference_for_sending_statements_through_email_to_one_or_many_recipients_for_the_specific_account(String email, String arg2, String arg3) throws Throwable {
        stmnt.I_AM_ABLE_TO_SET_THE_PREFERENCE_FOR_SENDING_STATEMENTS_THROUGH_EMAIL_TO_ONE_OR_MANY_RECIPIENTS_FOR_THE_SPECIFIC_ACCOUNT(email,arg2,arg3);
    }

    @Then("^I confirm the updates done on statement delivery method$")
    public void i_confirm_the_updates_done_on_statement_delivery_method() throws Throwable {
        stmnt.I_CONFIRM_THE_UPDATES_DONE_ON_STATEMENT_DELIVERY_METHOD();
    }
}
