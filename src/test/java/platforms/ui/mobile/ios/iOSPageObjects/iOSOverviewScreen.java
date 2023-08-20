package platforms.ui.mobile.ios.iOSPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class iOSOverviewScreen {
    public iOSOverviewScreen(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSFindBy(id = "Transact")
    public WebElement Transact_menu;

    @iOSFindBy(id = "Pay")
    public WebElement Transact_pay;

    @iOSFindBy(id = "OK")
    public WebElement Welcome_OK;

    @iOSFindBy(id = "My accounts")
    public WebElement Overview_MyAccount;

    @iOSFindBy(id = "Transfer")
    public WebElement Transact_transfer;

    @iOSFindBy(id = "Buy")
    public WebElement Transact_buy;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Chat to consultant\"]")
    public MobileElement chatButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"More Options\"]")
    public List<MobileElement> moreButton;

   /* public static String My_Pocket_Close_AccessibilityID = "icon close";
    public static String Welcome_OKButton_AccessbilityID = "OK";*/

   @iOSXCUITFindBy(accessibility = "icon close")
    public MobileElement My_Pocket_Close;

}
