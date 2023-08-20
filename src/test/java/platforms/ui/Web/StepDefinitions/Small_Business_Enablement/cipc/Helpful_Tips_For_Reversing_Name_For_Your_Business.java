package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.cipc;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import platforms.ui.Web.FlowModel.SBE.Business_Registration;



public class Helpful_Tips_For_Reversing_Name_For_Your_Business {

    private static Logger log = Logger.getLogger(Helpful_Tips_For_Reversing_Name_For_Your_Business.class);

    @And("^I am now on the reserve a name for your business page$")
    public void iAmNowOnTheReserveANameForYourBusinessPage() {

        Business_Registration.clickNextOnCompanyDirectorship();
        Business_Registration.clickRegisterWithName();

    }

    @When("^I see the helpful tips panel and click on any one of the links$")
    public void iSeeTheHelpfulTipsPanelAndClickOnAnyOneOfTheLinks() {

        Business_Registration.clickAnyHelpfulLink();
    }

    @Then("^I will see the description open up$")
    public void iWillSeeTheDescriptionOpenUp() {

        Business_Registration.validateHelpfulTips();

        Business_Account.closeDriver();
    }
}
