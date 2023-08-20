package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.FND_Payment_Flow;
import platforms.ui.Web.FlowModel.Transfer_Flow;
import platforms.ui.Web.Foundation_DataFactory;
import utils.CommonFunctions;

public class FND_TransferSteps extends CommonFunctions {

    LoginSteps login = new LoginSteps();
    Transfer_Flow trnasfer = new Transfer_Flow();
    FND_Payment_Flow payment = new FND_Payment_Flow();
    private static Logger log = Logger.getLogger(LoginSteps.class);



    @And("^TCI_User Enter Transfer \"([^\"]*)\"$")
    public void tci_userEnterTransfer(String amount) throws Throwable {

        trnasfer.ENTER_TRANSFER_AMOUNT(amount);

    }



    @And("^TCI_User Validate Fields On Transfer Success Screen$")
    public void tci_userValidateFieldsOnTransferSuccessScreen() throws InterruptedException {

        Thread.sleep(2000);
        trnasfer.VALIDATION_STATUS();


    }

    @Then("^TCI_User Click Finish Button$")
    public void tci_userClickFinishButton() {
    }

    @Given("^TCI_User is navigated to the home page dashboard$")
    public void tci_userIsNavigatedToTheHomePageDashboard() throws InterruptedException {

        login.user_launch_prepaid_web_application();
        login.user_enters_username_and_password(Foundation_DataFactory.uname,Foundation_DataFactory.pwd);
        login.user_clicks_on_Login();
        log.info("user able to enter username and password and clicks on Login");
    }

    @When("^TCI_User navigates to transfer page$")
    public void tci_userNavigatesToTransferPage() throws InterruptedException {

        trnasfer.NAVIGATE_TO_TRANSFER_MENU();



    }

    @And("^TCI_User navigates to next screen$")
    public void tci_userNavigatesToNextScreen() throws InterruptedException {

        trnasfer.CLICK_NEXT();

    }

    @And("^TCI_User submits the transfer$")
    public void tci_userSubmitsTheTransfer() throws InterruptedException {

        trnasfer.TRANSFER_BUTTON();

    }



    @Then("^TCI_User selects the investment account \"([^\"]*)\"$")
    public void tci_userSelectsTheInvestmentAccount(String InvestmentAccount) throws Throwable {

        trnasfer.SELECT_TO_ACCOUNT(InvestmentAccount);


    }

    @Then("^TCI_User selects the Credit account \"([^\"]*)\"$")
    public void tci_userSelectsTheCreditAccount(String CreditAccount) throws Throwable {

        trnasfer.SELECT_TO_ACCOUNT(CreditAccount);

    }

    @Then("^TCI_User selects the Homeloan account \"([^\"]*)\"$")
    public void tci_userSelectsTheHomeloanAccount(String HomeloanAccount) throws Throwable {

        trnasfer.SELECT_TO_ACCOUNT(HomeloanAccount);

    }

    @Then("^TCI_User selects preferred transfer date \"([^\"]*)\"$")
    public void tci_userSelectsPreferredTransferDate(String TransferDate) throws Throwable {

        trnasfer.SELECT_TRANSFER_DATE(TransferDate);
    }

    @When("^TCI_User selects the repeat method \"([^\"]*)\"$")
    public void tci_userSelectsTheRepeatMethod(String RepeatMethod) throws Throwable {

        trnasfer.SELECT_REPEAT_METHOD(RepeatMethod);

    }

    @Then("^TCI_User selects occurrence \"([^\"]*)\"$")
    public void tci_userSelectsOccurrence(String Occurrence) throws Throwable {

        trnasfer.SELECT_TRANSFER_OCCURRENCES(Occurrence);

    }

    @When("^TCI_User selects the repeat method Weekly \"([^\"]*)\"$")
    public void tci_userSelectsTheRepeatMethodWeekly(String RepeatWeekly) throws Throwable {

        trnasfer.SELECT_REPEAT_METHOD_WEEKLY(RepeatWeekly);
    }

    @Then("^TCI_User Validate Fields On Transfer scheduled Success Screen$")
    public void tci_userValidateFieldsOnTransferScheduledSuccessScreen() {
        trnasfer.SCHEDULED_VALIDATION_STATUS();
    }
}



