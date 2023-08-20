package platforms.ui.mobile.ios.iOSPageObjects.GhostPL;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverFactory;

public class PL_Page_TnCScreen_IOS extends DriverFactory {
	public PL_Page_TnCScreen_IOS(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// IOS Locators --------------------------------------------------->
	public static String iosTnCTitle = "//XCUIElementTypeNavigationBar[@name=\"Terms and conditions\"]";
	public static String iosTnCAgreeButton = "//XCUIElementTypeButton[@name=\"Agree\"]";
	public static String iosTnCDisagreeButton = "//XCUIElementTypeButton[@name=\"Disagree\"]";
	public static String iosTnCBackButton = "//XCUIElementTypeButton[@name=\"Disclosures\"]";
	public static String iosTnCXButton = "//XCUIElementTypeButton[@name=\"Stop\"]";

}
