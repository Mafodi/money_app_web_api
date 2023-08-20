package platforms.ui.mobile.android.AndroidFlowModel.GhostPL;

import java.util.Map;
import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.DataTable;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.Page_LoginSteps;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_Login_Flow extends DriverFactory {
	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	static Page_LoginSteps objPage_LoginSteps = new Page_LoginSteps(driver);
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_Login_Flow.class.getName());

	// Methods For Login-------------------------------------------------------->
	public static void clickAllowIgnoreUpdate() throws InterruptedException {
		log.info(
				"*****************************************Clicked Allow Buttons and Ignored Update***********************************************");
	}

	public static void clickContinueButton() {
		try {
			objCommonFunctions.waitForElement(Page_LoginSteps.androidContinueButtonV2, 360);
			Page_LoginSteps.androidContinueButtonV2.click();
		} catch (Exception e) {
			log.info("Continue button not clicked");
			Assert.fail(e.getMessage());
		}
		log.info(
				"*****************************************Clicked Continue button***********************************************");
	}

	public static void clickNextButton() {
		try {
			objCommonFunctions.waitForElement(Page_LoginSteps.androidNextButtonV2, 360);
			Page_LoginSteps.androidNextButtonV2.click();
		} catch (Exception e) {
			log.info("Next button not clicked");
			Assert.fail(e.getMessage());
		}

		log.info(
				"*****************************************Clicked Next Button***********************************************");

	}

	public static void clickIdonthaveCardButton() {
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 120);
			wait1.until(ExpectedConditions.visibilityOf(Page_LoginSteps.androidIDonehaveCard));
			Page_LoginSteps.androidIDonehaveCard.click();
		} catch (Exception e) {
			log.info("Don't have card button not clicked");
			Assert.fail(e.getMessage());
		}

		log.info(
				"*****************************************Clicked i dont have card button***********************************************");
	}

	public static void clickBusinessProfile() {
		try {
			objCommonFunctions.waitForElement(Page_LoginSteps.androidIDonehaveCard, 120);
			Page_LoginSteps.androidIDonehaveCard.click();
		} catch (Exception e) {
			log.info("Business profile button not clicked");
			Assert.fail(e.getMessage());
		}

		log.info(
				"*****************************************Clicked Business Profile***********************************************");

	}

	public static void enterUserNamePassword(String UserName, String Password) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(Page_LoginSteps.androidNedbankIDTagV2));
		((Page_LoginSteps.androidNedbankIDTagV2)).click();
		(Page_LoginSteps.androidUserNameV2).sendKeys(UserName);
		try {
			driver.hideKeyboard();
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		(Page_LoginSteps.androidPasswordV2).sendKeys(Password);
		try {
			driver.hideKeyboard();
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		log.info("*****************************************Entered U***********************************************");
	}

	public static void enterUsernamePassword(DataTable dataTable) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf((Page_LoginSteps.androidNedbankIDTagV2)));
		((Page_LoginSteps.androidNedbankIDTagV2)).click();
		for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {
			(Page_LoginSteps.androidUserNameV2).sendKeys(data.get("username"));
			try {
				driver.hideKeyboard();
			} catch (Exception e) {
				log.info(e.getMessage());
			}
			(Page_LoginSteps.androidPasswordV2).sendKeys(data.get("password"));
			try {
				driver.hideKeyboard();
			} catch (Exception e) {
				log.info(e.getMessage());
			}
		}
		log.info(
				"*****************************************Entered Username and Password***********************************************");
	}

	public static void clickTCCheckbox() {
		try {
			Page_LoginSteps.androidTnCCheckboxV2.click();
		} catch (Exception e) {
			log.info("T&C not checked");
			Assert.fail(e.getMessage());
		}

		log.info(
				"*****************************************Clicked T&C Checkbox***********************************************");
	}

	public static void clickLoginButton() {
		try {
			Page_LoginSteps.androidLoginNextV2.click();
		} catch (Exception e) {
			log.info("Login button not clicked");
			Assert.fail(e.getMessage());
		}

		log.info(
				"*****************************************Clicked Login Button***********************************************");
	}

	public static void clickNewLoginButton() throws Throwable {
		Thread.sleep(3000);
		try {
			driver.findElementById("tv_login").click();
		} catch (Exception e) {
			log.info("New login button not clicked");
			Assert.fail(e.getMessage());
		}

		log.info(
				"*****************************************Clicked New Login Button***********************************************");
	}

	public static void clickSkipPin() {
		try {
			objCommonFunctions.waitForElement(Page_LoginSteps.androidSkipPin, 200);
			Page_LoginSteps.androidSkipPin.click();
			Thread.sleep(15000);
		} catch (Exception e) {
			log.info("Skip pin not clicked");
			Assert.fail(e.getMessage());
		}
		log.info(
				"*****************************************Clicked on skip pin***********************************************");


	}

	public static void nextButtonLinkAccounts() {
		try {
			objCommonFunctions.waitForElement(Page_LoginSteps.nextButtonLinkAccounts, 200);
			Page_LoginSteps.nextButtonLinkAccounts.click();
			Thread.sleep(15000);
		} catch (Exception e) {
			log.info("Next Button to link accounts not found");
		}
		log.info(
				"*****************************************Next button to link accounts clicked***********************************************");

	}
}
