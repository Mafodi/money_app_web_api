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
public class Page_DashboardScreen extends DriverFactory {
	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);

	public Page_DashboardScreen(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Android Locators --------------------------------------------->
	@AndroidFindBy(id = "imgClose")
	public static MobileElement androidDeclinePinCreation;

	@AndroidFindBy(id = "txvAction")
	public static MobileElement androidOkSnackBar;

	@AndroidFindBy(id = "home_menu_item_more")
	public static MobileElement androidMoreOption;

	@AndroidFindBy(id = "notifications_row")
	public static MobileElement androidNotificationTab;

	@AndroidFindBy(id = "bell_icon")
	public static MobileElement androidPulsatingIcon;

}
