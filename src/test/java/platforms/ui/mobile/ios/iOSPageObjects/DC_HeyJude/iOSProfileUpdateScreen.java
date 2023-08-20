package platforms.ui.mobile.ios.iOSPageObjects.DC_HeyJude;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class iOSProfileUpdateScreen {

    public iOSProfileUpdateScreen(AppiumDriver iOSDriver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iOSDriver), this);
    }

    @iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Profile\"]")
    public MobileElement profileScreentile;

    @iOSXCUITFindBy(accessibility="Profile")
    public MobileElement profileMenu;

    @iOSXCUITFindBy(accessibility="name")
    public MobileElement name;

    @iOSXCUITFindBy(accessibility="surname")
    public MobileElement surname;

    @iOSXCUITFindBy(accessibility="cellphone")
    public MobileElement cellphone;

    @iOSXCUITFindBy(accessibility="email")
    public MobileElement email;

    @iOSXCUITFindBy(accessibility="Edit")
    public MobileElement editBtn;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Edit profile\"]")
    public MobileElement editProfileScreenTitle;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@name=\"name\"]")
    public MobileElement editName;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@name=\"surname\"]")
    public MobileElement editSurname;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@name=\"cellphone\"]")
    public MobileElement editCellphone;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@name=\"email\"]")
    public MobileElement editEmail;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Save\"]")
    public MobileElement saveBtn;


}
