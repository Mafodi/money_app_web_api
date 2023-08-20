package platforms.ui.mobile.android.AndroidFlowModel.GhostPL;

import java.util.logging.Logger;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.STL_Page_CampaignScreen;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_Campaign_Flow extends DriverFactory {
	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	static STL_Page_CampaignScreen objSTL_Page_CampaignScreen = new STL_Page_CampaignScreen(driver);
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_Campaign_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void clickIminterestedButton() throws InterruptedException {
		Thread.sleep(7000);
		objCommonFunctions.waitForElement(STL_Page_CampaignScreen.androidIminterestedButton, 120);
		STL_Page_CampaignScreen.androidIminterestedButton.click();
		log.info(
				"*****************************************Clicked on ImInterestedButton***********************************************");
	}
}
