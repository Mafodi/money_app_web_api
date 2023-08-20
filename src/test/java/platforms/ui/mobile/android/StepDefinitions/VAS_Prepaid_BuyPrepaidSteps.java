package platforms.ui.mobile.android.StepDefinitions;



import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.StepDefinitions.VAS_Prepaid_BuyPrepaidNewRecipientSteps;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.Prepaid_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Prepaid_AndroidObjects;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Voucher_AndroidObjects;
import platforms.ui.mobile.android.VAS_AndroidDataFactory;
import platforms.ui.mobile.ios.VASIOSDataFactory;
import utils.CommonFunctions;
import utils.DriverFactory;

import java.io.IOException;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;


public class VAS_Prepaid_BuyPrepaidSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),100);
    Login androidLogin = new Login();
    private static Logger log = Logger.getLogger(VAS_Prepaid_BuyPrepaidSteps.class);
    Prepaid_Flow prepaid_flow = new Prepaid_Flow();


    @Given("^Existing customer is logged on to the banking App$")
     public void Existing_customer_is_logged_on_to_the_banking_App() throws InterruptedException {

        androidLogin.user_launch_the_money_app();
        androidLogin.userEntersAUsernameAndPasswordForFirstLogin(VAS_AndroidDataFactory.PROFILE_UNAME,VAS_AndroidDataFactory.PROFILE_PWD);
        androidLogin.user_on_the_welcome_page();
    }

    @And("^User selects Transact icon$")
    public void user_selects_transact_icon() throws InterruptedException {
        Thread.sleep(1000);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Transact']")));
        if(driver.findElementByXPath("//android.widget.TextView[@text='Transact']").isDisplayed()) {
            driver.findElementByXPath("//android.widget.TextView[@text='Transact']").click();
            log.info("Transact button clicked successfully");
        }

    }
    @And("^User selects Buy button$")
    public void user_selects_buy_button(){

        MobileElement buy = driver.findElementById(VAS_Prepaid_AndroidObjects.TRANSACT_BUY_ID);
        if(buy.isDisplayed()) {
            buy.click();
            log.info("Able to select buy button");
        }
    }

    @And("^User want to purchase a pre-paid product$")
    public void user_want_to_purchase_a_pre_paid_product() {

        prepaid_flow.Buy_prepaid_product();
    }

    @And("^Android user want to Buy for new \"([^\"]*)\"$")
    public void androidUserWantToBuyForNew(String MobileNum){
        driver.findElementsById(VAS_Prepaid_AndroidObjects.EditField).get(0).clear();
        driver.findElementsById(VAS_Prepaid_AndroidObjects.EditField).get(0).sendKeys(MobileNum);
    }

    @When("^Android user selects product from History$")
    public void androidUserSelectsProductFromHistory() {
        driver.findElementsById(VAS_Prepaid_AndroidObjects.ProductFromHistory).get(0).click();
    }

    @Then("^Android user should navigate to History detail$")
    public void androidUserShouldNavigateToHistoryDetail() {
       prepaid_flow.NavigateTo_HistoryDetail();
    }

    @And("^Android user want to Buy Again$")
    public void androidUserWantToBuyAgain() {
        driver.findElementById(VAS_Prepaid_AndroidObjects.NextBtn).click();
    }

    @And("^Android user want to check validations for reference field$")
    public void androidUserWantToCheckValidationsForReferenceField() {
        AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.DOWN);
        driver.findElementById(VAS_Prepaid_AndroidObjects.EditField).clear();
        driver.findElementById(VAS_Prepaid_AndroidObjects.ErrorMsg).isDisplayed();
    }

    @When("^Android user want to update Reference field$")
    public void androidUserWantToUpdateReferenceField() {
        driver.findElementById(VAS_Prepaid_AndroidObjects.EditField).sendKeys("(Test_Voucher-2)");

    }

}
