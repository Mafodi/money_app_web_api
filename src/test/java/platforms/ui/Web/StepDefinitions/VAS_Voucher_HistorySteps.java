package platforms.ui.Web.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.FlowModel.Vouchers_Flow;
import platforms.ui.Web.Pages.VAS_Voucher_BuyVoucherPage;
import platforms.ui.Web.Pages.VAS_Voucher_HistoryPage;
import utils.CommonFunctions;
import utils.Utils;

import java.io.IOException;

public class VAS_Voucher_HistorySteps extends Utils {

    private static Logger log = Logger.getLogger(VAS_Voucher_HistorySteps.class);
    public Vouchers_Flow voucher = PageFactory.initElements(driver, Vouchers_Flow.class);
    public VAS_Voucher_HistoryPage HisVoucher = PageFactory.initElements(driver, VAS_Voucher_HistoryPage.class);

    @And("^User want to share Voucher from History$")
    public void userWantToShareVoucherFromHistory(){
      voucher.Share_Voucher_History();
    }

    @And("^User selects Voucher$")
    public void userSelectsVoucher(){
        HisVoucher.HisVoucherName.click();

    }

    @And("^User navigates to History detail screen$")
    public void userNavigatesToHistoryDetailScreen() {
        HisVoucher.HisVoucherDetail.isDisplayed();
    }

    @And("^User want to crosscheck Voucher History details$")
    public void userWantToCrosscheckVoucherHistoryDetails() throws IOException {
      voucher.Check_Voucher_HistoryDetails();
    }

    @When("^User want to click on Back btn$")
    public void userWantToClickOnBackBtn(){
        HisVoucher.HisBackBtn.click();
    }

    @And("^User want to Download from Dashboard$")
    public void userWantToDownloadFromDashboard() {
      voucher.Download_Dashboard();
    }

    @And("^User want to Download the Voucher from History$")
    public void userWantToDownloadTheVoucherFromHistory(){
        voucher.Download_Voucher_History();
    }

}
