package platforms.ui.mobile.android.AndroidFlowModel.GhostPL;

import java.util.logging.Logger;

import org.junit.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.PL_Page_TnCScreen;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_TnC_Flow extends DriverFactory {
	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	public static AndroidCommonMethods objAndroidCommonMethods = new AndroidCommonMethods();
	static PL_Page_TnCScreen objPL_Page_TnCScreen = new PL_Page_TnCScreen(driver);

	public static AndroidDriver<MobileElement> andriver;
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_TnC_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void checkTitle(String getTitle) {
		objCommonFunctions.waitForElement(PL_Page_TnCScreen.androidTnCTitle, 30);
		PL_Page_TnCScreen.androidTnCTitle.click();
		String title = PL_Page_TnCScreen.androidTnCTitle.getText();
		Assert.assertEquals(getTitle, title);
		log.info(
				"*****************************************Title Checked For TnC Screen***********************************************");
	}

	public static void clickAgreeButton() throws InterruptedException {
		Thread.sleep(10000);
		PL_Page_TnCScreen.androidTnCAgreeButton.click();
		log.info(
				"*****************************************Clicked Agree Button For TnC Screen***********************************************");

	}

	public static void clickDisagreeButton() throws InterruptedException {
		Thread.sleep(10000);
		PL_Page_TnCScreen.androidTnCDisagreeButton.click();
		log.info(
				"*****************************************Clicked Disagree Button For TnC Screen***********************************************");
	}

	public static void clickTnCBackButton() {
		PL_Page_TnCScreen.androidTnCBackButton.click();
		log.info(
				"*****************************************Back Button CLicked For TnC Screen***********************************************");
	}

	public static void clickTnCXButton() {
		PL_Page_TnCScreen.androidTnCXButton.click();
		log.info(
				"*****************************************X Button CLicked For TnC Screen***********************************************");

	}
}
