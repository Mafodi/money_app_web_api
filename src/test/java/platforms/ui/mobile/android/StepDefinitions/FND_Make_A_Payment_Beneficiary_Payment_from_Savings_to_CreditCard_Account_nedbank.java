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

import java.util.concurrent.TimeUnit;

public class FND_Make_A_Payment_Beneficiary_Payment_from_Savings_to_CreditCard_Account_nedbank extends DriverFactory {
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(FND_Make_A_Payment_Beneficiary_Payment_from_Savings_to_CreditCard_Account_nedbank.class);
    Payment_Flow paymentFlow=new Payment_Flow();
    AndroidOverviewScreen overviewScreen= new AndroidOverviewScreen(driver);
    AndroidPayScreen payScreen=new AndroidPayScreen(driver);

    @Given("^PEM_User_CCR accesses Payments screen$")
    public void pem_user_ccrAccessesTransactOverlay() throws Throwable {
        paymentFlow.Navigate_To_Payment_Screen();
    }

    @When("^PEM_User_CCR navigates to Single Payments screen$")
    public void pem_user_ccrClickOnTransactAndVerifySubMenuOptionOfPayment() {
        payScreen.Transact_single_pay.click();
        log.info("single payment selected");
    }

    @And("^PEM_Click_CCR selects recipients icon$")
    public void pem_click_ccrSelectsRecipientsIcon() {
        payScreen.Transact_Pay_Beneficiary_list_icon.click();
    }

    @And("^PEM_Click_CCR should be able to search \"([^\"]*)\" and select$")
    public void pem_click_ccrShouldBeAbleToSearchAndSelect(String recipientsname) throws Throwable {
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        payScreen.Payment_recipients_search_input.sendKeys(recipientsname);
        Thread.sleep(2000);
        String text = payScreen.Payment_recipients_benificaryname.getText();
        if(text.equalsIgnoreCase(recipientsname)) {
            payScreen.Payment_recipients_benificaryname.click();
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
            try {
                basepage.android_scroll_down(2);
            } catch (Exception e) {
                log.info("Failed to select beneficiary",e);
            }
        }
    }

    @Then("^PEM_Click_CCR Clicking on next should take me to next screen$")
    public void pem_click_ccrClickingOnNextShouldTakeMeToNextScreen() throws InterruptedException {
        paymentFlow.Enter_Payment_Amount();
        //swipe to select from account
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.5);
        basepage.android_scroll_down(3);
        Thread.sleep(2000);
        payScreen.Transact_Pay_Next_button.click();
        payScreen.Transact_Pay_button.click();
    }

    @Then("^PEM_Click_CCR should be able to make payment successfully$")
    public void pem_click_ccrShouldBeAbleToMakePaymentSuccessfully() throws InterruptedException {
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
