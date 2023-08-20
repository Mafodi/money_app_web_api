package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login_Page {


    //-------------------------- After Clicking "Yes"
    @FindBy(xpath = "//div/input[@name='username']")
    public static WebElement txtUsername;
    
    @FindBy(xpath = "//div/input[@name='password']")
    public static WebElement txtPassword;
    
    @FindBy(xpath = "//div[2]/section/div/form/button")
    public static WebElement btnLogin;

    //For Forgotten Details
    @FindBy(xpath = "//div/form/div[3]/label[text()='Forgotten your details?']")
    public static WebElement forgottenDetailsText;

    //For Registration Button
    @FindBy(xpath = "//div/form/div[4]/button")
    public static WebElement btnRegister;

    @FindBy(xpath = "//div/div[2]/div")
    public static WebElement errorMessage;

    @FindBy(xpath = "//div/div/h3")
    public static WebElement assertLogin;

    @FindBy(xpath = "//div/form/a")
    public static WebElement tellMeMore;
}
