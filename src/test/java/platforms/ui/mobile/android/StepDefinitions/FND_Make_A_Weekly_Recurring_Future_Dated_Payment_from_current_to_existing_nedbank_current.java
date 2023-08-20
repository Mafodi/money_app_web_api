package platforms.ui.mobile.android.StepDefinitions;


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

public class FND_Make_A_Weekly_Recurring_Future_Dated_Payment_from_current_to_existing_nedbank_current extends DriverFactory {

    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(FND_Make_A_Payment_Beneficiary_Payment_from_Current_to_Current_Account_nedbank.class);
    AndroidOverviewScreen overviewScreen= new AndroidOverviewScreen(driver);
    AndroidPayScreen payScreen=new AndroidPayScreen(driver);
    Payment_Flow paymentFlow=new Payment_Flow();

    public FND_Make_A_Weekly_Recurring_Future_Dated_Payment_from_current_to_existing_nedbank_current(){}

    @Given("^FD_Weekly_User_CA is on the Payment screen$")
    public void fd_weekly_user_caIsOnThePaymentScreen() throws Throwable {
        paymentFlow.Navigate_To_Payment_Screen();
    }

    @When("^FD_Weekly_User_CA navigates to Single Payment screen$")
    public void fd_weekly_user_caNavigatesToSinglePaymentScreen() {
        payScreen.Transact_single_pay.click();
        log.info("single payment selected");
    }

    @And("^FD_Weekly_User_CA selects recipients icon$")
    public void fd_weekly_user_caSelectsRecipientsIcon() {
        payScreen.Transact_Pay_Beneficiary_list_icon.click();
    }

    @And("^FD_Weekly_User_CA should be able to search \"([^\"]*)\" and select$")
    public void fd_weekly_user_caShouldBeAbleToSearchAndSelect(String recipientsname) throws Throwable {
        paymentFlow.Select_Beneficiary(recipientsname);
    }

    @And("^FD_Weekly_User_CA selects a future date for payment$")
    public void fd_weekly_user_caSelectsAFutureDateForPayment() throws InterruptedException {
        paymentFlow.Enter_Recurring_Payment_Amount();
        paymentFlow.Select_recurring_future_date();
    }

    @And("^FD_Weekly_User_CA selects repeat weekly$")
    public void fd_weekly_user_caSelectsRepeatWeekly() throws InterruptedException
    {
        payScreen.Repeat_by.click();
        payScreen.Weekly.click();
        basepage.android_scroll_down(2);
        payScreen.Transact_Pay_Next1_button.click();
        Thread.sleep(2000);
        payScreen.Transact_Pay_button.click();
    }

    @Then("^FD_Weekly_User_CA should be able to make payment successfully$")
    public void fd_weekly_user_caShouldBeAbleToMakePaymentSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        if (overviewScreen.Pay_success.isDisplayed()) {
            log.info("Payment completed successfully"); }
        else {
            log.info("Payment unsuccessful");
        }
        basepage.android_scroll_down(2);
        payScreen.Transact_Pay_Finish_button.click();
    }
}
