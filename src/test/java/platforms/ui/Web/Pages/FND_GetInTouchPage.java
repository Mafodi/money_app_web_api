package platforms.ui.Web.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FND_GetInTouchPage {


    @FindBy(how = How.XPATH, using = "//div[@class='contact-us']")
    public WebElement GetIn_Touch_xpath;

    @FindBy(how = How.XPATH, using = "//div[@class='user-pic-container']")
    public WebElement Banker_PicIcon_Xpath;

    @FindBy(how = How.XPATH, using = "//p[@class='user-name']")
    public WebElement Banker_Name_Xpath;

    @FindBy(how = How.XPATH, using = "//a[@class='telephon-text']")
    public WebElement Banker_PhoneNum_Xpath;

    @FindBy(how = How.XPATH, using = "//span[@class='mail-text']")
    public WebElement Banker_Email_Xpath;

    @FindBy(how = How.XPATH, using = "//span[@class='icon Compliment']")
    public WebElement Compliment_Icon_Xpath;

    @FindBy(how = How.XPATH, using = "//span[@class='icon QuerySuggestion grey']")
    public WebElement Query_Icon_Xpath;

    @FindBy(how = How.XPATH, using = "//span[@class='icon Complaint grey']")
    public WebElement Complaint_Icon_Xpath;

    @FindBy(how = How.CSS, using = ".content-item>label")
    public WebElement Content_label_Xpath;

    @FindBy(how = How.XPATH, using = "//textarea[@placeholder='What is your feedback?']")
    public WebElement Feedback_Description_Xpath;

    @FindBy(how = How.ID, using = "send_feedback")
    public WebElement Send_FeedBack_Id;

    @FindBy(how = How.XPATH, using = "//div[@class='feedback-heading']")
    public WebElement FeedBack_Message_Xpath;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'×')]")
    public WebElement Error_banner_Xpath;
}
