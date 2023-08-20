package platforms.ui.mobile.ios.iOSPageObjects.GhostPL;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverFactory;

public class PL_Page_LetsGetStarted_IOS extends DriverFactory {

	public PL_Page_LetsGetStarted_IOS(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// IOS Locators --------------------------------------------------->
	public static String iosPLLetsgetstartedTitleV2 = "Let’s get started";
	public static String iosPLLetsgetstartedHeadingV2 = "(//XCUIElementTypeStaticText[@name=\"As a loyal Nedbank client, you could qualify for a personal loan of up to R50 000.00.\"])[1]";
	public static String iosPLLetsgetstartedText4V2 = "To get a decision in a few minutes, please confirm that:";
	public static String iosPLLetsgetstartedCheckBox1 = "(//XCUIElementTypeImage[@name=\"iconTickBox\"])[1]";
	public static String iosPLLetsgetstartedCheckBox2 = "iconTickBox";
	public static String iosPLLetsgetstartedCheckBox3 = "iconTickBox";
	public static String iosPLLetsgetstartedCheckBox1TextV2 = "you're permanently employed;";
	public static String iosPLLetsgetstartedCheckBox2TextV2 = "neither you nor your spouse is insolvent, under administration, curatorship or undergoing debt counselling and that neither you nor your spouse has any pending disputes with a credit bureau.";
	public static String iosPLLetsgetstartedCheckBox3TextV2 = "You consent to us processing your personal information so that we can provide banking services to you.";
	public static String iosPLLetsgetstartedConfirmButtonV2 = "Confirm";
	public static String iosPLLetsgetstartedBackButtonV2 = "Notifications";
	public static String iosConsolidationLetsgetstartedText1V2 = "Are you tired of paying multiple loan accounts every month?";
	public static String iosConsolidationLetsgetstartedText2V2 = "Allow us to settle your loans on your behalf so that you:";
	public static String iosConsolidationLetsgetstartedText3V2 = "Can pay a fixed monthly instalment at a fixed interest rate; and could qualify for a reduced monthly instalment on your loan.";
	public static String iosConsolidationLetsgetstartedText4V2 = "To get a decision in a few minutes, please confirm that:";
	public static String iosConsolidationLetsgetstartedCheckBox1 = "(//XCUIElementTypeImage[@name=\"iconTickBox\"])[1]";
	public static String iosConsolidationLetsgetstartedCheckBox2 = "iconTickBox";
	public static String iosConsolidationLetsgetstartedCheckBox3 = "iconTickBox";
	public static String iosConsolidationLetsgetstartedCheckBox1TextV2 = "you're permanently employed;";
	public static String iosConsolidationLetsgetstartedCheckBox2TextV2 = "neither you nor your spouse is insolvent, under administration, curatorship or undergoing debt counselling and that neither you nor your spouse has any pending disputes with a credit bureau.";
	public static String iosConsolidationLetsgetstartedCheckBox3TextV2 = "You consent to us processing your personal information so that we can provide banking services to you.";

}
