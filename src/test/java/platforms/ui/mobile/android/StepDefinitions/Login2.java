package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidBaseScreen;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidOverviewScreen;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import utils.CommonFunctions;
import utils.DriverFactory;
import java.util.concurrent.TimeUnit;


public class Login2 extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    private CommonFunctions common = new CommonFunctions();

    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(Login2.class);
    AndroidBaseScreen loginPage=new AndroidBaseScreen(driver);
    AndroidOverviewScreen overviewScreen=new AndroidOverviewScreen(driver);


    @Given("^user launch the money app new$")
    public void userLaunchTheMoneyAppNew() {
        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
        loginPage.BTN_NEXT.click();
        loginPage.Login_Button.click();
    }

    @When("^user enters a username \"([^\"]*)\" and password \"([^\"]*)\" for first login b$")
    public void userEntersAUsernameAndPasswordForFirstLoginB(String username, String password){
        loginPage.NED_USERNAME.sendKeys(username);
        loginPage.NED_PASSWORD.sendKeys(password);
        loginPage.ACCEPTTerm.click();
        loginPage.NEXT_LOGIN.click();
        //Wait for ApproveIT
        driver.manage().timeouts().implicitlyWait(190, TimeUnit.SECONDS);

    }

    @Then("^user should be on the welcome page$")
    public void userShouldBeOnTheWelcomePageB() throws InterruptedException {
        Thread.sleep(3000);
        if (overviewScreen.Overview_MyAccount.isDisplayed()) {
            log.info("Successfully logged in");
        }
        else{
            log.info("Failed to login");
        }
    }

}
