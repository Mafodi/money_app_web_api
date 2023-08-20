package platforms.ui.mobile.ios.iOSPageObjects.GhostPL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import utils.DriverFactory;

public class Page_LoginSteps_IOS extends DriverFactory {

	public Page_LoginSteps_IOS(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// ******************* Locators ************************
	// IOS Locators --------------------------------------------------->
	@iOSFindBy(id = "Allow")
	public WebElement iosAllowButtonV2;

	@iOSFindBy(id = "Allow Once")
	public WebElement iosAllow2ButtonV2;

	@iOSFindBy(id = "Ignore")
	public WebElement iosUpgradeButtonV2;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Continue\"]")
	public static WebElement iosContinueButtonV2;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]")
	public static WebElement iosNextButtonV2;

	@iOSFindBy(id = "I'm a client")
	public static WebElement iosIamclientV2;

	@iOSFindBy(id = "I don’t have a card")
	public static WebElement iosIDonehaveCard;

	@iOSFindBy(id = "Business profile")
	public static WebElement iosBusinessProfile;

	@iOSFindBy(id = "Nedbank ID")
	public static WebElement iosNedbankIDTagV2;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Username\"]")
	public static WebElement iosUserNameV2;

	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Password\"]")
	public static WebElement iosPasswordV2;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"checkBoxOff\"]")
	public static WebElement iosTnCCheckboxV2;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"]")
	public static WebElement iosLoginNextV2;

	@iOSFindBy(id = "Skip")
	public static WebElement SkipFingerPrint;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"]")
	public static WebElement NextButtonToLinkAccounts;

	// XCUIElementTypeButton[@name="Next"]

}
