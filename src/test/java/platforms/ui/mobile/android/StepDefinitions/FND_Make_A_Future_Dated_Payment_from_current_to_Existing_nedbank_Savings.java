package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.Payment_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidOverviewScreen;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidPayScreen;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import utils.DriverFactory;

public class FND_Make_A_Future_Dated_Payment_from_current_to_Existing_nedbank_Savings extends DriverFactory {

    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(FND_Make_A_Payment_Beneficiary_Payment_from_Current_to_Current_Account_nedbank.class);
    AndroidOverviewScreen overviewScreen= new AndroidOverviewScreen(driver);
    AndroidPayScreen payScreen=new AndroidPayScreen(driver);
    Payment_Flow paymentFlow=new Payment_Flow();

    public FND_Make_A_Future_Dated_Payment_from_current_to_Existing_nedbank_Savings(){}

    @Given("^FD_User_SA is on the Payment screen$")
    public void fd_user_saIsOnThePaymentScreen() throws Throwable {
        paymentFlow.Navigate_To_Payment_Screen();
    }

    @When("^FD_User_SA navigates to Single Payment screen$")
    public void fd_user_saNavigatesToSinglePaymentScreen() {
        payScreen.Transact_single_pay.click();
        log.info("single payment selected");
    }

    @And("^FD_User_SA selects recipients icon$")
    public void fd_user_saSelectsRecipientsIcon() {
        payScreen.Transact_Pay_Beneficiary_list_icon.click();
    }

    @And("^FD_User_SA should be able to search \"([^\"]*)\" and select$")
    public void fd_user_saShouldBeAbleToSearchAndSelect(String recipientsname) throws Throwable {
        paymentFlow.Select_Beneficiary(recipientsname);
    }

    @Then("^FD_User_SA Clicking on next should take me to next screenThen PEM_AcctUser_schedule clicking on next should take me to next screen and select a future date$")
    public void fd_user_saClickingOnNextShouldTakeMeToNextScreenThenPEM_AcctUser_scheduleClickingOnNextShouldTakeMeToNextScreenAndSelectAFutureDate() throws InterruptedException {
        paymentFlow.Enter_Payment_Amount();
        paymentFlow.Select_future_date();
    }

    @And("^FD_User_SA should be able to make payment successfully$")
    public void fd_user_saShouldBeAbleToMakePaymentSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        if (overviewScreen.Pay_success.isDisplayed()){
            log.info("Payment completed successfully");
        }
        else {
            log.info("Payment unsuccessful");
        }
        basepage.android_scroll_down(2);
        payScreen.Transact_Pay_Finish_button.click();
    }
}
