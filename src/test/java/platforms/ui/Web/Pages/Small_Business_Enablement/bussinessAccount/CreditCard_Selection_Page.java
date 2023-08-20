package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CreditCard_Selection_Page {



    //--------------------------- The Page That Come If You Select "Yes" For Credit Card

    @FindBy(xpath = "//div[10]/div[1]/button")
    public static WebElement btnCheckOnline;

    //--------------------------- Consent Page -------------------------------------
    @FindBy(xpath = "//form/div/div/label")
    public static WebElement checkBoxConsent;

    @FindBy(xpath = "//div[6]/div[1]/button")
    public static WebElement btnNext;

    @FindBy(xpath = "//div[6]/div[2]/button")
    public static WebElement btnNotNow;

}
