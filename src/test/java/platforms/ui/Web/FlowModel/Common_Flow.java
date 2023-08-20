package platforms.ui.Web.FlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import platforms.ui.Web.Pages.CommonElementsPage;
import utils.CommonFunctions;
import utils.Utils;

import java.util.concurrent.TimeUnit;

public class Common_Flow extends Utils{


    public CommonElementsPage common = PageFactory.initElements(driver, CommonElementsPage.class);
    public static CommonFunctions wc = PageFactory.initElements(Utils.driver, CommonFunctions.class);
    private static Logger logger = Logger.getLogger(FND_Payment_Flow.class);




    public void SELECT_FROM_ACCOUNT(String FromAccount){

        try{

            wc.selectDropDownValue(common.FromAccount,common.FromAccountList,FromAccount);
        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }

    public void SELECT_To_ACCOUNT(String ToAccount){

        try{

            wc.selectDropDownValue(common.Transfer_ToAccount,common.Transfer_ToAccountList,ToAccount);
        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void SELECT_PAYMENT_DATE(String TransferDate){

        boolean Status = false;
        try{

                    Thread.sleep(7000);
            do{

                if(driver.findElements((By.xpath("//dp-date-picker[@id='datePicker']//*[@data-date='" + TransferDate + "']"))).size() == 1){
                    common.Payment_Date.click();
                    Thread.sleep(5000);
                    driver.findElement((By.xpath("//dp-date-picker[@id='datePicker']//*[@data-date='" + TransferDate + "']"))).click();
                    driver.findElement((By.xpath("//dp-date-picker[@id='datePicker']//*[@data-date='" + TransferDate + "']"))).click();
                    Thread.sleep(5000);
                    Status = true;
                }

            }while (!Status);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail();
        }
    }
}
