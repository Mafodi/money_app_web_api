package platforms.ui.mobile.ios.iOSPageObjects.GhostPL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import utils.DriverFactory;

public class Page_DashboardScreen_IOS extends DriverFactory {

	public Page_DashboardScreen_IOS(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// IOS Locators --------------------------------------------------->
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"login_pin_crossButton\"]")
	public static WebElement iosDeclinePinCreation;

	@iOSFindBy(id = "OK")
	public static WebElement iosOkSnackBar;

	@iOSFindBy(id = "More Options")
	public static WebElement iosMoreOption;

	@iOSFindBy(id = "Notifications")
	public static WebElement iosNotificationTab;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
	public static WebElement iosPulsatingIcon;

}
