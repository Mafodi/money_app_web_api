package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BusinessAccount_Page {

    public BusinessAccount_Page(WebDriver driver) {
    }

    //-----------------------We Are On Lending Page - 1st Page When You Open The Link--------------------

    @FindBy(xpath  = "//div[1]/h2/span" )
    public static WebElement txtBusinessAccount; //xpath - For Validation That We Landed On The Right Page

    //For Compare Accounts Button
    @FindBy(xpath = "//div[@class='col-sm-12']/button" )
    public static WebElement btnCompareAccs;

    //For Pay As You Use
    @FindBy(xpath = "//div[@class='col-sm-12']/h3[contains(text(),'BUSINESS PAY-AS-YOU-USE')]" )
    public static WebElement optPayAsYouUse ;

    @FindBy(xpath = "//div[1]/div/div/div[@class='show-on-hover']/div/div/button[text()='Select']" )
    public static WebElement btnSelect1;

    //For Business Bundle - 60
    @FindBy(xpath = "//div[@class='col-sm-12']/h3[contains(text(),'BUSINESS BUNDLE')]/span[text()='60']")
    public static WebElement optBusinessBundle60;

    @FindBy(xpath = "//div[3]/div/div/div[@class='show-on-hover']/div/div/button[text()='Select']")
    public static WebElement btnSelect2;

    //For Business Bundle - 35
    @FindBy(xpath = "//div[@class='col-sm-12']/h3[contains(text(),'BUSINESS BUNDLE')]/span[text()='35']")
    public static WebElement optBusinessBundle35;

    @FindBy(xpath = "//div[2]/div/div/div[@class='show-on-hover']/div/div/button[text()='Select']")
    public static WebElement btnSelect3;
    
    @FindBy(className = "nlsg-c-divider")
    public static WebElement txtToScroll;


    //---------------------------- For CIPC -> Selecting If You Need To Open Business Account -----------------
    public static String contactMeIn = "";
    public static String btnNextcipc = "";
    public static String btnSkip = "";



}
