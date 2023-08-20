package platforms.ui.mobile.ios.iOSFlowModel.GhostPL;

import java.util.HashMap;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.iOSPageObjects.GhostPL.PL_Page_LetsGetStarted_IOS;
import utils.DriverFactory;

public class GhostProduct_LetsGetStarted_IOS_Flow extends DriverFactory {
	static PL_Page_LetsGetStarted_IOS objPL_Page_LetsGetStarted_IOS = new PL_Page_LetsGetStarted_IOS(driver);

	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_LetsGetStarted_IOS_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void checkTitle(String getTitle) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id(PL_Page_LetsGetStarted_IOS.iosPLLetsgetstartedTitleV2)));
		Thread.sleep(5000);
		driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosPLLetsgetstartedTitleV2);
		log.info(
				"*****************************************Title Checked For LetsGetStartedScreen***********************************************");
	}

	public static void checkHeading(String getHeading) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//XCUIElementTypeStaticText[@name=\"" + getHeading + "\"])[1]")));
		log.info(
				"*****************************************Heading Checked For LetsGetStartedScreen***********************************************");

	}

	public static void checkText(String getText1, String getText2, String getText3) {
		driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosPLLetsgetstartedText4V2);
		driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosPLLetsgetstartedCheckBox1TextV2);
		driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosPLLetsgetstartedCheckBox2TextV2);

		log.info(
				"*****************************************Text Checked For PL LetsGetStartedScreen***********************************************");

	}

	public static void clickCheckbox() throws InterruptedException {
		Thread.sleep(3000);
		if (!driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosPLLetsgetstartedConfirmButtonV2)
				.isEnabled()) {
			driver.findElementByXPath(PL_Page_LetsGetStarted_IOS.iosPLLetsgetstartedCheckBox1).click();
			driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosPLLetsgetstartedCheckBox2).click();
			driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosPLLetsgetstartedCheckBox3).click();
		}
		log.info(
				"*****************************************Checkbox Checked For PL LetsGetStartedScreen***********************************************");

	}

	public static void clickConfirm() throws InterruptedException {
		driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosPLLetsgetstartedConfirmButtonV2).click();
		log.info(
				"*****************************************Confirm Button CLicked For LetsGetStartedScreen***********************************************");
	}

	public static void clickBackButton() throws InterruptedException {
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.id(PL_Page_LetsGetStarted_IOS.iosPLLetsgetstartedBackButtonV2)));
		driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosPLLetsgetstartedBackButtonV2).click();
		log.info(
				"*****************************************Back Button CLicked For LetsGetStartedScreen***********************************************");
	}

	public static void scrollLetsGetStartedSCreenToBottom() throws InterruptedException {
		Thread.sleep(3000);
		RemoteWebElement element = (RemoteWebElement) driver.findElement(By.className("XCUIElementTypeTable"));
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		driver.executeScript("mobile:scroll", scrollObject);
		log.info(
				"*****************************************LetsGetStartedScrolledToBottom***********************************************");

	}

	public static void checkText(String getText1, String getText2, String getText3, String getText4, String getText5,
			String getText6, String getText7) {
		driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosConsolidationLetsgetstartedText1V2);
		driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosConsolidationLetsgetstartedText2V2);
		driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosConsolidationLetsgetstartedText3V2);
		driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosConsolidationLetsgetstartedText4V2);
		driver.findElementByAccessibilityId(PL_Page_LetsGetStarted_IOS.iosConsolidationLetsgetstartedCheckBox1TextV2);
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + getText6 + "\"]");
	}
}
