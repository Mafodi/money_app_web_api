package platforms.ui.mobile.android.AndroidPageObjects.GhostPL;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.CommonFunctions;
import utils.DriverFactory;

/**
 *
 * @author Agrim Markan
 *
 */

public class Page_NotificationsScreen extends DriverFactory {
	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);

	public Page_NotificationsScreen(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Android Locators --------------------------------------------->
	@AndroidFindBy(id = "offers_container")
	public static MobileElement androidForYouV2;

	@AndroidFindBy(id = "tv_error_msg")
	public static MobileElement androidNoNotificationV2;

	@AndroidFindBy(id = "preapproved_accounts_offers_cellview_root_layout")
	public static MobileElement androidOfferText;

}