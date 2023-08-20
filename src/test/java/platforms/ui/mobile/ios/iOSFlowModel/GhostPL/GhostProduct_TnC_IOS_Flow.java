package platforms.ui.mobile.ios.iOSFlowModel.GhostPL;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import platforms.ui.mobile.ios.iOSPageObjects.GhostPL.PL_Page_TnCScreen_IOS;
import utils.DriverFactory;

public class GhostProduct_TnC_IOS_Flow extends DriverFactory {

	static PL_Page_TnCScreen_IOS objPL_Page_TnCScreen_IOS = new PL_Page_TnCScreen_IOS(driver);

	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_TnC_IOS_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void checkTitle(String getTitle) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PL_Page_TnCScreen_IOS.iosTnCTitle)));
		driver.findElementByXPath("//XCUIElementTypeNavigationBar[@name=\"" + getTitle + "\"]");
		log.info(
				"*****************************************Title Checked For TnC Screen***********************************************");
	}

	public static void clickAgreeButton() throws InterruptedException {
		Thread.sleep(30000);
		driver.findElementByXPath(PL_Page_TnCScreen_IOS.iosTnCAgreeButton).click();
		log.info(
				"*****************************************Clicked Agree Button For TnC Screen***********************************************");

	}

	public static void clickDisagreeButton() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementByXPath(PL_Page_TnCScreen_IOS.iosTnCDisagreeButton).click();
		log.info(
				"*****************************************Clicked Disagree Button For TnC Screen***********************************************");
	}

	public static void clickTnCBackButton() {
		driver.findElementByXPath(PL_Page_TnCScreen_IOS.iosTnCBackButton).click();
		log.info(
				"*****************************************Back Button CLicked For TnC Screen***********************************************");
	}

	public static void clickTnCXButton() {
		driver.findElementByXPath(PL_Page_TnCScreen_IOS.iosTnCXButton).click();
		log.info(
				"*****************************************X Button CLicked For TnC Screen***********************************************");

	}
}
