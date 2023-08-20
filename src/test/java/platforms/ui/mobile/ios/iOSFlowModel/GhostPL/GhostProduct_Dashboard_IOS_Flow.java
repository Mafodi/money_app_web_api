package platforms.ui.mobile.ios.iOSFlowModel.GhostPL;

import java.util.logging.Logger;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import platforms.ui.mobile.ios.iOSPageObjects.GhostPL.Page_DashboardScreen_IOS;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_Dashboard_IOS_Flow extends DriverFactory {

	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	static Page_DashboardScreen_IOS objPage_DashboardScreen_IOS = new Page_DashboardScreen_IOS(driver);
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_Dashboard_IOS_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void declinePinCreation() throws InterruptedException {
		Thread.sleep(30000);
		objCommonFunctions.waitForElement(Page_DashboardScreen_IOS.iosDeclinePinCreation, 120);
		Page_DashboardScreen_IOS.iosDeclinePinCreation.click();
		log.info(
				"*****************************************Declined Pin Creation***********************************************");
	}

	public static void clickOkSnackBar() throws Throwable {
		Thread.sleep(5000);
		objCommonFunctions.waitForElement(Page_DashboardScreen_IOS.iosOkSnackBar, 1200);

		Thread.sleep(2000);

		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(20, 78)).perform();

		Thread.sleep(2000);

		TouchAction touchAction1 = new TouchAction(driver);
		touchAction1.tap(PointOption.point(20, 78)).perform();
		Page_DashboardScreen_IOS.iosOkSnackBar.click();

		log.info(
				"*****************************************Clicked Ok SnackBar***********************************************");
	}

	public static void clickPulsatingIcon() throws InterruptedException {
		Thread.sleep(10000);
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(295, 59)).perform();

		TouchAction touchAction1 = new TouchAction(driver);
		touchAction1.tap(new PointOption().withCoordinates(295, 59)).perform();

		log.info(
				"*****************************************Clicked Pulsating Icon***********************************************");
	}

	public static void clickMoreOption() {
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(20, 78)).perform();

		objCommonFunctions.waitForElement(Page_DashboardScreen_IOS.iosMoreOption, 10);
		Page_DashboardScreen_IOS.iosMoreOption.click();

		log.info(
				"*****************************************Clicked More Option***********************************************");
	}

	public static void clickNotificationTab() throws InterruptedException {
		Thread.sleep(3000);
		objCommonFunctions.waitForElement(Page_DashboardScreen_IOS.iosNotificationTab, 30);
		Page_DashboardScreen_IOS.iosNotificationTab.click();

		log.info(
				"*****************************************Clicked Notification Tab***********************************************");
	}
}
