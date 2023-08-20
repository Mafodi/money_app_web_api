package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Director_Type_Page {



    //--------------------------------Director Type -> Single/Multiple --------------------------------

    //For Single Director
    @FindBy(xpath = "//div[1]/div/button")
    public static WebElement btnSelectSingle;

    //For Multiple Directors
    @FindBy(xpath = "//div/div/button")
    public static WebElement btnSelectMultiple;


    //-------------------------------------------------------------------------------------------------

                            //For CIPC - The Page After Clicking "Register"

    @FindBy(xpath = "//div[1]/div[2]/a")
    public static WebElement hyperLinkForSingleDiirector;

    @FindBy(xpath = "//div[2]/div[2]/a")
    public static WebElement hyperLinkForMultipleDirectors;

    @FindBy(xpath = "//div[3]/div[2]/a")
    public static WebElement hyperLinkForComplexReg;


}
