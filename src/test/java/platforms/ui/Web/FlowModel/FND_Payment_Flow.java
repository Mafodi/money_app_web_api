package platforms.ui.Web.FlowModel;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import platforms.ui.Web.Pages.FND_PaymentPage;
import platforms.ui.Web.StepDefinitions.LoginSteps;
import utils.CommonFunctions;
import utils.Utils;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FND_Payment_Flow extends Utils {
    public FND_PaymentPage payment = PageFactory.initElements(driver, FND_PaymentPage.class);
    public static CommonFunctions wc = PageFactory.initElements(driver, CommonFunctions.class);
    private static Logger logger = Logger.getLogger(FND_Payment_Flow.class);
    WebDriverWait wait = new WebDriverWait(driver, 80);
    LoginSteps login = new LoginSteps();

    public void I_NAVIGATE_TO_THE_PAY_FUNCTION(String strSubMenu) throws InterruptedException {
        //click Pay header menu link
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wc.waitForElement(payment.Pay_Menu_linkText).click();
        Thread.sleep(2000);
        //Check for the How would you like to pay? header on resulting expected page
        String strResult = payment.Payment_Hearder.getText();
        logger.info(strResult);
        Thread.sleep(2000);

        if (strResult.equals("How would you like to pay?")) {
            logger.info("How would you like to pay? screen successfully displayed");
        } else if (strResult.equals("How would you like to pay? screen NOT successfully displayed")) {
            logger.info("How would you like to pay? screen NOT successfully displayed");
            throw new ElementNotVisibleException("How would you like to pay? screen NOT successfully displayed");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Choose the Single/Mutliple Payment sub-menu option since the introduction of the Multiple payments functionality
        switch (strSubMenu) {

            case "Single Payment": {

                payment.Pay_SinglePmtIcon_css.click();
                Thread.sleep(5000);
                strResult = "Single Payment";
                break;
            }
            case "Multiple Payments": {
                payment.Pay_MultiplePmtIcon_css.click();
                Thread.sleep(5000);
                strResult = "Multiple Payments";
                break;
            }
            case "Government Payments": {
                payment.Pay_GovtPmtIcon_css.click();
                Thread.sleep(5000);
                strResult = "Government Payments";
                break;
            }
            default:
        }
    }
    public void REC_I_AM_LOGGED_IN_TO_BANKING_WEB_APP_WITH_USERNAME_AND_PASSWORD(String userName, String password){
        try{
            login.user_launch_prepaid_web_application();
            login.user_enters_username_and_password_from_feature_file(userName, password);
            login.user_clicks_on_Login();
            login.user_must_logon_to_Money_Web_application();


        }catch (Exception error){
            logger.info("Unable to Login due to this error message" + error.getMessage());
        }
    }
    public void I_NAVIGATE_TO_THE_RECIPIENTS_FUNCTION()  {
        try {
            wc.waitForElement(payment.Recipient_Menu_link).click();
            logger.info("Clicked the Recipients link");
            Thread.sleep(2000);
        } catch (Exception error) {
            error.printStackTrace();
            logger.info("the exception thrown is: " + error.getMessage());
        }

    }
    public void I_MUST_BE_ABLE_TO_CAPTURE_THE_RECIPIENT_NAME(String strRecipientName)  {
        try {
            wc.waitForElement(payment.Pay_RecipientName_xpath).sendKeys(strRecipientName);
            payment.Pay_RecipientName_xpath.sendKeys(Keys.TAB);
            logger.info("Entered Recipient Name");
        } catch (Exception error) {
            error.printStackTrace();
            logger.info("the exception thrown is: " + error.getMessage());
        }

    }
    public void I_CLICK_ON_THE_METHOD_OF_PAYMENT_PAY_TO_BANK_ACCOUNT() throws InterruptedException {
        //Click pay to bank account method
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wc.waitForElement(payment.Pay_BankIcon_xpath).click();
        logger.info(("clicked on Credit Icon"));
        Thread.sleep(3000);
    }
    public void I_SHOULD_BE_ABLE_TO_SELECT_PAY_TO_A_CELLPHONE()  {
        //Click pay to mobile method
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wc.waitForElement(payment.Pay_PayMobileIcon_Xpath).click();
        logger.info(("clicked on Cellphone Icon"));
    }
public void I_SHOULD_BE_ABLE_TO_ENTER_THE_RECIPIENTS_MOBILE_NUMBER(String strMobileNo){
        // Enter Mobile Number

    try{
        wc.waitForElement( payment.Mobile_Number_Id).sendKeys(strMobileNo);
        logger.info("Entered Mobile number");
    }
    catch (NoSuchElementException er)
    {
        logger.info("Unable to  enter Mobile Number" + er.getMessage());
        Assert.fail(er.getMessage());
    }
}
    public void ON_THE_PAY_SCREEN_I_SHOULD_SEE_ONE_MORE_OPTION_IN_THE_PAY_OPTIONS_PAY_TO_CREDIT_CARD()  {

        try{
            wc.waitForElement(payment.Credit_card_Xpath).click();
            logger.info(("clicked on Bank Icon"));
        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to  enter Credit card  Number" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void ON_SELECTION_OF_PAY_TO_CREDIT_CARD_I_SHOULD_SEE_ONLY_FIELD_TO_ENTER_CREDIT_CARD_NUMBER(String strCreditNumber) {

        try{
            wc.waitForElement(payment.Credit_card_Number).sendKeys(strCreditNumber);
            logger.info("Entered Credit card  Number");
        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to  enter Credit card  Number" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void AFTER_CLICKING_ON_NEXT_I_SHOULD_BE_ABLE_TO_MOVE_TO_THE_HOW_MUCH_WOULD_LIKE_TO_PAY_SCREEN()  {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String strHowMuch = payment.HowMuch_pay.getText();
        if (strHowMuch.contains("How much would you like to pay?")) {
            logger.info("How much would you like to pay? screen successfully displayed");
        } else {
            logger.info("How much would you like to pay? screen NOT successfully displayed");
            throw new ElementNotVisibleException("How much would you like to pay? screen NOT successfully displayed");
        }
        logger.info("Present screen is   " + strHowMuch);

    }
    public void I_ENTER_BANK_NAME(String strBankName) throws InterruptedException {
        //Enter bank name
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wc.waitForElement(payment.Bank_Input_Xpath).click();
        logger.info("Clicked on Bank Input Field");
        Thread.sleep(1000);

        List<WebElement> BanksList = driver.findElements(By.xpath(payment.BankList_Xpath));
        Thread.sleep(2000);
        for (WebElement lists : BanksList) {
            String innerhtml = lists.getAttribute("innerHTML");
            if (innerhtml.contains(strBankName)) {
                lists.click();
                break;
            }
        }
    }
    public void I_ENTER_ACCOUNT_NO(String AccNumber) {

        try{
            wc.waitForElement(payment.Pay_BankAccNo_id).sendKeys(AccNumber);
            logger.info("Entered Bank account Number");
        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to Entered Bank account Number" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void SELECT_ACCOUNT_TYPE(String AccType)  {

        if (!AccType.equals("")) {
            try {
                wc.selectDropDownValue(payment.Account_Type_xpath, payment.Account_list_xpath, AccType);

            } catch (NoSuchElementException | InterruptedException er) {
                logger.error("Unable to capture recipient name" + er.getMessage());
                Assert.fail(er.getMessage());
            }
        }
    }
    public void I_SHOULD_CLICK_ON_THE_BANK_APPROVED_BENEFICIARIES_AND_IT_WILL_TAKE_TO_NEXT_SCREEN_WITH_VIEW_ALL_LIST  () {
        try {
            wc.waitForElement(payment.Recipient__Search).click();
        } catch (Exception error) {
            error.printStackTrace();
            logger.info("the exception thrown is: " + error.getMessage());
        }
        logger.info("Recipient list clicked");
    }
    public void SHOULD_SEARCH_BY_NAME_OR_MOBILE_NUMBER_OR_ACCOUNT_NO_AND_RECORDS_WILL_AUTO_FILTER_BASED_ON_CHARACTERS_INPUTTED
            (String strRecipientType, String strRecipient) throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (strRecipientType.equals("My recipients")) {
            payment.My_Recipients.click();

        } else if (strRecipientType.equals("Bank-approved")) {
            payment.Bank_Approved_Recipients.click();

        } else {
            payment.My_Recipients.click();
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        payment.Recipient_Search.sendKeys(strRecipient);
    }

    public void I_SHOULD_BE_ABLE_TO_SELECT_FROM_MY_LIST_OF_BENEFICIARIES(String StrRecipient){
          try {
        wc.waitForElement(payment.Selec_Beneficiary_Xpath).click();
        logger.info("Selected beneficiary clicked");

    }
    catch (NoSuchElementException er)
    {
        logger.info("Unable to Select beneficiary clicked" + er.getMessage());
        Assert.fail(er.getMessage());
    }
}
    public void I_SHOULD_BE_ABLE_TO_SEE_THE_NEXT_STEPS_HEADER() {
        wc.javaScriptClick(wc.waitForElement(payment.next));
        logger.info("Clicked on Next Button");

    }
    public void HOW_MUCH_WOULD_YOU_LIKE_TO_PAY_SCREEN_VALIDATION()  {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String strHowMuch = payment.HowMuch_pay.getText();
        if (strHowMuch.contains("How much would you like to pay?")) {
            logger.info("How much would you like to pay? screen successfully displayed");
            logger.info("Present screen is   " + strHowMuch);
        } else {
            logger.info("How much would you like to pay? screen NOT successfully displayed");
        }

    }
    public void PB_I_WANT_TO_CAPTURE_THE_AMOUNT(String amount) throws InterruptedException {
        Thread.sleep(3000);
        try {
          payment.Enter_Amount_Id.clear();
            payment.Enter_Amount_Id.sendKeys(amount);
            logger.info("Amount Entered");
            System.out.println("amount entered");

        } catch (Exception error) {
            error.printStackTrace();
            logger.error("the exception thrown is: " + error.getMessage());
        }

    }
    public void WHEN_I_WHEN_I_CLICK_ON_THE_INSTANT_PAYMENT_TOGGLE_I_MUST_SEE_THE_INSTANT_PAYMENT_MESSAGE()  {
        try {
            wc.waitForElement(payment.Instant_Slider_Xpath).isSelected();
            payment.Instant_Slider_Xpath.click();
            logger.info("Instant Slider selected");
        }
        catch (NoSuchElementException err)
        {
            logger.info("Unable to Select Instant Slider" + err.getMessage());
            Assert.fail(err.getMessage());
        }
    }
    public void IF_IT_INSTANT_PAYMENT_THEN_SHOW_TEXT_INSTANT_PAYMENT_IN_THE_DATE_FIELD_ELSE_SHOW_ONLY_THE_DATE()  {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String InstantDateVerify = payment.Instant_PayDate_Xpath.getAttribute("value");

        if (InstantDateVerify.equalsIgnoreCase("Instant Payment")) {
            logger.info("The Paydate is " + InstantDateVerify);
        } else {
            logger.info("The Payment is NOT INSTANT PAYMENT ");
        }

    }
    public void PB_I_SHOULD_BE_ABLE_TO_SELECT_ACCOUNT(String strAccount)  {
        try {
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            wc.selectDropDownValue(payment.Account_from_Xpath, payment.Account_List_Xpath, strAccount);

        } catch (NoSuchElementException | InterruptedException er) {
            logger.info("Unable to capture recipient name" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void NEXT_BUTTON_CLICK_WITH_OUT_ERRORS(String St2Done) {
        try {
            wc.scrollUp();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            wc.javaScriptClick(wc.waitForElement(payment.Amount_Next_ID));
            logger.info("Clicked on Next Button to Proceed Further");
        }
        catch (NoSuchElementException err)
        {
            logger.info("Unable to Click on Next Button to Proceed Further" + err.getMessage());
            Assert.fail(err.getMessage());
        }
    }
    public void I_ENTER_YOUR_REFERENCE(String strYourRef)  {
        try{
            wc.waitForElement(payment.Your_Reff_id).clear();
        payment.Your_Reff_id.sendKeys(strYourRef);
        logger.info("Entered Your reference");
       }
       catch (NoSuchElementException  err)
       {
           logger.info("Unable enter your reference" + err.getMessage());
           Assert.fail(err.getMessage());
       }
    }
    public void I_ENTER_THEIR_REFERENCE(String strTheirRef) {
        try{
            wc.waitForElement(payment.Their_Reff_id).clear();
        payment.Their_Reff_id.sendKeys(strTheirRef);
        logger.info("Entered Your reference");
         }
        catch (NoSuchElementException  err)
        {
            logger.info("Unable to navigate to next screen" + err.getMessage());
            Assert.fail(err.getMessage());
        }
    }
    public void I_CHOOSE_THE_NOTIFICATION_METHOD(String strNotificationMethod)  {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        payment.Notification_click_Xpath.click();
        if (strNotificationMethod.equalsIgnoreCase("Email")) {
            payment.Notifi_Email_Select_Xpath.click();

        } else if (strNotificationMethod.equalsIgnoreCase("Fax")) {
            payment.Notifi_Fax_Select_Xpath.click();

        } else if (strNotificationMethod.equalsIgnoreCase("SMS")) {
            payment.Notifi_SMS_Select_Xpath.click();
        } else {
            payment.Notifi_NONE_Select_Xpath.click();
        }

    }
    public void NOTIFICATION_VALUE_TO_THE_APPROPRIATE_METHOD(String strNotificationValue, String
            strNotificationMethod) throws InterruptedException {
        Thread.sleep(1000);
        if (!strNotificationValue.equals("")) {
            Thread.sleep(1000);
            if (strNotificationMethod.equalsIgnoreCase("Email") || strNotificationMethod.equalsIgnoreCase("SMS")) {
                //Enter Email or SMS notification value
                payment.Notifi_Input_Id.clear();
                payment.Notifi_Input_Id.sendKeys(strNotificationValue);
                payment.Notifi_Input_Id.sendKeys(Keys.TAB);

            } else if (strNotificationMethod.equalsIgnoreCase("Fax")) {
                //Enter Fax notification value
                payment.Fax_Notifi_Input_Id.clear();
                payment.Fax_Notifi_Input_Id.sendKeys(strNotificationValue);
            } else {
                logger.info("No  Notification");
            }
            logger.info("Sent  Notification");
        }
    }
    public void I_MUST_SELECT_OPTION_PAY() {
        try {
            wc.waitForElement(payment.Pay_Button_Id).click();
            logger.info("Clicked on the Pay Button");
        }
        catch (NoSuchElementException err)
        {
            logger.info("Unable to click on the pay button" + err.getMessage());
            Assert.fail(err.getMessage());
        }
    }
    public void I_CLICK_ON_THE_NEXT_BUTTON()  {
        wc.waitForElement(payment.Button_next_xpath);
        if (payment.Button_next_xpath.isDisplayed()) {
            payment.Button_next_xpath.click();
        }
    }
    public void I_SHOULD_BE_ABLE_TO_SEE_PAYMENT_FROM_ACCOUNT_TYPE(String strAccountType)
            {
        wc.waitForElement(payment.Pay_Account_Type_Vefify);
        String Account_Name = payment.Pay_Account_Type_Vefify.getText();

        if (strAccountType.equals(Account_Name)) {
            logger.info("Account Name Is   " + Account_Name);

        } else {
            logger.error("Account Name not displayed");
        }
    }
    public void I_SHOULD_BE_ABLE_TO_SEE_PAYMENT_YOUR_REFERENCE(String strYourReff)
            {
           wc.scrollUp();
        String Your_Reff = wc.waitForElement(payment.Pay_Reff_varify).getText();
        if (strYourReff.equals(Your_Reff)) {
            logger.info("Payment Reference  " + Your_Reff);
        } else {
            logger.error("I should not able to see your payment reference");
        }
    }
    public void SAVE_BENEFICIARY_OPTION_SHOULD_BE_TURNED_OFF() {
        wc.waitForElement(payment.Reci_save_slider_Xpath).isSelected();
        payment.Reci_save_slider_Xpath.click();
        logger.info("Instant Slider selected");
    }

    public void I_SHOULD_BE_ABLE_TO_CLICK_ON_PAY_TO_CONFIRM_PAYMENT()  {
        wc.scrollUp();
        wc.scrollUp();
        wc.javaScriptClick(wc.waitForElement(payment.Pay_button));
        logger.info("Clicked on Pay confirm Button");
    }
    public void I_SHOULD_SEE_CONFORMATION_SO_THAT_I_KNOW_PAYMENT_IS_DONE() {

        try {
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            String Pay_conformation = payment.Pay_Confor_xpath.getText();
            if (Pay_conformation.equalsIgnoreCase("Payment scheduled")) {
                logger.info("Payment conformation message is :  " + Pay_conformation);
            } else {
                logger.info("Payment Conformation Failed");
                Assert.fail(Pay_conformation);
            }
        }
        catch(NoSuchElementException er)
            {
                logger.info("Unable to navigate to next screen" + er.getMessage());
                Assert.fail(er.getMessage());
            }
        }
    public void  RPT_I_SHOULD_SEE_CONFORMATION_SO_THAT_I_KNOW_PAYMENT_IS_DONE()  {

        try {
            wc.waitForElement(payment.Pay_Confor1_xpath);
            String Pay_conformation = payment.Pay_Confor1_xpath.getText();
            if (Pay_conformation.equalsIgnoreCase("Payment successful.")) {
                logger.info("Payment conformation message is :  " + Pay_conformation);

            } else {
                logger.info("Payment Conformation Failed");
                Assert.fail(Pay_conformation);
            }
        }
        catch(NoSuchElementException er)
        {
            logger.info("Unable to navigate to next screen" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public void RPT_I_MUST_ABLE_TO_SEE_RECIPIENT_DETAILS(String strRecipient) throws InterruptedException {

        Thread.sleep(2000);
        String Reci_confor1 = payment.Recepient_name.getText();

        if (strRecipient.equals(Reci_confor1)) {
            logger.info("Recipient Name   " + Reci_confor1);

        } else {
            logger.error("I should not able to see  recipient details");
        }
    }
    public void P_B_I_MUST_ABLE_TO_SEE_RECIPIENT_DETAILS(String strRecipient)  {

        String Reci_confor = payment.Reci_Confo_Details_xpath.getText();
        if (strRecipient.equals(Reci_confor)) {
            logger.info("Recipient Name   " + Reci_confor);
        } else {
            logger.error("I should not able to see  recipient details");
        }
    }
    public void RPT_i_MUST_ABLE_TO_SEE_RECIPIENT_DETAILS(String strRecipient){
        String Reci_confor = payment.Rpt_REC_Conf_details_Xpath.getText();


        if (strRecipient.equals(Reci_confor)) {
            logger.info("Recipient Name   " + Reci_confor);
        } else {
            logger.error("I should not able to see  recipient details");
        }
    }
    public void I_MUST_ABLE_TO_SEE_RECIPIENT_MOBILE_DETAILS(String strRecipient)  {

        String Reci_confor1 = payment.Reci_Confo_Details_xpath1.getText();

        if (strRecipient.equals(Reci_confor1)) {
            logger.info("Recipient Name   " + Reci_confor1);
        } else {
            logger.error("I should not able to see  recipient details");

        }
    }
    public void I_MUST_ABLE_TO_SEE_PAYMENT_AMOUNT()  {
       wc.waitForElement(payment.Amount_confor_xpath);
        if (payment.Amount_confor_xpath.isDisplayed()) {
            String Amount_confor = payment.Amount_confor_xpath.getText();
            logger.info("Transfering Amount:   " + Amount_confor);
        } else {
            logger.info("Recipient Conformation details  not displayed");
        }
    }
    public void RPT_I_MUST_ABLE_TO_SEE_PAYMENT_AMOUNT(String amount)  {
        wc.waitForElement(payment.RPT_Amount_xpath);
        if (payment.RPT_Amount_xpath.isDisplayed()) {
            String Amount_confor1 = payment.RPT_Amount_xpath.getText();
            logger.info("Transfering Amount:   " + Amount_confor1);

        } else {
            logger.info("Amount details are not displayed");
        }
    }
    public void RPT_I_MUST_BE_ABLE_TO_SEE_THE_BANK_NAME_AND_ACCOUNT_NUMBER_IN_THE_BANK_LINE()  {
         wc.waitForElement(payment.Rpt_Bank__details_Xpath);
        if (payment.Rpt_Bank__details_Xpath.isDisplayed()) {
            String Bank_details =payment.Rpt_Bank__details_Xpath.getText();
            logger.info("Recepient Bank Details are  :  " + Bank_details);
        } else {
            logger.info("Recepient Bank Details details  not displayed");
        }
    }
    public void RPT_I_MUST_BE_ABLE_TO_SEE_TRANSACTION_NUMBER_DISPLAYED() {
            wc.waitForElement(payment.Transc_confor1_xpath);
        if (payment.Transc_confor1_xpath.isDisplayed()) {
            String Trans_confor = payment.Transc_confor1_xpath.getText();
            logger.info("Transaction Number is :  " + Trans_confor);
        } else {
            logger.info("Recipient Conformation details  not displayed");
        }
    }
    public void I_MUST_ABLE_TO_SEE_TRANSACTION_NUMBER()  {
       wc.waitForElement(payment.Transc_confor_xpath);
        if (payment.Transc_confor_xpath.isDisplayed()) {
            String Trans_confor = payment.Transc_confor_xpath.getText();
            logger.info("Transaction Number is :  " + Trans_confor);

        } else {
            logger.info("Recipient Conformation details  not displayed");
        }
    }
    public void I_MUST_ABLE_TO_SEE_PAYMENT_DATE()  {
        wc.waitForElement(payment.Payment_Date_confo_xpath);
        if (payment.Payment_Date_confo_xpath.isDisplayed()) {
            String Payment_date = payment.Payment_Date_confo_xpath.getText();
            logger.info("Payment Date is:  " + Payment_date);
        }
    }
    public void RPT_I_MUST_ABLE_TO_SEE_PAYMENT_DATE() {
        if (payment.Rpt_Pay_Date_confo_xpath.isDisplayed()) {
            String Payment_date = payment.Rpt_Pay_Date_confo_xpath.getText();
            logger.info("Payment Date is:  " + Payment_date);
        }
    }
    public void I_SHOULD_BE_ABLE_TO_SEE_TWO_BUTTONS_NEW_PAYMENT_AND_GO_TO_OVERVIEW()  {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if (payment.NewPayment_Xpath.isDisplayed() && payment.Go_To_Overview_Xpath.isDisplayed()) {

            logger.info("Both Buttons are visible"   );
        }
    }
    public void CLICKING_ON_NEW_PAYEMENT_OR_GO_TO_OVERVIEW_SHOULD_TAKE_ME_BACK_TO_THE_FIRST_SCREEN_OF_PAYMENT(String EndPmtChoice) throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (!EndPmtChoice.equals("")) {
            String NewPayment = payment.NewPayment_Xpath.getText();
            String Overview = payment.Go_To_Overview_Xpath.getText();

            if (EndPmtChoice.equalsIgnoreCase(NewPayment)) {
                payment.NewPayment_Xpath.click();
                logger.info("Clicked on  New Payment Button");
                Thread.sleep(1000);
                String NewpayVerifyScreen = payment.NewPayment_Click_verify.getText();
                logger.info("End Payment  Screen is   " + NewpayVerifyScreen);
                Thread.sleep(2000);
            } else if (EndPmtChoice.equalsIgnoreCase(Overview)) {
                payment.Go_To_Overview_Xpath.click();
                logger.info("Clicked on  Overview Button");
                Thread.sleep(1000);
                String OviewVerify = payment.Overview_linkText.getText();
                logger.info("End Payment  Screen is   " + OviewVerify);
            } else {
                logger.info(" No End Payment option selected");
            }
            Thread.sleep(3000);

        }
    }
    public void I_SHOULD_BE_ABLE_TO_SEE_NEW_PAYMENT_OVERVIEW_BUTTONS_WHEN_CLICKED_OVERVIEW_SHOULD_TAKE_ME_FIRST_SCREEN_OF_PAYMENT
            () throws InterruptedException {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (payment.New_payment_ID.isDisplayed() && payment.Overview_xpath.isDisplayed()) {
            payment.Overview_xpath.click();
            logger.info("Both Buttons are visible and Clicked on Overview Button");

        } else {
            logger.info("Buttons are not visible");
        }
        wc.waitForElement(payment.Overview_linkText).isDisplayed();
        logger.info("OverView dashboard visible");

        Thread.sleep(1000);

    }
    public void I_CAN_SEARCH_FOR_DESIRED_BENEFICIARY(String strRecipientType, String strRecipient) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if (!strRecipientType.equals(""))
            if (strRecipientType.equalsIgnoreCase("My recipients")) {
                payment.My_Recipients.click();
            } else {
                payment.Bank_Approved_Recipients.click();
            }
        Thread.sleep(2000);
        wc.waitForElement(payment.Recipient_Search).sendKeys(strRecipient);
        logger.info("Entered Recipient Details based on the NO recipient Type ");

    }
    public void I_SHOULD_BE_ABLE_TO_SELECT_BENEFICIARY_OF_MY_PREFERENCE_FROM_THE_LIST_OF_BENEFICIARY_LISTED_UNDER_MY_RECIPIENT
            ()  {
        try {
            wc.waitForElement(payment.Recipient_Select_Xpath).click();
            logger.info("Clicked on the Selected Beneficiary");
           }
        catch (NoSuchElementException err)
            {
                logger.info(" Not Clicked on the Selected Beneficiary" + err.getMessage());
                Assert.fail(err.getMessage());
            }
        }

    public void ON_SELECTING_BENEFICIARY_OF_MY_PREFERENCE_RIGHT_SIDE_OF_THE_PAGE_SELECT_THE_OPTION_TO_REPEAT_LAST_PAYMENTS_MADE_TO_RECIPIENT_PAY_AGAIN
            () {
        try {
            wc.scrollToElement(payment.getRecip_PayAgain_xpath);
           wc.javaScriptClick(wc.waitForElement(payment.getRecip_PayAgain_xpath));
            logger.info("Clicked on Pay pay again ");
        }
        catch (NoSuchElementException err)
        {
            logger.info(" Not able to find find an element and clicked" + err.getMessage());
            Assert.fail(err.getMessage());
        }
    }
    public void RPT_IF_I_SELECT_THIS_OPTION_I_AM_ABLE_TO_STEP_ONE_OF_REVIEW_PAYMENT_DETAILS()  {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String strReview = payment.Payment_review_Xpath.getText();
        if (strReview.contains("Payment Review")) {
            logger.info("Payment Review screen displayed");
        } else {
            logger.info("Payment Review screen displayed? screen NOT successfully displayed");
            throw new ElementNotVisibleException("Payment Review screen displayed screen NOT successfully displayed");
        }
    }
    public void RPT_THE_DETAILS_ARE_EXACTLY_AS_THE_PAYMENT_I_AM_REPEATING(String strRecepient) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String Recepient_confor = payment.Recepient_details.getText();
        if (strRecepient.equalsIgnoreCase(Recepient_confor)) {
            logger.info("Recipient name for the repeat payment is  " + Recepient_confor);
        }
    }
    public void RPT_I_CAN_VIEW_BUT_CANT_EDIT_THE_RECEPIENT_BANK_PAYMENT_DATE() {
        if (payment.Pay_Bank_Details.isDisplayed() && payment.Pay_Date_Xpath.isDisplayed()) {
            String BankDetails = payment.Pay_Bank_Details.getText();
            String Paydate = payment.Pay_Date_Xpath.getText();
            logger.info("Recipient bank Name and Account Number are  " + BankDetails + "Payment date   " + Paydate);
        } else {
            logger.info("Recepient bank and Payment date details are not displayed ");
        }
    }
     public void RPT_I_MUST_SELECT_OPTION_CANCEL_OR_OPTION_GO_BACK_TO_CANCEL_THE_PAYMENT_AND_RETURN_TO_THE_RECIPIENT_VIEW(){
            driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
         try {
                 if (payment.Go_back_xpath.isDisplayed() && payment.Float_cross_xpath.isDisplayed()) {
                     Thread.sleep(2000);
                     payment.Float_cross_xpath.click();
                     logger.info("GO Back and Float cross are displayed");
                     Thread.sleep(2000);
                     String Screen=payment.Recipient_Menu_link.getText();
                         logger.info("After clicking the cancel button the screen is  "+ Screen);
                     }
                 else {
                     logger.info("GO Back and Float cross are not displayed");
                 }
                 }
         catch(NoSuchElementException | InterruptedException er)
                 {
                     logger.info("GO Back and Float cross are not displayed" + er.getMessage());
                     Assert.fail(er.getMessage());
                 }
             }

      //  @DeleteBeneficiary Methods

    public void I_CAN_SEARCH_FOR_DESIRED_BENEFICIARY_TO_DELETE(String strRecipientTpye, String strRecipient) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (strRecipientTpye.equals("My recipients")) {
            payment.My_Recipients.click();
            logger.info("Entered Recipient Details based on the My recipients Type ");

        } else if (strRecipientTpye.equals("Bank-approved")) {
            payment.Bank_Approved_Recipients.click();
            logger.info("Entered Recipient Details based on the Bank-Approved Type ");

        } else {
          payment.My_Recipients.click();
        }
        Thread.sleep(1000);
        wc.waitForElement(payment.Recipient_Search).sendKeys(strRecipient);
        logger.info("Entered Recipient Details based on the NO recipient Type ");

    }

    public void I_SHOULD_BE_ABLE_TO_SELECT_A_BENEFICIARY_OF_MY_PREFERENCE_FROM_THE_LIST_OF_BENEFICIARY_LISTED_UNDER_MY_RECIPIENT
            ()  {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wc.waitForElement(payment.Recipient_Select_Xpath).click();
        logger.info("Clicked on the Selected Beneficiary");
    }

    public void ON_SELECTING_A_BENEFICIARY_OF_MY_PREFERENCE_THE_RIGHT_SIDE_OF_THE_PAGE_I_HAVE_THE_OPTION_TO_EDIT_OR_ADD_DETAILS
            ()  {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        payment.Recepient_Edit_Add_Xpath.click();
        logger.info("Clicked on Recipient's edit and add details");
    }

    public void I_SHOULD_BE_ABLE_TO_SEE_AN_OPTION_TO_DELETE_RECIPIENT_BUTTON_AND_SELECT_TO_DELETE(){
        //Click Delete button to delete
        wc.javaScriptClick(wc.waitForElement(payment.Recep_Delete_Butttton_Id));
            logger.info("Delete  Confirm Button clicked");

        }
    public void I_SHOULD_BE_BE_TO_CONFIRM_DELETE_OPTION_OR_CANCEL_BUTTONS_AND_SELECT_ONE_AMONG_THEM()
           {
        if (payment.Delete_Confirm_Button_Xpath.isDisplayed() && payment.Delete_Can_Button_Id.isDisplayed()) {
            payment.Delete_Can_Button_Id.click();
            logger.info("Both Buttons are visible and Clicked on Cancel Button");
        } else {
            logger.info("Buttons are not visible");
        }
        payment.Overview_linkText.isDisplayed();
        logger.info("Overview is displayed");
    }
    public void I_SHOULD_CONFIRM_BENEFICIARY_DELETE() {
        try {
            wc.waitForElement(payment.Confirm_delete).click();
            logger.info("User can confirm delete");

        }catch (NoSuchElementException er)
        {
            logger.info("Unable confirm delete" + er.getMessage());
            Assert.fail(er.getMessage());
        }
    }
    public  void I_SHOULD_GET_SUCCESS_MESSAGE_AFTER_DELETED(){
        wc.waitForElement(payment.Success_Message_After_Delete);
        org.junit.Assert.assertTrue(payment.Success_Message_After_Delete.getText().contains("Success! The recipient has been deleted."));

    }

  // Future Dated payments flow methods
 public void I_SHOULD_BE_ABLE_TO_SELECT_THE_FUTURE_DATE()  {
        wc.scrollUp();
        try{
            wc.waitForElement(payment.Calender_Icon_Xpath).click();
            logger.info("clicked on calender icon");
            wc.waitForElement(payment.Calender_Next_Month_Xpath).click();
            logger.info("clicked on calender next month icon");
            wc.waitForElement(payment.Next_Month_Date_Xpath).click();
            logger.info("clicked Next month on 02 date");
            String date=payment.Date_Input_xpath.getAttribute("value");
            logger.info("Selected Future date is   "+date);

        }
        catch (NoSuchElementException er)
        {
            logger.info("Unable to get the future date" + er.getMessage());
            Assert.fail(er.getMessage());
        }
 }
public void I_SHOULD_BE_ABLE_TO_SELECT_REPEAT_PAYMENT_OPTION(String Repeat_Option){

    try {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wc.javaScriptClick(wc.waitForElement(payment.Repeat_Options));
        String Recurring_option1 = wc.waitForElement(payment.Repeat_Option_Weekly).getText();
       // String Recurring_option2 = wc.waitForElement(payment.Repeat_Option_Monthly).getText();
        if (Recurring_option1.equalsIgnoreCase(Repeat_Option)) {
            wc.javaScriptClick(wc.waitForElement(payment.Repeat_Option_Weekly));
        }
        else{

            wc.javaScriptClick(wc.waitForElement(payment.Repeat_Option_Monthly));
        }

    } catch (NoSuchElementException  er) {
        logger.info("Unable to click on weekly date option" + er.getMessage());
        Assert.fail(er.getMessage());
    }
}
  public void I_SHOULD_ABLE_TO_CLICK_ON_OCCURRENCES_AND_ENTER_NUMBER_OF_OCCURRENCES(String Occurrences)  {

      try {
          driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          payment.Occure_Option.click();
          wc.waitForElement(payment.Occure_Option).click();
          payment.Occure_Number.sendKeys(Occurrences);
      } catch (NoSuchElementException er) {
          logger.info("Unable to click on weekly Occurrences  option" + er.getMessage());
          Assert.fail(er.getMessage());
      }
  }

    }





