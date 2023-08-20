package platforms.ui.mobile.ios.iOSPageObjects.GhostPL;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverFactory;

public class STL_Page_CampaignScreen_IOS extends DriverFactory {

	public STL_Page_CampaignScreen_IOS(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// IOS Locators --------------------------------------------->
	public static String iosIminterestedButton = "//XCUIElementTypeStaticText[@name=\"I'm interested\"]";
}
