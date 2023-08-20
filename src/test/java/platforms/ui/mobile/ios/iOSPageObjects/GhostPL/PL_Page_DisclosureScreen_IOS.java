package platforms.ui.mobile.ios.iOSPageObjects.GhostPL;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverFactory;

public class PL_Page_DisclosureScreen_IOS extends DriverFactory {

	public PL_Page_DisclosureScreen_IOS(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// IOS Locators --------------------------------------------------->
	public static String iosDisclosureScreenTitle = "//XCUIElementTypeNavigationBar[@name=\"Disclosures\"]";
	public static String iosDisclosureScreenText1 = "DEBIT ORDER MANDATE";
	public static String iosDisclosureScreenText2 = "Your instalment is due from the 1st of next month and you consent to our debiting your Nedbank salary account on the day your salary is paid.";
	public static String iosDisclosureScreenText3 = "CREDIT AND FRAUD CHECK MANDATE";
	public static String iosDisclosureScreenText4 = "By accepting this offer, you agree that Nedbank may do credit and fraud checks when necessary.";
	public static String iosDisclosureScreenText5 = "HONESTY";
	public static String iosDisclosureScreenText6 = "You confirm that the information you've provided is correct.";
	public static String iosDisclosureScreenText7 = "SPOUSAL CONSENT";
	public static String iosDisclosureScreenText8 = "If you're married in community of property or if you were married outside of South Africa, your spouse must agree in writing to your taking up this loan.";
	public static String iosDisclosureScreenText9 = "What's the reason for taking out the loan?";
	public static String iosDisclosureScreenConfirmButton = "Confirm";
	public static String iosDisclosureScreenReasonForTakingLoan = "Select an option";
	public static String iosDisclosureScreenCheckbox1 = "I confirm that my spouse has agreed to the above.";
	public static String iosDisclosureScreenCheckbox2 = "This doesn't apply to me.";
	public static String iosDisclosureScreenXButton = "Stop";
	public static String iosReasonsScreenTitle = "//XCUIElementTypeNavigationBar[@name=\"Select an option\"]";
	public static String iosReasonsScreenBackButton = "back white";
	public static String iosDisclosureTnCButton = "//XCUIElementTypeButton[@name=\"Read and accept Ts & Cs\"]";
	public static String iosDisclosureTnCDisagreeError = "//XCUIElementTypeStaticText[@name=\"To continue with this application, please read and accept your policy terms and conditions.\"]";

}
