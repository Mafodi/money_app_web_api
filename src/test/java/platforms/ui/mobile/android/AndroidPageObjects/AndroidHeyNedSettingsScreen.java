package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class AndroidHeyNedSettingsScreen extends DriverFactory {

    public AndroidHeyNedSettingsScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='More options']/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView")
    public MobileElement SETTINGS_MORE;

    @AndroidFindBy(id = "rvProfiles")
    public MobileElement SETTINGS_PROFILE;

    @AndroidFindBy(id = "settings_row")
    public MobileElement SETTINGS_OPTION;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
    public MobileElement SETTINGS_TITLE;

    @AndroidFindBy(id = "hey_ned_settings_row")
    public MobileElement SETTINGS_HEYNED_SETTINGS;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='HeyNed settings']")
    public MobileElement SETTINGS_HEYNED_SETTINGS_TITLE;

    @AndroidFindBy(id = "lifestyle_setting_change_profile_layout")
    public MobileElement SETTINGS_PROFILE_OPTION;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.EditText")
    public MobileElement SETTINGS_EMAIL_ADDRESS;

    @AndroidFindBy(id = "subscription_layout")
    public MobileElement SETTINGS_SUBSCRIPTION_OPTION;

    @AndroidFindBy(id = "payment_method_layout")
    public MobileElement SETTINGS_PAYMENT_METHODS_OPTION;

    @AndroidFindBy(id = "life_style_change_card_tv")
    public MobileElement CHANGE_SUBSCRIPTION_CARD;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]")
    public MobileElement CHANGE_DEFAULT_CARD;

    @AndroidFindBy(id = "txvAction")
    public MobileElement DEFAULT_CARD_UPDATED;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[3]/android.widget.ImageView[2]")
    public MobileElement PAYMENTS_LAST_CARD_OPTIONS;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.LinearLayout")
    public MobileElement PAYMENTS_DELETE_CARD;

}
