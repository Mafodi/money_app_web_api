package platforms.ui.mobile.android.AndroidFlowModel.GhostPL;

import utils.DriverFactory;
import java.util.logging.Logger;

import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.Page_CardDeliveryScreen;

public class GhostProduct_CardDelivery_Flow extends DriverFactory {
	static Page_CardDeliveryScreen objPage_CardDeliveryScreen = new Page_CardDeliveryScreen(driver);
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_CardDelivery_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void clickCardDeliveryConfirmButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementById(Page_CardDeliveryScreen.androidIminterestedButton).click();
		log.info(

				"*****************************************Card Delivery Confirm Clicked***********************************************");

	}

}
