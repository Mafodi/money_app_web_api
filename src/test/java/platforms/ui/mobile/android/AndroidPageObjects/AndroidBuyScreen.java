package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AndroidBuyScreen {
    public AndroidBuyScreen(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Play LOTTO or PowerBall']")
    public WebElement Buy_Lotto_Powerball;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Buy tickets']")
    public WebElement Buy_tickets;

    @AndroidFindBy(id = "btnAction")
    public WebElement Lotto_Next;

    @AndroidFindBy(id = "switch_game_first_selector")
    public WebElement LottoPlus1;

    @AndroidFindBy(id = "switch_game_second_selector")
    public WebElement LottoPlus2;

    @AndroidFindBy(id="btn_play_game_next")
    public WebElement play_game_next;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Finish']")
    public WebElement Lotto_Finish;

    @AndroidFindBy(id ="rb_game_option_powerball")
    public WebElement PowerballIcon;

    @AndroidFindBy(id ="switch_game_first_selector")
    public WebElement PowerballPlus;

}
