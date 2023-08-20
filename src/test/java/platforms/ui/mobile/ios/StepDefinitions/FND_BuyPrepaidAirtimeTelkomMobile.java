package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import platforms.ui.mobile.ios.IOSCommonMethods;
import platforms.ui.mobile.ios.iOSFlowModel.iOSBuy_Flow;
import platforms.ui.mobile.ios.iOSPageObjects.iOSBuyScreen;
import utils.DriverFactory;

public class FND_BuyPrepaidAirtimeTelkomMobile extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getIOSDriver(), 60);
    private IOSCommonMethods basepage = new IOSCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(platforms.ui.mobile.ios.StepDefinitions.FND_BuyPrepaidAirtimeMTN.class);
    iOSBuy_Flow buyFlow=new iOSBuy_Flow();
    iOSBuyScreen buyScreen=new iOSBuyScreen(driver);

    public FND_BuyPrepaidAirtimeTelkomMobile(){};

    @Given("^User is on the buy prepaid screen for TelkomMobile ios app$")
    public void userIsOnTheBuyPrepaidScreenForTelkomMobileIosApp() throws Throwable {
        buyFlow.Navigate_To_Buy_Prepaid_Data_Airtime();
    }

    @When("^User selects Buy prepaid TelkomMobile airtime data sms ios app$")
    public void userSelectsBuyPrepaidTelkomMobileAirtimeDataSmsIosApp() {
        buyScreen.Buy_prepaid_data_airtime.click();
    }

    @And("^User selects TelkomMobile beneficiary \"([^\"]*)\"$")
    public void userSelectsTelkomMobileBeneficiary(String recipient) throws InterruptedException {
        Thread.sleep(2000);
        buyScreen.Search_recipient.click();
        Thread.sleep(2000);
        buyScreen.Beneficiary_field.click();
        buyScreen.Beneficiary_field.sendKeys(recipient);
        buyScreen.Searched_Beneficiary.click();
        buyScreen.Prepaid_Next.click();
    }

    @And("^User selects TelkomMobile provider ios app$")
    public void userSelectsTelkomMobileProviderIosApp() throws InterruptedException {
        Thread.sleep(1000);
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
    }

    @And("^User selects TelkomMobile airtime ios app$")
    public void userSelectsTelkomMobileAirtimeIosApp() {
        //Airtime selected by default
        basepage.scrollPage("down");
    }

    @And("^User selects TelkomMobile bundle ios app$")
    public void userSelectsTelkomMobileBundleIosApp() throws InterruptedException {
        buyScreen.Choose_bundle.click();
        Thread.sleep(1000);
        buyScreen.TelkomMobile_Air_Bundle_Amount.click();
        buyScreen.Prepaid_Next.click();
    }

    @And("^User enters TelkomMobile reference \"([^\"]*)\"$")
    public void userEntersTelkomMobileReference(String reference) throws Throwable {
        buyScreen.Buy_recipient_reference.click();
        buyScreen.Buy_recipient_reference.sendKeys(reference);
        driver.hideKeyboard();
        basepage.scrollPage("down");
        buyScreen.Prepaid_Next.click();
    }

    @Then("^User reviews TelkomMobile airtime purchase ios app$")
    public void userReviewsTelkomMobileAirtimePurchaseIosApp() throws InterruptedException {
        Thread.sleep(2000);
        buyScreen.Review_Next.click();
    }

    @And("^completes TelkomMobile airtime bundle purchase ios app$")
    public void completesTelkomMobileAirtimeBundlePurchaseIosApp() throws InterruptedException {
        Thread.sleep(2000);
        buyScreen.Finish.click();
    }
}
