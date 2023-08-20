package platforms.ui.mobile.ios.iOSPageObjects.GhostPL;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverFactory;

public class PL_Page_EmailScreen_IOS extends DriverFactory {
	public PL_Page_EmailScreen_IOS(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// IOS Locators --------------------------------------------------->
	public static String iosEmailScreenTitle = "//XCUIElementTypeNavigationBar[@name=\"Final step\"]";
	public static String iosEmailScreenHeading = "//XCUIElementTypeStaticText[@name=\"We’re almost done\"]";
	public static String iosEmailScreenText1 = "//XCUIElementTypeStaticText[@name=\"This is the last step of your application before your funds will be paid into your account.\"]";
	public static String iosEmailScreenText2 = "//XCUIElementTypeStaticText[@name=\"This is the email adress we’ll send all your documents to.\"]";
	public static String iosEmailScreenEmailID = "";
	public static String iosEmailScreenBackButton = "//XCUIElementTypeButton[@name=\"Terms and conditions\"]";
	public static String iosEmailScreenXButton = "//XCUIElementTypeButton[@name=\"login_pin_crossButton\"]";
	public static String iosInvalidEmailErrorMessageV2 = "";
	public static String iosEmailScreenConfirmButton = "//XCUIElementTypeButton[@name=\"Confirm\"]";
}
