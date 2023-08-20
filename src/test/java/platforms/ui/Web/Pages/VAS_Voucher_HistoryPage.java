package platforms.ui.Web.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VAS_Voucher_HistoryPage {

    @FindBy(how = How.XPATH, using = "(//span[contains(@class,'name-block')])[1]")
    public WebElement HisVoucherName;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'list-block price')])[1]")
    public WebElement HisVoucherPrice;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'list-block date')])[1]")
    public WebElement HisVoucherDate;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Voucher details')]")
    public WebElement HisVoucherDetail;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Download')])[1]")
    public WebElement HisVoucherDownload;

    @FindBy(how = How.ID, using = "download")
    public WebElement HisDetailDownload;

    @FindBy(how = How.ID, using = "overlay-close")
    public WebElement HisBackBtn;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'View more vouchers')]")
    public WebElement HisViewAll;

    @FindBy(how = How.XPATH, using = "//i[@class='float-Cross']")
    public WebElement NavBar;

    @FindBy(how = How.ID, using = "cancel_this_transaction")
    public WebElement CancelTransaction;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Hollywoodbets')]")
    public WebElement HollywoodBets;

    @FindBy(how = How.XPATH, using = "//div[@class='initials']")
    public WebElement profileSwitch;

    @FindBy(how = How.XPATH, using = "(//div[@class='col-md-8 col-xs-8 col-sm-8 profile-detail'])[2]")
    public WebElement profileSelect;

}
