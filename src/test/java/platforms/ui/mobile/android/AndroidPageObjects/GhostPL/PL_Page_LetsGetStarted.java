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

public class PL_Page_LetsGetStarted extends DriverFactory {

	public PL_Page_LetsGetStarted(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Android Locators --------------------------------------------->
	@AndroidFindBy(id = "view_preapproved_offers_disclaimers_title")
	public static MobileElement androidPLLetsgetstartedTitleV2;

	@AndroidFindBy(id = "view_preapproved_offers_disclaimers_disclaimer_heading")
	public static MobileElement androidPLLetsgetstartedHeadingV2;

	@AndroidFindBy(id = "btnAction")
	public static MobileElement androidPLLetsgetstartedConfirmButtonV2;

	@AndroidFindBy(className = "android.widget.ImageButton")
	public static MobileElement androidPLLetsgetstartedBackButtonV2;

	@AndroidFindBy(className = "android.widget.CheckBox")
	public static MobileElement androidConsolidationLetsgetstartedCheckBoxListV2;

	public static String androidPLLetsgetstartedCheckBoxListV2 = "android.widget.CheckBox";

}
