package platforms.ui.mobile.ios.iOSPageObjects.GhostPL;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverFactory;

public class PL_Page_YourOfferScreen_IOS extends DriverFactory {
	public PL_Page_YourOfferScreen_IOS(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// IOS Locators --------------------------------------------------->
	public static String iosPLYourOfferTitleV2 = "//XCUIElementTypeOther[@name=\"Your offer\"]";
	public static String iosPLTermsClickV2 = "";
	public static String iosPLRecalculateButtonV2 = "//XCUIElementTypeButton[@name=\"Recalculate\"]";
	public static String iosPLConfirmButtonV2 = "Confirm";
	public static String iosPLMonthlyRepaymentV2 = "//XCUIElementTypeTextField[@name=\"emiValueField\"]";
	public static String iosPLOutOfLimitErrorV2 = "";
	public static String iosPLYourOfferBackButtonV2 = "//XCUIElementTypeButton[@name=\"Your information\"]";
	public static String iosYourOfferXButtonV2 = "//XCUIElementTypeButton[@name=\"Stop\"]";
	public static String iosYourOfferText1 = "Personal loan amount";
	public static String iosYourOfferText3 = "Select your term (months)";
	public static String iosYourOfferText4 = "Your monthly repayment will be:";
	public static String iosTermScreenTitle = "Term";
	public static String iosTermsScreenBackButton = "//XCUIElementTypeButton[@name=\"back white\"]";

}
