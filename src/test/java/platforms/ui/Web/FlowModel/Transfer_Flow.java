package platforms.ui.Web.FlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import platforms.ui.Web.Pages.FND_PaymentPage;
import platforms.ui.Web.Pages.TransferPage;
import utils.CommonFunctions;
import utils.Utils;

public class Transfer_Flow extends Utils {

    public TransferPage transfer = PageFactory.initElements(driver, TransferPage.class);
    public static CommonFunctions wc = PageFactory.initElements(Utils.driver, CommonFunctions.class);
    private static Logger logger = Logger.getLogger(FND_Payment_Flow.class);
    public FND_PaymentPage payment = PageFactory.initElements(driver, FND_PaymentPage.class);

    public void NAVIGATE_TO_TRANSFER_MENU(){

        try{
            wc.waitForElement(transfer.Transfer_Menu).click();

        }catch (NoSuchElementException er)
        {
            logger.info("Unable to locate transfer dashboard" + er.getMessage());
            Assert.fail();
        }
    }

    public void ENTER_TRANSFER_AMOUNT(String amount){

        try{
            Thread.sleep(2000);
            transfer.Transfer_Ammount_Field.sendKeys(amount);

        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to enter transfer amount" + er.getMessage());
            Assert.fail();
        }
    }
    public void CLICK_NEXT(){

        try{
            wc.waitForElement(transfer.next).click();

        }catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail();
        }
    }
    public void TRANSFER_BUTTON(){

        try{
            wc.waitForElement(transfer.Transfer_Button).click();

        }catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail();
        }
    }
    public void VALIDATION_STATUS(){

        try{
            String transferStatus = wc.waitForElement(transfer.Transfer_Status).getText();

            System.out.println(transferStatus);
            if(transferStatus.equalsIgnoreCase("Transfer successful"))
            {
                logger.info("Transfer Successful");
            }
            else{
                logger.info("Transfer Unsuccessful");
                Assert.fail(transferStatus);
            }

        }catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail();
        }
    }
    public void SCHEDULED_VALIDATION_STATUS(){

        try{
            String transferStatus = wc.waitForElement(transfer.Transfer_Status).getText();

            System.out.println(transferStatus);
            if(transferStatus.equalsIgnoreCase("Transfer scheduled"))
            {
                logger.info("Transfer scheduled");
            }
            else{
                logger.info("Transfer not scheduled");
                Assert.fail(transferStatus);
            }

        }catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail();
        }
    }
    public void SELECT_TO_ACCOUNT(String InvestmentAccount){

        try{

            wc.selectDropDownValue(transfer.Transfer_ToAccount,transfer.Transfer_ToAccountList,InvestmentAccount);
        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail();
        }
    }
    public void SELECT_TRANSFER_DATE(String TransferDate){

        boolean Status = false;
        try{


            wc.waitForElement(payment.Calender_Icon_Xpath).click();
            System.out.println("clicked on calender Icon");
            logger.info("clicked on calender icon");
            wc.waitForElement(payment.Calender_Next_Month_Xpath).click();
            System.out.println("clicked on calender next month icon");
            wc.waitForElement(payment.Next_Month_Date_Xpath).click();
            System.out.println("clicked on 01 date");
            String date=payment.Date_Input_xpath.getAttribute("value");
            System.out.println("Selected Future date is   "+date);



        }catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail();
        }
    }
    public void SELECT_REPEAT_METHOD(String RepeatMethod){

        try{

            transfer.Transfer_Repeat.click();
            transfer.Transfer_Monthly.click();
        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void SELECT_REPEAT_METHOD_WEEKLY(String RepeatMethod){

        try{

            transfer.Transfer_Repeat.click();
            transfer.Transfer_Weekly.click();
        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void SELECT_TRANSFER_OCCURRENCES(String NumOccurrences){

        try{

            transfer.Transfer_Occurrence.click();
            Thread.sleep(2000);
            transfer.Transfer_Occurrence_Number.sendKeys(NumOccurrences);

        }
        catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }


}
