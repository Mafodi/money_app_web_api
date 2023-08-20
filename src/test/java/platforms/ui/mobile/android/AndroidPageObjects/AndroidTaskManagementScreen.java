package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class AndroidTaskManagementScreen extends DriverFactory {

    public AndroidTaskManagementScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "lifestyle_download_image_textview")
    public MobileElement TASK_MANAGEMENT_IMAGE;

    @AndroidFindBy(id = "lifestyle_image_message")
    public MobileElement TASK_MANAGEMENT_IMAGE_DISPLAY;

    @AndroidFindBy(id = "lifestyle_vendor_map_image")
    public MobileElement TASK_MANAGEMENT_SUPPLIER;

    @AndroidFindBy(id = "lifestyle_view_map_layout")
    public MobileElement TASK_MANAGEMENT_MAP_LAYOUT;

    @AndroidFindBy(id = "received_message_doc_layout")
    public MobileElement TASK_MANAGEMENT_DOCUMENT;

    @AndroidFindBy(id = "received_message_download_doc_imageview")
    public MobileElement TASK_MANAGEMENT_DOWNLOAD_DOCUMENT;

    @AndroidFindBy(id = "map_image")
    public MobileElement TASK_MANAGEMENT_MAP;

    @AndroidFindBy(id = "rating_layout")
    public MobileElement TASK_MANAGEMENT_RATING;

    @AndroidFindBy(id = "terms_and_conditions_row")
    public MobileElement TERMS_CONDITIONS;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Review our terms and conditions']")
    public MobileElement TERMS_CONDITIONS_TITLE;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[11]/android.widget.LinearLayout")
    public MobileElement TASK_MANAGEMENT_HEYNED;

    @AndroidFindBy(id = "terms_and_conditions_section_title")
    public MobileElement TERMS_CONDITIONS_HEYNED_TITLE;

    @AndroidFindBy(id = "terms_and_condition_textview")
    public MobileElement TERMS_CONDITIONS_SUBSCRIPTION;

    @AndroidFindBy(id = "ratingBar")
    public MobileElement TASK_STAR_RATING;

    @AndroidFindBy(id = "message_feedback_edittext")
    public MobileElement TASK_COMMENT_RATING;

    @AndroidFindBy(id = "lifestyle_feedback_submit_button")
    public MobileElement TASK_RATING_SUBMIT;

}
