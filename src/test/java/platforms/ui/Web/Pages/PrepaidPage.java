package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PrepaidPage {

    @FindBy(how = How.LINK_TEXT, using = "Buy")
    public WebElement Buy_Menu;

    @FindBy(how = How.ID, using = "meter_number")
    public WebElement Meter_Number;

    @FindBy(how = How.XPATH, using = "//*[@id=\"scroll-page\"]/div/div/div/app-menu-options/app-options-landing-page/section/section/ul/li[1]/a/div")
    public WebElement Buy_Prepaids_Menu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"scroll-page\"]/div/div/div/app-menu-options/app-options-landing-page/section/section/ul/li[2]/a/div/section[1]/p")
    public WebElement Buy_Electricity_Menu;

    @FindBy(how = How.CSS, using = ".icon.lotto-icon")
    public WebElement Buy_Lotto_Menu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"recipient_name\"]/div/ng-select/div/div/div[2]/input")
    public WebElement Recipient_Name;

    @FindBy(how = How.XPATH, using = "//*[@id=\"recipient_name\"]/div/ng-select/div/div/div[2]/input")
    public WebElement Elec_Recipient_Name;

    @FindBy(how = How.XPATH, using = "//*[@id=\"scroll-page\"]/div/div/div/ng-component/app-work-flow/div/div[1]/div/div[2]")
    public WebElement Validate_Meter;


    @FindBy(how = How.ID, using = "mobile_number")
    public WebElement Buy_MobileNo;

    @FindBy(how = How.XPATH, using = "//*[@id=\"scroll-page\"]/div/div/div/ng-component/app-work-flow/div/div[2]/div/div[2]/div[1]/h4")
    public WebElement ReviewScreenValidation;

    @FindBy(how = How.ID, using = "your_reference")
    public WebElement Buy_YourRef;

    @FindBy(how = How.ID, using = "example-text-input")
    public WebElement Electricity_YourRef;

    @FindBy(how = How.ID, using = "amount")
    public WebElement Buy_OwnAmount_id;

    @FindBy(how = How.XPATH, using = "//*[@id=\"scroll-page\"]/div/div/div/app-buy-status/div/div/app-circle-icon-heading/div/div/span[2]")
    public WebElement Transaction_Status;

    @FindBy(how = How.ID, using = "next")
    public WebElement Buy_NextBtn_id;

    @FindBy(how = How.ID, using = "buy")
    public WebElement Buy_Button;

    @FindBy(how = How.ID, using = "wrkflow-next")
    public WebElement Buy_Electricity;


    @FindBy(how = How.ID, using = "notificationInput")
    public WebElement Notification_Value;

    @FindBy(how = How.ID, using = "datePicker")
    public WebElement Prepaid_Date;

    @FindBy(how = How.ID, using = "paymentfrequency")
    public WebElement Prepaid_Frequency;

    @FindBy(how = How.XPATH, using = "//*[@id=\"paymentfrequency\"]/ul/li[2]")
    public WebElement Prepaid_Frequency_Weekly;

    @FindBy(how = How.XPATH, using = "//*[@id=\"paymentfrequency\"]/ul/li[3]")
    public WebElement Prepaid_Frequency_Monthly;

    @FindBy(how = How.ID, using = "numRecurrence")
    public WebElement Prepaid_Occurrence_Number;

    @FindBy(how = How.XPATH, using = "//*[@id=\"radio-btn-list\"]/ul/li[2]/div")
    public WebElement Prepaid_Occurrence_Type;


    @FindBy(how = How.XPATH, using = "//*[@id=\"scroll-page\"]/div/div/div/ng-component/app-work-flow/div/div[2]/div/div[2]/ng-component/div/dl/div[6]/dd/label/div")
    public WebElement Save_Elect_Recipient;

    @FindBy(how = How.XPATH, using = "//*[@id=\"scroll-page\"]/div/div/div/ng-component/app-work-flow/div/div[2]/div/div[2]/ng-component/div[1]/dl/div[7]/dd/label/div")
    public WebElement Save_Recipient;


    public String Buy_Provider_xpath = ".//*[@id='serviceprovider']/div/div[1]";
    public String Buy_ProviderList_xpath = ".//*[@id='serviceprovider']/ul";
    public String Buy_RechargeType_xpath = ".//*[@id='rechargetype']/div/div[1]";
    public String Buy_RechargeTypeList_xpath = ".//*[@id='rechargetype']/ul";
    public String Buy_BundleAmt_xpath = ".//*[@id='bundletype']/div/div[1]";
    public String Buy_BundleAmtList_xpath = ".//*[@id='bundletype']/ul";
    public String NotificationType = ".//*[@id='notification']/div/div[1]";
    public String NotificationTypeList = ".//*[@id='notification']/ul";
    public String NotificationTypeElect = ".//*[@id='example-search-input']/div/div[1]";
    public String NotificationTypeListElect = ".//*[@id='example-search-input']/ul";






}
