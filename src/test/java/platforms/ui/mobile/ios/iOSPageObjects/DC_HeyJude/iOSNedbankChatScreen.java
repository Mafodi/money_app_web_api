package platforms.ui.mobile.ios.iOSPageObjects.DC_HeyJude;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class iOSNedbankChatScreen {

    public static String chatToServiceAgent_id = "Chat to a Nedbank service agent";

    public static String chatToHeyNedAgent_id = "Chat to a HeyNed lifestyle assistant";

    public iOSNedbankChatScreen(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Chat to a HeyNed lifestyle assistant\"]")
    public MobileElement heyNedOption;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Chat to a Nedbank service agent\"]")
    public MobileElement liveChatOption;

}
