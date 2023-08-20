package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class AndroidHeyNedPayScreen extends DriverFactory {

    public AndroidHeyNedPayScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "payment_status_textview")
    public MobileElement PAYMENTS_PAY_NOW;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay HeyNed Lifestyle']")
    public MobileElement PAYMENTS_PAY_HEYNED_TITLE;

    @AndroidFindBy(id = "lifestyle_default_card_layout")
    public MobileElement PAYMENTS_PAY_DEFAULT_CARD;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose a card for payment']")
    public MobileElement PAYMENTS_CHOOSE_CARD_PAYMENT;

    @AndroidFindBy(id = "add_payment_method")
    public MobileElement PAYMENTS_ADD_ANOTHER_CARD;

    @AndroidFindBy(id = "tv_from_nedbank")
    public MobileElement PAYMENTS_NEDBANK_CARD;

    @AndroidFindBy(id = "rl_card_info")
    public MobileElement PAYMENTS_VISA_CARD;

    @AndroidFindBy(id = "edtInput")
    public MobileElement PAYMENTS_CVV;

    @AndroidFindBy(id = "tv_from_other_bank")
    public MobileElement PAYMENTS_ENTER_CARD_DETAILS;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment method']")
    public MobileElement PAYMENTS_PAYMENT_METHOD_TITLE;

}
