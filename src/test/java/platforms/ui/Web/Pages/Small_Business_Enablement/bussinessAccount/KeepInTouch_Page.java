package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class KeepInTouch_Page {



    public static WebElement radiobtnYes;

    @FindBy(css = "[for='researchOrganisationsContactMeNo']")
    public static WebElement radiobtnNo;

    @FindBy(xpath = "//div/div/button")
    public static WebElement btnNextOnKeepInTouch;

    @FindBy(xpath = "//div/h3")
    public static WebElement assertText;
}
