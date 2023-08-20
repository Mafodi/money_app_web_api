package platforms.ui.mobile.ios.iOSPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class iOSBaseScreen {
    public iOSBaseScreen(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSFindBy(id= "Continue")
    public WebElement Root_Continue;

    @iOSFindBy(id= "Continue with this version")
    public WebElement CONTINUE_WITH_THIS_VERSION;

    @iOSFindBy(id = "Username")
    public WebElement NED_USERNAME;

    @iOSFindBy(id = "Password")
    public WebElement NED_PASSWORD;

    @iOSFindBy(id = "checkBoxOff")
    public WebElement ACCEPTTerm;

    @iOSFindBy(id="Landing_Login_Button")
    public WebElement Login_Button;

    @iOSFindBy(id = "Log in")
    public WebElement NEXT_LOGIN;

    @iOSFindBy(id = "imageView2")
    public WebElement MyPocketClose;

    @iOSFindBy (xpath = "//XCUIElementTypeButton[@name=\"Next\"]\n")
    public WebElement BusinessRegistrationNextButton;


}
