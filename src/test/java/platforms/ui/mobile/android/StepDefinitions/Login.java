package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidLoginScreen;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Prepaid_AndroidObjects;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import utils.CommonFunctions;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobileCapabilityType.NO_RESET;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;


public class Login extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),100);
    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(Login.class);
    String object;

    @Given("^user launch the money app$")
    public void user_launch_the_money_app(){

        wait.until(presenceOfElementLocated(By.xpath(VAS_Prepaid_AndroidObjects.BTN_NEXT)));
        try {
            MobileElement btnNext = driver.findElement(By.xpath(VAS_Prepaid_AndroidObjects.BTN_NEXT));
            if (btnNext.isDisplayed()) {
                btnNext.click();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        log.info("Successfully launched Nedbank App");
    }

    @When("^user enters a username \"([^\"]*)\" and password \"([^\"]*)\" for first login$")
    public void userEntersAUsernameAndPasswordForFirstLogin(String username, String password) {
        object = String.valueOf(driver.getCapabilities().getCapability(NO_RESET));
        try {
            if (object == "false") {
                MobileElement Login = driver.findElement(By.id(VAS_Prepaid_AndroidObjects.LogIn));
                if (Login.isDisplayed()) {
                    Login.click();
                }
                driver.findElementById(VAS_Prepaid_AndroidObjects.WelcomeScreen).isDisplayed();
                driver.findElementsById(VAS_Prepaid_AndroidObjects.TypeOfProfile).get(1).click();
                driver.findElementByXPath(VAS_Prepaid_AndroidObjects.BusProfileNED_ID).isDisplayed();
                driver.findElementByXPath(VAS_Prepaid_AndroidObjects.BusProfileNED_ID).click();
                wait.until(presenceOfElementLocated(By.id(VAS_Prepaid_AndroidObjects.PersonalProfileIdNum)));
                driver.findElementsById(VAS_Prepaid_AndroidObjects.PersonalProfileIdNum).get(0).sendKeys(username);
                driver.findElementsById(VAS_Prepaid_AndroidObjects.PersonalProfileIdNum).get(1).sendKeys(password);
                driver.findElementById(VAS_Prepaid_AndroidObjects.ACCEPTTerm).click();
                driver.findElementById(VAS_Prepaid_AndroidObjects.LoginNextBtn).click();
                log.info("Successfully Login with Ned Id and password" + username +" : "+ password);
            } else if (object == "true") {
                driver.findElementByXPath("//android.widget.TextView[@text='Login']").click();
                driver.findElement(By.xpath(VAS_Prepaid_AndroidObjects.NED_PASSWORD)).sendKeys(password);
                MobileElement logIn = driver.findElement(By.xpath(VAS_Prepaid_AndroidObjects.LOGIN));
                logIn.click();
//                try {
//                   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//                   driver.findElement(By.id("tvSkipPinBiometric")).click();
//                }catch (Exception e){
//                    e.getMessage();
//                }
                log.info("Successfully Login with Ned Id and password" + password);
            }
        } catch (Exception e) {
            log.info(e.getStackTrace());
            throw new AssertionError("User is not successfully logged into Money app:", e);
        }
    }
    @Then("^user should be on the welcome pageB$")
    public void user_on_the_welcome_page() throws InterruptedException {

        wait.until(presenceOfElementLocated(By.id(VAS_Prepaid_AndroidObjects.ENROLMENT_WELCOME_SCREEN)));
        Thread.sleep(1000);
        MobileElement WelcomeScreen = driver.findElementById(VAS_Prepaid_AndroidObjects.ENROLMENT_WELCOME_SCREEN);
        if (WelcomeScreen.isDisplayed()) {
            log.info("Welcome screen is displayed successfully");
        }
        try {
            if(driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).isDisplayed()) {
                driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.getMessage();
        }
//        try{
//            MobileElement enrolOk = driver.findElement(By.xpath(VAS_Prepaid_AndroidObjects.ENROL_OK_ID));
//            if (enrolOk.isDisplayed()) {
//                enrolOk.click();
//            }
//        } catch (Exception e) {
//            e.getMessage();
//        }
    }

    @Given("^User Clicks Continue with this version$")
    public void userClicksContinueWithThisVersion() {
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.ContinueWithVersion)));
        driver.findElementById(AndroidLoginScreen.ContinueWithVersion).click();
        // driver.findElementById(AndroidLoginScreen.BTN_NEXT_Text).click();

    }

}
