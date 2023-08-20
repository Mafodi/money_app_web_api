package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AndroidChatScreen {

    public AndroidChatScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "edittext_chatbox")
    public MobileElement CHAT_EDIT_TEXT;

    @AndroidFindBy(id = "button_chatbox_send")
    public MobileElement CHAT_SEND;

    @AndroidFindBy(className = "android.widget.TextView")
    public MobileElement CHAT_MESSAGE;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='End chat Authenticated']")
    public MobileElement CHAT_MESSAGE_END_CHAT;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='NPS Rating form Authenticated']")
    public MobileElement CHAT_MESSAGE_RATING;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Hello')]")
    public MobileElement CHAT_QUEUE_MESSAGE;

    @AndroidFindBy(id = "menu_item_chat")
    public MobileElement CHAT_ICON;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.EditText")
    public MobileElement CHAT_NAME_EDIT_TEXT;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.EditText")
    public MobileElement CHAT_EMAIL_EDIT_TEXT;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Welcome to Nedbank. How can I help you?']")
    public MobileElement CHAT_AGENT_MESSAGE;

    @AndroidFindBy(id = "menu_item_chat_close")
    public MobileElement CHAT_END_CHAT;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='0']")
    public MobileElement END_CHAT_POPUP;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement END_BUTTON;

    @AndroidFindBy(id = "tv_question_title")
    public MobileElement END_CHAT_RATING;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Welcome to Nedbank Contact Centre. You are now connected to an agent']")
    public MobileElement AGENT_CONNECTED_MESSAGE;

    @AndroidFindBy(id = "rating_layout")
    public MobileElement CHAT_MANAGEMENT_RATING;

}