package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.businessAccount;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import utils.Utils;


public class Business_Account_Compare_Different_Product_Options extends Utils {


    private static Logger log = Logger.getLogger(Business_Account_Compare_Different_Product_Options.class);
    Business_Account myMethods = new Business_Account();

    @Given("^User is on Business Accounts screen$")
    public void user_is_on_Business_Accounts_screen(){

        String baseURL = getConfigPropertyValue("./SBE.properties", "url");
        Business_Account.driverInitializer(baseURL);

        Business_Account.UserOnBusinessAccountPage();
    }

    @When("^User clicks on Compare accounts button$")
    public void user_clicks_on_Compare_accounts_button(){

        Business_Account.compareAccounts();
    }

    @Then("^User compares information between BUSINESS BUNDLE and BUSINESS CURRENT ACCOUNT$")
    public void user_compares_information_between_BUSINESS_BUNDLE_and_BUSINESS_CURRENT_ACCOUNT(){

        Business_Account.verifyAndCompareAccounts();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Account.closeDriver();
    }

}
