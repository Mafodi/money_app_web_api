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

public class FND_Make_A_Payment_Beneficiary_Payment_from_Current_to_Savings_Account_nedbank extends DriverFactory {
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(FND_Make_A_Payment_Beneficiary_Payment_from_Current_to_Savings_Account_nedbank.class);
    Payment_Flow paymentFlow=new Payment_Flow();
    AndroidOverviewScreen overviewScreen= new AndroidOverviewScreen(driver);
    AndroidPayScreen payScreen=new AndroidPayScreen(driver);

    @Given("^PEM_User_SA accesses Payments screen$")
    public void pem_user_saAccessesTransactOverlay() throws Throwable {
        paymentFlow.Navigate_To_Payment_Screen();
    }

    @When("^PEM_User_SA navigates to Single payment screen$")
    public void pem_user_saClickOnTransactAndVerifySubMenuOptionOfPayment() {
        payScreen.Transact_single_pay.click();
        log.info("single payment selected");
    }

    @And("^PEM_Click_SA selects recipients icon$")
    public void pem_click_saSelectsRecipientsIcon() {
        payScreen.Transact_Pay_Beneficiary_list_icon.click();
    }

    @And("^PEM_Click_SA should be able to search \"([^\"]*)\" and select$")
    public void pem_click_saShouldBeAbleToSearchAndSelect(String recipientsname) throws Throwable {
        paymentFlow.Select_Beneficiary(recipientsname);
    }

    @Then("^PEM_Click_SA Clicking on next should take me to next screen$")
    public void pem_click_saClickingOnNextShouldTakeMeToNextScreen() throws InterruptedException {
        paymentFlow.Enter_Payment_Amount();
        basepage.android_scroll_down(3);
        Thread.sleep(2000);
        payScreen.Transact_Pay_Next_button.click();
        payScreen.Transact_Pay_button.click();
    }

    @Then("^PEM_Click_SA should be able to make payment successfully$")
    public void pem_click_saShouldBeAbleToMakePaymentSuccessfully() throws InterruptedException {
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
