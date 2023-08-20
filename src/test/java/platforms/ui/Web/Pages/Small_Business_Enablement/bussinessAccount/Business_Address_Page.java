package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Business_Address_Page {

//------------------------------------- Business Address ----------------------------------

    //For Clicking "Yes" for Business Physical Address
    @FindBy(how = How.XPATH,using = "//form[1]/div/div/label[1][@for='sameAsResidential']")
    public static WebElement yesPhysicalAddress;

    //For Clicking "No" for Business Physical Address
    @FindBy(how = How.XPATH,using = "//form[1]/div/div/label[2][@for='notSameAsResidential']")
    public static WebElement noPhysicalAddress ;

    @FindBy(id = "search-address-container")
    public static WebElement addressSearchHolder;

    //-------------------------------------- Postal Address --------------------------------------

    //For Clicking "Yes" for Postal Address
    @FindBy(how = How.XPATH,using = "//form/div[3]/div/label[1][@for='sameAsBusiness']")
    public static WebElement yesPostalAddress ;

    //For Clicking "No" for Postal Address
    @FindBy(how = How.XPATH,using = "//form/div[3]/div/label[2][@for='notSameAsBusiness']")
    public static WebElement noPostalAddress ;

    public static String txtsearchAddress = "//*[@id='search-address-container']/div/input";
    public static String dropdownList = "li";

    //Button "Next"
    @FindBy(xpath = "//div/button[@ng-reflect-klass='nlsg-c-button mb4']")
    public static WebElement btnNext;

    @FindBy(xpath = "//div[2]/button[@ng-reflect-klass='nlsg-c-button mb4']")
    public static WebElement scrolToBtn;
}
