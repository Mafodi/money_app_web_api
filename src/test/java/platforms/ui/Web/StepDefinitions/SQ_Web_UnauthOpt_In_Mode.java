package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SQ_BranchLocator_Flow;
import utils.Utils;


public class SQ_Web_UnauthOpt_In_Mode extends Utils {

    public static Logger log = Logger.getLogger(SQ_Web_UnauthOpt_In_Mode.class);
    SQ_BranchLocator_Flow branchlocatorflow = new SQ_BranchLocator_Flow();


    @When("^User clicks on 'Branch locator' menu item$")
    public void user_clicks_on_Branch_locator_menu_item() throws Exception {
        branchlocatorflow.guest_Clicks_Branchlocator();


    }

    @And("^User selects the option of Opening hours \"([^\"]*)\" Inbranch services \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"Features \"([^\"]*)\"on the filter$")
    public void userSelectsTheOptionOfOpeningHoursInbranchServicesFeaturesOnTheFilter(String Openinghours, String Inbranchservices1, String Inbranchservices2, String Inbranchservices3, String Inbranchservices4, String Features) throws Throwable {
        branchlocatorflow.advanceFilter_Warning(Openinghours, Inbranchservices1, Inbranchservices2, Inbranchservices3, Inbranchservices4, Features);
    }

    @When("^User click on Tag of the \"([^\"]*)\" \"([^\"]*)\"$")
    public void userClickOnTagOfThe(String Inbranchservice_option1, String Inbranchservice_option2) throws Throwable {
        branchlocatorflow.clicks_Tag_Adv_options(Inbranchservice_option1, Inbranchservice_option2);
    }

    @When("^Clicks on Clear all/Clear filter$")
    public void clicksOnClearAllClearFilter() throws Throwable {
        branchlocatorflow.clear_Advancefilter();
    }
}
