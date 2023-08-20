package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AndroidTransferScreen {
    public AndroidTransferScreen(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "edtAmount")
    public WebElement Transfer_amount;

    @AndroidFindBy(id = "btnAction")
    public WebElement Transfer_next;

    @AndroidFindBy(id = "btnAction")
    public WebElement Transfer_button;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Finish']")
    public WebElement Transfer_Finish;

    @AndroidFindBy(id = "//android.widget.TextView[@text='Review transfer']")
    public WebElement Transfer_Review;

    @AndroidFindBy(id = "txvTransferInfo")
    public WebElement Transfer_Success;

}
