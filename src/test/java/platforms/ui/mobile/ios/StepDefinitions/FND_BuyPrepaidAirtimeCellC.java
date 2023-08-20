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

public class FND_BuyPrepaidAirtimeCellC extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getIOSDriver(), 60);
    private IOSCommonMethods basepage = new IOSCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(platforms.ui.mobile.ios.StepDefinitions.FND_BuyPrepaidAirtimeMTN.class);
    iOSBuy_Flow buyFlow=new iOSBuy_Flow();
    iOSBuyScreen buyScreen=new iOSBuyScreen(driver);

    public FND_BuyPrepaidAirtimeCellC(){};

    @Given("^User is on the buy prepaid screen for CellC ios app$")
    public void userIsOnTheBuyPrepaidScreenForCellCIosApp() throws Throwable {
        buyFlow.Navigate_To_Buy_Prepaid_Data_Airtime();
    }

    @When("^User selects Buy prepaid CellC airtime data sms ios app$")
    public void userSelectsBuyPrepaidCellCAirtimeDataSmsIosApp() {
        buyScreen.Buy_prepaid_data_airtime.click();
    }

    @And("^User selects CellC beneficiary \"([^\"]*)\"$")
    public void userSelectsCellCBeneficiary(String recipient) throws InterruptedException {
        Thread.sleep(2000);
        buyScreen.Search_recipient.click();
        Thread.sleep(2000);
        buyScreen.Beneficiary_field.click();
        buyScreen.Beneficiary_field.sendKeys(recipient);
        buyScreen.Searched_Beneficiary.click();
        buyScreen.Prepaid_Next.click();
    }

    @And("^User selects CellC provider ios app$")
    public void userSelectsCellCProviderIosApp() throws InterruptedException {
        Thread.sleep(1000);
        //CellC selected as default
    }

    @And("^User selects CellC airtime ios app$")
    public void userSelectsCellCAirtimeIosApp() {
        //Airtime selected by default
        basepage.scrollPage("down");
    }

    @And("^User selects CellC bundle ios app$")
    public void userSelectsCellCBundleIosApp() throws InterruptedException {
        buyScreen.Choose_bundle.click();
        Thread.sleep(1000);
        buyScreen.CellC_Air_Bundle_Amount.click();
        buyScreen.Prepaid_Next.click();
    }

    @And("^User enters CellC reference \"([^\"]*)\"$")
    public void userEntersCellCReference(String reference) throws Throwable {
        buyScreen.Buy_recipient_reference.click();
        buyScreen.Buy_recipient_reference.sendKeys(reference);
        driver.hideKeyboard();
        basepage.scrollPage("down");
        buyScreen.Prepaid_Next.click();
    }

    @Then("^User reviews CellC airtime purchase ios app$")
    public void userReviewsCellCAirtimePurchaseIosApp() throws InterruptedException {
        Thread.sleep(2000);
        buyScreen.Review_Next.click();
    }

    @And("^completes CellC airtime bundle purchase ios app$")
    public void completesCellCAirtimeBundlePurchaseIosApp() throws InterruptedException {
        Thread.sleep(2000);
        buyScreen.Finish.click();
    }
}
