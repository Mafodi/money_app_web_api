package platforms.ui.Web.FlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import platforms.ui.Web.Pages.PrepaidPage;
import utils.CommonFunctions;
import utils.Utils;

import java.util.concurrent.TimeUnit;

public class Prepaid_Flow extends Utils{

    public PrepaidPage prepaids = PageFactory.initElements(driver, PrepaidPage.class);
    public static CommonFunctions wc = PageFactory.initElements(Utils.driver, CommonFunctions.class);
    private static Logger logger = Logger.getLogger(FND_Payment_Flow.class);


    public void NAVIGATE_TO_PREPAIDS_MENU(){

        try{

            wc.waitForElement(prepaids.Buy_Menu).click();
            Thread.sleep(2000);
            wc.waitForElement(prepaids.Buy_Prepaids_Menu).click();

        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to locate prepaids dashboard" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }

    public void NAVIGATE_TO_ELECTRICITY_MENU(){

        try{

            wc.waitForElement(prepaids.Buy_Menu).click();
            Thread.sleep(2000);
            wc.waitForElement(prepaids.Buy_Electricity_Menu).click();

        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to locate Electricity dashboard" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }

    public void USER_CAPTURES_RECIPIENT(String RecipientName){

        try{

            Thread.sleep(6000);
            prepaids.Recipient_Name.clear();
            wc.waitForElement(prepaids.Recipient_Name).sendKeys(RecipientName);

        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to capture recipient name" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void USER_CAPTURES_ELE_RECIPIENT(String RecipientName){

        try{

            Thread.sleep(5000);
            wc.waitForElement(prepaids.Elec_Recipient_Name).sendKeys(RecipientName);

        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to capture recipient name" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }

    public void USER_CAPTURES_METER(String MeterNumber){

        try{

            Thread.sleep(5000);
            wc.waitForElement(prepaids.Meter_Number).sendKeys(MeterNumber);
            wc.waitForElement(prepaids.Meter_Number).sendKeys(Keys.TAB);

        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to capture recipient name" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }

    public void USER_CAPTURES_CELLPHONE(String Cellphone){

        try{
            wc.waitForElement(prepaids.Buy_MobileNo).sendKeys(Cellphone);

        }catch (NoSuchElementException er)
        {
            logger.info("Unable to capture recipient name" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void USER_SELECTS_SERVICE_PROVIDER(String ServiceProvide){

        try{
            wc.selectDropDownValue(prepaids.Buy_Provider_xpath,prepaids.Buy_ProviderList_xpath,ServiceProvide);

        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to capture recipient name" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void USER_SELECTS_NEXTR(){

        try{
            //scroll down to the next button
            wc.scrollDown();
            driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
            prepaids.Buy_NextBtn_id.click();

        }catch (NoSuchElementException er)
        {
            logger.info("Unable to capture recipient name" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void USER_SELECTS_RECHARGETYPE(String RechargeType){

        try{

            driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
            wc.selectDropDownValue(prepaids.Buy_RechargeType_xpath,prepaids.Buy_RechargeTypeList_xpath,RechargeType);

        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to capture recipient name" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void USER_SELECTS_BUNDLE(String Bundle){

        try{

            driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
            wc.selectDropDownValue(prepaids.Buy_BundleAmt_xpath,prepaids.Buy_BundleAmtList_xpath,Bundle);

        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to capture recipient name" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void SELECT_CAPTURES_REF(String Referrence){

        try{

            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            prepaids.Buy_YourRef.sendKeys(Referrence);

        }
        catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }

    public void SELECT_CAPTURES_ELE_REF(String EleReferrence){

        try{

            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            prepaids.Electricity_YourRef.clear();
            prepaids.Electricity_YourRef.sendKeys(EleReferrence);

        }
        catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void VALIDATE_REVIEW_SCREEN(){

        try{

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            String RevieMS = prepaids.ReviewScreenValidation.getText();
            if(RevieMS.equalsIgnoreCase("Review your purchase")){

                wc.scrollDown();
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                prepaids.Save_Recipient.click();
                logger.info("Prepaid successfully validated");
            }
            else
            {
                logger.info("Prepaid review screen  not  validated");
                Assert.fail(RevieMS);
            }

        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void VALIDATE_REVIEW_ELEC_SCREEN(){

        try{

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            String RevieMS = prepaids.ReviewScreenValidation.getText();
            if(RevieMS.equalsIgnoreCase("Review electricity purchase.")){

                wc.scrollDown();
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                prepaids.Save_Elect_Recipient.click();
                logger.info("Prepaid successfully validated");
            }
            else
            {
                logger.info("Prepaid review screen  not  validated");
                Assert.fail(RevieMS);
            }

        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void SELECTS_BUY(){

        try{

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            prepaids.Buy_Button.click();

        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void SELECTS_BUY_EELECTRICITY(){

        try{

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            prepaids.Buy_Electricity.click();

        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void TRANSACTION_STATUS(){

        try{

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            String TransactionStatus = prepaids.Transaction_Status.getText();
            if(TransactionStatus.equalsIgnoreCase("Payment successful."))
            {
                logger.info("Transaction  successfully made");
            }
            else{
                logger.info("Unable to process the  transaction");
                Assert.fail(TransactionStatus);
            }

        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }

    public void ENTER_OWN_AMOUNT(String OwnAmount){

        try{

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            prepaids.Buy_OwnAmount_id.clear();
            //wc.waitForElement(prepaids.Buy_OwnAmount_id).sendKeys(OwnAmount);
            prepaids.Buy_OwnAmount_id.sendKeys(OwnAmount);

        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void SELECT_NOTIFICATION(String NotificationType,String NotificationValue){

        try{
            driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
            wc.selectDropDownValue(prepaids.NotificationType,prepaids.NotificationTypeList,NotificationType);
            prepaids.Notification_Value.sendKeys(NotificationValue);
        }
        catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void SELECT_NOTIFICATION_ELECT(String NotificationType,String NotificationValue){

        try{
            driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
            wc.selectDropDownValue(prepaids.NotificationTypeElect,prepaids.NotificationTypeListElect,NotificationType);
            prepaids.Notification_Value.sendKeys(NotificationValue);
        }
        catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }


    public String RecipientName (int n)
    {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public void SELECT_PREPAID_DATE(String TransferDate){

        boolean Status = false;
        try{


            do{

                if(driver.findElements((By.xpath("//dp-date-picker[@id='datePicker']//*[@data-date='" + TransferDate + "']"))).size() == 1){
                    prepaids.Prepaid_Date.click();
                    Thread.sleep(5000);
                    driver.findElement((By.xpath("//dp-date-picker[@id='datePicker']//*[@data-date='" + TransferDate + "']"))).click();
                    driver.findElement((By.xpath("//dp-date-picker[@id='datePicker']//*[@data-date='" + TransferDate + "']"))).click();
                    Thread.sleep(5000);
                    Status = true;
                }

            }while (!Status);


        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail();
        }
    }
    public void SELECT_PREPAID_FREQUENCY_WEEKLY(String PrepaidFrequency){
        try{
            driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
            prepaids.Prepaid_Frequency.click();
            prepaids.Prepaid_Frequency_Weekly.click();
        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void SELECT_PREPAID_FREQUENCY_MONTHLY(String PrepaidFrequency){

        try{
            driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
            prepaids.Prepaid_Frequency.click();
            prepaids.Prepaid_Frequency_Monthly.click();
        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void SELECT_TRANSFER_OCCURRENCES(String NumOccurrences){

        try{

            prepaids.Prepaid_Occurrence_Type.click();
            Thread.sleep(2000);
            prepaids.Prepaid_Occurrence_Number.sendKeys(NumOccurrences);

        }
        catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
}
