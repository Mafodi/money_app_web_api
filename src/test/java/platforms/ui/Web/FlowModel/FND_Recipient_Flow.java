package platforms.ui.Web.FlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import platforms.ui.Web.Pages.FND_RecipientPage;
import platforms.ui.Web.StepDefinitions.LoginSteps;
import utils.CommonFunctions;
import utils.Utils;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class FND_Recipient_Flow extends Utils {

    boolean b=true;
    String meterNo=null;

    public FND_RecipientPage bp = PageFactory.initElements(driver, FND_RecipientPage.class);
    public static CommonFunctions cf = PageFactory.initElements(driver, CommonFunctions.class);
    private static Logger logger = Logger.getLogger(FND_Payment_Flow.class);
    LoginSteps login = new LoginSteps();

    public void REC_I_AM_LOGGED_IN_TO_BANKING_WEB_APP_WITH_USERNAME_AND_PASSWORD(String userName, String password)  {
        try{
            login.user_launch_prepaid_web_application();
            login.user_enters_username_and_password_from_feature_file(userName, password);
            login.user_clicks_on_Login();

            login.user_must_logon_to_Money_Web_application();
        }catch (Exception error){
            logger.info("Unable to Login due to this error message" + error.getMessage());
        }
    }

    public void I_CAN_SELECT_THE_RECIPIENTS_SERVICE_FROM_THE_MENU_BAR_PRESENT_AT_THE_TOP_OF_MY_WEB_LOGIN_VIEW()  {
        try{
            cf.waitForElement(bp.IBM_Cross).click();
            logger.info("IBM cross displayed and closed");
        }catch(Exception e){

        }
        cf.clickAndTryMultiple(cf.waitForElement(bp.Recipients),10);
        logger.info("Clicked on the recipients tab");
    }

    public void I_SHOULD_BE_ABLE_TO_SELECT_THE_ADD_A_NEW_RECIPIENT_SERVICE_LINK() throws Throwable {
        Thread.sleep(2000);
        try{
                cf.clickAndTryMultiple(bp.Close_Button_Apologies,3);
        }catch(Exception e){

        }
        try {
            if(bp.Error_Ms_Close.isDisplayed()){
                bp.Error_Ms_Close.click();
                cf.waitForElement(bp.Add_A_New_Recipient).click();
            }
            else
                {
                cf.waitForElement(bp.Add_A_New_Recipient).click();
            }

        }catch(Exception e){
            Thread.sleep(1000);
            cf.waitForElement(bp.Add_A_New_Recipient).click();
        }
        logger.info("Clicked on Add a new Recipient");
    }

    public void ENTER_EDITABLE_TEXT_FIELD_WITH_LABEL_RECIPIENT_NAME(String name)  {
        cf.waitForElement(bp.Recipient_Name).sendKeys(name);
        logger.info("Recipient name filled");
    }

    public void CLICK_BUTTON_WITH_LABEL_ADD_EMAIL() throws Throwable {
        cf.clickAndTryMultiple(bp.Add_Email_Button,30);
        //cf.javaScriptClick(cf.waitForElement(bp.Add_Email_Button));
        logger.info("Add Email button clicked");
    }

    public void ENTER_EDITABLE_TEXT_FIELD_WITH_THE_LABEL_EMAIL_ADDRESS_FOR_ADDING_THE_RECIPIENT_EMAIL_ADDRESS(String email)  {
        try {
            cf.waitForElement(bp.Add_Email_Send_Text).sendKeys(email);
        }catch(Exception e){
            System.out.println("executing code in catch");
            cf.waitForElement(bp.Add_Email_Send_Text).sendKeys(email);
        }
        logger.info("Email filled in the email text field");
    }

    public void CLICK_BUTTON_WITH_LABEL_ADD_CELL_PHONE_NUMBER() throws Throwable {
        Thread.sleep(1000);
        bp.Add_Email_Send_Text.sendKeys(Keys.TAB);
        try{
            cf.waitForElement(bp.Add_Cellphone_No_Button).click();
        }catch(Exception e){
            try {
                cf.javaScriptClick(bp.Add_Cellphone_No_Button);
            }catch(Exception e1){
                Thread.sleep(500);
                cf.javaScriptClick(bp.Add_Cellphone_No_Button);
            }
        }
        logger.info("Clicked on cellphone No button");
    }

    public void ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_CELL_PHONE_NUMBER_FOR_ADDING_THE_RECIPIENT_CELL_PHONE_NUMBER(String phoneNo)  {
        cf.waitForElement(bp.Add_Cellphone_No_Text_Field).sendKeys(phoneNo);
        logger.info("Cellphone No sent to the text field");
    }

    public void CLICK_BUTTON_WITH_LABEL_ADD_FAX_NUMBER() throws Throwable {
        bp.Add_Cellphone_No_Text_Field.sendKeys(Keys.TAB);
        //cf.javaScriptClick(cf.waitForElement(bp.Add_fax_No));
        Actions ob = new Actions(driver);
        ob.moveToElement(bp.Add_fax_No).click().build().perform();
        //cf.clickAndTryMultiple(bp.Add_fax_No,3);
        logger.info("Clicked on add fax No");
    }

    public void CLICK_ON_THE_RECIPIENT_NAME_TO_OPEN_UP_ITS_DETAILS_ELECTRIC_METER() throws InterruptedException {
        cf.waitForElement(bp.Search_Result_First_Name_Electric_Meter);
        cf.clickAndTryMultiple(bp.Search_Result_First_Name_Electric_Meter,10);
    }

    public void ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_FAX_NUMBER_FOR_ADDING_THE_RECIPIENT_FAX_NUMBER(String faxNo) throws Throwable {
        Thread.sleep(1000);
        cf.scrollDown();

        try {
            cf.waitForElement(bp.Add_fax_No_Text_Field).sendKeys(faxNo);
        }catch(Exception e){
            cf.waitForElement(bp.Add_fax_No_Text_Field).sendKeys(faxNo);
        }

        logger.info("Fax no sent to text field");
    }

    public void CLICK_BUTTON_WITH_THE_LABEL_CELLPHONE_NUMBER()  {
        //cf.javaScriptClick(bp.add_Cellphone_No);
        cf.clickAndTryMultiple(bp.add_Cellphone_No,20);
        logger.info("Clicked on add Cellphone No for funds to be sent to the No");
    }

    public void I_SHOULD_BE_ABLE_TO_CLICK_ON_THE_DELETE_BUTTON_TO_DELETE_THE_RECIPIENT_BOTH_IN_THE_PAGE_AND_THE_POPUP() {
        cf.waitForElement(bp.Delete_Recipient);
        cf.clickAndTryMultiple(bp.Delete_Recipient,10);
        cf.waitForElement(bp.Delete_Recipient_In_Popoup);
        cf.clickAndTryMultiple(bp.Delete_Recipient_In_Popoup,10);
    }

    public void ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_CELLPHONE_NUMBER_FOR_ADDING_THE_RECIPIENT_PREPAID_CELL_NUMBER(String cellphoneNo)  {
        cf.waitForElement(bp.Add_Cellphone_No_Text_Field_Recipient).sendKeys(cellphoneNo);
        logger.info("The Cell no filled in the text field for funds to be sent");
    }

    public void ON_SELECTING_THE_DELETE_BUTTON_I_SHOULD_GET_A_SUCCESS_MESSAGE_THAT_THE_RECIPIENT_WAS_DELETED_SUCCESSFULLY() {
        cf.waitForElement(bp.Success_Message_After_Delete);
        Assert.assertTrue(bp.Success_Message_After_Delete.getText().contains("Success! The recipient has been deleted."));

    }

    public void CLICK_BUTTON_WITH_LABEL_ADD_BANK_ACCOUNTS()  {
        bp.Add_fax_No_Text_Field.sendKeys(Keys.PAGE_DOWN);
        cf.javaScriptClick(cf.waitForElement(bp.Add_Bank_Button));
        logger.info("Button with add bank account was clicked");
    }

    public void BELOW_THE_SUCCESS_MESSAGE_I_SHOULD_BE_PRESENTED_WITH_THE_TEXT_AREA_WITH_ALL_THE_FIELD_NAMES_LABELS_AND_THE_VALUES_PROVIDED_DURING_THE_ADD_RECIPIENT_ACTION_IN_THE_PREVIOUS_STEP_BEFORE_SELECTING_THE_SAVE_BUTTON_METER_NO(String meterNo) throws Throwable {
        Thread.sleep(2000);
        cf.waitForElement(bp.View_More_Details,300);
        try {
            Thread.sleep(1000);
            cf.javaScriptClick(bp.View_More_Details);
        }catch(Exception e){
            try {
                cf.waitForElement(bp.View_More_Details).click();
            }catch(Exception e1){
                Thread.sleep(1000);
                cf.waitForElement(bp.View_More_Details).click();
            }
        }
        Thread.sleep(1000);
        Assert.assertTrue(bp.View_Meter_Account_No.getText().equals(meterNo));
    }

    public void ENTER_EDITABLE_DROP_DOWN_FIELD_WITH_LABEL_BANK_AND_I_SHOULD_BE_ABLE_TO_SELECT_ONE_OF_THE_LISTED_BANKS_TO_ADD_THE_BANK_ACCOUNT(String bankName) throws Throwable {
        Thread.sleep(6000);
        try {
            cf.clickAndTryMultiple(bp.Add_Bank_Text_Field, 5);
            cf.waitForElement(bp.Add_Bank_Text_Field).sendKeys(bankName);
        }catch(Exception e){
        }
        try {
            cf.waitForElement(driver.findElement(By.xpath("//span[text()='" + bankName + "']"))).click();
        }catch(Exception e1){

        }
        try{
            WebElement element=driver.findElement(By.xpath("//span[text()='"+bankName+"']"));
            cf.actionsClick(element);
        }catch(Exception e){

        }

        if(bankName=="FIRST NATIONAL BANK"){
            cf.waitForElement(bp.Add_Branch_Name).click();
        }
        logger.info("The bank type was selected as per the data");
    }

    public void ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_ACCOUNT_NUMBER_FOR_ADDING_THE_RECIPIENTS_BANK_ACCOUNT_DETAILS(String bankAccount) throws Throwable {

        cf.waitForElement(bp.Add_Account_No_Text_Field).sendKeys(bankAccount);
        logger.info("Account number was filled in the account no field as per the bank");
    }

    public void ENTER_EDITABLE_ALPHANUMERIC_FIELD_WITH_THE_LABEL_MY_REFERENCE_FOR_ADDING_THE_RECIPIENTS_BANK_ACCOUNT_DETAILS(String yourReference) throws Throwable {
        bp.Add_Account_No_Text_Field.sendKeys(Keys.PAGE_DOWN);
        cf.waitForElement(bp.Add_My_Reference_Text_Field).sendKeys(yourReference);
        logger.info("Your reference field was filled with the reference");
    }

    public void ENTER_EDITABLE_ALPHANUMERIC_FIELD_WITH_THE_LABEL_MY_REFERENCE_FOR_ADDING_THE_RECIPIENTS_BANK_ACCOUNT_DETAILS_CELLPHONE_NO(String yourReference) throws Throwable {
        cf.waitForElement(bp.Add_My_Reference_Text_Field_Approved).sendKeys(yourReference);
        logger.info("Your reference field was filled with the reference for cellphone no");
    }

    public void ENTER_EDITABLE_TEXT_FIELD_WITH_LABEL_THEIR_REFERENCE(String theirReference) throws Throwable {
        cf.waitForElement(bp.Add_Their_Reference_Text_Field).sendKeys(theirReference);
        logger.info("Their reference field was filled with the reference");
    }

    public void CLICK_BUTTON_WITH_THE_LABEL_ADD_METER_NUMBER() throws Throwable {
        //cf.javaScriptClick(bp.Add_meter_number);
        cf.clickAndTryMultiple(bp.Add_meter_number,20);
        logger.info("Clicked on add meter no");
    }

    public void CLICK_BUTTON_WITH_THE_LABEL_ADD_CREDIT_CARD() throws Throwable {
        cf.waitForElement(bp.Add_Credit_Card_Button).click();
        logger.info("Clicked on credit card no");
    }

    public void ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_CREDIT_CARD_NUMBER_FOR_ADDING_THE_CREDIT_CARD_NUMBER(String creditCardNo) throws Throwable {
        cf.waitForElement(bp.Add_Credit_Card_No).sendKeys(creditCardNo);
        logger.info("Credit card no field was filled with the credit card no");
    }

    public void BELOW_THE_SUCCESS_MESSAGE_I_SHOULD_BE_PRESENTED_WITH_THE_TEXT_AREA_WITH_ALL_THE_FIELD_NAMES_LABELS_AND_THE_VALUES_PROVIDED_DURING_THE_ADD_RECIPIENT_ACTION_IN_THE_PREVIOUS_STEP_BEFORE_SELECTING_THE_SAVE_BUTTON_FOR_ADD_RECIPIENT_FOR_CREDIT_CARD(String creditCardNo) throws Throwable {
        Thread.sleep(2000);
        cf.waitForElement(bp.View_More_Details,300);
        try {
            Thread.sleep(1000);
            cf.javaScriptClick(bp.View_More_Details);
        }catch(Exception e){
            try {
                cf.waitForElement(bp.View_More_Details).click();
            }catch(Exception e1){
                Thread.sleep(1000);
                cf.waitForElement(bp.View_More_Details).click();
            }
        }
        Thread.sleep(1000);
        Assert.assertTrue(bp.View_Meter_Account_No.getText().equals(creditCardNo));

    }

    public void ENTER_EDITABLE_FIELD_WITH_THE_LABEL_YOUR_REFERENCE_FOR_ADDING_THE_CREDIT_CARD_RECIPIENT_MY_REFERENCE(String yourReference) throws Throwable {
        cf.waitForElement(bp.Add_Credit_Card_Your_Reference).sendKeys(yourReference);
        logger.info("Your reference field for credit card was filled");
    }

    public void ENTER_EDITABLE_FIELD_WITH_THE_LABEL_THEIR_REFERENCE_FOR_ADDING_THE_CREDIT_CARD_RECIPIENT_THEIR_REFERENCE(String theirReference) throws Throwable {
        cf.waitForElement(bp.Add_Credit_Card_Their_Reference).sendKeys(theirReference);
        logger.info("Their reference field for credit card was filled");
    }

    public void ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_METER_NUMBER_FOR_ADDING_THE_RECIPIENT_ELECTRICITY_METER_NUMBER(String meterNo) throws Throwable {
        Thread.sleep(1000);
        cf.waitForElement(bp.Add_Meter_No_Text_Field).sendKeys(meterNo);
        logger.info("The meter no field was filled with meter no");
    }

    public void ENTER_EDITABLE_NUMERIC_FIELD_WITH_THE_LABEL_MY_REFERENCE_FOR_ADDING_THE_RECIPIENT_ELECTRICITY_METER_NUMBER(String yourReference) throws Throwable {
        Thread.sleep(1000);
        cf.waitForElement(bp.Add_Meter_No_reference).sendKeys(yourReference);
        logger.info("The meter no field was filled with meter no");
    }

    public void I_SHOULD_BE_ABLE_TO_SEARCH_A_BANK_RECIPIENT_BY_ENTERING_THE_RECIPIENT_NAME_IN_THE_EDITABLE_TEXT_FIELD(String beneficiaryName) throws Throwable {
        try{
            cf.clickAndTryMultiple(bp.Close_Button_Apologies,3);
        }catch(Exception e){

        }
        cf.sendKeysAndTryMultiple(cf.waitForElement(bp.Search_Beneficiary_Text_Field),beneficiaryName,10);
    }

    public void CLICK_ON_THE_RECIPIENT_NAME_TO_OPEN_UP_ITS_DETAILS() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(bp.Search_Result_First_Name),10);
    }

    public void CLICK_ON_EDIT_OR_ADD_DETAILS_LABEL_TO_EDIT_THE_RECIPIENT() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(bp.Edit_Or_Add_Details_Button),10);
    }

    public void CLEAR_THE_EDITABLE_EMAIL_TEXT_FIELD_AND_PUT_ANOTHER_EMAIL(String email) throws Throwable {
        cf.waitForElement(bp.Add_Email_Send_Text).clear();
        cf.sendKeysAndTryMultiple(cf.waitForElement(bp.Add_Email_Send_Text),email,10);
    }

    public void CLEAR_THE_EDITABLE_CELLPHONE_NO_FIELD_AND_PUT_ANOTHER_CELLPHONE_NO(String celllphoneNo) throws Throwable {
        cf.scrollUp();
        cf.waitForElement(bp.Add_Cellphone_No_Text_Field).clear();
        cf.sendKeysAndTryMultiple(cf.waitForElement(bp.Add_Cellphone_No_Text_Field),celllphoneNo,10);
        bp.Add_Cellphone_No_Text_Field.sendKeys(Keys.TAB);
    }

    public void CLEAR_THE_EDITABLE_FAX_NO_FIELD_AND_PUT_ANOTHER_FAX_NO(String faxNo) throws Throwable {
        cf.waitForElement(bp.Add_fax_No_Text_Field).clear();
        cf.sendKeysAndTryMultiple(cf.waitForElement(bp.Add_fax_No_Text_Field),faxNo,10);
    }

    public void CLEAR_THE_BANK_FIELD_AND_PUT_ANOTHER_BANK(String bankName) throws Throwable {
        cf.waitForElement(bp.Add_Bank_Text_Field).clear();
        cf.waitForElement(bp.Add_Bank_Text_Field).sendKeys(bankName);
        cf.waitForElement(driver.findElement(By.xpath("//span[text()='"+bankName+"']"))).click();
        try{
            WebElement element=driver.findElement(By.xpath("//span[text()='"+bankName+"']"));
            cf.actionsClick(element);
        }catch(Exception e){
        }

        if(bankName=="FIRST NATIONAL BANK"){
            cf.waitForElement(bp.Add_Branch_Name).click();
        }
    }

    public void I_SHOULD_BE_ABLE_TO_CLEAR_THE_ACCOUNT_NO_FIELD_AND_PUT_ANOTHER_ACCOUNT_NO(String bankAccount) throws Throwable {
        cf.waitForElement(bp.Add_Account_No_Text_Field).clear();
        cf.waitForElement(bp.Add_Account_No_Text_Field).sendKeys(bankAccount);
    }

    public void THE_YOUR_REFERENCE_FIELD_SHOULD_BE_CLEARED_AND_PUT_ANOTHER_REFERENCE(String yourReference) throws Throwable {
        cf.waitForElement(bp.Add_My_Reference_Text_Field).clear();
        cf.waitForElement(bp.Add_My_Reference_Text_Field).sendKeys(yourReference);
    }

    public void I_SHOULD_BE_ABLE_TO_CLEAR_THE_THEIR_REFERENCE_FIELD_AND_PUT_ANOTHER_REFERENCE(String theirReference) throws Throwable {
        cf.waitForElement(bp.Add_Their_Reference_Text_Field).clear();
        cf.waitForElement(bp.Add_Their_Reference_Text_Field).sendKeys(theirReference);
    }

    public void I_SHOULD_BE_ABLE_TO_SELECT_THE_SAVE_BUTTON_ON_PROVIDING_ALL_MANDATORY_FIELDS() throws Throwable {
        cf.waitForElement(bp.Save_Recipient).click();
        logger.info("Clicked on the save recipient button");
    }

    public void BELOW_THE_SUCCESS_MESSAGE_I_SHOULD_BE_PRESENTED_WITH_THE_TEXT_AREA_WITH_ALL_THE_FIELD_NAMES_LABELS_AND_THE_VALUES_PROVIDED_DURING_THE_ADD_ELECTRICITY_RECIPIENT_ACTION_IN_THE_PREVIOUS_STEP_BEFORE_SELECTING_THE_SAVE_BUTTON(String meterNo) throws Throwable {
        Thread.sleep(2000);
            cf.waitForElement(bp.View_More_Details,300);
            try {
                Thread.sleep(1000);
                cf.javaScriptClick(bp.View_More_Details);
            }catch(Exception e){
                try {
                    cf.waitForElement(bp.View_More_Details).click();
                }catch(Exception e1){
                    Thread.sleep(1000);
                    cf.waitForElement(bp.View_More_Details).click();
                }
        }
        Thread.sleep(1000);
        Assert.assertTrue(bp.View_Meter_Account_No.getText().equals(meterNo));
    }

    public void I_SHOULD_BE_ABLE_TO_SELECT_THE_SAVE_CHANGES_BUTTON_ON_PROVIDING_ALL_MANDATORY_FIELDS() throws Throwable {
        cf.clickAndTryMultiple(cf.waitForElement(bp.Save_Changes),10);
    }

    public void ON_SELECTING_THE_SAVE_BUTTON_I_SHOULD_GET_A_FAILURE_OR_SUCCESS_MESSAGE() throws Throwable {
        boolean c=false;
        try {
            cf.waitForElement(bp.Api_Error_Message,10);
            c=true;
        }catch(Exception e){
            c=false;
        }
        if(c) {
            Assert.assertTrue(bp.Api_Error_Message.getText().equalsIgnoreCase("Success! Your recipient details have been saved."));
            logger.info("Recipient saved with success message");
        }else{
            logger.info("Successfully saved without success message");
        }
    }

    public void BELOW_THE_SUCCESS_MESSAGE_I_SHOULD_BE_PRESENTED_WITH_THE_TEXT_AREA_WITH_ALL_THE_FIELD_NAMES_LABELS_AND_THE_VALUES_PROVIDED_DURING_THE_EDIT_RECIPIENT_ACTION_IN_THE_PREVIOUS_STEP_BEFORE_SELECTING_THE_SAVE_BUTTON(String accountNo) throws Throwable {
        Thread.sleep(2000);
        cf.waitForElement(bp.View_More_Details,300);
        try {
            Thread.sleep(1000);
            cf.javaScriptClick(bp.View_More_Details);
        }catch(Exception e){
            try {
                cf.waitForElement(bp.View_More_Details).click();
            }catch(Exception e1){
                Thread.sleep(1000);
                cf.waitForElement(bp.View_More_Details).click();
            }
        }
        Thread.sleep(1000);
        Assert.assertTrue(bp.Account_No_After_Saving_Edit.getText().contains(accountNo));
    }

    public void I_SHOULD_BE_ABLE_TO_SEARCH_A_MOBILE_RECIPIENT_BY_ENTERING_THE_RECIPIENT_NAME_IN_THE_EDITABLE_TEXT_FIELD(String beneficiaryName) throws Throwable {
        try{
            cf.clickAndTryMultiple(bp.Close_Button_Apologies,3);
        }catch(Exception e){

        }
        cf.sendKeysAndTryMultiple(cf.waitForElement(bp.Search_Beneficiary_Text_Field),beneficiaryName,10);
    }

    public void CLEAR_THE_CELLPHONE_NUMBER_FIELD_AND_PUT_ANOTHER_CELLPHONE_NO_TO_WHICH_PAYMENT_IS_TO_BE_DONE(String mobileNo) throws Throwable {
        cf.waitForElement(bp.Add_Cellphone_No_Text_Field_Recipient).clear();
        cf.waitForElement(bp.Add_Cellphone_No_Text_Field_Recipient).sendKeys(mobileNo);
    }

    public void THE_YOUR_REFERENCE_FIELD_SHOULD_BE_CLEARED_AND_PUT_ANOTHER_REFERENCE_FOR_EDIT_MOBILE_NO(String yourReference) throws Throwable {
        cf.waitForElement(bp.Your_Reference_Mobile_Recipient_Edit).clear();
        cf.sendKeysAndTryMultiple(cf.waitForElement(bp.Your_Reference_Mobile_Recipient_Edit),yourReference,10);
    }

    public void BELOW_THE_SUCCESS_MESSAGE_I_SHOULD_BE_PRESENTED_WITH_THE_TEXT_AREA_WITH_ALL_THE_FIELD_NAMES_LABELS_AND_THE_VALUES_PROVIDED_DURING_THE_EDIT_RECIPIENT_ACTION_IN_THE_PREVIOUS_STEP_BEFORE_SELECTING_THE_SAVE_BUTTON_FOR_MOBILE_RECIPIENT(String mobileNo) throws Throwable {
        Thread.sleep(2000);
        cf.waitForElement(bp.View_More_Details,300);
        try {
            Thread.sleep(1000);
            cf.javaScriptClick(bp.View_More_Details);
        }catch(Exception e){
            try {
                cf.waitForElement(bp.View_More_Details).click();
            }catch(Exception e1){
                Thread.sleep(1000);
                cf.waitForElement(bp.View_More_Details).click();
            }
        }
        Thread.sleep(1000);
        Assert.assertTrue(bp.Mobile_No_After_Saving_Edit.getText().contains(mobileNo));
    }

    public void I_SHOULD_BE_ABLE_TO_SEARCH_A_ELECTRICITY_RECIPIENT_BY_ENTERING_THE_RECIPIENT_NAME_IN_THE_EDITABLE_TEXT_FIELD(String beneficiaryName) throws Throwable {
        try{
            cf.clickAndTryMultiple(bp.Close_Button_Apologies,3);
        }catch(Exception e){

        }
        cf.sendKeysAndTryMultiple(cf.waitForElement(bp.Search_Beneficiary_Text_Field),beneficiaryName,10);
    }

    public void CLEAR_THE_ELECTRICITY_METER_NUMBER_FIELD_AND_PUT_ANOTHER_METER_NO_TO_WHICH_PAYMENT_IS_TO_BE_DONE(String meterNo) throws Throwable {
        cf.waitForElement(bp.Add_Meter_No_Text_Field).clear();
        cf.sendKeysAndTryMultiple(bp.Add_Meter_No_Text_Field,meterNo,10);
    }

    public void BELOW_THE_SUCCESS_MESSAGE_I_SHOULD_BE_PRESENTED_WITH_THE_TEXT_AREA_WITH_ALL_THE_FIELD_NAMES_LABELS_AND_THE_VALUES_PROVIDED_DURING_THE_EDIT_RECIPIENT_ACTION_IN_THE_PREVIOUS_STEP_BEFORE_SELECTING_THE_SAVE_BUTTON_FOR_ELECTRICITY_RECIPIENT(String arg1) throws Throwable {
    }

    public void ON_SELECTING_THE_SAVE_BUTTON_IN_SUCCESS_SCENARIO_THE_APPROVEIT_SERVICE_MUST_BE_INVOKED_ONCE_THE_SAVE_BUTTON_IS_PRESSED_I_SHOULD_BE_PRESENTED_WITH_THE_SUCCESS_MESSAGE_WHICH_READS_RECIPIENT_HAS_BEEN_SAVED_SUCCESSFULLY_ON_THE_RIGHT_INDENTED_SECTION() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    public void BELOW_THE_SUCCESS_MESSAGE_I_SHOULD_BE_PRESENTED_WITH_THE_TEXT_AREA_WITH_ALL_THE_FIELD_NAMES_LABELS_AND_THE_VALUES_PROVIDED_DURING_THE_ADD_RECIPIENT_ACTION_IN_THE_PREVIOUS_STEP_BEFORE_SELECTING_THE_SAVE_BUTTON(String accountNo) throws Throwable {
        Thread.sleep(4000);
        //cf.waitForElement(bp.View_More_Details, 80);
        try {
            Thread.sleep(1000);
            cf.javaScriptClick(bp.View_More_Details);
        } catch (Exception e) {
            try {
                cf.waitForElement(bp.View_More_Details).click();
            } catch (Exception e1) {
                Thread.sleep(1000);
                cf.waitForElement(bp.View_More_Details).click();
            }
        }
        Thread.sleep(1000);
        try {
            Assert.assertTrue(bp.Account_No_After_Saving.getText().contains(accountNo));
        } catch (Exception e) {
            Assert.assertTrue(bp.Account_No_After_Saving2.getText().contains(accountNo));
        }
    }

}
