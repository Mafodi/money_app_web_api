package platforms.ui.mobile.ios.iOSPageObjects.GhostPL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import utils.DriverFactory;

public class Page_NotificationScreen_IOS extends DriverFactory {

	public Page_NotificationScreen_IOS(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// IOS Locators --------------------------------------------------->
	@iOSFindBy(id = "Offers for you")
	public static WebElement iosForYouV2;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"No notifications available\"]")
	public static WebElement iosNoNotificationV2;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\\\"Money\\\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell\\n")
	public static WebElement iosOfferText;

}
