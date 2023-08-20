package platforms.ui.mobile.android.AndroidPageObjects.GhostPL;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverFactory;

/**
 *
 * @author Agrim Markan
 *
 */
public class PL_Page_DisclosureScreen extends DriverFactory {

	public PL_Page_DisclosureScreen(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Android Locators --------------------------------------------->
	public static String androidDisclosureRadioButton1 = "//android.widget.RadioButton[@index='0']";
	public static String androidDisclosureRadioButton2 = "//android.widget.RadioButton[@index='1']";

	@AndroidFindBy(id = "btnAction")
	public static MobileElement androidDisclosureConfirmButton;

	@AndroidFindBy(id = "btnAction")
	public static MobileElement androidDisclosureTnCButton;

	@AndroidFindBy(id = "disclosures_tnc_error_text")
	public static MobileElement androidDisclosureTnCDisagreeError;

//	@AndroidFindBy(id = "txvPickerText")
//	public static MobileElement androidDisclosureReasonsTab;
	public static String androidDisclosureReasonsTab = "txvPickerText";

	@AndroidFindBy(className = "android.widget.ImageButton")
	public static MobileElement androidDisclosureReasonsScreenBack;

	@AndroidFindBy(className = "android.widget.TextView")
	public static MobileElement androidDisclosureReasonScreenTitle;

	@AndroidFindBy(id = "menu_item_close")
	public static MobileElement androidDisclosureXButton;

}