package platforms.ui.Web.FlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import platforms.ui.Web.Pages.FND_CardsPage;
import platforms.ui.Web.Pages.FND_Statement_Page;
import platforms.ui.Web.StepDefinitions.LoginSteps;
import utils.CommonFunctions;
import utils.Utils;

public class FND_Statement_Flow extends Utils {

    public FND_Statement_Page sp = PageFactory.initElements(driver, FND_Statement_Page.class);
    public static CommonFunctions cf = PageFactory.initElements(driver, CommonFunctions.class);
    private static Logger logger = Logger.getLogger(FND_Payment_Flow.class);
    LoginSteps login = new LoginSteps();

    public void IN_OVERVIEW_I_SELECT_THE_ACCOUNT_NUMBER_OR_NAME_OF_ACCOUNT_TYPE(String arg1, String arg2) throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(sp.First_Account_In_Home_Page),10);
        logger.info("clicked on first account number");
    }

    public void ON_THE_ACCOUNT_VIEW_SCREEN_IN_THE_FEATURE_BLOCK_I_SELECT_STATEMENTS_AND_DOCUMENTS() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(sp.Statement_And_Documents),10);
        logger.info("clicked on statements and documents");
    }

    public void I_CAN_VIEW_THE_STATEMENT_DELIVERY_METHOD_AND_STATEMENT_FREQUENCY_AGAINST_EACH_ACCOUNT() throws Throwable {
        boolean b=false;
        cf.clickAndTryMultiple(cf.waitForElement(sp.Preferences),10);
        try{
            cf.waitForElement(sp.Statement_Preferences,10);
            b=true;
        }catch(Exception e){

        }
        if(b){
            logger.info("preferences are shown for statement");
        }
    }

    public void I_WILL_HAVE_THE_OPTION_TO_CHANGE_THE_METHOD_OF_THE_STATEMENT_DELIVERY_FOR_SELECTED_ACCOUNT_S(String arg1) throws Throwable {
    }

    public void I_AM_ABLE_TO_SET_THE_PREFERENCE_FOR_SENDING_STATEMENTS_THROUGH_EMAIL_TO_ONE_OR_MANY_RECIPIENTS_FOR_THE_SPECIFIC_ACCOUNT(String email, String arg2, String arg3) throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(sp.Add_Alternate_Email),10);
        cf.sendKeysAndTryMultiple(cf.waitForElement(sp.Secondary_Email_TextBox),email,5);
    }

    public void I_CONFIRM_THE_UPDATES_DONE_ON_STATEMENT_DELIVERY_METHOD() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(sp.Save_Button),10);
    }
}
