package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Authenticate_Page {


    //--------------------- Page After "Terms And Condition" ----------------

    //Text To Verify The Page
    public static String  identifyText = "//section/h2/span[text()=''Help us identify you]";

    //For Selecting "Yes"
    @FindBy(how = How.XPATH,using = "//*[@id='isNedbankClient']")
    public static WebElement selectYes;

    //For Selecting "No"
    public static String selectNo = "//*[@id='notNedbankClient']";
    public static String btnLetsGetStarted = "//div/div[2]/div[2]/button";

    //ID Entering Page
    @FindBy(how = How.XPATH, using = "//div[2]/input")
    public static WebElement txtIDnumber;

    @FindBy(how = How.XPATH, using = "//button")
    public static WebElement btnNext;

}
