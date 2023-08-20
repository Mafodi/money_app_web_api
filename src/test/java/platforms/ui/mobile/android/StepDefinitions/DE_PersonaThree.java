package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidEnrolmentScreens;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import utils.CommonFunctions;
import utils.DriverFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class DE_PersonaThree extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(DE_Create_NedID.class);


    @And("^P3_User enter SA ID eti$")
    public void p_UserEnterSAIDEti() {

    }

    @And("^P3_User enters a profile number \"([^\"]*)\", pin \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void p_UserEntersAProfileNumberPinAndPassword(String PROFILENUMBER, String PIN, String PASSWORD) throws Throwable {

        try {
            driver.findElement(By.id(AndroidEnrolmentScreens.NID_USERNAME_TXT)).sendKeys(dataFactory.P3_NED_USERNAME);
            basepage.hideKeyBoard();

            MobileElement NextButton = driver.findElement(By.xpath(AndroidEnrolmentScreens.BTN_NEXT));
            common.secondsDelay(1);
            if (NextButton.isDisplayed()) {
                NextButton.click();
            }

            driver.findElement(By.id(AndroidEnrolmentScreens.NID_PASSWORD_TXT)).sendKeys(dataFactory.P3_NED_PASSWORD);
            basepage.hideKeyBoard();

            common.secondsDelay(1);
            if (NextButton.isDisplayed()) {
                NextButton.click();
            }
        }catch (Exception e){
            log.info("Failed to enter username and password:" + e.getMessage());
        }

    }



    @When("^Persona_three_user enters a username \"([^\"]*)\" ,and passwords \"([^\"]*)\"$")
    public void persona_three_userEntersAUsernameAndPasswords(String NEDUSERNAME, String NEDPASWORD) throws Throwable {

        try {
            driver.findElement(By.id(AndroidEnrolmentScreens.NED_USERNAME)).sendKeys(dataFactory.P3_NED_USERNAME);
            basepage.hideKeyBoard();
            driver.findElement(By.xpath(AndroidEnrolmentScreens.NED_PASSWORD)).sendKeys(dataFactory.P3_NED_PASSWORD);
            basepage.hideKeyBoard();


            driver.findElement(By.id(AndroidEnrolmentScreens.ACCEPTTerm)).click();
            driver.findElement(By.xpath(AndroidEnrolmentScreens.NEXT_LOGIN)).click();

            //wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)));

            MobileElement NextButton = driver.findElement(By.xpath(AndroidEnrolmentScreens.BTN_NEXT));
            common.secondsDelay(3);
            if (NextButton.isDisplayed()) {
                NextButton.click();
            }
            //driver.findElement(By.id(AndroidEnrolmentScreens.ENROLMENT_CANCEL_CREATE_PIN)).click();
        }catch (Exception e){
            log.info("Failed to enter username and password:" + e.getMessage());
        }

        common.secondsDelay(10);

    }

    @And("^Persona_three_User enter forgot username$")
    public void persona_three_userEnter_Forgot_Username() throws Throwable {

        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.F_DETAILS)));

            MobileElement NeedHelp = driver.findElement(By.id(AndroidEnrolmentScreens.F_DETAILS));
            common.secondsDelay(1);
            if (NeedHelp.isDisplayed()) {
                NeedHelp.click();
            }
        } catch (Exception e) {
            log.info("Failed to click next button:" + e.getMessage());

        }


        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.F_PASSWORD)));

            MobileElement F_pass = driver.findElement(By.id(AndroidEnrolmentScreens.F_PASSWORD));
            common.secondsDelay(1);
            if (F_pass.isDisplayed()) {
                F_pass.click();
            }
        } catch (Exception e) {
            log.info("Failed to click next button:" + e.getMessage());

        }


        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.F_USERNAME)));
            driver.findElement(By.id(AndroidEnrolmentScreens.F_USERNAME)).sendKeys(dataFactory.P3_NED_USERNAME);
            basepage.hideKeyBoard();

        } catch (Exception e) {
            log.info("Failed to click next button:" + e.getMessage());

        }

        driver.findElement(By.id(AndroidEnrolmentScreens.F_NEXT)).click();

    }

    @And("^Persona_three_User enter forgot password$")
    public void persona_three_userEnter_Forgot_Password() throws Throwable{

        wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.F_CREATE_PASSWORD)));
        try {
            driver.findElement(By.id(AndroidEnrolmentScreens.F_CREATE_PASSWORD)).clear();
            driver.findElement(By.id(AndroidEnrolmentScreens.F_CREATE_PASSWORD)).sendKeys(dataFactory.P3_NED_PASSWORD);
            basepage.hideKeyBoard();


            driver.findElement(By.id(AndroidEnrolmentScreens.F_CHANGE)).click();
        } catch (Exception e) {
            log.info("Failed to click next button:" + e.getMessage());

        }

        common.secondsDelay(10);
        wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.F_GO_TO_LOGIN)));
        driver.findElement(By.id(AndroidEnrolmentScreens.F_GO_TO_LOGIN)).click();
    }

    @And("^User clicks on accout summary$")
    public void userClicksOnAccoutSummary() {
        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_ACC_SUMMARY)));
            MobileElement AccSummary = driver.findElement(By.id(AndroidEnrolmentScreens.P3_ACC_SUMMARY));
            common.secondsDelay(1);
            if (AccSummary.isDisplayed()) {
                AccSummary.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @And("^User click on the tabs$")
    public void userClickOnTheTabs() {

        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_DETAILS_TAB)));
            MobileElement Details = driver.findElement(By.id(AndroidEnrolmentScreens.P3_DETAILS_TAB));
            common.secondsDelay(1);
            if (Details.isDisplayed()) {
                Details.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @And("^User clicks on feature menu$")
    public void userClicksOnFeatureMenu() {

        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_FEATURES_MENU)));
            MobileElement featureMenu = driver.findElement(By.id(AndroidEnrolmentScreens.P3_FEATURES_MENU));
            common.secondsDelay(1);
            if (featureMenu.isDisplayed()) {
                featureMenu.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @And("^User selects get setlement quote$")
    public void userSelectsGetSetlementQuote() throws Throwable{

        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_GET_QOUTE)));
            MobileElement getQoute = driver.findElement(By.id(AndroidEnrolmentScreens.P3_GET_QOUTE));
            common.secondsDelay(1);
            if (getQoute.isDisplayed()) {
                getQoute.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        Thread.sleep(10);
        driver.findElement(By.xpath(AndroidEnrolmentScreens.P3_BACK_BTN)).click();
    }

    @And("^User selects share account info$")
    public void userSelectsShareAccountInfo() throws Throwable{

        Thread.sleep(10);
        /*
                FEATURE MENU
         */
        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_FEATURES_MENU)));
            MobileElement featureMenu = driver.findElement(By.id(AndroidEnrolmentScreens.P3_FEATURES_MENU));
            common.secondsDelay(1);
            if (featureMenu.isDisplayed()) {
                featureMenu.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        /*
                FEATURE MENU
         */
        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_SHARE_ACC_INFO)));
            MobileElement shareAccInfo = driver.findElement(By.id(AndroidEnrolmentScreens.P3_SHARE_ACC_INFO));
            common.secondsDelay(1);
            if (shareAccInfo.isDisplayed()) {
                shareAccInfo.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(AndroidEnrolmentScreens.P3_BACK_BTN)).click();
    }

    @And("^User selects view payment details$")
    public void userSelectsViewPaymentDetails() throws Throwable {

        Thread.sleep(10);
        /*
                FEATURE MENU
         */
        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_FEATURES_MENU)));
            MobileElement featureMenu = driver.findElement(By.id(AndroidEnrolmentScreens.P3_FEATURES_MENU));
            common.secondsDelay(1);
            if (featureMenu.isDisplayed()) {
                featureMenu.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        /*
                FEATURE MENU
         */

        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_VIEW_PAYMENTS)));
            MobileElement paymentDetails = driver.findElement(By.id(AndroidEnrolmentScreens.P3_VIEW_PAYMENTS));
            common.secondsDelay(1);
            if (paymentDetails.isDisplayed()) {
                paymentDetails.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(AndroidEnrolmentScreens.P3_BACK_BTN)).click();

        common.secondsDelay(3);
        driver.findElement(By.xpath(AndroidEnrolmentScreens.P3_BACK_BTN)).click();
    }

    @And("^User clicks on home menu$")
    public void userClicksOnHomeMenu() throws Throwable{

        Thread.sleep(10);
        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_HOME_MENU)));
            MobileElement homeMenu = driver.findElement(By.id(AndroidEnrolmentScreens.P3_HOME_MENU));
            common.secondsDelay(1);
            if (homeMenu.isDisplayed()) {
                homeMenu.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @And("^User clicks on notifications$")
    public void userClicksOnNotifications() {
        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_NOTIFICATIONS)));
            MobileElement notifications = driver.findElement(By.id(AndroidEnrolmentScreens.P3_NOTIFICATIONS));
            common.secondsDelay(1);
            if (notifications.isDisplayed()) {
                notifications.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(AndroidEnrolmentScreens.P3_BACK_BTN)).click();

    }

    @And("^User clicks on get in touch$")
    public void userClicksOnGetInTouch() {
        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_GETINTOUCH)));
            MobileElement getintouch = driver.findElement(By.id(AndroidEnrolmentScreens.P3_GETINTOUCH));
            common.secondsDelay(1);
            if (getintouch.isDisplayed()) {
                getintouch.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(AndroidEnrolmentScreens.P3_BACK_BTN)).click();
    }

    @And("^User clicks on login and security$")
    public void userClicksOnLoginAndSecurity() {

        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_LOGINANDSEC)));
            MobileElement logSec = driver.findElement(By.id(AndroidEnrolmentScreens.P3_LOGINANDSEC));
            common.secondsDelay(1);
            if (logSec.isDisplayed()) {
                logSec.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(AndroidEnrolmentScreens.P3_BACK_BTN)).click();
    }

    @And("^User clicks on settings$")
    public void userClicksOnSettings() {

        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_SETTINGS)));
            MobileElement settings = driver.findElement(By.id(AndroidEnrolmentScreens.P3_SETTINGS));
            common.secondsDelay(1);
            if (settings.isDisplayed()) {
                settings.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(AndroidEnrolmentScreens.P3_BACK_BTN)).click();
    }

    @And("^User clicks on share money app$")
    public void userClicksOnShareMoneyApp() {

        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_SHAREMONEY)));
            MobileElement sharemoney = driver.findElement(By.id(AndroidEnrolmentScreens.P3_SHAREMONEY));
            common.secondsDelay(1);
            if (sharemoney.isDisplayed()) {
                sharemoney.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(AndroidEnrolmentScreens.P3_BACK_BTN)).click();

    }

    @And("^User clicks on Ts and Cs$")
    public void userClicksOnTsAndCs() {

        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P3_TsANDCs)));
            MobileElement tcs = driver.findElement(By.id(AndroidEnrolmentScreens.P3_TsANDCs));
            common.secondsDelay(1);
            if (tcs.isDisplayed()) {
                tcs.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(AndroidEnrolmentScreens.P3_BACK_BTN)).click();
    }

    @And("^User clicks on logout$")
    public void userClicksOnLogout() {

        try {
            basepage.android_scroll_down(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        basepage.hideKeyBoard();


        try{
            driver.findElement(By.id(AndroidEnrolmentScreens.P3_LOGOUT)).click();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @And("^User Logs in again$")
    public void userLogsInAgain() {

    }

}
