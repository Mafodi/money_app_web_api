package platforms.ui.Web.FlowModel;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import platforms.ui.Web.Pages.FND_GetInTouchPage;
import platforms.ui.Web.StepDefinitions.LoginSteps;
import utils.CommonFunctions;
import utils.Utils;

import java.util.concurrent.TimeUnit;

public class FND_GetInTouch_Flow extends Utils {

    public  FND_GetInTouchPage GetTouch= PageFactory.initElements(driver, FND_GetInTouchPage.class);
    public static CommonFunctions wc = PageFactory.initElements(Utils.driver, CommonFunctions.class);
    private static Logger logger = Logger.getLogger(FND_GetInTouch_Flow.class);
    LoginSteps login = new LoginSteps();

    public void USER_NAVIGATES_TO_GET_IN_TOUCH_PAGE() throws InterruptedException {
                Thread.sleep(2000);
        try{
            wc.waitForElement(GetTouch.GetIn_Touch_xpath).click();
            logger.info("Clicked on Get in Touch Icon");

        }catch (NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail();
        }
    }

    public void USER_CAN_VIEW_THE_DETAILS_OF_THE_BANKER_VIZ_BANKER_PICTURE_BANKER_NAME_BANKERS_PHONE_NUMBER_BANKER_EMAIL_ADDRESS() {
        //Check for the banker image
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        wc.waitForElement(GetTouch.Banker_PicIcon_Xpath);
        wc.scrollUp();
        if (GetTouch.Banker_PicIcon_Xpath.isDisplayed()){
            logger.info("Banker image displayed successfully");
            }
        else{
            logger.info("Banker image NOT displayed successfully.  Please investigate.");
            throw new ElementNotVisibleException("Banker image NOT displayed clicked successfully.  Please investigate.");
            }
            //Check for banker name
        String BankerName= wc.waitForElement(GetTouch.Banker_Name_Xpath).getText();
        if (GetTouch.Banker_Name_Xpath.isDisplayed()) {
            logger.info("Banker name displayed successfully as " + BankerName);
                }
        else{
            logger.error("Banker name NOT displayed successfully.  Please investigate.");
            throw new ElementNotVisibleException("Banker name NOT displayed successfully.  Please investigate.");
            }
            //Check telephone number
            String BankerPhoneNumber= wc.waitForElement(GetTouch.Banker_PhoneNum_Xpath).getText();
        if(GetTouch.Banker_PhoneNum_Xpath.isDisplayed()){
            logger.info("Banker telephone number displayed successfully as " + BankerPhoneNumber);
        }
        else {
            logger.error("Banker telephone number NOT displayed successfully.  Please investigate.");
            throw new ElementNotVisibleException("Banker telephone number NOT displayed successfully.  Please investigate.");
            }
            //Check email address
        String BankerEmail= wc.waitForElement(GetTouch.Banker_Email_Xpath).getText();
        if (wc.waitForElement(GetTouch.Banker_Email_Xpath).isDisplayed()){
            logger.info("Banker email address displayed successfully as " + BankerEmail);
            }
        else {
            logger.error("Banker email address NOT displayed successfully.  Please investigate.");
            throw new ElementNotVisibleException("Banker email address NOT displayed successfully.  Please investigate.");
            }
        }
    public void USER_SHOULD_BE_ABLE_TO_CLICK_ON_THE_HIGHLIGHTED_EMAIL_ADDRESS() throws InterruptedException {
        //Click on the email address
        wc.scrollUp();
        Thread.sleep(500);
       try{
           GetTouch.Error_banner_Xpath.click();
           wc.waitForElement(GetTouch.Banker_Email_Xpath).click();
       }
       catch (Exception e){
           wc.waitForElement(GetTouch.Banker_Email_Xpath).click();
       }
        logger.info("Banker email address button clicked successfully");
        //Cancel on the popup appearing
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        logger.info("New PopUp window opened");
        alert.dismiss();
        logger.info("PopUp Window Closed");
    }
    public void I_CAN_CLICK_THE_RELEVANT_FEEDBACK_ICON(String strFeedbackType) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Thread included");
        String strLabelText="";
        //Click the desired feedback type image
        switch (strFeedbackType)
        {
            case "Compliment":
                wc.waitForElement(GetTouch.Compliment_Icon_Xpath).click();
                strLabelText = "Tell us what we got right.";
                break;
            case "Query":
                wc.waitForElement(GetTouch.Query_Icon_Xpath).click();
                strLabelText = "Thank you. How can we improve our service?";
                break;
            case "Complaint":
                wc.waitForElement(GetTouch.Complaint_Icon_Xpath).click();
                strLabelText = "Thank you. How can we improve your experience?";
                break;
                default:
                break;
        }
        //Check that the expected content label text is shown in response to the feedback type chosen
        String strOutput = GetTouch.Content_label_Xpath.getText();
        if (strOutput.contains(strLabelText))
        {
            logger.info("Feedback description header label portion successfully displayed as " + strLabelText);
        }
        else
        {
            logger.error("Feedback description header label portion NOT successfully displayed as " + strLabelText + ", but as " + strOutput);
            throw new ElementNotVisibleException("Feedback description header label portion NOT successfully displayed as " + strLabelText + ", but as " + strOutput);
        }
    }
    public void I_CAN_CAPTURE_THE_DESCRIPTION_IN_THE_BOX(String strDescription)  {
        //Enter the description
        wc.waitForElement(GetTouch.Feedback_Description_Xpath).sendKeys(strDescription);
        logger.info("Entered FeedBack description in the box");

    }
    public void I_CAN_VIEW_A_THANK_YOU_MESSAGE_AFTER_I_CLICK_THE_SUBMIT_FEEDBACK_BUTTON()  {
        //click the Submit feedback button
        wc.waitForElement(GetTouch.Send_FeedBack_Id).click();
        logger.info("Clicked On send Feed Back Button");
        //Validate that the success message is given after feedback submission

        wc.waitForElement(GetTouch.FeedBack_Message_Xpath);
        boolean blnResult = GetTouch.FeedBack_Message_Xpath.isDisplayed();
        if (blnResult)
        {
            logger.info("Success message successfully displayed");
        }
        else {
           logger.error("Success message NOT successfully displayed");
            throw new ElementNotVisibleException("Success message NOT successfully displayed");
        }
    }
}











