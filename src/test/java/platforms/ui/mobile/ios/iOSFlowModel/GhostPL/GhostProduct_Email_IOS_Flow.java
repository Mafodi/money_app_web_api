package platforms.ui.mobile.ios.iOSFlowModel.GhostPL;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import platforms.ui.mobile.ios.iOSPageObjects.GhostPL.PL_Page_EmailScreen_IOS;
import utils.DriverFactory;

public class GhostProduct_Email_IOS_Flow extends DriverFactory {

	static PL_Page_EmailScreen_IOS objPL_Page_EmailScreen_IOS = new PL_Page_EmailScreen_IOS(driver);

	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_Email_IOS_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void checkTitle(String getTitle) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(PL_Page_EmailScreen_IOS.iosEmailScreenTitle)));

		driver.findElementByXPath(PL_Page_EmailScreen_IOS.iosEmailScreenTitle);
		log.info(
				"*****************************************Title Checked for Email Screen***********************************************");
	}

	public static void checkHeading(String getHeading) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(PL_Page_EmailScreen_IOS.iosEmailScreenHeading)));
		driver.findElementByXPath(PL_Page_EmailScreen_IOS.iosEmailScreenHeading);
		log.info(
				"*****************************************Heading Checked for Email Screen***********************************************");

	}

	public static void checkText(String getText1, String getText2) {
		driver.findElementByXPath(PL_Page_EmailScreen_IOS.iosEmailScreenText1);
		driver.findElementByXPath(PL_Page_EmailScreen_IOS.iosEmailScreenText2);
		log.info(
				"*****************************************Text Checked for Email Screen***********************************************");
	}

	public static void enterEmailID(String getEmailID) throws InterruptedException {
		Thread.sleep(10000);
		driver.findElementByXPath(PL_Page_EmailScreen_IOS.iosEmailScreenHeading).click();
		driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"Email address\"]").click();
		driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"Email address\"]").clear();
		driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"Email address\"]").sendKeys(getEmailID);
		driver.findElementByXPath(PL_Page_EmailScreen_IOS.iosEmailScreenHeading).click();
		Thread.sleep(2000);
		log.info(
				"*****************************************Email ID Entered on Email Screen***********************************************");
	}

	public static void invalidEmailIDErrorMessage(String getErrorMessage) {
		log.info(
				"*****************************************Invalid Email ID Message Checked***********************************************");
	}

	public static void clickConfirm() {
		driver.findElementByXPath(PL_Page_EmailScreen_IOS.iosEmailScreenConfirmButton).click();
		log.info(
				"*****************************************Confirm Button Clicked on Email Screen***********************************************");
	}

	public static void clickXButton() {
		driver.findElementByXPath(PL_Page_EmailScreen_IOS.iosEmailScreenXButton).click();
		log.info(
				"*****************************************X button clicked on Email Screen***********************************************");
	}

	public static void clickBackButton() {
		driver.findElementByXPath(PL_Page_EmailScreen_IOS.iosEmailScreenBackButton).click();
		log.info(
				"*****************************************Back Button Clicked on Email Screen***********************************************");
	}

}
