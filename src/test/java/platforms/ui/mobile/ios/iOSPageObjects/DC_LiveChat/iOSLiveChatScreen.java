package platforms.ui.mobile.ios.iOSPageObjects.DC_LiveChat;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class iOSLiveChatScreen {

    public iOSLiveChatScreen(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Chat\"]/XCUIElementTypeButton[2]")
    public MobileElement endChatButton;

    @iOSXCUITFindBy(id = "End")
    public MobileElement endOption;

    @iOSXCUITFindBy(id = "Cancel")
    public MobileElement cancelOption;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextView")
    public MobileElement chatTextBox;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeStaticText")
    public MobileElement welcomeMsg;

    @iOSXCUITFindBy(id = "left_button")
    public MobileElement backButtonFromChat;

    @iOSXCUITFindBy(id = "BackAccessiblity")
    public MobileElement backButton;


    //credit card chat locators
    @iOSXCUITFindBy(id = "Get the perfect solution for your needs")
    public MobileElement getPerfctSolutionForYourNeed;

    @iOSXCUITFindBy(id = "Apply")
    public MobileElement apply;

    @iOSXCUITFindBy(id = "Credit cards")
    public MobileElement creditCardsOption;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Chat with a Nedbank agent\"]")
    public MobileElement chatToNedbankAgent;


    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Open\"])[1]")
    public MobileElement openBankAccountBundle;
}
