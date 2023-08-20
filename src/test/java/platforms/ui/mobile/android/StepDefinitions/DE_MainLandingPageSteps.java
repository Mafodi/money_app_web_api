package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidEnrolmentScreens;
import utils.CommonFunctions;
import utils.DriverFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;


public class DE_MainLandingPageSteps extends DriverFactory {
    Login login = new Login();
    private static Logger log = Logger.getLogger(DE_MainLandingPageSteps.class);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),60);
    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basepage = new AndroidCommonMethods();

    @Given("^User is on the main landing page$")
    public void userISonTheMainLandingPage() {

//       basepage.LaunchApp();
    }
    @And("^User can scroll across the corousel$")
    public void userCanScrollAcrossTheCorousel() throws Throwable{

        try {
           Thread.sleep(100);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.LEFT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.LEFT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.LEFT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.LEFT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.LEFT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.LEFT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.LEFT);
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    @And("^User clicks view products$")
    public void userClicksViewProducts() throws Throwable{

        try{
        wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.VIEW_PRODUCT)));

        MobileElement ViewButton = driver.findElement(By.id(AndroidEnrolmentScreens.VIEW_PRODUCT));
        common.secondsDelay(1);
            if (ViewButton.isDisplayed()) {
            ViewButton.click();
            }
        }catch (Exception e){
        log.info("Failed to click view products:" + e.getMessage());

        }

    }

    @And("^User clicks Bundles and Offerings$")
    public void userClicksBundlesAndOfferings() {

        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.PRODUCT_PROCEEDE)));

            MobileElement ProceedButton = driver.findElement(By.id(AndroidEnrolmentScreens.PRODUCT_PROCEEDE));
            common.secondsDelay(1);
            if (ProceedButton.isDisplayed()) {
                ProceedButton.click();
            }
        } catch (Exception e) {
            log.info("Failed to click poroceed button:" + e.getMessage());

        }
    }

    @And("^User click next for account offerings$")
    public void userClickNextForAccountOfferings() {

        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.PRODUCT_NEXT)));

            MobileElement NextButton = driver.findElement(By.id(AndroidEnrolmentScreens.PRODUCT_NEXT));
            common.secondsDelay(1);
            if (NextButton.isDisplayed()) {
                NextButton.click();
            }
        } catch (Exception e) {
            log.info("Failed to click next button:" + e.getMessage());

        }
    }

    @Then("^User close product process$")
    public void  userCloseProductProczess() {

        try {
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.PRODUCT_BACK)));

            MobileElement BAckButton = driver.findElement(By.id(AndroidEnrolmentScreens.PRODUCT_BACK));
            common.secondsDelay(1);
            if (BAckButton.isDisplayed()) {
                BAckButton.click();
            }
        } catch (Exception e) {
            log.info("Failed to click back button:" + e.getMessage());
            log.info("  to click back button:" + e.getMessage());

        }
    }

    @When("^User clicks Login link$")
    public void userClicksLoginLink() {

        try {
          //  wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.LOGIN_LINK)));

            MobileElement LoginLink = driver.findElement(By.id(AndroidEnrolmentScreens.LOGIN_LINK));
            common.secondsDelay(1);
            if (LoginLink.isDisplayed()) {
                LoginLink.click();
            }
        } catch (Exception e) {
            log.info("Failed to click login link:" + e.getMessage());


        }

    }

    @And("^User is directed to login$")
    public void userIsDirectedToLogin() {

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
    }


}
