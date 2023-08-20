package platforms.ui.Web.FlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.*;
import platforms.ui.Web.VAS_DataFactory;
import utils.CommonFunctions;
import utils.Utils;

import java.io.IOException;

public class Vouchers_Flow extends Utils {
    private static Logger log = Logger.getLogger(Vouchers_Flow.class);
    public VAS_Voucher_BuyVoucherPage buyVoucher = PageFactory.initElements(driver, VAS_Voucher_BuyVoucherPage.class);
    public VAS_Voucher_CategoryLevelPage buyCategory = PageFactory.initElements(driver, VAS_Voucher_CategoryLevelPage.class);
    public VAS_Voucher_HistoryPage HisVoucher = PageFactory.initElements(driver, VAS_Voucher_HistoryPage.class);
    public VAS_Prepaid_BuyPrepaidPage buyPrepaid = PageFactory.initElements(driver, VAS_Prepaid_BuyPrepaidPage.class);
    public VAS_Prepaid_prepaidWebLoginpage loginPage = PageFactory.initElements(driver, VAS_Prepaid_prepaidWebLoginpage.class);
    WebDriverWait wait = new WebDriverWait(driver,70);
    CommonFunctions commonFunctions = new CommonFunctions();
    public static String VoucherBrand, VouchProduct, VouchPrice, VoucherCategoryOne, HisVouName, HisVouPrice, HisVouDate, Account, PayRef;

    public void Navigate_to_VAS() {

        buyVoucher.BuyVoucher.click();
        log.info("user able to click on Buy Voucher option");

    }

    public void Navigate_to_voucher_screen(){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buy_new")));
            buyVoucher.Buy.click();

        }catch (Exception e){
            e.getMessage();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Choose a voucher')]")));
        buyVoucher.VoucherLandingScreen.isDisplayed();
        log.info("user able to navigate to Voucher screen");
    }

    public void Select_Voucher() {

        VoucherBrand = driver.findElement(By.xpath("//div[contains(text(),'AlwaysOn')]")).getAttribute("textContent");
//        String[] str_array = Brand.split("View");
//        VoucherBrand = str_array[0];
        driver.findElement(By.xpath("//div[contains(text(),'AlwaysOn')]")).click();
        log.info("Voucher Type : " + VoucherBrand);
    }

    public void Navigate_To_Voucher_Options(){
        buyVoucher.VoucherOptionsScreen.isDisplayed();
        log.info("user able to navigate to Voucher Option screen");
    }

    public void Select_Product() {

        if(buyVoucher.VoucherProduct.isDisplayed()) {
            buyVoucher.VoucherProduct.click();
        }
    }

    public void Navigate_To_VoucherDetails_Screen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Voucher details')]")));
        buyVoucher.VoucherDetailScreen.isDisplayed();
        log.info("user able to navigate to Voucher detail screen");
    }

    public void Capture_VoucherDetails() {
        VouchProduct = buyVoucher.VoucherName.getAttribute("textContent");
        VouchPrice = buyVoucher.VoucherPrice.getAttribute("textContent");
        log.info("Voucher Product name: " + VouchProduct);
        log.info("Voucher Product price: " + VouchPrice);

    }

    public void Click_BuyVoucher() {

        buyVoucher.BuyVoucherBtn.click();
    }

    public void Navigate_VoucherPaymentScreen(){
        buyVoucher.VoucherPaymentScreen.isDisplayed();
        log.info("user able to navigate to Voucher Payment");
    }

    public void Check_VoucherDetails() throws IOException {
        //Voucher name
        String VoucherName = buyCategory.RecVoucherName.getAttribute("textContent");
        if(VoucherName.equals(VouchProduct)){
            log.info("Voucher Name : " + VoucherName);
        }

        //Amount
        String Amount = buyCategory.RecVoucherPrice.getAttribute("textContent");
        if(VouchPrice.equals(Amount)){
            log.info("Voucher Amount : " + Amount);
        }

        //Account Selection
        Account = buyCategory.AccountNumber.getAttribute("textContent");
            log.info("Account Number : " + Account);

        //Payment Reference
        Utils.TakeScreenCapture("PaymentScreen");
        PayRef = buyCategory.RefipientRef.getAttribute("value");
        if(PayRef.isEmpty()){
            buyCategory.RefipientRef.sendKeys(VAS_DataFactory.payRef);
        }
        Utils.scrollToElement(buyCategory.NextButton);
        buyCategory.NextButton.click();
    }

    public void Navigate_VoucherReviewScreen() {
        buyVoucher.VoucherReviewScreen.isDisplayed();
    }

    public void Review_VoucherDetails() throws IOException {

        //Voucher name
        String VoucherName = driver.findElement(By.xpath("(//div[contains(@class,'field-block clear-field-block')])[1]")).getAttribute("textContent");
        if(VoucherName.equals(VouchProduct)){
            log.info("Voucher Name : " + VoucherName);
        }

        //Amount
        String Amount = driver.findElement(By.xpath("(//div[contains(@class,'field-block clear-field-block')])[2]")).getAttribute("textContent");
        if(VouchPrice.equals(Amount)){
            log.info("Voucher Amount : " + Amount);
        }

        //Account
        String AccountSel = driver.findElement(By.xpath("(//div[contains(@class,'field-block clear-field-block')])[3]")).getAttribute("textContent");
        if(Account.equals(AccountSel)){
            log.info("Account Number: " + AccountSel);
        }

        //Payment Reference
        String PaymentRef = driver.findElement(By.xpath("(//div[contains(@class,'field-block clear-field-block')])[4]")).getAttribute("textContent");
        if(PayRef.equals(PaymentRef)){
            log.info("Voucher Payment Reference : " + PaymentRef );
        }

        Utils.TakeScreenCapture("PaymentReviewScreen");

    }

    public void Voucher_SuccessfulMessage() throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Payment successful')]")));
        buyCategory.VoucherSuccessScreen.isDisplayed();
        //Voucher name
        String VoucherName = driver.findElement(By.xpath("(//div[contains(@class,'value')])[1]")).getAttribute("textContent");
        if(VoucherName.equals(VouchProduct)){
            log.info("Voucher Name : " + VoucherName);
        }

        //Redemption Code
        String RedemCode = driver.findElement(By.xpath("(//div[contains(@class,'value')])[2]")).getAttribute("textContent");
        log.info("Voucher Redemption code : " + RedemCode );

        //Amount
        String Amount = driver.findElement(By.xpath("(//div[contains(@class,'value')])[3]")).getAttribute("textContent");
        if(VouchPrice.equals(Amount)){
            log.info("Voucher Amount : " + Amount);
        }

        //Transaction date
        String TranacDate = driver.findElement(By.xpath("(//div[contains(@class,'value')])[4]")).getAttribute("textContent");
        log.info("Voucher Transaction Date : " + TranacDate );

        //Account
        String AccountSel = driver.findElement(By.xpath("(//div[contains(@class,'value')])[5]")).getAttribute("textContent");
        if(Account.equals(AccountSel)){
            log.info("Account Number: " + AccountSel);
        }

        //Payment Reference
        Utils.scrollToElement(driver.findElement(By.xpath("(//div[contains(@class,'value')])[6]")));
        Utils.TakeScreenCapture("SuccessScreen");
        String PaymentRef = driver.findElement(By.xpath("(//div[contains(@class,'value')])[6]")).getAttribute("textContent");
        log.info("Voucher Payment Reference : " + PaymentRef );

    }

    public void Navigate_VoucherDashboard() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buy_new")));
        if (buyVoucher.Buy.isDisplayed()) {
            log.info("User successfully navigated to Voucher Dashboard");
        }

    }

    public void Overview_VoucherDashboard() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Overview')]")));
        if(loginPage.OverviewNav.isDisplayed()){
            log.info("User successfully navigated to Online Banking Dashboard");
        }

    }

    public void Select_OwnAmount_Product(){
        if(buyVoucher.OwnAmountProduct.isDisplayed()) {
            VouchProduct = buyVoucher.OwnAmountProduct.getAttribute("textContent");
            buyVoucher.OwnAmountProduct.click();
            log.info("Voucher Product name: " + VouchProduct);
        }
    }

    public void Select_OwnAmount_Voucher(){
        VoucherBrand = driver.findElement(By.xpath("//div[contains(text(),'Google Play')]")).getAttribute("textContent");
//        String[] str_array = Brand.split("View");
//        VoucherBrand = str_array[0];
        driver.findElement(By.xpath("//div[contains(text(),'Google Play')]")).click();
        log.info("Voucher Type : " + VoucherBrand);
    }

    public void OwnAmount_VoucherDetails() {
        VouchProduct = buyVoucher.VoucherName.getAttribute("textContent");
        log.info("Voucher Product name: " + VouchProduct);
    }

    public void Check_OwnAmount_VoucherDetails() throws IOException {
        //Voucher name
        String VoucherName = buyCategory.RecVoucherName.getAttribute("textContent");
        if(VoucherName.equals(VouchProduct)){
            log.info("Voucher Name : " + VoucherName);
        }

        //Amount
        String Amount = buyCategory.RecVoucherPrice.getAttribute("textContent");
        if(VAS_DataFactory.VoucherOwnAmount.equals(Amount)){
            log.info("Voucher Amount : " + Amount);
        }

        //Account Selection
        Account = buyCategory.AccountNumber.getAttribute("textContent");
        log.info("Account Number : " + Account);

        //Payment Reference
        Utils.TakeScreenCapture("PaymentScreen");
        PayRef = buyCategory.RefipientRef.getAttribute("value");
        if(PayRef.isEmpty()){
            buyCategory.RefipientRef.sendKeys(VAS_DataFactory.payRef);
        }
        Utils.scrollToElement(buyCategory.NextButton);
        buyCategory.NextButton.click();
    }

    public void OwnAmount_ReviewDetails() throws IOException {

        //Voucher name
        String VoucherName = driver.findElement(By.xpath("(//div[contains(@class,'field-block clear-field-block')])[1]")).getAttribute("textContent");
        if(VoucherName.equals(VouchProduct)){
            log.info("Voucher Name : " + VoucherName);
        }

        //Amount
        String Amount = driver.findElement(By.xpath("(//div[contains(@class,'field-block clear-field-block')])[2]")).getAttribute("textContent");
        if(VAS_DataFactory.VoucherOwnAmount.equals(Amount)){
            log.info("Voucher Amount : " + Amount);
        }

        //Account
        String AccountSel = driver.findElement(By.xpath("(//div[contains(@class,'field-block clear-field-block')])[3]")).getAttribute("textContent");
        if(Account.equals(AccountSel)){
            log.info("Account Number: " + AccountSel);
        }

        //Payment Reference
        String PaymentRef = driver.findElement(By.xpath("(//div[contains(@class,'field-block clear-field-block')])[4]")).getAttribute("textContent");
        if(PayRef.equals(PaymentRef)){
            log.info("Voucher Payment Reference : " + PaymentRef );
        }

        Utils.TakeScreenCapture("PaymentReviewScreen");

    }

    public void OwnAmount_Voucher_SuccessfulMessage() throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Payment successful')]")));

        buyCategory.VoucherSuccessScreen.isDisplayed();
        //Voucher name
        String VoucherName = driver.findElement(By.xpath("(//div[contains(@class,'value')])[1]")).getAttribute("textContent");
        if(VoucherName.equals(VouchProduct)){
            log.info("Voucher Name : " + VoucherName);
        }

        //Redemption Code
        String RedemCode = driver.findElement(By.xpath("(//div[contains(@class,'value')])[2]")).getAttribute("textContent");
        log.info("Voucher Redemption code : " + RedemCode );

        //Amount
        String Amount = driver.findElement(By.xpath("(//div[contains(@class,'value')])[3]")).getAttribute("textContent");
        if(VAS_DataFactory.VoucherOwnAmount.equals(Amount)){
            log.info("Voucher Amount : " + Amount);
        }

        //Transaction date
        String TransacDate = driver.findElement(By.xpath("(//div[contains(@class,'value')])[4]")).getAttribute("textContent");
        log.info("Voucher Transaction Date : " + TransacDate );

        //Account
        String AccountSel = driver.findElement(By.xpath("(//div[contains(@class,'value')])[5]")).getAttribute("textContent");
        if(Account.equals(AccountSel)){
            log.info("Account Number: " + AccountSel);
        }
        //Payment Reference
        Utils.scrollToElement(driver.findElement(By.xpath("(//div[contains(@class,'value')])[6]")));
        Utils.TakeScreenCapture("SuccessScreen");
        String PaymentRef = driver.findElement(By.xpath("(//div[contains(@class,'value')])[6]")).getAttribute("textContent");
        log.info("Voucher Payment Reference : " + PaymentRef );

    }

    public void Download_Voucher(){
        buyCategory.DownloadBtn.click();
        commonFunctions.secondsDelay(1);
    }

    public void Click_NewPurchase_Button(){
        buyCategory.NewPurchaseBtn.click();
    }

    public void Clicks_CancelIcon(){
        HisVoucher.HisBackBtn.click();
    }

    public void Select_MultiCategory_Voucher() {
        VoucherBrand = driver.findElement(By.xpath("//div[contains(text(),'PlayStation')]")).getAttribute("textContent");
//        String[] str_array = Brand.split("View");
//        VoucherBrand = str_array[0];
        driver.findElement(By.xpath("//div[contains(text(),'PlayStation')]")).click();
        log.info("Voucher Type : " + VoucherBrand);
    }

    public void Navigate_CategoryLevelOne() {
        WebElement CategoryOneScreen = driver.findElement(By.xpath("//span[contains(text(),'Choose from "+ VoucherBrand +"')]"));
        if(CategoryOneScreen.isDisplayed()){
            log.info("User navigated to category level one screen");
        }
    }

    public void Select_Category_CategoryLevelOne(){
        String Brand = driver.findElement(By.xpath("(//div[contains(@class,'category-item')])["+ VAS_DataFactory.CategoryLevel1 +"]")).getAttribute("textContent");
        String[] str_array = Brand.split("View");
        VoucherCategoryOne = str_array[0];
        driver.findElement(By.xpath("(//div[contains(@class,'category-item')])["+ VAS_DataFactory.CategoryLevel1 +"]")).click();
        log.info("Voucher Type : " + VoucherCategoryOne);
    }

    public void Navigate_CategoryLevelTwo(){
        WebElement CategoryOneScreen = driver.findElement(By.xpath("//span[contains(text(),'Choose from "+ VoucherCategoryOne +"')]"));
        if(CategoryOneScreen.isDisplayed()){
            log.info("User navigated to category level two screen");
        }
    }

    public void Select_Category_CategoryLevelTwo() {
        String Brand = driver.findElement(By.xpath("(//div[contains(@class,'category-item')])["+ VAS_DataFactory.CategoryLevel2 +"]")).getAttribute("textContent");
        String[] str_array = Brand.split("View");
        String VoucherCategory2 = str_array[0];
        driver.findElement(By.xpath("(//div[contains(@class,'category-item')])["+ VAS_DataFactory.CategoryLevel2 +"]")).click();
        log.info("Voucher Type : " + VoucherCategory2);
    }

    public void Navigate_OwnAmount_CategoryLevelTwo()  {
        String Brand = driver.findElement(By.xpath("(//div[contains(@class,'category-item')])["+ VAS_DataFactory.CategoryOwnAmount +"]")).getAttribute("textContent");
        String[] str_array = Brand.split("View");
        String VoucherCategory2 = str_array[0];
        driver.findElement(By.xpath("(//div[contains(@class,'category-item')])["+ VAS_DataFactory.CategoryOwnAmount +"]")).click();
        log.info("Voucher Type : " + VoucherCategory2);
    }

    public void Update_Reference(){
        //Payment Reference
        Utils.scrollToElement(buyCategory.RefipientRef);
        String PayRef = buyCategory.RefipientRef.getAttribute("value");
        buyCategory.RefipientRef.clear();
        buyCategory.OwnAmountError.isDisplayed();
        buyCategory.RefipientRef.sendKeys("(Test_Voucher-2)&");
        boolean Next = buyCategory.NextButton.isEnabled();
        if (Next == true) {
            log.info("Next button is Enabled");
        }
    }

    public void Check_HollywoodBets_Visible() {
//        WebElement isPresent = driver.findElement(By.xpath("//div[contains(text(),'Hollywoodbets')]"));
//        boolean isVisible_LogoutLabel = checkNullElement(driver.findElement(By.xpath("//div[contains(text(),'Hollywoodbets')]")));
//        Assert.assertFalse(isVisible_LogoutLabel);
//        log.info("Hollywood Bets Voucher is missing");


        Boolean isPresent = driver.findElements(By.xpath("//div[contains(text(),'Hollywoodbets')]")).size() > 0;
        try{
            if(isPresent == false){
                log.info("Hollywood Bets Voucher is missing");
            }
        }catch (Exception e){
            log.info("Hollywood Bets Voucher is present");
        }
    }

    public void ShouldNotSee_Lotto_Product(){

        Boolean isPresent = driver.findElements(By.xpath("//*[contains(text(),'Lotto')]")).size() > 0;
        try{
            if(isPresent == false){
                log.info("Lotto is missing");
            }
        }catch (Exception e){
            log.info("Lotto is present");
        }

    }

    public void Switch_Profile(){
        if(HisVoucher.profileSwitch.isDisplayed()){
            HisVoucher.profileSwitch.click();
            HisVoucher.profileSelect.click();
            commonFunctions.secondsDelay(10);
//            try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Done')]")));
                if (driver.findElement(By.xpath("//div[contains(text(),'Done')]")).isDisplayed()) {
                    driver.findElement(By.xpath("//div[contains(text(),'Done')]")).click();}

//            }catch(Exception e){
//                e.printStackTrace();
//            }
            log.info("User successfully switch to other profile");
        }
    }

    public void Share_Voucher_History(){
        String VouName = HisVoucher.HisVoucherName.getAttribute("textContent");
//        String[] splitted = VouName.trim().split("\\s*,\\s*");
        HisVouName = VouName.trim();
        System.out.println(HisVouName);

        String VouDate = HisVoucher.HisVoucherDate.getAttribute("textContent");
//        String[] splittedD = VouDate.trim().split("\\s*,\\s*");
        HisVouDate = VouDate.trim();
        System.out.println(HisVouDate);

        String VouPrice = HisVoucher.HisVoucherPrice.getAttribute("textContent");
//        String[] str_arrayP = VouPrice.split("\\s");
        HisVouPrice = VouPrice.trim();
    }

    public void Check_Voucher_HistoryDetails() throws IOException {
        //Voucher name
        String VoucherName = driver.findElement(By.xpath("(//div[contains(@class,'value')])[1]")).getAttribute("textContent");
        if(VoucherName.equals(HisVouName)){
            log.info("Voucher Name : " + VoucherName);
        }

        //Redemption Code
        String RedemCode = driver.findElement(By.xpath("(//div[contains(@class,'value')])[2]")).getAttribute("textContent");
        log.info("Voucher Redemption code : " + RedemCode );

        //Amount
        String Amount = driver.findElement(By.xpath("(//div[contains(@class,'value')])[3]")).getAttribute("textContent");
        if(HisVouPrice.equals(Amount)){
            log.info("Voucher Amount : " + Amount);
        }

        //Date
        String Date = driver.findElement(By.xpath("(//div[contains(@class,'value')])[4]")).getAttribute("textContent");
        if(HisVouDate.equals(Date)){
            log.info("Voucher Transaction Date : " + Date);
        }

        //Account
        String Account = driver.findElement(By.xpath("(//div[contains(@class,'value')])[5]")).getAttribute("textContent");
        log.info("Voucher Account no : " + Account );


        // Payment Reference
        Utils.scrollToElement(driver.findElement(By.xpath("(//div[contains(@class,'value')])[6]")));
        Utils.TakeScreenCapture("SuccessScreen");
        String PaymentRef = driver.findElement(By.xpath("(//div[contains(@class,'value')])[6]")).getAttribute("textContent");
        log.info("Voucher Payment Reference : " + PaymentRef );
    }

    public void Download_Dashboard() {
        HisVoucher.HisVoucherDownload.click();
        commonFunctions.secondsDelay(1);
    }

    public void Download_Voucher_History(){
        HisVoucher.HisDetailDownload.click();
        commonFunctions.secondsDelay(1);
    }

    public void Select_MultiProduct_Voucher() {

        VoucherBrand = driver.findElement(By.xpath("//div[contains(text(),'Hollywoodbets')]")).getAttribute("textContent");
//        String[] str_array = Brand.split("View");
//        VoucherBrand = str_array[0];
        driver.findElement(By.xpath("//div[contains(text(),'Hollywoodbets')]")).click();
        log.info("Voucher Type : " + VoucherBrand);

    }

    public void Edit_Reference(){
        //Payment Reference
        Utils.scrollToElement(buyCategory.RefipientRef);
        String PayRef = buyCategory.RefipientRef.getAttribute("value");
        buyCategory.RefipientRef.clear();
//        buyCategory.RefipientRef.sendKeys("");

    }

    public void BuyVoucher_IsEnabled() {
        boolean BuyVoucher = buyVoucher.BuyVoucherBtn.isEnabled();
        if (BuyVoucher == true) {
            log.info("Buy voucher button is Enabled");
        }
    }

    public void BuyVoucher_Disabled() {
        boolean BuyVoucher = buyVoucher.BuyVoucherBtn.isEnabled();
        if (BuyVoucher == false) {
            log.info("Buy voucher button is Disabled");
        }

    }

    public void BuyButton_Disabled() {

        boolean Buy = buyPrepaid.BuyBtn.isEnabled();
        if (Buy == false) {
            log.info("Buy button is Disabled");
        }
    }

    public void BuyButton_Enabled() {

        boolean Buy = buyPrepaid.BuyBtn.isEnabled();
        if (Buy == true) {
            log.info("Ok button is enabled");
        }
    }

    public void NextButton_Disabled() {

        boolean Next = buyCategory.NextButton.isEnabled();
        if (Next == false) {
            log.info("Buy button is Disabled");
        }
    }

    public void NextButton_Enabled() {

        boolean Next = buyCategory.NextButton.isEnabled();
        if (Next == true) {
            log.info("Buy button is Disabled");
        }
    }

}
