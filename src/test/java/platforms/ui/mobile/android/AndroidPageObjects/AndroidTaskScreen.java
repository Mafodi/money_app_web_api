package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class AndroidTaskScreen extends DriverFactory {

    public AndroidTaskScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "lifestyle_landing_hello_username_textview")
    public MobileElement LIFESTYLE_LANDING_USERNAME;

    @AndroidFindBy(id = "message_send_edittext")
    public MobileElement TASK_CREATION;

    @AndroidFindBy(id = "text_message_body")
    public MobileElement TASK_MESSAGE;

    @AndroidFindBy(id = "mic_imageview")
    public MobileElement TASK_RECORD_IMAGE;

    @AndroidFindBy(id = "record_status_imageview")
    public MobileElement TASK_TAP_TO_RECORD;

    @AndroidFindBy(id = "media_layout")
    public MobileElement TASK_AUDIO_TASK;

    @AndroidFindBy(id = "menu_item_task_search")
    public MobileElement TASK_SEARCH_ICON;

    @AndroidFindBy(id = "edtInput")
    public MobileElement TASK_SEARCH_FIELD;

    @AndroidFindBy(id = "lifestyle_task_item_layout")
    public MobileElement TASK_LIST_ITEM;

    @AndroidFindBy(id = "task_create_imageview")
    public MobileElement TASK_SEND;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Task list']")
    public MobileElement TASK_LIST_TITLE;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Closed']")
    public MobileElement TASK_CLOSED_TAB;

    @AndroidFindBy(id = "lifestyle_task_option")
    public MobileElement TASK_OPTION_ICON;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='0']")
    public MobileElement TASK_REOPEN_OPTION;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='1']")
    public MobileElement TASK_DELETE_OPTION;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='0']")
    public MobileElement TASK_CANCEL_OPTION;

    @AndroidFindBy(id = "no_results_found_textview")
    public MobileElement TASK_NO_RESULTS_FOUND;

}
