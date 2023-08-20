package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.PendingException;
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

public class FND_BuyPrepaidAirtimeVodacom extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getIOSDriver(), 60);
    private IOSCommonMethods basepage = new IOSCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(platforms.ui.mobile.ios.StepDefinitions.FND_BuyPrepaidAirtimeMTN.class);
    iOSBuy_Flow buyFlow=new iOSBuy_Flow();
    iOSBuyScreen buyScreen=new iOSBuyScreen(driver);

    public FND_BuyPrepaidAirtimeVodacom(){};

    @Given("^User is on the buy prepaid screen for Vodacom ios app$")
    public void userIsOnTheBuyPrepaidScreenForVodacomIosApp() throws Throwable {
        buyFlow.Navigate_To_Buy_Prepaid_Data_Airtime();
    }

    @When("^User selects Buy prepaid Vodacom airtime data sms ios app$")
    public void userSelectsBuyPrepaidVodacomAirtimeDataSmsIosApp() {
        buyScreen.Buy_prepaid_data_airtime.click();
    }

    @And("^User selects Vodacom beneficiary \"([^\"]*)\"$")
    public void userSelectsVodacomBeneficiary(String recipient) throws Throwable {
        Thread.sleep(2000);
        buyScreen.Search_recipient.click();
        Thread.sleep(2000);
        buyScreen.Beneficiary_field.click();
        buyScreen.Beneficiary_field.sendKeys(recipient);
        buyScreen.Searched_Beneficiary.click();
        buyScreen.Prepaid_Next.click();
    }

    @And("^User selects Vodacom provider ios app$")
    public void userSelectsVodacomProviderIosApp() throws InterruptedException {
        Thread.sleep(1000);
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
    }

    @And("^User selects Vodacom airtime ios app$")
    public void userSelectsVodacomAirtimeIosApp() {
        //Airtime selected by default
        basepage.scrollPage("down");
    }

    @And("^User selects Vodacom bundle ios app$")
    public void userSelectsVodacomBundleIosApp() throws InterruptedException {
        buyScreen.Choose_bundle.click();
        Thread.sleep(1000);
        buyScreen.Vodacom_Air_Bundle_Amount.click();
        buyScreen.Prepaid_Next.click();
    }

    @And("^User enters Vodacom reference \"([^\"]*)\"$")
    public void userEntersVodacomReference(String reference) throws Throwable {
        buyScreen.Buy_recipient_reference.click();
        buyScreen.Buy_recipient_reference.sendKeys(reference);
        driver.hideKeyboard();
        basepage.scrollPage("down");
        buyScreen.Prepaid_Next.click();
    }

    @Then("^User reviews Vodacom airtime purchase ios app$")
    public void userReviewsVodacomAirtimePurchaseIosApp() throws InterruptedException {
        Thread.sleep(2000);
        buyScreen.Review_Next.click();
    }

    @And("^completes Vodacom airtime bundle purchase ios app$")
    public void completesVodacomAirtimeBundlePurchaseIosApp() throws InterruptedException {
        Thread.sleep(2000);
        buyScreen.Finish.click();
    }
}
