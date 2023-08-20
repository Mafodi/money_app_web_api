package platforms.ui.mobile.ios.iOSPageObjects.DC_HeyJude;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class iOSSubscriptionScreen {

    public iOSSubscriptionScreen(AppiumDriver iOSDriver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iOSDriver), this);
    }

    @iOSXCUITFindBy(accessibility="subscriptionTitle")
    public MobileElement subscriptionHeading;

    @iOSXCUITFindBy(accessibility="T&Cs")
    public MobileElement termsAndConditions;

    @iOSXCUITFindBy(accessibility="closeButton")
    public MobileElement closeBtn;

    //RegistrationScreen Locators
    @iOSXCUITFindBy(accessibility="registrationTitle")
    public List<MobileElement> registrationTitle;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTable[@name=\"This information will be used only to create your HeyNed profile – it is separate from your banking profile and won’t update any details.\"]/XCUIElementTypeTextField[1]")
    public MobileElement regName;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTable[@name=\"This information will be used only to create your HeyNed profile – it is separate from your banking profile and won’t update any details.\"]/XCUIElementTypeTextField[4]")
    public MobileElement regSurname;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTable[@name=\"This information will be used only to create your HeyNed profile – it is separate from your banking profile and won’t update any details.\"]/XCUIElementTypeTextField[2]")
    public MobileElement regCellphoneNumber;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTable[@name=\"This information will be used only to create your HeyNed profile – it is separate from your banking profile and won’t update any details.\"]/XCUIElementTypeTextField[3]")
    public MobileElement regEmail;

    //Review subscriptoin title

    @iOSXCUITFindBy(accessibility="ReviewSubscriptionTitle")
    public List<MobileElement> reviewSubscriptionTitle;

    @iOSXCUITFindBy(accessibility="cardName")
    public MobileElement revirewSubCardName;

    @iOSXCUITFindBy(accessibility="cardNumber")
    public MobileElement reviewSubCarNumber;

    @iOSXCUITFindBy(accessibility="Subscribe")
    public MobileElement subscribeButton;

    @iOSXCUITFindBy(accessibility="CVVNumber")
    public MobileElement cvvNumber;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"addNedbankCardTitle\"]")
    public List<MobileElement> subscriptionPayementScreen;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
    public List<MobileElement> nedbankCardForPayment;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Create your HeyNed profile\"]")
    public MobileElement registrationScreenTitle;

    //From More menu


    @iOSXCUITFindBy(xpath="//*[@name=\"Edit profile\"]")
    public MobileElement editProfileScreen;


    @iOSXCUITFindBy(xpath="//XCUIElementTypeSwitch[@name=\"Push notifications\"]")
    public MobileElement pushNotification;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Retry\"]")
    public MobileElement hangTightErrorRetry;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]")
    public MobileElement subscriptionOption;


    //Deactivate Subscription
    @iOSXCUITFindBy(accessibility="Deactivate subscription")
    public List<MobileElement> deactivateSubscription;


    @iOSXCUITFindBy(accessibility="Sure you’d like to deactivate your subscription?")
    public MobileElement deactivateSubscriptionText;

    @iOSXCUITFindBy(accessibility="Not now")
    public MobileElement notNowBtn;

    @iOSXCUITFindBy(accessibility="Deactivate")
    public MobileElement deactivateBtn;


    @iOSXCUITFindBy(accessibility="Activate subscription")
    public List<MobileElement> activateSubscriptionBtn;

    @iOSXCUITFindBy(accessibility="successMessage")
    public MobileElement subscriptionSuccessMessage;

//Lifistyle Success Symbol - lifestyleSubscriptionSuccess
    //SuccessMessage - successMessage

    @iOSXCUITFindBy(accessibility="Next")
    public MobileElement nextButton;

}
