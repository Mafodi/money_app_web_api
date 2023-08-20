package platforms.ui.mobile.android.AndroidFlowModel;

import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Prepaid_AndroidObjects;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Voucher_AndroidObjects;
import platforms.ui.mobile.android.StepDefinitions.VAS_Voucher_BuyVoucherSteps;
import platforms.ui.mobile.ios.IOSCommonMethods;
import utils.DriverFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Prepaid_Flow extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_Voucher_BuyVoucherSteps.class);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),80);
    public static String ProductName,ProductPrice,RecipientDetails,AccountNum,YourReference;

    public void Buy_prepaid_product() {

        MobileElement buyPrepaid = driver.findElement(By.xpath(VAS_Prepaid_AndroidObjects.BUY_PREPAID));
        buyPrepaid.click();
        log.info("User able to click prepaid from Vas landing screen");
    }

    public void Prepaid_Carousal() {
        try{
            MobileElement carousal = driver.findElementById(VAS_Voucher_AndroidObjects.CouraselScreen);
            if (carousal.isDisplayed()){
                MobileElement CarousalNext = driver.findElementById(VAS_Voucher_AndroidObjects.NextBtn);
                CarousalNext.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                CarousalNext.click();
            }
        }catch (Exception e){
            e.getMessage();
        }
    }

    public void Navigate_Prepaid_ProviderScreen() {
        wait.until(presenceOfElementLocated(By.xpath(VAS_Prepaid_AndroidObjects.ProviderScreen)));
        MobileElement ProviderScreen = driver.findElementByXPath(VAS_Prepaid_AndroidObjects.ProviderScreen);
        if(ProviderScreen.isDisplayed()){
            log.info("User successfully navigated to provider screen");
        }
    }

    public void ProviderSelection(String provider) {
        switch (provider) {
            case"CellC":
                MobileElement CellC = driver.findElementsById(VAS_Prepaid_AndroidObjects.ProviderType).get(0);
                if (CellC.isDisplayed()) {
                    CellC.click();
                }
                break;
            case"Mtn":
                MobileElement Mtn = driver.findElementsById(VAS_Prepaid_AndroidObjects.ProviderType).get(1);
                if (Mtn.isDisplayed()) {
                    Mtn.click();
                }
                break;
            case"Vodacom":
                MobileElement Vodacom = driver.findElementsById(VAS_Prepaid_AndroidObjects.ProviderType).get(2);
                if (Vodacom.isDisplayed()) {
                    Vodacom.click();
                }
                break;
            case"Telkom":
                MobileElement Telkom = driver.findElementsById(VAS_Prepaid_AndroidObjects.ProviderType).get(3);
                if (Telkom.isDisplayed()) {
                    Telkom.click();
                }
                break;
            case"VirginMobile":
                MobileElement VirginMobile = driver.findElementsById(VAS_Prepaid_AndroidObjects.ProviderType).get(4);
                if (VirginMobile.isDisplayed()) {
                    VirginMobile.click();
                }
                break;

            default:
                log.info("Invalid Provider");

        }
    }

    public void CategorySelection(String category) {
        switch (category) {
            case"Airtime":
                MobileElement Airtime = driver.findElementByXPath(VAS_Prepaid_AndroidObjects.CategoryScreen);
                if (Airtime.isDisplayed()) {
                    Airtime.click();
                }
                break;
            case"Data":
                MobileElement Data = driver.findElementByXPath(VAS_Prepaid_AndroidObjects.Data);
                if (Data.isDisplayed()) {
                    Data.click();
                }
                break;
            case"Social":
                MobileElement Social = driver.findElementByXPath(VAS_Prepaid_AndroidObjects.Social);
                if (Social.isDisplayed()) {
                    Social.click();
                }
                break;
            case"SMS":
                MobileElement SMS = driver.findElementByXPath(VAS_Prepaid_AndroidObjects.SMS);
                if (SMS.isDisplayed()) {
                    SMS.click();
                }
                break;
            case"WhatsApp":
                MobileElement WhatsApp = driver.findElementByXPath(VAS_Prepaid_AndroidObjects.WhatsApp);
                if (WhatsApp.isDisplayed()) {
                    WhatsApp.click();
                }
                break;
            case"Voice":
                MobileElement Voice = driver.findElementByXPath(VAS_Prepaid_AndroidObjects.Voice);
                if (Voice.isDisplayed()) {
                    Voice.click();
                }
                break;

            case"Landline":
                MobileElement Landline = driver.findElementByXPath(VAS_Prepaid_AndroidObjects.Landline);
                if (Landline.isDisplayed()) {
                    Landline.click();
                }
                break;


            default:
                log.info("Invalid Provider");

        }
    }

    public void Navigates_RecipientScreen() {
        wait.until(presenceOfElementLocated(By.xpath(VAS_Prepaid_AndroidObjects.RecipientScreen)));
        driver.findElementByXPath(VAS_Prepaid_AndroidObjects.RecipientScreen).isDisplayed();
        ProductName = driver.findElementById(VAS_Prepaid_AndroidObjects.ProductName).getAttribute("text");
        ProductPrice = driver.findElementById(VAS_Prepaid_AndroidObjects.ProductPrice).getAttribute("text");
    }

    public void Navigates_PaymentScreen() throws IOException {
        wait.until(presenceOfElementLocated(By.id(VAS_Prepaid_AndroidObjects.PaymentScreen)));
        driver.findElementById(VAS_Prepaid_AndroidObjects.PaymentScreen).isDisplayed();

        //Product Description
        String PrepaidProductName = driver.findElementById(VAS_Prepaid_AndroidObjects.PrepaidProductName).getAttribute("text");
        String parts[] = PrepaidProductName.split(" ", 2);
        System.out.println(String.format("cr: %s, cdr: %s", parts[0], parts[1]));
        if(parts[1].equals(ProductName)){
            log.info("Prepaid Product name : " + parts[1]);
        }

        //Recipient details
        RecipientDetails = driver.findElementById(VAS_Prepaid_AndroidObjects.PrepaidRecipientName).getAttribute("text");

        //Product Price
        String PrepaidProductPrice = driver.findElementById(VAS_Prepaid_AndroidObjects.PrepaidProductPrice).getAttribute("text");
        if(PrepaidProductPrice.equals(ProductPrice)){
            log.info("Prepaid product price : " + ProductPrice);
        }

        //Account Number
        AccountNum = driver.findElementById(VAS_Prepaid_AndroidObjects.PrepaidPurchaseAcc).getAttribute("text");
        AndroidCommonMethods.captureScreenshot("Payment details");
        //Product Reference
        YourReference = driver.findElementById(VAS_Prepaid_AndroidObjects.EditField).getAttribute("text");
        log.info("Voucher reference : " + YourReference);
    }

    public void Review_PrepaidPurchase() throws IOException {
        wait.until(presenceOfElementLocated(By.xpath(VAS_Prepaid_AndroidObjects.ReviewScreen)));
        driver.findElementByXPath(VAS_Prepaid_AndroidObjects.ReviewScreen).isDisplayed();

        //Product Description
        String PrepaidProductName = driver.findElementById(VAS_Prepaid_AndroidObjects.ProductName).getAttribute("text");
        if(PrepaidProductName.equals(ProductName)){
            log.info("Prepaid Product name : " + ProductName);
        }

        //Recipient details
        String RecDetails = driver.findElementById(VAS_Prepaid_AndroidObjects.ReviewRecipientDetails).getAttribute("text");
        if(RecDetails.equals(RecipientDetails)){
            log.info("Recipient name : " + RecipientDetails);
        }


        //Product Price
        String PrepaidProductPrice = driver.findElementById(VAS_Prepaid_AndroidObjects.ProductPrice).getAttribute("text");
        if(PrepaidProductPrice.equals(ProductPrice)){
            log.info("Prepaid product price : " + ProductPrice);
        }

        //Account Number
        String AccNum = driver.findElementById(VAS_Prepaid_AndroidObjects.ReviewAccDetails).getAttribute("text");
        if(AccountNum.equals(AccountNum)){
            log.info("Account number : " + AccountNum);
        }

        //Your Reference
        String Reference = driver.findElementById(VAS_Prepaid_AndroidObjects.ReviewRefDetails).getAttribute("text");
        if(Reference.equals(YourReference)){
            log.info("Your Reference : " + YourReference);
        }
        AndroidCommonMethods.captureScreenshot("Payment details");

    }

    public void Buy() throws IOException {
        AndroidCommonMethods.captureScreenshot("Review details");
        AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.DOWN);
        MobileElement Next = driver.findElement(By.id(VAS_Voucher_AndroidObjects.NextBtn));
        if(Next.isEnabled()){
            Next.click();
            log.info("User clicks on Buy");
        }
    }

    public void Navigates_SuccessScreen() throws IOException {
        wait.until(presenceOfElementLocated(By.xpath(VAS_Prepaid_AndroidObjects.SuccessScreen)));
        driver.findElementByXPath(VAS_Prepaid_AndroidObjects.SuccessScreen).isDisplayed();

        //Product Description
        String PrepaidProductName = driver.findElementById(VAS_Prepaid_AndroidObjects.ProductName).getAttribute("text");
        if(PrepaidProductName.equals(ProductName)){
            log.info("Prepaid Product name : " + ProductName);
        }

        //Recipient details
        String RecDetails = driver.findElementById(VAS_Prepaid_AndroidObjects.SuccessRecDetails).getAttribute("text");
        if(RecDetails.equals(RecipientDetails)){
            log.info("Recipient name : " + RecipientDetails);
        }

        //Product Price
        String PrepaidProductPrice = driver.findElementById(VAS_Prepaid_AndroidObjects.ProductPrice).getAttribute("text");
        if(PrepaidProductPrice.equals(ProductPrice)){
            log.info("Prepaid product price : " + ProductPrice);
        }

        //Account Number
        String AccNum = driver.findElementById(VAS_Prepaid_AndroidObjects.ReviewAccDetails).getAttribute("text");
        if(AccountNum.equals(AccountNum)){
            log.info("Account number : " + AccountNum);
        }

        //Payment Reference
        String PayRef = driver.findElementById(VAS_Prepaid_AndroidObjects.PaymentRef).getAttribute("text");
        AndroidCommonMethods.captureScreenshot("Review details");
    }

    public void Buy_For_Existing_Recipient() {
        driver.findElementById(VAS_Prepaid_AndroidObjects.SelectRecipients).click();
    }

    public void AddRecipient_ToSee_ErrorMessage() {
        driver.findElementsById(VAS_Prepaid_AndroidObjects.EditField).get(0).clear();
        driver.findElementById(VAS_Prepaid_AndroidObjects.SaveBeneficiarySwitch).click();
        driver.findElementsById(VAS_Prepaid_AndroidObjects.EditField).get(1).click();
        driver.findElementsById(VAS_Prepaid_AndroidObjects.EditField).get(0).click();
        driver.findElementById(VAS_Prepaid_AndroidObjects.ErrorMsg).isDisplayed();
        driver.findElementsById(VAS_Prepaid_AndroidObjects.EditField).get(1).click();
        driver.findElementById(VAS_Prepaid_AndroidObjects.ErrorMsg).isDisplayed();

    }

    public void NavigateTo_HistoryDetail() {
        wait.until(presenceOfElementLocated(By.xpath(VAS_Prepaid_AndroidObjects.HistoryDetailScreen)));
        driver.findElementByXPath(VAS_Prepaid_AndroidObjects.HistoryDetailScreen).isDisplayed();

        ProductName = driver.findElementsById(VAS_Prepaid_AndroidObjects.ProductName).get(0).getAttribute("text");
        ProductPrice = driver.findElementsById(VAS_Prepaid_AndroidObjects.ProductPrice).get(0).getAttribute("text");
    }

    public void See_History() {
        driver.findElementsById(VAS_Prepaid_AndroidObjects.ProductName).get(0).isDisplayed();
        ProductName = driver.findElementsById(VAS_Prepaid_AndroidObjects.ProductName).get(0).getAttribute("text");
    }


}
