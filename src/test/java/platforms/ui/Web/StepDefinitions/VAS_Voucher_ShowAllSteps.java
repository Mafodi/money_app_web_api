package platforms.ui.Web.StepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.VAS_Voucher_BuyVoucherPage;
import platforms.ui.Web.Pages.VAS_Voucher_HistoryPage;
import utils.Utils;

public class VAS_Voucher_ShowAllSteps extends Utils {
    private static Logger log = Logger.getLogger(VAS_Voucher_ShowAllSteps.class);
    public VAS_Voucher_HistoryPage HisVoucher = PageFactory.initElements(driver, VAS_Voucher_HistoryPage.class);
    public VAS_Voucher_BuyVoucherPage buyVoucher = PageFactory.initElements(driver, VAS_Voucher_BuyVoucherPage.class);
    WebDriverWait wait = new WebDriverWait(driver,50);


    @And("^User want to scroll to see all vouchers$")
    public void userWantToScrollToAllVouchers() {
        Utils.scrollToElement(HisVoucher.HisViewAll);
        HisVoucher.HisViewAll.click();
    }

    @When("^User clicks on Nav Bar$")
    public void userClicksOnNavBar(){
        HisVoucher.NavBar.click();

    }

    @Then("^User should navigate to VAS landing screen$")
    public void userShouldNavigateToVASLandingScreen(){
       if(buyVoucher.BuyVoucher.isDisplayed()){
           log.info("User successfully navigated to VAS landing screen");
       }
    }

    @And("^User want to cancel the product$")
    public void userWantToCancelTheProduct(){
        HisVoucher.NavBar.click();
    }

    @When("^User clicks on Cancel Transaction$")
    public void userClicksOnCancelTransaction(){
        if(HisVoucher.CancelTransaction.isDisplayed()){
            HisVoucher.CancelTransaction.click();
        }

    }
}
