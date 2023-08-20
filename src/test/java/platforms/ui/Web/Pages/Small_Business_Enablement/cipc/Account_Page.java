package platforms.ui.Web.Pages.Small_Business_Enablement.cipc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import platforms.ui.Web.StepDefinitions.Web_Hooks;

public class Account_Page {


    public static String lstCard =  "card";

    @FindBy(tagName = "sbe-select")
    public static WebElement drdOption;

    public static String listSelect = "li";

    @FindBy(xpath = "//div[3]/div/button[1]")
    public static WebElement btnSkip;

    @FindBy(xpath = "//div/button[2]")
    public static WebElement btnNext;
}
