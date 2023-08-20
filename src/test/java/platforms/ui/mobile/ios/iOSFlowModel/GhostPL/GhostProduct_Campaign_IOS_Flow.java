package platforms.ui.mobile.ios.iOSFlowModel.GhostPL;

import java.util.logging.Logger;
import platforms.ui.mobile.ios.iOSPageObjects.GhostPL.STL_Page_CampaignScreen_IOS;
import utils.DriverFactory;

public class GhostProduct_Campaign_IOS_Flow extends DriverFactory {
	static STL_Page_CampaignScreen_IOS objSTL_Page_CampaignScreen_IOS = new STL_Page_CampaignScreen_IOS(driver);

	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_Campaign_IOS_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void clickIminterestedButton() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElementByXPath(STL_Page_CampaignScreen_IOS.iosIminterestedButton).click();
		log.info(
				"*****************************************Clicked on ImInterestedButton***********************************************");
	}
}
