package platforms.ui.Web.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.Prepaid_Flow;
import platforms.ui.Web.Foundation_DataFactory;
import utils.CommonFunctions;

public class FND_PrepaidsSteps extends CommonFunctions {

    LoginSteps login = new LoginSteps();
    Prepaid_Flow prepaids = new Prepaid_Flow();
    private static Logger log = Logger.getLogger(LoginSteps.class);


    @Given("^Prepaid_User is navigated to the home page dashboard$")
    public void prepaid_userIsNavigatedToTheHomePageDashboard() throws InterruptedException {

        login.user_launch_prepaid_web_application();
        login.user_enters_username_and_password(Foundation_DataFactory.uname,Foundation_DataFactory.pwd);
        login.user_clicks_on_Login();
        log.info("user able to enter username and password and clicks on Login");
    }

    @When("^Prepaid_User navigates to Prepaids page$")
    public void prepaid_userNavigatesToPrepaidsPage() {

        prepaids.NAVIGATE_TO_PREPAIDS_MENU();
    }

    @When("^I must be able to capture a recipient name\"([^\"]*)\"$")
    public void iMustBeAbleToCaptureARecipientName(String RecipientName)  {

        prepaids.USER_CAPTURES_RECIPIENT(prepaids.RecipientName(15));
    }

    @And("^I must be able to capture a cellphone number in the Recipient cellphone number field\"([^\"]*)\"$")
    public void iMustBeAbleToCaptureACellphoneNumberInTheRecipientCellphoneNumberField(String Cellphone)  {

        prepaids.USER_CAPTURES_CELLPHONE(Cellphone);

    }

    @And("^I must be able to select a provider\"([^\"]*)\"$")
    public void iMustBeAbleToSelectAProvider(String ServiceProvider)  {

        prepaids.USER_SELECTS_SERVICE_PROVIDER(ServiceProvider);

    }

    @And("^Next button must become active and I must be able to select it and continue to the next step$")
    public void nextButtonMustBecomeActiveAndIMustBeAbleToSelectItAndContinueToTheNextStep() {

        prepaids.USER_SELECTS_NEXTR();
    }

    @And("^I must be able to capture a the type of recharge from a dropdown\"([^\"]*)\"$")
    public void iMustBeAbleToCaptureATheTypeOfRechargeFromADropdown(String RechargeType)  {

        prepaids.USER_SELECTS_RECHARGETYPE(RechargeType);
    }

    @And("^I must be able to select the bundle amount\"([^\"]*)\"$")
    public void iMustBeAbleToSelectTheBundleAmount(String Bundle)  {

        prepaids.USER_SELECTS_BUNDLE(Bundle);
    }

    @And("^If I select Own Amount in the bundle drop down then I must be able to see the Own airtime amount field\"([^\"]*)\"$")
    public void ifISelectOwnAmountInTheBundleDropDownThenIMustBeAbleToSeeTheOwnAirtimeAmountField(String arg0)  {


    }

    @And("^I must be able to see my monthly purchase limit in text below the bundle field$")
    public void iMustBeAbleToSeeMyMonthlyPurchaseLimitInTextBelowTheBundleField() {
        
    }

    @And("^I must be able to select a from account\"([^\"]*)\"$")
    public void iMustBeAbleToSelectAFromAccount(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I must be able to capture a reference - Your Reference\"([^\"]*)\"$")
    public void iMustBeAbleToCaptureAReferenceYourReference(String Refference)  {

        prepaids.SELECT_CAPTURES_REF(Refference);


    }

    @And("^I must be able to select from a dropdown one of the following methods SMS Email Fax\"([^\"]*)\"$")
    public void iMustBeAbleToSelectFromADropdownOneOfTheFollowingMethodsSMSEmailFax(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I can enter notification value\"([^\"]*)\" appropriate to method\"([^\"]*)\" chosen$")
    public void iCanEnterNotificationValueAppropriateToMethodChosen(String arg0, String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should be able to see recipient details\"([^\"]*)\",\"([^\"]*)\"$")
    public void iShouldBeAbleToSeeRecipientDetails(String arg0, String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should be able to see mobile provider\"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMobileProvider(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should be able to see the amount\"([^\"]*)\",\"([^\"]*)\" and prepaid type\"([^\"]*)\"$")
    public void iShouldBeAbleToSeeTheAmountAndPrepaidType(String arg0, String arg1, String arg2)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should be able to see Purchase from account\"([^\"]*)\"$")
    public void iShouldBeAbleToSeePurchaseFromAccount(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should be able to see the notification method and details if selected\"([^\"]*)\",\"([^\"]*)\"$")
    public void iShouldBeAbleToSeeTheNotificationMethodAndDetailsIfSelected(String arg0, String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should be able to see the my reference\"([^\"]*)\"$")
    public void iShouldBeAbleToSeeTheMyReference(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I must have the option to save the beneficiary as a toggle\"([^\"]*)\"$")
    public void iMustHaveTheOptionToSaveTheBeneficiaryAsAToggle(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should be able to click on Buy button to confirm the payment$")
    public void iShouldBeAbleToClickOnBuyButtonToConfirmThePayment() {

        prepaids.SELECTS_BUY();
        
    }

    @Then("^I should be able to see a confirmation screen so that I know that the purchase is done$")
    public void iShouldBeAbleToSeeAConfirmationScreenSoThatIKnowThatThePurchaseIsDone()  {

        prepaids.TRANSACTION_STATUS();
    }

    @Then("^I should be able to see the Review Screen$")
    public void iShouldBeAbleToSeeTheReviewScreen() {

        prepaids.VALIDATE_REVIEW_SCREEN();
    }

    @Then("^I should be able to enter the preferred amount \"([^\"]*)\"$")
    public void iShouldBeAbleToEnterThePreferredAmount(String OwnAmount)  {

        prepaids.ENTER_OWN_AMOUNT(OwnAmount);
    }

    @Then("^I should be able to select the preferred notification method \"([^\"]*)\" and capture \"([^\"]*)\"$")
    public void iShouldBeAbleToSelectThePreferredNotificationMethodAndCapture(String NotificationMethod, String NotificationValue)  {

        prepaids.SELECT_NOTIFICATION(NotificationMethod,NotificationValue);

    }

    @When("^I select the preferred prepaid date \"([^\"]*)\"$")
    public void iSelectThePreferredPrepaidDate(String PrepaidDate)  {

        prepaids.SELECT_PREPAID_DATE(PrepaidDate);

    }

    @And("^I must be able to select the preferred frequency \"([^\"]*)\"$")
    public void iMustBeAbleToSelectThePreferredFrequency(String PrepaidFrequency)  {

        prepaids.SELECT_PREPAID_FREQUENCY_WEEKLY(PrepaidFrequency);
    }
    @And("^I must be able to select the preferred frequency Monthly \"([^\"]*)\"$")
    public void iMustBeAbleToSelectThePreferredFrequencyMonthly(String PrepaidFrequency)  {

        prepaids.SELECT_PREPAID_FREQUENCY_MONTHLY(PrepaidFrequency);
    }

    @And("^I must be able to enter the  occurrence number \"([^\"]*)\"$")
    public void iMustBeAbleToEnterTheOccurrenceNumber(String Occurrence)  {

        prepaids.SELECT_TRANSFER_OCCURRENCES(Occurrence);

    }
}



