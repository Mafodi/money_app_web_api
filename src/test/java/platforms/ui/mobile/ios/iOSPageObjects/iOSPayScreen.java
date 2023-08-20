package platforms.ui.mobile.ios.iOSPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class iOSPayScreen {
    public iOSPayScreen(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSFindBy(id = "Single payment")
    public WebElement Transact_single_pay;

    @iOSFindBy(id = "searchRecipient")
    public WebElement Transact_Pay_Beneficiary_list_icon;

    @iOSFindBy(id = "tableView-search-text-field")
    public WebElement Beneficiary_search_input;

    @iOSFindBy(id = "beneficiary_name")
    public WebElement Beneficiary_select;

    @iOSFindBy(id = "Amount")
    public WebElement Payment_amount;

    @iOSFindBy(id = "Next")
    public WebElement Transact_Pay_Next1_button;

    @iOSFindBy(id = "Pay")
    public WebElement Transact_Pay_button;

    @iOSFindBy(id = "Finish")
    public WebElement Transact_Pay_Finish_button;

    @iOSFindBy(id = "Next")
    public WebElement Transact_Pay_Next_button;

    @iOSFindBy(id = "success_status")
    public WebElement Pay_done_success;

    @iOSFindBy(id = "pickDate")
    public WebElement Calander_icon;

    @iOSFindBy(id = "instantPayCircle")
    public WebElement InstantPayCircle;


}
