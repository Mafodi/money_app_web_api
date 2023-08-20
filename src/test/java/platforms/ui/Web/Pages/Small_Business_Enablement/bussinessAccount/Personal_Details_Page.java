package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Personal_Details_Page {



    //------------------------ Landing Page After Login --------------------------------------

    //For Selecting "Yes"
    @FindBy(xpath = "//label[@id='areDetailsCorrect']")
    public static WebElement btnYes;

    //For Selecting "No"
    @FindBy(xpath = "////*[@id='notDetailsCorrect']")
    public static WebElement btnNo;

    //For "Next" Button
    @FindBy(xpath = "//div/button[@ng-reflect-klass = 'nlsg-c-button mb4']/span")
    public static WebElement btnNext;

    @FindBy(xpath = "//div/label[@for='otherCountryTax']")
    public static WebElement yesTaxObligation;

    @FindBy(xpath = "//div/label[2][@for='noOtherCountryTax']")
    public static WebElement noTaxObligastion;

    //---------------------- CIPC Personal Details --------------------------------------------

    @FindBy(xpath = "//div/div/div[2]/a/span[1]")
    public static WebElement editPersonalDetails;

    @FindBy(xpath = "//a/span[2]/img")
    public static WebElement closeEdit;

    @FindBy(xpath = "//div/div/div[3]/a/span[1]")
    public static WebElement editHomeAddress;

    @FindBy(xpath = "//div/div/div[4]/a/span[1]")
    public static WebElement editPostalAddress;

    @FindBy(xpath = "//div/div/div[5]/button[@ng-reflect-klass = 'nlsg-c-button mb4']")
    public static WebElement btnNext1;

    @FindBy(xpath = "//div/div/h3")
    public static WebElement lblDirectorDetails;

    @FindBy(name = "idNumber")
    public static WebElement txtIdNumber;

    @FindBy(name = "emailAddress")
    public static WebElement txtEmailAddress;

    @FindBy(name = "cellPhoneNumber")
    public static WebElement txtCellPhone;

    @FindBy(className = "fw-normal")
    public static WebElement lblverifyDetails;

}
