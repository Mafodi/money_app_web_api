package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Prepare_Page {



    //---------------------------------- Page After "Clicking Select" On One Of The Accounts on Business Account Page ----------------

    //For Asserting Pay As You Use
    @FindBy(xpath = "div[1]/div/h2[text()='Business pay-as-you-use']")
    public static WebElement businessPayAsYouUseText;

    //For Asserting Business Bundle 35
    @FindBy(xpath = "div[1]/div/h2[text()='Business bundle 35']")
    public static WebElement businessBundleOneText;

    //For Asserting Business Bundle 60
    @FindBy(xpath = "div[1]/div/h2[text()='Business bundle 60']")
    public static WebElement businessBundleTwoText;


    //CheckBox
    public static String checkbox1 = "document.getElementById('productComparisonConsent').click();";
    public static String checkbox2 = "document.getElementById('personalInfoUsageConsent').click();";

    //Button Next
    @FindBy(xpath = "//div/div/button[@id='applicant-prepare-submit']")
    public static WebElement btnNext;
}
