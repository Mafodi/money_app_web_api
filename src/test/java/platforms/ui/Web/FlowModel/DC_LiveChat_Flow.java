package platforms.ui.Web.FlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.DC_ChatPage;
import platforms.ui.Web.StepDefinitions.LoginSteps;
import utils.CommonFunctions;
import utils.Utils;

public class DC_LiveChat_Flow extends Utils {

    public static CommonFunctions commons = PageFactory.initElements(driver, CommonFunctions.class);
    private static Logger log = Logger.getLogger(DC_LiveChat_Flow.class);
    LoginSteps login = new LoginSteps();
    DC_ChatPage chatPage = PageFactory.initElements(driver, DC_ChatPage.class);
    WebDriverWait wait = new WebDriverWait(driver,60);

    public void LOGGED_INTO_ONLINEBANKING_WITH_USERNAME_AND_PASSWORD(String username, String password) throws Exception {
        try{
            login.user_launch_prepaid_web_application();
            commons.secondsDelay(1);
            login.user_enters_username_and_password_from_feature_file(username, password);
            commons.secondsDelay(1);
            login.user_clicks_on_Login();
            commons.secondsDelay(1);
            login.user_must_logon_to_Money_Web_application();
        }catch (Exception error){
            log.info("Unable to Login due to this error message" + error.getMessage());
        }
    }

    public void NAVIGATE_TO_CHAT() {
        commons.secondsDelay(1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='chat-icon-white chat-white']")));
        chatPage.CHAT_ICON.click();
        log.info("Chat icon clicked successfully");
    }

    public void INITIATE_A_CHAT(String message) throws Exception {
        commons.secondsDelay(3);
        chatPage.CHAT_EDIT_TEXT.sendKeys(message);
        chatPage.CHAT_EDIT_TEXT.sendKeys(Keys.ENTER);
        log.info("Chat message captured successfully");

        chatPage.CHAT_QUEUED_MESSAGE.isDisplayed();
        log.info("Chat is initiated successfully");
        commons.secondsDelay(5);
    }

    public void NAVIGATE_TO_ONLINEBANKING() {
        login.user_launch_prepaid_web_application();
    }

    public void CAPTURE_NAME_AND_EMAIL(String name, String email) throws Exception {
        commons.secondsDelay(2);
        chatPage.CLOSE_COVID.click();
        log.info("Covid-19 Banner closed successfully");

        commons.secondsDelay(5);
        chatPage.NEDBANK_CHAT.click();
        log.info("Nedbank Chat clicked successfully");

        commons.secondsDelay(2);
        chatPage.CHAT_NAME.sendKeys(name);
        log.info("Name captured successfully");

        commons.secondsDelay(1);
        chatPage.CHAT_EMAIL.sendKeys(email);
        log.info("Email captured successfully");

        commons.secondsDelay(1);
        chatPage.SUBMIT_BUTTON.click();
        log.info("Submit button clicked successfully");
    }

    public void CHAT_QUEUED_MESSAGE() {
        commons.secondsDelay(5);
        chatPage.CHAT_QUEUED_MESSAGE.isDisplayed();
        log.info("Chat is initiated successfully");
    }

    public void AGENT_CONNECTED_TO_CHAT() {
        commons.secondsDelay(15);
        chatPage.AGENT_CONNECTED_MESSAGE.isDisplayed();
        log.info("Agent connected successfully");
    }

    public void USER_END_CHAT() {
        commons.secondsDelay(5);
        Javascriptclick(chatPage.CHAT_END_CHAT);
        log.info("Close end chat icon clicked successfully");

        chatPage.CHAT_END_POPUP.isDisplayed();
        log.info("End chat popup displayed successfully");

        commons.secondsDelay(1);
        chatPage.END_BUTTON.click();
        log.info("End chat button clicked successfully");
        commons.secondsDelay(10);
    }

    public void RATE_AGENT() {
        commons.secondsDelay(5);
        Javascriptclick(chatPage.CHAT_END_CHAT);
        log.info("Close end chat icon clicked successfully");

        chatPage.CHAT_END_POPUP.isDisplayed();
        log.info("End chat popup displayed successfully");

        commons.secondsDelay(1);
        chatPage.END_BUTTON.click();
        log.info("End chat button clicked successfully");

        commons.secondsDelay(1);
        chatPage.CHAT_MANAGEMENT_RATING.isDisplayed();
        commons.secondsDelay(5);

        Javascriptclick(chatPage.CHAT_STAR_RATING);
        log.info("Question 1 rating clicked successfully");

        commons.secondsDelay(2);
        Javascriptclick(chatPage.CHAT_STAR_RATING);
        log.info("Question 2 rating clicked successfully");
        commons.secondsDelay(10);
    }

    public void RATE_FIVE_STAR_AGENT() {
        commons.secondsDelay(5);
        Javascriptclick(chatPage.CHAT_END_CHAT);
        log.info("Close end chat icon clicked successfully");

        chatPage.CHAT_END_POPUP.isDisplayed();
        log.info("End chat popup displayed successfully");

        commons.secondsDelay(1);
        chatPage.END_BUTTON.click();
        log.info("End chat button clicked successfully");

        commons.secondsDelay(1);
        chatPage.CHAT_MANAGEMENT_RATING.isDisplayed();
        commons.secondsDelay(5);

        Javascriptclick(chatPage.CHAT_FIVE_STAR_RATING);
        log.info("Question 1 rating clicked successfully");

        commons.secondsDelay(2);
        Javascriptclick(chatPage.CHAT_FIVE_STAR_RATING);
        log.info("Question 2 rating clicked successfully");
        commons.secondsDelay(5);
    }

    public void NO_THANKS_BUTTON_CLICKED() {
        commons.secondsDelay(5);
        Javascriptclick(chatPage.CHAT_END_CHAT);
        log.info("Close end chat icon clicked successfully");

        chatPage.CHAT_END_POPUP.isDisplayed();
        log.info("End chat popup displayed successfully");

        commons.secondsDelay(1);
        chatPage.END_BUTTON.click();
        log.info("End chat button clicked successfully");

        commons.secondsDelay(1);
        chatPage.CHAT_MANAGEMENT_RATING.isDisplayed();
        commons.secondsDelay(5);

        chatPage.NO_THANKS_BUTTON.click();
        log.info("No thanks button clicked successfully");
        commons.secondsDelay(5);
    }

    public void LOGIN_AND_RESUME_CHAT(String username, String password) throws Exception {
        commons.secondsDelay(2);
        login.user_enters_username_and_password_from_feature_file(username, password);
        log.info("Uesrname and Password captured successfully");

        commons.secondsDelay(1);
        login.user_clicks_on_Login();
        log.info("Login button clicked successfully");

        commons.secondsDelay(1);
        login.user_must_logon_to_Money_Web_application();
        log.info("Overview screen displayed successfully");

        NAVIGATE_TO_CHAT();
        log.info("Chat icon clicked successfully");
        commons.secondsDelay(10);
    }

    public void CHAT_TO_US() {
        commons.secondsDelay(5);
        scrollToElement(chatPage.CHAT_TO_US_ICON);

        commons.secondsDelay(5);
        chatPage.CHAT_TO_US_ICON.click();
        log.info("Chat to us icon clicked successfully");
        commons.secondsDelay(5);
    }

    public void COMMENT_RATE_AGENT(String comment) throws Exception {
        chatPage.CHAT_RATING_COMMENT.sendKeys(comment);
        log.info("Chat icon clicked successfully");

        commons.secondsDelay(1);
        chatPage.CHAT_RATING_SEND.click();
        log.info("Chat send icon clicked successfully");
        commons.secondsDelay(5);
    }
}
