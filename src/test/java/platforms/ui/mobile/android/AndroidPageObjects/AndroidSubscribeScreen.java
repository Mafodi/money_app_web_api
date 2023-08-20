package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class AndroidSubscribeScreen extends DriverFactory {

    public AndroidSubscribeScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "layout_lifestyle_heyjude")
    public MobileElement LIFESTYLE_OPTION;

    @AndroidFindBy(id = "layout_banking")
    public MobileElement CHAT_OPTION;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[2]")
    public MobileElement EDUCATIONSCREEN_OPTION1;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[3]")
    public MobileElement EDUCATIONSCREEN_OPTION2;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText")
    public MobileElement PROFILE_NAME;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.EditText")
    public MobileElement PROFILE_SURNAME;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.EditText")
    public MobileElement PROFILE_CELLPHONE;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.EditText")
    public MobileElement PROFILE_EMAIL;

    @AndroidFindBy(id = "tv_title")
    public MobileElement SUBSCRIBE_NEDBANK_CARD_ANOTHER_CARD;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]")
    public MobileElement AMEX_CARD;

}