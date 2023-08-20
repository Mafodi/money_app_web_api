package platforms.ui.mobile.android.StepDefinitions.GhostPL;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import platforms.ui.mobile.android.AndroidFlowModel.GhostPL.GhostProduct_Login_Flow;
import utils.DriverFactory;

/**
 * 
 * @author Agrim Markan
 *
 */
public class LoginSteps_Android extends DriverFactory {
	WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
	DriverFactory objDriverFactory = new DriverFactory();
	AppiumDriver<MobileElement> driver;

	// Log4J
	private static Logger log = Logger.getLogger(LoginSteps_Android.class.getName());

	@Before
	public void setUp(Scenario scenario) throws MalformedURLException {
		driver = (AndroidDriver<MobileElement>) objDriverFactory.getAndroidDriver();
		log.info(
				"*****************************************Application is launched***********************************************");
	}

	@After
	public void tearDown() {
		driver.resetApp();
		log.info(
				"*****************************************Application is Closed***********************************************");
	}

	@Given("^User launches the application$")
	public void user_launches_the_application() {

	}

	@Given("^User clicks on allow and ignore Update$")
	public void user_clicks_on_allow_and_ignore_Update() throws InterruptedException {
		GhostProduct_Login_Flow.clickAllowIgnoreUpdate();
	}

	@Given("^User clicks on continue button$")
	public void user_clicks_on_continue_button() {
		GhostProduct_Login_Flow.clickContinueButton();
	}

	@Given("^User clicks on next button$")
	public void user_clicks_on_next_button() {
		GhostProduct_Login_Flow.clickNextButton();
	}

	@Given("^User clicks on idonthave card button$")
	public void user_clicks_on_idonthave_card_button() {
		GhostProduct_Login_Flow.clickIdonthaveCardButton();
	}

	@Given("^User clicks on BusinessProfile button$")
	public void user_clicks_on_BusinessProfile_button() throws Throwable {
		GhostProduct_Login_Flow.clickBusinessProfile();
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable datatable) throws Throwable {
		GhostProduct_Login_Flow.enterUsernamePassword(datatable);
	}

	@Then("^User enters username and password\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_enters_username_and_password(String arg1, String arg2) throws Throwable {
		GhostProduct_Login_Flow.enterUserNamePassword(arg1, arg2);
	}

	@Then("^User clicks on t&c checkbox$")
	public void user_clicks_on_t_c_checkbox() {
		GhostProduct_Login_Flow.clickTCCheckbox();
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() {
		GhostProduct_Login_Flow.clickLoginButton();
	}

	@And("^User clicks on New Login button$")
	public void user_clicks_on_New_Login_button() throws Throwable {
		GhostProduct_Login_Flow.clickNewLoginButton();
	}

	@Then("^User clicks on skip button for pin$")
	public void user_clicks_on_skip_button_for_pin() throws Throwable {
		GhostProduct_Login_Flow.clickSkipPin();
	}

	@Then("^User clicks on next button to link accounts$")
	public void user_clicks_on_next_button_to_link_accounts() throws Throwable {
		GhostProduct_Login_Flow.nextButtonLinkAccounts();
	}

}
