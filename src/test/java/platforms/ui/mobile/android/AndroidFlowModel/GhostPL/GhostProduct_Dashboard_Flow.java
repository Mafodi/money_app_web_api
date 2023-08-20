package platforms.ui.mobile.android.AndroidFlowModel.GhostPL;

import java.util.logging.Logger;

import org.junit.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.Page_DashboardScreen;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.Page_LoginSteps;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_Dashboard_Flow extends DriverFactory {
	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	static Page_DashboardScreen objPage_DashboardScreen = new Page_DashboardScreen(driver);
	public static AndroidDriver<MobileElement> andriver;
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_Dashboard_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void declinePinCreation() throws InterruptedException {
		objCommonFunctions.waitForElement(Page_DashboardScreen.androidDeclinePinCreation, 200);
		Page_DashboardScreen.androidDeclinePinCreation.click();
		log.info(
				"*****************************************Declined Pin Creation***********************************************");
	}

	public static void clickOkSnackBar() throws Throwable {
		try {
			Thread.sleep(5000);
			objCommonFunctions.waitForElement(Page_DashboardScreen.androidOkSnackBar, 15);
			Page_DashboardScreen.androidOkSnackBar.click();
		} catch (Exception e) {
			log.info("Ok Button not clicked");
		}

		log.info(
				"*****************************************Clicked Ok SnackBar***********************************************");
	}

	public static void clickPulsatingIcon() throws InterruptedException {
		objCommonFunctions.waitForElement(Page_DashboardScreen.androidPulsatingIcon, 30);
		Page_DashboardScreen.androidPulsatingIcon.click();
		log.info(
				"*****************************************Clicked Pulsating Icon***********************************************");
	}

	public static void clickMoreOption() {
		objCommonFunctions.waitForElement(Page_DashboardScreen.androidMoreOption, 200);
		Page_DashboardScreen.androidMoreOption.click();
		log.info(
				"*****************************************Clicked More Option***********************************************");
	}

	public static void clickNotificationTab() throws InterruptedException {
		objCommonFunctions.waitForElement(Page_DashboardScreen.androidNotificationTab, 30);
		Page_DashboardScreen.androidNotificationTab.click();
		log.info(
				"*****************************************Clicked Notification Tab***********************************************");
	}

}
