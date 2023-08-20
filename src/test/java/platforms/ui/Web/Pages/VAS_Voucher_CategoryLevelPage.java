package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VAS_Voucher_CategoryLevelPage {

    @FindBy(how = How.ID, using = "own_amount")
    public WebElement VoucherOwnAmount;

    @FindBy(how = How.ID, using = "recipient_details")
    public WebElement RecVoucherName;

    @FindBy(how = How.ID, using = "payment_ref")
    public  WebElement RefipientRef;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'error-icon')]")
    public WebElement OwnAmountError;

    @FindBy(how = How.ID, using = "amount")
    public WebElement RecVoucherPrice;

    @FindBy(how = How.ID, using = "next")
    public WebElement NextButton;

    @FindBy(how = How.XPATH, using = "//div[@class='field details']/div[@class='left']")
    public WebElement AccountNumber;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Payment successful')]")
    public WebElement VoucherSuccessScreen;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'value')])")
    public WebElement VoucherDetails;

    @FindBy(how = How.ID, using = "finish")
    public WebElement FinishBtn;

    @FindBy(how = How.XPATH, using = "//span[@aria-label='Download voucher']")
    public WebElement DownloadBtn;

    @FindBy(how = How.ID, using = "new_purchase")
    public WebElement NewPurchaseBtn;
}
