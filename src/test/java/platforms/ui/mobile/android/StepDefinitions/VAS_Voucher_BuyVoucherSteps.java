package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.Voucher_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Prepaid_AndroidObjects;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Voucher_AndroidObjects;
import platforms.ui.mobile.android.VAS_AndroidDataFactory;
import platforms.ui.mobile.ios.iOSPageObjects.iOSVoucherOptionsScreen;
import utils.DriverFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobileCapabilityType.NO_RESET;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class VAS_Voucher_BuyVoucherSteps extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_Voucher_BuyVoucherSteps.class);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),40);
    Voucher_Flow voucher_flow = new Voucher_Flow();
    public String object,OwnVoucherProduct,VoucherAmount;



    @When("^Android User want to buy voucher$")
    public void android_User_want_to_buy_voucher()  {
        voucher_flow.android_buy_voucher();
    }

    @Then("^Android user should see Carousal for first time login$")
    public void androidUserShouldSeeCarousalForFirstTimeLogin() {
       voucher_flow.CarousalForFirstTimeLogin();
    }

    @Then("^Android User should navigate to voucher Dashboard$")
    public void androidUserShouldNavigateToVoucherScreen() {
      voucher_flow.android_Navigate_VoucherScreen();
    }

    @And("^Android user navigated to Voucher category screen$")
    public void androidUserNavigatedToVoucherCategoryScreen() {
     voucher_flow.Navigated_VoucherCategoryScreen();
    }

    @And("^Android User want to select Voucher$")
    public void androidUserWantToSelectVoucher(){
      voucher_flow.android_SelectVoucher();
    }

    @And("^Android User should navigate to Voucher Options$")
    public void androidUserShouldNavigateToVoucherOptions() {
        voucher_flow.Navigate_VoucherOptions();
    }

    @And("^Android User want to select a product$")
    public void androidUserWantToSelectAProduct() {

        driver.findElements(By.id(VAS_Voucher_AndroidObjects.VoucherProduct)).get(0).click();
    }

    @And("^Android User should navigate to Voucher Details screen$")
    public void android_User_should_navigate_to_Voucher_Details_screen()  {
        voucher_flow.navigate_to_Voucher_Details_screen();
    }

    @And("^Android User Capture Voucher details$")
    public void androidUserCaptureVoucherDetails() {
       voucher_flow.Capture_VoucherDetails();
    }

    @And("^Android User should click on Buy Voucher$")
    public void android_User_should_click_on_Buy_Voucher() {
        voucher_flow.android_NextBtn();
    }

    @And("^Android User should navigate to Voucher payment screen$")
    public void android_User_should_navigate_to_Voucher_payment_screen() {
       voucher_flow.navigate_Voucher_payment_screen();
    }
    @And("^Android user want to crosscheck Voucher details$")
    public void androidUserWantToCrosscheckVoucherDetails() throws IOException {
       voucher_flow.Review_VoucherDetails();
    }

    @Then("^Android User want buy product$")
    public void android_User_want_buy_product() throws IOException {
      voucher_flow.android_buy_product();
    }

    @And("^Android User want to select Own Amount Voucher$")
    public void androidUserWantToSelectOwnAmountVoucher() {
//        String OwnAmountCategory = driver.findElementsById(VAS_Voucher_AndroidObjects.CategoryLevel1ProName).get(Integer.parseInt(VAS_AndroidDataFactory.OwnAmountCategoryLevel1)).getAttribute("text");
        driver.findElementByXPath(VAS_Voucher_AndroidObjects.GoogleVoucher).click();

    }

    @And("^Android User Capture Own Amount Voucher details$")
    public void androidUserCaptureOwnAmountVoucherDetails() {
        OwnVoucherProduct = driver.findElement(By.id(VAS_Voucher_AndroidObjects.ProductName)).getAttribute("text");
    }

    @And("^Android user want to enter Own Amount$")
    public void androidUserWantToEnterOwnAmount() {
        driver.findElementById(VAS_Voucher_AndroidObjects.OwnAmountEdit).clear();
        driver.findElementById(VAS_Voucher_AndroidObjects.OwnAmountEdit).sendKeys(VAS_AndroidDataFactory.OwnAmount);
    }

    @And("^Android User want to crosscheck Own Amount voucher details$")
    public void androidUserWantToCrosscheckOwnAmountVoucherDetails() throws IOException {
       voucher_flow.Crosscheck_OwnAmountVoucherDetails();
    }

    @And("^Android User should see Own Amount Voucher successful message$")
    public void androidUserShouldSeeOwnAmountVoucherSuccessfulMessage() throws IOException {
       voucher_flow.OwnAmountVoucher_SuccessfulMessage();
    }

    @Then("^Android User should see successful message$")
    public void androidUserShouldSeeSuccessfulMessage() {
      voucher_flow.See_SuccessfulMessage();
    }

    @And("^Android user want to check Success details$")
    public void androidUserWantToCheckSuccessDetails() throws IOException {
       voucher_flow.Check_SuccessDetails();
    }

    @When("^Android user clicks on send later$")
    public void androidUserClicksOnSendLater() {
        driver.findElementById(VAS_Voucher_AndroidObjects.SendLater).click();
    }

    @When("^Android user clicks on close button$")
    public void androidUserClicksOnCloseButton() {
        driver.findElementById(VAS_Voucher_AndroidObjects.PaymentClose).click();
        try {
            MobileElement SavedForLaterButton = driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.SavedForLaterButton));
            if (SavedForLaterButton.isDisplayed()) {
                SavedForLaterButton.click();
            }
        }catch(Exception e){
            e.getMessage();
        }
    }

    @And("^Android User want to Click on Next Button$")
    public void androidUserWantToClickOnNextButton() throws IOException {
      voucher_flow.Click_NextButton();
    }

    @And("^Android User should navigate to Review screen$")
    public void androidUserShouldNavigateToReviewScreen() throws IOException {
        voucher_flow.Review_Screen();
    }

    @And("^Android User should navigate to Own Amount Review screen$")
    public void androidUserShouldNavigateToOwnAmountReviewScreen() throws IOException {
        voucher_flow.OwnAmount_ReviewScreen();
    }

    @When("^Android user clicks on Finish button$")
    public void androidUserClicksOnFinishButton() {
        voucher_flow.Clicks_Finish_Button();
    }

    @When("^Android user clicks on New purchase button$")
    public void androidUserClicksOnNewPurchaseButton() {
        voucher_flow.Clicks_NewPurchase_Button();
    }

    @Then("^Android user should navigate to VAS landing screen$")
    public void androidUserShouldNavigateToVASLandingScreen() {
        voucher_flow.Navigate_VASLandingScreen();
    }

    @Then("^Android user should navigate to App OverView$")
    public void androidUserShouldNavigateToAppOverView() {
        voucher_flow.Navigate_App_OverView();
    }

    @Then("^list of Voucher Brands display$")
    public void listOfVoucherBrandsDisplay() {

        assert driver.findElementByXPath(iOSVoucherOptionsScreen.ChooseaVoucherLabel_Xpath).isDisplayed();
    }
}
