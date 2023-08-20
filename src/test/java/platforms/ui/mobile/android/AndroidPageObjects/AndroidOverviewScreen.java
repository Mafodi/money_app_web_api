package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AndroidOverviewScreen {
    public AndroidOverviewScreen(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Transact']")
    public WebElement Transact_menu;

    @AndroidFindBy(id = "fabPay")
    public WebElement Transact_pay;

    @AndroidFindBy(id = "fabTransfer")
    public WebElement Transact_transfer;

    @AndroidFindBy(id = "fabBuy")
    public WebElement Transact_buy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='My accounts']")
    public WebElement Overview_MyAccount;

    @AndroidFindBy(id = "pay_done_success_detail_text")
    public WebElement Pay_success;

    @AndroidFindBy(accessibility = "NedBank")
    public MobileElement ENROLMENT_WELCOME_SCREEN;

    @AndroidFindBy(id = "chat_icon")
    public MobileElement CHAT_ICON;
}
