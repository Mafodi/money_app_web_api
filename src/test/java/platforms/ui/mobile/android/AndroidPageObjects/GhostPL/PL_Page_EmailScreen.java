package platforms.ui.mobile.android.AndroidPageObjects.GhostPL;

import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
public class PL_Page_EmailScreen extends DriverFactory {
	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);

	public PL_Page_EmailScreen(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Log4J
	private static Logger log = Logger.getLogger(PL_Page_EmailScreen.class.getName());

	// Android Locators --------------------------------------------->
	@AndroidFindBy(className = "android.widget.TextView")
	public static MobileElement androidEmailScreenTitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"We're almost done\"]")
	public static MobileElement androidEmailScreenHeading;

	@AndroidFindBy(id = "view_email_text_view")
	public static MobileElement androidEmailScreenText1;

	@AndroidFindBy(id = "txvLabel")
	public static MobileElement androidEmailScreenText2;

	@AndroidFindBy(id = "edtInput")
	public static MobileElement andoidEmailScreenEmailID;

	@AndroidFindBy(className = "android.widget.ImageButton")
	public static MobileElement androidEmailScreenBackButton;

	@AndroidFindBy(id = "menu_item_close")
	public static MobileElement androidEmailScreenXButton;

	@AndroidFindBy(id = "txvError")
	public static MobileElement androidInvalidEmailErrorMessageV2;

	@AndroidFindBy(id = "btnAction")
	public static MobileElement androidEmailScreenConfirmButton;

	
}