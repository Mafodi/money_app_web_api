package platforms.ui.mobile.ios.iOSFlowModel.GhostPL;

import java.util.Map;
import java.util.logging.Logger;
import cucumber.api.DataTable;
import platforms.ui.mobile.ios.iOSPageObjects.GhostPL.Page_LoginSteps_IOS;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_Login_IOS_Flow extends DriverFactory {
	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	static Page_LoginSteps_IOS objPage_LoginSteps_IOS = new Page_LoginSteps_IOS(driver);

	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_Login_IOS_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void clickAllowIgnoreUpdate() throws InterruptedException {
	}

	public static void clickContinueButton() throws Throwable {
		Thread.sleep(20000);
		objCommonFunctions.waitForElement(Page_LoginSteps_IOS.iosContinueButtonV2, 240000);
		Page_LoginSteps_IOS.iosContinueButtonV2.click();
		log.info(
				"*****************************************Clicked Continue button***********************************************");
	}

	public static void clickNextButton() {
		Page_LoginSteps_IOS.iosNextButtonV2.click();
		log.info(
				"*****************************************Clicked Next Button***********************************************");
	}

	public static void clickIdonthaveCardButton() {
		Page_LoginSteps_IOS.iosIDonehaveCard.click();
		log.info(
				"*****************************************Clicked i dont have card button***********************************************");
	}

	public static void clickBusinessProfile() {
		Page_LoginSteps_IOS.iosBusinessProfile.click();
		log.info(
				"*****************************************Clicked Business Profile***********************************************");
	}

	public static void enterUserNamePassword(String UserName, String Password) throws InterruptedException {
		Page_LoginSteps_IOS.iosNedbankIDTagV2.click();
		Page_LoginSteps_IOS.iosUserNameV2.click();
		Thread.sleep(3000);
		Page_LoginSteps_IOS.iosUserNameV2.sendKeys(UserName);
		try {
			driver.hideKeyboard();
		} catch (Exception e) {
		}
		Page_LoginSteps_IOS.iosPasswordV2.sendKeys(Password);
		try {
			driver.hideKeyboard();
		} catch (Exception e) {
		}

		log.info(
				"*****************************************Entered Username and Password***********************************************");
	}

	public static void enterUsernamePassword(DataTable dataTable) throws InterruptedException {
		Page_LoginSteps_IOS.iosNedbankIDTagV2.click();
		for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {
			Page_LoginSteps_IOS.iosUserNameV2.click();
			Thread.sleep(3000);
			Page_LoginSteps_IOS.iosUserNameV2.sendKeys(data.get("username"));
			try {
				driver.hideKeyboard();
			} catch (Exception e) {
			}
			Page_LoginSteps_IOS.iosPasswordV2.sendKeys(data.get("password"));
			try {
				driver.hideKeyboard();
			} catch (Exception e) {
			}
		}
		log.info(
				"*****************************************Entered Username and Password***********************************************");
	}

	public static void clickTCCheckbox() {
		Page_LoginSteps_IOS.iosTnCCheckboxV2.click();
		log.info(
				"*****************************************Clicked T&C Checkbox***********************************************");
	}

	public static void clickLoginButton() {
		Page_LoginSteps_IOS.iosLoginNextV2.click();
		log.info(
				"*****************************************Clicked Login Button***********************************************");
	}

	public static void clickNewLoginButton() throws Throwable {
		Thread.sleep(3000);
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Log in\"]").click();
		log.info(
				"*****************************************Clicked New Login Button***********************************************");
	}

	public static void clickSkip() throws Throwable {
		Thread.sleep(20000);
		objCommonFunctions.waitForElement(Page_LoginSteps_IOS.SkipFingerPrint, 120000);
		Page_LoginSteps_IOS.SkipFingerPrint.click();
	}

	public static void clickNextButtonLinkAccounts() {
		objCommonFunctions.waitForElement(Page_LoginSteps_IOS.NextButtonToLinkAccounts, 120000);
		Page_LoginSteps_IOS.NextButtonToLinkAccounts.click();
	}
}
