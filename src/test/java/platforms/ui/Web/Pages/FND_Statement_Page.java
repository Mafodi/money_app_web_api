package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FND_Statement_Page {

    @FindBy(how = How.XPATH, using = "(//div[@class='account-name ng-star-inserted'])[1]")
    public WebElement First_Account_In_Home_Page;

    @FindBy(how = How.XPATH, using = "//a[text()='Statements and documents']")
    public WebElement Statement_And_Documents;

    @FindBy(how = How.XPATH, using = "//span[text()='Preferences']")
    public WebElement Preferences;

    @FindBy(how = How.ID, using = "primary_email")
    public WebElement Email_Text_Field;

    @FindBy(how = How.ID, using = "save")
    public WebElement Save_For_Email_Preferences;

    @FindBy(how = How.XPATH, using = "//div[@class='text']/div")
    public WebElement Success_Message_After_Save;

    @FindBy(how = How.XPATH, using = "//div[@class='button-group btn-group-main']")
    public WebElement Statement_Preferences;

    @FindBy(how = How.XPATH, using = "//p[text()=' Post ']")
    public WebElement Statement_Preferences_Post;

    @FindBy(how = How.XPATH, using = "//label[text()='Add an alternative email address']")
    public WebElement Add_Alternate_Email;

    @FindBy(how = How.XPATH, using = "//input[@name='secondaryEmail']")
    public WebElement Secondary_Email_TextBox;

    @FindBy(how = How.ID, using = "save")
    public WebElement Save_Button;

    @FindBy(how = How.XPATH, using = "//div[text()='Success! Your updated statement delivery information will be effective from the next billing cycle.']")
    public WebElement Success_Message;
}
