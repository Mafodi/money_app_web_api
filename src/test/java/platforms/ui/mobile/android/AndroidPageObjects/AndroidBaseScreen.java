package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AndroidBaseScreen {

    public AndroidBaseScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id= "btn_continue")
    public MobileElement CONTINUE_WITH_THIS_VERSION;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
    public MobileElement BTN_NEXT;
    @AndroidFindBy(id = "tv_login")
    public MobileElement LOGIN;
    @AndroidFindBy(xpath = "//android.widget.EditText[@password='false' and @index='0']")
    public MobileElement NED_USERNAME;
    @AndroidFindBy(xpath = "//android.widget.EditText[@password='true' and @index='0']")
    public MobileElement NED_PASSWORD;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@index='0']")
    public MobileElement ACCEPTTerm;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Log in']")
    public MobileElement LOGIN_BUTTON;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
    public MobileElement NEXT_LOGIN;
    @AndroidFindBy(id = "imageView2")
    public MobileElement MYPOCKETCLOSE;
    @AndroidFindBy(id = "tvSkipPinBiometric")
    public MobileElement SKIP_PIN;
    @AndroidFindBy(id = "btnAction")
    public MobileElement BTN_NEXT_ACTION;
    @AndroidFindBy(id = "permission_allow_button")
    public MobileElement ALLOW_BUTTON;
    @AndroidFindBy(id = "android:id/button1")
    public MobileElement CONFIRM_BUTTON;
    @AndroidFindBy(id = "za.co.nedbank.qa:id/tv_login")
    public MobileElement loginButton;
    @AndroidFindBy(id = "za.co.nedbank.qa:id/cedtNedbankId")
    public MobileElement login_emailid;
    @AndroidFindBy(id = "za.co.nedbank.qa:id/cedtPassword")
    public MobileElement login_password;
    @AndroidFindBy(id = "za.co.nedbank.qa:id/btn_continue")
    public MobileElement continueButton;
    @AndroidFindBy(id = "android:id/button2")
    public MobileElement CANCEL_BUTTON;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    public MobileElement BACK_ICON;
    @AndroidFindBy(id = "tv_login")
    public MobileElement Login_Button;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
    public MobileElement nextButton;
    @AndroidFindBy(id = "menu_item_chat")
    public MobileElement MENU_CHAT;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.EditText")
    public MobileElement CHAT_NAME;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.EditText")
    public MobileElement CHAT_EMAIL;
    @AndroidFindBy(xpath = "//androidx.appcompat.app.ActionBar.Tab[2]/android.widget.LinearLayout")
    public MobileElement LOGIN_FOOTER;

    public static String ALLOW_BTN_ID = "permission_allow_button";
    public static String RegisterBtn = "//android.widget.Button[@text='Register']";
    public static String LogIn = "//android.widget.TextView[@text = 'Log in']";
    public static  String ROOTED_DEVICE_WARNING_NEXT = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Next\"));";
    public static String CLOSE_CREATE_PIN_BTN = "imgClose";
    public static String FINGERPRINT_IMAGE = "imgPinBiometric";
    public static String CANCEL_DIALOG = "button2";


}
