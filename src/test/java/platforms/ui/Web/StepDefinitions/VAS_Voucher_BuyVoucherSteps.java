package platforms.ui.Web.StepDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.FlowModel.Vouchers_Flow;
import platforms.ui.Web.Pages.VAS_Voucher_BuyVoucherPage;
import platforms.ui.Web.Pages.VAS_Voucher_CategoryLevelPage;
import platforms.ui.Web.VAS_DataFactory;
import utils.CommonFunctions;
import utils.Utils;

import java.io.IOException;

public class VAS_Voucher_BuyVoucherSteps extends Utils {
    private static Logger log = Logger.getLogger(VAS_Voucher_BuyVoucherSteps.class);
    public Vouchers_Flow voucher = PageFactory.initElements(driver, Vouchers_Flow.class);
    public VAS_Voucher_CategoryLevelPage buyCategory = PageFactory.initElements(driver, VAS_Voucher_CategoryLevelPage.class);
    WebDriverWait wait = new WebDriverWait(driver, 50);


    @When("^User want to buy voucher")
    public void user_want_to_buy_voucher() {
        voucher.Navigate_to_VAS();

    }

    @Then("^User should navigate to voucher screen$")
    public void user_should_navigate_to_voucher_screen() {
        voucher.Navigate_to_voucher_screen();
    }

    @And("^User want to select Voucher$")
    public void userWantToSelectVoucher() {
        voucher.Select_Voucher();
    }

    @And("^User should navigate to Voucher Options$")
    public void userShouldNavigateToVoucherOptions() {
        voucher.Navigate_To_Voucher_Options();
    }

    @And("^User want to select a product$")
    public void userWantToSelectAProduct() {

        voucher.Select_Product();
    }


    @And("^User should navigate to Voucher Details screen$")
    public void userShouldNavigateToVoucherDetailsScreen() {
        voucher.Navigate_To_VoucherDetails_Screen();
    }

    @And("^User Capture Voucher details$")
    public void userCaptureVoucherDetails() {
        voucher.Capture_VoucherDetails();

    }

    @And("^User should click on Buy Voucher$")
    public void userShouldClickOnBuyVoucher() {

        voucher.Click_BuyVoucher();
    }


    @And("^User should navigate to Voucher Review screen$")
    public void userShouldNavigateToVoucherReviewScreen() {
         voucher.Navigate_VoucherReviewScreen();
    }

    @And("^User want to review voucher details$")
    public void userWantToReviewVoucherDetails() throws IOException {

        voucher.Review_VoucherDetails();
    }

    @And("^User should navigate to Voucher payment screen$")
    public void userShouldNavigateToVoucherPaymentScreen() {
        voucher.Navigate_VoucherPaymentScreen();
    }

    @And("^User want to crosscheck voucher details$")
    public void userWantToCrosscheckVoucherDetails() throws IOException {
        voucher.Check_VoucherDetails();
    }

    @And("^User should see Voucher successful message$")
    public void userShouldSeeVoucherSuccessfulMessage() throws IOException {
        voucher.Voucher_SuccessfulMessage();

    }

    @When("^User clicks on Done Button$")
    public void userClicksOnDoneButton() {

        buyCategory.FinishBtn.click();
    }

    @Then("^User should navigate to Overview dashboard$")
    public void userShouldNavigateToOverviewDashboard() {
        voucher.Overview_VoucherDashboard();
    }

    @Then("^User should navigate to Voucher dashboard$")
    public void userShouldNavigateToVoucherDashboard() {
        voucher.Navigate_VoucherDashboard();
    }

    @And("^User want to select a Own Amount product$")
    public void userWantToSelectAOwnAmountProduct() {
        voucher.Select_OwnAmount_Product();
    }

    @And("^User want to select Own Amount Voucher$")
    public void userWantToSelectOwnAmountVoucher() {
        voucher.Select_OwnAmount_Voucher();
    }

    @And("^User Capture Own Amount Voucher details$")
    public void userCaptureOwnAmountVoucherDetails(){
        voucher.OwnAmount_VoucherDetails();
    }

    @And("^User want to crosscheck Own Amount voucher details$")
    public void userWantToCrosscheckOwnAmountVoucherDetails () throws IOException {
        voucher.Check_OwnAmount_VoucherDetails();
    }

    @And("^User want to review Own Amount voucher details$")
    public void userWantToReviewOwnAmountVoucherDetails() throws IOException {
        voucher.OwnAmount_ReviewDetails();
    }

    @And("^User should see Own Amount Voucher successful message$")
    public void userShouldSeeOwnAmountVoucherSuccessfulMessage () throws IOException {

        voucher.OwnAmount_Voucher_SuccessfulMessage();
    }

    @And("^User want to Download the Voucher$")
    public void userWantToDownloadTheVoucher () {
        voucher.Download_Voucher();
    }

    @When("^User clicks on New Purchase Button$")
    public void userClicksOnNewPurchaseButton(){
      voucher.Click_NewPurchase_Button();
    }

    @And("^User clicks on Cancel icon$")
    public void userClicksOnCancelIcon(){
      voucher.Clicks_CancelIcon();
    }


}

