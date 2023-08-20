package platforms.ui.mobile.android.AndroidFlowModel.GhostPL;

import java.util.Map;
import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.Page_NotificationsScreen;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_Notification_Flow extends DriverFactory {
	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	static Page_NotificationsScreen objPage_NotificationsScreen = new Page_NotificationsScreen(driver);

	public static AndroidDriver<MobileElement> andriver;
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_Notification_Flow.class.getName());

	// Methods for notifications
	// screen-------------------------------------------------------->
	public static void clickForYouTab() {
		objCommonFunctions.waitForElement(Page_NotificationsScreen.androidForYouV2, 30);
		Page_NotificationsScreen.androidForYouV2.click();
		log.info(
				"*****************************************ForYou Tab Clicked On NotificationScreen***********************************************");
	}

	public static void clickPLOffer() {
		objCommonFunctions.waitForElement(Page_NotificationsScreen.androidOfferText, 30);
		Page_NotificationsScreen.androidOfferText.click();
	}

	public static void clickCLOffer() {
	}

	public static void clickSpecificPLOffer(DataTable dataTable) throws InterruptedException {
		for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {
			String getOffer = data.get("PLOffer");
			Thread.sleep(3000);
			andriver = (AndroidDriver<MobileElement>) driver;
			andriver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
							+ getOffer + "\").instance(0))");

			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='" + getOffer + "\']")));

			driver.findElementByXPath("//android.widget.TextView[@text='" + getOffer + "']").click();
		}
		log.info(
				"*****************************************PL Offer Clicked On NotificationScreen***********************************************");
	}

	public static void clickSpecificCLOffer(DataTable dataTable) throws InterruptedException {

		Thread.sleep(5000);

		for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {
			String getOffer = data.get("CLOffer");
			andriver = (AndroidDriver<MobileElement>) driver;
			andriver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
							+ getOffer + "\").instance(0))");

			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='" + getOffer + "\']")));

			driver.findElementByXPath("//android.widget.TextView[@text='" + getOffer + "']").click();
		}
		log.info(
				"*****************************************PL Offer Clicked On NotificationScreen***********************************************");

	}

	public static void noOfferMessage(String arg1) {
		objCommonFunctions.waitForElement(Page_NotificationsScreen.androidNoNotificationV2, 30);
		String text = Page_NotificationsScreen.androidNoNotificationV2.getText();
		Assert.assertEquals(arg1, text);
		log.info(
				"*****************************************NoNotificationMessage Checked For NotificationScreen***********************************************");

	}

	public static void checkSpecificOfferDoesNotExist(String getOffer) throws InterruptedException {
	}

	public static void checkSpecificOfferExists(String getOffer) {
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='" + getOffer + "\']")));

	}
}
