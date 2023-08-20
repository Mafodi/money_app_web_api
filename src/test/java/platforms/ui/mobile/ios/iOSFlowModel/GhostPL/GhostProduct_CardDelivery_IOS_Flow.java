package platforms.ui.mobile.ios.iOSFlowModel.GhostPL;

import java.util.logging.Logger;
import utils.DriverFactory;

public class GhostProduct_CardDelivery_IOS_Flow extends DriverFactory {
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_CardDelivery_IOS_Flow.class.getName());

	public static void clickConfirmOnCardDeliver() throws Throwable {
		Thread.sleep(5000);
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Confirm\"]").click();
		log.info(
				"*****************************************Confirm button clicked on Card delivery***********************************************");

	}
}
