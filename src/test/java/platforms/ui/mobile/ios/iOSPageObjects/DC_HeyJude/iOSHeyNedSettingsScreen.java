package platforms.ui.mobile.ios.iOSPageObjects.DC_HeyJude;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class iOSHeyNedSettingsScreen {

    public iOSHeyNedSettingsScreen(AppiumDriver iOSDriver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iOSDriver), this);
    }

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Payment methods\"]")
    public MobileElement paymentMethodOption;

}
