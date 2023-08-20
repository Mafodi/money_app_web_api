package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class YourDone_Page {


    @FindBy(xpath = "//div[1]/div[1]/div[1]/h1")
    public static WebElement assertionText;

    @FindBy(className = "feedback-content")
    public static WebElement feedback;

    @FindBy(xpath = "//form/div[4]/div/button")
    public static WebElement btnNoThanks;
}
