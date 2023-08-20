package platforms.ui.mobile.ios.StepDefinitions;


import com.aventstack.extentreports.Status;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.VASIOSDataFactory;
import platforms.ui.mobile.ios.VASIOSObjects;
import utils.CommonFunctions;
import utils.DriverFactory;
import utils.Utils;


import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobileCapabilityType.NO_RESET;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class IOSLoginSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getIOSDriver(), 60);
    private CommonFunctions common = new CommonFunctions();
    private Utils utils = new Utils();
    private static Logger log = Logger.getLogger(IOSLoginSteps.class);
    String object;


    @Given("^user launches IOS money app$")
    public void userLaunchesIOSMoneyApp() {
//        try {
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.findElementByAccessibilityId(VASIOSObjects.ALLOW_BUTTON).click();
//        } catch (Exception e) {
//            System.out.println("Successfully clicked Allow button");
//        }
        wait.until(presenceOfElementLocated(new MobileBy.ByAccessibilityId(VASIOSObjects.CONTINUE_WITH_THIS_VERSION_LINK_TEXT)));
        MobileElement continueWithVersion = driver.findElementByAccessibilityId(VASIOSObjects.CONTINUE_WITH_THIS_VERSION_LINK_TEXT);
        // wait.until(presenceOfElementLocated(continueWithVersion));

        if (continueWithVersion.isDisplayed()) {
            continueWithVersion.click();
            log.info("Successfully clicked Continue with this version button");
        }
        try {
            MobileElement btnNext = driver.findElement(By.xpath(VASIOSObjects.NEXT_LOGIN_BUTTON));
            if (btnNext.isDisplayed()) {
                btnNext.click();
                log.info("Clicked Next button");
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }

    @When("^user enters a username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userEntersAUsernameAndPassword(String username, String password) {
        object = String.valueOf(driver.getCapabilities().getCapability(NO_RESET));

        try {

            if (object == "false") {

                MobileElement LoginIn = driver.findElementByAccessibilityId(VASIOSObjects.Login_Link_Text);
                if (LoginIn.isDisplayed()) {
                    LoginIn.click();
                    log.info("Clicked Login button");
                }
//                try {
//                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                    driver.findElementByAccessibilityId(VASIOSObjects.ALLOW_BUTTON).click();
//                } catch (Exception e) {
//                    System.out.println("Successfully clicked Allow button");
//                }

                driver.findElementByAccessibilityId(VASIOSObjects.USERNAME_TEXTFIELD).sendKeys(username);
                driver.hideKeyboard();
                driver.findElementByAccessibilityId(VASIOSObjects.PROFILE_PASSWORD).sendKeys(password);
                driver.hideKeyboard();

                driver.findElementByAccessibilityId(VASIOSObjects.NEW_ENROLEMENT_TERMS_AND_CONDITION_CHECKBOX).click();
                driver.findElementByAccessibilityId(VASIOSObjects.LOGIN_BUTTON).click();
                log.info("Successfully Login with Ned Id and password");

            } else if (object == "true") {
                wait.until(presenceOfElementLocated(new MobileBy.ByAccessibilityId(VASIOSObjects.PROFILE_PASSWORD)));
                driver.findElementByAccessibilityId(VASIOSObjects.PROFILE_PASSWORD).sendKeys(password);
                driver.hideKeyboard();
                MobileElement logIn = driver.findElementByAccessibilityId(VASIOSObjects.LOGIN_BUTTON);
                logIn.click();
                try {
                    wait.until(presenceOfElementLocated(new MobileBy.ByAccessibilityId(VASIOSObjects.SkipFingerPrint)));
                    driver.findElementByAccessibilityId(VASIOSObjects.SkipFingerPrint).click();
                } catch (Exception e) {
                    e.getMessage();
                }


            }
        } catch (Exception e) {
            log.info(e.getStackTrace());
            throw new AssertionError("User has not logged in succesfully:", e);
        }

    }

    @Then("^user should be on ios welcome page$")
    public void userShouldBeOnIosWelcomePage() {
        wait.until(presenceOfElementLocated(new MobileBy.ByAccessibilityId(VASIOSObjects.WELCOME_SCREEN)));
        MobileElement welcomeScreen = driver.findElementByAccessibilityId(VASIOSObjects.WELCOME_SCREEN);
        if (welcomeScreen.isDisplayed()) {
            System.out.println("user successfully navigated to Welcome screen");
        }
        try {
            MobileElement enrolementOk = driver.findElementByAccessibilityId(VASIOSObjects.NEW_ENROLEMENT_OK);
            if (enrolementOk.isDisplayed()) {
                enrolementOk.click();
            }

        } catch (Exception e) {
            log.info(e.getStackTrace());
            throw new AssertionError("User Not navigated to welcome screen:", e);
        }
    }
}
