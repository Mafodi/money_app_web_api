package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AndroidPayScreen {
    public AndroidPayScreen(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "txt_pay_title")
    public WebElement Transact_single_pay;

    @AndroidFindBy(id = "pay_select_beneficiary_icon")
    public WebElement Transact_Pay_Beneficiary_list_icon;

    @AndroidFindBy(id = "edtInput")
    public WebElement Payment_recipients_search_input;

    @AndroidFindBy(id = "tv_section_cell_item_name")
    public WebElement Payment_recipients_benificaryname;

    @AndroidFindBy(id = "edtAmount")
    public WebElement Payment_amount;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
    public WebElement Transact_Pay_Next1_button;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Pay']")
    public WebElement Transact_Pay_button;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Finish']")
    public WebElement Transact_Pay_Finish_button;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
    public WebElement Transact_Pay_Next_button;

    @AndroidFindBy(id = "pay_done_success_detail_text")
    public WebElement Pay_done_success;

    @AndroidFindBy(id = "iv_date_picker")
    public WebElement Calander_icon;

    @AndroidFindBy(id = "next")
    public WebElement Calander_next;

    @AndroidFindBy(xpath = "//android.view.View[@text='1']")
    public WebElement Calander_day;

    @AndroidFindBy(id = "button1")
    public WebElement Calander_ok;

    @AndroidFindBy(id = "frequency_weekly_rl")
    public WebElement Weekly;

    @AndroidFindBy(id = "frequency_monthly_rl")
    public WebElement Monthly;

    @AndroidFindBy(id = "edtInput")
    public WebElement Edt_Occurrence;

    @AndroidFindBy(id = "iv_end_date_picker")
    public WebElement End_Date_Calander;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Never']")
    public WebElement Repeat_by;
}
