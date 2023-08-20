package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DC_ChatPage {

    @FindBy(how = How.XPATH, using = "//div[@class='chat-icon-white chat-white']")
    public WebElement CHAT_ICON;

    @FindBy(how = How.XPATH, using = "//*[@id='send-message']")
    public WebElement CHAT_EDIT_TEXT;

    @FindBy(how = How.XPATH, using = "//*[@class='text msg agent-side']")
    public WebElement CHAT_QUEUED_MESSAGE;

    @FindBy(how = How.CLASS_NAME, using = "chat-text")
    public WebElement NEDBANK_CHAT;

    @FindBy(how = How.ID, using = "name")
    public WebElement CHAT_NAME;

    @FindBy(how = How.ID, using = "email")
    public WebElement CHAT_EMAIL;

    @FindBy(how = How.ID, using = "form-submit")
    public WebElement SUBMIT_BUTTON;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Welcome to Nedbank Contact Centre. You are now con')]")
    public WebElement AGENT_CONNECTED_MESSAGE;

    @FindBy(how = How.XPATH, using = "//i[@class='close-cross close-gray']")
    public WebElement CHAT_END_CHAT;

    @FindBy(how = How.XPATH, using = "//div[@class='overlay alternate']")
    public WebElement CHAT_END_POPUP;

    @FindBy(how = How.XPATH, using = "//button[@class='gd-primary-btn endchatmodel-primary-btn']")
    public WebElement END_BUTTON;

    @FindBy(how = How.ID, using = "question-one")
    public WebElement CHAT_MANAGEMENT_RATING;

    @FindBy(how = How.XPATH, using = "//app-chat-rating//div[3]")
    public WebElement CHAT_STAR_RATING;

    @FindBy(how = How.XPATH, using = "//*[@id='label.star']/div[5]")
    public WebElement CHAT_FIVE_STAR_RATING;

    @FindBy(how = How.CLASS_NAME, using = "covid19-banner-close")
    public WebElement CLOSE_COVID;

    @FindBy(how = How.CLASS_NAME, using = "card-text")
    public WebElement CHAT_TO_US_ICON;

    @FindBy(how = How.XPATH, using = "//*[@id='send-comment']")
    public WebElement CHAT_RATING_COMMENT;

    @FindBy(how = How.XPATH, using = "//*[@id='send']")
    public WebElement CHAT_RATING_SEND;

    @FindBy(how = How.XPATH, using = "//*[@id='no-thanks-btn']")
    public WebElement NO_THANKS_BUTTON;

}
