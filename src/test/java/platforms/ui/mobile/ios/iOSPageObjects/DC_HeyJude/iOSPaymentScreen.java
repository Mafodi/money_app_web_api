package platforms.ui.mobile.ios.iOSPageObjects.DC_HeyJude;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

import java.util.List;

public class iOSPaymentScreen extends DriverFactory {

    public iOSPaymentScreen(AppiumDriver<MobileElement> iOSDriver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iOSDriver), this);
    }


    @iOSXCUITFindBy(id="You can add your preferred payment method below.")
    public List<MobileElement> noCardAddedMessage;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"payNowButton\"]")
    public MobileElement payNowButton;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"payNowButton\"]")
    public MobileElement payNowOnPaymentScreen;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Pay HeyNed Lifestyle\"]")
    public MobileElement paymentScreenTitle;

    @iOSXCUITFindBy(accessibility="doneButton")
    public MobileElement doneButton;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]")
    public List<MobileElement> alreadyAddedCard;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Payment method\"]")
    public MobileElement paymentMethodScreenTitle;

    @iOSXCUITFindBy(id="Add payment method")
    public MobileElement addPaymentMethosBtnOnHeyNed;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]")
    public MobileElement addedCard;


}
