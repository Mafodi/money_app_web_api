package platforms.ui.Web.Pages.Common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.ID, using ="username")
    public WebElement UserNameTextField;

    @FindBy(how = How.ID, using ="password")
    public WebElement PasswordTextField;

    @FindBy(how = How.ID, using ="log_in")
    public WebElement LoginButton;

}
