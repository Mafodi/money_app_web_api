package platforms.ui.Web.Pages.Small_Business_Enablement.cipc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Landing_Page {


    @FindBy(xpath = "//section[1]/div[1]/a")
    public static WebElement hyperLinkRegister;

    @FindBy(xpath = "//section[1]/div[2]/a")
    public static WebElement hyperLinkResume;

    @FindBy(xpath = "//section[3]/div[1]/a")
    public static WebElement btnCompareOptions;

    @FindBy(xpath = "//section/div[3]/button")
    public static WebElement btnRegister;

    @FindBy(id = "registration-content-header")
    public static WebElement txtHeader;

}
