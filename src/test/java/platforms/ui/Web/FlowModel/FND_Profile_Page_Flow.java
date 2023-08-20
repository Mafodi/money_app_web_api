package platforms.ui.Web.FlowModel;

import gherkin.lexer.Th;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.record.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import platforms.ui.Web.Pages.FND_ProfilePage;
import utils.CommonFunctions;
import utils.Utils;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class FND_Profile_Page_Flow extends Utils {

    public FND_ProfilePage ProLimit = PageFactory.initElements(driver, FND_ProfilePage.class);
    public static CommonFunctions wc = PageFactory.initElements(Utils.driver, CommonFunctions.class);
    private static Logger logger = Logger.getLogger(FND_Payment_Flow.class);

    public void I_CAN_NAVIGATE_TO_THE_PROFILE_LIMITS_PAGE() throws InterruptedException {
        Thread.sleep(1000);
        try {
            wc.waitForElement(ProLimit.Setting_Menu_link_xpath).click();
            Thread.sleep(1000);
            logger.info("Clicked on Profile Settings Menu Link");
            wc.waitForElement(ProLimit.Profile_Setings_xpath).click();
            Thread.sleep(1000);
            logger.info("Clicked on Profile Settings Link");
            wc.waitForElement(ProLimit.Profile_Limits_xpath).click();
            Thread.sleep(1000);
            logger.info("Clicked on Profile Limits");
        } catch (NoSuchElementException error) {
            logger.info("Unable to get Profile Limits dashboard" + error.getMessage());
            Assert.fail();
        }
    }

    public void I_CAN_VIEW_ALL_THE_PROFILE_LIMIT_TYPES_UNDER_SETTINGS_PROFILE_LIMITS_LINK_IN_MY_WEB_LOGIN() throws InterruptedException {
            Thread.sleep(500);
        String strResult = wc.waitForElement(ProLimit.Profile_Dash_xpath).getText();
        if (strResult.equals("Profile limits")) {
            int limitList = driver.findElements(By.xpath(ProLimit.getLimit_List_xpath)).size();
            logger.info("Number of the Limits  are   " + limitList);
            List<WebElement> elements = driver.findElements(By.xpath(ProLimit.getLimit_List_xpath));
            for (WebElement webElement : elements) {
                String LimitNames = webElement.getText();
                logger.info(LimitNames);
            }
            if (limitList == 6) {
                logger.info("Profile limits List successfully Displayed");
            } else {
                logger.error("Profile limits not successfully selected");
            }
        }
    }

    public void I_CAN_SELECT_LIMIT_TYPE_AS_TEMPORARY_FOR_THE_TRANSACTION_TYPE_AND_ENTER_AMOUNT(String strTransType, String strLimitType, String strAmount) throws InterruptedException {
        Thread.sleep(1000);
        //Transfer Limit
        if (strTransType.equalsIgnoreCase("Transfer limit") && strLimitType.equalsIgnoreCase("Temporary")) {
           wc.waitForElement(ProLimit.Transfer_Temp_Xpath).click();
            ProLimit.Transfer_Input_Xpath.clear();
            Thread.sleep(500);
            ProLimit.Transfer_Input_Xpath.sendKeys(strAmount);
            logger.info("Transfer type is  " + strTransType + "And limit type is  " + strLimitType + "And  Amount entered is  " + strAmount);
        }
        //Payment limit
        else if (strTransType.equalsIgnoreCase("Payment limit") && strLimitType.equalsIgnoreCase("Temporary")) {
            wc.waitForElement(ProLimit.Payment_Temp_Xpath).click();
            ProLimit.Payment_Input_Xpath.clear();
            Thread.sleep(500);
            ProLimit.Payment_Input_Xpath.sendKeys(strAmount);
            logger.info("Transfer type is  " + strTransType + "And limit type is  " + strLimitType + "And  Amount entered is  " + strAmount);
        }
        //Lotto Limit
        else if (strTransType.equalsIgnoreCase("Lotto limit") && strLimitType.equalsIgnoreCase("Temporary")) {
           wc.waitForElement(ProLimit.Lotto_Temp_Xpath).click();
            ProLimit.Lotto_Input_Xpath.clear();
            Thread.sleep(500);
            ProLimit.Lotto_Input_Xpath.sendKeys(strAmount);
            logger.info("Transfer type is  " + strTransType + "And limit type is  " + strLimitType + "And  Amount entered is  " + strAmount);
        }
        //Send Imali Limit
        else if (strTransType.equalsIgnoreCase("Send iMali limit") && strLimitType.equalsIgnoreCase("Temporary")) {
            wc.waitForElement(ProLimit.SendIMali_Temp_Xpath).click();
            ProLimit.SendIMali_Input_Xpath.clear();
            Thread.sleep(500);
            ProLimit.SendIMali_Input_Xpath.sendKeys(strAmount);

            logger.info("Transfer type is  " + strTransType + "And limit type is  " + strLimitType + "And  Amount entered is  " + strAmount);
        }
        //Prepaid Limit
        else if ((strTransType.equalsIgnoreCase("Prepaid limit") && strLimitType.equalsIgnoreCase("Temporary"))) {

           wc.waitForElement(ProLimit.PrepaidLimit_Temp_Xpath).click();
            ProLimit.PrepaidLimit_Input_Xpath.clear();
            Thread.sleep(500);
            ProLimit.PrepaidLimit_Input_Xpath.sendKeys(strAmount);
            logger.info("Transfer type is  " + strTransType + "And limit type is  " + strLimitType + "And  Amount entered is  " + strAmount);
        }
        //Instant Payment Limit
        else if (strTransType.equalsIgnoreCase("Instant payment limit") && strLimitType.equalsIgnoreCase("Temporary")) {
            wc.waitForElement(ProLimit.InstantLimit_Temp_Xpath).click();
            ProLimit.InstantLimit_Input_Xpath.clear();
            Thread.sleep(500);
            ProLimit.InstantLimit_Input_Xpath.sendKeys(strAmount);
            logger.info("Transfer type is  " + strTransType + "And limit type is  " + strLimitType + "And  Amount entered is  " + strAmount);
        }
    }

    public void I_CAN_SELECT_LIMIT_TYPE_AS_PERMANENT_FOR_THE_TRANSACTION_TYPE_AND_ENTER_AMOUNT(String strTransType, String strLimitType, String strAmount) throws InterruptedException {
        Thread.sleep(1000);
        //Transfer Limit
        if (strTransType.equalsIgnoreCase("Transfer limit") && strLimitType.equalsIgnoreCase("Permanent")) {
           wc.waitForElement(ProLimit.Transfer_Perma_Xpath).click();
            wc.waitForElement(ProLimit.Transfer_Input_Xpath).clear();
            Thread.sleep(500);
            ProLimit.Transfer_Input_Xpath.sendKeys(strAmount);
            logger.info("Transfer type is  " + strTransType + "And limit type is  " + strLimitType + "And  Amount entered is  " + strAmount);
        }
        //Payment limit
        else if (strTransType.equalsIgnoreCase("Payment limit") && strLimitType.equalsIgnoreCase("Permanent")) {
            wc.waitForElement(ProLimit.Payment_Perma_Xpath).click();
            wc.waitForElement(ProLimit.Payment_Input_Xpath).clear();
            Thread.sleep(500);
            ProLimit.Payment_Input_Xpath.sendKeys(strAmount);
            logger.info("Transfer type is  " + strTransType + "And limit type is  " + strLimitType + "And  Amount entered is  " + strAmount);
        }
        //Lotto Limit
        else if (strTransType.equalsIgnoreCase("Lotto limit") && strLimitType.equalsIgnoreCase("Permanent")) {
            wc.waitForElement(ProLimit.Lotto_Perma_Xpath).click();
            wc.waitForElement(ProLimit.Lotto_Input_Xpath).clear();
            Thread.sleep(500);
            ProLimit.Lotto_Input_Xpath.sendKeys(strAmount);
            logger.info("Transfer type is  " + strTransType + "And limit type is  " + strLimitType + "And  Amount entered is  " + strAmount);
        }
        //Send Imali Limit
        else if (strTransType.equalsIgnoreCase("Send iMali limit") && strLimitType.equalsIgnoreCase("Permanent")) {
            wc.waitForElement(ProLimit.SendIMali_Perma_Xpath).click();
            wc.waitForElement(ProLimit.SendIMali_Input_Xpath).clear();
            Thread.sleep(2000);
            ProLimit.SendIMali_Input_Xpath.sendKeys(strAmount);

            logger.info("Transfer type is  " + strTransType + "And limit type is  " + strLimitType + "And  Amount entered is  " + strAmount);
        }
        //Prepaid Limit
        else if ((strTransType.equalsIgnoreCase("Prepaid limit") && strLimitType.equalsIgnoreCase("Permanent"))) {

            wc.waitForElement(ProLimit.PrepaidLimit_Perma_Xpath).click();
            wc.waitForElement(ProLimit.PrepaidLimit_Input_Xpath).clear();
            Thread.sleep(500);
            ProLimit.PrepaidLimit_Input_Xpath.sendKeys(strAmount);
            logger.info("Transfer type is  " + strTransType + "And limit type is  " + strLimitType + "And  Amount entered is  " + strAmount);
        }
        //Instant Payment Limit
        else if (strTransType.equalsIgnoreCase("Instant payment limit") && strLimitType.equalsIgnoreCase("Permanent")) {
            wc.waitForElement(ProLimit.InstantLimit_Perma_Xpath).click();
            wc.waitForElement(ProLimit.InstantLimit_Input_Xpath).clear();
            Thread.sleep(500);
            ProLimit.InstantLimit_Input_Xpath.sendKeys(strAmount);
            logger.info("Transfer type is  " + strTransType + "And limit type is  " + strLimitType + "And  Amount entered is  " + strAmount);
        }
    }

    public void I_CAN_CLICK_THE_UPDATE_BUTTON_OR_THE_CANCEL_BUTTON_FOR_LIMITS(String strAction) throws
            InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (strAction.equalsIgnoreCase("Update")) {
            Thread.sleep(500);
            WebElement element =wc.waitForElement(ProLimit.Update_Id);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
            logger.info("Profile limit successfully updated Button");
        } else {
            Thread.sleep(500);
            WebElement element = wc.waitForElement(ProLimit.Cancel_Xpath);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
            logger.info("Clicked on Cancel Button");
        }
    }

    public void I_CAN_VIEW_THE_SUCCESSFULLY_UPDATED_MESSAGE(String strAction) throws InterruptedException {

        Thread.sleep(1000);
        if (strAction.equals("Update")) {
            String Message = ProLimit.UpdateMessage_Xpath.getText();
            logger.info(" The Updated Message is  " + Message);
        } else {
            logger.info("Profile limit not changed");
        }
    }
    public void I_CAN_NAVIGATE_TO_THE_PROFILE_DETAILS_PAGE() throws InterruptedException {
        Thread.sleep(1000);
        wc.waitForElement(ProLimit.Setting_Menu_link_xpath);
        Thread.sleep(1000);
        try {
            Thread.sleep(2000);
            wc.waitForElement(ProLimit.Setting_Menu_link_xpath).click();
            Thread.sleep(1000);
            logger.info("Clicked on Profile Settings Menu Link");
            wc.waitForElement(ProLimit.Profile_Setings_xpath).click();
            Thread.sleep(1000);
            logger.info("Clicked on Profile Settings Link");
            wc.waitForElement(ProLimit.Profile_Details_xpath).click();
            Thread.sleep(1000);
            logger.info("Clicked on Profile Limits");
        } catch (NoSuchElementException | InterruptedException error) {
            logger.info("Unable to get Profile Limits dashboard" + error.getMessage());
            Assert.fail();
        }
    }

    public void I_CAN_VIEW_A_CLICKABLE_EDIT_LINK() throws InterruptedException {
        Thread.sleep(4000);
        wc.waitForElement(ProLimit.Profile_Edit_Xpath).isDisplayed();

        try{
            Thread.sleep(500);
            wc.waitForElement(ProLimit.Profile_Edit_Xpath).click();
            logger.info("Clicked on Edit Preferred Name link");
        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to Click on Edit Preferred Name link" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void I_CAN_ENTER_PREFERRED_NAME(String strPreferredName) throws InterruptedException {
        Thread.sleep(1000);
        try{

            wc.waitForElement(ProLimit.Input_Edit_Xpath).clear();
            ProLimit.Input_Edit_Xpath.sendKeys(strPreferredName);
            logger.info("user entered his preferred name");
        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to entered his preferred name" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }

    public void I_CAN_CLICK_THE_UPDATE_BUTTON_OR_THE_CANCEL_BUTTON(String strAction)  {
        String Button = ProLimit.Update_Xpath.getText();
        if (Button.equalsIgnoreCase(strAction)) {
            ProLimit.Update_Xpath.click();
            logger.info("Clicked on UPDATE Button");
        } else if (strAction.equals("Cancel")){
            ProLimit.Cancel_Update_xPath.click();
            logger.info("Clicked on CANCEL BUTTON");
        }
    }
    public void I_CAN_VIEW_THE_SUCCESS_MESSAGE_IF_CLICK_ON_UPDATE_BUTTON_OTHERWISE_NO_CHANGES_HAVE_BEEN_MADE(String strAction)  {

        if (strAction.equalsIgnoreCase("Update")) {
            wc.waitForElement(ProLimit.Success_Text_Xpath, 20);
            String MessageText = ProLimit.Success_Text_Xpath.getText();
            logger.info("Successfully updated message as  " + MessageText);

        } else {
            logger.info("No Changes have been made to the Preferred Name");
        }
    }

    //Manage Contact Details

    public void USER_CAN_ABLE_TO_CLICK_ON_CONTACT_DETAILS_EDIT_BUTTON_TO_CHANGE_HIS_PERSONAL_DETAILS()  {
        try {
            wc.waitForElement(ProLimit.Contact_Edit_Xpath).click();
            logger.info("Clicked on  Contact Edit details");

        } catch (NoSuchElementException error) {
            logger.info("Unable to click on Contact edit details" + error.getMessage());

        }
    }
    public void USER_MODIFIES_HIS_CONTACT_DETAILS(String strEmail, String strCellNumber, String strHomeContact, String strWorkContact)  {

        wc.waitForElement(ProLimit.Email_Input_xPath).clear();
        ProLimit.Email_Input_xPath.sendKeys(strEmail);
        wc.waitForElement(ProLimit.AlterCell_Input_xPath).clear();
        ProLimit.AlterCell_Input_xPath.sendKeys(strCellNumber);
        wc.waitForElement(ProLimit.HomeCell_Input_xPath).clear();
        ProLimit.HomeCell_Input_xPath.sendKeys(strHomeContact);
        wc.waitForElement(ProLimit.WorkCell_Input_xPath).clear();
        ProLimit.WorkCell_Input_xPath.sendKeys(strWorkContact);
    }
  public void  USER_CAN_ABLE_TO_CLICK_ON_RESIDENTIAL_ADDRESS_EDIT_BUTTON_TO_CHANGE_HIS_ADDRESS_DETAILS(){

      try{

          wc.waitForElement(ProLimit.Residential_Edit_Xpath).click();
          logger.info("Clicked on Residential Address Edit button");
      }
      catch (NoSuchElementException er)
      {
          logger.info("Unable to Click on Residential Address Edit button" + er.getMessage());
          Assert.fail(er.getMessage());
      }
  }
   public void USER_CAN_ABLE_TO_CLICK_ON_POSTAL_ADDRESS_EDIT_BUTTON_TO_CHANGE_HIS_ADDRESS_DETAILS(){

       try{

           wc.waitForElement(ProLimit.Postal_Edit_Xpath).click();
           logger.info("Clicked on Postal Address Edit button");
       }
       catch (NoSuchElementException er)
       {
           logger.info("Unable to Click on Postal Address Edit button" + er.getMessage());
           Assert.fail(er.getMessage());
       }
   }
    public void USER_MODIFIES_HIS_RESIDENTIAL_ADDRESS(String strAddress1, String strAddress2,String strProvince,String strCity, String strSuburb) throws InterruptedException {
          wc.waitForElement(ProLimit.AddressLine1_Input_xPath).clear();
        ProLimit.AddressLine1_Input_xPath.sendKeys(strAddress1);
        wc.waitForElement(ProLimit.AddressLine2_Input_xPath).clear();
        ProLimit.AddressLine2_Input_xPath.sendKeys(strAddress2);
        try{
            wc.selectDropDownValue(ProLimit.Province_xpath,ProLimit.Province_list_xpath,strProvince);

        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to capture recipient name" + er.getMessage());
            Assert.fail(er.getMessage());
    }
        wc.scrollUp();
        wc.waitForElement(ProLimit.City_Input_xPath).clear();
        wc.waitForElement(ProLimit.City_Input_xPath).sendKeys(strCity);
        Thread.sleep(500);
        wc.javaScriptClick(ProLimit.Highlight_xpath);
       wc.scrollUp();
        wc.waitForElement(ProLimit.Suburb_Input1_xPath).sendKeys(strSuburb);
        Thread.sleep(500);
        wc.javaScriptClick(ProLimit.Highlight_xpath);

    }
    public void USER_MODIFIES_HIS_POSTAL_ADDRESS(String strPostAdd1,String strPostAdd2,String strPostProvince,String strPostCity,String strPostSuburb) throws InterruptedException {
        wc.waitForElement(ProLimit.AddressLine_Postal_Input_xPath).clear();
        ProLimit.AddressLine_Postal_Input_xPath.sendKeys(strPostAdd1);
        wc.waitForElement(ProLimit.AddressLine_Postal2_Input_xPath).clear();
        ProLimit.AddressLine_Postal2_Input_xPath.sendKeys(strPostAdd2);
        try{
            wc.selectDropDownValue(ProLimit.Postal_Province_xpath,ProLimit.Postal_Province_list_xpath,strPostProvince);

        }catch (NoSuchElementException | InterruptedException er)
        {
            logger.info("Unable to capture recipient name" + er.getMessage());
            Assert.fail(er.getMessage());
        }
        wc.scrollUp();
        wc.waitForElement(ProLimit.Postal_City_Xpath).clear();
        wc.waitForElement(ProLimit.Postal_City_Xpath).sendKeys(strPostCity);
        Thread.sleep(500);
        wc.javaScriptClick(ProLimit.Highlight_xpath);
        Thread.sleep(500);
        wc.waitForElement(ProLimit.Suburb_Postal_Input_xPath).sendKeys(strPostSuburb);
        Thread.sleep(500);
        wc.javaScriptClick(ProLimit.Highlight_xpath);

    }
    public void USER_CLICKS_ON_CONSENT_FOR_NEDBANK_TO_UPDATE_YOUR_PERSONAL_DETAILS() {

        try{
            wc.waitForElement(ProLimit.Consent_Xpath).click();
            logger.info("Clicked on consent to Nedbank to update personal details");
        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to Click to Nedbank to update personal details" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void USER_CLICKS_ON_THE_SAVE_CHANGES_BUTTON() {
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        try{
            wc.waitForElement(ProLimit.Save_Button_Xpath).click();
            logger.info("Clicked on Save Button");
        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to Click on Save Button" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
   public void USER_CAN_VIEW_THE_SUCCESSFULLY_UPDATED_MESSAGE()  {
       wc.waitForElement(ProLimit.Save_Message_Xpath);
       org.junit.Assert.assertTrue(ProLimit.Save_Message_Xpath.getText().contains("You've updated your profile details."));

   }
   public void USER_CLICKS_CHECK_BOX_TO_SAVE_HIS_POSTAL_ADDRESS_AS_RESIDENTIAL_ADDRESS() {
       try{
           wc.waitForElement(ProLimit.Postal_Check_Xpath).click();
           logger.info("Clicked on check box to save his postal address as residential address");
       }
       catch (NoSuchElementException er)
       {
           logger.info("Unable to Click on Check Box " + er.getMessage());
           Assert.fail(er.getMessage());
       }
   }


    // Change Password
    public void I_NAVIGATE_TO_THE_CHANGE_NEDBANK_ID_AND_PASSWORD() {
        try {
            wc.waitForElement(ProLimit.Setting_Menu_link_xpath).click();
            Thread.sleep(1000);
            logger.info("Clicked on Profile Settings Menu Link");
            wc.waitForElement(ProLimit.Profile_Setings_xpath).click();
            Thread.sleep(1000);
            logger.info("Clicked on Profile Settings Link");
            wc.waitForElement(ProLimit.Change_Id_Pw_xPath);
            ProLimit.Change_Id_Pw_xPath.click();
            logger.info("Clicked on Change Nedbank ID and Password");
        } catch (NoSuchElementException | InterruptedException error) {
            logger.info("Unable to get Profile Limits dashboard" + error.getMessage());
            Assert.fail();
        }
    }

    public void I_CAN_NAVIGATE_TO_THE_PROFILE_INITIAL_LINK() throws InterruptedException {
        Thread.sleep(1000);
        wc.waitForElement(ProLimit.Initial_Xpath);
        try{
            wc.waitForElement(ProLimit.Initial_Xpath).click();
            logger.info("Clicked profile name initial icon");
        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to Click on profile name initial icon " + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }

    public  void I_CAN_CLICK_ON_CHOOSE_PROFILE_SETTING_ICON() throws InterruptedException {

        Thread.sleep(2000);
        try{
            wc.waitForElement(ProLimit.Setting_Xpath).click();
            logger.info("Clicked on settings icon");
        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to Click on settings icon " + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    }





