package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import platforms.ui.Web.FlowModel.SQ_BranchLocator_Flow;
import utils.Utils;

public class SQ_Web_AuthOpt_Out_Mode extends Utils {

    public static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(SQ_Web_AuthOpt_Out_Mode.class);
    SQ_BranchLocator_Flow branchlocatorflow = new SQ_BranchLocator_Flow();


    @When("^close the default opened_browser$")
    public void closeTheDefaultOpened_browser() {
        driver.close();
    }

    @And("^Launched the new browser successfully by 'Deny' the Geo_locations$")
    public void launchedTheNewBrowserSuccessfullyByDenyTheGeo_locations() {
        branchlocatorflow.sq_setupWebDriver("Chrome");

    }

    @Then("^Verify the \"([^\"]*)\" Status Time_Kms displayed for the selected branch$")
    public void verifyTheStatusTime_KmsDisplayedForTheSelectedBranch(String Branchname) throws InterruptedException {
        SQ_BranchLocator_Flow branchlocatorflow = new SQ_BranchLocator_Flow();
        branchlocatorflow.status_Time_Kms_Branch_(Branchname);

    }

    @When("^Click on More branch_info option on \"([^\"]*)\" Branch$")
    public void clickOnMoreBranch_infoOptionOnBranch(String Branchname) throws Exception {
        SQ_BranchLocator_Flow branchlocatorflow = new SQ_BranchLocator_Flow();
        branchlocatorflow.click_Morebranchinfo(Branchname);
    }

    @When("^User Clicks_on ATM Tab$")
    public void userClicks_onATMTab() throws Throwable {
        SQ_BranchLocator_Flow branchlocatorflow = new SQ_BranchLocator_Flow();
        branchlocatorflow.click_ATM_Tab_Opt_Out();
    }

    @And("^User Manually typed \"([^\"]*)\" on_the Search_bar and Clicks_enter$")
    public void userManuallyTypedOn_theSearch_barAndClicks_enter(String location) throws Throwable {
        SQ_BranchLocator_Flow branchlocatorflow = new SQ_BranchLocator_Flow();
        branchlocatorflow.searchbar(location);
    }

    @And("^User Manually typed invalid \"([^\"]*)\" on_the Search_bar and verifies the error message$")
    public void userManuallyTypedInvalidOn_theSearch_barAndVerifiesTheErrorMessage(String location) throws InterruptedException {
        SQ_BranchLocator_Flow branchlocatorflow = new SQ_BranchLocator_Flow();
        branchlocatorflow.searchbar_error(location);
    }
}
