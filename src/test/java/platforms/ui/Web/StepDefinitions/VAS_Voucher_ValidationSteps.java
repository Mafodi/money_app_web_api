package platforms.ui.Web.StepDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.FlowModel.Vouchers_Flow;
import platforms.ui.Web.Pages.VAS_Voucher_BuyVoucherPage;
import platforms.ui.Web.Pages.VAS_Voucher_CategoryLevelPage;
import platforms.ui.Web.Pages.VAS_Voucher_ValidationsPage;
import platforms.ui.Web.VAS_DataFactory;
import utils.Utils;

public class VAS_Voucher_ValidationSteps extends Utils {
    private static Logger log = Logger.getLogger(VAS_Voucher_ValidationSteps.class);
    public VAS_Voucher_CategoryLevelPage buyCategoryVoucher = PageFactory.initElements(driver, VAS_Voucher_CategoryLevelPage.class);
    public VAS_Voucher_ValidationsPage validationsPage = PageFactory.initElements(driver, VAS_Voucher_ValidationsPage.class);
    public VAS_Voucher_BuyVoucherPage buyVoucher = PageFactory.initElements(driver, VAS_Voucher_BuyVoucherPage.class);
    public Vouchers_Flow voucher = PageFactory.initElements(driver, Vouchers_Flow.class);
    WebDriverWait wait = new WebDriverWait(driver,50);


    @And("^User want to enter their own amount$")
    public void userWantToEnterTheirOwnAmount() {
        buyCategoryVoucher.VoucherOwnAmount.sendKeys("5");

    }

    @And("^user should see error message$")
    public void userShouldSeeErrorMessage() {
        validationsPage.OwnAmountError.isDisplayed();
        log.info("user able to see error message");
    }

    @And("^buy voucher button should be disabled$")
    public void buyVoucherButtonShouldBeDisabled() {
      voucher.BuyVoucher_Disabled();

    }

    @And("^user want to reEnter Own Amount$")
    public void userWantToReEnterOwnAmount() {
        buyCategoryVoucher.VoucherOwnAmount.clear();
        buyCategoryVoucher.VoucherOwnAmount.sendKeys(VAS_DataFactory.VoucherOwnAmount);
    }

    @And("^User should see buy button is Enabled$")
    public void userShouldSeeBuyButtonIsEnabled() {
       voucher.BuyButton_Enabled();
    }

    @And("^buy voucher button should be Enabled$")
    public void buyVoucherButtonShouldBeEnabled() {
        voucher.BuyVoucher_IsEnabled();
    }

    @And("^buy button should be disabled$")
    public void buyButtonShouldBeDisabled(){
      voucher.BuyButton_Disabled();
    }

    @And("^User want to edit reference$")
    public void userWantToEditReference(){
        voucher.Edit_Reference();

    }

    @And("^user should see Ref error message$")
    public void userShouldSeeRefErrorMessage(){
        validationsPage.ReferenceError.isDisplayed();
        log.info("user able to see error message");
    }

    @And("^buy button from payment screen should be disabled$")
    public void buyButtonFromPaymentScreenShouldBeDisabled() {
         voucher.NextButton_Disabled();
    }

    @And("^Next button should be enabled")
    public void nextButtonShouldBeEnabled(){
        voucher.NextButton_Enabled();
    }

}
