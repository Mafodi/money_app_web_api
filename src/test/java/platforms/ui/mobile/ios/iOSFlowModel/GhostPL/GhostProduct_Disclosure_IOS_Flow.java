package platforms.ui.mobile.ios.iOSFlowModel.GhostPL;

import java.util.HashMap;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import platforms.ui.mobile.ios.iOSPageObjects.GhostPL.PL_Page_DisclosureScreen_IOS;
import utils.DriverFactory;

public class GhostProduct_Disclosure_IOS_Flow extends DriverFactory {
	static PL_Page_DisclosureScreen_IOS objPL_Page_DisclosureScreen_IOS = new PL_Page_DisclosureScreen_IOS(driver);

	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_Disclosure_IOS_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void checkTitle(String getTitle) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(PL_Page_DisclosureScreen_IOS.iosDisclosureScreenTitle)));
		driver.findElementByXPath(PL_Page_DisclosureScreen_IOS.iosDisclosureScreenTitle);
		log.info(
				"*****************************************Title Checked For Disclosure Screen***********************************************");
	}

	public static void checkText(String getText1, String getText2, String getText3, String getText4, String getText5,
			String getText6, String getText7, String getText8, String getText9, String checkbox1Text,
			String checkbox2Text, String loanReason) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementByAccessibilityId(PL_Page_DisclosureScreen_IOS.iosDisclosureScreenText1);
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText2 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText3 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText4 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText5 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText6 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText7 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText8 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText9 + "\"]");
		driver.findElementByAccessibilityId(PL_Page_DisclosureScreen_IOS.iosDisclosureScreenCheckbox1);
		driver.findElementByAccessibilityId(PL_Page_DisclosureScreen_IOS.iosDisclosureScreenCheckbox2);
		log.info(
				"*****************************************Text Checked For Disclosure Screen***********************************************");
	}

	public static void checkTextForConsolidation(String getText1, String getText2, String getText3, String getText4,
			String getText5, String getText6, String getText7, String getText8, String getText9, String getText10,
			String getText11, String getText12) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementByAccessibilityId(PL_Page_DisclosureScreen_IOS.iosDisclosureScreenText1);
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText2 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText3 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText4 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText5 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText6 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText7 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText8 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText9 + "\"]");
		driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"" + getText10 + "\"]");
		driver.findElementByAccessibilityId(PL_Page_DisclosureScreen_IOS.iosDisclosureScreenCheckbox1);
		driver.findElementByAccessibilityId(PL_Page_DisclosureScreen_IOS.iosDisclosureScreenCheckbox2);
		log.info(
				"*****************************************Text Checked For Disclosure Screen Consoldiation***********************************************");
	}

	public static void clickConfirm() throws InterruptedException {
		driver.findElementByAccessibilityId(PL_Page_DisclosureScreen_IOS.iosDisclosureScreenConfirmButton).click();
		log.info(
				"*****************************************Clicked Confirm Button on Disclosure Screen***********************************************");
	}

	public static void clickRadioButton() throws InterruptedException {
		Thread.sleep(15000);
		// WebDriverWait wait = new WebDriverWait(idriver, 120);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iosDisclosureScreenCheckbox1")));
		// idriver.findElementByAccessibilityId(iosDisclosureScreenCheckbox1).click();
		driver.findElementByAccessibilityId(PL_Page_DisclosureScreen_IOS.iosDisclosureScreenCheckbox2).click();
		log.info(
				"*****************************************RadioButton Clicked on Disclosure Screen***********************************************");
	}

	public static void clickReasonsTab() {
		driver.findElementByAccessibilityId(PL_Page_DisclosureScreen_IOS.iosDisclosureScreenReasonForTakingLoan)
				.click();
		log.info(
				"*****************************************Reasons Tab Clicked on Disclosure Screen***********************************************");
	}

	public static void checkReasonsScreenTitle(String reasonsTitle) {
		driver.findElementByXPath(PL_Page_DisclosureScreen_IOS.iosReasonsScreenTitle);
		log.info(
				"*****************************************Title Clicked on Disclosure Screen***********************************************");
	}

	public static void checkReasonsOptionsText(String reasonOptions) {
		String[] alltermsarray = reasonOptions.split(";");
		for (int i = 0; i < alltermsarray.length; i++) {
			driver.findElementByAccessibilityId(alltermsarray[i]);
		}
		log.info(
				"*****************************************Reasons Text Checked***********************************************");
	}

	public static void clickDifferentReason(String getReason) {
		driver.findElementByAccessibilityId(getReason).click();
		log.info(
				"*****************************************Different Reason for taking loan clicked***********************************************");
	}

	public static void clickXButton() {
		driver.findElementByAccessibilityId(PL_Page_DisclosureScreen_IOS.iosDisclosureScreenXButton).click();
		log.info(
				"*****************************************X Button on Disclosure Clicked***********************************************");
	}

	public static void clickReasonsBackButton() {
		driver.findElementByAccessibilityId(PL_Page_DisclosureScreen_IOS.iosReasonsScreenBackButton).click();
		log.info(
				"*****************************************Reasons Back Button Clicked***********************************************");

	}

	public static void scrollDisclosureScreenToBottom() throws InterruptedException {
		Thread.sleep(3000);

		RemoteWebElement element = (RemoteWebElement) driver.findElement(By.className("XCUIElementTypeTable"));
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		driver.executeScript("mobile:scroll", scrollObject);

		log.info(
				"*****************************************Disclosure screen scrolled***********************************************");
	}

	public static void checkTnCDisagreeError(String getErrorMessage) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(PL_Page_DisclosureScreen_IOS.iosDisclosureTnCDisagreeError)));
		log.info(
				"*****************************************TnC Disagree Error***********************************************");
	}

	public static void clickTnCConfirmButton() {
		driver.findElementByXPath(PL_Page_DisclosureScreen_IOS.iosDisclosureTnCButton).click();
		log.info(
				"*****************************************Click TnC Confirm Button***********************************************");

	}

}
