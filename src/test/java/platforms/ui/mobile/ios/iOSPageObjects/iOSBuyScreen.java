package platforms.ui.mobile.ios.iOSPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class iOSBuyScreen {
    public iOSBuyScreen(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSFindBy(id = "vas_buy_landing_screen_Play LOTTO or PowerBall")
    public WebElement Play_Lotto_Powerball;

    @iOSFindBy(id = "Buy tickets")
    public WebElement Buy_tickets;

    @iOSFindBy(id ="powerballInactive")
    public WebElement Powerball_icon;

    @iOSFindBy(id = "View tickets")
    public WebElement View_tickets;

    @iOSFindBy(id = "View winning numbers")
    public WebElement View_winning_number;

    @iOSFindBy(id = "Next")
    public WebElement Lotto_Next;

    @iOSFindBy(id = "review_confirm_button")
    public WebElement Review_Next;

    @iOSFindBy(id = "Finish")
    public WebElement Finish;

    @iOSFindBy(id = "16")
    public WebElement num1;
    @iOSFindBy(id = "33")
    public WebElement num2;
    @iOSFindBy(id = "10")
    public WebElement num3;
    @iOSFindBy(id = "37")
    public WebElement num4;
    @iOSFindBy(id = "4")
    public WebElement num5;
    @iOSFindBy(id = "25")
    public WebElement num6;

    @iOSFindBy(id = "16,33,10,37,4,25, are selectedNext")
    public WebElement Numbers_Next;

    @iOSFindBy(id = "Buy prepaid data, airtime or SMSs")
    public WebElement Buy_prepaid_data_airtime;

    @iOSFindBy(id = "Search Recipient")
    public WebElement Search_recipient;

    @iOSFindBy(id = "tableView-search-text-field")
    public WebElement Beneficiary_field;

    @iOSFindBy(id = "Next")
    public WebElement Prepaid_Next;

    @iOSFindBy(id = "beneficiary_name")
    public WebElement Searched_Beneficiary;

    @iOSFindBy(id = "Choose bundle")
    public WebElement Choose_bundle;

    @iOSFindBy(id = "R29.00")
    public WebElement MTN_Air_Bundle_Amount;

    @iOSFindBy(id = "R29.00")
    public WebElement Vodacom_Air_Bundle_Amount;

    @iOSFindBy(id = "R29.00")
    public WebElement TelkomMobile_Air_Bundle_Amount;

    @iOSFindBy(id = "R29.00")
    public WebElement CellC_Air_Bundle_Amount;

    @iOSFindBy(id = "R50.00")
    public WebElement TelkomPrePhone_Air_Bundle_Amount;

    @iOSFindBy(id = "R30.00")
    public WebElement VirginMobile_Air_Bundle_Amount;

    @iOSFindBy(id = "buy_recipient_reference")
    public WebElement Buy_recipient_reference;

    @iOSFindBy(id = "vas_buy_landing_screen_Buy Prepaid data, airtime or SMSs")
    public WebElement Buy_prepaid_data_airtime1;
}
