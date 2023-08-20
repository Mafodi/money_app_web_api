package platforms.ui.mobile.ios.iOSPageObjects.GhostPL;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverFactory;

public class PL_Page_YourInformationScreen_IOS extends DriverFactory {

	public PL_Page_YourInformationScreen_IOS(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// IOS Locators --------------------------------------------------->
	public static String iosPLYourInformationTitleV2 = "//XCUIElementTypeNavigationBar[@name=\"Your Information\"]";
	public static String iosPLYourInformationHeadingV2 = "//XCUIElementTypeStaticText[@name=\"Your monthly income and expenses\"]";
	public static String iosPLYourInformationText1V2 = "(//android.widget.TextView)[3]";
	public static String iosPLYourInformationText2V2 = "(//android.widget.TextView)[4]";
	public static String iosPLYourInformationText3V2 = "(//android.widget.TextView)[5]";
	public static String iosPLYourInformationToolTip1V2 = "(//XCUIElementTypeButton[@name=\"More Info\"])[1]";
	public static String iosPLYourInformationToolTip2V2 = "(//XCUIElementTypeButton[@name=\"More Info\"])[2]";
	public static String iosPLYourInformationToolTip3V2 = "(//XCUIElementTypeButton[@name=\"More Info\"])[3]";
	public static String iosPLYourInformationInformationIncorrectTextV2 = "(//android.widget.TextView)[5]";
	public static String iosPLYourInformationInformationIncorrectToolTipV2 = "(//android.widget.TextView)[5]";
	public static String iosPLYourInformationInformationIncorrectYesToggleV2 = "Yes";
	public static String iosPLYourInformationInformationIncorrectNoToggleV2 = "No";
	public static String iosPLYourInformationConfirmButtonV2 = "Confirm";
	public static String iosPLYourInformationBackButtonV2 = "back white";
	public static String iosPLYourInformationXButton = "Stop";
	public static String iosConsolidationToolTip = "(//XCUIElementTypeButton[@name=\"More Info\"])[3]";
	public static String iosConsoldiationToolTipText = "The outstanding amount is an indicative amount used to calculate the offer and may differ from your outstanding balance or settlement amount";

}
