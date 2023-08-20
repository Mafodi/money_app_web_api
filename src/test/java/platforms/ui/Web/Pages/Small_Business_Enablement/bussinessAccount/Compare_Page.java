package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Compare_Page {



    //---------------------------------Landing Page After Clicking "Compare Accounts" ------------------------------

    //For Pay As You Use
    @FindBy(xpath = "//section/div[4]/div[1]/h5[text()='R60']")
    public static WebElement payASYouUsePrice;

    public static String btnSelect1 = "//div[18]/div[1]/button";

    //For Bundle Business - 60
    @FindBy(xpath = "//section/div[4]/div[2]/h5[text()='R259']")
    public static WebElement businessBundleOnePrice;

    public static String btnSelect2 = "//div[18]/div[2]/button";

    //For Bundle Business - 35
    @FindBy(xpath = "//section/div[4]/div[3]/h5[text()='R420']")
    public static WebElement businessBundleTwoPrice;

    public static String btnSelect3 = "//div[18]/div[3]/button";

}
