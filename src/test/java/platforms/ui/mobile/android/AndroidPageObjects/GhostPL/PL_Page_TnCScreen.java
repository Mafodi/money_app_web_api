package platforms.ui.mobile.android.AndroidPageObjects.GhostPL;

import java.util.logging.Logger;
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
public class PL_Page_TnCScreen extends DriverFactory {

	public PL_Page_TnCScreen(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Android Locators --------------------------------------------->
	@AndroidFindBy(className = "android.widget.TextView")
	public static MobileElement androidTnCTitle;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Agree\"]")
	public static MobileElement androidTnCAgreeButton;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Disagree\"]")
	public static MobileElement androidTnCDisagreeButton;

	@AndroidFindBy(className = "android.widget.ImageButton")
	public static MobileElement androidTnCBackButton;

	@AndroidFindBy(id = "menu_item_close")
	public static MobileElement androidTnCXButton;

}
