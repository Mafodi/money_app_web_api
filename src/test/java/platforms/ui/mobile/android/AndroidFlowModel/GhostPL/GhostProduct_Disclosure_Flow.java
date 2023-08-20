package platforms.ui.mobile.android.AndroidFlowModel.GhostPL;

import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.PL_Page_DisclosureScreen;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_Disclosure_Flow extends DriverFactory {

	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	public static AndroidCommonMethods objAndroidCommonMethods = new AndroidCommonMethods();
	static PL_Page_DisclosureScreen objPL_Page_DisclosureScreen = new PL_Page_DisclosureScreen(driver);

	public static AndroidDriver<MobileElement> andriver;
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_Disclosure_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void checkTitle(String getTitle) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"" + getTitle + "\"]")));
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getTitle + "\"]");
		log.info(
				"*****************************************Title Checked For Disclosure Screen***********************************************");
	}

	public static void checkText(String getText1, String getText2, String getText3, String getText4, String getText5,
			String getText6, String getText7, String getText8, String getText9, String checkbox1Text,
			String checkbox2Text, String loanReason) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"" + getText1 + "\"]")));

		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText1 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText2 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText3 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText4 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText5 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText6 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText7 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText8 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText9 + "\"]");
		String getRadioButton1Text = driver.findElementByXPath(PL_Page_DisclosureScreen.androidDisclosureRadioButton1)
				.getText();
		Assert.assertEquals(getRadioButton1Text, checkbox1Text);
		String getRadioButton2Text = driver.findElementByXPath(PL_Page_DisclosureScreen.androidDisclosureRadioButton2)
				.getText();
		Assert.assertEquals(getRadioButton2Text, checkbox2Text);
		log.info(
				"*****************************************Text Checked For Disclosure Screen***********************************************");
	}

	public static void checkTextForConsolidation(String getText1, String getText2, String getText3, String getText4,
			String getText5, String getText6, String getText7, String getText8, String getText9, String getText10,
			String getText11, String getText12) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"" + getText1 + "\"]")));

		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText1 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText2 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText3 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText4 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText5 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText6 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText7 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText8 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText9 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText9 + "\"]");
		driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText10 + "\"]");

		andriver = (AndroidDriver<MobileElement>) driver;
		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Confirm" + "\").instance(0))");

		String getRadioButton1Text = driver.findElementByXPath(PL_Page_DisclosureScreen.androidDisclosureRadioButton1)
				.getText();
		Assert.assertEquals(getRadioButton1Text, getText11);
		String getRadioButton2Text = driver.findElementByXPath(PL_Page_DisclosureScreen.androidDisclosureRadioButton2)
				.getText();
		Assert.assertEquals(getRadioButton2Text, getText12);
		log.info(
				"*****************************************Text Checked For Disclosure Screen Consoldiation***********************************************");
	}

	public static void clickConfirm() throws InterruptedException {
		Thread.sleep(5000);
		PL_Page_DisclosureScreen.androidDisclosureConfirmButton.click();
		log.info(
				"*****************************************Clicked Confirm Button on Disclosure Screen***********************************************");
	}

	public static void clickRadioButton() throws InterruptedException {
		Thread.sleep(15000);
		andriver = (AndroidDriver<MobileElement>) driver;
		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Confirm" + "\").instance(0))");

		Thread.sleep(2000);
		driver.findElementByXPath(PL_Page_DisclosureScreen.androidDisclosureRadioButton1).click();
		driver.findElementByXPath(PL_Page_DisclosureScreen.androidDisclosureRadioButton2).click();
//			androidDisclosureRadioButton1.click();
//			androidDisclosureRadioButton2.click();

		log.info(
				"*****************************************RadioButton Clicked on Disclosure Screen***********************************************");
	}

	public static void clickReasonsTab() {
		driver.findElementById(PL_Page_DisclosureScreen.androidDisclosureReasonsTab).click();
		log.info(
				"*****************************************Reasons Tab Clicked on Disclosure Screen***********************************************");
	}

	public static void checkReasonsScreenTitle(String reasonsTitle) {
		String getReasonsTitle = PL_Page_DisclosureScreen.androidDisclosureReasonScreenTitle.getText();
		Assert.assertEquals(getReasonsTitle, reasonsTitle);
		log.info(
				"*****************************************Title Clicked on Disclosure Screen***********************************************");
	}

	public static void checkReasonsOptionsText(String reasonOptions) {
		String[] alltermsarray = reasonOptions.split(";");

		for (int i = 0; i < alltermsarray.length; i++) {
			driver.findElementByXPath(
					"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + alltermsarray[i] + "')]");
			if (i == (alltermsarray.length / 2)) {
				andriver = (AndroidDriver<MobileElement>) driver;
				andriver.findElementByAndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Other\").instance(0))");

			}
		}
		log.info(
				"*****************************************Reasons Text Checked***********************************************");
	}

	public static void clickDifferentReason(String getReason) {
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + getReason + "\")]").click();
		log.info(
				"*****************************************Different Reason for taking loan clicked***********************************************");
	}

	public static void clickXButton() {
		PL_Page_DisclosureScreen.androidDisclosureXButton.click();
		log.info(
				"*****************************************X Button on Disclosure Clicked***********************************************");
	}

	public static void clickReasonsBackButton() {
		PL_Page_DisclosureScreen.androidDisclosureReasonsScreenBack.click();
		log.info(
				"*****************************************Reasons Back Button Clicked***********************************************");

	}

	public static void scrollDisclosureScreenToBottom() throws InterruptedException {
		Thread.sleep(15000);
		objAndroidCommonMethods.verticalSwipeByPercentages(0.70, 0.10, 0.5);
		log.info(
				"*****************************************Disclosure screen scrolled***********************************************");
	}

	public static void checkTnCDisagreeError(String getErrorMessage) throws InterruptedException {
		objCommonFunctions.waitForElement(PL_Page_DisclosureScreen.androidDisclosureTnCDisagreeError, 30);
		PL_Page_DisclosureScreen.androidDisclosureTnCDisagreeError.click();
		String errorMessage = PL_Page_DisclosureScreen.androidDisclosureTnCDisagreeError.getText();
		Assert.assertEquals(getErrorMessage, errorMessage);
		log.info(
				"*****************************************TnC Disagree Error***********************************************");
	}

	public static void clickTnCConfirmButton() {
		PL_Page_DisclosureScreen.androidDisclosureTnCButton.click();
		log.info(
				"*****************************************Click TnC Confirm Button***********************************************");

	}
}
