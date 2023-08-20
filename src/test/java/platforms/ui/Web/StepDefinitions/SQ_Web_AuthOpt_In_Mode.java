package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SQ_BranchLocator_Flow;
import utils.Utils;

public class SQ_Web_AuthOpt_In_Mode extends Utils {

    public static Logger log = Logger.getLogger(SQ_Web_AuthOpt_In_Mode.class);
    LoginSteps loginSteps=new LoginSteps();
    SQ_BranchLocator_Flow branchlocatorflow = new SQ_BranchLocator_Flow();

    @Given("^user launch Money App web application$")
    public void user_launch_Money_App_web_application() {
        loginSteps.user_launch_prepaid_web_application();

    }
    @When("^Web user enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void webUserEnterUsernameAndPassword(String username, String Password) throws Throwable {
        loginSteps.user_enters_username_and_password(username, Password);
    }

    @And("^User clicks on Login button$")
    public void userClicksOnLoginButton() throws Throwable {
        loginSteps.user_clicks_on_Login();
    }

    @Then("^user must log on to Money Web application$")
    public void userMustLogOnToMoneyWebApplication() {
        branchlocatorflow.logon_landing_Welcomepage();

    }

    @And("^Click on Find now option to validate the List of Branches$")
    public void clickOnFindNowOptionToValidateTheListOfBranches() throws InterruptedException {
        branchlocatorflow.click_findbranch_validate_tenbranches();

    }

    @Then("^Verify the Status Time_Kms displayed for the first branch out of List$")
    public void verifyTheStatusTime_KmsDisplayedForTheFirstBranchOutOfList() throws Throwable {
        branchlocatorflow.opt_In_Firstbranch_Status_Time_Kms_Branch_();
    }

    @When("^Click on MoreBranch Info option of first Branch$")
    public void clickOnMoreBranchInfoOptionOfFirstBranch() {
        branchlocatorflow.opt_In_Firstbranch_Morebranchinfo();
    }

    @Then("^Verify that user landed with Address,Phone number ,Email,Branchcode and Opening hours and Features and In Branch Services page$")
    public void verifyThatUserLandedWithAddressPhoneNumberEmailBranchcodeAndOpeningHoursAndFeaturesAndInBranchServicesPage() throws Throwable {
        branchlocatorflow.validating_Qmatic_Nonqmatic_Branchinfopage_fields();
    }

    @When("^Clicks on the cross button of the MoreBranch Info Screen$")
    public void clicksOnTheCrossButtonOfTheMoreBranchInfoScreen() throws InterruptedException {
        branchlocatorflow.usercloses_Morebranchinfo_page();
    }

    @Then("^Verify user gets back to the SideBar  Page$")
    public void verifyUserGetsBackToTheSideBarPage() {
        branchlocatorflow.verifyuser_landed_sidebar_page();
    }

    @When("^user click on the Advance_Filter Option$")
    public void userClickOnTheAdvance_FilterOption() {
        branchlocatorflow.userclicks_on_advancefilters();
    }

    @And("^User selects the option of Opening hours \"([^\"]*)\" Inbranch services \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"Features \"([^\"]*)\"on the filter$")
    public void userSelectsTheOptionOfOpeningHoursInbranchServicesFeaturesOnTheFilter(String Openinghours, String Inbranchservices1,String Inbranchservices2, String Inbranchservices3, String Features) throws Throwable {
        branchlocatorflow.advanceFilter(Openinghours,Inbranchservices1,Inbranchservices2,Inbranchservices3, Features);
    }

    @And("^Clicks on Apply_Filter button$")
    public void clicksOnApply_FilterButton() throws InterruptedException {
        branchlocatorflow.clicks_ApplyFilter();
    }

    @Then("^Verify the List of Branches displayed on the Side_bar$")
    public void verifyTheListOfBranchesDisplayedOnTheSide_bar() throws InterruptedException {
        branchlocatorflow.listofBranches();

    }

    @When("^User clicks on ATM__Tab$")
    public void userClicksOnATM__Tab() throws Throwable {
        branchlocatorflow.click_ATM_Tab_Opt_In();
    }

    @Then("^Verify the Ten ATM__displayed on the side bar$")
    public void verifyTheTenATM__displayedOnTheSideBar() throws Throwable {
        branchlocatorflow.listofBranches();
    }

    @And("^Verify the Address_Kms_Type displayed for all_ATM$")
    public void verifyTheAddress_Kms_TypeDisplayedForAll_ATM() throws Throwable {
        branchlocatorflow.aTM_Stats();
    }


    @When("^User clicks on Branch__Tab$")
    public void userClicksOnBranch__Tab() throws Throwable {
        branchlocatorflow.click_Branch_Tab_Opt_In();
    }

    @When("^User clicks on Logout button$")
    public void userClicksOnLogoutButton() {
        branchlocatorflow.logout();

    }

    @Then("^Verified the Error meesage$")
    public void verifiedTheErrorMeesage() throws Throwable {
        branchlocatorflow.Advancefilter_error();
    }


    @Then("^User Manually typed \"([^\"]*)\" and verified  Autosuggestions$")
    public void userManuallyTypedAndVerifiedAutosuggestions(String location) throws Throwable {
        branchlocatorflow.Autosuggestion(location);
    }
}
