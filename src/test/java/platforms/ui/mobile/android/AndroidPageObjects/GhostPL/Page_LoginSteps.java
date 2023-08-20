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

public class Page_LoginSteps extends DriverFactory {

	public Page_LoginSteps(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// ******************* Locators ************************
	// Android Locators --------------------------------------------->
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	public static MobileElement androidAllowButtonV2;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
	public static MobileElement androidNextButtonV2;

	@AndroidFindBy(id = "btn_continue")
	public static MobileElement androidContinueButtonV2;

	@AndroidFindBy(xpath = "(//android.widget.Button)[2]")
	public static MobileElement androidIDonehaveCard;

	@AndroidFindBy(xpath = "//*[contains(@class,'android.widget.TextView') and contains(@text,'Nedbank ID')]")
	public static MobileElement androidNedbankIDTagV2;

	@AndroidFindBy(xpath = "//android.widget.CheckBox[@index='0']")
	public static MobileElement androidTnCCheckboxV2;

	@AndroidFindBy(xpath = "//*[contains(@class,'android.widget.Button') and contains(@text,'Next')]")
	public static MobileElement androidLoginNextV2;

	@AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
	public static MobileElement androidUserNameV2;

	@AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
	public static MobileElement androidPasswordV2;
	
	@AndroidFindBy(id = "tvSkipPinBiometric")
	public static MobileElement androidSkipPin;
	
	@AndroidFindBy(id = "btnAction")
	public static MobileElement nextButtonLinkAccounts;
}