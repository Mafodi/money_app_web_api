package platforms.ui.mobile.ios.iOSPageObjects.GhostPL;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverFactory;

public class PL_Page_ReviewScreen_IOS extends DriverFactory {

	public PL_Page_ReviewScreen_IOS(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
}
