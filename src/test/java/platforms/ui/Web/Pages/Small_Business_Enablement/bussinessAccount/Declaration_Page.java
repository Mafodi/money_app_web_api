package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Declaration_Page {



    @FindBy(tagName = "form")
    public static WebElement acceptTerms;

    public static String assertText = "h3";

    @FindBy(css = "[for='hundredPercentShareholding']")
    public static WebElement checkBoxShareHolders;

    @FindBy(css = "[for='soleBusinessRepresentative']")
    public static WebElement checkSoleBusiness;

    @FindBy(css = "[for='termsAndConditions']")
    public static WebElement checkTermsAndConditions;

    @FindBy(css = "[for='informationAccuracyDeclaration']")
    public static WebElement checkAccurateInfo;

    @FindBy(xpath = "//form/div[6]/button")
    public static WebElement btnNextOnDeclaration;

    public static String aText = "h3";

}
