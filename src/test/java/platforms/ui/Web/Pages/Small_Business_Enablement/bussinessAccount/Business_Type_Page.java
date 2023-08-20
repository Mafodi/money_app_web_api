package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class Business_Type_Page {


    //-------------------- The Page After "Personal Details Page" On "Details Tab" -----------------------------
    @FindBy(xpath  = "//sbe-select/div" )
    public static WebElement businessType;

    @FindBy(xpath = "//div/input[@name='registrationNumber']" )
    public static WebElement regNumber ;

    @FindBy(xpath = "//div/button" )
    public static WebElement btnNextCompanyDetails ;

    //Selecting Business Type
    @FindBy(xpath = "//div/div/ul/li[2]" )
    public static WebElement soleProp ;

    @FindBy(xpath = "//div/div/ul/li[3]" )
    public static WebElement closeCorp ;

    @FindBy(xpath = "//div/div/ul/li[4]" )
    public static WebElement privateComp ;


    //For Selecting "Sole Prop"
    @FindBy(xpath = "//div/label[1][@for='usePersonalName']" )
    public static WebElement yesTradingName ;

    @FindBy(xpath = "//div/label[2][@for='notUsePersonalName']" )
    public static WebElement noTradingName ;

    @FindBy(name = "tradingName " )
    public static WebElement txtTradingName ;

    public static String text1 = "//span[contains(text(),'Please note')]";
}
