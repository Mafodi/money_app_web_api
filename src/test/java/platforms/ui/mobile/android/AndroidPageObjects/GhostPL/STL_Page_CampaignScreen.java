package platforms.ui.mobile.android.AndroidPageObjects.GhostPL;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.CommonFunctions;
import utils.DriverFactory;

public class STL_Page_CampaignScreen extends DriverFactory {
	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);

	public STL_Page_CampaignScreen(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Android Locators --------------------------------------------->
	@AndroidFindBy(id = "btnAction")
	public static MobileElement androidIminterestedButton;

}