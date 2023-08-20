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

public class FND_BuyPrepaidAirtimeMTN extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getIOSDriver(), 60);
    private IOSCommonMethods basepage = new IOSCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(platforms.ui.mobile.ios.StepDefinitions.FND_BuyPrepaidAirtimeMTN.class);
    iOSBuy_Flow buyFlow=new iOSBuy_Flow();
    iOSBuyScreen buyScreen=new iOSBuyScreen(driver);

    public FND_BuyPrepaidAirtimeMTN(){};

    @Given("^User is on the buy prepaid screen ios app$")
    public void userIsOnTheBuyPrepaidScreenIosApp() throws Throwable {
        buyFlow.Navigate_To_Buy_Prepaid_Data_Airtime();
    }

    @When("^User selects Buy prepaid airtime data sms ios app$")
    public void userSelectsBuyPrepaidAirtimeDataSmsIosApp() {
        buyScreen.Buy_prepaid_data_airtime.click();
    }

    @And("^User selects beneficiary \"([^\"]*)\"$")
    public void userSelectsBeneficiary(String recipient) throws InterruptedException {
        Thread.sleep(2000);
        buyScreen.Search_recipient.click();
        Thread.sleep(2000);
        buyScreen.Beneficiary_field.click();
        buyScreen.Beneficiary_field.sendKeys(recipient);
        buyScreen.Searched_Beneficiary.click();
        buyScreen.Prepaid_Next.click();
    }

    @And("^User selects provider ios app$")
    public void userSelectsProviderIosApp() throws InterruptedException {
        Thread.sleep(1000);
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
    }

    @And("^User selects airtime ios app$")
    public void userSelectsAirtimeIosApp() {
        //Airtime selected by default
        basepage.scrollPage("down");
    }

    @And("^User selects bundle ios app$")
    public void userSelectsBundleIosApp() throws InterruptedException {
        buyScreen.Choose_bundle.click();
        Thread.sleep(1000);
        buyScreen.MTN_Air_Bundle_Amount.click();
        buyScreen.Prepaid_Next.click();
    }

    @And("^User enters reference \"([^\"]*)\"$")
    public void userEnters(String reference) {
        buyScreen.Buy_recipient_reference.click();
        buyScreen.Buy_recipient_reference.sendKeys(reference);
        driver.hideKeyboard();
        basepage.scrollPage("down");
        buyScreen.Prepaid_Next.click();
    }

    @Then("^User reviews airtime purchase ios app$")
    public void userReviewsAirtimePurchaseIosApp() throws InterruptedException {
        Thread.sleep(2000);
        buyScreen.Review_Next.click();
    }

    @And("^completes airtime bundle purchase ios app$")
    public void completesAirtimeBundlePurchaseIosApp() throws InterruptedException {
        Thread.sleep(2000);
        buyScreen.Finish.click();
    }

}
