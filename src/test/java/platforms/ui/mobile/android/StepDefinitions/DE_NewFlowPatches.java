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

public class DE_NewFlowPatches extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),60);
    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(Login.class);


    @And("^User enter SA ID for card and pin eti$")
    public void userEnterSAIDForCardAndPin() {

        try {
            driver.findElement(By.id(AndroidEnrolmentScreens.SAID_TXT)).sendKeys(dataFactory.SAID_NUMBER_CARD_ETI);
            //basepage.hideKeyBoard();

            driver.findElement(By.id(AndroidEnrolmentScreens.SAID_LBL)).click();

        } catch (Exception e) {
            log.info("Failed to enter id number:" + e.getMessage());
        }

        wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)));
        driver.findElement(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)).click();
    }


    @And("^User enter SA ID for card and pin non eti$")
    public void userEnterSAIDForCardAndPinNotEti() {

        try {
            driver.findElement(By.id(AndroidEnrolmentScreens.SAID_TXT)).sendKeys(dataFactory.SAID_NUMBER_CARD_NON_ETI);
            //basepage.hideKeyBoard();

            driver.findElement(By.id(AndroidEnrolmentScreens.SAID_LBL)).click();

        } catch (Exception e) {
            log.info("Failed to enter id number:" + e.getMessage());
        }

        wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)));
        driver.findElement(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)).click();
    }

    @When("^user enters a password \"([^\"]*)\" non Eti$")
    public void userEntersAPasswordNonEti(String PROFILE_PWD) throws Throwable {

        //common.secondsDelay(2);
        //wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.LOGIN_NID_PASSWORD)));
        try {
                driver.findElement(By.xpath(AndroidEnrolmentScreens.LOGIN_NID_PASSWORD)).sendKeys(dataFactory.NON_ETI_PROFILE_PWD);
               // basepage.hideKeyBoard();

            try {
                basepage.android_scroll_down(2);
            } catch (Exception e) {
                e.printStackTrace();
            }
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

    }

    @And("^User enters a profile number for nedbank \"([^\"]*)\", pin \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_Enters_A_Profile_Number_For_Nedbank_Pin_And_Password(String PROFILENUMBER, String PIN, String PASSWORD) {


        try {
            Thread.sleep(100);
            driver.findElement(By.id(AndroidEnrolmentScreens.P_NUMBER)).sendKeys(dataFactory.PROFILE_NUMBER);
            basepage.hideKeyBoard();
            driver.findElement(By.id(AndroidEnrolmentScreens.P_PIN)).sendKeys(dataFactory.PROFILE_PIN);
            basepage.hideKeyBoard();
            driver.findElement(By.id(AndroidEnrolmentScreens.P_PASSWORD)).sendKeys(dataFactory.PROFILE_PASSWORD);
            basepage.hideKeyBoard();
            driver.findElement(By.xpath(AndroidEnrolmentScreens.NEXT_LOGIN)).click();


            wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)));
            MobileElement NextButton = driver.findElement(By.xpath(AndroidEnrolmentScreens.BTN_NEXT));

            common.secondsDelay(1);
            if (NextButton.isDisplayed()) {
                NextButton.click();
            }

            //*wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.BTN_NEXT_ACTION)));

            MobileElement NextButton_II = driver.findElement(By.xpath(AndroidEnrolmentScreens.BTN_NEXT_ACTION));
            common.secondsDelay(1);
            if (NextButton_II.isDisplayed()) {
                NextButton_II.click();
            }

        } catch (Exception e) {
            log.info("Failed to enter profile number, pin and testing:" + e.getMessage());
        }

    }

    @And("^User enter forgot username$")
    public void userEnterForgotUsername() {

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

        //common.secondsDelay(10);
        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.F_USERNAME)));
            driver.findElement(By.id(AndroidEnrolmentScreens.F_USERNAME)).sendKeys(dataFactory.PROFILE_UNAME);
            basepage.hideKeyBoard();
            driver.findElement(By.id(AndroidEnrolmentScreens.F_NEXT)).click();

        } catch (Exception e) {
            log.info("Failed to click next button:" + e.getMessage());

        }


    }

    @And("^User enter forgot password$")
    public void userEnterForgotPassword()throws Throwable{

        driver.findElement(By.id(AndroidEnrolmentScreens.F_CREATE_PASSWORD)).clear();
        try {
            Thread.sleep(10);
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.F_CREATE_PASSWORD)));
            driver.findElement(By.id(AndroidEnrolmentScreens.F_CREATE_PASSWORD)).sendKeys(dataFactory.PROFILE_PWD);
            basepage.hideKeyBoard();
            driver.findElement(By.id(AndroidEnrolmentScreens.F_CHANGE)).click();
        } catch (Exception e) {
            log.info("Failed to click next button:" + e.getMessage());

        }

        common.secondsDelay(10);
        wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.F_GO_TO_LOGIN)));
        driver.findElement(By.id(AndroidEnrolmentScreens.F_GO_TO_LOGIN)).click();
    }
}
