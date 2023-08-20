package platforms.ui.mobile.android.AndroidPageObjects.GhostPL;

import java.util.logging.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverFactory;

/**
 * 
 * @author Agrim Markan
 *
 */
public class PL_Page_YourInformationScreen extends DriverFactory {
	public PL_Page_YourInformationScreen(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Android Locators --------------------------------------------->
	public static String androidPLYourInformationTitleV2 = "//*[contains(@class,'android.widget.TextView') and contains(@text,'Your Information')]";
	public static String androidPLYourInformationHeadingV2 = "view_user_info_screen_title";
	// private static String androidPLYourInformationText1V2 =
	// "//android.widget.TextView[@text='Total monthly income']";
	// private static String androidPLYourInformationText2V2 =
	// "//android.widget.TextView[@text='Total monthly living expenses']";
	// private static String androidPLYourInformationText3V2 =
	// "//android.widget.TextView[@text='Total monthly debt obligations']";
	public static String androidPLYourInformationToolTip1Iconv2 = "(//android.widget.ImageView)[1]";
	public static String androidPLYourInformationToolTip2Iconv2 = "(//android.widget.ImageView)[2]";
	public static String androidPLYourInformationToolTip3Iconv2 = "(//android.widget.ImageView)[3]";
	public static String androidPLYourInformationToolTip1TextV2 = "nbsliding_tooltip_description";
	public static String androidPLYourInformationToolTip2TextV2 = "nbsliding_tooltip_description";
	public static String androidPLYourInformationToolTip3TextV2 = "nbsliding_tooltip_description";
	// private static String androidPLYourInformationInformationIncorrectTextV2 =
	// strCapAppPackage+":id/view_user_info_incorrect_message_tv";
	public static String androidPLYourInformationInformationIncorrectToolTipTextV2 = "view_offer_item_value_subtext_tv";
	public static String androidPLYourInformationInformationIncorrectYesToggleV2 = "switch_field_positive_button";
	public static String androidPLYourInformationInformationIncorrectNoToggleV2 = "switch_field_negative_button";
	public static String androidPLYourInformationConfirmButtonV2 = "btnAction";
	public static String androidPLYourInformationBackButtonV2 = "android.widget.ImageButton";
	public static String androidPLYourInformationXButton = "menu_item_close";
	public static String androidConsolidationToolTip = "android.widget.ImageView";
	public static String androidConsoldiationToolTipText = "nbsliding_tooltip_description";

}
