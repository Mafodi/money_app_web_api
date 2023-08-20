package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import platforms.ui.mobile.ios.IOSCommonMethods;
import platforms.ui.mobile.ios.iOSFlowModel.iOSPayment_Flow;
import platforms.ui.mobile.ios.iOSPageObjects.iOSOverviewScreen;
import platforms.ui.mobile.ios.iOSPageObjects.iOSPayScreen;
import utils.DriverFactory;

public class FND_Make_A_Payment_Beneficiary_Payment_from_Current_to_HomeLoan_Account_nedbank extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getIOSDriver(), 30);
    private IOSCommonMethods basepage = new IOSCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(platforms.ui.mobile.ios.StepDefinitions.FND_Make_A_Payment_Beneficiary_Payment_from_Current_to_Current_Account_nedbank.class);
    iOSOverviewScreen overviewScreen= new iOSOverviewScreen(driver);
    iOSPayScreen payScreen=new iOSPayScreen(driver);
    iOSPayment_Flow paymentFlow=new iOSPayment_Flow();

    public FND_Make_A_Payment_Beneficiary_Payment_from_Current_to_HomeLoan_Account_nedbank(){}

    @Given("^PEM_User_HL is on the Payment screen ios app$")
    public void pem_user_hlIsOnThePaymentScreenIosApp() throws Throwable {
        paymentFlow.Navigate_To_Payment_Screen();
    }

    @When("^PEM_User_HL navigates to Single Payment screen ios app$")
    public void pem_user_hlNavigatesToSinglePaymentScreenIosApp() {
        payScreen.Transact_single_pay.click();
        log.info("single payment selected");
    }

    @And("^PEM_User_HL selects recipients icon ios app$")
    public void pem_user_hlSelectsRecipientsIconIosApp() {
        payScreen.Transact_Pay_Beneficiary_list_icon.click();
    }

    @And("^PEM_User_HL should be able to search \"([^\"]*)\" and select ios app$")
    public void pem_user_hlShouldBeAbleToSearchAndSelectIosApp(String recipientsname) throws Throwable {
        Thread.sleep(2000);
        payScreen.Beneficiary_search_input.click();
        Thread.sleep(2000);
        payScreen.Beneficiary_search_input.sendKeys(recipientsname);
        driver.hideKeyboard();
        payScreen.Beneficiary_select.click();
        try {
            basepage.scrollPage("down");
        } catch (Exception e) {
            log.info("Failed to select beneficiary", e);
        }
    }

    @Then("^PEM_User_HL Clicking on next should take me to next screen ios app$")
    public void pem_user_hlClickingOnNextShouldTakeMeToNextScreenIosApp() throws InterruptedException {
        paymentFlow.Process_Payment_to_Beneficiary();
    }

    @And("^PEM_User_HL should be able to make payment successfully ios app$")
    public void pem_user_hlShouldBeAbleToMakePaymentSuccessfullyIosApp() {
        if (overviewScreen.Overview_MyAccount.isDisplayed()){
            log.info("Payment completed successfully");
        }
        else {
            log.info("Payment unsuccessful");
        }
    }
}
