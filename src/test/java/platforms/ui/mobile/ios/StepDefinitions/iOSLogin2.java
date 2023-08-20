package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.iOSPageObjects.iOSBaseScreen;
import platforms.ui.mobile.ios.iOSPageObjects.iOSOverviewScreen;
import utils.CommonFunctions;
import utils.DriverFactory;
import utils.Utils;

import java.util.concurrent.TimeUnit;

public class iOSLogin2 extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getIOSDriver(), 60);
    private CommonFunctions common = new CommonFunctions();
    private Utils utils = new Utils();
    private static Logger log = Logger.getLogger(IOSLoginSteps.class);
    iOSBaseScreen loginPage = new iOSBaseScreen(driver);
    iOSOverviewScreen overviewScreen = new iOSOverviewScreen(driver);

    @Given("^user launch the money app new ios app$")
    public void userLaunchTheMoneyAppNewIosApp(){
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        if (loginPage.Root_Continue.isDisplayed()) {
            loginPage.Root_Continue.click();
            log.info("Successfully clicked Continue with this version button");
        }
        if (loginPage.Login_Button.isDisplayed()) {
            loginPage.Login_Button.click();
            log.info("Successfully clicked Continue with this version button");
        }
    }

    @When("^user enters a username \"([^\"]*)\" and password \"([^\"]*)\" for first login ios app$")
    public void userEntersAUsernameAndPasswordForFirstLoginIosApp(String username, String password) throws Throwable {
        //Thread.sleep(2000);
        loginPage.NED_USERNAME.sendKeys(username);
        loginPage.NED_PASSWORD.sendKeys(password);
        loginPage.ACCEPTTerm.click();
        driver.hideKeyboard();
        loginPage.NEXT_LOGIN.click();
        //Wait for ApproveIT
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    @Then("^user should be on the welcome page ios app$")
    public void userShouldBeOnTheWelcomePageIosApp() throws InterruptedException {
//        Thread.sleep(2000);
        overviewScreen.Welcome_OK.click();
        if (overviewScreen.Overview_MyAccount.isDisplayed()) {
            log.info("Successfully logged in");
        }
        else{
            log.info("Failed to login");
        }
    }
}
