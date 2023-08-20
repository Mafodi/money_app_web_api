package platforms.ui.mobile.ios.iOSPageObjects.DC_HeyJude;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class iOSTermsAndConditions {
    public iOSTermsAndConditions(AppiumDriver<MobileElement> iOSDriver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iOSDriver), this);
    }

    @iOSXCUITFindBy(accessibility = "Review our terms and conditions")
    public MobileElement reviewTnCTitle;

    @iOSXCUITFindBy(id = "HeyNed")
    public MobileElement heyNedOption;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nedbank app Terms & Conditions\"]")
    public MobileElement heyNedTnCText;

}
