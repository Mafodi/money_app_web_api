package platforms.ui.mobile.ios.iOSPageObjects.DC_HeyJude;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class iOSPaymentCardScreen {

    public iOSPaymentCardScreen(AppiumDriver< MobileElement > iOSDriver) {

        PageFactory.initElements(new AppiumFieldDecorator(iOSDriver), this);
    }

    @iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Payment method\"]")
    public MobileElement PaymentOptionOnCardsScreen;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Add card\"]")
    public List<MobileElement> AddCardScreenTitle;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Delete card\"]")
    public MobileElement deleteAlterTitle;

    @iOSXCUITFindBy(accessibility="CardName")
    public MobileElement cardName;

    @iOSXCUITFindBy(accessibility="CardNumber")
    public MobileElement cardNumber;

    @iOSXCUITFindBy(accessibility="cardDate")
    public MobileElement cardDate;

    @iOSXCUITFindBy(accessibility="CVVNumber")
    public MobileElement cvvNumber;

    @iOSXCUITFindBy(id="AddCardButton")
    public MobileElement addCardButton;

    @iOSXCUITFindBy(id="AddPaymentMethod")
    public MobileElement addAnotherCardButton;

    @iOSXCUITFindBy(xpath=" //XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch")
    public MobileElement defaultCardBtn;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
    public List<MobileElement> CardListXpath;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeImage[@name=\"defaultCheck\"]")
    public List<MobileElement> rightTick;

    @iOSXCUITFindBy(accessibility="Select Nedbank card")
    public MobileElement selectNedbankCard;

    @iOSXCUITFindBy(accessibility="Enter card details")
    public MobileElement enterCardDetails;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"There are no cards to show.\"]")
    public MobileElement noNedbankCard;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
    public MobileElement nedbankCardsList;

}
