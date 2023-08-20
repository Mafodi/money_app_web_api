package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class AndroidLoadCardScreen extends DriverFactory {

    public AndroidLoadCardScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "lifestyle_add_payment_method")
    public MobileElement LOAD_ADD_ANOTHER_CARD;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText")
    public MobileElement LOAD_CARD_NAME;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.EditText")
    public MobileElement LOAD_CARD_NUMBER;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText")
    public MobileElement LOAD_CARD_MMYY;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.EditText")
    public MobileElement LOAD_CARD_CVV;

    @AndroidFindBy(id = "lifestyle_default_card_layout")
    public MobileElement DEFAULT_CARD_OPTION;

    @AndroidFindBy(id = "add_payment_method")
    public MobileElement ADD_ANOTHER_CARD;

    @AndroidFindBy(id = "tv_from_nedbank")
    public MobileElement SELECT_NEDBANK_CARD;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='AMEX BLUE CREDIT CARD']")
    public MobileElement ADD_CARD_AMEXCARD;

    @AndroidFindBy(id = "tv_from_other_bank")
    public MobileElement ENTER_CARD_DETAILS;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment method']")
    public MobileElement CHAT_PAYMENT_METHOD_TITLE;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TT MALOPE']")
    public MobileElement CHAT_LOAD_CARD_NAME;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='HeyNed settings']")
    public MobileElement CHAT_HEYNED_SETTINGS_TITLE;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
    public MobileElement CHAT_SETTINGS_TITLE;

    @AndroidFindBy(id = "rvProfiles")
    public MobileElement CHAT_MORE_TITLE;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Great! Your HeyNed lifestyle service is active.']")
    public MobileElement CHAT_SUBSCRIBE_ACTIVE;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Subscribe using this card']")
    public MobileElement CHAT_SUBSCRIBE_CARD_TITLE;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add card']")
    public MobileElement CHAT_ADD_CARD_TITLE;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay HeyNed Lifestyle']")
    public MobileElement CHAT_PAY_HEYNED_LIFESTYLE_TITLE;

    @AndroidFindBy(id = "edtInput")
    public MobileElement CHAT_CVV;

}
