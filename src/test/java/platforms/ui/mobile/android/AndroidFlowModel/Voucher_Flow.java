package platforms.ui.mobile.android.AndroidFlowModel;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Prepaid_AndroidObjects;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Voucher_AndroidObjects;
import platforms.ui.mobile.android.StepDefinitions.VAS_Voucher_AccountsSteps;
import platforms.ui.mobile.android.StepDefinitions.VAS_Voucher_BuyVoucherSteps;
import platforms.ui.mobile.android.VAS_AndroidDataFactory;
import utils.CommonFunctions;
import utils.DriverFactory;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobileCapabilityType.NO_RESET;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Voucher_Flow extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_Voucher_BuyVoucherSteps.class);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),80);
    public static String object,VoucherProduct,VoucherAmount,accountNumber,PayRef,TransactionDate,OwnVoucherProduct;
    public static String Category2, Category3;
    public static String VoucherHisProduct,VoucherHisAmount;
    CommonFunctions commonFunctions = new CommonFunctions();

    public void android_buy_voucher()  {
        MobileElement buyVoucher = driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.SelectVouchers));
        buyVoucher.click();
        log.info("User able to click Voucher from Vas landing screen");
    }

    public void CarousalForFirstTimeLogin() {
        object = String.valueOf(driver.getCapabilities().getCapability(NO_RESET));
        if (object == "false") {
            MobileElement carousal = driver.findElementById(VAS_Voucher_AndroidObjects.CouraselScreen);
            if (carousal.isDisplayed()){
                MobileElement CarousalNext = driver.findElementById(VAS_Voucher_AndroidObjects.NextBtn);
                CarousalNext.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                CarousalNext.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                CarousalNext.click();
            }
        }
        else if (object == "true") {
            log.info("User not able to see Carousal");
        }
    }

    public void android_Navigate_VoucherScreen() {
        wait.until(presenceOfElementLocated(By.id(VAS_Voucher_AndroidObjects.VoucherDashboard)));
        MobileElement VoucherDashboard = driver.findElementById(VAS_Voucher_AndroidObjects.VoucherDashboard);
        if (VoucherDashboard.isDisplayed()){
            log.info("User navigated to Voucher Dashboard");
        }
    }

    public void Navigated_VoucherCategoryScreen() {
        try{
            MobileElement VoucherDashboard = driver.findElementById(VAS_Voucher_AndroidObjects.VoucherDashboard);
            if (VoucherDashboard.isDisplayed()){
                VoucherDashboard.click();
                log.info("User navigated to Voucher Dashboard");
            }
        }catch (Exception e){
            e.getMessage();
        }
        MobileElement VoucherCategory = driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.VoucherCategoryLevel1));
        if(VoucherCategory.isDisplayed()){
            log.info("User successfully navigated to Category level 1");
        }
    }

    public void android_SelectVoucher(){
        int CategoryLevel1Product = driver.findElementsById("tv_category_name").size();
//        String Category = driver.findElementsById(VAS_Voucher_AndroidObjects.CategoryLevel1ProName).get(Integer.parseInt(VAS_AndroidDataFactory.CategoryLevel1)).getAttribute("text");
        driver.findElementByXPath(VAS_Voucher_AndroidObjects.AlwaysOnVoucher).click();
    }

    public void Navigate_VoucherOptions() {
        MobileElement VoucherOptionScreen = driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.VoucherOptions));
        if(VoucherOptionScreen.isDisplayed()){
            log.info("User successfully navigated to Voucher option screen");
        }
    }

    public void navigate_to_Voucher_Details_screen()  {
        MobileElement VoucherDetail = driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.VoucherDetail));
        if(VoucherDetail.isDisplayed()){
            log.info("user successfully navigated to Voucher detail screen");
        }
    }

    public void Capture_VoucherDetails() {
        VoucherProduct = driver.findElement(By.id(VAS_Voucher_AndroidObjects.ProductName)).getAttribute("text");

        VoucherAmount = driver.findElementById(VAS_Voucher_AndroidObjects.ProductPrice).getAttribute("text");
    }

    public void android_NextBtn() {

        MobileElement CarousalNext = driver.findElementById(VAS_Voucher_AndroidObjects.NextBtn);
        CarousalNext.click();
    }

    public void navigate_Voucher_payment_screen() {
        wait.until(presenceOfElementLocated(By.id(VAS_Voucher_AndroidObjects.PaymentScreen)));
        MobileElement PaymentScreen = driver.findElementById(VAS_Voucher_AndroidObjects.PaymentScreen);
        if (PaymentScreen.isDisplayed()){
            log.info("user successfully navigated to Payment screen");
        }
    }

    public void Review_VoucherDetails() throws IOException {
        //Product Description
        String ProductDes = driver.findElementById(VAS_Voucher_AndroidObjects.ProductDes).getAttribute("text");
        if(ProductDes.equals(VoucherProduct)){
            log.info("Voucher name : " + VoucherProduct);
        }

        //Product Price
        String ProductPrice = driver.findElementById(VAS_Voucher_AndroidObjects.ProductAmount).getAttribute("text");
        if(ProductPrice.equals(VoucherAmount)){
            log.info("Voucher price : " + VoucherAmount);
        }

        //Remaining limit
        String stringA = driver.findElementById(VAS_Voucher_AndroidObjects.RemainingLimit).getAttribute("text");
//        boolean stringB=(driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.PaymentLimitExceed))==null);
//        if(stringB == false){
//        if(stringA.equals(driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.PaymentLimitExceed)))) {
        String[] str_array = stringA.split("daily");
        String PaymentLimit = str_array[0];
        log.info("Remaining Payment limit : " + PaymentLimit);
//        }

        //Account Number
        accountNumber = driver.findElementById("tvAdditionalInfo").getAttribute("text");

        //Product Reference
        PayRef = driver.findElementById(VAS_Voucher_AndroidObjects.EditReference).getAttribute("text");
        if(PayRef.isEmpty()){
            driver.findElementById(VAS_Voucher_AndroidObjects.EditReference).sendKeys(VAS_AndroidDataFactory.VoucherReference);
        }

    }

    public void android_buy_product() throws IOException {
        AndroidCommonMethods.captureScreenshot("Voucher Review details");
        AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.DOWN);
        MobileElement Buy = driver.findElement(By.id(VAS_Voucher_AndroidObjects.NextBtn));
        if(Buy.isEnabled()){
            Buy.click();
            log.info("User successfully Buy's Voucher");
        }
    }

    public void Crosscheck_OwnAmountVoucherDetails() throws IOException {
        //Product Description
        String ProductDes = driver.findElementById(VAS_Voucher_AndroidObjects.ProductDes).getAttribute("text");
        if(ProductDes.equals(OwnVoucherProduct)){
            log.info("Voucher name : " + OwnVoucherProduct);
        }

        //Product Price
        String ProductPrice = driver.findElementById(VAS_Voucher_AndroidObjects.ProductAmount).getAttribute("text");
        if(ProductPrice.equals(VAS_AndroidDataFactory.OwnAmount)){
            log.info("Voucher price : " + ProductPrice);
        }

        //Remaining limit
        String stringA = driver.findElementById(VAS_Voucher_AndroidObjects.RemainingLimit).getAttribute("text");
//        boolean stringB=(driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.PaymentLimitExceed))==null);
//        if(stringB == false){
//        if(stringA.equals(driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.PaymentLimitExceed)))) {
        String[] str_array = stringA.split("daily");
        String PaymentLimit = str_array[0];
        log.info("Remaining Payment limit : " + PaymentLimit);
//        }

        //Account Number
        accountNumber = driver.findElementById("tvAdditionalInfo").getAttribute("text");

        //Product Reference
        PayRef = driver.findElementById(VAS_Voucher_AndroidObjects.EditReference).getAttribute("text");
        if(PayRef.isEmpty()){
            driver.findElementById(VAS_Voucher_AndroidObjects.EditReference).sendKeys(VAS_AndroidDataFactory.VoucherReference);
        }
    }

    public void OwnAmountVoucher_SuccessfulMessage() throws IOException {
        wait.until(presenceOfElementLocated(By.id("tv_product_name")));
        //Product Description
        String ProductDes = driver.findElementById(VAS_Voucher_AndroidObjects.ProductName).getAttribute("text");
        if(ProductDes.equals(OwnVoucherProduct)){
            log.info("Voucher name : " + OwnVoucherProduct);
        }

        //Product Price
        String ProductPrice = driver.findElementById(VAS_Voucher_AndroidObjects.ProductPrice).getAttribute("text");
        if(ProductPrice.equals(VAS_AndroidDataFactory.OwnAmount)){
            log.info("Voucher price : " + ProductPrice);
        }

        //Redemption code
        String RedemCode = driver.findElementById(VAS_Voucher_AndroidObjects.RedemptionCode).getAttribute("text");
        log.info("Redemption code: " + RedemCode);


        //Transaction date
        String TransDate = driver.findElement(By.id(VAS_Voucher_AndroidObjects.PaymentDate)).getAttribute("text");
        if(TransDate.equals(TransactionDate)){
            log.info("Transaction date: " + TransactionDate);
        }

        //Account No
        String AccNo = driver.findElement(By.id(VAS_Voucher_AndroidObjects.AccountNo)).getAttribute("text");
        if(AccNo.equals(accountNumber)){
            log.info("Account No: " + AccNo);
        }

        //Payment ref
        String PayRef = driver.findElementById(VAS_Voucher_AndroidObjects.PaymentRef).getAttribute("text");
        log.info("Payment ref: " + PayRef);
        AndroidCommonMethods.captureScreenshot("Payment success screen");
    }

    public void See_SuccessfulMessage() {
        wait.until(presenceOfElementLocated(By.xpath(VAS_Voucher_AndroidObjects.PaymentSuccess)));
        driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.PaymentSuccess)).isDisplayed();
        log.info("User Successfully bought voucher ");
    }

    public void Check_SuccessDetails() throws IOException {
        wait.until(presenceOfElementLocated(By.id("tv_product_name")));
        //Product Description
        String ProductDes = driver.findElement(By.id(VAS_Voucher_AndroidObjects.ProductName)).getAttribute("text");
        if(ProductDes.equals(VoucherProduct)){
            log.info("Voucher name : " + VoucherProduct);
        }

        //Product Price
        String ProductPrice = driver.findElement(By.id(VAS_Voucher_AndroidObjects.ProductPrice)).getAttribute("text");
        if(ProductPrice.equals(VoucherAmount)){
            log.info("Voucher price : " + VoucherAmount);
        }

        //Redemption code
        String RedemCode = driver.findElement(By.id(VAS_Voucher_AndroidObjects.RedemptionCode)).getAttribute("text");
        log.info("Redemption code: " + RedemCode);


        //Transaction date
        String TransDate = driver.findElement(By.id(VAS_Voucher_AndroidObjects.PaymentDate)).getAttribute("text");
        if(TransDate.equals(TransactionDate)){
            log.info("Transaction date: " + TransactionDate);
        }

        //Account No
        String AccNo = driver.findElement(By.id(VAS_Voucher_AndroidObjects.AccountNo)).getAttribute("text");
        if(AccNo.equals(accountNumber)){
            log.info("Account No: " + AccNo);
        }

        //Payment ref
        String PayRef = driver.findElement(By.id(VAS_Voucher_AndroidObjects.PaymentRef)).getAttribute("text");
        log.info("Payment ref: " + PayRef);
        AndroidCommonMethods.captureScreenshot("Payment success screen");

    }

    public void Select_MultiCategoryVoucher() {
        AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.DOWN);
        AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.DOWN);
//       int aa= driver.findElementsById(VAS_Voucher_AndroidObjects.CategoryLevel1ProName).size();
        Category2 = driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.MultiCategoryVoucher)).getAttribute("text");
        driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.MultiCategoryVoucher)).click();
    }

    public void Update_Reference() {
        String PayRef = driver.findElementById(VAS_Voucher_AndroidObjects.EditReference).getAttribute("text");
        AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.DOWN);
        driver.findElementById(VAS_Voucher_AndroidObjects.EditReference).clear();
        driver.findElement(By.id(VAS_Prepaid_AndroidObjects.FieldErrorMsg)).isDisplayed();
        boolean NextBtn =  driver.findElement(By.id(VAS_Voucher_AndroidObjects.NextBtn)).isEnabled();
        if (NextBtn == false) {
            log.info("Next button is Disabled");
        }
        driver.findElementById(VAS_Voucher_AndroidObjects.EditReference).sendKeys("(Test_Voucher-2)");
        AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.UP);
    }

    public void CheckIf_HollywoodBets_Visible() {

        Boolean isPresent = driver.findElements(By.xpath("//android.widget.TextView[@text='Hollywoodbets']")).size() > 0;
        try{
            if(isPresent == false){
                log.info("Hollywood Bets Voucher is missing");
            }else{
                log.info("Hollywood Bets Voucher is present");
            }
        }catch (Exception e){
            log.info("Hollywood Bets Voucher is present");
        }
    }

    public void sbsUser_Switch_Profiles() {
        try{
            wait.until(presenceOfElementLocated(By.xpath(VAS_Voucher_AndroidObjects.SwitchProfile)));
            if(driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.SwitchProfile)).isDisplayed()){
                driver.findElements(By.id(VAS_Voucher_AndroidObjects.SelectProfile)).get(0).click();
                commonFunctions.secondsDelay(5);
//                driver.findElement(By.xpath(VAS_Prepaid_AndroidObjects.NEXT_LOGIN)).click();
            }
        }catch (Exception e){
            e.getMessage();
        }
    }

    public void lotto_NotVisible_SBSProfile() {
        Boolean isPresentLotto = driver.findElements(By.xpath(VAS_Voucher_AndroidObjects.SelectLotto)).size() > 0;
        try{
            if(isPresentLotto == false){
                log.info("Lotto is missing");
            }else{
                log.info("Lotto is present");
            }
        }catch (Exception e){
            log.info("Lotto is present");
        }
    }

    public void SwitchBetweenProfiles() {
//        MobileElement BackObj = driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']");
        if(driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").isDisplayed()){
            driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
            commonFunctions.secondsDelay(1);
            driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
            commonFunctions.secondsDelay(1);
            driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
        }

        commonFunctions.secondsDelay(1);
        driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.OverviewMore)).click();
    }

    public void Navigate_HistoryDashboard() {
        MobileElement VoucherDashboard = driver.findElementById(VAS_Voucher_AndroidObjects.VoucherDashboard);
        if (VoucherDashboard.isDisplayed()){
            log.info("User navigated to Voucher Dashboard");
        }
    }

    public void Select_VoucherFromHistory() {
        VoucherHisProduct = driver.findElementsById(VAS_Voucher_AndroidObjects.VoucherProduct).get(0).getAttribute("text");
        VoucherHisAmount = driver.findElementsById(VAS_Voucher_AndroidObjects.VoucherHisAmount).get(0).getAttribute("text");
        driver.findElementsById(VAS_Voucher_AndroidObjects.VoucherHistory).get(0).click();
    }

    public void Navigate_HistoryDetailScreen() throws IOException {
        driver.findElementById(VAS_Voucher_AndroidObjects.SendNow).isDisplayed();

        //Product Description
        String ProductDes = driver.findElementById(VAS_Voucher_AndroidObjects.ProductName).getAttribute("text");
        if(ProductDes.equals(VoucherHisProduct)){
            log.info("Voucher name : " + VoucherHisProduct);
        }

        //Product Price
        String ProductPrice = driver.findElementById(VAS_Voucher_AndroidObjects.ProductPrice).getAttribute("text");
        if(ProductPrice.equals(VoucherHisAmount)){
            log.info("Voucher price : " + ProductPrice);
        }

        //Redemption code
        String RedemCode = driver.findElementById(VAS_Voucher_AndroidObjects.RedemptionCode).getAttribute("text");
        log.info("Redemption code: " + RedemCode);


        //Transaction date
        String TransDate = driver.findElementById(VAS_Voucher_AndroidObjects.PaymentDate).getAttribute("text");
        log.info("Transaction date: " + TransDate);

        //Account No
        String AccNo = driver.findElementById(VAS_Voucher_AndroidObjects.AccountNo).getAttribute("text");
        log.info("Account No: " + AccNo);

        //Payment ref
        PayRef = driver.findElementById(VAS_Voucher_AndroidObjects.PaymentRef).getAttribute("text");
        log.info("Payment ref: " + PayRef);
        AndroidCommonMethods.captureScreenshot("History detail screen");
    }

    public void SeeOptions_Sharing() {
        driver.findElementByXPath(VAS_Voucher_AndroidObjects.ShareVia).isDisplayed();
        MobileElement MessageSharing = driver.findElementByXPath(VAS_Voucher_AndroidObjects.MessageSharing);
        if(MessageSharing.isDisplayed()){
            MessageSharing.click();
        }
    }

    public void SelectRecipient_ToShare() {
        MobileElement SelectRecipient = driver.findElementById(VAS_Voucher_AndroidObjects.SelectPopUp);
        if(SelectRecipient.isDisplayed()){
            driver.findElementById(VAS_Voucher_AndroidObjects.NewMessage).click();
            commonFunctions.secondsDelay(1);
            driver.findElementById(VAS_Voucher_AndroidObjects.EnterRecipientNo).sendKeys("0823456789");
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
            commonFunctions.secondsDelay(1);
        }
    }

    public void Send_Voucher() throws IOException {
        driver.findElementById(VAS_Voucher_AndroidObjects.SendMsg).click();
        try{
            if(driver.findElementByXPath("//android.widget.TextView[@text='Sending SMS messages']").isDisplayed()){
                for(int i=0; i<=4; i++){
                    driver.findElementByXPath("//android.widget.Button[@text='ALLOW']").click();
                }
            }
        }catch (Exception e){
            e.getMessage();
        }
        AndroidCommonMethods.captureScreenshot("Voucher sharing");
    }

    public void Navigate_HistoryScreen() {
        wait.until(presenceOfElementLocated(By.xpath(VAS_Voucher_AndroidObjects.HistoryDetail)));
        MobileElement history = driver.findElementByXPath(VAS_Voucher_AndroidObjects.HistoryDetail);
        if(history.isDisplayed()){
            log.info("User navigated to History screen");
        }
    }

    public void Select_MultiVoucher_FixedProduct() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String FixedProduct = driver.findElementsById(VAS_Voucher_AndroidObjects.CategoryLevel1ProName).get(1).getAttribute("text");
        driver.findElementsById(VAS_Voucher_AndroidObjects.CategoryLevel1ProName).get(1).click();
    }

    public void Select_MultiVoucher_OwnAmountProduct() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String OwnAmountProduct = driver.findElementsById(VAS_Voucher_AndroidObjects.CategoryLevel1ProName).get(0).getAttribute("text");
        driver.findElementsById(VAS_Voucher_AndroidObjects.CategoryLevel1ProName).get(0).click();
    }

    public void Clicks_CancelTransaction() {
        MobileElement CancelPopUp = driver.findElementByXPath(VAS_Voucher_AndroidObjects.CancelPopUp);
        if(CancelPopUp.isDisplayed()){
            driver.findElementByXPath(VAS_Voucher_AndroidObjects.CancelYes).click();
        }
    }

    public void Navigate_VoucherCategoryScreen() {
        MobileElement VoucherCategory = driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.VoucherCategoryLevel1));
        if(VoucherCategory.isDisplayed()){
            log.info("User successfully navigated to Category level 1");
        }
    }

    public void Should_SeeVASTSAndCS() {
        MobileElement buyVoucher = driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.SelectVouchers));
        buyVoucher.isDisplayed();
        AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.DOWN);
        driver.findElementById(VAS_Voucher_AndroidObjects.Terms).isDisplayed();
//        String Terms = driver.findElementById(VAS_Voucher_AndroidObjects.Terms).getAttribute("text");
        MobileElement Terms = driver.findElement(MobileBy.AndroidUIAutomator("text(\"terms and conditions.\")"));
        Terms.click();
    }

    public void BuyVoucherButton_Disabled() {
        boolean BuyVoucher = driver.findElementById(VAS_Voucher_AndroidObjects.NextBtn).isEnabled();
        if (BuyVoucher == false) {
            log.info("Buy button is Disable");
        }
    }

    public void BuyButton_Enabled() {
        boolean BuyVoucher = driver.findElementById(VAS_Voucher_AndroidObjects.NextBtn).isEnabled();
        if (BuyVoucher == true) {
            log.info("Buy button is Enable");
        }
    }

    public void CheckOwnAmount_VoucherDetails() {
        //Product Description
        String ProductDes = driver.findElementById(VAS_Voucher_AndroidObjects.ProductDes).getAttribute("text");

        //Product Price
        String ProductPrice = driver.findElementById(VAS_Voucher_AndroidObjects.ProductAmount).getAttribute("text");

        //Remaining limit
        String stringA = driver.findElementById(VAS_Voucher_AndroidObjects.RemainingLimit).getAttribute("text");

        String[] str_array = stringA.split("Daily prepaid limit exceeded. ");
        String PaymentLimit = str_array[0];
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Update limits\")")).click();
        log.info("Remaining Payment limit : " + PaymentLimit);
//        }

        //Product Reference
        String ProductRef = driver.findElementById(VAS_Voucher_AndroidObjects.EditReference).getAttribute("text");
        if(ProductRef.isEmpty()){
            driver.findElementById(VAS_Voucher_AndroidObjects.EditReference).sendKeys(VAS_AndroidDataFactory.VoucherReference);
        }
    }

    public void Select_SufficientFunds_account(){
        AndroidElement ele1 = (AndroidElement) driver.findElementsById("clnrContainer").get(0);
        swipeElementWithDirection(ele1, DIRECTION.LEFT,1.5);
        swipeElementWithDirection(ele1, DIRECTION.UP,1.5);

    }

    public void CheckBuyButton_Disabled(){
        AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.DOWN);
        boolean NxtBtn =  driver.findElement(By.id(VAS_Voucher_AndroidObjects.NextBtn)).isEnabled();
        boolean Nxt = isClickable(driver.findElement(By.id(VAS_Voucher_AndroidObjects.NextBtn)));
        log.info("Clickable? " + Nxt);
        if (Nxt == false) {
            log.info("Next button is Disabled");
        }
    }

    public void Select_AccountWith_InsufficientFunds() throws InterruptedException {
        AndroidElement ele1 = (AndroidElement) driver.findElement(By.id("txvAccountName"));
        swipeElementWithDirection(ele1, DIRECTION.LEFT,1.5);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AndroidElement ele2 = (AndroidElement) driver.findElements(By.id("txvAccountName")).get(0);
        swipeElementWithDirection(ele2, DIRECTION.LEFT,1.2);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AndroidElement ele3 = (AndroidElement) driver.findElements(By.id("txvAccountName")).get(0);
        swipeElementWithDirection(ele3, DIRECTION.LEFT,1.2);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void CheckBuyButton_IsEnabled(){
        AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.DOWN);
        boolean NextBtn =  driver.findElement(By.id(VAS_Voucher_AndroidObjects.NextBtn)).isEnabled();
        boolean Nxt = isClickable(driver.findElement(By.id(VAS_Voucher_AndroidObjects.NextBtn)));
        log.info("Clickable? " + Nxt);

        if (Nxt == true) {
            log.info("Next button is Enabled");
        }
    }

    public void swipeByElements (AndroidElement startElement, AndroidElement endElement) {
        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);

        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);

        new TouchAction(driver)
                .press(point(startX,startY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endX, endY))
                .release().perform();
    }

    public void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);

        new TouchAction(driver)
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }

    public enum DIRECTION {
        DOWN, UP, LEFT, RIGHT
    }

    public void swipeElementWithDirection(MobileElement element, DIRECTION direction, double endXPercen) {

//        double endXPercen = 1.6;
        int startX, startY, endX, endY;

        int screenWidth = driver.manage().window().getSize().width;
        int screenHeight = driver.manage().window().getSize().height;

        switch (direction) {
            case UP:
                startX = element.getCenter().getX();
                startY = element.getSize().getHeight();

                endX = startX;
                endY = screenHeight - (int) (screenHeight * endXPercen);
                break;
            case RIGHT:
                startX = element.getCenter().getX();
                startY = element.getCenter().getY();

                endX = (int) (screenWidth * endXPercen);
                endY = startY;
                break;
            case LEFT:
                startX = element.getCenter().getX();
                startY = element.getCenter().getY();

                endX = screenWidth - (int) (screenWidth * endXPercen);
                endY = startY;
                break;

            case DOWN:
                startX = element.getCenter().getX();
                startY = element.getLocation().getY();

                endX = startX;
                endY = (int) (screenHeight * endXPercen);
                break;

            default:
                startX = element.getCenter().getX();
                startY = element.getLocation().getY();

                endX = startX;
                endY = (int) (screenHeight * endXPercen);
                break;
        }

//        Point startPoint = new Point(startX, startY);
        PointOption startPointOption = new PointOption().withCoordinates(startX, startY);

//        Point endPoint = new Point(endX, endY);
        PointOption endPointOption = new PointOption().withCoordinates(endX, endY);

        WaitOptions waitOptions = new WaitOptions().withDuration(Duration.ofMillis(500));

//        Log.addLog("Start Point: " + startPoint + " and End point: " + endPoint);
        new TouchAction(driver).press(startPointOption).waitAction(waitOptions).moveTo(endPointOption).waitAction().release().perform();

    }

    public void Select_SufficientFundsAccount() {
        AndroidElement ele1 = (AndroidElement) driver.findElement(By.xpath("//android.widget.TextView[@text='abc']"));
        swipeElementWithDirection(ele1, Voucher_Flow.DIRECTION.LEFT,1.5);
//        AndroidElement ele2 = (AndroidElement) driver.findElement(By.xpath("//android.widget.TextView[@text='CA']"));
//        swipeElementWithDirection(ele2, Voucher_Flow.DIRECTION.UP,1.5);
    }

    public static boolean isClickable(MobileElement el)
    {
        try{
            WebDriverWait wait = new WebDriverWait(driver, 6);
            wait.until(ExpectedConditions.elementToBeClickable(el));
            return false;
        }
        catch (Exception e){
            return true;
        }
    }

    public void NavigateTo_CategoryLevelOne() {
        driver.findElement(By.xpath("//android.widget.TextView[@text='Choose from "+ Category2 +"']")).isDisplayed();
        log.info("User successfully navigated to level two");
    }

    public void SelectCategory_FromCategoryLevelTwo() {
        Category3 = driver.findElementsById(VAS_Voucher_AndroidObjects.CategoryLevel1Product).get(1).getAttribute("text");
        driver.findElementsById(VAS_Voucher_AndroidObjects.CategoryLevel1Product).get(1).click();
    }

    public void Click_NextButton(){
        AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.DOWN);
        MobileElement Next = driver.findElement(By.id(VAS_Voucher_AndroidObjects.NextBtn));
        if(Next.isEnabled()){
            Next.click();
            log.info("User successfully navigates to review screen");
        }
    }

    public void Review_Screen() throws IOException {

        driver.findElementByXPath(VAS_Voucher_AndroidObjects.ReviewScreen).isDisplayed();

        //Product Description
        String ProductName = driver.findElementById(VAS_Voucher_AndroidObjects.ProductName).getAttribute("text");
        if(ProductName.equals(VoucherProduct)){
            log.info("Voucher name : " + VoucherProduct);
        }

        //Product Price
        String ProductPrice = driver.findElementById(VAS_Voucher_AndroidObjects.ProductPrice).getAttribute("text");
        if(ProductPrice.equals(VoucherAmount)){
            log.info("Voucher price : " + VoucherAmount);
        }

        // Transaction date
        TransactionDate = driver.findElementById(VAS_Voucher_AndroidObjects.PaymentDate).getAttribute("text");

        //Account Number
        String AccountNum = driver.findElementById(VAS_Voucher_AndroidObjects.AccountNo).getAttribute("text");
        if(AccountNum.equals(accountNumber)){
            log.info("Account number : " + accountNumber);
        }

        //Product Reference
        String Reference = driver.findElementById(VAS_Voucher_AndroidObjects.YourReference).getAttribute("text");
        if(Reference.equals(PayRef)){
            log.info("Voucher reference : " + PayRef);
        }
        AndroidCommonMethods.captureScreenshot("Payment details");

    }

    public void OwnAmount_ReviewScreen() throws IOException {
        driver.findElementByXPath(VAS_Voucher_AndroidObjects.ReviewScreen).isDisplayed();

        //Product Description
        String ProductName = driver.findElementById(VAS_Voucher_AndroidObjects.ProductName).getAttribute("text");
        if(ProductName.equals(OwnVoucherProduct)){
            log.info("Voucher name : " + OwnVoucherProduct);
        }

        //Product Price
        String ProductPrice = driver.findElementById(VAS_Voucher_AndroidObjects.ProductPrice).getAttribute("text");
        if(ProductPrice.equals(VAS_AndroidDataFactory.OwnAmount)){
            log.info("Voucher price : " + ProductPrice);
        }

        // Transaction date
        TransactionDate = driver.findElementById(VAS_Voucher_AndroidObjects.PaymentDate).getAttribute("text");

        //Account Number
        String AccountNum = driver.findElementById(VAS_Voucher_AndroidObjects.AccountNo).getAttribute("text");
        if(AccountNum.equals(accountNumber)){
            log.info("Account number : " + accountNumber);
        }

        //Product Reference
        String Reference = driver.findElementById(VAS_Voucher_AndroidObjects.YourReference).getAttribute("text");
        if(Reference.equals(PayRef)){
            log.info("Voucher reference : " + PayRef);
        }
        AndroidCommonMethods.captureScreenshot("Payment details");
    }

    public void Navigate_VASLandingScreen() {
        MobileElement buyVoucher = driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.SelectVouchers));
        buyVoucher.isDisplayed();
        log.info("User able to navigate to Vas landing screen");

    }

    public void Navigate_App_OverView() {
        wait.until(presenceOfElementLocated(By.id(VAS_Prepaid_AndroidObjects.ENROLMENT_WELCOME_SCREEN)));
        MobileElement WelcomeScreen = driver.findElementById(VAS_Prepaid_AndroidObjects.ENROLMENT_WELCOME_SCREEN);
        if (WelcomeScreen.isDisplayed()) {
            log.info("Welcome screen is displayed successfully");
        }
    }

    public void Clicks_Finish_Button() {
        AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.DOWN);
        driver.findElementByXPath(VAS_Voucher_AndroidObjects.FinishButton).click();
        try {
            MobileElement SavedForLaterButton = driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.SavedForLaterButton));
            if (SavedForLaterButton.isDisplayed()) {
                SavedForLaterButton.click();
            }
        }catch(Exception e){
            e.getMessage();
        }
    }

    public void Clicks_NewPurchase_Button() {
        AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.DOWN);
        driver.findElementByXPath(VAS_Voucher_AndroidObjects.NewPurchaseButton).click();
        try {
            MobileElement SavedForLaterButton = driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.SavedForLaterButton));
            if (SavedForLaterButton.isDisplayed()) {
                SavedForLaterButton.click();
            }
        }catch(Exception e){
            e.getMessage();
        }
    }


}
