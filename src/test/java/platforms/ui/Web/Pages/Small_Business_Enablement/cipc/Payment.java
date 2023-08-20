package platforms.ui.Web.Pages.Small_Business_Enablement.cipc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Payment {

    @FindBy(xpath = "//div/h3[1]")
    public static WebElement validationText;

    @FindBy(css = "[for='pay-now']")
    public static WebElement btnPayNow;

    @FindBy(xpath = "//div[1]/label")
    public static WebElement lblVerify;

    // If You Select "Pay Later"
    @FindBy(xpath = "//div[3]/button")
    public static WebElement btnNext;


}
