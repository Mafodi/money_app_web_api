package platforms.ui.mobile.ios.iOSPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class iOSVASPurchaseDetailsScreen {

    public iOSVASPurchaseDetailsScreen(AppiumDriver<MobileElement> iOSDriver) {

        PageFactory.initElements(new AppiumFieldDecorator(iOSDriver), this);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Next\"]")
    public WebElement PurchaseDetailsNextButton;


}
