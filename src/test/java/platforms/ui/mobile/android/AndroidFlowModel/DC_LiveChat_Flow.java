package platforms.ui.mobile.android.AndroidFlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

import static io.appium.java_client.remote.MobileCapabilityType.NO_RESET;

public class DC_LiveChat_Flow extends DriverFactory {

    private CommonFunctions common = new CommonFunctions();
    private static Logger log = Logger.getLogger(DC_LiveChat_Flow.class);
    PageFactoryObject pageFactoryObject = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    String object;

    public void NAVIGATE_TO_NEDBANK_SERVICE_AGENT() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("chat_icon")));
        pageFactoryObject.getOverviewScreenLocators().CHAT_ICON.click();
        log.info("Chat icon clicked successfully");

        pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
        log.info("Next button clicked successfully");

        pageFactoryObject.getSubscribeScreenLocators().CHAT_OPTION.click();
        log.info("Service agent clicked successfully");
    }

    public void CAPTURE_CHAT_MESSAGE(String message) throws Exception {
        common.secondsDelay(3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edittext_chatbox")));
        pageFactoryObject.getChatScreenLocators().CHAT_EDIT_TEXT.sendKeys(message);
        pageFactoryObject.getChatScreenLocators().CHAT_SEND.click();
        log.info("Chat message captured successfully");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
        pageFactoryObject.getChatScreenLocators().CHAT_MESSAGE.isDisplayed();
        log.info("Chat message displayed successfully");
        common.secondsDelay(2);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[starts-with(@text, 'Hello')]")));
        pageFactoryObject.getChatScreenLocators().CHAT_QUEUE_MESSAGE.isDisplayed();
        log.info("Chat is initiated successfully");
        common.secondsDelay(5);
    }

    public void NAVIGATE_TO_UNAUTHENTICATED_CHAT() {
        object = String.valueOf(driver.getCapabilities().getCapability(NO_RESET));

        try {
            if(object == "false") {
                pageFactoryObject.getBaseScreenLocators().MENU_CHAT.click();
                log.info("Chat icon clicked successfully");

                pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
                log.info("Next button clicked successfully");
            }
            else if(object == "true") {
                pageFactoryObject.getBaseScreenLocators().MENU_CHAT.click();
                log.info("Chat icon clicked successfully");

                pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
                log.info("Next button clicked successfully");
            }
        }
        catch(Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("User is successfully navigated into Chat: ", e);
        }
    }

    public void CAPTURE_USER_DETAILS(String name, String email) throws Exception {
        pageFactoryObject.getBaseScreenLocators().CHAT_NAME.sendKeys(name);
        log.info("Name captured successfully");

        pageFactoryObject.getBaseScreenLocators().CHAT_EMAIL.sendKeys(email);
        log.info("Email address captured successfully");

        pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
        log.info("Submit button clicked successfully");
    }

    public void CHAT_QUEUED_MESSAGE() {
        common.secondsDelay(5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[starts-with(@text, 'Hello')]")));
        pageFactoryObject.getChatScreenLocators().CHAT_QUEUE_MESSAGE.isDisplayed();
        log.info("Chat is initiated successfully");
    }

    public void AGENT_CONNECTED_TO_CHAT()  {
        common.secondsDelay(15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Welcome to Nedbank Contact Centre. You are now connected to an agent']")));
        pageFactoryObject.getChatScreenLocators().AGENT_CONNECTED_MESSAGE.isDisplayed();
        log.info("Agent connected successfully");
    }

    public void RATE_AGENT() {
        common.secondsDelay(5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_item_chat_close")));
        pageFactoryObject.getChatScreenLocators().CHAT_END_CHAT.click();
        log.info("Close end icon clicked successfully");

        pageFactoryObject.getChatScreenLocators().END_CHAT_POPUP.isDisplayed();
        log.info("End chat popup displayed successfully");

        pageFactoryObject.getChatScreenLocators().END_BUTTON.click();
        log.info("End chat button clicked successfully");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rating_layout")));
        pageFactoryObject.getChatScreenLocators().CHAT_MANAGEMENT_RATING.isDisplayed();
        common.secondsDelay(5);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ratingBar")));
        pageFactoryObject.getTaskManagementScreen().TASK_STAR_RATING.click();
        log.info("Question 1 rating clicked successfully");
        common.secondsDelay(5);

        pageFactoryObject.getTaskManagementScreen().TASK_STAR_RATING.click();
        log.info("Question 2 rating clicked successfully");
        common.secondsDelay(5);
    }

    public void USER_END_CHAT() {
        common.secondsDelay(15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_item_chat_close")));
        pageFactoryObject.getChatScreenLocators().CHAT_END_CHAT.click();
        log.info("Close end icon clicked successfully");

        pageFactoryObject.getChatScreenLocators().END_CHAT_POPUP.isDisplayed();
        log.info("End chat popup displayed successfully");

        pageFactoryObject.getChatScreenLocators().END_BUTTON.click();
        log.info("End chat button clicked successfully");
        common.secondsDelay(10);
    }

    public void TRANSITION() {
        common.secondsDelay(20);
    }

    public void NAVIGATE_TO_WHAT_DO_YOU_NEED() {
        pageFactoryObject.getHeyNedSettingsScreen().SETTINGS_MORE.click();
        log.info("More icon clicked successfully");

        pageFactoryObject.getCreditCardChatRoutingScreenLocation().APPLY_OPTION.click();
        log.info("Apply clicked successfully");

        pageFactoryObject.getCreditCardChatRoutingScreenLocation().OPEN_BANK_ACCOUNT_BUTTON.click();
        log.info("Open a bank account or bundle clicked successfully");
    }

    public void OPEN_CHAT() {
        pageFactoryObject.getCreditCardChatRoutingScreenLocation().CREDIT_CARD_OPTION.click();
        log.info("Credit cards clicked successfully");

        pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
        log.info("Chat with a Nedbank agent button clicked successfully");

        common.secondsDelay(10);
    }

    public void LOGIN_AND_RESUME_CHAT(String password) throws Exception {
        common.secondsDelay(5);
        pageFactoryObject.getBaseScreenLocators().BACK_ICON.click();
        log.info("Back icon clicked successfully");

        pageFactoryObject.getBaseScreenLocators().LOGIN_FOOTER.click();
        log.info("Click Login from footer");

        pageFactoryObject.getBaseScreenLocators().NED_PASSWORD.sendKeys(password);
        log.info("Password captured");

        pageFactoryObject.getBaseScreenLocators().LOGIN_BUTTON.click();
        log.info("Login button clicked");

        common.secondsDelay(5);
        pageFactoryObject.getOverviewScreenLocators().CHAT_ICON.click();
        log.info("Chat icon clicked successfully");

        pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
        log.info("Next button clicked successfully");

        pageFactoryObject.getSubscribeScreenLocators().CHAT_OPTION.click();
        log.info("HeyNed Lifestyle clicked successfully");
        common.secondsDelay(10);
    }
}
