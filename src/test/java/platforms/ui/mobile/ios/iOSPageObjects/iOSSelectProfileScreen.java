package platforms.ui.mobile.ios.iOSPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class iOSSelectProfileScreen {

    public iOSSelectProfileScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Business profile\"]")
    public WebElement Business_Profile;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Personal profile\"]")
    public MobileElement Personal_Profile;


    //public String business_Profile_Xpath = "//XCUIElementTypeButton[@name=\"Business profile\"]";


}
