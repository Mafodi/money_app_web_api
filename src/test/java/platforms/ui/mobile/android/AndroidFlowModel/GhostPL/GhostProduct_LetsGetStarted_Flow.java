package platforms.ui.mobile.android.AndroidFlowModel.GhostPL;

import java.util.List;
import java.util.logging.Logger;

import org.junit.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.PL_Page_LetsGetStarted;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_LetsGetStarted_Flow extends DriverFactory {
	public static AndroidCommonMethods objAndroidCommonMethods = new AndroidCommonMethods();
	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	static PL_Page_LetsGetStarted objPL_Page_LetsGetStarted = new PL_Page_LetsGetStarted(driver);
	public static AndroidDriver<MobileElement> andriver;
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_LetsGetStarted_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void checkTitle(String getTitle) throws InterruptedException {
		objCommonFunctions.waitForElement(PL_Page_LetsGetStarted.androidPLLetsgetstartedTitleV2, 120);
		PL_Page_LetsGetStarted.androidPLLetsgetstartedTitleV2.click();
		String text = PL_Page_LetsGetStarted.androidPLLetsgetstartedTitleV2.getText();
		Assert.assertEquals(text, getTitle);
		log.info(
				"*****************************************Title Checked For LetsGetStartedScreen***********************************************");
	}

	public static void checkHeading(String getHeading) throws InterruptedException {
		Thread.sleep(3000);
		String text = PL_Page_LetsGetStarted.androidPLLetsgetstartedHeadingV2.getText();
		Assert.assertEquals(text, getHeading);
		log.info(
				"*****************************************Heading Checked For LetsGetStartedScreen***********************************************");

	}

	public static void checkText(String getText1, String getText2, String getText3) {
		String text1 = driver.findElementByXPath("//android.widget.TextView[@text='" + getText1 + "']").getText();
		Assert.assertEquals(text1, getText1);
		String text2 = driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText2 + "\"]").getText();
		Assert.assertEquals(text2, getText2);
		String text3 = driver.findElementByXPath("//android.widget.TextView[@text='" + getText3 + "']").getText();
		Assert.assertEquals(text3, getText3);
		log.info(
				"*****************************************Text Checked For PL LetsGetStartedScreen***********************************************");

	}

	public static void clickCheckbox() throws InterruptedException {
		Thread.sleep(10000);
		List<MobileElement> li = driver
				.findElementsByClassName(PL_Page_LetsGetStarted.androidPLLetsgetstartedCheckBoxListV2);
		li.get(0).click();
		li.get(1).click();
		li.get(2).click();
		log.info(
				"*****************************************Checkbox Checked For PL LetsGetStartedScreen***********************************************");

	}

	public static void clickConfirm() throws InterruptedException {
		Thread.sleep(3000);
		PL_Page_LetsGetStarted.androidPLLetsgetstartedConfirmButtonV2.click();
		log.info(
				"*****************************************Confirm Button CLicked For LetsGetStartedScreen***********************************************");
	}

	public static void clickBackButton() throws InterruptedException {
		objCommonFunctions.waitForElement(PL_Page_LetsGetStarted.androidPLLetsgetstartedBackButtonV2, 30);
		PL_Page_LetsGetStarted.androidPLLetsgetstartedBackButtonV2.click();
		log.info(
				"*****************************************Back Button CLicked For LetsGetStartedScreen***********************************************");
	}

	public static void scrollLetsGetStartedSCreenToBottom() throws InterruptedException {
		Thread.sleep(5000);
		andriver = (AndroidDriver<MobileElement>) driver;
		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Confirm" + "\").instance(0))");
		objAndroidCommonMethods.verticalSwipeByPercentages(0.70, 0.10, 0.5);
		log.info(
				"*****************************************LetsGetStartedScrolledToBottom***********************************************");

	}

	public static void checkText(String getText1, String getText2, String getText3, String getText4, String getText5,
			String getText6, String getText7) {
		String text1 = driver.findElementByXPath("//android.widget.TextView[@text='" + getText1 + "']").getText();
		Assert.assertEquals(getText1, text1);
		String text2 = driver.findElementByXPath("//android.widget.TextView[@text='" + getText2 + "']").getText();
		Assert.assertEquals(getText2, text2);
		String text3 = driver.findElementByXPath("//android.widget.TextView[@text='" + getText3 + "']").getText();
		Assert.assertEquals(getText3, text3);
		String text4 = driver.findElementByXPath("//android.widget.TextView[@text='" + getText4 + "']").getText();
		Assert.assertEquals(getText4, text4);
		String text5 = driver.findElementByXPath("//android.widget.TextView[@text=\"" + getText5 + "\"]").getText();
		Assert.assertEquals(getText5, text5);
		String text6 = driver.findElementByXPath("//android.widget.TextView[@text='" + getText6 + "']").getText();
		Assert.assertEquals(getText6, text6);

	}
}
