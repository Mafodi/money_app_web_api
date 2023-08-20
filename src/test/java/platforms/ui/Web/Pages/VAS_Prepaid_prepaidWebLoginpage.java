package platforms.ui.Web.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VAS_Prepaid_prepaidWebLoginpage {

    @FindBy(how = How.ID, using ="username")
    public WebElement UserNameTextField;

    @FindBy(how = How.ID, using ="password")
    public WebElement PasswordTextField;

    @FindBy(how = How.ID, using ="log_in")
    public WebElement LoginButton;

    @FindBy(how = How.ID, using = "accept")//"//span[contains(text(),'Accept')]")
    public WebElement AcceptCookies;

    @FindBy(how = How.XPATH, using ="//a[contains(text(),'Overview')]")
    public WebElement OverviewNav;

    @FindBy(how = How.XPATH, using ="//a[contains(text(),'Log out')]")
    public WebElement Logout;

}
