package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.Voucher_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Voucher_AndroidObjects;
import utils.DriverFactory;

import java.io.IOException;

public class VAS_Voucher_HistorySteps extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_Voucher_HistorySteps.class);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),40);
    Voucher_Flow voucher_flow = new Voucher_Flow();


    @And("^Android user should navigate to History dashboard$")
    public void androidUserShouldNavigateToHistoryDashboard() {
       voucher_flow.Navigate_HistoryDashboard();
    }

    @And("^Android user want to select voucher from history$")
    public void androidUserWantToSelectVoucherFromHistory() {
       voucher_flow.Select_VoucherFromHistory();
    }

    @Then("^Android user should navigate to History detail screen$")
    public void androidUserShouldNavigateToHistoryDetailScreen() throws IOException {
       voucher_flow.Navigate_HistoryDetailScreen();
    }

    @And("^user want to share the voucher$")
    public void userWantToShareTheVoucher() {
        driver.findElementById(VAS_Voucher_AndroidObjects.SendNow).click();
    }

    @And("^user should see options for sharing$")
    public void userShouldSeeOptionsForSharing() {
       voucher_flow.SeeOptions_Sharing();
    }

    @When("^user select recipient to share$")
    public void userSelectRecipientToShare() {
       voucher_flow.SelectRecipient_ToShare();
    }

    @Then("^user should navigate message sharing screen$")
    public void userShouldNavigateMessageSharingScreen() {
        driver.findElementById(VAS_Voucher_AndroidObjects.SendMsg).isDisplayed();
    }

    @And("^user want to send the voucher$")
    public void userWantToSendTheVoucher() throws IOException {
       voucher_flow.Send_Voucher();
    }

    @And("^Android user want to see all Vouchers$")
    public void androidUserWantToSeeAllVouchers() {
      driver.findElementById(VAS_Voucher_AndroidObjects.ShowAll).click();
    }

    @Then("^User should navigate to History screen$")
    public void userShouldNavigateToHistoryScreen() {
        voucher_flow.Navigate_HistoryScreen();
    }

    @And("^Android user want to cancel sharing$")
    public void androidUserWantToCancelSharing() {
        driver.findElementById(VAS_Voucher_AndroidObjects.PaymentClose).click();
    }

}
