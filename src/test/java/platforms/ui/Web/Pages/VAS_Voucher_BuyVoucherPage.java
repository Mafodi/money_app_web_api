package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VAS_Voucher_BuyVoucherPage {

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Voucher')]")
    public WebElement BuyVoucher;

    @FindBy(how = How.ID, using = "buy_new")
    public WebElement Buy;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Choose a voucher')]")
    public WebElement VoucherLandingScreen;

    @FindBy(how = How.XPATH, using = "//img[@src='https://ww3.nedbank.co.za/content/dam/vas/vcc/web/iTunes.png']")
    public WebElement AppStore;

    @FindBy(how = How.XPATH, using = "//img[@src='https://ww3.nedbank.co.za/content/dam/vas/vcc/web/GooglePlay.png']")
    public WebElement GooglePlay;

    @FindBy(how = How.XPATH, using = "//img[@src='https://ww3.nedbank.co.za/content/dam/vas/vcc/web/Microsoft.png']")
    public WebElement Microsoft ;

    @FindBy(how = How.XPATH, using = "//img[@src='https://ww3.nedbank.co.za/content/dam/vas/vcc/web/PlayStation.png']")
    public WebElement PlayStation;

    @FindBy(how = How.XPATH, using = "//img[@src='https://ww3.nedbank.co.za/content/dam/vas/vcc/web/Uber.png']")
    public WebElement Uber;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Voucher options')]")
    public WebElement VoucherOptionsScreen;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'product-title')])[1]")
    public WebElement VoucherProduct;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'product-price own')])")
    public WebElement OwnAmountProduct;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Voucher details')]")
    public WebElement VoucherDetailScreen;

    @FindBy(how = How.ID, using = "next")
    public WebElement BuyVoucherBtn;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Review purchase')]")
    public WebElement VoucherReviewScreen;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Make payment')]")
    public WebElement VoucherPaymentScreen;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'voucher-title')])[1]")
    public WebElement VoucherName;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'voucher-desc')]")
    public WebElement VoucherPrice;

    public void ChooseVoucher(String VoucherType) {

        switch (VoucherType) {

            case "AppStore":
                AppStore.click();
                break;

            case "GooglePlay":
                GooglePlay.click();
                break;

            case "Microsoft":
                Microsoft.click();
                break;

            case "PlayStation":
                PlayStation.click();
                break;

            case "Uber":
                Uber.click();
                break;


            default:
                System.out.println("Invalid Voucher Type");
        }

    }

}
