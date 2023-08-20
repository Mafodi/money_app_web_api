package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
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

public class DE_PersonaFour extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(DE_Create_NedID.class);

    @And("^P four User enter SA ID$")
    public void pFourUserEnterSAID() {
        try {
            driver.findElement(By.id(AndroidEnrolmentScreens.SAID_TXT)).sendKeys(dataFactory.P4_ID_TXT);
            //basepage.hideKeyBoard();

            driver.findElement(By.id(AndroidEnrolmentScreens.SAID_LBL)).click();

        } catch (Exception e) {
            log.info("Failed to enter id number:" + e.getMessage());
        }

        wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)));
        driver.findElement(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)).click();


    }

    @And("^User clicks forgot details$")
    public void pFourUserClicksForgotDetails() throws Throwable{

       Thread.sleep(10);
        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P4_FORGOT)));

            //driver.findElement(By.xpath(AndroidEnrolmentScreens.P4_FORGOT)).click();
            MobileElement forgot = driver.findElement(By.id(AndroidEnrolmentScreens.P4_FORGOT));
            common.secondsDelay(1);
            if (forgot.isDisplayed()) {
                forgot.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @And("^P four User creates password$")
    public void pFourUserCreatesPassword() {

        try {
            driver.findElement(By.id(AndroidEnrolmentScreens.P4_PASSWORD_TXT)).sendKeys(dataFactory.P4_PASSWORD);
            basepage.hideKeyBoard();
        }catch (Exception e){
            e.printStackTrace();
        }


        try {
            //wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P4_CHANGE_PASSWORD)));
            MobileElement changePass = driver.findElement(By.id(AndroidEnrolmentScreens.P4_CHANGE_PASSWORD));
            common.secondsDelay(1);
            if (changePass.isDisplayed()) {
                changePass.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @And("^P four User navigates to login$")
    public void pFourUserEnters_navigates_to_login() {

        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.P4_GOTOLOGIN)));
            MobileElement gotolog = driver.findElement(By.id(AndroidEnrolmentScreens.P4_GOTOLOGIN));
            common.secondsDelay(1);
            if (gotolog.isDisplayed()) {
                gotolog.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @And("^P four User enters password$")
    public void pFourUserEntersPassword() {

        try {
            Thread.sleep(10);
            driver.findElement(By.id(AndroidEnrolmentScreens.P4_PASSWORD_TXT)).sendKeys(dataFactory.P4_PASSWORD);
            basepage.hideKeyBoard();


             driver.findElement(By.id(AndroidEnrolmentScreens.ACCEPTTerm)).click();
            driver.findElement(By.xpath(AndroidEnrolmentScreens.NEXT_LOGIN)).click();

            //common.secondsDelay(35);
            wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)));
            MobileElement NextButton = driver.findElement(By.xpath(AndroidEnrolmentScreens.BTN_NEXT));

            common.secondsDelay(10);
            if (NextButton.isDisplayed()) {
                NextButton.click();
            }
            // driver.findElement(By.id(AndroidEnrolmentScreens.ENROLMENT_CANCEL_CREATE_PIN)).click();
         } catch (Exception e) {
            log.info("Failed to enter profile number, pin and testing:" + e.getMessage());
        }

    }

    @And("^P four User enters a profile number \"([^\"]*)\", pin \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void pFourUserEntersAProfileNumberPinAndPassword(String arg0, String arg1, String arg2) throws Throwable {

        try {
            Thread.sleep(10);

            driver.findElement(By.id(AndroidEnrolmentScreens.P_NUMBER)).sendKeys(dataFactory.P4_PROFILE_NUMBER);
            basepage.hideKeyBoard();
            driver.findElement(By.id(AndroidEnrolmentScreens.P_PIN)).sendKeys(dataFactory.P4_PROFILE_PIN);
            basepage.hideKeyBoard();
            driver.findElement(By.id(AndroidEnrolmentScreens.P_PASSWORD)).sendKeys(dataFactory.P4_PROFILE_PASSWORD);
            basepage.hideKeyBoard();


            //  driver.findElement(By.id(AndroidEnrolmentScreens.ACCEPTTerm)).click();
            driver.findElement(By.xpath(AndroidEnrolmentScreens.NEXT_LOGIN)).click();

            //common.secondsDelay(35);
           /* wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)));
            MobileElement NextButton = driver.findElement(By.xpath(AndroidEnrolmentScreens.BTN_NEXT));
            common.secondsDelay(10);
            if (NextButton.isDisplayed()) {
                NextButton.click();
            }*/

        } catch (Exception e) {
            log.info("Failed to enter profile number, pin and testing:" + e.getMessage());
        }
    }




}
