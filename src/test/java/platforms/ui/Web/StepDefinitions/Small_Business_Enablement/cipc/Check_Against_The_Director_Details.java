package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.cipc;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import platforms.ui.Web.FlowModel.SBE.Business_Registration;
import platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable.SBE_DataFactory;


public class Check_Against_The_Director_Details {


    Business_Account myMethods = new Business_Account();
    private static Logger log = Logger.getLogger(Check_Against_The_Director_Details.class);

    @Given("^I have logged in successfully with these credentials (.*) and (.*)$")
    public void iHaveLoggedInSuccessfullyWithTheseCredentialsUsernameAndPassword(String username, String password) {

        Business_Account.driverInitializer(SBE_DataFactory.cipcURL);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Registration.clickOnRegisterOnTheLandingPage();
        Business_Registration.selectDirectorOrShareholder();
        Business_Account.selectAgreeTermsAndConditions();
        Business_Account.clickNextBusinessBundle();
        Business_Account.clickYesOnNedbankClientQuestion();
        Business_Account.enterUsername(username);
        Business_Account.enterPassword(password);
        Business_Account.clickLogin();
        Business_Registration.verifyDirectorDetailsPage();
    }

    @When("^I click next on director details$")
    public void iClickNextOnDirectorDetails() {

        Business_Registration.clickNextOnCompanyDirectorship();
    }

    @Then("^I am now shown a message that CIPC details cannot be verified$")
    public void iAmNowShownAMessageThatCIPCDetailsCannotBeVerified() {

        Business_Registration.verifyDirectorDetailsPage();

        //TODO --> Only Apply If CIPC Is Down

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Account.closeDriver();
    }

}
