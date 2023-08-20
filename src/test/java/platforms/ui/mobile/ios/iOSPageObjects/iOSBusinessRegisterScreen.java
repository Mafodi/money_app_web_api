package platforms.ui.mobile.ios.iOSPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class iOSBusinessRegisterScreen {

    public iOSBusinessRegisterScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Nedbank ID\"]")
    public WebElement NedBankIDTab;




}
