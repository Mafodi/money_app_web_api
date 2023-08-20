package platforms.ui.mobile.ios.iOSPageObjects.DC_LiveChat;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class iOSUnauthChatScreen {
    public iOSUnauthChatScreen(AppiumDriver iOSDriver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iOSDriver), this);
    }

    @iOSXCUITFindBy(id="Name")
    public MobileElement userName;

    @iOSXCUITFindBy(id="Email address")
    public MobileElement emailAddress;

    @iOSXCUITFindBy(id="Submit")
    public MobileElement submitBtn;

    @iOSXCUITFindBy(id="left_button")
    public MobileElement back_btn;

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeStaticText[1]")
    public MobileElement thankYouMsg;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeOther[2]/XCUIElementTypeStaticText")
    public MobileElement chatTitle;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"left_button\"]/following-sibling::XCUIElementTypeStaticText")
    public MobileElement unAuthchatTitle;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Chat\"]")
    public List<MobileElement> chatTitleChat;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextView")
    public MobileElement chatTextBox;

    @iOSXCUITFindBy(id="ChatSend")
    public MobileElement chatSendBtn;

    @iOSXCUITFindBy(id="Please take a moment to rate your experience")
    public List<MobileElement> ratingTitle1;

    @iOSXCUITFindBy(xpath="(//XCUIElementTypeButton[@name=\"nps empty star\"])[5]")
    public MobileElement ratingStar1;

    @iOSXCUITFindBy(id="I would recommend the Nedbank contact centre to friends.")
    public MobileElement ratingTitle2;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"No Thanks\"]")
    public MobileElement NoThanksBtn;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextView")
    public MobileElement commentBox;








}
