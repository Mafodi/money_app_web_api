package platforms.ui.mobile.ios.iOSPageObjects.DC_HeyJude;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class iOSDataUsageScreen {


    public iOSDataUsageScreen(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = "info_icon_pdf")
    public List<MobileElement> dataUsageIcon;

    @iOSXCUITFindBy(accessibility = "Data usage in app")
    public MobileElement dataUsageScreentext;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"]")
    public MobileElement nextBtnDataUsageScreen;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"icon Unselected\"])[1]")
    public MobileElement checkBox;


}
