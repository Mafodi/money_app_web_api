package platforms.ui.Web.Pages.Small_Business_Enablement.cipc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Register_Page {


    @FindBy(css = "[ng-reflect-klass='nlsg-c-button mb4 d-none d-lg-']")
    public static WebElement btnSelectPackage1;

    @FindBy(xpath = "//div[3]/div[2]/button")
    public static WebElement btnSelectPackage2;

    //----------------------- Reserve A Name For Your Business(Sub-tab under Register Tab) -> If 1st Package is selected ---------------

    @FindBy(css = "[ng-reflect-name='firstName']")
    public static WebElement txtBusinessName1;

    @FindBy(css = "[ng-reflect-name='secondName']")
    public static WebElement txtBusinessName2;

    @FindBy(css = "[ng-reflect-name='thirdName']")
    public static WebElement txtBusinessName3;

    @FindBy(css = "[ng-reflect-name='fourthName']")
    public static WebElement txtBusinessName4;

    @FindBy(css = "[for='radio-1']")
    public static WebElement radioBtnContinue;

    @FindBy(css = "[for='radio-2']")
    public static WebElement radioBtnStop;

    @FindBy(xpath = "//div[1]/form/button")
    public static WebElement btnSubmit;

    @FindBy(xpath = "//div[2]/span")
    public static WebElement assertText1;

    @FindBy(xpath = "//div[3]/span[2]")
    public static WebElement assertText2;

    @FindBy(xpath = "//div[4]/span[2]")
    public static WebElement assertText3;

    @FindBy(xpath = "//div[5]/span[2]")
    public static WebElement assertText4;

    @FindBy(xpath = "//div[3]/div/div/div")
    public static WebElement helpfulTip2;

    @FindBy(xpath = "//div[3]/div[2]/p")
    public static WebElement txtHelpfulTip2;

    // ----------------------- BBBEE Certificate -------------------------

    @FindBy(xpath = "//div/form/div[1]/h4")
    public static WebElement pageValidationText;

    @FindBy(css = "[for='BEECertificateYes']")
    public static WebElement btnYes;

    @FindBy(css = "[for='BEECertificateNo']")
    public static WebElement btnNo;

    @FindBy(xpath = "//*[@id='shareholderNo']")
    public static WebElement txtNumberOfShareholders;

    @FindBy(xpath = "//*[@id='blackShareHolderNo']")
    public static WebElement txtNumberOfBlackShareholders;

    @FindBy(xpath = "//*[@id='blackPercentage']")
    public static WebElement percentageOfBlackShareholders;

    @FindBy(xpath = "//*[@id='blackFemaleNo']")
    public static WebElement percentageOfBlackFemale;

    @FindBy(xpath = "//*[@id='blackUnemployed']")
    public static WebElement txtBlackAndUnemployed;

    @FindBy(xpath = "//*[@id='blackYouth']")
    public static WebElement txtBlackYouth;

    @FindBy(xpath = "//*[@id='blackDisability']")
    public static WebElement txtBlackWithDisabilities;

    @FindBy(xpath = "//*[@id='blackRural']")
    public static WebElement txtBlackAndLivingRural;

    @FindBy(xpath = "//*[@id='blackVeteran']")
    public static WebElement txtBlackMilitaryVeterans;

    @FindBy(xpath = "//div[3]/button")
    public static WebElement btnNext;

    @FindBy(xpath = "//div[4]/button")
    public static WebElement scroll;

    @FindBy(xpath = "//div/div/div[1]/div/h2")
    public static WebElement lblRegistrationMethodHeading;

    public static String helpfulTip = "page-1";
}
