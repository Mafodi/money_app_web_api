package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import platforms.ui.mobile.ios.VASIOSDataFactory;
import platforms.ui.mobile.ios.iOSPageObjects.*;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;


public class VAS_IOS_Buy_Voucher_Steps extends DriverFactory {

    private static Logger log = Logger.getLogger(VAS_IOS_Buy_Voucher_Steps.class);
    WebDriverWait wait = new WebDriverWait(getIOSDriver(),80);

   // WebDriverWait wait = new WebDriverWait(getIOSDriver(),60);



    @And("^the user clicks \"([^\"]*)\" button$")
    public void theUserClicksButton(String arg0){
        MobileElement getStartedButton = driver.findElementByXPath(IOSVASVoucherCarouselScreens.GetStartButton_Xpath);
        getStartedButton.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        log.info("Get Started Button Clicked successfully");

        driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);

    }

    @Then("^User is taken to IOS Voucher type selection screen$")
    public void userIsTakenToIOSVoucherTypeSelectionScreen() {

        assert driver.findElementByAccessibilityId(iOSVoucherHistoryScreen.Buy_New_Gift_Voucher_AccessibilityID).isDisplayed();



    }

    @And("^User selects \"([^\"]*)\" to buy Voucher for$")
    public void SelectVoucherBrand(String voucherBrand){

        if (voucherBrand.equalsIgnoreCase("Hollywoodbets")){

            MobileElement HollywoodbetsVoucher = driver.findElementByXPath(iOSVoucherOptionsScreen.Hollywooodbets_Xpath);
            HollywoodbetsVoucher.click();
        }

        else if (voucherBrand.equalsIgnoreCase("Deezer")) {

            MobileElement DeezerVoucher = driver.findElementByAccessibilityId(iOSVoucherOptionsScreen.Deezer_AccessibilityID);
            DeezerVoucher.click();
        }

        else if (voucherBrand.equalsIgnoreCase("Google Play")) {

            MobileElement GooglePlayVoucher = driver.findElementByAccessibilityId(iOSVoucherOptionsScreen.Google_Play_AccessibilityID);
            GooglePlayVoucher.click();
        }


    }

    @And("^User selects a \"([^\"]*)\" to purchase for Hollywoodbets$")
    public void SelectVoucherTypeHollywoodBets(String voucherType) {

        if(voucherType.equalsIgnoreCase("R10")) {

            MobileElement Holly10 = driver.findElementByXPath(iOSVoucherTypeScreen.Holly10_Xpath);
            Holly10.click();
        }

    }

    @When("^User clicks buy button on payment screen$")
    public void ClickBuyButtonOnPaymentScreen() {



        MobileElement PaymentBuyButton = driver.findElementByAccessibilityId(iOSVoucherPaymentScreen.YourReference);
        PaymentBuyButton.click();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);


    }

    @Then("^Voucher success screen should display$")
    public void voucherSuccessScreenShouldDisplay() {

        MobileElement successMessage = driver.findElementByAccessibilityId(iOSVoucherPaymentSuccessScreen.successMessage_AccessibilityID);

        if(successMessage.isDisplayed()) {

           // assert driver.findElementByAccessibilityId(iOSVoucherPaymentSuccessScreen.successMessage_AccessibilityID).isDisplayed();
            System.out.println("Test Passed");

        }
    }

    @And("^user clicks on \"([^\"]*)\" on voucher history screen$")
    public void SelectVoucherPurchaseOption(String voucher) {

        if(voucher.equalsIgnoreCase("Buy new gift voucher")){
            MobileElement buyNewVoucher = driver.findElementByXPath(iOSVoucherHistoryScreen.Buy_Gift_Voucher_Xpath);
            buyNewVoucher.click();
        }
    }

    @And("^User enters \"([^\"]*)\" for Own Amount$")
    public void VoucherOwnAmountPurchase(String amount){

        MobileElement ownAmount = driver.findElementByName(iOSVoucherDetailsScreen.Own_Amount_Name);
        ownAmount.sendKeys(amount);
    }

    @When("^User enters \"([^\"]*)\" in Reference field$")
    public void EntersReferenceField(String reference) {

        MobileElement Yourreference = driver.findElementByAccessibilityId(iOSVoucherPaymentScreen.YourReference);
        Yourreference.clear();
        Yourreference.sendKeys(reference);
    }

    @Then("^changes to reference field is correct$")
    public void changesToReferenceFieldIsCorrect() {

        String expectedresult = "Reference Test";

       String actualResult = driver.findElementByAccessibilityId(iOSVoucherPaymentScreen.YourReference).getText();

        Assert.assertEquals(expectedresult,actualResult);
    }

    @And("^User navigates through Carousel$")
    public void userNavigatesThroughCarousel() {

        MobileElement nextButton = driver.findElementByXPath(IOSVASVoucherCarouselScreens.Nbuttton_Xpath);
        if (nextButton.isDisplayed()) {

            nextButton.click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        }

        MobileElement nextButton2 = driver.findElementByXPath(IOSVASVoucherCarouselScreens.NButton2_Xpath);

        if (nextButton2.isDisplayed()) {

            nextButton2.click();

        }
    }


    @Then("^Voucher Dashboard screen is displayed$")
    public void voucherDashboardScreenIsDisplayed() {

        assert driver.findElementByAccessibilityId(iOSVoucherHistoryScreen.My_vouchers_AccessibilityID).isDisplayed();
    }


    @And("^User selects \"([^\"]*)\" on Voucher History Screen$")
    public void userSelectsOnVoucherHistoryScreen(String arg0){



        MobileElement buyVouchers = driver.findElementByAccessibilityId(iOSVoucherHistoryScreen.Buy_New_Gift_Voucher_AccessibilityID);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Buy new gift voucher"))).click();

        if (buyVouchers.isDisplayed()) {
            buyVouchers.click();

        }
       driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
    }

    @And("^User selects Next on Buy Voucher Screen$")
    public void userSelectsNextOnBuyVoucherScreen() {

        MobileElement nextButton = driver.findElementByXPath(iOSVoucherPaymentScreen.Next_Button_Xpath);
        nextButton.click();
    }

    @When("^User selects Buy on Review Purchase Screen$")
    public void userSelectsBuyOnReviewPurchaseScreen() {

        MobileElement buyButton = driver.findElementByXPath(iOSVASVoucherReviewPurchaseScreen.buyButton);
        buyButton.click();


    }

    @Then("^Purchase Successful screen displays for Vouchers$")
    public void purchaseSuccessfulScreenDisplaysForVouchers() {

        assert driver.findElementByXPath(iOSVoucherPaymentSuccessScreen.Finish_Button_Xpath).isDisplayed();
    }

    @When("^User selects \"([^\"]*)\" button on Voucher Successful purchase screen$")
    public void userSelectsButton(String buttonName) {

        if(buttonName.equalsIgnoreCase("Finish")) {

            MobileElement finishButton = driver.findElementByXPath(iOSVoucherPaymentSuccessScreen.Finish_Button_Xpath);
            finishButton.click();
        }

            else if (buttonName.equalsIgnoreCase("Purchase new")) {

            MobileElement purchaseNewButton = driver.findElementByXPath(iOSVoucherPaymentSuccessScreen.PurchaseNew_Xpath);
            purchaseNewButton.click();


            }


        }

    @Then("^User is directed to Voucher Dashboard$")
    public void userIsDirectedToVoucherDashboard() {

        assert driver.findElementByXPath(iOSVoucherHistoryScreen.Buy_Gift_Voucher_Xpath).isDisplayed();
    }
}

