package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class VAS_Prepaid_BuyPrepaidPage {
    @FindBy(how = How.XPATH, using ="//a[contains(text(),'Buy')]")
    public WebElement Buy;

    @FindBy(how = How.XPATH, using ="//*[contains(text(),'Prepaid')]")
    public WebElement BuyPrepaid;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Buy prepaid')]")
    public WebElement PrepaidLandingScreen;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Purchase Details')]")
    public WebElement RecipientScreen;

    @FindBy(how = How.XPATH, using = "//input[@role='combobox']")
    public WebElement RecipientInput;

    @FindBy(how = How.ID, using = "mobile_number")
    public WebElement RecipientMobileNum;

    @FindBy(how = How.ID, using = "next")
    public WebElement NextBtn;

    @FindBy(how = How.ID, using = "payment_ref")
    public WebElement PaymentRef;

    @FindBy(how = How.ID, using = "own_amount")
    public WebElement OwnAmount;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Enter your Airtime amount')]")
    public WebElement OwnAirtimeScreen;

    @FindBy(how = How.ID, using = "buy")
    public WebElement BuyBtn;

    @FindBy(how = How.ID, using = "buy_new")
    public WebElement BuyNew;

    @FindBy(how = How.XPATH, using = "(//div[@class='field-with-icon'])[1]")//*[@role='alert']
    public WebElement RecipientRef;

    @FindBy(how = How.XPATH, using = "//*[@role='alert']")
    public WebElement OwnAmountError;

    @FindBy(how = How.XPATH, using = "(//span[@id='recipient_details'])[2]")
    public WebElement ProductRef;

    @FindBy(how = How.ID, using = "amount")
    public WebElement AmountRef;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Choose a provider')]")
    public WebElement ProviderScreen;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Buy airtime and bundles')]")
    public WebElement ProductScreen;

    @FindBy(how = How.XPATH, using = "//img[@alt='Vodacom']")
    public WebElement VodacomProvider;

    @FindBy(how = How.XPATH, using = "//img[@alt='MTN']")
    public WebElement MTNProvider;

    @FindBy(how = How.XPATH, using = "//img[@alt='Telkom']")
    public WebElement TelkomProvider;

    @FindBy(how = How.XPATH, using = "//img[@alt='CellC']")
    public WebElement CellcProvider;

    @FindBy(how = How.XPATH, using = "//img[@alt='Virgin Mobile']")
    public WebElement VirginProvider;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Airtime')]")
    public WebElement Airtime;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Data')]")
    public WebElement Data;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'SMS')]")
    public WebElement SMS;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Make payment')]")
    public WebElement PaymentScreen;

    @FindBy(how = How.XPATH, using = "//tab[contains(@customclass,'custom') and contains(@class,'active')]//span[@class='offer-name']")
    public WebElement PrepaidProduct;

    @FindBy(how = How.XPATH, using = "//tab[contains(@customclass,'custom') and contains(@class,'active')]//span[@class='offer-price']")
    public WebElement OwnAirtimeProduct;

    @FindBy(how = How.XPATH, using = "//div[@class='successIcon']")
    public WebElement BuySuccess;

    @FindBy(how = How.XPATH, using = "//div[@class='text']")
    public WebElement BuySuccessMsg;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Your prepaid purchases')]")
    public WebElement PurchaseHistory;

    @FindBy(how = How.XPATH, using = "(//div[@class='list-block description'])[1]")
    public WebElement PurchaseHistoryDes;

    public void SetProvider(String ProviderType){

        switch(ProviderType) {

            case "Vodacom":
                VodacomProvider.click();
                break;

            case "MTN":
                MTNProvider.click();
                break;

            case "CellC":
                CellcProvider.click();
                break;

            case "Telkom":
                TelkomProvider.click();
                break;

            case "Virgin":
                VirginProvider.click();
                break;


            default:
                System.out.println("Invalid Product Type");
        }

    }

    public void SelectCategory(String CategoryType){

        switch(CategoryType) {

            case "Airtime":
                Airtime.click();
                break;

            case "Data":
                Data.click();
                break;

            case "SMS":
                SMS.click();
                break;

            default:
                System.out.println("Invalid Category Type");
        }

    }



}
