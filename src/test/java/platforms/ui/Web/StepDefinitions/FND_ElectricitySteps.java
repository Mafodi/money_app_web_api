package platforms.ui.Web.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.Common_Flow;
import platforms.ui.Web.FlowModel.Prepaid_Flow;
import platforms.ui.Web.Foundation_DataFactory;
import utils.CommonFunctions;

public class FND_ElectricitySteps extends CommonFunctions {

    LoginSteps login = new LoginSteps();
    Prepaid_Flow prepaids = new Prepaid_Flow();
    Common_Flow common = new Common_Flow();
    private static Logger log = Logger.getLogger(LoginSteps.class);


    @Given("^ELE_User navigated to the  home page$")
    public void ele_userNavigatedToTheHomePage() throws InterruptedException {

        login.user_launch_prepaid_web_application();
        login.user_enters_username_and_password(Foundation_DataFactory.uname,Foundation_DataFactory.pwd);
        login.user_clicks_on_Login();
        log.info("user able to enter username and password and clicks on Login");
    }

    @And("^I navigate to the Buy-Electricity function$")
    public void iNavigateToTheBuyElectricityFunction() {

        prepaids.NAVIGATE_TO_ELECTRICITY_MENU();

    }

    @When("^I must be able to capture the recipient name\"([^\"]*)\"$")
    public void iMustBeAbleToCaptureTheRecipientName(String arg0) throws Throwable {

    }

    @Then("^I must be able to enter the recipient meter number\"([^\"]*)\"$")
    public void iMustBeAbleToEnterTheRecipientMeterNumber(String MeterNumber) throws Throwable {

        prepaids.USER_CAPTURES_METER(MeterNumber);
    }

    @And("^I must be able to continue by selecting the Next button$")
    public void iMustBeAbleToContinueBySelectingTheNextButton() {

        prepaids.USER_SELECTS_NEXTR();

    }

    @When("^I  capture amount\"([^\"]*)\"$")
    public void iCaptureAmount(String Amount) throws Throwable {

        prepaids.ENTER_OWN_AMOUNT(Amount);
    }

    @Then("^I must be able to select a from account\"([^\"]*)\" to purchase electricity$")
    public void iMustBeAbleToSelectAFromAccountToPurchaseElectricity(String AccountNumber) throws Throwable {

        common.SELECT_FROM_ACCOUNT(AccountNumber);

    }

    @And("^I must be able to capture Your Reference\"([^\"]*)\"$")
    public void iMustBeAbleToCaptureYourReference(String Referrence) throws Throwable {

        prepaids.SELECT_CAPTURES_ELE_REF(Referrence);

    }

    @Then("^I must have the option to save the beneficiary$")
    public void iMustHaveTheOptionToSaveTheBeneficiary() {

        prepaids.VALIDATE_REVIEW_ELEC_SCREEN();

    }

    @And("^I must be able to confirm and proceed by selecting the Buy button$")
    public void iMustBeAbleToConfirmAndProceedBySelectingTheBuyButton() {

        prepaids.SELECTS_BUY_EELECTRICITY();

    }

    @Then("^I should be able to see a electricity confirmation screen so that I know that the purchase is done$")
    public void iShouldBeAbleToSeeAElectricityConfirmationScreenSoThatIKnowThatThePurchaseIsDone() {
        prepaids.TRANSACTION_STATUS();
    }

    @When("^I must be able to capture electricity recipient name\"([^\"]*)\"$")
    public void iMustBeAbleToCaptureElectricityRecipientName(String Recipient) throws Throwable {

        prepaids.USER_CAPTURES_ELE_RECIPIENT(Recipient);
    }

    @And("^I must be able to continue by selecting the Elec Next button$")
    public void iMustBeAbleToContinueBySelectingTheElecNextButton() throws InterruptedException {


        Thread.sleep(5000);
        prepaids.USER_SELECTS_NEXTR();
    }

    @And("^I should be able to see the notification type and details\"([^\"]*)\",\"([^\"]*)\"$")
    public void iShouldBeAbleToSeeTheNotificationTypeAndDetails(String NotificationType, String NotificationValue) throws Throwable {

        prepaids.SELECT_NOTIFICATION_ELECT(NotificationType,NotificationValue);

    }
}



