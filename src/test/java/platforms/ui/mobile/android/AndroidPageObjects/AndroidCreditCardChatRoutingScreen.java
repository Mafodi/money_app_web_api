package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class AndroidCreditCardChatRoutingScreen extends DriverFactory {

    public AndroidCreditCardChatRoutingScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "apply_row")
    public MobileElement APPLY_OPTION;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Get the perfect solution for your needs']")
    public MobileElement GET_PERFECT_SOLUTION_TITLE;
    @AndroidFindBy(id = "cta_bank")
    public MobileElement OPEN_BANK_ACCOUNT_BUTTON;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='What do you need?']")
    public MobileElement WHAT_DO_YOU_NEED_TITLE;
    @AndroidFindBy(id = "creditCardLayout")
    public MobileElement CREDIT_CARD_OPTION;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chat']")
    public MobileElement CHAT_TITLE;
}
