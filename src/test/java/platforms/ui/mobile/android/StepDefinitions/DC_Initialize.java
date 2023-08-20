package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.PageFactoryObject;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobileCapabilityType.NO_RESET;

public class DC_Initialize extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private static Logger log = Logger.getLogger(DC_Initialize.class);
    PageFactoryObject pageFactoryObject = new PageFactoryObject(driver);
    String object;

    @Given("^As a client I am on the NedbankMoneyApp$")
    public void asAClientIAmOnTheNedbankMoneyApp() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            pageFactoryObject.getBaseScreenLocators().CONTINUE_WITH_THIS_VERSION.click();
            log.info("Successfully clicked Continue with this version button");
        } catch (Exception e) {
            e.getMessage();
        }

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        try {
            pageFactoryObject.getBaseScreenLocators().BTN_NEXT.click();
            log.info("Clicked Next button");
        }
        catch(Exception e) {
            e.getMessage();
        }

    }

    @When("^I capture Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void iCaptureUsernameAndPassword(String username, String password) throws Exception {
        object = String.valueOf(driver.getCapabilities().getCapability(NO_RESET));

        try {
            if(object == "false") {
                pageFactoryObject.getBaseScreenLocators().LOGIN.click();
                log.info("Clicked Login button");

                pageFactoryObject.getBaseScreenLocators().NED_USERNAME.sendKeys(username);
                log.info("NedID captured");

                try {
                    basePage.hideKeyBoard();
                }
                catch(Exception e) {
                    e.getMessage();
                }

                pageFactoryObject.getBaseScreenLocators().NED_PASSWORD.sendKeys(password);
                log.info("Password captured");

                try {
                    basePage.hideKeyBoard();
                }
                catch(Exception e) {
                    e.getMessage();
                }

                try {
                    basePage.android_scroll_down(2);
                }
                catch(Exception e) {
                    e.getMessage();
                }

                pageFactoryObject.getBaseScreenLocators().ACCEPTTerm.click();
                log.info("Accept Terms and Conditions clicked");

                pageFactoryObject.getBaseScreenLocators().NEXT_LOGIN.click();
                log.info("Login button clicked");
            }
            else if(object == "true") {
                pageFactoryObject.getBaseScreenLocators().LOGIN_FOOTER.click();
                log.info("Click Login from footer");

                pageFactoryObject.getBaseScreenLocators().NED_PASSWORD.sendKeys(password);
                log.info("Password captured");

                pageFactoryObject.getBaseScreenLocators().LOGIN_BUTTON.click();
                log.info("Login button clicked");

                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                try {
                    pageFactoryObject.getBaseScreenLocators().SKIP_PIN.click();
                    log.info("Skip Pin button clicked");
                }catch(Exception e) {
                    e.getMessage();
                }
            }
        }
        catch(Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("User is not successfully logged into NedbankMoneyApp: ", e);
        }
    }

    @Then("^Home screen page should display$")
    public void homeScreenPageShouldDisplay() {
        try {
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            try {
                pageFactoryObject.getOverviewScreenLocators().ENROLMENT_WELCOME_SCREEN.click();
                log.info("MyPocket closed successfully");
            }
            catch(Exception e) {
                e.getMessage();
            }

            if(pageFactoryObject.getOverviewScreenLocators().ENROLMENT_WELCOME_SCREEN.isDisplayed()) {
                log.info("Welcome screen is displayed successfully");
            }
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Homescreen not successfully displayed: ", e);
        }
    }
}
