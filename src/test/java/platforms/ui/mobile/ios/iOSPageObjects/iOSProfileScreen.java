package platforms.ui.mobile.ios.iOSPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class iOSProfileScreen {

    public iOSProfileScreen(AppiumDriver< MobileElement > iOSDriver) {

        PageFactory.initElements(new AppiumFieldDecorator(iOSDriver), this);
    }
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Settings\"]")
    public MobileElement settingOption;

    @iOSXCUITFindBy(id="HeyNed settings")
    public MobileElement heyNedSettingOption;

    @iOSXCUITFindBy(id="Terms and conditions")
    public MobileElement termsAndConditions;

    @iOSXCUITFindBy(accessibility="Log out")
    public MobileElement logOut;

}
