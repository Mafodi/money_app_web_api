package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FND_CardsPage {

    @FindBy(how = How.XPATH, using = "//a[text()='Cards']")
    public WebElement Cards_In_Homepage;

    @FindBy(how = How.XPATH, using = "//span[text()='Use tap and go']")
    public WebElement Use_tap_N_Go;

    @FindBy(how = How.XPATH, using = "//label[@for='freeze-card-switch']")
    public WebElement Freeze_Card_Slider;

    @FindBy(how = How.XPATH, using = "//span[text()='Freeze card']")
    public WebElement Freeze_Card_Text;

    @FindBy(how = How.XPATH, using = "//h2[@class='title']")
    public WebElement Freeze_Card_Message;

    @FindBy(how = How.XPATH, using = "//div[@class='message']")
    public WebElement Freeze_Card_Successfully_Message;

    @FindBy(how = How.XPATH, using = "//div[@class='message']")
    public WebElement Online_Purchase_Message;

    @FindBy(how = How.XPATH, using = "//label[@for='tap-go-switch']")
    public WebElement Tap_N_Go_Switch;

    @FindBy(how = How.XPATH, using = "//h2[@class='title']")
    public WebElement Deactivate_Message_Tap_And_Go;

    @FindBy(how = How.XPATH, using = "//label[@for='internet-purchase-switch']")
    public WebElement Online_Purchase_Switch;

    @FindBy(how = How.XPATH, using = "//a[text()='Use card overseas']")
    public WebElement Use_Card_Overseas;

    @FindBy(how = How.XPATH, using = "//a[text()='Use card overseas']")
    public WebElement Message_Online_Purchases;

    @FindBy(how = How.ID, using = "next")
    public WebElement Next_After_Use_Card_Overseas;

    @FindBy(how = How.ID, using = "select-countries")
    public WebElement Select_Countries_Dropdown;

    @FindBy(how = How.XPATH, using = "//span[text()='India']//parent::div/div")
    public WebElement Select_Country_India;

    @FindBy(how = How.XPATH, using = "//span[text()='Austria']//parent::div/div")
    public WebElement Select_Country_Austria;

    @FindBy(how = How.XPATH, using = "//div[@class='done']")
    public WebElement Done_After_Country_Selection;

    @FindBy(how = How.ID, using = "next")
    public WebElement Next_After_Select_country;

    @FindBy(how = How.ID, using = "secondary-number")
    public WebElement Secondary_Cellphone_No;

    @FindBy(how = How.ID, using = "email")
    public WebElement Email_After_Country_Selection;

    @FindBy(how = How.ID, using = "contact-number")
    public WebElement Contact_No_While_Overseas;

    @FindBy(how = How.ID, using = "next")
    public WebElement Next;

    @FindBy(how = How.ID, using = "submit")
    public WebElement Submit;

    @FindBy(how = How.XPATH, using = "//*[@class='section-title']")
    public WebElement You_Are_Done_Message;

    @FindBy(how = How.XPATH, using = "//a[text()='Update ATM limits']")
    public WebElement Update_Atm_Limit;

    @FindBy(how = How.XPATH, using = "//div[@role='slider']")
    public WebElement Slider;

    @FindBy(how = How.ID, using = "change_limit")
    public WebElement Change_Limit;

    @FindBy(how = How.ID, using = "done")
    public WebElement Done_After_Limit_Change;

    @FindBy(how = How.ID, using = "amnt-field-input")
    public WebElement Amount_In_Text_Field;

    @FindBy(how = How.ID, using = "edit")
    public WebElement Edit_Automatic_Payment_Order;

    @FindBy(how = How.XPATH, using = "//h4[@class='step-title section-title']")
    public WebElement Success_Message_After_Limit_Change;

    @FindBy(how = How.XPATH, using = "//a[text()='Automatic payment order']")
    public WebElement Automatic_Payment_Order;

}
