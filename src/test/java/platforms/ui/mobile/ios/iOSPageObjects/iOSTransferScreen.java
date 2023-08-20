package platforms.ui.mobile.ios.iOSPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class iOSTransferScreen {
    public iOSTransferScreen(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSFindBy(id = "transfer__amount")
    public WebElement Transfer_amount;

    @iOSFindBy(id = "Next")
    public WebElement Transfer_next;

    @iOSFindBy(id = "Transfer now")
    public WebElement Transfer_button;

    @iOSFindBy(id = "Finish")
    public WebElement Transfer_Finish;

}
