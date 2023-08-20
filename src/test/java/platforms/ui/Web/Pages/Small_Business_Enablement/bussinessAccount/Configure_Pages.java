package platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Configure_Pages {



    //-------------------------------- Person In Charge Of Banking Relationships ---------------
    @FindBy(xpath = "//div[4]/button[@ng-reflect-klass='nlsg-c-button mb4']")
    public static WebElement btnNext;

    //-------------------------------- Setting Up Your Business Account ------------------------
    @FindBy(xpath = "//div/h3")
    public static WebElement textSetUp;

    @FindBy(xpath = "//div/input[@name='withdrawalLimit']")
    public static WebElement setLimtSlider;

    @FindBy(id = "areDetailsCorrect")
    public static WebElement yesCreditCard;

    @FindBy(id = "notDetailsCorrect")
    public static WebElement noCreditCard;

    @FindBy(xpath = "//div/div/div[7]/button")
    public static WebElement btnNextSetting;

    @FindBy(xpath = "//div/div/div[1]/h6")
    public static WebElement minValue;

    //-------------------------------- Let's Find Out If You Qualify ---------------------------
            //If you Choose "Yes" for credit Card
    @FindBy(css = "[ng-reflect-name='grossMonthlyIncome']")
    public static WebElement grossIncome;

    @FindBy(css = "[ng-reflect-name='netAvMonthlyInc']")
    public static WebElement netIncome;

    @FindBy(xpath = "//input[@name='otherIncome']")
    public static WebElement otherIncome;

    @FindBy(css = "[ng-reflect-name='livingMonthlyExpenses']")
    public static WebElement livingExpenses;

    @FindBy(name = "TotalCurrDebtRepayments")
    public static WebElement repayment;

    @FindBy(xpath = "//div/div/div/button")
    public static WebElement btnNextQualify;

            //If You Click On "Need Help Calculating Your Monthly Debts Repayments?"
    public static String calcRepayment = "//div/div/form/div[6]/label";
    public static String txtHomeLoan = "//input[@name='homeLoanInstalment']";
    public static String txtPersonalHome = "//input[@name='personalLoanInstalment']";
    public static String txtInstalmentLoan = "//input[@name='loanInstalment']";
    public static String txtVehicleInst = "//input[@name='vehicleInstalment']";
    public static String txtCreditCardInst = "//input[@name='creditCardInstalment']";
    public static String txtStoreCard = "//input[@name='storeCardInstalment']";
    public static String txtOverdraft = "//input[@name='overDraft']";
    public static String txtMaintenance = "//input[@name='maintenance']";
    public static String txtOtherDebts = "//input[@name='otherDebtRepayment']";

    //-------------------------------- Recieving Your Cards ------------------------------------
    @FindBy(xpath = "//div[1]/label[1][@for='delivery']")
    public static WebElement delivery;

    @FindBy(xpath = "//div/label[@for='collection']")
    public static WebElement collection;

    @FindBy(xpath = "//div/form/button")
    public static WebElement btnNextDelivery;

                //Fo Selecting "Delivery"//@FindBy()

    @FindBy(xpath = "//div[1]/label[1][@for='businessAddress']")
    public static WebElement deliverBusinessAddr;

    @FindBy(xpath = "//div[1]/label[2][@name='residentialAddress']")
    public static WebElement deliverResidentialAddr;

    public static String deliverOtherAddr = "//div[1]/label[3][@for='otherAddress']";

    @FindBy(id = "1")
    public static WebElement preferredBranch;
    //public static static String btnNextDeliverOption = "//div/form/button";

    @FindBy(css = "[ng-reflect-name='withdrawalLimit']")
    public static WebElement optionalExtras;

    public static String checkOptionalExtras  = "optional-extras";

    @FindBy(xpath = "//div/button")
    public static WebElement btnNextOptional;

    @FindBy(xpath = "//div/form/h3")
    public static WebElement txtCard;

    @FindBy(css = "[ng-reflect-name='searchText']")
    public static WebElement txtSearchBranch;

    public static String branchList = "li";

    @FindBy(css = "[for='sameAsCollection']")
    public static WebElement btnSameAsCollection;

    @FindBy(css = "[for='notSameAsCollection']")
    public static WebElement btnNotSameAsCollection;

    @FindBy(css = "[ng-reflect-name='relationshipBankerBranch']")
    public static WebElement myPersonalBanker;

    @FindBy(tagName = "input")
    public static WebElement txtMyPersonalBankerLocation;

    @FindBy(xpath = "//div[@class='content']/h3")
    public static WebElement assertionTextH;

}
