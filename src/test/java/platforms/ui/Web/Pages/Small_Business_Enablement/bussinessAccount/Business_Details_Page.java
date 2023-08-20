package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Business_Details_Page {

    //------------------------- Page after selecting "Yes" and clicking "Next" on Personal Details Page

    @FindBy(xpath = "//div/input[@formcontrolname='businessPhone']")
    public static WebElement telNumber;

    @FindBy(css = "[ng-reflect-name='financialYearEnd']")
    public static WebElement financialEnd;

    public static String listOfMonths = "li";

    @FindBy(xpath = "//*[@id=1]/div/input")
    public static WebElement economicSector;

    public static String listOfSectors  = "//div/ul/li";

    @FindBy(css ="[ng-reflect-name='annualTurnover']")
    public static WebElement turnOver;

    public static String listOfExpRev  = "li";

    @FindBy(css = "[ng-reflect-name='businessIncome']")
    public static WebElement incomeOrigin;

    public static String listOfRevOrigin  = "li";

    @FindBy(xpath = "//form/button[@ng-reflect-klass='nlsg-c-button mb4 mt5']")
    public static WebElement btnNext;

    @FindBy(xpath = "//div/form/div[10]/sbe-select/div")
    public static WebElement adminType;

    public static String listOfAdminType = "li";

    @FindBy(xpath = "//*[@id='businessActivityDescription']")
    public static WebElement tellUsAboutYourBusiness;

    @FindBy(css = "[ng-reflect-model='None']")
    public static WebElement country;

    public static String listOfCountries = "//*[@id='1']/div/div/ul/li";

    public static String dateOfIncorp = "//*[@formcontrolname='dateOfIncorporation']";

}
