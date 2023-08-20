package platforms.ui.mobile.ios.iOSFlowModel.GhostPL;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import platforms.ui.mobile.ios.iOSPageObjects.GhostPL.Page_NotificationScreen_IOS;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_Notification_IOS_Flow extends DriverFactory {

	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	static Page_NotificationScreen_IOS objPage_NotificationScreen_IOS = new Page_NotificationScreen_IOS(driver);

	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_Notification_IOS_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void clickForYouTab() {
		objCommonFunctions.waitForElement(Page_NotificationScreen_IOS.iosForYouV2, 30);
		Page_NotificationScreen_IOS.iosForYouV2.click();
		log.info(
				"*****************************************ForYou Tab Clicked On NotificationScreen***********************************************");
	}

	public static void clickPLOffer() {
		Page_NotificationScreen_IOS.iosOfferText.click();
	}

	public static void clickCLOffer() {
	}

	public static void clickSpecificPLOffer(DataTable dataTable) throws InterruptedException {
		for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {
			String getOffer = data.get("PLOffer");
			Thread.sleep(10000);
			List<MobileElement> i = driver.findElements((By.className("XCUIElementTypeStaticText")));
			for (int j = 0; j < i.size(); j++) {
				// System.out.println(i.get(j).getText());
				if (i.get(j).getText().equalsIgnoreCase(getOffer)) {
					i.get(j).click();
					break;
				}
			}
		}
		log.info(
				"*****************************************PL Offer Clicked On NotificationScreen***********************************************");
	}

	public static void clickSpecificCLOffer(DataTable dataTable) throws InterruptedException {
		for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {
			String getOffer = data.get("CLOffer");
			Thread.sleep(10000);
			List<MobileElement> i = driver.findElements((By.className("XCUIElementTypeStaticText")));

			for (int j = 0; j < i.size(); j++) {
				// System.out.println(i.get(j).getText());
				if (i.get(j).getText().equalsIgnoreCase(getOffer)) {
					i.get(j).click();
					break;
				}
			}
		}
		log.info(
				"*****************************************PL Offer Clicked On NotificationScreen***********************************************");

	}

	public static void noOfferMessage(String arg1) {
		objCommonFunctions.waitForElement(Page_NotificationScreen_IOS.iosNoNotificationV2, 30);
		Page_NotificationScreen_IOS.iosNoNotificationV2.click();
		log.info(
				"*****************************************NoNotificationMessage Checked For NotificationScreen***********************************************");

	}

	public static void checkSpecificOfferDoesNotExist(String getOffer) throws InterruptedException {
		Thread.sleep(2000);
	}

	public static void checkSpecificOfferExists(String getOffer) {
	}

	public static void scrollNotificationScreen() throws Throwable {
		Thread.sleep(7000);
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		driver.executeScript("mobile:scroll", scrollObject);
	}

	@Then("^User clicks on PLOffer\"([^\"]*)\"$")
	public void user_clicks_on_PLOffer(String arg1) throws Throwable {
		Thread.sleep(5000);
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name='" + arg1 + "\']").click();
		Thread.sleep(2000);
	}

	@Then("^User clicks on CLOffer\"([^\"]*)\"$")
	public void user_clicks_on_CLOffer(String arg1) throws Throwable {
	}
}
