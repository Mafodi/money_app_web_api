package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SQ_Web_AuthOpt_In_Mode_Page {

    @FindBy(how = How.ID, using ="username")
    public WebElement UserNameTextField;

    @FindBy(how = How.ID, using ="password")
    public WebElement PasswordTextField;

    @FindBy(how = How.ID, using ="log_in")
    public WebElement LoginButton;

    @FindBy(how = How.ID, using = "accept")
    public WebElement AcceptCookies;

    @FindBy(how = How.XPATH, using ="//a[contains(normalize-space(),'Overview')]")
    public WebElement OverviewNav;

    @FindBy(how = How.XPATH, using ="//a[text()='Log out']")
    public WebElement Logout;

    @FindBy(how = How.XPATH, using ="//div[@class='contact-us']")
    public WebElement Gettouch;

    @FindBy(how = How.XPATH, using ="//label[normalize-space()='Get in touch']")
    public WebElement label_getintouch;

    @FindBy(how = How.XPATH, using ="//button[@aria-label='Close']")
    public WebElement Close_error;

    @FindBy(how = How.XPATH, using ="//span[normalize-space()='Find now']")
    public WebElement FindATM_Tab;

    @FindBy(how = How.XPATH, using ="//div[contains(normalize-space(),'Done')]")
    public WebElement Done_popup;

    @FindBy(how = How.XPATH, using ="//div[@class='closeDiv']")
    public WebElement close_security_popup;

    @FindBy(how = How.XPATH, using ="//div[@role='alert']//button[@aria-label='Close']")
    public WebElement Alert_close;

}
