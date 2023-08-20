package platforms.ui.mobile.ios.StepDefinitions.GhostPL;

import java.net.MalformedURLException;
import java.util.logging.Logger;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import platforms.ui.mobile.ios.iOSFlowModel.GhostPL.GhostProduct_Login_IOS_Flow;
import utils.DriverFactory;

/**
 * 
 * @author Agrim Markan
 *
 */
public class LoginSteps_IOS extends DriverFactory {
	DriverFactory objDriverFactory = new DriverFactory();

	// Log4J
	private static Logger log = Logger.getLogger(LoginSteps_IOS.class.getName());

	@Before
	public void setUp(Scenario scenario) throws MalformedURLException {
		driver = objDriverFactory.getIOSDriver();
		log.info(
				"*****************************************Application is launched***********************************************");
	}

	@After
	public void tearDown(Scenario scenario) {
		driver.resetApp();
		log.info(
				"*****************************************Application is Closed***********************************************");
	}

	@Given("^User_IOS launches the application$")
	public void user_ios_launches_the_application() throws Throwable {
	}

	@Given("^User_IOS clicks on allow and ignore Update$")
	public void user_ios_clicks_on_allow_and_ignore_Update() throws Throwable {
		GhostProduct_Login_IOS_Flow.clickAllowIgnoreUpdate();
	}

	@Given("^User_IOS clicks on continue button$")
	public void user_ios_clicks_on_continue_button() throws Throwable {
		GhostProduct_Login_IOS_Flow.clickContinueButton();
	}

	@Given("^User_IOS clicks on New Login button$")
	public void user_ios_clicks_on_New_Login_button() throws Throwable {
		GhostProduct_Login_IOS_Flow.clickNewLoginButton();
	}

	@Given("^User_IOS clicks on BusinessProfile button$")
	public void user_ios_clicks_on_BusinessProfile_button() throws Throwable {
		GhostProduct_Login_IOS_Flow.clickBusinessProfile();
	}

	@Then("^User_IOS enters username and password$")
	public void user_ios_enters_username_and_password(DataTable datatable) throws Throwable {
		GhostProduct_Login_IOS_Flow.enterUsernamePassword(datatable);
	}

	@Then("^User_IOS clicks on t&c checkbox$")
	public void user_ios_clicks_on_t_c_checkbox() throws Throwable {
		GhostProduct_Login_IOS_Flow.clickTCCheckbox();
	}

	@Then("^User_IOS clicks on login button$")
	public void user_ios_clicks_on_login_button() throws Throwable {
		GhostProduct_Login_IOS_Flow.clickLoginButton();
	}

	@Then("^User_IOS clicks on skip button$")
	public void user_ios_clicks_on_skip_button() throws Throwable {
		GhostProduct_Login_IOS_Flow.clickSkip();
	}

	@Then("^User_IOS clicks on Next button to link accounts$")
	public void user_ios_clicks_on_Next_button_to_link_accounts() throws Throwable {
		GhostProduct_Login_IOS_Flow.clickNextButtonLinkAccounts();
	}

}
